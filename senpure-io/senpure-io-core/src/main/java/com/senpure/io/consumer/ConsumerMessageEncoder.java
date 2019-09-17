package com.senpure.io.consumer;


import com.senpure.io.protocol.Bean;
import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerMessageEncoder extends MessageToByteEncoder<MessageFrame> {
    protected Logger logger = LoggerFactory.getLogger(getClass());


    //包长int ,消息Id int, 二进制数据
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MessageFrame frame, ByteBuf out) throws Exception {
        Message message = frame.getMessage();
        int headLength = Bean.computeVar32Size(frame.getRequestId());
        headLength += Bean.computeVar32Size(message.getMessageId());
        int packageLength = headLength + message.getSerializedSize();
        out.ensureWritable(Bean.computeVar32Size(packageLength) + packageLength);
        Bean.writeVar32(out, packageLength);
        Bean.writeVar32(out, frame.getRequestId());
        Bean.writeVar32(out, message.getMessageId());
        message.write(out);
    }

    protected void encode2(ChannelHandlerContext channelHandlerContext, MessageFrame frame, ByteBuf out) throws Exception {


        Message message = frame.getMessage();
        int length = message.getSerializedSize();
        // logger.debug("getValue length {}", length);
        //head 4 +requestId 4 +messageId 4+ content length

        out.ensureWritable(12 + length);
        out.writeInt(length + 8);
        out.writeInt(frame.getRequestId());
        out.writeInt(message.getMessageId());
        message.write(out);

        // logger.debug("out length {}", out.writerIndex());


    }
}
