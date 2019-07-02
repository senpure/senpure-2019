package com.senpure.io.consumer;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * RemoteServerChannelManager
 *
 * @author senpure
 * @time 2019-06-28 20:57:29
 */
public class RemoteServerChannelManager  {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected List<Channel> channels = new ArrayList<>();

    protected AtomicInteger atomicIndex = new AtomicInteger(-1);

    protected String host;
    private int port;
    protected String serverKey;
    protected boolean connecting = false;

    protected ReadWriteLock connectLock = new ReentrantReadWriteLock();

    public RemoteServerChannelManager(String serverKey) {
        this.serverKey = serverKey;
    }

    public void sendMessage(MessageFrame frame) {
        Channel channel = nextChannel();
        if (channel != null) {
            channel.writeAndFlush(frame);
        }
    }

    public boolean isConnecting() {
        boolean temp;
        connectLock.readLock().lock();
        temp = connecting;
        connectLock.readLock().unlock();
        return temp;
    }

    public void setConnecting(boolean connecting) {
        connectLock.writeLock().lock();
        this.connecting = connecting;
        connectLock.writeLock().unlock();

    }

    public int getChannelSize() {
        return channels.size();
    }

    public void addChannel(Channel channel) {
        if (channels.contains(channel)) {
            return;
        }
        channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    public Channel nextChannel() {
        if (channels.size() == 0) {
            logger.warn("{}:{}没有可用得channel  ", host, port);
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

    protected int nextIndex() {
        if (channels.size() == 1) {
            return 0;
        }
        int index = atomicIndex.incrementAndGet();
        return Math.abs(index % channels.size());
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getServerKey() {
        return serverKey;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
