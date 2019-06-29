package com.senpure.io.producer;


import com.senpure.base.util.Spring;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class GatewayChannelManager {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static AtomicInteger atomicCount = new AtomicInteger(0);
    private List<Channel> channels = new ArrayList<>(16);

    private AtomicInteger atomicIndex = new AtomicInteger(-1);

    private List<Producer2GatewayMessage> failMessage = new ArrayList<>(128);

    private boolean connecting = false;

    private ReadWriteLock connectLock = new ReentrantReadWriteLock();

    /**
     * GatewayChannelManager 的唯一标识
     */
    private int gatewayChannelKey;

    private String gatewayKey;


    public GatewayChannelManager(String gatewayKey) {
        this.gatewayKey = gatewayKey;
        gatewayChannelKey = atomicCount.incrementAndGet();
    }


    public void addChannel(Channel channel) {
        channels.add(channel);
        checkFailMessage();
    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    private void checkFailMessage() {
        ProducerMessageExecutor executor = Spring.getBean(ProducerMessageExecutor.class);
        if (executor != null) {
            executor.execute(this::sendFailMessage);
        } else {
            logger.warn("没有从spring 容器中找到ProducerMessageExecutor");
            new Thread(this::sendFailMessage).start();
        }

    }

    private void sendFailMessage() {
        List<Producer2GatewayMessage> list = null;
        synchronized (failMessage) {
            if (failMessage.size() > 0) {
                list = new ArrayList<>(failMessage);
                failMessage.clear();
            }
        }
        if (list != null) {
            logger.info("重新发送失败消息 {}", list.size());
            sendMessage(list);
        }
    }

    private void addFailMessage(Producer2GatewayMessage frame) {
        synchronized (failMessage) {
            failMessage.add(frame);
        }
    }

    public void sendMessage(List<Producer2GatewayMessage> frames) {
        Channel channel = nextChannel();
        if (channel != null) {
            int temp = 1;
            for (Producer2GatewayMessage frame : frames) {
                channel.write(frame);
                if (temp % 100 == 0) {
                    channel.flush();
                    temp = 1;
                }
                temp++;
            }
            if (temp > 1) {
                channel.flush();
            }
            return;
        }

        for (Producer2GatewayMessage frame : frames) {
            addFailMessage(frame);
        }

        logger.error("全部channel 不可用 {}", toString());
    }

    public void sendMessage(Producer2GatewayMessage frame) {
        Channel channel = nextChannel();
        if (channel != null) {
            channel.writeAndFlush(frame);
            return;
        }
        addFailMessage(frame);
        logger.error("全部channel 不可用 {}", toString());
    }

    /**
     * 返回一个可写的channel
     *
     * @return
     */
    private Channel nextChannel() {
        if (channels.size() == 0) {
            logger.warn("{}没有可用得channel ", gatewayKey);
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

    public int getGatewayChannelKey() {
        return gatewayChannelKey;
    }

    private int nextIndex() {
        if (channels.size() == 1) {
            return 0;
        }
        int index = atomicIndex.incrementAndGet();
        return Math.abs(index % channels.size());

    }

//    private int nextIndex2() {
//        if (channels.size() == 1) {
//            return 0;
//        }
//        int index = atomicIndex.incrementAndGet();
//        if (index >= channels.size()) {
//            boolean reset = atomicIndex.compareAndSet(index, 0);
//            if (!reset) {
//                return nextIndex2();
//            }
//            return 0;
//        }
//        return index;
//    }

    public String getGatewayKey() {
        return gatewayKey;
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

    @Override
    public String toString() {
        return "GatewayChannelManager{" +
                "channels=" + channels +
                ", connecting=" + connecting +
                ", gatewayChannelKey=" + gatewayChannelKey +
                ", gatewayKey='" + gatewayKey + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConcurrentMap<Integer, Integer> ids = new ConcurrentHashMap<>();
        System.out.println(ids.putIfAbsent(1, 1));
        System.out.println(ids.putIfAbsent(1, 2));
        System.out.println(ids.putIfAbsent(1, 3));
    }
}
