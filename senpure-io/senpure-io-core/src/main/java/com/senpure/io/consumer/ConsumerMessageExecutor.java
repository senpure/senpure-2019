package com.senpure.io.consumer;

import com.senpure.executor.TaskLoopGroup;
import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.DefaultResponse;
import com.senpure.io.consumer.remoting.Response;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/**
 * ConsumerMessageExecutor
 *
 * @author senpure
 * @time 2019-06-28 17:01:34
 */
public class ConsumerMessageExecutor {

    private Logger logger = LoggerFactory.getLogger(ConsumerMessageExecutor.class);
   private TaskLoopGroup service;
    private int serviceRefCount = 0;
    private Set<Integer> errorMessageIds = new HashSet<>();

    public ConsumerMessageExecutor(ServerProperties.Consumer properties) {
        errorMessageIds.add(SCInnerErrorMessage.MESSAGE_ID);
        errorMessageIds.add(properties.getScErrorMessageId());
    }


    public void setService(TaskLoopGroup service) {
        this.service = service;
    }

    public ScheduledExecutorService getService() {
        return service;
    }

    public void execute(Runnable runnable) {
        service.execute(runnable);
    }

    public void execute(Channel channel, ConsumerMessage frame) {
        service.execute(() -> {
            int requestId = frame.getRequestId();
            Message message = frame.getMessage();
            if (requestId == 0) {
                try {
                    ConsumerMessageHandlerUtil.getHandler(message.getMessageId())
                            .execute(channel, message);
                } catch (Exception e) {
                    logger.error("执行handler[" + ConsumerMessageHandlerUtil.getHandler(message.getMessageId()).getClass().getName() + "]逻辑出错 ", e);
                }
            } else {
                DefaultFuture future = DefaultFuture.received(requestId);
                if (future != null) {
                    if (isErrorMessage(message)) {
                        Response response = new DefaultResponse(channel,null, message);
                        future.doReceived(response);
                    } else {
                        Response response = new DefaultResponse(channel,message, null);
                        future.doReceived(response);
                    }
                } else {
                    logger.warn("远程服务器返回时间过长,服务器已经做了超时处理 {}",frame);
                }

            }
        });


    }

    public boolean isErrorMessage(Message message) {
        return errorMessageIds.contains(message.getMessageId());
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

    public boolean isShutdown() {
        return service.isShutdown();
    }
}
