package com.senpure.io.message.handler;

import com.senpure.io.message.CSRelationUserGatewayMessage;
import com.senpure.io.producer.handler.AbstractProducerMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**
 * 关联用户与网关处理器
 *
 * @author senpure
 * @time 2019-6-27 15:03:30
 */
@Component
public class CSRelationUserGatewayMessageHandler extends AbstractProducerMessageHandler<CSRelationUserGatewayMessage> {

    @Override
    public void execute(Channel channel, long token, long userId, CSRelationUserGatewayMessage message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
                //2019-6-27 15:03:30 105
        return CSRelationUserGatewayMessage.MESSAGE_ID;
    }

    @Override
    public CSRelationUserGatewayMessage getEmptyMessage() {
        return new CSRelationUserGatewayMessage();
    }
}