package com.senpure.io.message.handler;

import com.senpure.io.message.CSHeartMessage;
import com.senpure.io.producer.handler.AbstractProducerMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**
 * 心跳处理器
 *
 * @author senpure
 * @time 2019-6-27 15:03:30
 */
@Component
public class CSHeartMessageHandler extends AbstractProducerMessageHandler<CSHeartMessage> {

    @Override
    public void execute(Channel channel, long token, long userId, CSHeartMessage message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
                //2019-6-27 15:03:30 65
        return CSHeartMessage.MESSAGE_ID;
    }

    @Override
    public CSHeartMessage getEmptyMessage() {
        return new CSHeartMessage();
    }
}