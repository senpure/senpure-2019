package com.senpure.io.direct;

import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;

/**
 * ClientManager
 *
 * @author senpure
 * @time 2019-09-17 17:26:46
 */
public class ClientManager {
    private final static ThreadLocal<Integer> requestIdLocal = ThreadLocal.withInitial(() -> 0);

    public static void setRequestId(int requestId) {
        requestIdLocal.set(requestId);
    }

    public static void clearRequestId() {
        requestIdLocal.set(0);
    }

    public static int getRequestId() {
        return requestIdLocal.get();
    }

    public static void sendMessage(Channel channel, Message message) {

        DirectMessage frame = new DirectMessage();
        frame.setMessage(message);
        frame.setRequestId(requestIdLocal.get());
        channel.writeAndFlush(frame);
    }
}
