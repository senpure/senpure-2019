package com.senpure.io.generator.habit;

/**
 * ScriptLanguageConfig
 *
 * @author senpure
 * @time 2019-09-23 11:43:44
 */
public abstract class ScriptLanguageConfig implements LanguageConfig {
    public final static String TYPE_MIX = "MIX";
    public final static String TYPE_FILE = "FILE";
    public final static String TYPE_NAMESPACE = "NAMESPACE";



    private String type = TYPE_MIX;
    /**
     * 合并
     */
    private String mixFileName = "protocol";

    private String protocolCodeRootPath;
    private String protocolCodeRootChooserPath;
    private String csMessageHandlerCodeRootPath;
    private String csMessageHandlerCodeRootChooserPath;
    private String scMessageHandlerCodeRootPath;
    private String scMessageHandlerCodeRootChooserPath;
    private String eventHandlerCodeRootPath;
    private String eventHandlerCodeRootChooserPath;
    private String protocolTemplate = "protocol.ftl";
    private String requireTemplate = "require.ftl";
    private String enumTemplate = "enum.ftl";
    private String beanTemplate = "bean.ftl";
    private String messageTemplate = "message.ftl";
    private String eventTemplate = "event.ftl";
    private String csMessageHandlerTemplate = "csMessageHandler.ftl";
    private String scMessageHandlerTemplate = "scMessageHandler.ftl";
    private String eventHandlerTemplate = "eventHandler.ftl";


    private boolean appendNamespace = false;

    private boolean generateRequire = true;
    private boolean generateProtocol = true;
    private boolean generateEnum = true;
    private boolean generateBean = true;
    private boolean generateEvent = true;
    private boolean generateMessage = true;
    private boolean generateEventHandler = true;
    private boolean generateCSMessageHandler = true;
    private boolean generateSCMessageHandler = false;

    private boolean requireOverwrite = true;

    private boolean csMessageHandlerOverwrite = false;
    private boolean scMessageHandlerOverwrite = false;
    private boolean eventHandlerOverwrite = false;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMixFileName() {
        return mixFileName;
    }

    public void setMixFileName(String mixFileName) {
        this.mixFileName = mixFileName;
    }

    public String getProtocolCodeRootPath() {
        return protocolCodeRootPath;
    }

    public void setProtocolCodeRootPath(String protocolCodeRootPath) {
        this.protocolCodeRootPath = protocolCodeRootPath;
    }

    public String getProtocolCodeRootChooserPath() {
        return protocolCodeRootChooserPath;
    }

    public void setProtocolCodeRootChooserPath(String protocolCodeRootChooserPath) {
        this.protocolCodeRootChooserPath = protocolCodeRootChooserPath;
    }

    public String getCsMessageHandlerCodeRootPath() {
        return csMessageHandlerCodeRootPath;
    }

    public void setCsMessageHandlerCodeRootPath(String csMessageHandlerCodeRootPath) {
        this.csMessageHandlerCodeRootPath = csMessageHandlerCodeRootPath;
    }

    public String getCsMessageHandlerCodeRootChooserPath() {
        return csMessageHandlerCodeRootChooserPath;
    }

    public void setCsMessageHandlerCodeRootChooserPath(String csMessageHandlerCodeRootChooserPath) {
        this.csMessageHandlerCodeRootChooserPath = csMessageHandlerCodeRootChooserPath;
    }

    public String getScMessageHandlerCodeRootPath() {
        return scMessageHandlerCodeRootPath;
    }

    public void setScMessageHandlerCodeRootPath(String scMessageHandlerCodeRootPath) {
        this.scMessageHandlerCodeRootPath = scMessageHandlerCodeRootPath;
    }

    public String getScMessageHandlerCodeRootChooserPath() {
        return scMessageHandlerCodeRootChooserPath;
    }

    public void setScMessageHandlerCodeRootChooserPath(String scMessageHandlerCodeRootChooserPath) {
        this.scMessageHandlerCodeRootChooserPath = scMessageHandlerCodeRootChooserPath;
    }

    public String getEventHandlerCodeRootPath() {
        return eventHandlerCodeRootPath;
    }

    public void setEventHandlerCodeRootPath(String eventHandlerCodeRootPath) {
        this.eventHandlerCodeRootPath = eventHandlerCodeRootPath;
    }

    public String getEventHandlerCodeRootChooserPath() {
        return eventHandlerCodeRootChooserPath;
    }

    public void setEventHandlerCodeRootChooserPath(String eventHandlerCodeRootChooserPath) {
        this.eventHandlerCodeRootChooserPath = eventHandlerCodeRootChooserPath;
    }

    public String getProtocolTemplate() {
        return protocolTemplate;
    }

    public void setProtocolTemplate(String protocolTemplate) {
        this.protocolTemplate = protocolTemplate;
    }

    public String getRequireTemplate() {
        return requireTemplate;
    }

    public void setRequireTemplate(String requireTemplate) {
        this.requireTemplate = requireTemplate;
    }

    public String getEnumTemplate() {
        return enumTemplate;
    }

    public void setEnumTemplate(String enumTemplate) {
        this.enumTemplate = enumTemplate;
    }

    public String getBeanTemplate() {
        return beanTemplate;
    }

    public void setBeanTemplate(String beanTemplate) {
        this.beanTemplate = beanTemplate;
    }

    public String getMessageTemplate() {
        return messageTemplate;
    }

    public void setMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public String getEventTemplate() {
        return eventTemplate;
    }

    public void setEventTemplate(String eventTemplate) {
        this.eventTemplate = eventTemplate;
    }

    public String getCsMessageHandlerTemplate() {
        return csMessageHandlerTemplate;
    }

    public void setCsMessageHandlerTemplate(String csMessageHandlerTemplate) {
        this.csMessageHandlerTemplate = csMessageHandlerTemplate;
    }

    public String getScMessageHandlerTemplate() {
        return scMessageHandlerTemplate;
    }

    public void setScMessageHandlerTemplate(String scMessageHandlerTemplate) {
        this.scMessageHandlerTemplate = scMessageHandlerTemplate;
    }

    public String getEventHandlerTemplate() {
        return eventHandlerTemplate;
    }

    public void setEventHandlerTemplate(String eventHandlerTemplate) {
        this.eventHandlerTemplate = eventHandlerTemplate;
    }

    public boolean isAppendNamespace() {
        return appendNamespace;
    }

    public void setAppendNamespace(boolean appendNamespace) {
        this.appendNamespace = appendNamespace;
    }

    public boolean isGenerateRequire() {
        return generateRequire;
    }

    public void setGenerateRequire(boolean generateRequire) {
        this.generateRequire = generateRequire;
    }

    public boolean isGenerateProtocol() {
        return generateProtocol;
    }

    public void setGenerateProtocol(boolean generateProtocol) {
        this.generateProtocol = generateProtocol;
    }

    public boolean isGenerateEnum() {
        return generateEnum;
    }

    public void setGenerateEnum(boolean generateEnum) {
        this.generateEnum = generateEnum;
    }

    public boolean isGenerateBean() {
        return generateBean;
    }

    public void setGenerateBean(boolean generateBean) {
        this.generateBean = generateBean;
    }

    public boolean isGenerateEvent() {
        return generateEvent;
    }

    public void setGenerateEvent(boolean generateEvent) {
        this.generateEvent = generateEvent;
    }

    public boolean isGenerateMessage() {
        return generateMessage;
    }

    public void setGenerateMessage(boolean generateMessage) {
        this.generateMessage = generateMessage;
    }

    public boolean isGenerateEventHandler() {
        return generateEventHandler;
    }

    public void setGenerateEventHandler(boolean generateEventHandler) {
        this.generateEventHandler = generateEventHandler;
    }

    public boolean isGenerateCSMessageHandler() {
        return generateCSMessageHandler;
    }

    public void setGenerateCSMessageHandler(boolean generateCSMessageHandler) {
        this.generateCSMessageHandler = generateCSMessageHandler;
    }

    public boolean isGenerateSCMessageHandler() {
        return generateSCMessageHandler;
    }

    public void setGenerateSCMessageHandler(boolean generateSCMessageHandler) {
        this.generateSCMessageHandler = generateSCMessageHandler;
    }

    public boolean isRequireOverwrite() {
        return requireOverwrite;
    }

    public void setRequireOverwrite(boolean requireOverwrite) {
        this.requireOverwrite = requireOverwrite;
    }

    public boolean isCsMessageHandlerOverwrite() {
        return csMessageHandlerOverwrite;
    }

    public void setCsMessageHandlerOverwrite(boolean csMessageHandlerOverwrite) {
        this.csMessageHandlerOverwrite = csMessageHandlerOverwrite;
    }

    public boolean isScMessageHandlerOverwrite() {
        return scMessageHandlerOverwrite;
    }

    public void setScMessageHandlerOverwrite(boolean scMessageHandlerOverwrite) {
        this.scMessageHandlerOverwrite = scMessageHandlerOverwrite;
    }

    public boolean isEventHandlerOverwrite() {
        return eventHandlerOverwrite;
    }

    public void setEventHandlerOverwrite(boolean eventHandlerOverwrite) {
        this.eventHandlerOverwrite = eventHandlerOverwrite;
    }
}
