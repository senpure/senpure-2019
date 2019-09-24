//${sovereignty}
///<reference path="../@types/io.d.ts"/>
<#list namespaces as namespace>
declare namespace ${namespace}{
    <#list messages as bean>
        <#if bean.js.namespace = namespace>
            <#if bean.type="SC">
    namespace ${bean.js.name}{
        class MessageDecoder extends io.MessageDecoder {
        }
    }
            </#if>
    class ${bean.js.name}  extends io.Message {
        static MESSAGE_ID: number;
        constructor();
    }
        </#if>
    </#list>
}
</#list>
<#list beans as bean>
</#list>
