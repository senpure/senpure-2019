package com.senpure.io.consumer;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsumerServerHandler extends SimpleChannelInboundHandler<MessageFrame> {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private RemoteServerChannelManager remoteServerChannelManager;
    private ConsumerMessageExecutor messageExecutor;


    public ConsumerServerHandler(ConsumerMessageExecutor messageExecutor, RemoteServerChannelManager remoteServerChannelManager) {
        this.remoteServerChannelManager = remoteServerChannelManager;
        this.messageExecutor = messageExecutor;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageFrame frame) throws Exception {

        messageExecutor.execute(ctx.channel(), frame);
    }


}
