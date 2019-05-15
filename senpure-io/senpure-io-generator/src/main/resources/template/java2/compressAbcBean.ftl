package ${javaPack};

<#list singleField?values as field>
    <#if !field.baseField>
        <#if field.bean.javaPack!=javaPack>
import ${field.bean.javaPack}.${field.classType};
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
 * </#if><#if fields?size gte 5>
 * <br><b><#list fields as field><#if field_index==0>index start:${field.index}</#if><#if !field_has_next> end:${field.index}</#if></#list></b>
 * </#if>
${sovereignty}
 * @time ${.now?datetime}
 */
public class ${name} extends  Bean {
<#include "compressAbcField.ftl">

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