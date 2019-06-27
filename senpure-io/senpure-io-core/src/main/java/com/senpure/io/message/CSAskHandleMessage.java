package com.senpure.io.message;

import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;

/**
 * @author senpure
 * @time 2019-6-26 20:21:14
 */
public class CSAskHandleMessage extends  Message {

    public static final int MESSAGE_ID = 109;
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
        //token
        writeVar64(buf,8,token);
        writeVar32(buf,16,fromMessageId);
        //值
        if (value != null){
            writeString(buf,27,value);
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
                //token
                case 8:// 1 << 3 | 0
                    token = readVar64(buf);
                    break;
                case 16:// 2 << 3 | 0
                    fromMessageId = readVar32(buf);
                    break;
                //值
                case 27:// 3 << 3 | 3
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
     * get token
     * @return
     */
    public  long getToken() {
        return token;
    }

    /**
     * set token
     */
    public CSAskHandleMessage setToken(long token) {
        this.token=token;
        return this;
    }
    public  int getFromMessageId() {
        return fromMessageId;
    }

    public CSAskHandleMessage setFromMessageId(int fromMessageId) {
        this.fromMessageId=fromMessageId;
        return this;
    }
    public  String getValue() {
        return value;
    }

    public CSAskHandleMessage setValue(String value) {
        this.value=value;
        return this;
    }

    @Override
    public int getMessageId() {
        return 109;
    }

    @Override
    public String toString() {
        return "CSAskHandleMessage[109]{"
                +"token=" + token
                +",fromMessageId=" + fromMessageId
                +",value=" + value
                + "}";
   }

    //最长字段长度 13
    private int filedPad = 13;

    @Override
    public String toString(String indent) {
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("CSAskHandleMessage").append("[109]").append("{");
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