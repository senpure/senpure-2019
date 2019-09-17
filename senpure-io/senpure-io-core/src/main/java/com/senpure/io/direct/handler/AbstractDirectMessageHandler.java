package com.senpure.io.direct.handler;

import com.senpure.io.direct.DirectMessageHandlerUtil;
import com.senpure.io.protocol.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;


public abstract class AbstractDirectMessageHandler<T extends Message> implements DirectMessageHandler<T>, InitializingBean {
    protected Logger logger;
   // protected Class<T> messageClass;

    public AbstractDirectMessageHandler() {
        this.logger = LoggerFactory.getLogger(getClass());
      //  ResolvableType resolvableType = ResolvableType.forClass(getClass());
       // messageClass = (Class<T>) resolvableType.getSuperType().getGeneric(0).resolve();
    }

//    @Override
//    public T getEmptyMessage() {
//
//        try {
//            return messageClass.newInstance();
//        } catch (Exception e) {
//
//            Assert.error(e.toString());
//        }
//        return null;
//    }

    @Override
    public void afterPropertiesSet() throws Exception {

        DirectMessageHandlerUtil.regMessageHandler(this);

    }
}
