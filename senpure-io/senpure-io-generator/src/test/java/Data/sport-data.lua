--[[
author    senpure
version   2019-8-16 18:16:15

message : Data.CSLoginMessage   1000101  
message : Data.SCLoginMessage   1000102  
message : Data.CSPlayerMessage  1000105  获取运动员信息
message : Data.SCPlayerMessage  1000106  
--]]

Data = Data or {}



Data.CSLoginMessage = {
    --[Comment]
    --message_id
    messageId = 1000101;
    --[Comment]
    --类型:String 
    id = "";
    --[Comment]
    --类型:String 
    nick = "";
    serializedSize = -1;
    --格式化时统一字段长度
    _filedPad = 4 ;
}

--Data.CSLoginMessage构造方法
function Data.CSLoginMessage:new()
    local csLoginMessage = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:String 
    csLoginMessage.id = "";
    --[Comment]
    --类型:String 
    csLoginMessage.nick = "";
    csLoginMessage.serializedSize = -1;
    return csLoginMessage;
end

--Data.CSLoginMessage写入字节缓存
function Data.CSLoginMessage:write(buf)
    self:getSerializedSize(buf);
    if self.id then
        buf:WriteString(11, self.id);
    end
    if self.nick then
        buf:WriteString(19, self.nick);
    end
end

--Data.CSLoginMessage读取字节缓存
function Data.CSLoginMessage:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 3
        [11] = function ()
        self.id = buf:ReadString();
    end ,
        -- 2 << 3 | 3
        [19] = function ()
        self.nick = buf:ReadString();
    end 
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

--Data.CSLoginMessage计算序列化大小
function Data.CSLoginMessage:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    if self.id then
        -- tag size 已经完成了计算 11
        size = size + buf:ComputeStringSize(1, self.id);
    end
    if self.nick then
        -- tag size 已经完成了计算 19
        size = size + buf:ComputeStringSize(1, self.nick);
    end
    self.serializedSize = size ;
    return size ;
end

--Data.CSLoginMessage格式化字符串
function Data.CSLoginMessage:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "CSLoginMessage[1000101]" .. "{"
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("id",self._filedPad) .. " = " .. self.id
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("nick",self._filedPad) .. " = " .. self.nick
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end

Data.SCLoginMessage = {
    --[Comment]
    --message_id
    messageId = 1000102;
    --[Comment]
    --类型:Sport.Player 
    player = nil ;
    serializedSize = -1;
    --缩进6 + 3 = 9 个空格
    _next_indent = "         ";
    --格式化时统一字段长度
    _filedPad = 6 ;
}

--Data.SCLoginMessage构造方法
function Data.SCLoginMessage:new()
    local scLoginMessage = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:SportPlayer 
    scLoginMessage.player = nil;
    scLoginMessage.serializedSize = -1;
    return scLoginMessage;
end

--Data.SCLoginMessage写入字节缓存
function Data.SCLoginMessage:write(buf)
    self:getSerializedSize(buf);
    if self.player then
        buf:WriteVar32(11);
        buf:WriteVar32(self.player:getSerializedSize(buf));
        self.player:write(buf);
    end
end

--Data.SCLoginMessage读取字节缓存
function Data.SCLoginMessage:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 3
        [11] = function ()
        self.player = Sport.Player:new()
        self.player:read(buf,buf:ReadVar32()+buf:ReaderIndex())
    end 
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

--Data.SCLoginMessage计算序列化大小
function Data.SCLoginMessage:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    if self.player then
        local playerBeanSize = self.player:getSerializedSize(buf)
        -- tag size 已经完成了计算 11
        size = size + playerBeanSize + buf:ComputeVar32Size(1, playerBeanSize);
    end
    self.serializedSize = size ;
    return size ;
end

--Data.SCLoginMessage格式化字符串
function Data.SCLoginMessage:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "SCLoginMessage[1000102]" .. "{"
    _str = _str .. "\n"
    if self.player then
        _str = _str .. _indent .. rightPad("player", self._filedPad) .. " = " .. self.player:toString(_indent .. self._next_indent)
    else
        _str = _str .. _indent .. rightPad("player", self._filedPad) .. " = " .. "nil"
    end
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end

--[[
    获取运动员信息
--]]
Data.CSPlayerMessage = {
    --[Comment]
    --message_id
    messageId = 1000105;
    --[Comment]
    --类型:long   
    playerId = 0;
    serializedSize = -1;
    --格式化时统一字段长度
    _filedPad = 8 ;
}

--Data.CSPlayerMessage构造方法
function Data.CSPlayerMessage:new()
    local csPlayerMessage = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:long   
    csPlayerMessage.playerId = 0;
    csPlayerMessage.serializedSize = -1;
    return csPlayerMessage;
end

--Data.CSPlayerMessage写入字节缓存
function Data.CSPlayerMessage:write(buf)
    self:getSerializedSize(buf);
    buf:WriteVar64(8, self.playerId);
end

--Data.CSPlayerMessage读取字节缓存
function Data.CSPlayerMessage:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 0
        [8] = function ()
        self.playerId = buf:ReadVar64();
    end 
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

--Data.CSPlayerMessage计算序列化大小
function Data.CSPlayerMessage:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    -- tag size 已经完成了计算 8
    size = size + buf:ComputeVar64Size(1, self.playerId);
    self.serializedSize = size ;
    return size ;
end

--Data.CSPlayerMessage格式化字符串
function Data.CSPlayerMessage:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "CSPlayerMessage[1000105]" .. "{"
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("playerId",self._filedPad) .. " = " .. self.playerId
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end

Data.SCPlayerMessage = {
    --[Comment]
    --message_id
    messageId = 1000106;
    --[Comment]
    --类型:Sport.Player 运动员
    player = nil ;
    serializedSize = -1;
    --缩进6 + 3 = 9 个空格
    _next_indent = "         ";
    --格式化时统一字段长度
    _filedPad = 6 ;
}

--Data.SCPlayerMessage构造方法
function Data.SCPlayerMessage:new()
    local scPlayerMessage = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:SportPlayer 运动员
    scPlayerMessage.player = nil;
    scPlayerMessage.serializedSize = -1;
    return scPlayerMessage;
end

--Data.SCPlayerMessage写入字节缓存
function Data.SCPlayerMessage:write(buf)
    self:getSerializedSize(buf);
    --运动员
    if self.player then
        buf:WriteVar32(11);
        buf:WriteVar32(self.player:getSerializedSize(buf));
        self.player:write(buf);
    end
end

--Data.SCPlayerMessage读取字节缓存
function Data.SCPlayerMessage:read(buf,endIndex)
    local switch = {
        -- 运动员
        -- 1 << 3 | 3
        [11] = function ()
        self.player = Sport.Player:new()
        self.player:read(buf,buf:ReadVar32()+buf:ReaderIndex())
    end 
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

--Data.SCPlayerMessage计算序列化大小
function Data.SCPlayerMessage:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    -- 运动员
    if self.player then
        local playerBeanSize = self.player:getSerializedSize(buf)
        -- tag size 已经完成了计算 11
        size = size + playerBeanSize + buf:ComputeVar32Size(1, playerBeanSize);
    end
    self.serializedSize = size ;
    return size ;
end

--Data.SCPlayerMessage格式化字符串
function Data.SCPlayerMessage:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "SCPlayerMessage[1000106]" .. "{"
    --运动员
    _str = _str .. "\n"
    if self.player then
        _str = _str .. _indent .. rightPad("player", self._filedPad) .. " = " .. self.player:toString(_indent .. self._next_indent)
    else
        _str = _str .. _indent .. rightPad("player", self._filedPad) .. " = " .. "nil"
    end
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end


ConsumerManager.regMessageDecoder(Data.SCLoginMessage.messageId,
        {
            getEmptyMessage = function()
                return Data.SCLoginMessage:new();
            end
        },"Data.SCLoginMessage");
ConsumerManager.regMessageDecoder(Data.SCPlayerMessage.messageId,
        {
            getEmptyMessage = function()
                return Data.SCPlayerMessage:new();
            end
        },"Data.SCPlayerMessage");
