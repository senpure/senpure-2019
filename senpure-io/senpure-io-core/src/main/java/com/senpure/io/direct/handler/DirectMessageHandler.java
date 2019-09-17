package com.senpure.io.direct.handler;

import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;

/**
 * DirectMessageHandler
 *
 * @author senpure
 * @time 2019-09-17 17:08:43
 */
public interface DirectMessageHandler<T extends Message> {

    T getEmptyMessage();

    void execute(Channel channel, T message) throws Exception;

    int handlerId();

}
