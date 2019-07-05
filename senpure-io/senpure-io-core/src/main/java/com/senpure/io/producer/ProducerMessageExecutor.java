package com.senpure.io.producer;

import com.senpure.io.producer.handler.ProducerMessageHandler;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledExecutorService;


public class ProducerMessageExecutor {
    private Logger logger = LoggerFactory.getLogger(ProducerMessageExecutor.class);
    private ScheduledExecutorService service;
    private int serviceRefCount = 0;

    public ProducerMessageExecutor() {

    }

    public  ScheduledExecutorService getService() {
        return service;
    }

    public void setService( ScheduledExecutorService service) {
        this.service = service;
    }

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
                GatewayManager.setRequestId(gsMessage.getRequestId());
                handler.execute(channel, gsMessage.getToken(), userId, message);
            } catch (Exception e) {
                logger.error("执行handler[" + handler.getClass().getName() + "]逻辑出错 ", e);
            }

        });
    }

    /**
     * 引用计数+1
     */
    public void retainService() {
        serviceRefCount++;
    }

    public void releaseService() {
        serviceRefCount--;

    }

    public void releaseAndTryShutdownService() {
        serviceRefCount--;
        if (serviceRefCount <= 0) {
            service.shutdown();
        }
    }

    public void shutdownService() {
        if (serviceRefCount <= 0) {
            service.shutdown();
        } else {
            logger.warn("server 持有引用{}，请先释放后关闭", serviceRefCount);
        }
    }
}
