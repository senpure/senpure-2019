package com.senpure.io.generator.executor;

import com.senpure.io.generator.habit.JavaConfig;
import com.senpure.io.generator.habit.LuaConfig;
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

    private String projectName;
    private String javaTemplateDir = "java";
    private String luaTemplateDir = "lua";
    private JavaConfig javaConfig;
    private LuaConfig luaConfig;



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


    public String getJavaTemplateDir() {
        return javaTemplateDir;
    }

    public void setJavaTemplateDir(String javaTemplateDir) {
        this.javaTemplateDir = javaTemplateDir;
    }

    public JavaConfig getJavaConfig() {
        return javaConfig;
    }

    public void setJavaConfig(JavaConfig javaConfig) {
        this.javaConfig = javaConfig;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLuaTemplateDir() {
        return luaTemplateDir;
    }

    public void setLuaTemplateDir(String luaTemplateDir) {
        this.luaTemplateDir = luaTemplateDir;
    }

    public LuaConfig getLuaConfig() {
        return luaConfig;
    }

    public void setLuaConfig(LuaConfig luaConfig) {
        this.luaConfig = luaConfig;
    }
}
