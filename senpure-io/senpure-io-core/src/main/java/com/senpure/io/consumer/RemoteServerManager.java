package com.senpure.io.consumer;

import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.ResponseResult;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * RemoteServerManager
 *
 * @author senpure
 * @time 2019-06-29 15:15:57
 */
public class RemoteServerManager {

    private static Map<Integer, DefaultFuture> FUTURES = new ConcurrentHashMap<>();
    private Logger logger = LoggerFactory.getLogger(getClass());
    private ServerProperties.Consumer properties;
    private ConcurrentMap<String, RemoteServerChannelManager> remoteServerChannelManager = new ConcurrentHashMap<>();
    private Set<Integer> errorMessageIds = new HashSet<>();
    private AtomicInteger atomicRequestId = new AtomicInteger(1);

    private RemoteServerChannelManager defaultChannelManager;

    public RemoteServerManager(ServerProperties.Consumer properties) {
        this.properties = properties;
        errorMessageIds.add(SCInnerErrorMessage.MESSAGE_ID);
        errorMessageIds.add(properties.getScErrorMessageId());
    }

    public String getRemoteServerKey(String host, int port) {
        return host + ":" + port;
    }


    public synchronized RemoteServerChannelManager getRemoteServerChannelManager(String remoteServerKey) {
        RemoteServerChannelManager manager = remoteServerChannelManager.get(remoteServerKey);
        if (manager == null) {
            manager = new RemoteServerChannelManager(remoteServerKey, properties.getRequestTimeout());
            remoteServerChannelManager.put(remoteServerKey, manager);
            return remoteServerChannelManager.get(remoteServerKey);
        }
        return manager;
    }


    public void sendMessage(Message message) {
        MessageFrame frame = new MessageFrame();
        frame.setMessage(message);

        defaultChannelManager.sendMessage(frame);
    }

    /**
     * 发送一个同步消息,必须有返回
     *
     * @param message
     */
    public ResponseResult sendSyncMessage(Message message) {
        MessageFrame frame = new MessageFrame();
        frame.setRequestId(nextRequestId());
        frame.setMessage(message);
        DefaultFuture future = new DefaultFuture(frame.getRequestId(), properties.getRequestTimeout());
        FUTURES.put(future.getRequestId(), future);
        defaultChannelManager.sendMessage(frame);
        return future.get();
    }

    public void received(Channel channel, MessageFrame frame) {
        int requestId = frame.getRequestId();
        Message message = frame.getMessage();
        if (requestId == 0) {
            try {
                MessageHandlerUtil.getHandler(message.getMessageId())
                        .execute(channel, message);
            } catch (Exception e) {
                logger.error("执行handler[" + MessageHandlerUtil.getHandler(message.getMessageId()).getClass().getName() + "]逻辑出错 ", e);
            }
        } else {

            DefaultFuture future = FUTURES.get(requestId);

            if (future != null) {

                if (isErrorMessage(message)) {

                }
            } else {

                logger.warn("远程服务器返回时间过长,服务器已经做了超时出来");
            }

        }

    }

    public boolean isErrorMessage(Message message) {
        return errorMessageIds.contains(message.getMessageId());
    }

    private int nextRequestId() {
        int requestId = atomicRequestId.getAndIncrement();
        if (requestId == 0) {
            return nextRequestId();
        }
        return nextRequestId();
    }


    public void setProperties(ServerProperties.Consumer properties) {
        this.properties = properties;
    }

    public RemoteServerChannelManager getDefaultChannelManager() {
        return defaultChannelManager;
    }

    public void setDefaultChannelManager(RemoteServerChannelManager defaultChannelManager) {
        this.defaultChannelManager = defaultChannelManager;
    }
}
