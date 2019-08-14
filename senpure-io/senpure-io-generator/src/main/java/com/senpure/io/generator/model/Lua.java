package com.senpure.io.generator.model;

/**
 * Lua
 *
 * @author senpure
 * @time 2019-08-12 10:21:03
 */
public class Lua extends Language {


    public Lua(Bean bean) {
        super(bean);
    }

    private String namespace;


    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
