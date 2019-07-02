package com.senpure.io.support.annotation;

import com.senpure.io.ServerProperties;
import com.senpure.io.support.configure.ConsumerAutoConfiguration;
import com.senpure.io.support.configure.ConsumerSelector;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * EnableConsumer
 *
 * @author senpure
 * @time 2019-07-02 16:58:29
 */
@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@EnableConfigurationProperties({ServerProperties.class})
@Import({ConsumerAutoConfiguration.class, ConsumerSelector.class})
public @interface EnableConsumer {

    boolean innerError() default true;

    boolean heart() default true;
}
