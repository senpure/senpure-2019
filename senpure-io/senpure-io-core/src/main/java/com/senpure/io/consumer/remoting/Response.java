package com.senpure.io.consumer.remoting;

import com.senpure.io.protocol.Message;

/**
 * Response
 *
 * @author senpure
 * @time 2019-06-28 11:13:28
 */
public interface Response {

    boolean isSuccess();

    <T extends Message> T getValue();

    <T extends Message> T getError();
}
