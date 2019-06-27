package com.senpure.io.consumer;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class ConsumerServerHandler extends SimpleChannelInboundHandler<MessageFrame> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageFrame frame) throws Exception {


        MessageHandlerUtil.execute(ctx.channel(), frame);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        //解决强断的错误 远程主机强迫关闭了一个现有的连接
        ctx.flush();
    }
}
