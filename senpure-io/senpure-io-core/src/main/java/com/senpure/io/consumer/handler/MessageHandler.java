package com.senpure.io.consumer.handler;


import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;


public interface MessageHandler<T extends Message> {


    T getEmptyMessage();

    void execute(Channel channel, T message) throws  Exception;

    int handlerId();


}
