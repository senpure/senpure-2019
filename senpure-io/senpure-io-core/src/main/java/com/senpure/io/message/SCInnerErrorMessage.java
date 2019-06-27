package com.senpure.io.message;

import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;

/**
 * 服务器内部错误提示
 * 
 * @author senpure
 * @time 2019-6-26 20:21:14
 */
public class SCInnerErrorMessage extends  Message {

    public static final int MESSAGE_ID = 100;
    //请求id
    private int requestId;
    //错误类型
    private String type;
    //提示内容
    private String message;
    //消息id
    private int id;
    private String value;
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        //请求id
        writeVar32(buf,8,requestId);
        //错误类型
        if (type != null){
            writeString(buf,19,type);
        }
        //提示内容
        if (message != null){
            writeString(buf,27,message);
        }
        //消息id
        writeVar32(buf,32,id);
        if (value != null){
            writeString(buf,43,value);
        }
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
                //请求id
                case 8:// 1 << 3 | 0
                    requestId = readVar32(buf);
                    break;
                //错误类型
                case 19:// 2 << 3 | 3
                    type = readString(buf);
                    break;
                //提示内容
                case 27:// 3 << 3 | 3
                    message = readString(buf);
                    break;
                //消息id
                case 32:// 4 << 3 | 0
                    id = readVar32(buf);
                    break;
                case 43:// 5 << 3 | 3
                    value = readString(buf);
                    break;
                default://skip
                    skip(buf, tag);
                    break;
            }
        }
    }

    private int serializedSize = -1;

    @Override
    public int getSerializedSize(){
        int size = serializedSize ;
        if (size != -1 ){
            return size;
        }
        size = 0 ;
        //请求id
        size += computeVar32Size(1,requestId);
        //错误类型
        if (type != null){
            size += computeStringSize(1,type);
        }
        //提示内容
        if (message != null){
            size += computeStringSize(1,message);
        }
        //消息id
        size += computeVar32Size(1,id);
        if (value != null){
            size += computeStringSize(1,value);
        }
        serializedSize = size ;
        return size ;
    }

    /**
     * get 请求id
     * @return
     */
    public  int getRequestId() {
        return requestId;
    }

    /**
     * set 请求id
     */
    public SCInnerErrorMessage setRequestId(int requestId) {
        this.requestId=requestId;
        return this;
    }
    /**
     * get 错误类型
     * @return
     */
    public  String getType() {
        return type;
    }

    /**
     * set 错误类型
     */
    public SCInnerErrorMessage setType(String type) {
        this.type=type;
        return this;
    }
    /**
     * get 提示内容
     * @return
     */
    public  String getMessage() {
        return message;
    }

    /**
     * set 提示内容
     */
    public SCInnerErrorMessage setMessage(String message) {
        this.message=message;
        return this;
    }
    /**
     * get 消息id
     * @return
     */
    public  int getId() {
        return id;
    }

    /**
     * set 消息id
     */
    public SCInnerErrorMessage setId(int id) {
        this.id=id;
        return this;
    }
    public  String getValue() {
        return value;
    }

    public SCInnerErrorMessage setValue(String value) {
        this.value=value;
        return this;
    }

    @Override
    public int getMessageId() {
        return 100;
    }

    @Override
    public String toString() {
        return "SCInnerErrorMessage[100]{"
                +"requestId=" + requestId
                +",type=" + type
                +",message=" + message
                +",id=" + id
                +",value=" + value
                + "}";
   }

    //最长字段长度 9
    private int filedPad = 9;

    @Override
    public String toString(String indent) {
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("SCInnerErrorMessage").append("[100]").append("{");
        //请求id
        sb.append("\n");
        sb.append(indent).append(rightPad("requestId", filedPad)).append(" = ").append(requestId);
        //错误类型
        sb.append("\n");
        sb.append(indent).append(rightPad("type", filedPad)).append(" = ").append(type);
        //提示内容
        sb.append("\n");
        sb.append(indent).append(rightPad("message", filedPad)).append(" = ").append(message);
        //消息id
        sb.append("\n");
        sb.append(indent).append(rightPad("id", filedPad)).append(" = ").append(id);
        sb.append("\n");
        sb.append(indent).append(rightPad("value", filedPad)).append(" = ").append(value);
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}