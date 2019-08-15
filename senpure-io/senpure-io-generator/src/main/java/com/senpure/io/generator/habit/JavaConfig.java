package com.senpure.io.generator.habit;

/**
 * JavaConfig
 *
 * @author senpure
 * @time 2019-07-09 17:00:01
 */
public class JavaConfig {
    private String javaProtocolCodeRootPath;
    private String javaProtocolCodeRootChooserPath;
    private String javaCSMessageHandlerCodeRootPath;
    private String javaCSMessageHandlerCodeRootChooserPath;
    private String javaSCMessageHandlerCodeRootPath;
    private String javaSCMessageHandlerCodeRootChooserPath;
    private String javaEventHandlerCodeRootPath;
    private String javaEventHandlerCodeRootChooserPath;

    private String javaEnumTemplate = "enum.ftl";
    private String javaBeanTemplate = "bean.ftl";
    private String javaMessageTemplate = "message.ftl";
    private String javaEventTemplate = "event.ftl";
    private String javaCSMessageHandlerTemplate = "messageHandler.ftl";
    private String javaSCMessageHandlerTemplate = "consumerMessageHandler.ftl";
    private String javaEventHandlerTemplate = "eventHandler.ftl";

    private boolean generateJavaEnum = true;
    private boolean generateJavaBean = true;
    private boolean generateJavaEvent = true;
    private boolean generateJavaMessage = true;
    private boolean generateJavaEventHandler = true;
    private boolean generateJavaCSMessageHandler = true;
    private boolean generateJavaSCMessageHandler = false;

    private boolean javaCSMessageHandlerOverwrite = false;
    private boolean javaSCMessageHandlerOverwrite = false;
    private boolean javaEventHandlerOverwrite = false;

    public String getJavaEventHandlerCodeRootPath() {
        return javaEventHandlerCodeRootPath;
    }

    public void setJavaEventHandlerCodeRootPath(String javaEventHandlerCodeRootPath) {
        this.javaEventHandlerCodeRootPath = javaEventHandlerCodeRootPath;
    }

    public String getJavaProtocolCodeRootPath() {
        return javaProtocolCodeRootPath;
    }

    public void setJavaProtocolCodeRootPath(String javaProtocolCodeRootPath) {
        this.javaProtocolCodeRootPath = javaProtocolCodeRootPath;
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

    public String getJavaCSMessageHandlerTemplate() {
        return javaCSMessageHandlerTemplate;
    }

    public void setJavaCSMessageHandlerTemplate(String javaCSMessageHandlerTemplate) {
        this.javaCSMessageHandlerTemplate = javaCSMessageHandlerTemplate;
    }

    public boolean isJavaCSMessageHandlerOverwrite() {
        return javaCSMessageHandlerOverwrite;
    }

    public void setJavaCSMessageHandlerOverwrite(boolean javaCSMessageHandlerOverwrite) {
        this.javaCSMessageHandlerOverwrite = javaCSMessageHandlerOverwrite;
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

    public boolean isJavaEventHandlerOverwrite() {
        return javaEventHandlerOverwrite;
    }

    public void setJavaEventHandlerOverwrite(boolean javaEventHandlerOverwrite) {
        this.javaEventHandlerOverwrite = javaEventHandlerOverwrite;
    }

    public String getJavaEventHandlerCodeRootChooserPath() {
        return javaEventHandlerCodeRootChooserPath;
    }

    public void setJavaEventHandlerCodeRootChooserPath(String javaEventHandlerCodeRootChooserPath) {
        this.javaEventHandlerCodeRootChooserPath = javaEventHandlerCodeRootChooserPath;
    }

    public String getJavaProtocolCodeRootChooserPath() {
        return javaProtocolCodeRootChooserPath;
    }

    public void setJavaProtocolCodeRootChooserPath(String javaProtocolCodeRootChooserPath) {
        this.javaProtocolCodeRootChooserPath = javaProtocolCodeRootChooserPath;
    }

    public boolean isGenerateJavaEnum() {
        return generateJavaEnum;
    }

    public void setGenerateJavaEnum(boolean generateJavaEnum) {
        this.generateJavaEnum = generateJavaEnum;
    }

    public boolean isGenerateJavaBean() {
        return generateJavaBean;
    }

    public void setGenerateJavaBean(boolean generateJavaBean) {
        this.generateJavaBean = generateJavaBean;
    }

    public boolean isGenerateJavaEvent() {
        return generateJavaEvent;
    }

    public void setGenerateJavaEvent(boolean generateJavaEvent) {
        this.generateJavaEvent = generateJavaEvent;
    }

    public boolean isGenerateJavaMessage() {
        return generateJavaMessage;
    }

    public void setGenerateJavaMessage(boolean generateJavaMessage) {
        this.generateJavaMessage = generateJavaMessage;
    }

    public boolean isGenerateJavaEventHandler() {
        return generateJavaEventHandler;
    }

    public void setGenerateJavaEventHandler(boolean generateJavaEventHandler) {
        this.generateJavaEventHandler = generateJavaEventHandler;
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

    public String getJavaSCMessageHandlerTemplate() {
        return javaSCMessageHandlerTemplate;
    }

    public void setJavaSCMessageHandlerTemplate(String javaSCMessageHandlerTemplate) {
        this.javaSCMessageHandlerTemplate = javaSCMessageHandlerTemplate;
    }

    public boolean isJavaSCMessageHandlerOverwrite() {
        return javaSCMessageHandlerOverwrite;
    }

    public void setJavaSCMessageHandlerOverwrite(boolean javaSCMessageHandlerOverwrite) {
        this.javaSCMessageHandlerOverwrite = javaSCMessageHandlerOverwrite;
    }

    public String getJavaCSMessageHandlerCodeRootPath() {
        return javaCSMessageHandlerCodeRootPath;
    }

    public void setJavaCSMessageHandlerCodeRootPath(String javaCSMessageHandlerCodeRootPath) {
        this.javaCSMessageHandlerCodeRootPath = javaCSMessageHandlerCodeRootPath;
    }

    public String getJavaCSMessageHandlerCodeRootChooserPath() {
        return javaCSMessageHandlerCodeRootChooserPath;
    }

    public void setJavaCSMessageHandlerCodeRootChooserPath(String javaCSMessageHandlerCodeRootChooserPath) {
        this.javaCSMessageHandlerCodeRootChooserPath = javaCSMessageHandlerCodeRootChooserPath;
    }

    public String getJavaSCMessageHandlerCodeRootPath() {
        return javaSCMessageHandlerCodeRootPath;
    }

    public void setJavaSCMessageHandlerCodeRootPath(String javaSCMessageHandlerCodeRootPath) {
        this.javaSCMessageHandlerCodeRootPath = javaSCMessageHandlerCodeRootPath;
    }


    public String getJavaSCMessageHandlerCodeRootChooserPath() {
        return javaSCMessageHandlerCodeRootChooserPath;
    }

    public void setJavaSCMessageHandlerCodeRootChooserPath(String javaSCMessageHandlerCodeRootChooserPath) {
        this.javaSCMessageHandlerCodeRootChooserPath = javaSCMessageHandlerCodeRootChooserPath;
    }
}
