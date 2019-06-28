package com.senpure.io.consumer;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * RemoteServerChannelManager
 *
 * @author senpure
 * @time 2019-06-28 20:57:29
 */
public class RemoteServerChannelManager {


   private List<Channel> channels = new ArrayList<>();
    private Logger logger = LoggerFactory.getLogger(getClass());
}
