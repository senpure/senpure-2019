package com.senpure.io.consumer;

import io.netty.channel.Channel;

/**
 * ConsumerEnhance
 *
 * @author senpure
 * @time 2019-07-30 09:57:02
 */
public interface ConsumerEnhance {

    /**
     * 准备连接
     *
     * @param host
     * @param port
     */
    void preparingChannel(String host, int port);

    /**
     * 连接失败
     *
     * @param host
     * @param port
     */
    void failedChannel(String host, int port);

    /**
     * 连接完成,并且认证完成
     *
     * @param channel
     */
    void preparedChannel(Channel channel);

    /**
     * 连接断开
     *
     * @param channel
     */
    void closedChannel(Channel channel);
}
