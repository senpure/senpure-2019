package com.senpure.io.consumer;

import com.senpure.io.consumer.remoting.DefaultFuture;
import com.senpure.io.consumer.remoting.ResponseResult;
import com.senpure.io.message.SCAskHandleMessage;
import io.netty.channel.Channel;

/**
 * ConsumerManager
 *
 * @author senpure
 * @time 2019-06-27 17:56:32
 */
public class ServerManager {


    public <T> T sendMessage(Channel channel, MessageFrame frame) {


        DefaultFuture future=null
                ;
        MessageHandlerUtil.mark(future);
        channel.writeAndFlush(frame);
        return (T) future.get();

    }

    public static void main(String[] args) {

        ResponseResult result = null;
        SCAskHandleMessage message = result.getValue();

    }
}
