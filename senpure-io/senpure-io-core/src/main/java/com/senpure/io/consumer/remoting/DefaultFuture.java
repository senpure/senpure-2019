package com.senpure.io.consumer.remoting;

import com.senpure.io.consumer.MessageFrame;
import com.senpure.io.protocol.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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

    private static final Map<Integer, DefaultFuture> FUTURES = new ConcurrentHashMap();

    private final int requestId;

    private final int timeout;
    private final Lock lock = new ReentrantLock();
    private final Condition done = lock.newCondition();
    private final long start = System.currentTimeMillis();
    private volatile long sent;

    private volatile MessageFrame frame;

    public DefaultFuture(int requestId, int timeout) {
        this.requestId = requestId;
        this.timeout = timeout;
    }


    public void doReceived(MessageFrame frame) {
        lock.lock();
        try {
            this.frame = frame;
            done.signal();
        } finally {
            lock.unlock();
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
        return returnMessage();

    }

    private ResponseResult returnMessage() {
         Message message = frame.getMessage();

        return null;
    }

    public boolean isDone() {
        return frame != null;
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
