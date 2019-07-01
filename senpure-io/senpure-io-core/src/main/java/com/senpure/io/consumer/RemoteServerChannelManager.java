package com.senpure.io.consumer;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * RemoteServerChannelManager
 *
 * @author senpure
 * @time 2019-06-28 20:57:29
 */
public class RemoteServerChannelManager {




    private Logger logger = LoggerFactory.getLogger(getClass());
    private List<Channel> channels = new ArrayList<>();


    private AtomicInteger atomicIndex = new AtomicInteger(-1);

    private String remoteServerKey;

    public RemoteServerChannelManager(String remoteServerKey) {

        this.remoteServerKey = remoteServerKey;
    }

    public void addChannel(Channel channel) {
        channels.add(channel);

    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    public void sendMessage(MessageFrame frame) {
        Channel channel = nextChannel();
        if (channel != null) {
            channel.writeAndFlush(frame);
        }
    }


    private Channel nextChannel() {
        if (channels.size() == 0) {
            logger.warn("{}没有可用得channel ", remoteServerKey);
            return null;
        }
        for (int i = 0; i < channels.size(); i++) {
            Channel channel = channels.get(nextIndex());
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




    public String getRemoteServerKey() {
        return remoteServerKey;
    }


}
