package com.senpure.io.generator.model;


import com.senpure.io.generator.Constant;

public class Event extends Bean {
    private String handlerJavaPack;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getJavaName() {
        return getType() + getName() + "Event";
    }
    public String getJavaHandlerName() {
        return getType() + getName() + "EventHandler";
    }
    @Override
    public String getType() {
        return Constant.ENTITY_TYPE_EVENT;
    }

    public String getHandlerJavaPack() {
        return handlerJavaPack;
    }

    public void setHandlerJavaPack(String handlerJavaPack) {
        this.handlerJavaPack = handlerJavaPack;
    }
}
