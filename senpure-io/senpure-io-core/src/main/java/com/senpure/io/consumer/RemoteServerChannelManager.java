package com.senpure.io.consumer;

import com.senpure.io.AbstractServerChannelManager;
import io.netty.channel.Channel;

/**
 * RemoteServerChannelManager
 *
 * @author senpure
 * @time 2019-06-28 20:57:29
 */
public class RemoteServerChannelManager extends AbstractServerChannelManager {


    public RemoteServerChannelManager(String serverKey,String host, int port) {
        super(serverKey,host, port);
    }

    public void sendMessage(MessageFrame frame) {
        Channel channel = nextChannel();
        if (channel != null) {
            channel.writeAndFlush(frame);
        }
    }


}
