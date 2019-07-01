package com.senpure.io.consumer;

import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.DefaultResult;
import com.senpure.io.consumer.remoting.ResponseResult;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ConsumerMessageExecutor
 *
 * @author senpure
 * @time 2019-06-28 17:01:34
 */
public class ConsumerMessageExecutor {

    private Logger logger = LoggerFactory.getLogger(ConsumerMessageExecutor.class);
    private ExecutorService service;

    private Set<Integer> errorMessageIds = new HashSet<>();
    public ConsumerMessageExecutor(ServerProperties.Consumer properties) {
        this(properties,Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2));
    }

    public ConsumerMessageExecutor(ServerProperties.Consumer properties,ExecutorService service) {
        this.service = service;
        errorMessageIds.add(SCInnerErrorMessage.MESSAGE_ID);
        errorMessageIds.add(properties.getScErrorMessageId());
    }

    public void execute(Runnable runnable) {
        service.execute(runnable);
    }




    public void execute(Channel channel, MessageFrame frame) {
        //channel 本地构造的超时返回 channel = null
        service.execute(() -> {
            int requestId = frame.getRequestId();
            Message message = frame.getMessage();
            if (requestId == 0) {
                try {
                    MessageHandlerUtil.getHandler(message.getMessageId())
                            .execute(channel, message);
                } catch (Exception e) {
                    logger.error("执行handler[" + MessageHandlerUtil.getHandler(message.getMessageId()).getClass().getName() + "]逻辑出错 ", e);
                }
            } else {
                DefaultFuture future = DefaultFuture.received(requestId);
                if (future != null) {
                    if (isErrorMessage(message)) {
                        ResponseResult result = new DefaultResult(null, message);
                        future.doReceived(result);
                    } else {
                        ResponseResult result = new DefaultResult(message, null);
                        future.doReceived(result);
                    }
                } else {
                    logger.warn("远程服务器返回时间过长,服务器已经做了超时处理");
                }

            }
        });


    }
    public boolean isErrorMessage(Message message) {
        return errorMessageIds.contains(message.getMessageId());
    }
    public boolean isShutdown() {
        return service.isShutdown();
    }
}
