package com.senpure.io.consumer;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ConsumerMessageExecutor
 *
 * @author senpure
 * @time 2019-06-28 17:01:34
 */
public class ConsumerMessageExecutor {

    private Logger logger = LoggerFactory.getLogger(ConsumerMessageExecutor.class);
    private ExecutorService service;



    public ConsumerMessageExecutor() {
        this(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2));
    }

    public ConsumerMessageExecutor(ExecutorService service) {
        this.service = service;
    }

    public void execute(Runnable runnable) {
        service.execute(runnable);
    }




    public void execute(Channel channel, MessageFrame frame) {

        service.execute(new Runnable() {
            @Override
            public void run() {

            }
        });


    }

    public boolean isShutdown() {
        return service.isShutdown();
    }
}
