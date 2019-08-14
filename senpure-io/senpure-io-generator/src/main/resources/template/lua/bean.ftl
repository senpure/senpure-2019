--[[
${sovereignty}
version   ${.now?datetime}
--]]

<#list namespaces as namespace>
    ${namespace} = ${namespace} or {}
</#list>

<#list enums as bean>
    <#include "enumField.ftl">
</#list>

<#list beans as bean>
    <#include "field.ftl">
</#list>

<#list messages as bean>
    <#include "field.ftl">
</#list>

<#list messages as bean>
    <#if bean.type == "SC">
     <#include "decoder.ftl">
    </#if>
</#list>
