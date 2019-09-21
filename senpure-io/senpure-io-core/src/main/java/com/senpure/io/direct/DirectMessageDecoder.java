package com.senpure.io.direct;


import com.senpure.base.util.Assert;
import com.senpure.io.consumer.ConsumerMessage;
import com.senpure.io.consumer.ConsumerMessageHandlerUtil;
import com.senpure.io.protocol.Bean;
import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class DirectMessageDecoder extends ByteToMessageDecoder {
    protected Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        in.markReaderIndex();
        int preIndex = in.readerIndex();
        int packageLength = Bean.tryReadVar32(in);
        int readerIndex=in.readerIndex();
        if (preIndex == readerIndex) {
            return;
        }
        if (packageLength == 0) {
            Assert.error("错误，数据包长度不能为0");
        }
        if (packageLength > in.readableBytes()) {
            this.logger.info("数据不够一个数据包 packageLength ={} ,readableBytes={}", packageLength, in.readableBytes());
            in.resetReaderIndex();
        } else {
            int endIndex = readerIndex + packageLength;
            int requestId = Bean.readVar32(in);
            int messageId = Bean.readVar32(in);

            Message message = DirectMessageHandlerUtil.getEmptyMessage(messageId);
            ConsumerMessage frame = new ConsumerMessage();
            frame.setRequestId(requestId);
            if (message == null) {
                int headSize = Bean.computeVar32Size(requestId) + Bean.computeVar32Size(messageId);
                int messageLength = packageLength - headSize;
                in.skipBytes(messageLength);
                logger.warn("没有找到消息处理程序 messageId {}", messageId);
            } else {
                try {
                    message.read(in, endIndex);
                    frame.setMessage(message);
                } catch (Exception e) {
                    ctx.close();
                    logger.debug("二进制转换为消息失败 messageId {}, message {}", messageId, message);
                    logger.error("error", e);
                }
            }
            out.add(frame);
        }
    }

    protected void decode2(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        int rl = in.readableBytes();
        if (rl < 4) {
            logger.debug("数据过短 s{}", rl);
            return;
        }
        in.markReaderIndex();
        int packageLength = in.readInt();
        if (packageLength == 0) {
            Assert.error("错误，数据包长度不能为0");
        }
        //logger.debug("pl={} ,rl={}", packageLength, in.readableBytes());
        //半包
        if (packageLength > in.readableBytes()) {
            if (packageLength > 2000000) {
                ctx.close().sync();
            }
            logger.info("数据不够一个数据包 pl={} ,rl={}", packageLength, in.readableBytes());
            in.resetReaderIndex();
        } else {
            int requestId = in.readInt();
            int messageId = in.readInt();
            Message message = ConsumerMessageHandlerUtil.getEmptyMessage(messageId);
            int messageLength = packageLength - 8;
            if (message == null) {
                logger.warn("没有找到消息处理程序 messageId {}", messageId);
                // ctx.close();
                in.skipBytes(messageLength);
            } else {
                try {
                    message.read(in, in.readerIndex() + messageLength);
                    ConsumerMessage frame = new ConsumerMessage();
                    frame.setRequestId(requestId);
                    frame.setMessage(message);
                    out.add(frame);
                } catch (Exception e) {
                    ctx.close();
                    logger.debug("二进制转换为消息失败 messageId {}, getValue{}", messageId, message);
                    logger.error("error", e);
                }
                // in.skipBytes(messageLengh);

            }

        }


    }


}
