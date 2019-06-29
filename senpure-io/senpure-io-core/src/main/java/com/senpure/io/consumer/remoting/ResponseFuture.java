package com.senpure.io.consumer.remoting;

/**
 * ResponseFuture
 *
 * @author senpure
 * @time 2019-06-27 20:05:38
 */
public interface ResponseFuture {
    ResponseResult get() throws Exception;

    ResponseResult get(int timeout) throws Exception;

    void setCallback(ResponseCallback callback);

    boolean isDone();
}
