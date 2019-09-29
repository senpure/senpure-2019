package com.senpure.io.generator.model;

import com.senpure.io.generator.Constant;

/**
 * Language
 *
 * @author senpure
 * @time 2019-08-12 10:28:04
 */
public class Language {

    protected Bean bean;

    private String namespace;


    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Language(Bean bean) {
        this.bean = bean;
    }

    public String getName() {
        if (bean.getType().equals(Constant.ENTITY_TYPE_BEAN)) {
            return bean.getName();
        }
        return bean.getJavaName();
    }


}
