package com.senpure.io.consumer;

import com.senpure.io.ServerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * RemoteServerManager
 *
 * @author senpure
 * @time 2019-06-29 15:15:57
 */
public class RemoteServerManager {
    private Logger logger = LoggerFactory.getLogger(getClass());


    private ServerProperties.Consumer properties;
    private ConcurrentMap<String, RemoteServerChannelManager> remoteServerChannelManager = new ConcurrentHashMap<>();


    public RemoteServerManager(ServerProperties.Consumer properties) {
        this.properties = properties;
    }

    public String getRemoteServerKey(String host, int port) {
        return host + ":" + port;
    }

    public synchronized RemoteServerChannelManager getRemoteServerChannelManager(String remoteServerKey) {
        RemoteServerChannelManager manager = remoteServerChannelManager.get(remoteServerKey);
        if (manager == null) {
            manager = new RemoteServerChannelManager(remoteServerKey, properties.getRequestTimeout());
            remoteServerChannelManager.put(remoteServerKey, manager);
            return remoteServerChannelManager.get(remoteServerKey);
        }
        return manager;
    }














    public void setProperties(ServerProperties.Consumer properties) {
        this.properties = properties;
    }
}
