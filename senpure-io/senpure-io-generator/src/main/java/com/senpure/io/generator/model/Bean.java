package com.senpure.io.generator.model;

import com.senpure.io.generator.Constant;
import com.senpure.template.sovereignty.TemplateBean;

import java.util.*;


public class Bean extends TemplateBean {


    private String name;
    //命名空间独立于语言,同一个命名空间name必须唯一
    private String namespace;
    private String originalName;
    //java模块包名
    private String pack;
    private String model;
    //所在的java包
    private String javaPack;


    private String luaNamespace = "";
    private List<Field> fields = new ArrayList<>();
    private boolean hasExplain;
    private String explain;
    //引用其他的去重
    private Map<String, Field> singleField = new HashMap<>();
    //是否包含其他bean
    private boolean hasBean = false;

    //字段的长度格式化toString使用
    private int fieldMaxLen = 0;
    private boolean generate = true;


    public String getJavaName() {
        return getName();
    }

    public String getType() {
        return Constant.ENTITY_TYPE_BEAN;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }


    public boolean isHasExplain() {
        return hasExplain;
    }


    public String getExplain() {
        return explain;
    }

    public Map<String, Field> getSingleField() {
        return singleField;
    }

    public void setSingleField(Map<String, Field> singleField) {
        this.singleField = singleField;
    }

    public void setExplain(String explain) {
        this.explain = explain;
        if (explain != null && explain.trim().length() > 0) {
            hasExplain = true;
        }
    }

    public boolean isHasBean() {
        return hasBean;
    }

    public void setHasBean(boolean hasBean) {
        this.hasBean = hasBean;
    }

    public int getFieldMaxLen() {
        return fieldMaxLen;
    }

    public void setFieldMaxLen(int fieldMaxLen) {
        this.fieldMaxLen = fieldMaxLen;
    }

    public boolean isGenerate() {
        return generate;
    }

    public void setGenerate(boolean generate) {
        this.generate = generate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getJavaPack() {
        return javaPack;
    }

    public void setJavaPack(String javaPack) {
        this.javaPack = javaPack;
    }


    public String getLuaNamespace() {
        return luaNamespace;
    }

    public void setLuaNamespace(String luaNamespace) {
        this.luaNamespace = luaNamespace;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bean bean = (Bean) o;
        return Objects.equals(getName(), bean.getName()) &&
                Objects.equals(getType(), bean.getType()) &&
                Objects.equals(getPack(), bean.getPack()) &&
                Objects.equals(getModel(), bean.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType(), getPack(), getModel());
    }

    @Override
    public String toString() {
        return "Bean{" +
                "type='" + getType() + '\'' +
                ",name='" + name + '\'' +
                ", pack='" + pack + '\'' +
                '}';
    }
}
