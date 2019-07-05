package com.senpure.io.message.handler;

import com.senpure.io.message.CSChannelOfflineMessage;
import com.senpure.io.producer.handler.AbstractProducerMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**
 * @author senpure
 * @time 2019-6-27 15:03:30
 */
@Component
public class CSChannelOfflineMessageHandler extends AbstractProducerMessageHandler<CSChannelOfflineMessage> {

    @Override
    public void execute(Channel channel, long token, long userId, CSChannelOfflineMessage message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
                //2019-6-27 15:03:30 113
        return CSChannelOfflineMessage.MESSAGE_ID;
    }

    @Override
    public CSChannelOfflineMessage getEmptyMessage() {
        return new CSChannelOfflineMessage();
    }
}