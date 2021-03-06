package com.senpure.io.gateway;

import com.senpure.base.util.Assert;
import com.senpure.io.protocol.Bean;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class GatewayAndClientMessageDecoder extends ByteToMessageDecoder {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        in.markReaderIndex();
        int preIndex = in.readerIndex();
        int packageLength = Bean.tryReadVar32(in);
        if (preIndex == in.readerIndex()) {
            return;
        }
        if (packageLength == 0) {
            Assert.error("错误，数据包长度不能为0");
        }
        if (packageLength > in.readableBytes()) {
            this.logger.info("数据不够一个数据包 packageLength ={} ,readableBytes={}", Integer.valueOf(packageLength), Integer.valueOf(in.readableBytes()));
            in.resetReaderIndex();
        } else {
            int requestId = Bean.readVar32(in);
            int messageId = Bean.readVar32(in);
            int messageLength = packageLength - (Bean.computeVar32Size(requestId) + Bean.computeVar32Size(messageId));
            byte data[] = new byte[messageLength];
            in.readBytes(data);
            Client2GatewayMessage transfer = new Client2GatewayMessage();
            transfer.setRequestId(requestId);
            transfer.setData(data);
            transfer.setMessageId(messageId);
            out.add(transfer);
        }
    }

    protected void decode2(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

        int rl = in.readableBytes();
        if (rl < 4) {
            this.logger.debug("数据过短 s{}", rl);
        } else {
            in.markReaderIndex();
            int packageLength = in.readInt();
            if (packageLength == 0) {
                Assert.error("错误，数据包长度不能为0");
            }
            if (packageLength > in.readableBytes()) {
                if (packageLength > 2000000) {
                    ctx.close().sync();
                    return;
                }
                this.logger.info("数据不够一个数据包 packageLength ={} ,readableBytes={}", packageLength, in.readableBytes());
                in.resetReaderIndex();
            } else {
                int requestId = in.readInt();
                int messageId = in.readInt();
                int messageLength = packageLength - 8;
                byte data[] = new byte[messageLength];
                in.readBytes(data);
                Client2GatewayMessage transfer = new Client2GatewayMessage();
                transfer.setRequestId(requestId);
                transfer.setData(data);
                transfer.setMessageId(messageId);
                out.add(transfer);
            }

        }
    }
}
