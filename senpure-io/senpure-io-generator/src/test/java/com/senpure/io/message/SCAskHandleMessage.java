package com.senpure.io.message;

import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;

/**
 * @author senpure
 * @time 2019-7-5 10:38:23
 */
public class SCAskHandleMessage extends  Message {

    public static final int MESSAGE_ID = 110;
    //是否可以处理
    private boolean handle;
    //token
    private long token;
    private int fromMessageId;
    //值
    private String value;
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        //是否可以处理
        writeBoolean(buf,8,handle);
        //token
        writeVar64(buf,16,token);
        writeVar32(buf,24,fromMessageId);
        //值
        if (value != null){
            writeString(buf,35,value);
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
                //是否可以处理
                case 8:// 1 << 3 | 0
                    handle = readBoolean(buf);
                    break;
                //token
                case 16:// 2 << 3 | 0
                    token = readVar64(buf);
                    break;
                case 24:// 3 << 3 | 0
                    fromMessageId = readVar32(buf);
                    break;
                //值
                case 35:// 4 << 3 | 3
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
        //是否可以处理
        size += computeBooleanSize(1,handle);
        //token
        size += computeVar64Size(1,token);
        size += computeVar32Size(1,fromMessageId);
        //值
        if (value != null){
            size += computeStringSize(1,value);
        }
        serializedSize = size ;
        return size ;
    }

    /**
     *  is 是否可以处理
     * @return
     */
    public  boolean  isHandle() {
        return handle;
    }

    /**
     * set 是否可以处理
     */
    public SCAskHandleMessage setHandle(boolean handle) {
        this.handle=handle;
        return this;
    }
    /**
     * get token
     * @return
     */
    public  long getToken() {
        return token;
    }

    /**
     * set token
     */
    public SCAskHandleMessage setToken(long token) {
        this.token=token;
        return this;
    }
    public  int getFromMessageId() {
        return fromMessageId;
    }

    public SCAskHandleMessage setFromMessageId(int fromMessageId) {
        this.fromMessageId=fromMessageId;
        return this;
    }
    public  String getValue() {
        return value;
    }

    public SCAskHandleMessage setValue(String value) {
        this.value=value;
        return this;
    }

    @Override
    public int getMessageId() {
        return 110;
    }

    @Override
    public String toString() {
        return "SCAskHandleMessage[110]{"
                +"handle=" + handle
                +",token=" + token
                +",fromMessageId=" + fromMessageId
                +",value=" + value
                + "}";
   }


    @Override
    public String toString(String indent) {
        //最长字段长度 13
        int filedPad = 13;
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("SCAskHandleMessage").append("[110]").append("{");
        //是否可以处理
        sb.append("\n");
        sb.append(indent).append(rightPad("handle", filedPad)).append(" = ").append(handle);
        //token
        sb.append("\n");
        sb.append(indent).append(rightPad("token", filedPad)).append(" = ").append(token);
        sb.append("\n");
        sb.append(indent).append(rightPad("fromMessageId", filedPad)).append(" = ").append(fromMessageId);
        //值
        sb.append("\n");
        sb.append(indent).append(rightPad("value", filedPad)).append(" = ").append(value);
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}