package com.senpure.io.producer.handler;


import com.senpure.io.message.CSAskHandleMessage;
import com.senpure.io.message.SCAskHandleMessage;
import com.senpure.io.protocol.Message;

public interface ProducerAskMessageHandler<T extends Message> extends ProducerMessageHandler<T> {


    SCAskHandleMessage ask(CSAskHandleMessage message);

}
