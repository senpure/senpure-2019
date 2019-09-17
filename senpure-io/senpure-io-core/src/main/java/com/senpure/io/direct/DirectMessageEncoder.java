package com.senpure.io.direct;


import com.senpure.io.protocol.Bean;
import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirectMessageEncoder extends MessageToByteEncoder<DirectMessage> {
    protected Logger logger = LoggerFactory.getLogger(getClass());


    //包长int ,消息Id int, 二进制数据
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, DirectMessage frame, ByteBuf out) throws Exception {
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


}
