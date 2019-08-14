package com.senpure.io.generator.model;


import com.senpure.io.generator.Constant;

public class Event extends Bean {
    private String javaHandlerPack;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getType() {
        return Constant.ENTITY_TYPE_EVENT;
    }
    @Override
    public String getJavaName() {
        return getName() + "Event";
    }

    public String getJavaHandlerName() {
        return getName() + "EventHandler";
    }


    public String getJavaHandlerPack() {
        return javaHandlerPack;
    }

    public void setJavaHandlerPack(String javaHandlerPack) {
        this.javaHandlerPack = javaHandlerPack;
    }



}
