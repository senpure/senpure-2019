package com.senpure.io.consumer.remoting;

import com.senpure.io.protocol.Message;

/**
 * ResponseCallback
 *
 * @author senpure
 * @time 2019-06-29 16:35:53
 */
public interface ResponseCallback {

    void success(Message message);

    void fail(Message message);
}
