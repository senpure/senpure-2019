package com.senpure.io.producer;


import com.senpure.io.ChannelAttributeUtil;

import com.senpure.io.message.SCHeartMessage;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProducerServerHandler extends SimpleChannelInboundHandler<Gateway2ProducerMessage> {


    private ProducerMessageExecutor messageExecutor;
    private GatewayManager gatewayManager;


    private Logger logger = LoggerFactory.getLogger(getClass());

    public ProducerServerHandler(ProducerMessageExecutor messageExecutor, GatewayManager gatewayManager) {
        this.messageExecutor = messageExecutor;
        this.gatewayManager = gatewayManager;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Gateway2ProducerMessage msg) throws Exception {
        messageExecutor.execute(ctx.channel(), msg);
    }


    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        logger.info("{} :{} 网关连接断开 ", ChannelAttributeUtil.getRemoteServerKey(ctx.channel()), ctx.channel());
        gatewayManager.getGatewayChannelServer(ChannelAttributeUtil.getRemoteServerKey(ctx.channel())).removeChannel(ctx.channel());
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
