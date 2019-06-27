package com.senpure.io.consumer.remoting;

/**
 * ResponseFuture
 *
 * @author senpure
 * @time 2019-06-27 20:05:38
 */
public interface ResponseFuture {
    Object get();


    Object get(int timeout);

}
