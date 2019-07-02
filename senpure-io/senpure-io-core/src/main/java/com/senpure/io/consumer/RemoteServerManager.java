package com.senpure.io.consumer;

import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.ResponseResult;
import com.senpure.io.protocol.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * RemoteServerManager
 * 一个服务对应一个RemoteServerManager 对象 <br>
 * 一个RemoteServerManager   对象 可以有多个RemoteServerChannelManager <br>
 * 一个RemoteServerChannelManager 可以有多个channel
 *
 * @author senpure
 * @time 2019-06-29 15:15:57
 */
public class RemoteServerManager {


    private static Logger logger = LoggerFactory.getLogger(RemoteServerManager.class);

    private ConcurrentMap<String, RemoteServerChannelManager> remoteServerChannelManager = new ConcurrentHashMap<>();

    private AtomicInteger atomicRequestId = new AtomicInteger(1);

    private RemoteServerChannelManager defaultChannelManager;
    //  private ServerProperties.Consumer properties;

    private int defaultTimeout;

    public RemoteServerManager(ServerProperties.Consumer properties) {

        defaultTimeout = properties.getRequestTimeout();
    }

    public String getRemoteServerKey(String host, int port) {
        return host + ":" + port;
    }


    public synchronized RemoteServerChannelManager getRemoteServerChannelManager(String remoteServerKey) {

        RemoteServerChannelManager manager = remoteServerChannelManager.get(remoteServerKey);
        if (manager == null) {
            manager = new RemoteServerChannelManager(remoteServerKey);
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
        return sendSyncMessage(message, defaultTimeout);
    }


    /**
     * 发送一个同步消息,必须有返回
     *
     * @param message
     * @param timeout 超时毫秒
     */
    public ResponseResult sendSyncMessage(Message message, int timeout) {
        MessageFrame frame = new MessageFrame();
        frame.setRequestId(nextRequestId());
        frame.setMessage(message);
        DefaultFuture future = new DefaultFuture(frame, timeout);

        defaultChannelManager.sendMessage(frame);
        return future.get();
    }


    private int nextRequestId() {
        int requestId = atomicRequestId.getAndIncrement();
        if (requestId == 0) {
            return nextRequestId();
        }
        return nextRequestId();
    }


    public RemoteServerChannelManager getDefaultChannelManager() {
        return defaultChannelManager;
    }

    public void setDefaultChannelManager(RemoteServerChannelManager defaultChannelManager) {
        this.defaultChannelManager = defaultChannelManager;
    }
}
