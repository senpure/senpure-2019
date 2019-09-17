package com.senpure.io.protocol;

import io.netty.buffer.ByteBuf;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;


public abstract class Bean {

    public static Charset charset = Charset.forName("utf-8");

    public abstract void write(ByteBuf buf);

    public abstract void read(ByteBuf buf, int endIndex);

    public abstract String toString(String indent);

    public abstract int getSerializedSize();


    public static int encodeZigZag32(int value) {
        return value << 1 ^ value >> 31;
    }

    public static long encodeZigZag64(long value) {
        return value << 1 ^ value >> 63;
    }

    public static void writeVar32(ByteBuf buf, int tag, int value) {
        //Constant.WIRETYPE_VARINT
        writeVar32(buf, tag);
        writeVar32(buf, value);
    }

    public static void writeVar64(ByteBuf buf, int tag, long value) {
        writeVar32(buf, tag);
        writeVar64(buf, value);
    }


    public static void writeBean(ByteBuf buf, int tag, Bean value) {
        if (value != null) {
            writeVar32(buf, tag);
            writeVar32(buf, value.getSerializedSize());
            value.write(buf);
        }
    }

    public static void writeBoolean(ByteBuf buf, int tag, boolean value) {
        writeVar32(buf, tag);
        writeBoolean(buf, value);
    }

    public static void writeBoolean(ByteBuf buf, boolean value) {
        buf.writeByte(value ? 1 : 0);
    }

    public static void writeSint(ByteBuf buf, int tag, int value) {
        writeVar32(buf, tag);
        writeVar32(buf, encodeZigZag32(value));
    }

    public static void writeSint(ByteBuf buf, int value) {
        writeVar32(buf, encodeZigZag32(value));
    }


    public static void writeSlong(ByteBuf buf, int tag, long value) {
        writeVar32(buf, tag);
        writeVar64(buf, encodeZigZag64(value));
    }

    public static void writeSlong(ByteBuf buf, long value) {
        writeVar64(buf, encodeZigZag64(value));
    }

    public static void writeFixed32(ByteBuf buf, int tag, int value) {
        writeVar32(buf, tag);
        buf.writeInt(value);
    }

    public static void writeFixed32(ByteBuf buf, int value) {
        buf.writeInt(value);
    }


    public static void writeFixed64(ByteBuf buf, int tag, long value) {
        writeVar32(buf, tag);
        buf.writeLong(value);
    }

    public static void writeFixed64(ByteBuf buf, long value) {

        buf.writeLong(value);
    }

    public static void writeFloat(ByteBuf buf, int tag, float value) {

        writeVar32(buf, tag);
        buf.writeFloat(value);
    }

    public static void writeFloat(ByteBuf buf, float value) {
        buf.writeFloat(value);
    }

    public static void writeDouble(ByteBuf buf, int tag, double value) {
        writeVar32(buf, tag);
        buf.writeDouble(value);
    }

    public static void writeDouble(ByteBuf buf, double value) {
        buf.writeDouble(value);
    }

    public static void writeString(ByteBuf buf, int tag, String value) {
        writeVar32(buf, tag);
        writeString(buf, value);
    }

    public static void writeString(ByteBuf buf, String value) {
        writeString(buf, value, charset);
    }

    public static void writeString(ByteBuf buf, String value, Charset charset) {
        byte[] bytes = value.getBytes(charset);
        writeVar32(buf, bytes.length);
        buf.writeBytes(bytes);
    }

    public static void writeVar64(ByteBuf buf, long value) {
        while (true) {
            if ((value & ~0x7F) == 0) {
                buf.writeByte((int) value);
                return;
            } else {
                buf.writeByte(((int) value & 0x7F) | 0x80);
                value >>>= 7;
            }
        }
    }

    public static void writeVar32(ByteBuf buf, int value) {
        while (true) {
            if ((value & ~0x7F) == 0) {
                buf.writeByte(value);
                return;
            } else {
                buf.writeByte((value & 0x7F) | 0x80);
                value >>>= 7;
            }
        }
    }

    public static int tryReadVar32(ByteBuf buf) {
        if (!buf.isReadable()) {
            return 0;
        }
        byte tmp = buf.readByte();
        if (tmp >= 0) {
            return tmp;
        } else {
            int result = tmp & 127;
            if (!buf.isReadable()) {
                buf.resetReaderIndex();
                return 0;
            }
            if ((tmp = buf.readByte()) >= 0) {
                result |= tmp << 7;
            } else {
                result |= (tmp & 127) << 7;
                if (!buf.isReadable()) {
                    buf.resetReaderIndex();
                    return 0;
                }
                if ((tmp = buf.readByte()) >= 0) {
                    result |= tmp << 14;
                } else {
                    result |= (tmp & 127) << 14;
                    if (!buf.isReadable()) {
                        buf.resetReaderIndex();
                        return 0;
                    }
                    if ((tmp = buf.readByte()) >= 0) {
                        result |= tmp << 21;
                    } else {
                        result |= (tmp & 127) << 21;
                        if (!buf.isReadable()) {
                            buf.resetReaderIndex();
                            return 0;
                        }
                        result |= (tmp = buf.readByte()) << 28;
                        if (tmp < 0) {
                            // Discard upper 32 bits.
                            for (int i = 0; i < 5; i++) {
                                if (buf.readByte() >= 0) {
                                    return result;
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }
    public static int readVar32(ByteBuf buf) {
        byte tmp = buf.readByte();
        if (tmp >= 0) {
            return tmp;
        }
        int result = tmp & 0x7f;
        if ((tmp = buf.readByte()) >= 0) {
            result |= tmp << 7;
        } else {
            result |= (tmp & 0x7f) << 7;
            if ((tmp = buf.readByte()) >= 0) {
                result |= tmp << 14;
            } else {
                result |= (tmp & 0x7f) << 14;
                if ((tmp = buf.readByte()) >= 0) {
                    result |= tmp << 21;
                } else {
                    result |= (tmp & 0x7f) << 21;
                    result |= (tmp = buf.readByte()) << 28;
                    if (tmp < 0) {
                        // Discard upper 32 bits.
                        for (int i = 0; i < 5; i++) {
                            if (buf.readByte() >= 0) {
                                return result;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static long readVar64(ByteBuf buf) {
        int shift = 0;
        long result = 0;
        while (shift < 64) {
            final byte b = buf.readByte();
            result |= (long) (b & 0x7F) << shift;
            if ((b & 0x80) == 0) {
                return result;
            }
            shift += 7;
        }
        return result;
    }

    public static String readString(ByteBuf buf) {
        return readString(buf, charset);
    }

    public static String readString(ByteBuf buf, Charset charset) {
        byte[] bytes = new byte[readVar32(buf)];
        buf.readBytes(bytes);
        return new String(bytes, charset);
    }


    public static boolean readBoolean(ByteBuf buf) {
        return buf.readBoolean();
    }

    public static int readSint(ByteBuf buf) {

        return decodeZigZag32(readVar32(buf));
    }

    public static long readSlong(ByteBuf buf) {

        return decodeZigZag64(readVar64(buf));
    }

    public static int readFixed32(ByteBuf buf) {

        return buf.readInt();
    }

    public static long readFixed64(ByteBuf buf) {

        return buf.readLong();
    }

    public static float readFloat(ByteBuf buf) {

        return buf.readFloat();
    }

    public static double readDouble(ByteBuf buf) {

        return buf.readDouble();
    }

    public static void readBean(ByteBuf buf, Bean value) {
        value.read(buf, readVar32(buf) + buf.readerIndex());

    }


    public static int decodeZigZag32(int value) {
        return value >>> 1 ^ -(value & 1);
    }

    public static long decodeZigZag64(long value) {
        return value >>> 1 ^ -(value & 1L);
    }


    static int getTagWriteType(int tag) {
        return tag & 7;
    }

    public static int getTagFieldNumber(int tag) {
        return tag >>> 3;
    }

    public static int makeTag(int fieldIndex, int writeType) {
        return fieldIndex << 3 | writeType;
    }

    public static int readTag(ByteBuf buf, int endIndex) {
        if (buf.readerIndex() == endIndex) {
            return 0;
        }
        return readVar32(buf);
    }

    public void skip(ByteBuf buf, int tag) {
        switch (getTagWriteType(tag)) {
            case 0:
                readVar64(buf);
                break;
            case 1:
                buf.skipBytes(4);
                break;
            case 2:
                buf.skipBytes(8);
                break;
            case 3:
                buf.skipBytes(readVar32(buf));
                break;
        }
    }

    public static int computeStringSize(int tagVar32Size, String value) {
        return tagVar32Size + computeStringSize(value);
    }

    public static int computeStringSize(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return _computeVar32Size(bytes.length) + bytes.length;
    }

    public static int computeBeanSize(int tagVar32Size, Bean value) {
        return tagVar32Size + computeBeanSize(value);
    }

    public static int computeBeanSize(Bean value) {
        int size = value.getSerializedSize();
        return _computeVar32Size(size) + size;
    }

    public static int computeBooleanSize(int tagVar32Size, boolean value) {
        return tagVar32Size + computeBooleanSize(value);
    }

    public static int computeBooleanSize(boolean value) {
        return 1;
    }

    public static int computeDoubleSize(int tagVar32Size, double value) {
        return tagVar32Size + computeDoubleSize(value);
    }

    public static int computeDoubleSize(double value) {
        return 8;
    }

    public static int computeFloatSize(int tagVar32Size, float value) {
        return tagVar32Size + computeFloatSize(value);
    }

    public static int computeFloatSize(float value) {
        return 4;
    }

    public static int computeFixed32Size(int tagVar32Size, int value) {
        return tagVar32Size + computeFixed32Size(value);
    }

    public static int computeFixed32Size(int value) {
        return 4;
    }

    public static int computeFixed64Size(int tagVar32Size, long value) {
        return tagVar32Size + computeFixed64Size(value);
    }

    public static int computeFixed64Size(long value) {
        return 8;
    }

    public static int computeSintSize(int tagVar32Size, int value) {
        return tagVar32Size + computeSintSize(value);
    }

    public static int computeSintSize(int value) {
        return _computeVar32Size(encodeZigZag32(value));
    }

    public static int computeSlongSize(int tagVar32Size, long value) {
        return tagVar32Size + computeSlongSize(value);
    }

    public static int computeSlongSize(long value) {
        return _computeVar64Size(encodeZigZag64(value));
    }


    public static int computeVar32Size(int tagVar32Size, int value) {
        return tagVar32Size + computeVar32Size(value);

    }

    public static int computeVar32Size(int value) {
        return value >= 0 ? _computeVar32Size(value) : 5;
    }

    public static int computeVar64Size(int tagVar32Size, long value) {
        return tagVar32Size + computeVar64Size(value);

    }

    private static int _computeVar32Size(int value) {
        if ((value & -128) == 0) {
            return 1;
        } else if ((value & -16384) == 0) {
            return 2;
        } else if ((value & -2097152) == 0) {
            return 3;
        } else {
            return (value & -268435456) == 0 ? 4 : 5;
        }
    }

    public static int computeVar64Size(long value) {
        return value >= 0 ? _computeVar64Size(value) : 10;
    }

    private static int _computeVar64Size(long value) {
        if ((value & -128L) == 0L) {
            return 1;
        } else if ((value & -16384L) == 0L) {
            return 2;
        } else if ((value & -2097152L) == 0L) {
            return 3;
        } else if ((value & -268435456L) == 0L) {
            return 4;
        } else if ((value & -34359738368L) == 0L) {
            return 5;
        } else if ((value & -4398046511104L) == 0L) {
            return 6;
        } else if ((value & -562949953421312L) == 0L) {
            return 7;
        } else if ((value & -72057594037927936L) == 0L) {
            return 8;
        } else {
            return (value & -9223372036854775808L) == 0L ? 9 : 10;
        }
    }

    public static String rightPad(String str, int pad) {
        return StringUtils.rightPad(str, pad);
    }

    public static void main(String[] args) {

        Class c = Bean.class;
        Method[] methods = c.getDeclaredMethods();

        Set<String> names = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Method method : methods) {
            if (method.getName().equals("main") || method.getName().equals("toString")) {
                continue;
            }
            names.add(method.getName());

        }
        List<String> ns = new ArrayList<>(names);
        Collections.sort(ns);

        for (String name : ns) {
            sb.append("function").append(" ");
            sb.append("MessageBuffer").append(".").append(name);
            sb.append("(").append("value");
            sb.append(")");
            sb.append("\n\n").append("end").append("\n");
            sb.append("\n");

        }
        System.out.println(sb);

        System.out.println(names.size());
    }
}
