package com.senpure.io.generator.habit;

/**
 * ProjectConfig
 *
 * @author senpure
 * @time 2019-07-08 14:51:35
 */
public class ProjectConfig {

    private String projectName;

    private String javaCodeRootPath;
    private String javaCodeRootChooserPath;

    private String javaBeanCodeRootPath;
    private String javaBeanCodeRootChooserPath;


    private String messageChooserPath;
    private String messageDirectoryChooserPath;


    private String javaBeanTemplate = "bean.ftl";
    private String javaMessageTemplate = "message.ftl";

    private String javaMessageHandlerTemplate = "messageHandler.ftl";
    private boolean javaMessageHandlerCover = false;

    private String javaEventTemplate = "event.ftl";
    private String javaEnumTemplate = "enum.ftl";
    private String javaEventHandlerTemplate = "eventHandler.ftl";
    private boolean javaEventHandlerCover = false;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public void setJavaMessageHandlerCover(boolean javaMessageHandlerCover) {
        this.javaMessageHandlerCover = javaMessageHandlerCover;
    }

    public String getJavaEventTemplate() {
        return javaEventTemplate;
    }

    public void setJavaEventTemplate(String javaEventTemplate) {
        this.javaEventTemplate = javaEventTemplate;
    }

    public String getJavaEnumTemplate() {
        return javaEnumTemplate;
    }

    public void setJavaEnumTemplate(String javaEnumTemplate) {
        this.javaEnumTemplate = javaEnumTemplate;
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

    public String getJavaCodeRootChooserPath() {
        return javaCodeRootChooserPath;
    }

    public void setJavaCodeRootChooserPath(String javaCodeRootChooserPath) {
        this.javaCodeRootChooserPath = javaCodeRootChooserPath;
    }

    public String getJavaBeanCodeRootChooserPath() {
        return javaBeanCodeRootChooserPath;
    }

    public void setJavaBeanCodeRootChooserPath(String javaBeanCodeRootChooserPath) {
        this.javaBeanCodeRootChooserPath = javaBeanCodeRootChooserPath;
    }

    public String getMessageChooserPath() {
        return messageChooserPath;
    }

    public void setMessageChooserPath(String messageChooserPath) {
        this.messageChooserPath = messageChooserPath;
    }

    public String getMessageDirectoryChooserPath() {
        return messageDirectoryChooserPath;
    }

    public void setMessageDirectoryChooserPath(String messageDirectoryChooserPath) {
        this.messageDirectoryChooserPath = messageDirectoryChooserPath;
    }
}
