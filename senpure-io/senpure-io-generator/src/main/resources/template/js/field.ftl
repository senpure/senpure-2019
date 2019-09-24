<#include "method.ftl"/>
<#if bean.hasExplain>
/**
 *
  *  ${bean.explain}
 */
</#if>
${bean.js.namespace}.${bean.js.name} = function(){
<#list bean.fields as field>
    <#if field.list >
    //list:<#if field.baseField>${rightPad(field.javaType,8)}<#else>${field.bean.js.namespace}.${field.bean.js.name} </#if><#if field.hasExplain>${field.explain}</#if>
    <#else ><#--不是list-->
    //类型:<#if field.baseField>${rightPad(field.javaType,8)}<#else>${field.bean.js.namespace}.${field.bean.js.name} </#if><#if field.hasExplain>${field.explain}</#if>
    </#if>
    <#if field.list >
    this.${field.name} = new Array(0);
    <#else ><#--不是list-->
        <#if field.baseField>
            <#if field.javaType == "String">
    this.${field.name} = null;
            <#elseif field.fieldType == "boolean">
    this.${field.name} = false;
            <#else >
    this.${field.name} = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    this.${field.name} = ${field.bean.js.namespace}.${field.bean.js.name}.${field.bean.defaultField.name};
            <#else >
    this.${field.name} = null ;<#--bean 引用-->
            </#if>
        </#if>
    </#if>
</#list>
    this.serializedSize = -1;
<#list bean.fields as field>
    <#if field.list >
        <#if field.baseField >
            <#if field.javaType != "String" >
    this.${field.name}SerializedSize = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    this.${field.name}SerializedSize = 0;
            </#if>
        </#if>
    </#if>
</#list>
<#if bean.hasNextIndent>
    //缩进${bean.fieldMaxLen} + 3 = ${bean.fieldMaxLen+3} 个空格
    this._next_indent = "<#list 1..bean.fieldMaxLen+3 as i> </#list>";
</#if>
    //格式化时统一字段长度
    this._filedPad = ${bean.fieldMaxLen} ;
};
<#if bean.type !="NA">

${bean.js.namespace}.${bean.js.name}.MESSAGE_ID = ${bean.id?c};

${bean.js.namespace}.${bean.js.name}.prototype.getMessageId = function () {
    return ${bean.js.namespace}.${bean.js.name}.MESSAGE_ID;
};
</#if>

//${bean.js.namespace}.${bean.js.name}写入字节缓存
${bean.js.namespace}.${bean.js.name}.prototype.write = function (buf){
<#list bean.fields as field>
    <#if field.list>
    this.getSerializedSize();
        <#break>
    </#if>
</#list>
<#list bean.fields as field>
    <#if field.hasExplain>
    //${field.explain}
    </#if>
    <#if field.list >
    var ${field.name}_len = this.${field.name}.length;
        <#if field.baseField>
            <#if field.javaType="String">
    for ( var i = 0; i < ${field.name}_len ;i++){
        buf.writeStringField(${field.tag}, this.${field.name}[i]);
    }
            <#else>
    if (${field.name}_len > 0) {
        buf.writeVar32(${field.tag});
        buf.writeVar32(this.${field.name}SerializedSize);
        for( var i = 0; i < ${field.name}_len;i++){
            buf.write${baseFieldType2MethodName(field.fieldType)}(this.${field.name}[i]);
        }
    }
            </#if>
        <#else ><#--bean -->
    if (${field.name}_len > 0) {
            <#if field.bean.enum>
        buf.writeVar32(${field.tag});
        buf.writeVar32(this.${field.name}SerializedSize);
        for (var i = 0;i < ${field.name}_len ; i++){
            buf.writeVar32(this.${field.name}[i]);
        }
            <#else>
        for (var i = 0;i < ${field.name}_len ; i++){
            buf.writeVar32(${field.tag});
            buf.writeVar32(this.${field.name}[i].getSerializedSize());
            this.${field.name}[i].write(buf);
        }
            </#if>
    }
        </#if>
    <#else ><#--不是list-->
    if (this.${field.name} != null) {
        <#if field.baseField>
        buf.write${baseFieldType2MethodName(field.fieldType)}Field(${field.tag}, this.${field.name});
        <#else>
            <#if field.bean.enum>
        buf.writeVar32Field(${field.tag}, this.${field.name});
            <#else>
        buf.writeVar32(${field.tag});
        buf.writeVar32(this.${field.name}.getSerializedSize());
        this.${field.name}.write(buf);
            </#if>
        </#if>
    }
    </#if>
</#list>
};

//${bean.js.namespace}.${bean.js.name}读取字节缓存
${bean.js.namespace}.${bean.js.name}.prototype.read = function (buf,endIndex){
    while(true){
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
<#list bean.fields as field>
    <#if field.hasExplain>
            //${field.explain}
    </#if>
            // ${field.index} << 3 | ${field.writeType}
            case ${field.tag} :
    <#if field.list>
        <#if field.baseField>
            <#if field.javaType="String">
                this.${field.name}.push(buf.readString());
            <#else>
                var ${field.name}DataSize = buf.readVar32();
                var receive${field.name?cap_first}DataSize = 0;
                while(receive${field.name?cap_first}DataSize < ${field.name}DataSize ) {
                    var temp${field.name?cap_first} = buf.read${baseFieldType2MethodName(field.fieldType)}();
                    receive${field.name?cap_first}DataSize += io.compute${baseFieldType2MethodName(field.fieldType)}Size(temp${field.name?cap_first});
                    this.${field.name}.push(temp${field.name?cap_first});
                }
            </#if>
        <#else ><#--bean-->
            <#if field.bean.enum>
                var ${field.name}DataSize = buf.readVar32();
                var receive${field.name?cap_first}DataSize = 0;
                while(receive${field.name?cap_first}DataSize < ${field.name}DataSize ) {
                    var temp${field.name?cap_first} = buf.readVar32();
                    receive${field.name?cap_first}DataSize += io.computeVar32Size(temp${field.name?cap_first});
                    this.${field.name}.push(${field.bean.js.namespace}.${field.bean.js.name}.checkReadValue(temp${field.name?cap_first}));
                }
                <#else >
                var temp${field.bean.js.namespace}${field.name?cap_first}Bean = new ${field.bean.js.namespace}.${field.bean.js.name}();
                temp${field.bean.js.namespace}${field.name?cap_first}Bean.read(buf,buf.readVar32()+buf.getReaderIndex());
                this.${field.name}.push(temp${field.bean.js.namespace}${field.name?cap_first}Bean);
            </#if>
        </#if><#--bean-->
    <#else><#--不是list-->
        <#if field.baseField>
                this.${field.name} = buf.read${baseFieldType2MethodName(field.fieldType)}();
        <#else>
            <#if field.bean.enum>
                this.${field.name} = ${field.bean.js.namespace}.${field.bean.js.name}.checkReadValue(buf.readVar32());
            <#else >
                this.${field.name} = new ${field.bean.js.namespace}.${field.bean.js.name}();
                this.${field.name}.read(buf,buf.readVar32()+buf.getReaderIndex());
            </#if>
        </#if>
    </#if>
                break;
</#list>
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//${bean.js.namespace}.${bean.js.name}计算序列化大小
${bean.js.namespace}.${bean.js.name}.prototype.getSerializedSize = function (){
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
<#list bean.fields as field>
    <#if field.hasExplain>
    //${field.explain}
    </#if>
    <#assign fieldMethodName>${baseFieldType2MethodName(field.fieldType)}</#assign>
    <#if field.list>
        <#if field.baseField>
            <#if field.fieldType ="String">
    var ${field.name}_len = this.${field.name}.length;
    if (${field.name}_len > 0 ){
        for (var i = 0;i < ${field.name}_len ; i++){
                    //tag size 已经完成了计算 ${field.tag}
            size += ${var32Size(field.tag)} + io.computeStringSize(this.${field.name}[i] );
        }
    }
            <#else><#--不是string-->
    var ${field.name}_len = this.${field.name}.length;
    var ${field.name}DataSize = 0;
    for (var i = 0; i <  ${field.name}_len; i++ ){
        ${field.name}DataSize += io.compute${baseFieldType2MethodName(field.fieldType)}Size(this.${field.name}[i] );
    }
    this.${field.name}SerializedSize = ${field.name}DataSize;
    if (${field.name}DataSize > 0) {
                // tag size 已经完成了计算 ${field.tag}
        size += ${var32Size(field.tag)} + this.${field.name}SerializedSize + io.computeVar32Size(this.${field.name}SerializedSize);
    }
            </#if>
        <#else ><#--bean and enum-->
            <#if field.bean.enum>
    var ${field.name}_len = this.${field.name}.length;
    var ${field.name}DataSize = 0;
    for (var i = 0;i < ${field.name}_len ; i++){
        ${field.name}DataSize += io.computeVar32Size(this.${field.name}[i] );
    }
    this.${field.name}SerializedSize = ${field.name}DataSize;
    if (${field.name}DataSize > 0) {
                // tag size 已经完成了计算 ${field.tag}
        size += ${var32Size(field.tag)} + this.${field.name}SerializedSize + io.computeVar32Size(this.${field.name}SerializedSize);
    }
            <#else ><#--bean-->
    var ${field.name}_len = this.${field.name}.length;
    for (var i = 0;i < ${field.name}_len ; i++){
        var ${field.name}BeanSize = this.${field.name}[i].getSerializedSize()
                // tag size 已经完成了计算 ${field.tag}
        size += ${field.name}BeanSize + io.computeVar32FieldSize(${var32Size(field.tag)},${field.name}BeanSize);
    }
            </#if>
        </#if><#--bean an denmu-->
    <#else><#--不是list-->
        <#if field.baseField>
    if (this.${field.name} != null){
                // tag size 已经完成了计算 ${field.tag}
        size += io.compute${fieldMethodName}FieldSize(${var32Size(field.tag)}, this.${field.name});
    }
            <#else>
                <#if field.bean.enum>
            // tag size 已经完成了计算 ${field.tag}
    size += io.computeVar32FieldSize(${var32Size(field.tag)}, this.${field.name});
                <#else >
    if (this.${field.name} != null){
        var ${field.name}BeanSize = this.${field.name}.getSerializedSize();
                // tag size 已经完成了计算 ${field.tag}
        size += ${field.name}BeanSize + io.computeVar32FieldSize(${var32Size(field.tag)}, ${field.name}BeanSize);
    }
                </#if>
        </#if>
    </#if>
</#list>
    this.serializedSize = size ;
    return size ;
};

//${bean.js.namespace}.${bean.js.name}格式化字符串
${bean.js.namespace}.${bean.js.name}.prototype.toString = function (_indent){
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "${bean.js.name}<#if bean.type != "NA">[${bean.id?c}]</#if>" + "{";
<#list bean.fields as field>
    <#if field.hasExplain>
    //${field.explain}
    </#if>
    _str = _str + "\n";
    <#if field.list>
    _str = _str + _indent + rightPad("${field.name}", this._filedPad) + " = ";
        var ${field.name}_len = this.${field.name}.length;
        if (${field.name}_len > 0){
            _str = _str + "[";
            for (var i = 0;i < ${field.name}_len;i++){
                _str = _str + "\n";
        <#if field.baseField>
                _str = _str + this._next_indent;
            _str = _str + _indent + this.${field.name}[i];
        <#else>
            <#if field.bean.enum>
                _str = _str + this._next_indent;
                _str = _str +_indent + ${field.bean.js.namespace}.${field.bean.js.name}.valueToStr(this.${field.name}[i]);
                <#else >
                _str = _str + this._next_indent;
                _str = _str + _indent + this.${field.name}[i].toString(_indent + this._next_indent);
            </#if>
        </#if>
            }
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + "]";
        }else {<#-- len = 0-->
            _str = _str + "null ";
        }
    <#else ><#-- 不是list-->
        <#if field.baseField>
    _str = _str + _indent + rightPad("${field.name}",this._filedPad) + " = " + this.${field.name};
        <#else>
            <#if field.bean.enum>
    _str = _str + _indent + rightPad("${field.name}",this._filedPad) + " = " + ${field.bean.js.namespace}.${field.bean.js.name}.valueToStr(this.${field.name});
                <#else >
    if (this.${field.name} != null ){
        _str = _str + _indent + rightPad("${field.name}", this._filedPad) + " = " + this.${field.name}.toString(_indent + this._next_indent);
    } else{
        _str = _str + _indent + rightPad("${field.name}", this._filedPad) + " = " + "null";
    }
            </#if>
        </#if>
    </#if>
</#list>
    _str =_str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

