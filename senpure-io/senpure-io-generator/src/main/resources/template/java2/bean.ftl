package ${javaPackage};

<#list singleField?values as field>
    <#if !field.baseField>
        <#if field.bean.javaPackage!=javaPackage>
import ${field.bean.javaPackage}.${field.fieldType};
        </#if>
    </#if>
</#list >
import com.senpure.io.protocol.Bean;
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
public class ${name} extends  Bean {
<#include "compressField.ftl">

    @Override
    public String toString() {
        return "${name}<#if type!="NA">[${id?c}]</#if>{"
<#list fields as field>
                +"<#if field_index gt 0>,</#if>${field.name}=" + ${field.name}
</#list>
                + "}";
   }
<#include "toString.ftl">
}