package com.senpure.io.consumer.remoting;

import com.senpure.io.protocol.Message;

/**
 * DefaultResult
 *
 * @author senpure
 * @time 2019-06-28 11:22:51
 */
public class DefaultResult implements ResponseResult {


    private Message message;
    private Message error;

    public DefaultResult(Message message, Message error) {
        this.message = message;
        this.error = error;
    }

    @Override
    public boolean isSuccess() {
        return message != null;
    }

    @Override
    public <T extends Message> T getValue() {
        return (T) message;
    }

    @Override
    public <T extends Message> T getError() {
        return (T) error;
    }
}
