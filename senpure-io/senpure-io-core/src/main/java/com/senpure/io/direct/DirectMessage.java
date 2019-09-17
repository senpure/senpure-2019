package com.senpure.io.direct;

import com.senpure.io.protocol.Message;

/**
 * DirectMessage
 *
 * @author senpure
 * @time 2019-09-17 17:06:53
 */
public class DirectMessage {
    private int requestId;
    private int messageId;
    private Message message;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
}
