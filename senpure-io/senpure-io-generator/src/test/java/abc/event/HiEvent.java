package abc.event;

import com.senpure.io.protocol.Event;
import io.netty.buffer.ByteBuf;

/**
 * @author senpure
 * @time 2019-6-24 15:38:05
 */
public class HiEvent extends  Event {

    public static final int EVENT_ID = 1001;
    //comment
    private int dk;//1
    //age
    private int age;//2
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        //comment
        writeVar32(buf,8,dk);
        //age
        writeVar32(buf,16,age);
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
                //comment
                case 8:// 1 << 3 | 0
                    dk = readVar32(buf);
                    break;
                //age
                case 16:// 2 << 3 | 0
                    age = readVar32(buf);
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
        //comment
        size += computeVar32Size(1,dk);
        //age
        size += computeVar32Size(1,age);
        serializedSize = size ;
        return size ;
    }

    /**
     * get comment
     * @return
     */
    public  int getDk() {
        return dk;
    }

    /**
     * set comment
     */
    public HiEvent setDk(int dk) {
        this.dk=dk;
        return this;
    }
    /**
     * get age
     * @return
     */
    public  int getAge() {
        return age;
    }

    /**
     * set age
     */
    public HiEvent setAge(int age) {
        this.age=age;
        return this;
    }

    @Override
    public int getEventId() {
        return 1001;
    }

    @Override
    public String toString() {
        return "HiEvent[1001]{"
                +"dk=" + dk
                +",age=" + age
                + "}";
   }

    //最长字段长度 3
    private int filedPad = 3;

    @Override
    public String toString(String indent) {
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("HiEvent").append("[1001]").append("{");
        //comment
        sb.append("\n");
        sb.append(indent).append(rightPad("dk", filedPad)).append(" = ").append(dk);
        //age
        sb.append("\n");
        sb.append(indent).append(rightPad("age", filedPad)).append(" = ").append(age);
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}