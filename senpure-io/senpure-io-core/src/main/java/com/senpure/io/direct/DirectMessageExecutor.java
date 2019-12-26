package com.senpure.io.direct;

import com.senpure.executor.TaskLoopGroup;
import com.senpure.io.ChannelAttributeUtil;
import com.senpure.io.direct.handler.DirectMessageHandler;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.protocol.Constant;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledExecutorService;

/**
 * DirectMessageExecutor
 *
 * @author senpure
 * @time 2019-09-17 16:19:00
 */
public class DirectMessageExecutor {

    protected static Logger logger = LoggerFactory.getLogger(DirectMessageExecutor.class);
    private TaskLoopGroup service;
    private int serviceRefCount = 0;

    public DirectMessageExecutor() {

    }

    public DirectMessageExecutor(TaskLoopGroup service) {
        this.service = service;
    }

    public void setService(TaskLoopGroup service) {
        this.service = service;
    }

    public void execute(Channel channel, DirectMessage frame) {
        service.get(ChannelAttributeUtil.getToken(channel)).execute(() -> {
            int requestId = frame.getRequestId();
            ClientManager.setRequestId(requestId);
            DirectMessageHandler handler = DirectMessageHandlerUtil.getHandler(frame.getMessageId());
            if (handler == null) {
                logger.warn("没有找到消息处理程序 {} ", frame.getMessageId());
                SCInnerErrorMessage scInnerErrorMessage = new SCInnerErrorMessage();
                scInnerErrorMessage.setType(Constant.ERROR_NOT_HANDLE_REQUEST);
                scInnerErrorMessage.setMessage("服务器没有处理程序:" + frame.getMessageId());
                scInnerErrorMessage.setId(frame.getMessageId());
                ClientManager.sendMessage(channel, scInnerErrorMessage);
                return;
            }
            try {
                handler.execute(channel, frame.getMessage());
            } catch (Exception e) {
                logger.error("执行handler[" + handler.getClass().getName() + "]逻辑出错 ", e);
                SCInnerErrorMessage scInnerErrorMessage = new SCInnerErrorMessage();
                scInnerErrorMessage.setType(Constant.ERROR_SERVER_ERROR);
                scInnerErrorMessage.setMessage("服务器执行错误:" + frame.getMessage().getClass().getSimpleName() + ":" +
                        e.getMessage());
                scInnerErrorMessage.setId(frame.getMessageId());
                ClientManager.sendMessage(channel, scInnerErrorMessage);
            }
        });


    }

    public ScheduledExecutorService getService() {
        return service;
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
            service.shutdownGracefully();
        }
    }

    public void shutdownService() {
        if (serviceRefCount <= 0) {
            service.shutdownGracefully();
        } else {
            logger.warn("server 持有引用{}，请先释放后关闭", serviceRefCount);
        }
    }
}
