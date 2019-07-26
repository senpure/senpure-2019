package com.senpure.io.message;

import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;

/**
 * 网关注册处理消息返回
 * 
 * @author senpure
 * @time 2019-7-26 15:22:52
 */
public class CSRegServerHandleMessageMessage extends  Message {

    public static final int MESSAGE_ID = 101;
    private boolean success;
    private String message;
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        writeBoolean(buf,8,success);
        if (message != null){
            writeString(buf,19,message);
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
                case 8:// 1 << 3 | 0
                    success = readBoolean(buf);
                    break;
                case 19:// 2 << 3 | 3
                    message = readString(buf);
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
        size += computeBooleanSize(1,success);
        if (message != null){
            size += computeStringSize(1,message);
        }
        serializedSize = size ;
        return size ;
    }

    public  boolean  isSuccess() {
        return success;
    }

    public CSRegServerHandleMessageMessage setSuccess(boolean success) {
        this.success=success;
        return this;
    }
    public  String getMessage() {
        return message;
    }

    public CSRegServerHandleMessageMessage setMessage(String message) {
        this.message=message;
        return this;
    }

    @Override
    public int getMessageId() {
        return 101;
    }

    @Override
    public String toString() {
        return "CSRegServerHandleMessageMessage[101]{"
                +"success=" + success
                +",message=" + message
                + "}";
   }


    @Override
    public String toString(String indent) {
        //最长字段长度 7
        int filedPad = 7;
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("CSRegServerHandleMessageMessage").append("[101]").append("{");
        sb.append("\n");
        sb.append(indent).append(rightPad("success", filedPad)).append(" = ").append(success);
        sb.append("\n");
        sb.append(indent).append(rightPad("message", filedPad)).append(" = ").append(message);
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}