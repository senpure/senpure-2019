package abc2.bean;

import com.senpure.io.protocol.Bean;
import io.netty.buffer.ByteBuf;

/**
 * 注释
 * 
 * @author senpure
 * @time 2019-6-24 15:38:05
 */
public class Student extends  Bean {
    //age
    private int age;//index =1
    private String name;//2
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        //age
        writeVar32(buf,8,age);
        if (name != null){
            writeString(buf,19,name);
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
                //age
                case 8:// 1 << 3 | 0
                    age = readVar32(buf);
                    break;
                case 19:// 2 << 3 | 3
                    name = readString(buf);
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
        //age
        size += computeVar32Size(1,age);
        if (name != null){
            size += computeStringSize(1,name);
        }
        serializedSize = size ;
        return size ;
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
    public Student setAge(int age) {
        this.age=age;
        return this;
    }
    public  String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name=name;
        return this;
    }

    @Override
    public String toString() {
        return "Student{"
                +"age=" + age
                +",name=" + name
                + "}";
   }

    //最长字段长度 4
    private int filedPad = 4;

    @Override
    public String toString(String indent) {
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("Student").append("{");
        //age
        sb.append("\n");
        sb.append(indent).append(rightPad("age", filedPad)).append(" = ").append(age);
        sb.append("\n");
        sb.append(indent).append(rightPad("name", filedPad)).append(" = ").append(name);
        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}