package com.senpure.io.support.configure;

import com.senpure.base.util.Assert;
import com.senpure.io.ServerProperties;
import com.senpure.io.consumer.MessageHandlerUtil;
import com.senpure.io.consumer.RemoteServerManager;
import com.senpure.io.consumer.handler.MessageHandler;
import com.senpure.io.message.SCHeartMessage;
import com.senpure.io.message.SCInnerErrorMessage;
import com.senpure.io.support.ConsumerServerStarter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

/**
 * ConsumerAutoConfiguration
 *
 * @author senpure
 * @time 2019-03-01 11:46:50
 */


public class ConsumerAutoConfiguration {
    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private ServerProperties properties;


    @Bean
    public RemoteServerManager remoteServerManager() {
        return new RemoteServerManager(properties.getConsumer());
    }

    @Bean
    public ConsumerServerStarter consumerServerStarter() {
        return new ConsumerServerStarter();
    }

    @Bean
    public HandlerChecker handlerChecker() {
        return new HandlerChecker();
    }


    public void setProperties(ServerProperties properties) {
        this.properties = properties;
    }

    class HandlerChecker implements ApplicationRunner {
        @Override
        public void run(ApplicationArguments args) throws Exception {
            MessageHandler handler = MessageHandlerUtil.getHandler(SCInnerErrorMessage.MESSAGE_ID);
            if (handler == null) {
                Assert.error("缺少[SCInnerErrorMessage]处理器");
            }
            handler = MessageHandlerUtil.getHandler(SCHeartMessage.MESSAGE_ID);
            if (handler == null) {
                Assert.error("缺少[SCHeartMessage]处理器");
            }
        }
    }
}
