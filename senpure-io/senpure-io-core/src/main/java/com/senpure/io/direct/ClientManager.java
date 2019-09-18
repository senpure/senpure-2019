package com.senpure.io.direct;

import com.senpure.base.util.Assert;
import com.senpure.io.protocol.Message;
import io.netty.channel.Channel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClientManager
 *
 * @author senpure
 * @time 2019-09-17 17:26:46
 */
public class ClientManager {
    private final static ThreadLocal<Integer> requestIdLocal = ThreadLocal.withInitial(() -> 0);

    private static Map<String, OfflineListener> offlineListenerMap = new ConcurrentHashMap<>();

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

    public static void regOfflineListener(OfflineListener offlineListener) {
        Assert.isNull(offlineListenerMap.get(offlineListener.getName()));
        offlineListenerMap.put(offlineListener.getName(), offlineListener);
    }

    public static void channelOffline(Channel channel) {
        for (Map.Entry<String, OfflineListener> entry : offlineListenerMap.entrySet()) {
            entry.getValue().execute(channel);
        }

    }
}
