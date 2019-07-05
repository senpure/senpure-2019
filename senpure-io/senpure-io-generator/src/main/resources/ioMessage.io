namespace com.senpure.io;
javaPack  com.senpure.io;

bean HandleMessage {
    int     handleMessageId;            //可以处理的消息ID
    String  messageClasses;             //消息类名
    boolean serverShare;                //是否共享messageId 不同的服务都可以处理"
    boolean direct;                     //true网关直接选择服务器转发，false 网关会对所有处理该消息的服务器进行一次询问
}

bean IdName {
    int    id;                          //消息id
    String messageName;                 //有意义的字符串
}

//服务器注册消息处理器到网关
message SC RegServerHandleMessage 102 {
    String           serverName;         //服务名
    String           serverKey;          //服务实例唯一标识
    String           readableServerName; //服务名
    HandleMessage [] messages;           //可以处理的消息
}

//数字id与字符串的关联
message SC IdName 104 {
    IdName [] idNames;
}

//关联用户与网关
message CS RelationUserGateway 105 {
    long token;                         // channel token
    long userId;                        //userId
    long relationToken;                 //relation token
}

message CS BreakUserGateway 107 {
    long   token;                       //channel token
    long   userId;                      //用户Id
    long   relationToken;               //relation token
    String type;                        //error,userChange,userOffline
}

//断开用户与网关
message SC BreakUserGateway 108 {
}

message CS AskHandle 109 {
    long   token;                       // token
    int    fromMessageId;
    String value;                       //值
}

message SC AskHandle 110 {
    boolean handle;                     //是否可以处理
    long    token;                      // token
    int     fromMessageId;
    String  value;                      //值
}

message SC KickOff 112 {
    long token;                         // token
    long userId;                        //userId
}

//心跳
message CS Heart 65 {
}

//心跳
message SC Heart 66 {
}

//服务器内部错误提示
message SC InnerError 100 {
    String type;                        //错误类型
    String message;                     //提示内容
    int    id;                          //消息id
    String value;                       //ask的value
}