package com.senpure.io.generator.executer;

import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * ExecutorContext
 *
 * @author senpure
 * @time 2019-06-11 16:03:02
 */
public class ExecutorContext {

    private List<Message> messages = new ArrayList<>(128);
    private List<Bean> beans = new ArrayList<>(128);
    private List<Event> events = new ArrayList<>(128);
    private List<Enum> enums = new ArrayList<>(128);

    private String javaTemplateDir = "java";
    private boolean generateJavaBean = true;
    private boolean generateJavaMessage = true;

    private boolean generateJavaMessageHandler = true;
    private boolean generateJavaCSMessageHandler = true;
    private boolean generateJavaSCMessageHandler = false;
    private boolean generateJavaEvent = true;
    private boolean generateJavaEventHandler = true;

    private String javaCodeRootPath;


    private String javaBeanCodeRootPath;
    private String javaBeanTemplate = "bean.ftl";
    private String javaMessageTemplate = "getValue.ftl";
    private String javaMessageHandlerTemplate = "messageHandler.ftl";
    private boolean javaMessageHandlerCover = false;

    private String javaEventTemplate = "event.ftl";
    private String javaEnumTemplate = "enum.ftl";
    private String javaEventHandlerTemplate = "eventHandler.ftl";
    private boolean javaEventHandlerCover = false;


    public void addBean(Bean bean) {
        this.beans.add(bean);
    }

    public void addBeans(List<Bean> beans) {
        this.beans.addAll(beans);
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void addMessages(List<Message> messages) {
        this.messages.addAll(messages);
    }

    public void addEnum(Enum anEnum) {
        this.enums.add(anEnum);
    }

    public void addEnums(List<Enum> enums) {
        this.enums.addAll(enums);
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void addEvents(List<Event> events) {
        this.events.addAll(events);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Bean> getBeans() {
        return beans;
    }

    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Enum> getEnums() {
        return enums;
    }

    public void setEnums(List<Enum> enums) {
        this.enums = enums;
    }

    public boolean isGenerateJavaBean() {
        return generateJavaBean;
    }

    public void setGenerateJavaBean(boolean generateJavaBean) {
        this.generateJavaBean = generateJavaBean;
    }

    public boolean isGenerateJavaMessage() {
        return generateJavaMessage;
    }

    public void setGenerateJavaMessage(boolean generateJavaMessage) {
        this.generateJavaMessage = generateJavaMessage;
    }

    public boolean isGenerateJavaMessageHandler() {
        return generateJavaMessageHandler;
    }

    public void setGenerateJavaMessageHandler(boolean generateJavaMessageHandler) {
        this.generateJavaMessageHandler = generateJavaMessageHandler;
    }

    public boolean isGenerateJavaEvent() {
        return generateJavaEvent;
    }

    public void setGenerateJavaEvent(boolean generateJavaEvent) {
        this.generateJavaEvent = generateJavaEvent;
    }

    public boolean isGenerateJavaEventHandler() {
        return generateJavaEventHandler;
    }

    public void setGenerateJavaEventHandler(boolean generateJavaEventHandler) {
        this.generateJavaEventHandler = generateJavaEventHandler;
    }

    public String getJavaCodeRootPath() {
        return javaCodeRootPath;
    }

    public void setJavaCodeRootPath(String javaCodeRootPath) {
        this.javaCodeRootPath = javaCodeRootPath;
    }

    public String getJavaBeanCodeRootPath() {
        return javaBeanCodeRootPath;
    }

    public void setJavaBeanCodeRootPath(String javaBeanCodeRootPath) {
        this.javaBeanCodeRootPath = javaBeanCodeRootPath;
    }

    public String getJavaBeanTemplate() {
        return javaBeanTemplate;
    }

    public void setJavaBeanTemplate(String javaBeanTemplate) {
        this.javaBeanTemplate = javaBeanTemplate;
    }

    public String getJavaMessageTemplate() {
        return javaMessageTemplate;
    }

    public void setJavaMessageTemplate(String javaMessageTemplate) {
        this.javaMessageTemplate = javaMessageTemplate;
    }

    public String getJavaMessageHandlerTemplate() {
        return javaMessageHandlerTemplate;
    }

    public void setJavaMessageHandlerTemplate(String javaMessageHandlerTemplate) {
        this.javaMessageHandlerTemplate = javaMessageHandlerTemplate;
    }

    public boolean isJavaMessageHandlerCover() {
        return javaMessageHandlerCover;
    }

    public String getJavaEnumTemplate() {
        return javaEnumTemplate;
    }

    public void setJavaEnumTemplate(String javaEnumTemplate) {
        this.javaEnumTemplate = javaEnumTemplate;
    }

    public void setJavaMessageHandlerCover(boolean javaMessageHandlerCover) {
        this.javaMessageHandlerCover = javaMessageHandlerCover;
    }

    public String getJavaEventTemplate() {
        return javaEventTemplate;
    }

    public void setJavaEventTemplate(String javaEventTemplate) {
        this.javaEventTemplate = javaEventTemplate;
    }

    public String getJavaEventHandlerTemplate() {
        return javaEventHandlerTemplate;
    }

    public void setJavaEventHandlerTemplate(String javaEventHandlerTemplate) {
        this.javaEventHandlerTemplate = javaEventHandlerTemplate;
    }

    public boolean isJavaEventHandlerCover() {
        return javaEventHandlerCover;
    }

    public void setJavaEventHandlerCover(boolean javaEventHandlerCover) {
        this.javaEventHandlerCover = javaEventHandlerCover;
    }

    public String getJavaTemplateDir() {
        return javaTemplateDir;
    }

    public void setJavaTemplateDir(String javaTemplateDir) {
        this.javaTemplateDir = javaTemplateDir;
    }

    public boolean isGenerateJavaCSMessageHandler() {
        return generateJavaCSMessageHandler;
    }

    public void setGenerateJavaCSMessageHandler(boolean generateJavaCSMessageHandler) {
        this.generateJavaCSMessageHandler = generateJavaCSMessageHandler;
    }

    public boolean isGenerateJavaSCMessageHandler() {
        return generateJavaSCMessageHandler;
    }

    public void setGenerateJavaSCMessageHandler(boolean generateJavaSCMessageHandler) {
        this.generateJavaSCMessageHandler = generateJavaSCMessageHandler;
    }
}
