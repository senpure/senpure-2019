<#assign baseFieldTypeList=["int", "long", "sint", "slong", "fixed32", "fixed64", "float", "double","boolean","string","String"] />

<#assign baseFieldTypeSpecialMap = {"int":"var32", "long": "var64", "byte": "var32", "short": "var32"} />

<#function baseFieldType2MethodName fieldType>
    <#local temp>${baseFieldTypeSpecialMap[fieldType]!fieldType}</#local>
    <#return temp?cap_first>
</#function>