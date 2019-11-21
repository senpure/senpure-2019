package ${javaPackage};

<#list singleField?values as field>
    <#if !field.baseField>
        <#if field.bean.javaPackage!=javaPackage>
import ${field.bean.javaPackage}.${field.bean.javaName};
        </#if>
    </#if>
</#list >
import com.senpure.io.protocol.Event;
import io.netty.buffer.ByteBuf;

<#list fields as field>
    <#if field.list>
import java.util.List;
import java.util.ArrayList;

        <#break>
    </#if>
</#list>
/**<#if hasExplain>
 * ${explain}
 * </#if>
 ${sovereignty}
 * @time ${.now?datetime}
 */
<#assign name>${javaName}</#assign>
public class ${name} extends  Event {

    public static final int EVENT_ID = ${id?c};
<#include "compressField.ftl">

    @Override
    public int getEventId() {
        return ${id?c};
    }
<#include "toString.ftl">
}