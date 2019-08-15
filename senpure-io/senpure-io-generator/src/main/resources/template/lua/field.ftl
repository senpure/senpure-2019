<#if bean.hasExplain>
--[[
    ${bean.explain}
--]]
</#if>
${bean.lua.namespace}.${bean.lua.name} = {
<#if bean.type !="NA">
    --[Comment]
    --message_id
    messageId = ${bean.id?c};
</#if>
<#list bean.fields as field>
    <#if field.list >
    --[Comment]
    --list:<#if field.baseField>${rightPad(field.javaType,7)}<#else>${field.bean.lua.namespace}.${field.bean.lua.name} </#if><#if field.hasExplain>${field.explain}</#if>
    <#else ><#--不是list-->
    --[Comment]
    --类型:<#if field.baseField>${rightPad(field.javaType,7)}<#else>${field.bean.lua.namespace}.${field.bean.lua.name} </#if><#if field.hasExplain>${field.explain}</#if>
    </#if>
    <#if field.list >
    ${field.name} = nil;
    <#else ><#--不是list-->
        <#if field.baseField>
            <#if field.javaType == "String">
    ${field.name} = "";
            <#elseif field.fieldType == "boolean">
    ${field.name} = false;
            <#else >
    ${field.name} = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    ${field.name}= ${field.bean.lua.namespace}.${field.bean.lua.name}.${field.bean.defaultField.name};
            <#else >
    ${field.name} = nil ;<#--bean 引用-->
            </#if>
        </#if>
    </#if>
</#list>
    serializedSize = -1;
<#list bean.fields as field>
    <#if field.list >
        <#if field.baseField >
            <#if field.javaType != "String" >
    ${field.name}SerializedSize = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    ${field.name}SerializedSize = 0;
            </#if>
        </#if>
    </#if>
</#list>
<#if bean.hasNextIndent>
    --缩进${bean.fieldMaxLen} + 3 = ${bean.fieldMaxLen+3} 个空格
    _next_indent = "<#list 1..bean.fieldMaxLen+3 as i> </#list>";
</#if>
    --格式化时统一字段长度
    _filedPad = ${bean.fieldMaxLen} ;
}

--${bean.lua.namespace}.${bean.lua.name}构造方法
function ${bean.lua.namespace}.${bean.lua.name}:new()
<#assign objName>${lowerCamelCase(bean.lua.name)}</#assign>
    local ${objName} = setmetatable({}, {__index=self}) ;
<#list bean.fields as field>
    <#if field.list >
    --[Comment]
    --list:<#if field.baseField>${rightPad(field.javaType,7)}<#else>${field.bean.lua.namespace}${field.bean.lua.name} </#if><#if field.hasExplain>${field.explain}</#if>
    <#else ><#--不是list-->
    --[Comment]
    --类型:<#if field.baseField>${rightPad(field.javaType,7)}<#else>${field.bean.lua.namespace}${field.bean.lua.name} </#if><#if field.hasExplain>${field.explain}</#if>
    </#if>
    <#if field.list >
    ${objName}.${field.name} = nil;
    <#else ><#--不是list-->
        <#if field.baseField>
            <#if field.javaType == "String">
    ${objName}.${field.name} = "";
            <#elseif field.fieldType == "boolean">
    ${objName}.${field.name} = false;
            <#else >
    ${objName}.${field.name} = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    ${objName}.${field.name} = ${field.bean.lua.namespace}.${field.bean.lua.name}.${field.bean.defaultField.name};
            <#else >
    ${objName}.${field.name} = nil;<#--bean 引用-->
            </#if>
        </#if>
    </#if>
</#list>
    ${objName}.serializedSize = -1;
<#list bean.fields as field>
    <#if field.list >
        <#if field.baseField >
            <#if field.javaType != "String" >
    ${objName}.${field.name}SerializedSize = 0;
            </#if>
        <#else>
            <#if field.bean.enum>
    ${objName}.${field.name}SerializedSize = 0;
            </#if>
        </#if>
    </#if>
</#list>
    return ${objName};
end

--${bean.lua.namespace}.${bean.lua.name}写入字节缓存
function ${bean.lua.namespace}.${bean.lua.name}:write(buf)
    self:getSerializedSize(buf);
<#list bean.fields as field>
    <#if field.hasExplain>
    --${field.explain}
    </#if>
    <#if field.list >
    if self.${field.name} then
        local ${field.name}_len = #self.${field.name};
        <#if field.baseField>
            <#if field.javaType!="String">
        if ${field.name}_len > 0 then
            buf:WriteVar32(${field.tag});
            buf:WriteVar32(self.${field.name}SerializedSize);
            for i = 1, ${field.name}_len do
                <#if field.fieldType="boolean">
                buf:WriteBoolean(self.${field.name}[i]);
                <#elseif field.fieldType="byte">
                buf:WriteVar32(self.${field.name}[i]);
                <#elseif field.fieldType="short">
                buf:WriteVar32(self.${field.name}[i]);
                <#elseif field.fieldType="int">
                buf:WriteVar32(self.${field.name}[i]);
                <#elseif field.fieldType="long">
                buf:WriteVar64(self.${field.name}[i]);
                <#elseif field.fieldType="sint">
                buf:WriteSInt(self.${field.name}[i]);
                <#elseif field.fieldType="slong">
                buf:WriteSLong(self.${field.name}[i]);
                <#elseif field.fieldType="float">
                buf:WriteFloat(self.${field.name}[i]);
                <#elseif field.fieldType="double">
                buf:WriteDouble(self.${field.name}[i]);
                <#elseif field.fieldType="sfixed32">
                buf:WriteSFixed32(self.${field.name}[i]);
                <#elseif field.fieldType="sfixed64">
                buf:WriteSFixed64(self.${field.name}[i]);
                </#if>
            end
        end
            <#else ><#--String-->
        for i = 1,${field.name}_len do
            buf:WriteString(${field.tag}, self.${field.name}[i]);
        end
            </#if>
        <#else ><#--bean -->
            <#if field.bean.enum>
            buf:WriteVar32(${field.tag});
            buf:WriteVar32(self.${field.name}SerializedSize);
            for i = 1,${field.name}_len do
                buf:WriteVar32(self.${field.name}[i]);
            end
            <#else>
        for i = 1,${field.name}_len do
            buf:WriteVar32(${field.tag});
            buf:WriteVar32(self.${field.name}[i]:getSerializedSize(buf));
            self.${field.name}[i]:write(buf);
        end
            </#if>
        </#if>
    end
    <#else ><#--不是list-->
        <#if field.fieldType="boolean">
    buf:WriteBoolean(${field.tag}, self.${field.name});
        <#elseif field.fieldType="int">
    buf:WriteVar32(${field.tag}, self.${field.name});
        <#elseif field.fieldType="long">
    buf:WriteVar64(${field.tag}, self.${field.name});
        <#elseif field.fieldType="sint">
    buf:WriteSInt(${field.tag}, self.${field.name});
        <#elseif field.fieldType="slong">
    buf:WriteSLong(${field.tag}, self.${field.name});
        <#elseif field.fieldType="float">
    buf:WriteFloat(${field.tag}, self.${field.name});
        <#elseif field.fieldType="double">
    buf:WriteDouble(${field.tag}, self.${field.name});
        <#elseif field.fieldType="sfixed32">
    buf:WriteSFixed32(${field.tag}, self.${field.name});
        <#elseif field.fieldType="sfixed64">
    buf:WriteSFixed64(${field.tag}, self.${field.name});
        <#elseif field.javaType="String">
    if self.${field.name} then
        buf:WriteString(${field.tag}, self.${field.name});
    end
        <#else>
    if self.${field.name} then
            <#if field.bean.enum>
        buf:WriteVar32(${field.tag}, self.${field.name});
            <#else>
        buf:WriteVar32(${field.tag});
        buf:WriteVar32(self.${field.name}:getSerializedSize(buf));
        self.${field.name}:write(buf);
            </#if>
    end
        </#if>
    </#if>
</#list>
end

--${bean.lua.namespace}.${bean.lua.name}读取字节缓存
function ${bean.lua.namespace}.${bean.lua.name}:read(buf,endIndex)
    local switch = {
<#list bean.fields as field>
    <#if field.hasExplain>
        -- ${field.explain}
    </#if>
        -- ${field.index} << 3 | ${field.writeType}
        [${field.tag}] = function ()
    <#if field.list>
        <#if field.baseField>
            <#if field.fieldType!="String">
        local ${field.name}DataSize = buf:ReadVar32();
         self.${field.name} = {};
        local receive${field.name?cap_first}DataSize = 0;
        local read${field.name?cap_first}Index = 1;
        while(receive${field.name?cap_first}DataSize < ${field.name}DataSize ) do
                <#if field.fieldType="boolean">
            local temp${field.name?cap_first} = buf:ReadBoolean();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeBooleanSizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="byte">
            local temp${field.name?cap_first} = buf:ReadVar32();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeVar32SizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="short">
            local temp${field.name?cap_first} = buf:ReadVar32();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeVar32SizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="int">
            local temp${field.name?cap_first} = buf:ReadVar32();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeVar32SizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="long">
            local temp${field.name?cap_first} = buf:ReadVar64();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeVar64SizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="sint">
            local temp${field.name?cap_first} = buf:ReadSInt();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeSIntSizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="slong">
            local temp${field.name?cap_first} = buf:ReadSLong();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeSLongSizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="float">
            local temp${field.name?cap_first} = buf:ReadFloat();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeFloatSizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="double">
            local temp${field.name?cap_first} = buf:ReadDouble();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeDoubleSizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="sfixed32">
            local temp${field.name?cap_first} = buf:ReadSFixed32();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeSFixed32SizeNoTag(temp${field.name?cap_first});
                <#elseif field.fieldType="sfixed64">
            local temp${field.name?cap_first} = buf:ReadSFixed64();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeSFixed64SizeNoTag(temp${field.name?cap_first});
                </#if><#--多个选项的-->
            self.${field.name}[read${field.name?cap_first}Index] = temp${field.name?cap_first};
            read${field.name?cap_first}Index = read${field.name?cap_first}Index + 1;
        end
            <#else ><#--String-->
        self.${field.name} = self.${field.name} or {};
        self.read${field.name?cap_first}Index = self.read${field.name?cap_first}Index or 1;
        self.${field.name}[self.read${field.name?cap_first}Index] = buf:ReadString();
        self.read${field.name?cap_first}Index = self.read${field.name?cap_first}Index + 1;
            </#if><#--String-->
        <#else ><#--bean-->
            <#if field.bean.enum>
        local ${field.name}DataSize = buf:ReadVar32();
        self.${field.name} = {};
        local receive${field.name?cap_first}DataSize = 0;
        local read${field.name?cap_first}Index = 1;
        while(receive${field.name?cap_first}DataSize < ${field.name}DataSize ) do
            local temp${field.name?cap_first} = buf:ReadVar32();
            receive${field.name?cap_first}DataSize = receive${field.name?cap_first}DataSize + buf:ComputeVar32Size(temp${field.name?cap_first});
            self.${field.name}[read${field.name?cap_first}Index] = ${field.bean.lua.namespace}.${field.bean.lua.name}.checkReadValue(temp${field.name?cap_first});
            read${field.name?cap_first}Index = read${field.name?cap_first}Index + 1;
        end
                <#else >
        self.${field.name} = self.${field.name} or {};
        self.read${field.name?cap_first}Index = self.read${field.name?cap_first}Index or 1;
        local temp${field.bean.lua.namespace}${field.bean.name} = ${field.bean.lua.namespace}.${field.bean.lua.name}:new()
        temp${field.bean.lua.namespace}${field.bean.lua.name}:read(buf,buf:ReadVar32()+buf:ReaderIndex())
        self.${field.name}[self.read${field.name?cap_first}Index]  = temp${field.bean.lua.namespace}${field.bean.name};
        self.read${field.name?cap_first}Index  = self.read${field.name?cap_first}Index  + 1;
            </#if>
        </#if><#--bean-->
    <#else><#--不是list-->
        <#if field.fieldType="boolean">
        self.${field.name} = buf:ReadBoolean();
        <#elseif field.fieldType="int">
        self.${field.name} = buf:ReadVar32();
        <#elseif field.fieldType="long">
        self.${field.name} = buf:ReadVar64();
        <#elseif field.fieldType="sint">
        self.${field.name} = buf:ReadSInt();
        <#elseif field.fieldType="slong">
        self.${field.name} = buf:ReadSLong();
        <#elseif field.fieldType="float">
        self.${field.name} = buf:ReadFloat();
        <#elseif field.fieldType="double">
        self.${field.name} = buf:ReadDouble();
        <#elseif field.fieldType="sfixed32">
        self.${field.name} = buf:ReadSFixed32();
        <#elseif field.fieldType="sfixed64">
        self.${field.name} = buf:ReadSFixed64();
        <#elseif field.fieldType="String">
        self.${field.name} = buf:ReadString();
        <#else>
            <#if field.bean.enum>
        self.${field.name}=${field.bean.lua.namespace}.${field.bean.lua.name}.checkReadValue(buf:ReadVar32());
            <#else >
        self.${field.name} = ${field.bean.lua.namespace}.${field.bean.lua.name}:new()
        self.${field.name}:read(buf,buf:ReadVar32()+buf:ReaderIndex())
            </#if>
        </#if>
    </#if>
    end <#if  field_has_next>,</#if>
</#list>
    }
    while(true) do
        local tag = buf:ReadTag(endIndex);
        if(tag == 0) then
            return;
        else
            local case = switch[tag];
            if(case) then
                case();
            else
                buf:Skip(tag);
            end
        end
    end
end

--${bean.lua.namespace}.${bean.lua.name}计算序列化大小
function ${bean.lua.namespace}.${bean.lua.name}:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
<#list bean.fields as field>
    <#if field.hasExplain>
    -- ${field.explain}
    </#if>
    <#if field.list>
        <#if field.baseField>
            <#if field.javaType!="String">
    if self.${field.name} then
        local ${field.name}_len = #self.${field.name}
        local ${field.name}DataSize = 0;
        if ${field.name}_len > 0 then
            for i = 1, ${field.name}_len do
                <#if field.fieldType="boolean">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeBooleanSizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="int">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeVar32SizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="long">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeVar64SizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="sint">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeSIntSizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="slong">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeSLongSizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="float">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeFloatSizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="double">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeDoubleSizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="sfixed32">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeSFixed32SizeNoTag(self.${field.name}[i] );
                <#elseif field.fieldType="sfixed64">
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeSFixed64SizeNoTag(self.${field.name}[i] );
                </#if><#--多个选项的-->
            end
        end
        self.${field.name}SerializedSize = ${field.name}DataSize;
        if ${field.name}DataSize > 0 then
            -- tag size 已经完成了计算 ${field.tag}
            size = size + ${var32Size(field.tag)} + self.${field.name}SerializedSize + buf:ComputeVar32SizeNoTag(self.${field.name}SerializedSize);
        end
    end
            <#else ><#--String-->
        if self.${field.name} then
            local ${field.name}_len = #self.${field.name}
            if ${field.name}_len > 0 then
            for i = 1, ${field.name}_len do
                -- tag size 已经完成了计算 ${field.tag}
                size = size + ${var32Size(field.tag)} + buf:ComputeStringSizeNoTag(self.${field.name}[i] );
            end
        end
    end
            </#if><#--String-->
        <#else ><#--bean-->
            <#if field.bean.enum>
    if self.${field.name} then
        local ${field.name}DataSize = 0;
        local ${field.name}_len = #self.${field.name}
        if ${field.name}_len > 0 then
            for i = 1, ${field.name}_len do
                ${field.name}DataSize = ${field.name}DataSize + buf:ComputeVar32SizeNoTag(self.${field.name}[i] );
            end
        end
        self.${field.name}SerializedSize = ${field.name}DataSize;
        if ${field.name}DataSize > 0 then
            -- tag size 已经完成了计算 ${field.tag}
            size = size + ${var32Size(field.tag)} + self.${field.name}SerializedSize + buf:ComputeVar32SizeNoTag(self.${field.name}SerializedSize);
        end
    end
                <#else >
    if self.${field.name} then
        local ${field.name}_len = #self.${field.name}
        if ${field.name}_len > 0 then
            for i = 1, ${field.name}_len do
                local ${field.name}BeanSize = self.${field.name}[i]:getSerializedSize(buf)
                -- tag size 已经完成了计算 ${field.tag}
                size = size + ${field.name}BeanSize + buf:ComputeVar32Size(${var32Size(field.tag)},${field.name}BeanSize);
            end
        end
    end
            </#if>
        </#if><#--bean-->
    <#else><#--不是list-->
        <#if field.fieldType="boolean">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeBooleanSize(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="int">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeVar32Size(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="long">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeVar64Size(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="sint">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeSIntSize(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="slong">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeSLongSize(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="float">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeFloatSize(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="double">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeDoubleSize(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="sfixed32">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeSFixed32Size(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="sfixed64">
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeSFixed64Size(${var32Size(field.tag)}, self.${field.name});
        <#elseif field.fieldType="String">
    if self.${field.name} then
        -- tag size 已经完成了计算 ${field.tag}
        size = size + buf:ComputeStringSize(${var32Size(field.tag)}, self.${field.name});
    end
        <#else>
            <#if field.bean.enum>
    -- tag size 已经完成了计算 ${field.tag}
    size = size + buf:ComputeVar32Size(${var32Size(field.tag)}, self.${field.name});
                <#else >
    if self.${field.name} then
        local ${field.name}BeanSize = self.${field.name}:getSerializedSize(buf)
        -- tag size 已经完成了计算 ${field.tag}
        size = size + ${field.name}BeanSize + buf:ComputeVar32Size(${var32Size(field.tag)}, ${field.name}BeanSize);
    end
            </#if>
        </#if>
    </#if>
</#list>
    self.serializedSize = size ;
    return size ;
end

--${bean.lua.namespace}.${bean.lua.name}格式化字符串
function ${bean.lua.namespace}.${bean.lua.name}:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "${bean.lua.name}<#if bean.type != "NA">[${bean.id?c}]</#if>" .. "{"
<#list bean.fields as field>
    <#if field.hasExplain>
    --${field.explain}
    </#if>
    _str = _str .. "\n"
    <#if field.list>
    _str = _str .. _indent .. rightPad("${field.name}", self._filedPad) .. " = "
    if self.${field.name} then
        local ${field.name}_len = #self.${field.name}
        if ${field.name}_len > 0 then
            _str = _str .. "["
            for i = 1,${field.name}_len do
                _str = _str .. "\n"
        <#if field.baseField>
                _str = _str .. self._next_indent
            <#if field.fieldType="boolean">
                _str = _str .. _indent .. tostring(self.${field.name}[i])
            <#else >
                _str = _str .. _indent .. self.${field.name}[i]
            </#if>
        <#else>
            <#if field.bean.enum>
                _str = _str .. self._next_indent
                _str = _str .._indent .. ${field.bean.lua.namespace}.${field.bean.lua.name}.valueToStr(self.${field.name}[i])
                <#else >
                _str = _str .. self._next_indent
                _str = _str .. _indent .. self.${field.name}[i]:toString(_indent .. self._next_indent)
            </#if>
        </#if>
            end
            _str = _str .. "\n"
            _str = _str .. self._next_indent
            _str = _str .. _indent .. "]"
        else<#-- len = 0-->
            _str = _str .. "nil "
        end
    else <#-- nil-->
        _str = _str .. "nil "
    end
    <#else ><#-- 不是list-->
        <#if field.baseField>
            <#if field.fieldType="boolean">
    _str = _str .. _indent .. rightPad("${field.name}", self._filedPad) .. " = " .. tostring(self.${field.name})
            <#else >
    _str = _str .. _indent .. rightPad("${field.name}",self._filedPad) .. " = " .. self.${field.name}
            </#if>
        <#else>
            <#if field.bean.enum>
    _str = _str .. _indent .. rightPad("${field.name}",self._filedPad) .. " = " .. ${field.bean.lua.namespace}.${field.bean.lua.name}.valueToStr(self.${field.name})
                <#else >
    if self.${field.name} then
        _str = _str .. _indent .. rightPad("${field.name}", self._filedPad) .. " = " .. self.${field.name}:toString(_indent .. self._next_indent)
    else
        _str = _str .. _indent .. rightPad("${field.name}", self._filedPad) .. " = " .. "nil"
    end
            </#if>
        </#if>
    </#if>
</#list>
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end

