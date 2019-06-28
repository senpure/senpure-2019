package com.senpure.io.generator;

/**
 * Constant
 *
 * @author senpure
 * @time 2019-05-15 14:56:33
 */
public class Constant {

    public final static String ENTITY_TYPE_CS_MESSAGE = "CS";
    public final static String ENTITY_TYPE_SC_MESSAGE = "SC";
    public final static String ENTITY_TYPE_BEAN = "NA";
    public final static String ENTITY_TYPE_EVENT = "ET";
    public final static String ENTITY_TYPE_ENUM = "EM";


    public static String JAVA_PACK_BEAN = "bean";
    public static String JAVA_PACK_ENUM = "bean";
    public static String JAVA_PACK_MESSAGE = "getValue";
    public static String JAVA_PACK_HANDLER = "getValue.handler";
    public static String JAVA_PACK_EVENT= "event";
    public static String JAVA_PACK_EVENT_HANDLER= "event.handler";

    public static String LUA_NAMESPACE_PREFIX = "Net_";
    public static String LUA_NAMESPACE_BEAN_SUFFIX = "_Bean_";
    public static String LUA_NAMESPACE_CS_SUFFIX = "_Req_";
    public static String LUA_NAMESPACE_SC_SUFFIX = "_Res_";

    public static String LUA_IMPL_SC_PREFIX = "Res_";

}
