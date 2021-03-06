package com.senpure.io.consumer.remoting;

import com.senpure.io.consumer.ConsumerMessageHandlerUtil;
import com.senpure.io.consumer.handler.ConsumerMessageHandler;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * SuccessCallback
 *
 * @author senpure
 * @time 2019-07-22 17:23:34
 */
public abstract class SuccessCallback<T extends Message> implements ResponseCallback {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(Response result) {
        if (result.isSuccess()) {
            success(result.getValue());
        } else {
            error(result.getChannel(), result.getError());
        }
    }

    public abstract void success(T message);

    public void error(Channel channel, Message message) {

        ConsumerMessageHandler handler = ConsumerMessageHandlerUtil.getHandler(message.getMessageId());
        try {
            handler.execute(channel, message);
        } catch (Exception e) {
            logger.error("执行handler[" + handler.getClass().getName() + "]逻辑出错 ", e);

        }
    }
}
