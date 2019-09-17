package com.senpure.io.gateway;

import com.senpure.io.protocol.Bean;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 将服务器发到网关的消息，转发给客户端
 */
public class GatewayAndClientMessageEncoder extends MessageToByteEncoder<Server2GatewayMessage> {
    protected Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    protected void encode(ChannelHandlerContext ctx, Server2GatewayMessage msg, ByteBuf out) {
        int headlength = Bean.computeVar32Size(msg.getRequestId());
        headlength += Bean.computeVar32Size(msg.getMessageId());
        int packageLength = headlength + msg.getData().length;
        out.ensureWritable(Bean.computeVar32Size(packageLength) + packageLength);

        Bean.writeVar32(out, packageLength);
        Bean.writeVar32(out, msg.getRequestId());
        Bean.writeVar32(out, msg.getMessageId());
        out.writeBytes(msg.getData());
    }

    protected void encode2(ChannelHandlerContext ctx, Server2GatewayMessage msg, ByteBuf out) {
        //head 4 +requestId 4 +messageId 4 +  data
        out.ensureWritable(12 + msg.getData().length);
        out.writeInt(8 + msg.getData().length);
        out.writeInt(msg.getRequestId());
        out.writeInt(msg.getMessageId());
        out.writeBytes(msg.getData());

    }
}
