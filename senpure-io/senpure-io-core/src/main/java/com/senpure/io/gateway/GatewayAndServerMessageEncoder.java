package com.senpure.io.gateway;

import com.senpure.io.protocol.Bean;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 将客户端发到网关的消息，重新编码，发送给具体的服务器
 */
public class GatewayAndServerMessageEncoder extends MessageToByteEncoder<Client2GatewayMessage> {
    protected Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    protected void encode(ChannelHandlerContext ctx, Client2GatewayMessage msg, ByteBuf out) throws Exception {
        int headLength = Bean.computeVar32SizeNoTag(msg.getRequestId());
        headLength += Bean.computeVar32SizeNoTag(msg.getMessageId());

        headLength += Bean.computeVar64SizeNoTag(msg.getToken());
        headLength += Bean.computeVar64SizeNoTag(msg.getUserId());

        int allSize = headLength + msg.getData().length;
        out.ensureWritable(Bean.computeVar32SizeNoTag(allSize) + allSize);

        Bean.writeVar32(out, allSize);
        Bean.writeVar32(out, msg.getRequestId());
        Bean.writeVar32(out, msg.getMessageId());
        Bean.writeVar64(out, msg.getToken());
        Bean.writeVar64(out, msg.getUserId());
        out.writeBytes(msg.getData());
    }
    protected void encode2(ChannelHandlerContext ctx, Client2GatewayMessage msg, ByteBuf out) throws Exception {

        //head 4 +requestId 4 + messageId 4 token +8 + playerId 8+ data
        out.ensureWritable(28 + msg.getData().length);
        out.writeInt(24 + msg.getData().length);
        out.writeInt(msg.getRequestId());
        out.writeInt(msg.getMessageId());
        out.writeLong(msg.getToken());
        out.writeLong(msg.getUserId());
        out.writeBytes(msg.getData());

    }
}
