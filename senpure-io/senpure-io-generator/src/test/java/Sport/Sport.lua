--[[
author    senpure
version   2019-8-16 16:49:06

enum    : Sport.Gender          性别
enum    : Sport.ChatType        
enum    : Sport.ErrorType       错误信息类型

bean    : Sport.Player          运动员
bean    : Sport.Chat            聊天信息

message : Sport.SCErrorMessage  1000500  
--]]

Sport = Sport or {}

    --[[
    性别
    --]]
Sport.Gender = {
    --[Comment]
    --男
    MALE = 1,
    --[Comment]
    --女
    FEMALE = 2,
    UNKNOWN = -1,
    genderValues = {
        [1] = 1,
        [2] = 2
    },
    genderStr = {
        [1] = "MALE",
        [2] = "FEMALE"
    },
    checkReadValue = function(value)
        local v = Sport.Gender.genderValues[value]
        if v then
            return v
        else
            return -1;
        end
    end,
    valueToStr = function(value)
        local v = Sport.Gender.genderStr[value]
        if v then
            return v
        else
            return "UNKNOWN";
        end
    end
}
Sport.ChatType = {
    --[Comment]
    --文字
    STR = 1,
    --[Comment]
    --语音
    VOICE = 2,
    UNKNOWN = -1,
    chatTypeValues = {
        [1] = 1,
        [2] = 2
    },
    chatTypeStr = {
        [1] = "STR",
        [2] = "VOICE"
    },
    checkReadValue = function(value)
        local v = Sport.ChatType.chatTypeValues[value]
        if v then
            return v
        else
            return -1;
        end
    end,
    valueToStr = function(value)
        local v = Sport.ChatType.chatTypeStr[value]
        if v then
            return v
        else
            return "UNKNOWN";
        end
    end
}
    --[[
    错误信息类型
    --]]
Sport.ErrorType = {
    --[Comment]
    --文字提示
    NORMAL = 1,
    --[Comment]
    --弹出确认框
    CONFIRM = 2,
    --[Comment]
    --关闭程序
    CLOSE = 3,
    UNKNOWN = -1,
    errorTypeValues = {
        [1] = 1,
        [2] = 2,
        [3] = 3
    },
    errorTypeStr = {
        [1] = "NORMAL",
        [2] = "CONFIRM",
        [3] = "CLOSE"
    },
    checkReadValue = function(value)
        local v = Sport.ErrorType.errorTypeValues[value]
        if v then
            return v
        else
            return -1;
        end
    end,
    valueToStr = function(value)
        local v = Sport.ErrorType.errorTypeStr[value]
        if v then
            return v
        else
            return "UNKNOWN";
        end
    end
}

--[[
    运动员
--]]
Sport.Player = {
    --[Comment]
    --类型:long   
    id = 0;
    --[Comment]
    --类型:int    
    age = 0;
    --[Comment]
    --类型:String 
    nick = "";
    --[Comment]
    --类型:Sport.Gender 
    gender= Sport.Gender.MALE;
    serializedSize = -1;
    --格式化时统一字段长度
    _filedPad = 6 ;
}

--Sport.Player构造方法
function Sport.Player:new()
    local player = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:long   
    player.id = 0;
    --[Comment]
    --类型:int    
    player.age = 0;
    --[Comment]
    --类型:String 
    player.nick = "";
    --[Comment]
    --类型:SportGender 
    player.gender = Sport.Gender.MALE;
    player.serializedSize = -1;
    return player;
end

--Sport.Player写入字节缓存
function Sport.Player:write(buf)
    self:getSerializedSize(buf);
    buf:WriteVar64(8, self.id);
    buf:WriteVar32(16, self.age);
    if self.nick then
        buf:WriteString(27, self.nick);
    end
    if self.gender then
        buf:WriteVar32(35, self.gender);
    end
end

--Sport.Player读取字节缓存
function Sport.Player:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 0
        [8] = function ()
        self.id = buf:ReadVar64();
    end ,
        -- 2 << 3 | 0
        [16] = function ()
        self.age = buf:ReadVar32();
    end ,
        -- 3 << 3 | 3
        [27] = function ()
        self.nick = buf:ReadString();
    end ,
        -- 4 << 3 | 3
        [35] = function ()
        self.gender=Sport.Gender.checkReadValue(buf:ReadVar32());
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

--Sport.Player计算序列化大小
function Sport.Player:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    -- tag size 已经完成了计算 8
    size = size + buf:ComputeVar64Size(1, self.id);
    -- tag size 已经完成了计算 16
    size = size + buf:ComputeVar32Size(1, self.age);
    if self.nick then
        -- tag size 已经完成了计算 27
        size = size + buf:ComputeStringSize(1, self.nick);
    end
    -- tag size 已经完成了计算 35
    size = size + buf:ComputeVar32Size(1, self.gender);
    self.serializedSize = size ;
    return size ;
end

--Sport.Player格式化字符串
function Sport.Player:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "Player" .. "{"
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("id",self._filedPad) .. " = " .. self.id
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("age",self._filedPad) .. " = " .. self.age
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("nick",self._filedPad) .. " = " .. self.nick
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("gender",self._filedPad) .. " = " .. Sport.Gender.valueToStr(self.gender)
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end

--[[
    聊天信息
--]]
Sport.Chat = {
    --[Comment]
    --类型:Sport.ChatType 
    type= Sport.ChatType.STR;
    --[Comment]
    --类型:String 
    value = "";
    serializedSize = -1;
    --格式化时统一字段长度
    _filedPad = 5 ;
}

--Sport.Chat构造方法
function Sport.Chat:new()
    local chat = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:SportChatType 
    chat.type = Sport.ChatType.STR;
    --[Comment]
    --类型:String 
    chat.value = "";
    chat.serializedSize = -1;
    return chat;
end

--Sport.Chat写入字节缓存
function Sport.Chat:write(buf)
    self:getSerializedSize(buf);
    if self.type then
        buf:WriteVar32(11, self.type);
    end
    if self.value then
        buf:WriteString(19, self.value);
    end
end

--Sport.Chat读取字节缓存
function Sport.Chat:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 3
        [11] = function ()
        self.type=Sport.ChatType.checkReadValue(buf:ReadVar32());
    end ,
        -- 2 << 3 | 3
        [19] = function ()
        self.value = buf:ReadString();
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

--Sport.Chat计算序列化大小
function Sport.Chat:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    -- tag size 已经完成了计算 11
    size = size + buf:ComputeVar32Size(1, self.type);
    if self.value then
        -- tag size 已经完成了计算 19
        size = size + buf:ComputeStringSize(1, self.value);
    end
    self.serializedSize = size ;
    return size ;
end

--Sport.Chat格式化字符串
function Sport.Chat:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "Chat" .. "{"
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("type",self._filedPad) .. " = " .. Sport.ChatType.valueToStr(self.type)
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("value",self._filedPad) .. " = " .. self.value
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end


Sport.SCErrorMessage = {
    --[Comment]
    --message_id
    messageId = 1000500;
    --[Comment]
    --类型:Sport.ErrorType 
    type= Sport.ErrorType.NORMAL;
    --[Comment]
    --类型:String 提示字符串
    value = "";
    --[Comment]
    --list:String 参数
    args = nil;
    serializedSize = -1;
    --缩进5 + 3 = 8 个空格
    _next_indent = "        ";
    --格式化时统一字段长度
    _filedPad = 5 ;
}

--Sport.SCErrorMessage构造方法
function Sport.SCErrorMessage:new()
    local scErrorMessage = setmetatable({}, {__index=self}) ;
    --[Comment]
    --类型:SportErrorType 
    scErrorMessage.type = Sport.ErrorType.NORMAL;
    --[Comment]
    --类型:String 提示字符串
    scErrorMessage.value = "";
    --[Comment]
    --list:String 参数
    scErrorMessage.args = nil;
    scErrorMessage.serializedSize = -1;
    return scErrorMessage;
end

--Sport.SCErrorMessage写入字节缓存
function Sport.SCErrorMessage:write(buf)
    self:getSerializedSize(buf);
    if self.type then
        buf:WriteVar32(11, self.type);
    end
    --提示字符串
    if self.value then
        buf:WriteString(19, self.value);
    end
    --参数
    if self.args then
        local args_len = #self.args;
        for i = 1,args_len do
            buf:WriteString(27, self.args[i]);
        end
    end
end

--Sport.SCErrorMessage读取字节缓存
function Sport.SCErrorMessage:read(buf,endIndex)
    local switch = {
        -- 1 << 3 | 3
        [11] = function ()
        self.type=Sport.ErrorType.checkReadValue(buf:ReadVar32());
    end ,
        -- 提示字符串
        -- 2 << 3 | 3
        [19] = function ()
        self.value = buf:ReadString();
    end ,
        -- 参数
        -- 3 << 3 | 3
        [27] = function ()
        self.args = self.args or {};
        self.readArgsIndex = self.readArgsIndex or 1;
        self.args[self.readArgsIndex] = buf:ReadString();
        self.readArgsIndex = self.readArgsIndex + 1;
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

--Sport.SCErrorMessage计算序列化大小
function Sport.SCErrorMessage:getSerializedSize(buf)
    local size = self.serializedSize;
    if (size > -1) then
        return size;
    end
    size = 0;
    -- tag size 已经完成了计算 11
    size = size + buf:ComputeVar32Size(1, self.type);
    -- 提示字符串
    if self.value then
        -- tag size 已经完成了计算 19
        size = size + buf:ComputeStringSize(1, self.value);
    end
    -- 参数
        if self.args then
            local args_len = #self.args
            if args_len > 0 then
            for i = 1, args_len do
                -- tag size 已经完成了计算 27
                size = size + 1 + buf:ComputeStringSizeNoTag(self.args[i] );
            end
        end
    end
    self.serializedSize = size ;
    return size ;
end

--Sport.SCErrorMessage格式化字符串
function Sport.SCErrorMessage:toString(_indent)
    _indent = _indent or ""
    local _str = ""
    _str = _str .. "SCErrorMessage[1000500]" .. "{"
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("type",self._filedPad) .. " = " .. Sport.ErrorType.valueToStr(self.type)
    --提示字符串
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("value",self._filedPad) .. " = " .. self.value
    --参数
    _str = _str .. "\n"
    _str = _str .. _indent .. rightPad("args", self._filedPad) .. " = "
    if self.args then
        local args_len = #self.args
        if args_len > 0 then
            _str = _str .. "["
            for i = 1,args_len do
                _str = _str .. "\n"
                _str = _str .. self._next_indent
                _str = _str .. _indent .. self.args[i]
            end
            _str = _str .. "\n"
            _str = _str .. self._next_indent
            _str = _str .. _indent .. "]"
        else
            _str = _str .. "nil "
        end
    else 
        _str = _str .. "nil "
    end
    _str =_str .. "\n"
    _str = _str .. _indent .. "}"
    return _str
end


ConsumerManager.regMessageDecoder(Sport.SCErrorMessage.messageId,
        {
            getEmptyMessage = function()
                return Sport.SCErrorMessage:new();
            end
        },"Sport.SCErrorMessage");
