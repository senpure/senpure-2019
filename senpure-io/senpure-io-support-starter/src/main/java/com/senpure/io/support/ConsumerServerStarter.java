package com.senpure.io.support;

import com.senpure.base.util.NameThreadFactory;
import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.ConsumerMessageExecutor;
import com.senpure.io.consumer.ConsumerServer;
import com.senpure.io.consumer.RemoteServerChannelManager;
import com.senpure.io.consumer.RemoteServerManager;
import com.senpure.io.event.EventHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * GatewayServerStarter
 *
 * @author senpure
 * @time 2019-03-01 15:17:33
 */
public class ConsumerServerStarter implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ServerProperties properties;
    @Autowired
    private RemoteServerManager remoteServerManager;


    private ConsumerMessageExecutor messageExecutor;
    private ScheduledExecutorService service;
    private ServerProperties.Gateway gateway = new ServerProperties.Gateway();
    private List<ConsumerServer> servers = new ArrayList<>();
    private long lastFailTime = 0;
    private long lastLogTime = 0;
    private long failTimes = 0;
    private String lastFailServerKey;

    private void check() {
        if (StringUtils.isEmpty(properties.getName())) {
            properties.setName("consumerServer");
        }
        ServerProperties.Consumer consumer = properties.getConsumer();
        if (!consumer.isSetReadableName()) {
            consumer.setReadableName(properties.getName());
        }
        //io *2 logic *1 综合1.5
        double size = Runtime.getRuntime().availableProcessors() * 1.5;
        int ioSize = (int) (size * 0.6);
        ioSize = ioSize < 1 ? 1 : ioSize;
        int logicSize = (int) (size * 0.4);
        logicSize = logicSize < 1 ? 1 : logicSize;
        if (consumer.getIoWorkThreadPoolSize() < 1) {
            consumer.setIoWorkThreadPoolSize(ioSize);
        }
        if (consumer.getExecutorThreadPoolSize() < 1) {
            consumer.setEventThreadPoolSize(logicSize);
        }
    }

    private void messageExecutor() {
        ServerProperties.Consumer consumer = properties.getConsumer();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(consumer.getExecutorThreadPoolSize(),
                new NameThreadFactory(properties.getName() + "-executor"));
        messageExecutor = new ConsumerMessageExecutor(properties.getConsumer(), service);
        this.service = service;
        EventHelper.setService(service);

    }


    @PreDestroy
    public void destroy() {
        for (ConsumerServer server : servers) {
            server.destroy();
        }
        if (messageExecutor != null) {
            messageExecutor.shutdownService();
        }


    }

    public void setProperties(ServerProperties properties) {
        this.properties = properties;
    }


    private boolean canLog() {
        long now = System.currentTimeMillis();
        if (now - lastLogTime >= 60000) {
            lastLogTime = now;
            return true;
        }
        return false;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("consumerServerStarter-----------{}", remoteServerManager == null);
        check();
        messageExecutor();
        service.scheduleWithFixedDelay(() -> {
            try {
                if (remoteServerManager.getDefaultChannelManager() == null) {

                    List<ServiceInstance> serviceInstances = discoveryClient.getInstances(properties.getConsumer().getRemoteName());
                    if (serviceInstances.size() == 0) {
                        if (canLog()) {
                            logger.warn("没有服务可用{}", properties.getConsumer().getRemoteName());
                        }
                        return;
                    }
                    ServiceInstance instance;
                    if (lastFailServerKey == null) {
                        instance = serviceInstances.get(0);
                    } else {
                        Random random = new Random();
                        instance = serviceInstances.get(random.nextInt(serviceInstances.size()));
                    }

                    String portStr = instance.getMetadata().get("scPort");
                    int port;
                    if (portStr == null) {
                        // logger.warn("网关 [{}] {} {} 没有 没有配置sc socket端口,使用默认端口 {}", producer.getGatewayName(), instance.getHost(), instance.getUri(), gateway.getScPort());
                        port = gateway.getScPort();
                    } else {
                        port = Integer.parseInt(portStr);
                    }
                    String serverKey = remoteServerManager.getRemoteServerKey(instance.getHost(), port);
                    RemoteServerChannelManager remoteServerChannelManager = remoteServerManager.
                            getRemoteServerChannelManager(serverKey);
                    remoteServerChannelManager.setHost(instance.getHost());
                    remoteServerChannelManager.setPort(port);
                    remoteServerManager.setDefaultChannelManager(remoteServerChannelManager);

                } else {

                    RemoteServerChannelManager remoteServerChannelManager = remoteServerManager.getDefaultChannelManager();

                    if (remoteServerChannelManager.isConnecting()) {
                        return;
                    }
                    long now = System.currentTimeMillis();
                    if (remoteServerChannelManager.getChannelSize() < properties.getConsumer().getRemoteChannel()) {
                        boolean start = false;
                        if (lastFailTime == 0) {
                            start = true;
                        } else {
                            if (now - lastFailTime >= properties.getConsumer().getConnectFailInterval()) {
                                start = true;
                            }
                        }
                        if (start) {
                            remoteServerChannelManager.setConnecting(true);
                            ConsumerServer consumerServer = new ConsumerServer();
                            consumerServer.setMessageExecutor(messageExecutor);
                            consumerServer.setRemoteServerManager(remoteServerManager);
                            consumerServer.setProperties(properties.getConsumer());
                            if (consumerServer.start(remoteServerChannelManager.getHost(), remoteServerChannelManager.getPort())) {
                                servers.add(consumerServer);
                                //验证
                                failTimes = 0;
                            } else {
                                lastFailTime = now;
                                lastFailServerKey = remoteServerChannelManager.getServerKey();
                                failTimes++;
                                if (failTimes >= 10 && remoteServerChannelManager.getChannelSize() == 0) {
                                    remoteServerManager.setDefaultChannelManager(null);
                                    failTimes = 0;
                                }
                            }
                            remoteServerChannelManager.setConnecting(false);
                        }

                    }


                }
            } catch (Exception e) {

                logger.error("error", e);
            }


        }, 500, 50, TimeUnit.MILLISECONDS);
    }

}
