package com.senpure.io.direct;

import com.senpure.base.util.NameThreadFactory;
import com.senpure.io.direct.handler.DirectMessageHandler;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.protocol.Constant;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * DirectMessageExecutor
 *
 * @author senpure
 * @time 2019-09-17 16:19:00
 */
public class DirectMessageExecutor {

    protected static Logger logger = LoggerFactory.getLogger(DirectMessageExecutor.class);
    private ScheduledExecutorService service;

    public DirectMessageExecutor() {
        this(Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2,
                new NameThreadFactory("direct-executor")));

    }

    public DirectMessageExecutor(ScheduledExecutorService service) {
        this.service = service;
    }

    public void execute(Channel channel, DirectMessage frame) {
        service.execute(() -> {
            int requestId = frame.getRequestId();
            ClientManager.setRequestId(requestId);
            DirectMessageHandler handler = DirectMessageHandlerUtil.getHandler(frame.getMessageId());
            if (handler == null) {
                logger.warn("没有找到消息处理程序{} ", frame.getMessageId());
                SCInnerErrorMessage scInnerErrorMessage = new SCInnerErrorMessage();
                scInnerErrorMessage.setType(Constant.ERROR_NOT_HANDLE_REQUEST);
                scInnerErrorMessage.setMessage("服务器没有处理程序:" + frame.getMessageId());
                scInnerErrorMessage.setId(frame.getMessageId());
                ClientManager.sendMessage(channel, scInnerErrorMessage);
                return;
            }
            try {
                handler.execute(channel, frame.getMessage());
                //每次都会设置新的requestId 所以不用clear
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
}
