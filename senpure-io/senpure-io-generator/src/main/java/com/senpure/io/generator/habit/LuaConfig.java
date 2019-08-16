package com.senpure.io.generator.habit;

/**
 * LuaConfig
 *
 * @author senpure
 * @time 2019-08-12 10:48:13
 */
public class LuaConfig {

    public final static String TYPE_MIX = "MIX";
    public final  static String TYPE_FILE = "FILE";
    public final  static String TYPE_NAMESPACE = "NAMESPACE";
    public String type = TYPE_MIX;
    /**
     * 合并
     */
    private String luaMixFileName = "protocol";

    private String luaProtocolCodeRootPath;
    private String luaProtocolCodeRootChooserPath;
    private String luaCSMessageHandlerCodeRootPath;
    private String luaCSMessageHandlerCodeRootChooserPath;
    private String luaSCMessageHandlerCodeRootPath;
    private String luaSCMessageHandlerCodeRootChooserPath;
    private String luaEventHandlerCodeRootPath;
    private String luaEventHandlerCodeRootChooserPath;
    private String luaProtocolTemplate = "protocol.ftl";
    private String luaRequireTemplate = "require.ftl";
    private String luaEnumTemplate = "enum.ftl";
    private String luaBeanTemplate = "bean.ftl";
    private String luaMessageTemplate = "message.ftl";
    private String luaEventTemplate = "event.ftl";
    private String luaCSMessageHandlerTemplate = "csMessageHandler.ftl";
    private String luaSCMessageHandlerTemplate = "scMessageHandler.ftl";
    private String luaEventHandlerTemplate = "eventHandler.ftl";


    private boolean appendNamespace=true;

    private boolean generateLuaRequire= true;
    private boolean generateLuaProtocol= true;
    private boolean generateLuaEnum = true;
    private boolean generateLuaBean = true;
    private boolean generateLuaEvent = true;
    private boolean generateLuaMessage = true;
    private boolean generateLuaEventHandler = true;
    private boolean generateLuaCSMessageHandler = true;
    private boolean generateLuaSCMessageHandler = false;

    private boolean luaRequireOverwrite = true;

    private boolean luaCSMessageHandlerOverwrite = false;
    private boolean luaSCMessageHandlerOverwrite = false;
    private boolean luaEventHandlerOverwrite = false;

    public String getLuaProtocolCodeRootPath() {
        return luaProtocolCodeRootPath;
    }

    public void setLuaProtocolCodeRootPath(String luaProtocolCodeRootPath) {
        this.luaProtocolCodeRootPath = luaProtocolCodeRootPath;
    }

    public String getLuaProtocolCodeRootChooserPath() {
        return luaProtocolCodeRootChooserPath;
    }

    public void setLuaProtocolCodeRootChooserPath(String luaProtocolCodeRootChooserPath) {
        this.luaProtocolCodeRootChooserPath = luaProtocolCodeRootChooserPath;
    }

    public String getLuaCSMessageHandlerCodeRootPath() {
        return luaCSMessageHandlerCodeRootPath;
    }

    public void setLuaCSMessageHandlerCodeRootPath(String luaCSMessageHandlerCodeRootPath) {
        this.luaCSMessageHandlerCodeRootPath = luaCSMessageHandlerCodeRootPath;
    }

    public String getLuaCSMessageHandlerCodeRootChooserPath() {
        return luaCSMessageHandlerCodeRootChooserPath;
    }

    public void setLuaCSMessageHandlerCodeRootChooserPath(String luaCSMessageHandlerCodeRootChooserPath) {
        this.luaCSMessageHandlerCodeRootChooserPath = luaCSMessageHandlerCodeRootChooserPath;
    }

    public String getLuaSCMessageHandlerCodeRootPath() {
        return luaSCMessageHandlerCodeRootPath;
    }

    public void setLuaSCMessageHandlerCodeRootPath(String luaSCMessageHandlerCodeRootPath) {
        this.luaSCMessageHandlerCodeRootPath = luaSCMessageHandlerCodeRootPath;
    }

    public String getLuaSCMessageHandlerCodeRootChooserPath() {
        return luaSCMessageHandlerCodeRootChooserPath;
    }

    public void setLuaSCMessageHandlerCodeRootChooserPath(String luaSCMessageHandlerCodeRootChooserPath) {
        this.luaSCMessageHandlerCodeRootChooserPath = luaSCMessageHandlerCodeRootChooserPath;
    }

    public String getLuaEventHandlerCodeRootPath() {
        return luaEventHandlerCodeRootPath;
    }

    public void setLuaEventHandlerCodeRootPath(String luaEventHandlerCodeRootPath) {
        this.luaEventHandlerCodeRootPath = luaEventHandlerCodeRootPath;
    }

    public String getLuaEventHandlerCodeRootChooserPath() {
        return luaEventHandlerCodeRootChooserPath;
    }

    public void setLuaEventHandlerCodeRootChooserPath(String luaEventHandlerCodeRootChooserPath) {
        this.luaEventHandlerCodeRootChooserPath = luaEventHandlerCodeRootChooserPath;
    }

    public String getLuaEnumTemplate() {
        return luaEnumTemplate;
    }

    public void setLuaEnumTemplate(String luaEnumTemplate) {
        this.luaEnumTemplate = luaEnumTemplate;
    }

    public String getLuaBeanTemplate() {
        return luaBeanTemplate;
    }

    public void setLuaBeanTemplate(String luaBeanTemplate) {
        this.luaBeanTemplate = luaBeanTemplate;
    }

    public String getLuaMessageTemplate() {
        return luaMessageTemplate;
    }

    public void setLuaMessageTemplate(String luaMessageTemplate) {
        this.luaMessageTemplate = luaMessageTemplate;
    }

    public String getLuaEventTemplate() {
        return luaEventTemplate;
    }

    public void setLuaEventTemplate(String luaEventTemplate) {
        this.luaEventTemplate = luaEventTemplate;
    }

    public String getLuaCSMessageHandlerTemplate() {
        return luaCSMessageHandlerTemplate;
    }

    public void setLuaCSMessageHandlerTemplate(String luaCSMessageHandlerTemplate) {
        this.luaCSMessageHandlerTemplate = luaCSMessageHandlerTemplate;
    }

    public String getLuaSCMessageHandlerTemplate() {
        return luaSCMessageHandlerTemplate;
    }

    public void setLuaSCMessageHandlerTemplate(String luaSCMessageHandlerTemplate) {
        this.luaSCMessageHandlerTemplate = luaSCMessageHandlerTemplate;
    }

    public String getLuaEventHandlerTemplate() {
        return luaEventHandlerTemplate;
    }

    public void setLuaEventHandlerTemplate(String luaEventHandlerTemplate) {
        this.luaEventHandlerTemplate = luaEventHandlerTemplate;
    }


    public boolean isLuaCSMessageHandlerOverwrite() {
        return luaCSMessageHandlerOverwrite;
    }

    public void setLuaCSMessageHandlerOverwrite(boolean luaCSMessageHandlerOverwrite) {
        this.luaCSMessageHandlerOverwrite = luaCSMessageHandlerOverwrite;
    }

    public boolean isLuaSCMessageHandlerOverwrite() {
        return luaSCMessageHandlerOverwrite;
    }

    public void setLuaSCMessageHandlerOverwrite(boolean luaSCMessageHandlerOverwrite) {
        this.luaSCMessageHandlerOverwrite = luaSCMessageHandlerOverwrite;
    }

    public boolean isLuaEventHandlerOverwrite() {
        return luaEventHandlerOverwrite;
    }

    public void setLuaEventHandlerOverwrite(boolean luaEventHandlerOverwrite) {
        this.luaEventHandlerOverwrite = luaEventHandlerOverwrite;
    }


    public boolean isGenerateLuaEnum() {
        return generateLuaEnum;
    }

    public void setGenerateLuaEnum(boolean generateLuaEnum) {
        this.generateLuaEnum = generateLuaEnum;
    }

    public boolean isGenerateLuaBean() {
        return generateLuaBean;
    }

    public void setGenerateLuaBean(boolean generateLuaBean) {
        this.generateLuaBean = generateLuaBean;
    }

    public boolean isGenerateLuaEvent() {
        return generateLuaEvent;
    }

    public void setGenerateLuaEvent(boolean generateLuaEvent) {
        this.generateLuaEvent = generateLuaEvent;
    }

    public boolean isGenerateLuaMessage() {
        return generateLuaMessage;
    }

    public void setGenerateLuaMessage(boolean generateLuaMessage) {
        this.generateLuaMessage = generateLuaMessage;
    }

    public boolean isGenerateLuaEventHandler() {
        return generateLuaEventHandler;
    }

    public void setGenerateLuaEventHandler(boolean generateLuaEventHandler) {
        this.generateLuaEventHandler = generateLuaEventHandler;
    }

    public boolean isGenerateLuaCSMessageHandler() {
        return generateLuaCSMessageHandler;
    }

    public void setGenerateLuaCSMessageHandler(boolean generateLuaCSMessageHandler) {
        this.generateLuaCSMessageHandler = generateLuaCSMessageHandler;
    }

    public boolean isGenerateLuaSCMessageHandler() {
        return generateLuaSCMessageHandler;
    }

    public void setGenerateLuaSCMessageHandler(boolean generateLuaSCMessageHandler) {
        this.generateLuaSCMessageHandler = generateLuaSCMessageHandler;
    }

    public String getLuaMixFileName() {
        return luaMixFileName;
    }

    public void setLuaMixFileName(String luaMixFileName) {
        this.luaMixFileName = luaMixFileName;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLuaProtocolTemplate() {
        return luaProtocolTemplate;
    }

    public void setLuaProtocolTemplate(String luaProtocolTemplate) {
        this.luaProtocolTemplate = luaProtocolTemplate;
    }

    public String getLuaRequireTemplate() {
        return luaRequireTemplate;
    }

    public void setLuaRequireTemplate(String luaRequireTemplate) {
        this.luaRequireTemplate = luaRequireTemplate;
    }

    public boolean isGenerateLuaRequire() {
        return generateLuaRequire;
    }

    public void setGenerateLuaRequire(boolean generateLuaRequire) {
        this.generateLuaRequire = generateLuaRequire;
    }

    public boolean isGenerateLuaProtocol() {
        return generateLuaProtocol;
    }

    public void setGenerateLuaProtocol(boolean generateLuaProtocol) {
        this.generateLuaProtocol = generateLuaProtocol;
    }

    public boolean isAppendNamespace() {
        return appendNamespace;
    }

    public void setAppendNamespace(boolean appendNamespace) {
        this.appendNamespace = appendNamespace;
    }

    public boolean isLuaRequireOverwrite() {
        return luaRequireOverwrite;
    }

    public void setLuaRequireOverwrite(boolean luaRequireOverwrite) {
        this.luaRequireOverwrite = luaRequireOverwrite;
    }
}
