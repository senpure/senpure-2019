package com.senpure.io.producer.handler;


import com.senpure.io.protocol.Message;

public interface ProducerAskMessageHandler<T extends Message> extends ProducerMessageHandler<T> {


    boolean ask(String value);

}
