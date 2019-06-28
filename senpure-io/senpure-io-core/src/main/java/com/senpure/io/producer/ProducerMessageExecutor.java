package com.senpure.io.producer;

import com.senpure.io.producer.handler.ProducerMessageHandler;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ProducerMessageExecutor {
    private ExecutorService service;

    public ProducerMessageExecutor() {

        service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
    }

    public ProducerMessageExecutor(ExecutorService service) {
        this.service = service;

    }

    private Logger logger = LoggerFactory.getLogger(ProducerMessageExecutor.class);

    public void execute(Runnable runnable) {
        service.execute(runnable);
    }

    public void execute(Channel channel, Gateway2ProducerMessage gsMessage) {
        service.execute(() -> {
            long userId = gsMessage.getUserId();
            ProducerMessageHandler handler = ProducerMessageHandlerUtil.getHandler(gsMessage.getMessageId());
            if (handler == null) {
                logger.warn("没有找到消息处理程序{} userId:{}", gsMessage.getMessageId(), userId);
                return;
            }
            Message message = handler.getEmptyMessage();
            message.read(gsMessage.getBuf(), gsMessage.getBuf().writerIndex());
            try {
                handler.execute(channel, gsMessage.getToken(), userId, message);
            } catch (Exception e) {
                logger.error("执行handler[" + handler.getClass().getName() + "]逻辑出错 ", e);
            }

        });
    }


}
