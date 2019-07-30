<#global "int"="Integer"/>
<#list fields as field>
<#if field.hasExplain>
    //${field.explain}
</#if>
<#if field.list >
    private List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
<#else>
    private ${field.javaType} ${field.name};
</#if>
</#list>
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list >
        <#if field.baseField>
            <#if field.fieldType!="String">
        if (${field.name}.size() > 0){
            writeVar32(buf,${field.tag});
            writeVar32(buf,${field.name}SerializedSize);
            for (int i= 0;i< ${field.name}.size();i++){
                <#if field.fieldType="boolean">
                writeBoolean(buf,${field.name}.get(i));
                <#elseif field.fieldType="byte">
                writeVar32(buf,${field.name}.get(i));
                <#elseif field.fieldType="short">
                writeVar32(buf,${field.name}.get(i));
                <#elseif field.fieldType="int">
                writeVar32(buf,${field.name}.get(i));
                <#elseif field.fieldType="long">
                writeVar64(buf,${field.name}.get(i));
                <#elseif field.fieldType="sint">
                writeSInt(buf,${field.name}.get(i));
                <#elseif field.fieldType="slong">
                writeSLong(buf,${field.name}.get(i));
                <#elseif field.fieldType="float">
                writeFloat(buf,${field.name}.get(i));
                <#elseif field.fieldType="double">
                writeDouble(buf,${field.name}.get(i));
                <#elseif field.fieldType="sfixed32">
                writeSFixed32(buf,${field.name}.get(i));
                <#elseif field.fieldType="sfixed64">
                writeSFixed64(buf,${field.name}.get(i));
                </#if>
            }
        }
            <#else ><#--String-->
        for (int i= 0;i< ${field.name}.size();i++){
            writeString(buf,${field.tag},${field.name}.get(i));
        }
            </#if>
        <#else ><#--bean-->
        for (int i= 0;i< ${field.name}.size();i++){
            writeBean(buf,${field.tag},${field.name}.get(i));
        }
        </#if>
    <#else ><#--不是list-->
        <#if field.fieldType="boolean">
        writeBoolean(buf,${field.tag},${field.name});
        <#elseif field.fieldType="byte">
        writeVar32(buf,${field.tag},${field.name});
        <#elseif field.fieldType="short">
        writeVar32(buf,${field.tag},${field.name});
        <#elseif field.fieldType="int">
        writeVar32(buf,${field.tag},${field.name});
        <#elseif field.fieldType="long">
        writeVar64(buf,${field.tag},${field.name});
        <#elseif field.fieldType="sint">
        writeSInt(buf,${field.tag},${field.name});
        <#elseif field.fieldType="slong">
        writeSLong(buf,${field.tag},${field.name});
        <#elseif field.fieldType="float">
        writeFloat(buf,${field.tag},${field.name});
        <#elseif field.fieldType="double">
        writeDouble(buf,${field.tag},${field.name});
        <#elseif field.fieldType="sfixed32">
        writeSFixed32(buf,${field.tag},${field.name});
        <#elseif field.fieldType="sfixed64">
        writeSFixed64(buf,${field.tag},${field.name});
        <#elseif field.fieldType="String">
        if (${field.name} != null){
            writeString(buf,${field.tag},${field.name});
        }
        <#else>
        if (${field.name }!= null){
            writeBean(buf,${field.tag},${field.name});
        }
        </#if>
    </#if>
</#list>
    }

    /**
     * 读取字节缓存
     */
    @Override
    public void read(ByteBuf buf,int endIndex){
        while(true){
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
            <#if field.fieldType!="String">
                    int ${field.name}DataSize = readVar32(buf);
                    int receive${field.name?cap_first}DataSize = 0;
                    do {
                        <#if field.fieldType="boolean">
                        boolean temp${field.name?cap_first} = readBoolean(buf);
                        receive${field.name?cap_first}DataSize += computeBooleanSizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="byte">
                        int temp${field.name?cap_first} = readVar32(buf);
                        receive${field.name?cap_first}DataSize += computeVar32SizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="short">
                        int temp${field.name?cap_first} = readVar32(buf);;
                        receive${field.name?cap_first}DataSize += computeVar32SizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="int">
                        int temp${field.name?cap_first} = readVar32(buf);
                        receive${field.name?cap_first}DataSize += computeVar32SizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="long">
                        long temp${field.name?cap_first} = readVar64(buf);
                        receive${field.name?cap_first}DataSize += computeVar64SizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="sint">
                        int temp${field.name?cap_first} = readSInt(buf);
                        receive${field.name?cap_first}DataSize += computeSIntSizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="slong">
                        long temp${field.name?cap_first} = readSLong(buf);
                        receive${field.name?cap_first}DataSize += computeSLongSizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="float">
                        float temp${field.name?cap_first} = readFloat(buf);
                        receive${field.name?cap_first}DataSize += computeFloatSizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="double">
                        double temp${field.name?cap_first} = readDouble(buf);
                        receive${field.name?cap_first}DataSize += computeDoubleSizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="sfixed32">
                        int temp${field.name?cap_first} = readSFixed32(buf);
                        receive${field.name?cap_first}DataSize += computeSFixed32SizeNoTag(temp${field.name?cap_first});
                        <#elseif field.fieldType="sfixed64">
                        long temp${field.name?cap_first} = readSFixed64(buf);
                        receive${field.name?cap_first}DataSize += computeSFixed64SizeNoTag(temp${field.name?cap_first});
                        </#if><#--多个选项的-->
                        ${field.name}.add(temp${field.name?cap_first});
                    }
                    while(receive${field.name?cap_first}DataSize < ${field.name}DataSize );
                    <#else ><#--String-->
                        ${field.name}.add(readString(buf));
                    </#if><#--String-->
                <#else ><#--bean-->
                        ${field.javaType} temp${field.name?cap_first}Bean = new ${field.javaType}();
                        readBean(buf,temp${field.name?cap_first}Bean);
                        ${field.name}.add(temp${field.name?cap_first}Bean);
                </#if><#--bean-->
            <#else><#--不是list-->
                <#if field.fieldType="boolean">
                        ${field.name} = readBoolean(buf);
                <#elseif field.fieldType="byte">
                        ${field.name} = readVar32(buf);
                <#elseif field.fieldType="short">
                        ${field.name} = readVar32(buf);
                <#elseif field.fieldType="int">
                        ${field.name} = readVar32(buf);
                <#elseif field.fieldType="long">
                        ${field.name} = readVar64(buf);
                <#elseif field.fieldType="sint">
                        ${field.name} = readSInt(buf);
                <#elseif field.fieldType="slong">
                        ${field.name} = readSLong(buf);
                <#elseif field.fieldType="float">
                        ${field.name} = readFloat(buf);
                <#elseif field.fieldType="double">
                        ${field.name} = readDouble(buf);
                <#elseif field.fieldType="sfixed32">
                        ${field.name} = readSFixed32(buf);
                <#elseif field.fieldType="sfixed64">
                        ${field.name} = readSFixed64(buf);
                <#elseif field.fieldType="String">
                        ${field.name} = readString(buf);
                <#else>
                ${field.name} = new ${field.javaType}();
                        readBean(buf,${field.name});
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
    <#if field.list &&field.baseField &&field.fieldType != "String" >
    private int ${field.name}SerializedSize = 0;
    </#if>
</#list>

    @Override
    public int getSerializedSize(){
        int size = serializedSize ;
        if (size != -1 ){
            return size;
        }
        size = 0 ;
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list>
        <#if field.baseField>
            <#if field.fieldType!="String">
            int ${field.name}DataSize = 0;
        for(int i=0;i< ${field.name}.size();i++){
            <#if field.fieldType="boolean">
            ${field.name}DataSize += computeBooleanSizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="byte">
            ${field.name}DataSize += computeVar32SizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="short">
            ${field.name}DataSize += computeVar32SizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="int">
            ${field.name}DataSize += computeVar32SizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="long">
            ${field.name}DataSize += computeVar64SizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="sint">
            ${field.name}DataSize += computeSIntSizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="slong">
            ${field.name}DataSize += computeSLongSizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="float">
            ${field.name}DataSize += computeFloatSizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="double">
            ${field.name}DataSize += computeDoubleSizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="sfixed32">
            ${field.name}DataSize += computeSFixed32SizeNoTag(${field.name}.get(i));
            <#elseif field.fieldType="sfixed64">
            ${field.name}DataSize += computeSFixed64SizeNoTag(${field.name}.get(i));
            </#if><#--多个选项的-->
        }
        ${field.name}SerializedSize = ${field.name}DataSize;
        if(${field.name}DataSize > 0 ){
            //tag size ${field.tag}
            size += ${var32Size(field.tag)};
            size += ${field.name}SerializedSize;
            size += computeVar32SizeNoTag(${field.name}SerializedSize);
        }
            <#else ><#--String-->
        for(int i=0;i< ${field.name}.size();i++){
            size += computeStringSize(${var32Size(field.tag)},${field.name}.get(i));
        }
            </#if><#--String-->
        <#else ><#--bean-->
        for(int i=0;i< ${field.name}.size();i++){
            size += computeBeanSize(${var32Size(field.tag)},${field.name}.get(i));
        }
        </#if><#--bean-->
    <#else><#--不是list-->
        <#if field.fieldType="boolean">
        size += computeBooleanSize(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="byte">
        size += computeVar32Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="short">
        size += computeVar32Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="int">
        size += computeVar32Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="long">
        size += computeVar64Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="sint">
        size += computeSIntSize(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="slong">
        size += computeSLongSize(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="float">
        size += computeFloatSize(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="double">
        size += computeDoubleSize(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="sfixed32">
        size += computeSFixed32Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="sfixed64">
        size += computeSFixed64Size(${var32Size(field.tag)},${field.name});
        <#elseif field.fieldType="String">
        if (${field.name} != null){
            size += computeStringSize(${var32Size(field.tag)},${field.name});
        }
        <#else>
        if (${field.name} != null){
            size += computeBeanSize(${var32Size(field.tag)},${field.name});
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
    public List<${.globals[field.javaType]!field.javaType?cap_first}> get${field.name?cap_first}(){
        return ${field.name};
    }
        <#if field.hasExplain&&field.explain?length gt 1>
     /**
      * set ${field.explain}
      */
        </#if>
    public ${name} set${field.name?cap_first} (List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name}){
        if(${field.name} == null){
        this.${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
            return this;
        }
        this.${field.name}=${field.name};
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
        this.${field.name}=${field.name};
        return this;
    }
    </#if>
</#list>