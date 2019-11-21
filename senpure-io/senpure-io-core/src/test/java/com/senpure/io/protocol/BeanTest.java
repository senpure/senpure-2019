package com.senpure.io.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * BeanTest
 *
 * @author senpure
 * @time 2019-09-17 10:13:39
 */
public class BeanTest {

    // public static int TWO_TO_31 = 2147483648;


    @BeforeClass
    public static void before() {
        Unpooled.buffer(50);
    }

    @Test
    public void var32Test() {
        ByteBuf buf = Unpooled.buffer(500);
        for (int i = 0; i < 31; i++) {
            int value = 1 << i;
            int write = -value;
            System.out.println("write var32:" + write);
            Bean.writeVar32(buf, write);
            int read = Bean.readVar32(buf);
            System.out.println("read var32:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write var32:" + write);
            Bean.writeVar32(buf, write);
            read = Bean.readVar32(buf);
            System.out.println("read var32:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        int write = Integer.MIN_VALUE;
        System.out.println("write var32:" + write);
        Bean.writeVar32(buf, write);
        int read = Bean.readVar32(buf);
        System.out.println("read var32:" + read);
        Assert.assertEquals(write, read);
        write = Integer.MAX_VALUE - 1;
        System.out.println("write var32:" + write);
        Bean.writeVar32(buf, write);
        read = Bean.readVar32(buf);
        System.out.println("read var32:" + read);
        Assert.assertEquals(write, read);

    }

    @Test
    public void var64Test() {
        ByteBuf buf = Unpooled.buffer(1000);
        for (long i = 0; i < 63; i++) {
            long value = 1L << i;
            long write = -value;
            System.out.println("write var64:" + write);
            Bean.writeVar64(buf, write);
            long read = Bean.readVar64(buf);
            System.out.println("read var64:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write var64:" + write);
            Bean.writeVar64(buf, write);
            read = Bean.readVar64(buf);
            System.out.println("read var64:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        long write = Long.MIN_VALUE;
        System.out.println("write var64:" + write);
        Bean.writeVar64(buf, write);
        long read = Bean.readVar64(buf);
        System.out.println("read var64:" + read);
        Assert.assertEquals(write, read);
        write = Long.MAX_VALUE;
        System.out.println("write var64:" + write);
        Bean.writeVar64(buf, write);
        read = Bean.readVar64(buf);
        System.out.println("read var64:" + read);
        Assert.assertEquals(write, read);
    }


    @Test
    public void sintTest() {
        ByteBuf buf = Unpooled.buffer(500);
        for (int i = 0; i < 31; i++) {
            int value = 1 << i;
            int write = -value;
            System.out.println("write sint:" + write);
            Bean.writeSint(buf, write);
            int read = Bean.readSint(buf);
            System.out.println("read sint:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write sint:" + write);
            Bean.writeSint(buf, write);
            read = Bean.readSint(buf);
            System.out.println("read sint:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        int write = Integer.MIN_VALUE;
        System.out.println("write sint:" + write);
        Bean.writeSint(buf, write);
        int read = Bean.readSint(buf);
        System.out.println("read sint:" + read);
        Assert.assertEquals(write, read);
        write = Integer.MAX_VALUE - 1;
        System.out.println("write sint:" + write);
        Bean.writeSint(buf, write);
        read = Bean.readSint(buf);
        System.out.println("read sint:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void slongTest() {

        ByteBuf buf = Unpooled.buffer(1000);
        for (long i = 0; i < 63; i++) {
            long value = 1L << i;
            long write = -value;
            System.out.println("write slong:" + write);
            Bean.writeSlong(buf, write);
            long read = Bean.readSlong(buf);
            System.out.println("read slong:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write slong:" + write);
            Bean.writeSlong(buf, write);
            read = Bean.readSlong(buf);
            System.out.println("read slong:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        long write = Long.MIN_VALUE;
        System.out.println("write slong:" + write);
        Bean.writeSlong(buf, write);
        long read = Bean.readSlong(buf);
        System.out.println("read slong:" + read);
        Assert.assertEquals(write, read);
        write = Long.MAX_VALUE;
        System.out.println("write slong:" + write);
        Bean.writeSlong(buf, write);
        read = Bean.readSlong(buf);
        System.out.println("read slong:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void fixed32Test() {
        ByteBuf buf = Unpooled.buffer(500);
        for (int i = 0; i < 31; i++) {
            int value = 1 << i;
            int write = -value;
            System.out.println("write fixed32:" + write);
            Bean.writeFixed32(buf, write);
            int read = Bean.readFixed32(buf);
            System.out.println("read fixed32:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write fixed32:" + write);
            Bean.writeFixed32(buf, write);
            read = Bean.readFixed32(buf);
            System.out.println("read fixed32:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        int write = Integer.MIN_VALUE;
        System.out.println("write fixed32:" + write);
        Bean.writeFixed32(buf, write);
        int read = Bean.readFixed32(buf);
        System.out.println("read fixed32:" + read);
        Assert.assertEquals(write, read);
        write = Integer.MAX_VALUE - 1;
        System.out.println("write fixed32:" + write);
        Bean.writeFixed32(buf, write);
        read = Bean.readFixed32(buf);
        System.out.println("read fixed32:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void fixed64Test() {
        ByteBuf buf = Unpooled.buffer(1000);
        for (long i = 0; i < 63; i++) {
            long value = 1L << i;
            long write = -value;
            System.out.println("write fixed64:" + write);
            Bean.writeFixed64(buf, write);
            long read = Bean.readFixed64(buf);
            System.out.println("read fixed64:" + read);
            Assert.assertEquals(write, read);
            write = value - 1;
            System.out.println("write fixed64:" + write);
            Bean.writeFixed64(buf, write);
            read = Bean.readFixed64(buf);
            System.out.println("read fixed64:" + read);
            Assert.assertEquals(write, read);
            System.out.println();
        }
        long write = Long.MIN_VALUE;
        System.out.println("write fixed64:" + write);
        Bean.writeFixed64(buf, write);
        long read = Bean.readFixed64(buf);
        System.out.println("read fixed64:" + read);
        Assert.assertEquals(write, read);
        write = Long.MAX_VALUE;
        System.out.println("write fixed64:" + write);
        Bean.writeFixed64(buf, write);
        read = Bean.readFixed64(buf);
        System.out.println("read fixed64:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void floatTest() {

        ByteBuf buf = Unpooled.buffer(20);
        float write = -789.0126584122f;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(6);
        System.out.println("write float:" + decimalFormat.format(write));
        Bean.writeFloat(buf, write);
        float read = Bean.readFloat(buf);
        System.out.println("read float:" + decimalFormat.format(read));
        Assert.assertEquals(write, read, 0.0001);
        write = 852.366974441255f;

        System.out.println("write float:" + decimalFormat.format(write));
        Bean.writeFloat(buf, write);
        read = Bean.readFloat(buf);
        System.out.println("read float:" + decimalFormat.format(read));
        Assert.assertEquals(write, read, 0.0001);
    }

    @Test
    public void doubleTest() {
        ByteBuf buf = Unpooled.buffer(20);
        double write = -789.012650084122D;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(12);
        System.out.println("write double:" + decimalFormat.format(write));
        Bean.writeDouble(buf, write);
        double read = Bean.readDouble(buf);
        System.out.println("read double:" + decimalFormat.format(read));
        Assert.assertEquals(write, read, 0.00000001);
        write = 852.36697004441255D;
        System.out.println("write double:" + decimalFormat.format(write));
        Bean.writeDouble(buf, write);
        read = Bean.readDouble(buf);
        System.out.println("read double:" + decimalFormat.format(read));
        Assert.assertEquals(write, read, 0.00000001);
    }

    @Test
    public void booleanTest() {
        ByteBuf buf = Unpooled.buffer(20);
        boolean write = true;
        System.out.println("write boolean:" + write);
        Bean.writeBoolean(buf, write);
        boolean read = Bean.readBoolean(buf);
        System.out.println("read boolean:" + read);
        Assert.assertEquals(write, read);
        write = false;
        System.out.println("write boolean:" + write);
        Bean.writeBoolean(buf, write);
        read = Bean.readBoolean(buf);
        System.out.println("read boolean:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void stringTest() {
        ByteBuf buf = Unpooled.buffer(200);

        String write = "this is a 字符串?!3/dsdfd888=00)k";
        System.out.println("write string:" + write);
        Bean.writeString(buf, write);
        String read = Bean.readString(buf);
        System.out.println("read string:" + read);
        Assert.assertEquals(write, read);
    }

    @Test
    public void bytesTest() {
        ByteBuf buf = Unpooled.buffer(200);

        byte[] write=new byte[]{0,1,2,3,127,-2,-128};
        System.out.println("write bytes:" + Arrays.toString(write));
        Bean.writeBytes(buf, write);
        byte[] read = Bean.readBytes(buf);
        System.out.println("read bytes:" + Arrays.toString(read));
        Assert.assertEquals( Arrays.toString(write), Arrays.toString(read));
    }

}