package com.senpure.io.generator.model;

/**
 * Language
 *
 * @author senpure
 * @time 2019-08-12 10:28:04
 */
public class Language {

    protected  Bean bean;


    public Language(Bean bean) {
        this.bean = bean;
    }

    public String getName() {
        return bean.getJavaName();
    }


}
