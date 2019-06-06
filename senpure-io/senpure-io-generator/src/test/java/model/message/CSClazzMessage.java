package model.message;

import model.bean.Sexy;
import model.bean.Student;
import com.senpure.io.protocol.Message;
import io.netty.buffer.ByteBuf;

import java.util.List;
import java.util.ArrayList;

/**
 * 7788
 * 
 * @author senpure
 * @time 2019-6-5 17:27:14
 */
public class CSClazzMessage extends  Message {

    public static final int MESSAGE_ID = 1001;
    //汉子
    private int na;
    //age
    private int age;
    private Sexy sexy;
    private List<Student> students = new ArrayList(16);
    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuf buf){
        getSerializedSize();
        //汉子
        writeVar32(buf,8,na);
        //age
        writeVar32(buf,16,age);
        if (sexy!= null){
            writeVar32(buf,27,sexy.getValue());
        }
        for (int i= 0;i< students.size();i++){
             writeBean(buf,35,students.get(i));
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
                //汉子
                case 8:// 1 << 3 | 0
                    na = readVar32(buf);
                    break;
                //age
                case 16:// 2 << 3 | 0
                    age = readVar32(buf);
                    break;
                case 27:// 3 << 3 | 3
                    sexy = Sexy.getSexy( readVar32(buf)) ;

                    break;
                case 35:// 4 << 3 | 3
                    Student tempStudentsBean = new Student();
                    readBean(buf,tempStudentsBean);
                    students.add(tempStudentsBean);
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
        //汉子
        size += computeVar32Size(1,na);
        //age
        size += computeVar32Size(1,age);
        if (sexy != null){
            size += computeVar32Size(1,sexy.getValue());
        }
        for(int i=0;i< students.size();i++){
            size += computeBeanSize(1,students.get(i));
        }
        serializedSize = size ;
        return size ;
    }

    /**
     * get 汉子
     * @return
     */
    public  int getNa() {
        return na;
    }

    /**
     * set 汉子
     */
    public CSClazzMessage setNa(int na) {
        this.na=na;
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
    public CSClazzMessage setAge(int age) {
        this.age=age;
        return this;
    }
    public  Sexy getSexy() {
        return sexy;
    }

    public CSClazzMessage setSexy(Sexy sexy) {
        this.sexy=sexy;
        return this;
    }
    public List<Student> getStudents(){
        return students;
    }
    public CSClazzMessage setStudents (List<Student> students){
        if(students == null){
        this.students = new ArrayList(16);
            return this;
        }
        this.students=students;
        return this;
    }


    @Override
    public int getMessageId() {
        return 1001;
    }

    @Override
    public String toString() {
        return "CSClazzMessage[1001]{"
                +"na=" + na
                +",age=" + age
                +",sexy=" + sexy
                +",students=" + students
                + "}";
   }

    //8 + 3 = 11 个空格
    private String nextIndent ="           ";
    //最长字段长度 8
    private int filedPad = 8;

    @Override
    public String toString(String indent) {
        indent = indent == null ? "" : indent;
        StringBuilder sb = new StringBuilder();
        sb.append("CSClazzMessage").append("[1001]").append("{");
        //汉子
        sb.append("\n");
        sb.append(indent).append(rightPad("na", filedPad)).append(" = ").append(na);
        //age
        sb.append("\n");
        sb.append(indent).append(rightPad("age", filedPad)).append(" = ").append(age);
        sb.append("\n");
        sb.append(indent).append(rightPad("sexy", filedPad)).append(" = ");
        if(sexy!=null){
            sb.append(sexy);
        } else {
            sb.append("null");
        }
        sb.append("\n");
        sb.append(indent).append(rightPad("students", filedPad)).append(" = ");
        int studentsSize = students.size();
        if (studentsSize > 0) {
            sb.append("[");
            for (int i = 0; i<studentsSize;i++) {
                sb.append("\n");
                sb.append(nextIndent);
                sb.append(indent).append(students.get(i).toString(indent + nextIndent));
            }
            sb.append("\n");
            sb.append(nextIndent);
            sb.append(indent).append("]");
        }else {
            sb.append("null");
        }

        sb.append("\n");
        sb.append(indent).append("}");
        return sb.toString();
    }

}