package com.senpure.io.gateway;

import com.senpure.base.util.Assert;
import com.senpure.io.protocol.Bean;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 将服务器转发到网关的消息，解析出来
 */
public class GatewayAndServerMessageDecoder extends ByteToMessageDecoder {
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

            this.logger.info("数据不够一个数据包 packageLength ={} ,readableBytes={}", packageLength, in.readableBytes());
            in.resetReaderIndex();
        } else {
            int requestId = Bean.readVar32(in);
            int messageId = Bean.readVar32(in);
            long token = Bean.readVar64(in);
            int userLen = Bean.readVar32(in);
            Long[] userIds = new Long[userLen];
            for (int i = 0; i < userLen; i++) {
                userIds[i] = Bean.readVar64(in);
            }
            int headLength = Bean.computeVar32SizeNoTag(requestId);
            headLength += Bean.computeVar32SizeNoTag(messageId);

            headLength += Bean.computeVar64SizeNoTag(token);
            headLength += Bean.computeVar32SizeNoTag(userLen);
            for (Long userId : userIds) {
                headLength += Bean.computeVar64SizeNoTag(userId);
            }

            int messageLength = packageLength - headLength;
            byte data[] = new byte[messageLength];
            in.readBytes(data);
            Server2GatewayMessage serverMessage = new Server2GatewayMessage();
            serverMessage.setRequestId(requestId);
            serverMessage.setMessageId(messageId);
            serverMessage.setData(data);
            serverMessage.setToken(token);
            serverMessage.setUserIds(userIds);
            //  serverMessage.setUserIds(playerIds);
            out.add(serverMessage);
        }
    }

    protected void decode2(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

        int rl = in.readableBytes();
        if (rl < 4) {
            this.logger.debug("数据过短 s{}", Integer.valueOf(rl));
        } else {
            in.markReaderIndex();
            int packageLength = in.readInt();
            if (packageLength == 0) {
                Assert.error("错误，数据包长度不能为0");
            }
            if (packageLength > in.readableBytes()) {
                if (packageLength > 2000000) {
                    ctx.close().sync();
                }
                this.logger.info("数据不够一个数据包 packageLength ={} ,readableBytes={}", Integer.valueOf(packageLength), Integer.valueOf(in.readableBytes()));
                in.resetReaderIndex();
            } else {
                int requestId = in.readInt();
                int messageId = in.readInt();
                long token = in.readLong();
                short userLen = in.readShort();
                Long[] userIds = new Long[userLen];
                for (int i = 0; i < userLen; i++) {
                    userIds[i] = in.readLong();
                }
                int messageLength = packageLength - 18 - (userLen << 3);
                byte data[] = new byte[messageLength];
                in.readBytes(data);
                Server2GatewayMessage serverMessage = new Server2GatewayMessage();
                serverMessage.setRequestId(requestId);
                serverMessage.setMessageId(messageId);
                serverMessage.setData(data);
                serverMessage.setToken(token);
                serverMessage.setUserIds(userIds);
                //  serverMessage.setUserIds(playerIds);
                out.add(serverMessage);
            }

        }
    }

    public static void main(String[] args) {

        new ArrayList<>(17);
        System.out.println(2 & 8);
    }
}
