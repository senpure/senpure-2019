<#global "int"="Integer"/>
<#list fields as field>
<#if field.hasExplain>
    //${field.explain}
</#if>
<#if field.list >
    protected List<${.globals[field.fieldType]!field.fieldType?cap_first}> ${field.name}=new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
<#else>
    protected ${field.fieldType} ${field.name};
</#if>
</#list>

    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
      <#list fields as field>
          <#if field.hasExplain>
        //${field.explain}
          </#if>
         <#if field.list>
        int ${field.name}Size=${field.name}.size();
        writeShort(buf,${field.name}Size);
        for(int i=0;i< ${field.name}Size;i++){
             <#if field.fieldType="boolean">
            writeBoolean(buf,${field.name}.get(i));
             <#elseif field.fieldType="byte">
            writeByte(buf,${field.name}.get(i));
             <#elseif field.fieldType="short">
            writeShort(buf,${field.name}.get(i));
             <#elseif field.fieldType="int">
            writeInt(buf,${field.name}.get(i));
             <#elseif field.fieldType="float">
            writeFloat(buf,${field.name}.get(i));
             <#elseif field.fieldType="double">
            writeDouble(buf,${field.name}.get(i));
             <#elseif field.fieldType="long">
            writeLong(buf,${field.name}.get(i));
             <#elseif field.fieldType="String">
            writeStr(buf,${field.name}.get(i));
             <#else>
            writeBean(buf,${field.name}.get(i),false);
             </#if>
           }
             <#else>
         <#if field.fieldType="boolean">
        writeBoolean(buf,${field.name});
         <#elseif field.fieldType="byte">
        writeByte(buf,${field.name});
         <#elseif field.fieldType="short">
        writeShort(buf,${field.name});
         <#elseif field.fieldType="int">
        writeInt(buf,${field.name});
         <#elseif field.fieldType="float">
        writeFloat(buf,${field.name});
         <#elseif field.fieldType="double">
        writeDouble(buf,${field.name});
         <#elseif field.fieldType="long">
        writeLong(buf,${field.name});
         <#elseif field.fieldType="String">
        writeStr(buf,${field.name});
         <#else>
        writeBean(buf,${field.name},true);
         </#if>
         </#if>
       </#list>
    }


    /**
     * 读取字节缓存
     */
    @Override
    public void read(ByteBuf buf){
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list>
        int ${field.name}Size=readShort(buf);
        for(int i=0;i<${field.name}Size;i++){
        <#if field.fieldType="boolean">
            this.${field.name}.add(readBoolean(buf));
        <#elseif field.fieldType="byte">
            this.${field.name}.add(readByte(buf));
        <#elseif field.fieldType="short">
            this.${field.name}.add(readShort(buf));
        <#elseif field.fieldType="int">
            this.${field.name}.add(readInt(buf));
        <#elseif field.fieldType="float">
            this.${field.name}.add(readFloat(buf));
        <#elseif field.fieldType="double">
            this.${field.name}.add(readDouble(buf));
        <#elseif field.fieldType="long">
            this.${field.name}.add(readLong(buf));
        <#elseif field.fieldType="String">
            this.${field.name}.add(readStr(buf));
        <#else>
            this.${field.name}.add((${field.fieldType})readBean(buf,${field.fieldType}.class,false));
        </#if>
         }
    <#else>
        <#if field.fieldType="boolean">
        this.${field.name}=readBoolean(buf);
        <#elseif field.fieldType="byte">
        this.${field.name}=readByte(buf);
        <#elseif field.fieldType="short">
        this.${field.name}=readShort(buf);
        <#elseif field.fieldType="int">
        this.${field.name}=readInt(buf);
        <#elseif field.fieldType="float">
        this.${field.name}=readFloat(buf);
        <#elseif field.fieldType="double">
        this.${field.name}=readDouble(buf);
        <#elseif field.fieldType="long">
        this.${field.name}=readLong(buf);
        <#elseif field.fieldType="String">
        this.${field.name}=readStr(buf);
        <#else>
        this.${field.name}=(${field.fieldType})readBean(buf,${field.fieldType}.class,true);
        </#if>
    </#if>
</#list>
    }

<#list fields as field>
    <#if field.list>
        <#if field.hasExplain&&field.explain?length gt 2>
     /**
      * get ${field.explain}
      * @return
      */
        </#if>
    public List<${.globals[field.fieldType]!field.fieldType?cap_first}> get${field.name?cap_first}(){
        return ${field.name};
    }
        <#if field.hasExplain&&field.explain?length gt 2>
     /**
      * set ${field.explain}
      */
        </#if>
    public ${name} set${field.name?cap_first} (List<${.globals[field.fieldType]!field.fieldType?cap_first}> ${field.name}){
        if(${field.name} == null){
        this.${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
            return this;
        }
        this.${field.name}=${field.name};
        return this;
    }

    <#else>
        <#if field.hasExplain&&field.explain?length gt 2>
    /**
     * get ${field.explain}
     * @return
     */
        </#if>
    public  ${field.fieldType} <#if field.fieldType="boolean"> is<#else>get</#if>${field.name?cap_first}(){
        return ${field.name};
}

        <#if field.hasExplain&&field.explain?length gt 2>
    /**
     * set ${field.explain}
     */
        </#if>
    public ${name} set${field.name?cap_first}(${field.fieldType} ${field.name}){
        this.${field.name}=${field.name};
        return this;
}
    </#if>
</#list>