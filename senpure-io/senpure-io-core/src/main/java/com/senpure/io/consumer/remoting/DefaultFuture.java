package com.senpure.io.consumer.remoting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * DefaultFuture
 *
 * @author senpure
 * @time 2019-06-27 20:13:58
 */
public class DefaultFuture implements ResponseFuture {

    private static final Logger logger = LoggerFactory.getLogger(DefaultFuture.class);


    private final int requestId;

    private final int timeout;
    private final Lock lock = new ReentrantLock();
    private final Condition done = lock.newCondition();
    private final long start = System.currentTimeMillis();


    private volatile ResponseResult result;
    private volatile ResponseCallback callback;

    public DefaultFuture(int requestId, int timeout) {
        this.requestId = requestId;
        this.timeout = timeout;

    }




    public void doReceived(ResponseResult result) {
        lock.lock();
        try {
            this.result = result;
            done.signal();
        } finally {
            lock.unlock();
        }
        if (callback != null) {
            invokeCallback(callback);
        }
    }


    @Override
    public ResponseResult get() {
        return get(timeout);
    }


    @Override
    public ResponseResult get(int timeout) {
        if (timeout <= 0) {
            timeout = 500;
        }
        if (!isDone()) {
            long start = System.currentTimeMillis();
            lock.lock();
            try {
                while (!isDone()) {
                    done.await(timeout, TimeUnit.MILLISECONDS);
                    if (isDone() || System.currentTimeMillis() - start > timeout) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
            if (!isDone()) {
                throw new RuntimeException("超时" + timeout);
            }
        }
        return result;

    }


    @Override
    public void setCallback(ResponseCallback callback) {
        if (isDone()) {
            invokeCallback(callback);
        } else {
            boolean isdone = false;
            lock.lock();
            try {
                if (!isDone()) {
                    this.callback = callback;
                } else {
                    isdone = true;
                }
            } finally {
                lock.unlock();
            }
            if (isdone) {
                invokeCallback(callback);
            }
        }
    }


    @Override
    public boolean isDone() {
        return result != null;
    }


    private void invokeCallback(ResponseCallback callback) {

        if (callback == null) {
            throw new NullPointerException("回调不能为空");
        }
        if (result == null) {
            throw new NullPointerException("结果不能为空");
        }

        if (result.isSuccess()) {
            try {
                callback.success(result.getValue());
            } catch (Exception e) {
                logger.error("执行成功回调出错", e);
            }
        } else {
            try {
                callback.fail(result.getError());
            } catch (Exception e) {
                logger.error("执行失败回调出错", e);
            }
        }

    }


    public int getTimeout() {
        return timeout;
    }

    public long getStartTime() {
        return start;
    }

    public int getRequestId() {
        return requestId;
    }
}
