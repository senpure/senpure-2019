package com.senpure.io.producer;

import io.netty.buffer.ByteBuf;

/**
 * Gateway2ProducerMessage
 *
 * @author senpure
 * @time 2019-06-26 16:52:09
 */
public class Gateway2ProducerMessage {

    //请求编号

    private int  requestId;
    private long token;
    private long userId;
    private int messageId;
    private ByteBuf buf;

    public int  getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public ByteBuf getBuf() {
        return buf;
    }

    public void setBuf(ByteBuf buf) {
        this.buf = buf;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
}
