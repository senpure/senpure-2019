package com.senpure.io.producer;

import com.senpure.executor.TaskLoopGroup;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.producer.handler.ProducerMessageHandler;
import com.senpure.io.protocol.Constant;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledExecutorService;


public class ProducerMessageExecutor {
    private Logger logger = LoggerFactory.getLogger(ProducerMessageExecutor.class);
    private TaskLoopGroup service;
    private int serviceRefCount = 0;
    private GatewayManager gatewayManager;

    public ProducerMessageExecutor() {

    }

    public ScheduledExecutorService getService() {
        return service;
    }

    public void setGatewayManager(GatewayManager gatewayManager) {
        this.gatewayManager = gatewayManager;
    }

    public void setService(TaskLoopGroup service) {
        this.service = service;
    }

    public void execute(Runnable runnable) {
        service.execute(runnable);
    }

    public void execute(Channel channel, Gateway2ProducerMessage frame) {
        long userId = frame.getUserId();
        long id = userId > 0 ? userId : frame.getToken();
        service.get(id).execute(() -> {
            ProducerMessageHandler handler = ProducerMessageHandlerUtil.getHandler(frame.getMessageId());
            if (handler == null) {
                logger.warn("没有找到消息处理程序{} userId:{}", frame.getMessageId(), userId);
                SCInnerErrorMessage scInnerErrorMessage = new SCInnerErrorMessage();
                scInnerErrorMessage.setType(Constant.ERROR_NOT_HANDLE_REQUEST);
                scInnerErrorMessage.setMessage("服务器没有处理程序:" + frame.getMessageId());
                scInnerErrorMessage.setId(frame.getMessageId());
                gatewayManager.sendMessage2GatewayByToken(frame.getToken(), scInnerErrorMessage);
                return;
            }
            try {
                GatewayManager.setRequestId(frame.getRequestId());
                handler.execute(channel, frame.getToken(), userId, frame.getMessage());
                GatewayManager.clearRequestId();
            } catch (Exception e) {
                logger.error("执行handler[" + handler.getClass().getName() + "]逻辑出错 ", e);
                SCInnerErrorMessage scInnerErrorMessage = new SCInnerErrorMessage();
                scInnerErrorMessage.setType(Constant.ERROR_SERVER_ERROR);
                scInnerErrorMessage.setMessage("服务器执行错误:" + frame.getMessage().getClass().getSimpleName() + ":" +
                        e.getMessage());
                scInnerErrorMessage.setId(frame.getMessageId());
                gatewayManager.sendMessage2GatewayByToken(frame.getToken(), scInnerErrorMessage);
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
