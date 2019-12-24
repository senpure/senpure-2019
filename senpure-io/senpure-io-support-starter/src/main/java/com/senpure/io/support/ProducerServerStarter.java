package com.senpure.io.support;

import com.senpure.executor.DefaultTaskLoopGroup;
import com.senpure.executor.TaskLoopGroup;
import com.senpure.io.ChannelAttributeUtil;
import com.senpure.io.ServerProperties;
import com.senpure.io.bean.HandleMessage;
import com.senpure.io.bean.IdName;
import com.senpure.io.event.EventHelper;
import com.senpure.io.message.SCIdNameMessage;
import com.senpure.io.message.SCRegServerHandleMessageMessage;
import com.senpure.io.producer.*;
import com.senpure.io.producer.handler.ProducerAskMessageHandler;
import com.senpure.io.producer.handler.ProducerMessageHandler;
import io.netty.util.concurrent.DefaultThreadFactory;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * ProducerChecker
 *
 * @author senpure
 * @time 2019-03-04 17:51:39
 */
public class ProducerServerStarter implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(ProducerServerStarter.class);
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ServerProperties serverProperties;
    @Autowired
    private GatewayManager gatewayManager;
    @Autowired
    private ProducerMessageExecutor messageExecutor;
    @Value("${server.port:0}")
    private int httpPort;
    private ServerProperties.Producer producer;
    private ServerProperties.Gateway gateway = new ServerProperties.Gateway();
    private ScheduledExecutorService service;

    private List<ProducerServer> servers = new ArrayList<>();


    private Map<String, Long> failGatewayMap = new HashMap<>();

    private long lastLogTime = 0;


    @PostConstruct
    public void init() {
        check();
        messageExecutor();
    }

    private void check() {
        if (StringUtils.isEmpty(serverProperties.getName())) {
            serverProperties.setName("producerServer");
        }
        producer = serverProperties.getProducer();
        if (!producer.isSetReadableName()) {
            producer.setReadableName(serverProperties.getName());
        }
        //io *2 logic *1 综合1.5
        double size = Runtime.getRuntime().availableProcessors() * 1.5;
        int ioSize = (int) (size * 0.6);
        ioSize = ioSize < 1 ? 1 : ioSize;
        int logicSize = (int) (size * 0.4);
        logicSize = logicSize < 1 ? 1 : logicSize;
        if (producer.getIoWorkThreadPoolSize() < 1) {
            producer.setIoWorkThreadPoolSize(ioSize);
        }
        if (producer.getExecutorThreadPoolSize() < 1) {
            producer.setExecutorThreadPoolSize(logicSize);
        }
    }

    private void messageExecutor() {
      TaskLoopGroup  service = new DefaultTaskLoopGroup(gateway.getExecutorThreadPoolSize(),
                new DefaultThreadFactory(serverProperties.getName() + "-executor"));
        messageExecutor.setService(service);
        messageExecutor.setGatewayManager(gatewayManager);
        this.service = service;
        EventHelper.setService(service);
    }


    @PreDestroy
    public void destroy() {
        for (ProducerServer server : servers) {
            server.destroy();
        }
        if (messageExecutor != null) {
            messageExecutor.shutdownService();
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Integer> ids = ProducerMessageHandlerUtil.getHandlerMessageIds();
        List<HandleMessage> handleMessages = new ArrayList<>();
        for (Integer id : ids) {
            HandleMessage handleMessage = new HandleMessage();
            handleMessage.setHandleMessageId(id);
            ProducerMessageHandler handler = ProducerMessageHandlerUtil.getHandler(id);
            if (handler instanceof ProducerAskMessageHandler) {
                //避免编码出错
                handleMessage.setDirect(false);
                if (handler.direct()) {
                    logger.warn("{}实现了ProducerAskMessageHandler但是direct()返回true 修正为false", handler.getClass().getName());
                }
            } else {
                handleMessage.setDirect(true);
            }

            handleMessage.setMessageClasses(ProducerMessageHandlerUtil.getEmptyMessage(id).getClass().getName());
            handleMessages.add(handleMessage);
            MessageIdReader.relation(id, handler.getEmptyMessage().getClass().getSimpleName());
        }
        List<IdName> idNames = null;
        if (StringUtils.isNotEmpty(producer.getIdNamesPackage())) {
            idNames = MessageScanner.scan(producer.getIdNamesPackage());
            //MessageIdReader.relation(idNames);
        }
        List<IdName> finalIdNames = idNames;
        service.scheduleWithFixedDelay(() -> {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(producer.getGatewayName());
            for (ServiceInstance instance : serviceInstances) {
                String portStr = instance.getMetadata().get("scPort");
                int port = 0;
                if (portStr == null) {
                    // logger.warn("网关 [{}] {} {} 没有 没有配置sc socket端口,使用默认端口 {}", producer.getGatewayName(), instance.getHost(), instance.getUri(), gateway.getScPort());
                    port = gateway.getScPort();
                } else {
                    port = Integer.parseInt(portStr);
                }
                String gatewayKey = gatewayManager.getGatewayKey(instance.getHost(), port);
                GatewayChannelManager gatewayChannelManager = gatewayManager.getGatewayChannelServer(gatewayKey);
                if (gatewayChannelManager.isConnecting()) {
                    continue;
                }
                long now = System.currentTimeMillis();
                if (gatewayChannelManager.getChannelSize() < producer.getGatewayChannel()) {
                    Long lastFailTime = failGatewayMap.get(gatewayKey);
                    boolean start = false;
                    if (lastFailTime == null) {
                        start = true;
                    } else {
                        if (now - lastFailTime >= producer.getConnectFailInterval()) {
                            start = true;
                        }
                    }
                    if (start) {
                        gatewayChannelManager.setConnecting(true);
                        ProducerServer producerServer = new ProducerServer();
                        producerServer.setGatewayManager(gatewayManager);
                        producerServer.setProperties(producer);
                        producerServer.setMessageExecutor(messageExecutor);
                        producerServer.setServerName(serverProperties.getName());
                        producerServer.setHttpPort(httpPort);
                        producerServer.setReadableServerName(producer.getReadableName());
                        if (producerServer.start(instance.getHost(), port)) {
                            servers.add(producerServer);
                            regServer(producerServer, handleMessages);
                            if (gatewayChannelManager.getChannelSize() == 0) {
                                gatewayChannelManager.setDefaultMessageRetryTimeLimit(producer.getMessageRetryTimeLimit());
                                if (finalIdNames != null && finalIdNames.size() > 0) {
                                    regIdNames(producerServer, finalIdNames);
                                }
                            }
                            //认证
                            gatewayChannelManager.addChannel(producerServer.getChannel());

                        } else {
                            failGatewayMap.put(gatewayKey, now);
                        }
                        gatewayChannelManager.setConnecting(false);
                    }
                }
            }
            long now = System.currentTimeMillis();
            if (now - lastLogTime >= 60000) {
                lastLogTime = now;
                gatewayManager.report();
            }
        }, 2000, 50, TimeUnit.MILLISECONDS);
    }

    public void regServer(ProducerServer server, List<HandleMessage> handleMessages) {
        SCRegServerHandleMessageMessage message = new SCRegServerHandleMessageMessage();
        message.setServerName(serverProperties.getName());
        message.setReadableServerName(server.getReadableServerName());
        message.setServerKey(ChannelAttributeUtil.getLocalServerKey(server.getChannel()));
        message.setMessages(handleMessages);
        Producer2GatewayMessage gatewayMessage = new Producer2GatewayMessage();
        gatewayMessage.setMessageId(message.getMessageId());
        gatewayMessage.setMessage(message);
        gatewayMessage.setUserIds(new Long[]{0L});
        logger.debug("向{}注册服务", ChannelAttributeUtil.getRemoteServerKey(server.getChannel()));
        for (HandleMessage handleMessage : handleMessages) {
            logger.debug(handleMessage.toString());
        }
        server.getChannel().writeAndFlush(gatewayMessage);
    }

    public void regIdNames(ProducerServer server, List<IdName> idNames) {
        SCIdNameMessage message = new SCIdNameMessage();
        for (int i = 0; i < idNames.size(); i++) {
            if (i > 0 && i % 100 == 0) {
                regIdNames(server, message);
                message = new SCIdNameMessage();
            }
            message.getIdNames().add(idNames.get(i));
        }
        if (message.getIdNames().size() > 0) {
            regIdNames(server, message);
        }
    }

    private void regIdNames(ProducerServer server, SCIdNameMessage message) {
        Producer2GatewayMessage gatewayMessage = new Producer2GatewayMessage();
        gatewayMessage.setMessageId(message.getMessageId());
        gatewayMessage.setMessage(message);
        gatewayMessage.setUserIds(new Long[]{0L});
        server.getChannel().writeAndFlush(gatewayMessage);
    }
}
