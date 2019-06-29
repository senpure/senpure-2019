package com.senpure.io.consumer;

import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.ResponseResult;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * RemoteServerChannelManager
 *
 * @author senpure
 * @time 2019-06-28 20:57:29
 */
public class RemoteServerChannelManager {


    private static Map<Integer, DefaultFuture> FUTURES = new ConcurrentHashMap<>();

    private Logger logger = LoggerFactory.getLogger(getClass());
    private List<Channel> channels = new ArrayList<>();

    private AtomicInteger atomicRequestId = new AtomicInteger(1);
    private AtomicInteger atomicIndex = new AtomicInteger(-1);
    private int defaultTimeout;
    private String remoteServerKey;

    public RemoteServerChannelManager(String remoteServerKey,int defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
        this.remoteServerKey = remoteServerKey;
    }

    public void addChannel(Channel channel) {
        channels.add(channel);

    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    public ResponseResult sendMessage(MessageFrame frame) {

        return null;
    }

    private int nextRequestId() {
        int requestId = atomicRequestId.getAndIncrement();
        if (requestId == 0) {
            return nextRequestId();
        }
        return nextRequestId();
    }


    private Channel nextChannel() {
        if (channels.size() == 0) {
            logger.warn("{}没有可用得channel ", remoteServerKey);
            return null;
        }

        for (int i = 0; i <channels.size() ; i++) {

            Channel channel = nextChannel();
            if (channel.isWritable()) {
                return channel;
            }
        }

        return null;
    }

    private int nextIndex() {
        if (channels.size() == 1) {
            return 0;
        }
        int index = atomicIndex.incrementAndGet();
        return Math.abs(index % channels.size());
    }


    public int getDefaultTimeout() {
        return defaultTimeout;
    }

    public void setDefaultTimeout(int defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }

    public String getRemoteServerKey() {
        return remoteServerKey;
    }

    public void setRemoteServerKey(String remoteServerKey) {
        this.remoteServerKey = remoteServerKey;
    }
}
