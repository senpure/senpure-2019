package com.senpure.io.generator.executer;


import com.senpure.base.AppEvn;
import com.senpure.io.generator.executor.Executor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.reader.IoProtocolReader;
import com.senpure.io.generator.reader.IoReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ExecutorTest
 *
 * @author senpure
 * @time 2019-07-03 11:22:35
 */

public class ExecutorTest {


    ExecutorContext getContext() {
        List<String> paths = new ArrayList<>();
        paths.add("E:\\IdeaProjects\\senpure-sport\\senpure-sport-bean\\src\\main\\resources\\sport-bean.io");
        paths.add("E:\\IdeaProjects\\senpure-sport\\senpure-sport-bean\\src\\main\\resources\\sport-data.io");
        for (String path : paths) {
            IoReader.getInstance().read(new File(path));
        }
        Map<String, IoProtocolReader> ioProtocolReaderMap = IoReader.getInstance().getIoProtocolReaderMap();

        ExecutorContext context = new ExecutorContext();

        for (IoProtocolReader value : ioProtocolReaderMap.values()) {
            context.addBeans(value.getBeans());
            context.addEnums(value.getEnums());
            context.addEvents(value.getEvents());
            context.addMessages(value.getMessages());
        }

        return context;
    }

    public void generate() {

        ExecutorContext context = getContext();


        File data = new File("E:\\IdeaProjects\\senpure-sport\\senpure-sport-data\\src\\main\\java");

        File bean = new File("E:\\IdeaProjects\\senpure-sport\\senpure-sport-bean\\src\\main\\java");
        context.setJavaEventHandlerRootPath(data.getAbsolutePath());
        context.setJavaBeanCodeRootPath(bean.getAbsolutePath());
        Executor executor = new Executor(context);
        executor.generate();
    }


    public void client() {
        ExecutorContext context = getContext();


        File data = new File("E:\\IdeaProjects\\senpure-sport\\senpure-sport-client\\src\\main\\java");

        File bean = new File("E:\\IdeaProjects\\senpure-sport\\senpure-sport-bean\\src\\main\\java");
        context.setJavaEventHandlerRootPath(data.getAbsolutePath());
        context.setJavaBeanCodeRootPath(bean.getAbsolutePath());
        context.setJavaMessageHandlerTemplate("consumerMessageHandler.ftl");
        context.setGenerateJavaBean(false);
        context.setGenerateJavaCSMessageHandler(false);
        context.setGenerateJavaSCMessageHandler(true);
        Executor executor = new Executor(context);
        executor.generate();
    }

    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();
        ExecutorTest test = new ExecutorTest();
        test.generate();
        test.client();
    }
}