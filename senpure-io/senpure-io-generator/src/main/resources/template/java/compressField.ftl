<#global "int"="Integer"/>
<#include "method.ftl"/>
<#list fields as field>
<#if field.hasExplain>
    //${field.explain}
</#if>
<#if field.list >
    private List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
<#else>
    <#if !field.baseField&&field.bean.enum>
    private ${field.javaType} ${field.name} = ${field.bean.javaName}.${field.bean.defaultField.name};
        <#else >
    private ${field.javaType} ${field.name};
    </#if>
</#if>
</#list>

    public void copy(${javaName} from) {
<#list fields as field>
    <#if field.list >
        this.${field.name}.clear();
        <#if field.baseField ||field.bean.enum>
        this.${field.name}.addAll(from.get${field.name?cap_first}());
        <#else >
        for (int i = 0; i < from.get${field.name?cap_first}().size(); i++) {
            ${field.javaType} ${lowerCamelCase(field.javaType)} = new ${field.javaType}();
            ${lowerCamelCase(field.javaType)}.copy(from.get${field.name?cap_first}().get(i));
            this.${field.name}.add(${lowerCamelCase(field.javaType)});
        }
        </#if>
    <#else>
        <#if field.baseField ||field.bean.enum>
            <#if field.fieldType="boolean">
        this.${field.name} = from.is${field.name?cap_first}();
            <#else >
        this.${field.name} = from.get${field.name?cap_first}();
            </#if>
        <#else>
        ${field.javaType} temp${field.name?cap_first} = new ${field.javaType}();
        temp${field.name?cap_first}.copy(from.get${field.name?cap_first}());
        this.${field.name} = temp${field.name?cap_first};
        </#if>
    </#if>
    </#list>
    }

    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf) {
        getSerializedSize();
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list >
        <#if field.baseField>
            <#if field.javaType="String">
        for (int i = 0; i < ${field.name}.size(); i++) {
            writeString(buf, ${field.tag}, ${field.name}.get(i));
        }
            <#else ><#--String-->
        if (${field.name}.size() > 0) {
            writeVar32(buf, ${field.tag});
            writeVar32(buf, ${field.name}SerializedSize);
            for (int i = 0; i < ${field.name}.size(); i++) {
                write${baseFieldType2MethodName(field.fieldType)}(buf, ${field.name}.get(i));
            }
        }
            </#if>
        <#else ><#--bean -->
            <#if field.bean.enum>
        if (${field.name}.size() > 0) {
            writeVar32(buf, ${field.tag});
            writeVar32(buf, ${field.name}SerializedSize);
            for (int i = 0;i < ${field.name}.size(); i++) {
                writeVar32(buf, ${field.name}.get(i).getValue());
            }
        }
            <#else>
        for (int i = 0;i < ${field.name}.size(); i++) {
             writeBean(buf, ${field.tag}, ${field.name}.get(i));
        }
            </#if>
        </#if>
    <#else ><#--不是list-->
        <#if field.baseField>
            <#if field.javaType="String">
        if (${field.name} != null) {
            writeString(buf, ${field.tag}, ${field.name});
        }
            <#else>
        write${baseFieldType2MethodName(field.fieldType)}(buf, ${field.tag}, ${field.name});
            </#if>
        <#else>
        if (${field.name} != null) {
            <#if field.bean.enum>
            writeVar32(buf, ${field.tag}, ${field.name}.getValue());
            <#else>
            writeBean(buf, ${field.tag}, ${field.name});
            </#if>
        }
        </#if>
    </#if>
</#list>
    }

    /**
     * 读取字节缓存
     */
    @Override
    public void read(ByteBuf buf, int endIndex) {
        while (true) {
            int tag = readTag(buf, endIndex);
            switch (tag) {
                case 0://end
                    return;
<#list fields as field>
<#if field.hasExplain>
                //${field.explain}
</#if>
                case ${field.tag}:// ${field.index} << 3 | ${field.writeType}
    <#if field.list>
        <#if field.baseField>
            <#if field.javaType="String">
                    ${field.name}.add(readString(buf));
            <#else>
                    int ${field.name}DataSize = readVar32(buf);
                    int receive${field.name?cap_first}DataSize = 0;
                    do {
                        ${field.javaType} temp${field.name?cap_first}Value = read${baseFieldType2MethodName(field.fieldType)}(buf);
                        receive${field.name?cap_first}DataSize += compute${baseFieldType2MethodName(field.fieldType)}Size(temp${field.name?cap_first}Value);
                    }
                    while(receive${field.name?cap_first}DataSize < ${field.name}DataSize );
            </#if>
                <#else ><#--bean-->
                    <#if field.bean.enum>
                    int ${field.name}DataSize = readVar32(buf);
                    int receive${field.name?cap_first}DataSize = 0;
                    do {
                        int temp${field.name?cap_first} = readVar32(buf);
                        receive${field.name?cap_first}DataSize += computeVar32Size(temp${field.name?cap_first});
                        ${field.name}.add(${field.javaType}.get${field.bean.javaName}(temp${field.name?cap_first}));
                    }
                    while(receive${field.name?cap_first}DataSize < ${field.name}DataSize );
                    <#else >
                    ${field.javaType} temp${field.name?cap_first}Bean = new ${field.javaType}();
                    readBean(buf,temp${field.name?cap_first}Bean);
                    ${field.name}.add(temp${field.name?cap_first}Bean);
                    </#if>
        </#if><#--bean-->
    <#else><#--不是list-->
        <#if field.baseField>
                    ${field.name} = read${baseFieldType2MethodName(field.fieldType)}(buf);
        <#else>
            <#if field.bean.enum>
                    ${field.name} = ${field.javaType}.get${field.bean.javaName}(readVar32(buf)) ;
            <#else>
                    ${field.name} = new ${field.javaType}();
                    readBean(buf,${field.name});
            </#if>
        </#if>
    </#if>
                    break;
</#list>
                default://skip
                    skip(buf, tag);
                    break;
            }
        }
    }

    private int serializedSize = -1;
<#list fields as field>
    <#if field.list >
        <#if field.baseField >
            <#if field.javaType != "String" >
    private int ${field.name}SerializedSize = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    private int ${field.name}SerializedSize = 0;
            </#if>
        </#if>
    </#if>
</#list>

    @Override
    public int getSerializedSize() {
        int size = serializedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list>
        <#if field.baseField>
            <#if field.javaType="String">
        for(int i = 0; i < ${field.name}.size(); i++) {
            size += computeStringSize(${var32Size(field.tag)}, ${field.name}.get(i));
        }
            <#else ><#--String-->
        int ${field.name}DataSize = 0;
        for(int i = 0; i < ${field.name}.size(); i++) {
            ${field.name}DataSize += compute${baseFieldType2MethodName(field.fieldType)}Size(${field.name}.get(i));
        }
        ${field.name}SerializedSize = ${field.name}DataSize;
        if (${field.name}DataSize > 0 ) {
            //tag size ${field.tag}
            size += ${var32Size(field.tag)};
            size += ${field.name}SerializedSize;
            size += computeVar32Size(${field.name}SerializedSize);
        }
            </#if><#--String-->
        <#else ><#--bean-->
            <#if field.bean.enum>
        int ${field.name}DataSize = 0;
        for (int i = 0;i < ${field.name}.size(); i++) {
            ${field.name}DataSize += computeVar32Size(${field.name}.get(i).getValue());
        }
        ${field.name}SerializedSize = ${field.name}DataSize;
        if (${field.name}DataSize > 0 ) {
            //tag size ${field.tag}
            size += ${var32Size(field.tag)};
            size += ${field.name}SerializedSize;
            size += computeVar32Size(${field.name}SerializedSize);
        }
            <#else>
        for (int i = 0; i < ${field.name}.size(); i++) {
            size += computeBeanSize(${var32Size(field.tag)}, ${field.name}.get(i));
        }
            </#if>
        </#if><#--bean-->
    <#else><#--不是list-->
         <#if field.baseField>
             <#if field.javaType="String">
         if (${field.name} != null) {
             size += computeStringSize(${var32Size(field.tag)}, ${field.name});
         }
             <#else>
         size += compute${baseFieldType2MethodName(field.fieldType)}Size(${var32Size(field.tag)}, ${field.name});
             </#if>
         <#else>
         if (${field.name} != null) {
             <#if field.bean.enum>
             size += computeVar32Size(${var32Size(field.tag)}, ${field.name}.getValue());
             <#else >
             size += computeBeanSize(${var32Size(field.tag)}, ${field.name});
             </#if>
         }
         </#if>
    </#if>
</#list>
        serializedSize = size ;
        return size ;
    }

<#list fields as field>
    <#if field.list>
        <#if field.hasExplain&&field.explain?length gt 1>
     /**
      * get ${field.explain}
      * @return
      */
        </#if>
    public List<${.globals[field.javaType]!field.javaType?cap_first}> get${field.name?cap_first}() {
        return ${field.name};
    }
        <#if field.hasExplain&&field.explain?length gt 1>
     /**
      * set ${field.explain}
      */
        </#if>
    public ${name} set${field.name?cap_first} (List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name}) {
        if(${field.name} == null) {
            this.${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
            return this;
        }
        this.${field.name} = ${field.name};
        return this;
    }

    <#else>
        <#if field.hasExplain&&field.explain?length gt 1>
    /**
     * <#if field.javaType="boolean"> is<#else>get</#if> ${field.explain}
     * @return
     */
        </#if>
    public  ${field.javaType} <#if field.javaType="boolean"> is<#else>get</#if>${field.name?cap_first}() {
        return ${field.name};
    }

        <#if field.hasExplain&&field.explain?length gt 1>
    /**
     * set ${field.explain}
     */
        </#if>
    public ${name} set${field.name?cap_first}(${field.javaType} ${field.name}) {
        this.${field.name} = ${field.name};
        return this;
    }
    </#if>
</#list>