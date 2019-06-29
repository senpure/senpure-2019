package com.senpure.io.consumer;


import com.senpure.io.ChannelAttributeUtil;
import com.senpure.io.message.SCHeartMessage;
import com.senpure.io.producer.Producer2GatewayMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsumerServerHandler extends SimpleChannelInboundHandler<MessageFrame> {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private RemoteServerManager remoteServerManager;
    private ConsumerMessageExecutor messageExecutor;


    public ConsumerServerHandler(ConsumerMessageExecutor messageExecutor, RemoteServerManager remoteServerManager) {
        this.remoteServerManager = remoteServerManager;
        this.messageExecutor = messageExecutor;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageFrame frame) throws Exception {

        messageExecutor.execute(ctx.channel(), frame);
    }


    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        logger.info("{} :{} 网关连接断开 ", ChannelAttributeUtil.getRemoteServerKey(ctx.channel()), ctx.channel());
        remoteServerManager.getRemoteServerChannelManager(ChannelAttributeUtil.
                getRemoteServerKey(ctx.channel())).removeChannel(ctx.channel());

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        //解决强断的错误 远程主机强迫关闭了一个现有的连接
        //ctx.flush();
        super.channelReadComplete(ctx);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            Channel channel = ctx.channel();
            if (channel.isWritable()) {
                logger.info("维持网关心跳{} : {}", ChannelAttributeUtil.getRemoteServerKey(channel), channel);
                SCHeartMessage heartMessage = new SCHeartMessage();
                Producer2GatewayMessage toGateway = new Producer2GatewayMessage();
                toGateway.setUserIds(new Long[0]);
                toGateway.setMessage(heartMessage);
                toGateway.setMessageId(heartMessage.getMessageId());
                channel.writeAndFlush(toGateway);
            } else {
                logger.warn("网关心跳失败并且channel不可用{}:{}", ChannelAttributeUtil.getRemoteServerKey(channel), channel);
                channel.close();
            }

            return;
        }
        super.userEventTriggered(ctx, evt);
    }
}
