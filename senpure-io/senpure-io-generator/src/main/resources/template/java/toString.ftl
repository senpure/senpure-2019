
<#list fields as field>
<#if field.list>
<#assign hasNextIndent= true>
<#break >
</#if>
</#list>

    @Override
    public String toString(String indent) {
<#if hasBean||hasNextIndent!false>
        //${fieldMaxLen} + 3 = ${fieldMaxLen+3} 个空格
        String nextIndent ="<#list 1..fieldMaxLen+3 as i> </#list>";
</#if>
<#if fields?size gt 0>
        //最长字段长度 ${fieldMaxLen}
        int filedPad = ${fieldMaxLen};
</#if>
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("${name}")<#if type!="NA">.append("[${id?c}]")</#if>.append("{");
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list>
        sb.append("\n");
        sb.append(indent).append(rightPad("${field.name}", filedPad)).append(" = ");
        int ${field.name}Size = ${field.name}.size();
        if (${field.name}Size > 0) {
            sb.append("[");
            for (int i = 0; i<${field.name}Size;i++) {
                sb.append("\n");
        <#if field.baseField||field.bean.enum>>
                sb.append(nextIndent);
                sb.append(indent).append(${field.name}.get(i));
        <#else>
                sb.append(nextIndent);
                sb.append(indent).append(${field.name}.get(i).toString(indent + nextIndent));
        </#if>
            }
            sb.append("\n");
            sb.append(nextIndent);
            sb.append(indent).append("]");
        }else {
            sb.append("null");
        }

    <#else >
        sb.append("\n");
        <#if field.baseField>
        sb.append(indent).append(rightPad("${field.name}", filedPad)).append(" = ").append(${field.name});
        <#else>
        sb.append(indent).append(rightPad("${field.name}", filedPad)).append(" = ");
        if(${field.name}!=null){
            <#if field.bean.enum>
            sb.append(${field.name});
                <#else >
            sb.append(${field.name}.toString(indent+nextIndent));
                </#if>
        } else {
            sb.append("null");
        }
        </#if>
    </#if>
</#list>
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

