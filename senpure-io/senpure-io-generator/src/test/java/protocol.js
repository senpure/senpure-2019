/**
 *
 author    senpure
 version   2019-9-24 16:34:59

 enum    : Example.EchoEnum             Echo中的一个enum

 bean    : Example.Echo
 bean    : Example.EchoBean             Echo中的一个bean
 bean    : Example.Sample

 message : Example.CSEchoMessage        1000103
 message : Example.SCEchoMessage        1000104
 message : Example.CSSampleMessage      1000105
 message : Example.SCSampleMessage      1000106
 message : Example.CSSampleLongMessage  1000107
 message : Example.SCSampleLongMessage  1000108
 message : Example.CSSampleStrMessage   1000109
 message : Example.SCSampleStrMessage   1000110
 */

Example = {};

/**
 *
 *Echo中的一个enum
 */
Example.EchoEnum = {
    X: 1,
    Y: 2,
    UNKNOWN: -1,
    echoEnumValues: {
        1: 1,
        2: 2
    },
    echoEnumStr: {
        1: "X",
        2: "Y"
    },
    checkReadValue: function (value) {
        var v = Example.EchoEnum.echoEnumValues[value];
        if (v != null) {
            return v;
        } else {
            return -1;
        }
    },
    valueToStr: function (value) {
        var v = Example.EchoEnum.echoEnumStr[value];
        if (v != null) {
            return v;
        } else {
            return "UNKNOWN";
        }
    }
};

Example.Echo = function () {
    //类型:boolean booleanValue
    this.booleanValue = false;
    //list:boolean booleanValues
    this.booleanValues = new Array(0);
    //类型:int     intValue
    this.intValue = 0;
    //list:int     intValues
    this.intValues = new Array(0);
    //类型:long    longValue
    this.longValue = 0;
    //list:long    longValues
    this.longValues = new Array(0);
    //类型:int     sintValue
    this.sintValue = 0;
    //list:int     sintValues
    this.sintValues = new Array(0);
    //类型:long    slongValue
    this.slongValue = 0;
    //list:long    slongValues
    this.slongValues = new Array(0);
    //类型:float   floatValue
    this.floatValue = 0;
    //list:float   floatValues
    this.floatValues = new Array(0);
    //类型:double  doubleValue
    this.doubleValue = 0;
    //list:double  doubleValues
    this.doubleValues = new Array(0);
    //类型:int     fixed32Value
    this.fixed32Value = 0;
    //list:int     fixed32Values
    this.fixed32Values = new Array(0);
    //类型:long    fixed64Value
    this.fixed64Value = 0;
    //list:long    fixed64Values
    this.fixed64Values = new Array(0);
    //类型:String  stringValue
    this.stringValue = null;
    //list:String  stringValues
    this.stringValues = new Array(0);
    //类型:Example.EchoBean beanValue
    this.beanValue = null;
    //list:Example.EchoBean beanValues
    this.beanValues = new Array(0);
    //类型:Example.EchoEnum enumValue
    this.enumValue = Example.EchoEnum.X;
    //list:Example.EchoEnum enumValues
    this.enumValues = new Array(0);
    //类型:boolean 
    this.booleanValue2 = false;
    //list:boolean 
    this.booleanValues2 = new Array(0);
    //类型:int     
    this.intValue2 = 0;
    //list:int     
    this.intValues2 = new Array(0);
    //类型:long    
    this.longValue2 = 0;
    //list:long    
    this.longValues2 = new Array(0);
    //类型:int     
    this.sintValue2 = 0;
    //list:int     
    this.sintValues2 = new Array(0);
    //类型:long    
    this.slongValue2 = 0;
    //list:long    
    this.slongValues2 = new Array(0);
    //类型:float   
    this.floatValue2 = 0;
    //list:float   
    this.floatValues2 = new Array(0);
    //类型:double  
    this.doubleValue2 = 0;
    //list:double  
    this.doubleValues2 = new Array(0);
    //类型:int     
    this.fixed32Value2 = 0;
    //list:int     
    this.fixed32Values2 = new Array(0);
    //类型:long    
    this.fixed64Value2 = 0;
    //list:long    
    this.fixed64Values2 = new Array(0);
    //类型:String  
    this.stringValue2 = null;
    //list:String  
    this.stringValues2 = new Array(0);
    //类型:Example.EchoBean 
    this.beanValue2 = null;
    //list:Example.EchoBean 
    this.beanValues2 = new Array(0);
    //类型:Example.EchoEnum 
    this.enumValue2 = Example.EchoEnum.X;
    //list:Example.EchoEnum 
    this.enumValues2 = new Array(0);
    this.serializedSize = -1;
    this.booleanValuesSerializedSize = 0;
    this.intValuesSerializedSize = 0;
    this.longValuesSerializedSize = 0;
    this.sintValuesSerializedSize = 0;
    this.slongValuesSerializedSize = 0;
    this.floatValuesSerializedSize = 0;
    this.doubleValuesSerializedSize = 0;
    this.fixed32ValuesSerializedSize = 0;
    this.fixed64ValuesSerializedSize = 0;
    this.enumValuesSerializedSize = 0;
    this.booleanValues2SerializedSize = 0;
    this.intValues2SerializedSize = 0;
    this.longValues2SerializedSize = 0;
    this.sintValues2SerializedSize = 0;
    this.slongValues2SerializedSize = 0;
    this.floatValues2SerializedSize = 0;
    this.doubleValues2SerializedSize = 0;
    this.fixed32Values2SerializedSize = 0;
    this.fixed64Values2SerializedSize = 0;
    this.enumValues2SerializedSize = 0;
    //缩进14 + 3 = 17 个空格
    this._next_indent = "                 ";
    //格式化时统一字段长度
    this._filedPad = 14;
};

//Example.Echo写入字节缓存
Example.Echo.prototype.write = function (buf) {
    this.getSerializedSize();
    //booleanValue
    if (this.booleanValue != null) {
        buf.writeBooleanField(8, this.booleanValue);
    }
    //booleanValues
    var booleanValues_len = this.booleanValues.length;
    if (booleanValues_len > 0) {
        buf.writeVar32(19);
        buf.writeVar32(this.booleanValuesSerializedSize);
        for (var i = 0; i < booleanValues_len; i++) {
            buf.writeBoolean(this.booleanValues[i]);
        }
    }
    //intValue
    if (this.intValue != null) {
        buf.writeVar32Field(24, this.intValue);
    }
    //intValues
    var intValues_len = this.intValues.length;
    if (intValues_len > 0) {
        buf.writeVar32(35);
        buf.writeVar32(this.intValuesSerializedSize);
        for (var i = 0; i < intValues_len; i++) {
            buf.writeVar32(this.intValues[i]);
        }
    }
    //longValue
    if (this.longValue != null) {
        buf.writeVar64Field(40, this.longValue);
    }
    //longValues
    var longValues_len = this.longValues.length;
    if (longValues_len > 0) {
        buf.writeVar32(51);
        buf.writeVar32(this.longValuesSerializedSize);
        for (var i = 0; i < longValues_len; i++) {
            buf.writeVar64(this.longValues[i]);
        }
    }
    //sintValue
    if (this.sintValue != null) {
        buf.writeSintField(56, this.sintValue);
    }
    //sintValues
    var sintValues_len = this.sintValues.length;
    if (sintValues_len > 0) {
        buf.writeVar32(67);
        buf.writeVar32(this.sintValuesSerializedSize);
        for (var i = 0; i < sintValues_len; i++) {
            buf.writeSint(this.sintValues[i]);
        }
    }
    //slongValue
    if (this.slongValue != null) {
        buf.writeSlongField(72, this.slongValue);
    }
    //slongValues
    var slongValues_len = this.slongValues.length;
    if (slongValues_len > 0) {
        buf.writeVar32(83);
        buf.writeVar32(this.slongValuesSerializedSize);
        for (var i = 0; i < slongValues_len; i++) {
            buf.writeSlong(this.slongValues[i]);
        }
    }
    //floatValue
    if (this.floatValue != null) {
        buf.writeFloatField(89, this.floatValue);
    }
    //floatValues
    var floatValues_len = this.floatValues.length;
    if (floatValues_len > 0) {
        buf.writeVar32(99);
        buf.writeVar32(this.floatValuesSerializedSize);
        for (var i = 0; i < floatValues_len; i++) {
            buf.writeFloat(this.floatValues[i]);
        }
    }
    //doubleValue
    if (this.doubleValue != null) {
        buf.writeDoubleField(106, this.doubleValue);
    }
    //doubleValues
    var doubleValues_len = this.doubleValues.length;
    if (doubleValues_len > 0) {
        buf.writeVar32(115);
        buf.writeVar32(this.doubleValuesSerializedSize);
        for (var i = 0; i < doubleValues_len; i++) {
            buf.writeDouble(this.doubleValues[i]);
        }
    }
    //fixed32Value
    if (this.fixed32Value != null) {
        buf.writeFixed32Field(121, this.fixed32Value);
    }
    //fixed32Values
    var fixed32Values_len = this.fixed32Values.length;
    if (fixed32Values_len > 0) {
        buf.writeVar32(131);
        buf.writeVar32(this.fixed32ValuesSerializedSize);
        for (var i = 0; i < fixed32Values_len; i++) {
            buf.writeFixed32(this.fixed32Values[i]);
        }
    }
    //fixed64Value
    if (this.fixed64Value != null) {
        buf.writeFixed64Field(138, this.fixed64Value);
    }
    //fixed64Values
    var fixed64Values_len = this.fixed64Values.length;
    if (fixed64Values_len > 0) {
        buf.writeVar32(147);
        buf.writeVar32(this.fixed64ValuesSerializedSize);
        for (var i = 0; i < fixed64Values_len; i++) {
            buf.writeFixed64(this.fixed64Values[i]);
        }
    }
    //stringValue
    if (this.stringValue != null) {
        buf.writeStringField(155, this.stringValue);
    }
    //stringValues
    var stringValues_len = this.stringValues.length;
    for (var i = 0; stringValues_len; i++) {
        buf.writeStringField(163, this.stringValues[i]);
    }
    //beanValue
    if (this.beanValue != null) {
        buf.writeVar32(171);
        buf.writeVar32(this.beanValue.getSerializedSize());
        this.beanValue.write(buf);
    }
    //beanValues
    var beanValues_len = this.beanValues.length;
    if (beanValues_len > 0) {
        for (i = 0; i < beanValues_len; i++) {
            buf.writeVar32(179);
            buf.writeVar32(this.beanValues[i].getSerializedSize());
            this.beanValues[i].write(buf);
        }
    }
    //enumValue
    if (this.enumValue != null) {
        buf.writeVar32(187, this.enumValue);
    }
    //enumValues
    var enumValues_len = this.enumValues.length;
    if (enumValues_len > 0) {
        buf.writeVar32(195);
        buf.writeVar32(this.enumValuesSerializedSize);
        for (i = 0; i < enumValues_len; i++) {
            buf.writeVar32(this.enumValues[i]);
        }
    }
    if (this.booleanValue2 != null) {
        buf.writeBooleanField(200, this.booleanValue2);
    }
    var booleanValues2_len = this.booleanValues2.length;
    if (booleanValues2_len > 0) {
        buf.writeVar32(211);
        buf.writeVar32(this.booleanValues2SerializedSize);
        for (var i = 0; i < booleanValues2_len; i++) {
            buf.writeBoolean(this.booleanValues2[i]);
        }
    }
    if (this.intValue2 != null) {
        buf.writeVar32Field(216, this.intValue2);
    }
    var intValues2_len = this.intValues2.length;
    if (intValues2_len > 0) {
        buf.writeVar32(227);
        buf.writeVar32(this.intValues2SerializedSize);
        for (var i = 0; i < intValues2_len; i++) {
            buf.writeVar32(this.intValues2[i]);
        }
    }
    if (this.longValue2 != null) {
        buf.writeVar64Field(232, this.longValue2);
    }
    var longValues2_len = this.longValues2.length;
    if (longValues2_len > 0) {
        buf.writeVar32(243);
        buf.writeVar32(this.longValues2SerializedSize);
        for (var i = 0; i < longValues2_len; i++) {
            buf.writeVar64(this.longValues2[i]);
        }
    }
    if (this.sintValue2 != null) {
        buf.writeSintField(248, this.sintValue2);
    }
    var sintValues2_len = this.sintValues2.length;
    if (sintValues2_len > 0) {
        buf.writeVar32(259);
        buf.writeVar32(this.sintValues2SerializedSize);
        for (var i = 0; i < sintValues2_len; i++) {
            buf.writeSint(this.sintValues2[i]);
        }
    }
    if (this.slongValue2 != null) {
        buf.writeSlongField(264, this.slongValue2);
    }
    var slongValues2_len = this.slongValues2.length;
    if (slongValues2_len > 0) {
        buf.writeVar32(275);
        buf.writeVar32(this.slongValues2SerializedSize);
        for (var i = 0; i < slongValues2_len; i++) {
            buf.writeSlong(this.slongValues2[i]);
        }
    }
    if (this.floatValue2 != null) {
        buf.writeFloatField(281, this.floatValue2);
    }
    var floatValues2_len = this.floatValues2.length;
    if (floatValues2_len > 0) {
        buf.writeVar32(291);
        buf.writeVar32(this.floatValues2SerializedSize);
        for (var i = 0; i < floatValues2_len; i++) {
            buf.writeFloat(this.floatValues2[i]);
        }
    }
    if (this.doubleValue2 != null) {
        buf.writeDoubleField(298, this.doubleValue2);
    }
    var doubleValues2_len = this.doubleValues2.length;
    if (doubleValues2_len > 0) {
        buf.writeVar32(307);
        buf.writeVar32(this.doubleValues2SerializedSize);
        for (var i = 0; i < doubleValues2_len; i++) {
            buf.writeDouble(this.doubleValues2[i]);
        }
    }
    if (this.fixed32Value2 != null) {
        buf.writeFixed32Field(313, this.fixed32Value2);
    }
    var fixed32Values2_len = this.fixed32Values2.length;
    if (fixed32Values2_len > 0) {
        buf.writeVar32(323);
        buf.writeVar32(this.fixed32Values2SerializedSize);
        for (var i = 0; i < fixed32Values2_len; i++) {
            buf.writeFixed32(this.fixed32Values2[i]);
        }
    }
    if (this.fixed64Value2 != null) {
        buf.writeFixed64Field(330, this.fixed64Value2);
    }
    var fixed64Values2_len = this.fixed64Values2.length;
    if (fixed64Values2_len > 0) {
        buf.writeVar32(339);
        buf.writeVar32(this.fixed64Values2SerializedSize);
        for (var i = 0; i < fixed64Values2_len; i++) {
            buf.writeFixed64(this.fixed64Values2[i]);
        }
    }
    if (this.stringValue2 != null) {
        buf.writeStringField(347, this.stringValue2);
    }
    var stringValues2_len = this.stringValues2.length;
    for (var i = 0; stringValues2_len; i++) {
        buf.writeStringField(355, this.stringValues2[i]);
    }
    if (this.beanValue2 != null) {
        buf.writeVar32(363);
        buf.writeVar32(this.beanValue2.getSerializedSize());
        this.beanValue2.write(buf);
    }
    var beanValues2_len = this.beanValues2.length;
    if (beanValues2_len > 0) {
        for (i = 0; i < beanValues2_len; i++) {
            buf.writeVar32(371);
            buf.writeVar32(this.beanValues2[i].getSerializedSize());
            this.beanValues2[i].write(buf);
        }
    }
    if (this.enumValue2 != null) {
        buf.writeVar32(379, this.enumValue2);
    }
    var enumValues2_len = this.enumValues2.length;
    if (enumValues2_len > 0) {
        buf.writeVar32(387);
        buf.writeVar32(this.enumValues2SerializedSize);
        for (i = 0; i < enumValues2_len; i++) {
            buf.writeVar32(this.enumValues2[i]);
        }
    }
};

//Example.Echo读取字节缓存
Example.Echo.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            //booleanValue
            // 1 << 3 | 0
            case 8 :
                this.booleanValue = buf.readBoolean();
                break;
            //booleanValues
            // 2 << 3 | 3
            case 19 :
                var booleanValuesDataSize = buf.readVar32();
                var receiveBooleanValuesDataSize = 0;
                while (receiveBooleanValuesDataSize < booleanValuesDataSize) {
                    var tempBooleanValues = buf.readBoolean();
                    this.booleanValues.push(tempBooleanValues);
                }
                break;
            //intValue
            // 3 << 3 | 0
            case 24 :
                this.intValue = buf.readVar32();
                break;
            //intValues
            // 4 << 3 | 3
            case 35 :
                var intValuesDataSize = buf.readVar32();
                var receiveIntValuesDataSize = 0;
                while (receiveIntValuesDataSize < intValuesDataSize) {
                    var tempIntValues = buf.readVar32();
                    this.intValues.push(tempIntValues);
                }
                break;
            //longValue
            // 5 << 3 | 0
            case 40 :
                this.longValue = buf.readVar64();
                break;
            //longValues
            // 6 << 3 | 3
            case 51 :
                var longValuesDataSize = buf.readVar32();
                var receiveLongValuesDataSize = 0;
                while (receiveLongValuesDataSize < longValuesDataSize) {
                    var tempLongValues = buf.readVar64();
                    this.longValues.push(tempLongValues);
                }
                break;
            //sintValue
            // 7 << 3 | 0
            case 56 :
                this.sintValue = buf.readSint();
                break;
            //sintValues
            // 8 << 3 | 3
            case 67 :
                var sintValuesDataSize = buf.readVar32();
                var receiveSintValuesDataSize = 0;
                while (receiveSintValuesDataSize < sintValuesDataSize) {
                    var tempSintValues = buf.readSint();
                    this.sintValues.push(tempSintValues);
                }
                break;
            //slongValue
            // 9 << 3 | 0
            case 72 :
                this.slongValue = buf.readSlong();
                break;
            //slongValues
            // 10 << 3 | 3
            case 83 :
                var slongValuesDataSize = buf.readVar32();
                var receiveSlongValuesDataSize = 0;
                while (receiveSlongValuesDataSize < slongValuesDataSize) {
                    var tempSlongValues = buf.readSlong();
                    this.slongValues.push(tempSlongValues);
                }
                break;
            //floatValue
            // 11 << 3 | 1
            case 89 :
                this.floatValue = buf.readFloat();
                break;
            //floatValues
            // 12 << 3 | 3
            case 99 :
                var floatValuesDataSize = buf.readVar32();
                var receiveFloatValuesDataSize = 0;
                while (receiveFloatValuesDataSize < floatValuesDataSize) {
                    var tempFloatValues = buf.readFloat();
                    this.floatValues.push(tempFloatValues);
                }
                break;
            //doubleValue
            // 13 << 3 | 2
            case 106 :
                this.doubleValue = buf.readDouble();
                break;
            //doubleValues
            // 14 << 3 | 3
            case 115 :
                var doubleValuesDataSize = buf.readVar32();
                var receiveDoubleValuesDataSize = 0;
                while (receiveDoubleValuesDataSize < doubleValuesDataSize) {
                    var tempDoubleValues = buf.readDouble();
                    this.doubleValues.push(tempDoubleValues);
                }
                break;
            //fixed32Value
            // 15 << 3 | 1
            case 121 :
                this.fixed32Value = buf.readFixed32();
                break;
            //fixed32Values
            // 16 << 3 | 3
            case 131 :
                var fixed32ValuesDataSize = buf.readVar32();
                var receiveFixed32ValuesDataSize = 0;
                while (receiveFixed32ValuesDataSize < fixed32ValuesDataSize) {
                    var tempFixed32Values = buf.readFixed32();
                    this.fixed32Values.push(tempFixed32Values);
                }
                break;
            //fixed64Value
            // 17 << 3 | 2
            case 138 :
                this.fixed64Value = buf.readFixed64();
                break;
            //fixed64Values
            // 18 << 3 | 3
            case 147 :
                var fixed64ValuesDataSize = buf.readVar32();
                var receiveFixed64ValuesDataSize = 0;
                while (receiveFixed64ValuesDataSize < fixed64ValuesDataSize) {
                    var tempFixed64Values = buf.readFixed64();
                    this.fixed64Values.push(tempFixed64Values);
                }
                break;
            //stringValue
            // 19 << 3 | 3
            case 155 :
                this.stringValue = buf.readString();
                break;
            //stringValues
            // 20 << 3 | 3
            case 163 :
                this.stringValues.push(buf.readString());
                break;
            //beanValue
            // 21 << 3 | 3
            case 171 :
                this.beanValue = new Example.EchoBean();
                this.beanValue.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            //beanValues
            // 22 << 3 | 3
            case 179 :
                var tempExampleBeanValuesBean = new Example.EchoBean();
                tempExampleBeanValuesBean.read(buf, buf.readVar32() + buf.getReaderIndex());
                this.beanValues.push(tempExampleBeanValuesBean);
                break;
            //enumValue
            // 23 << 3 | 3
            case 187 :
                this.enumValue = Example.EchoEnum.checkReadValue(buf.readVar32());
                break;
            //enumValues
            // 24 << 3 | 3
            case 195 :
                var enumValuesDataSize = buf.readVar32();
                var receiveEnumValuesDataSize = 0;
                while (receiveEnumValuesDataSize < enumValuesDataSize) {
                    var tempEnumValues = buf.readVar32();
                    receiveEnumValuesDataSize = receiveEnumValuesDataSize + io.computeVar32Size(tempEnumValues);
                    this.enumValues.push(Example.EchoEnum.checkReadValue(tempEnumValues));
                }
                break;
            // 25 << 3 | 0
            case 200 :
                this.booleanValue2 = buf.readBoolean();
                break;
            // 26 << 3 | 3
            case 211 :
                var booleanValues2DataSize = buf.readVar32();
                var receiveBooleanValues2DataSize = 0;
                while (receiveBooleanValues2DataSize < booleanValues2DataSize) {
                    var tempBooleanValues2 = buf.readBoolean();
                    this.booleanValues2.push(tempBooleanValues2);
                }
                break;
            // 27 << 3 | 0
            case 216 :
                this.intValue2 = buf.readVar32();
                break;
            // 28 << 3 | 3
            case 227 :
                var intValues2DataSize = buf.readVar32();
                var receiveIntValues2DataSize = 0;
                while (receiveIntValues2DataSize < intValues2DataSize) {
                    var tempIntValues2 = buf.readVar32();
                    this.intValues2.push(tempIntValues2);
                }
                break;
            // 29 << 3 | 0
            case 232 :
                this.longValue2 = buf.readVar64();
                break;
            // 30 << 3 | 3
            case 243 :
                var longValues2DataSize = buf.readVar32();
                var receiveLongValues2DataSize = 0;
                while (receiveLongValues2DataSize < longValues2DataSize) {
                    var tempLongValues2 = buf.readVar64();
                    this.longValues2.push(tempLongValues2);
                }
                break;
            // 31 << 3 | 0
            case 248 :
                this.sintValue2 = buf.readSint();
                break;
            // 32 << 3 | 3
            case 259 :
                var sintValues2DataSize = buf.readVar32();
                var receiveSintValues2DataSize = 0;
                while (receiveSintValues2DataSize < sintValues2DataSize) {
                    var tempSintValues2 = buf.readSint();
                    this.sintValues2.push(tempSintValues2);
                }
                break;
            // 33 << 3 | 0
            case 264 :
                this.slongValue2 = buf.readSlong();
                break;
            // 34 << 3 | 3
            case 275 :
                var slongValues2DataSize = buf.readVar32();
                var receiveSlongValues2DataSize = 0;
                while (receiveSlongValues2DataSize < slongValues2DataSize) {
                    var tempSlongValues2 = buf.readSlong();
                    this.slongValues2.push(tempSlongValues2);
                }
                break;
            // 35 << 3 | 1
            case 281 :
                this.floatValue2 = buf.readFloat();
                break;
            // 36 << 3 | 3
            case 291 :
                var floatValues2DataSize = buf.readVar32();
                var receiveFloatValues2DataSize = 0;
                while (receiveFloatValues2DataSize < floatValues2DataSize) {
                    var tempFloatValues2 = buf.readFloat();
                    this.floatValues2.push(tempFloatValues2);
                }
                break;
            // 37 << 3 | 2
            case 298 :
                this.doubleValue2 = buf.readDouble();
                break;
            // 38 << 3 | 3
            case 307 :
                var doubleValues2DataSize = buf.readVar32();
                var receiveDoubleValues2DataSize = 0;
                while (receiveDoubleValues2DataSize < doubleValues2DataSize) {
                    var tempDoubleValues2 = buf.readDouble();
                    this.doubleValues2.push(tempDoubleValues2);
                }
                break;
            // 39 << 3 | 1
            case 313 :
                this.fixed32Value2 = buf.readFixed32();
                break;
            // 40 << 3 | 3
            case 323 :
                var fixed32Values2DataSize = buf.readVar32();
                var receiveFixed32Values2DataSize = 0;
                while (receiveFixed32Values2DataSize < fixed32Values2DataSize) {
                    var tempFixed32Values2 = buf.readFixed32();
                    this.fixed32Values2.push(tempFixed32Values2);
                }
                break;
            // 41 << 3 | 2
            case 330 :
                this.fixed64Value2 = buf.readFixed64();
                break;
            // 42 << 3 | 3
            case 339 :
                var fixed64Values2DataSize = buf.readVar32();
                var receiveFixed64Values2DataSize = 0;
                while (receiveFixed64Values2DataSize < fixed64Values2DataSize) {
                    var tempFixed64Values2 = buf.readFixed64();
                    this.fixed64Values2.push(tempFixed64Values2);
                }
                break;
            // 43 << 3 | 3
            case 347 :
                this.stringValue2 = buf.readString();
                break;
            // 44 << 3 | 3
            case 355 :
                this.stringValues2.push(buf.readString());
                break;
            // 45 << 3 | 3
            case 363 :
                this.beanValue2 = new Example.EchoBean();
                this.beanValue2.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            // 46 << 3 | 3
            case 371 :
                var tempExampleBeanValues2Bean = new Example.EchoBean();
                tempExampleBeanValues2Bean.read(buf, buf.readVar32() + buf.getReaderIndex());
                this.beanValues2.push(tempExampleBeanValues2Bean);
                break;
            // 47 << 3 | 3
            case 379 :
                this.enumValue2 = Example.EchoEnum.checkReadValue(buf.readVar32());
                break;
            // 48 << 3 | 3
            case 387 :
                var enumValues2DataSize = buf.readVar32();
                var receiveEnumValues2DataSize = 0;
                while (receiveEnumValues2DataSize < enumValues2DataSize) {
                    var tempEnumValues2 = buf.readVar32();
                    receiveEnumValues2DataSize = receiveEnumValues2DataSize + io.computeVar32Size(tempEnumValues2);
                    this.enumValues2.push(Example.EchoEnum.checkReadValue(tempEnumValues2));
                }
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.Echo计算序列化大小
Example.Echo.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    //booleanValue
    if (this.booleanValue != null) {
        // tag size 已经完成了计算 8
        size += io.computeBooleanFieldSize(1, this.booleanValue);
    }
    //booleanValues
    var booleanValues_len = this.booleanValues.length;
    var booleanValuesDataSize = 0;
    for (var i = 0; i < booleanValues_len; i++) {
        booleanValuesDataSize += io.computeBooleanSize(this.booleanValues[i]);
    }
    this.booleanValuesSerializedSize = booleanValuesDataSize;
    if (booleanValuesDataSize > 0) {
        // tag size 已经完成了计算 19
        size += 1 + this.booleanValuesSerializedSize + io.computeVar32Size(this.booleanValuesSerializedSize);
    }
    //intValue
    if (this.intValue != null) {
        // tag size 已经完成了计算 24
        size += io.computeVar32FieldSize(1, this.intValue);
    }
    //intValues
    var intValues_len = this.intValues.length;
    var intValuesDataSize = 0;
    for (var i = 0; i < intValues_len; i++) {
        intValuesDataSize += io.computeVar32Size(this.intValues[i]);
    }
    this.intValuesSerializedSize = intValuesDataSize;
    if (intValuesDataSize > 0) {
        // tag size 已经完成了计算 35
        size += 1 + this.intValuesSerializedSize + io.computeVar32Size(this.intValuesSerializedSize);
    }
    //longValue
    if (this.longValue != null) {
        // tag size 已经完成了计算 40
        size += io.computeVar64FieldSize(1, this.longValue);
    }
    //longValues
    var longValues_len = this.longValues.length;
    var longValuesDataSize = 0;
    for (var i = 0; i < longValues_len; i++) {
        longValuesDataSize += io.computeVar64Size(this.longValues[i]);
    }
    this.longValuesSerializedSize = longValuesDataSize;
    if (longValuesDataSize > 0) {
        // tag size 已经完成了计算 51
        size += 1 + this.longValuesSerializedSize + io.computeVar32Size(this.longValuesSerializedSize);
    }
    //sintValue
    if (this.sintValue != null) {
        // tag size 已经完成了计算 56
        size += io.computeSintFieldSize(1, this.sintValue);
    }
    //sintValues
    var sintValues_len = this.sintValues.length;
    var sintValuesDataSize = 0;
    for (var i = 0; i < sintValues_len; i++) {
        sintValuesDataSize += io.computeSintSize(this.sintValues[i]);
    }
    this.sintValuesSerializedSize = sintValuesDataSize;
    if (sintValuesDataSize > 0) {
        // tag size 已经完成了计算 67
        size += 1 + this.sintValuesSerializedSize + io.computeVar32Size(this.sintValuesSerializedSize);
    }
    //slongValue
    if (this.slongValue != null) {
        // tag size 已经完成了计算 72
        size += io.computeSlongFieldSize(1, this.slongValue);
    }
    //slongValues
    var slongValues_len = this.slongValues.length;
    var slongValuesDataSize = 0;
    for (var i = 0; i < slongValues_len; i++) {
        slongValuesDataSize += io.computeSlongSize(this.slongValues[i]);
    }
    this.slongValuesSerializedSize = slongValuesDataSize;
    if (slongValuesDataSize > 0) {
        // tag size 已经完成了计算 83
        size += 1 + this.slongValuesSerializedSize + io.computeVar32Size(this.slongValuesSerializedSize);
    }
    //floatValue
    if (this.floatValue != null) {
        // tag size 已经完成了计算 89
        size += io.computeFloatFieldSize(1, this.floatValue);
    }
    //floatValues
    var floatValues_len = this.floatValues.length;
    var floatValuesDataSize = 0;
    for (var i = 0; i < floatValues_len; i++) {
        floatValuesDataSize += io.computeFloatSize(this.floatValues[i]);
    }
    this.floatValuesSerializedSize = floatValuesDataSize;
    if (floatValuesDataSize > 0) {
        // tag size 已经完成了计算 99
        size += 1 + this.floatValuesSerializedSize + io.computeVar32Size(this.floatValuesSerializedSize);
    }
    //doubleValue
    if (this.doubleValue != null) {
        // tag size 已经完成了计算 106
        size += io.computeDoubleFieldSize(1, this.doubleValue);
    }
    //doubleValues
    var doubleValues_len = this.doubleValues.length;
    var doubleValuesDataSize = 0;
    for (var i = 0; i < doubleValues_len; i++) {
        doubleValuesDataSize += io.computeDoubleSize(this.doubleValues[i]);
    }
    this.doubleValuesSerializedSize = doubleValuesDataSize;
    if (doubleValuesDataSize > 0) {
        // tag size 已经完成了计算 115
        size += 1 + this.doubleValuesSerializedSize + io.computeVar32Size(this.doubleValuesSerializedSize);
    }
    //fixed32Value
    if (this.fixed32Value != null) {
        // tag size 已经完成了计算 121
        size += io.computeFixed32FieldSize(1, this.fixed32Value);
    }
    //fixed32Values
    var fixed32Values_len = this.fixed32Values.length;
    var fixed32ValuesDataSize = 0;
    for (var i = 0; i < fixed32Values_len; i++) {
        fixed32ValuesDataSize += io.computeFixed32Size(this.fixed32Values[i]);
    }
    this.fixed32ValuesSerializedSize = fixed32ValuesDataSize;
    if (fixed32ValuesDataSize > 0) {
        // tag size 已经完成了计算 131
        size += 2 + this.fixed32ValuesSerializedSize + io.computeVar32Size(this.fixed32ValuesSerializedSize);
    }
    //fixed64Value
    if (this.fixed64Value != null) {
        // tag size 已经完成了计算 138
        size += io.computeFixed64FieldSize(2, this.fixed64Value);
    }
    //fixed64Values
    var fixed64Values_len = this.fixed64Values.length;
    var fixed64ValuesDataSize = 0;
    for (var i = 0; i < fixed64Values_len; i++) {
        fixed64ValuesDataSize += io.computeFixed64Size(this.fixed64Values[i]);
    }
    this.fixed64ValuesSerializedSize = fixed64ValuesDataSize;
    if (fixed64ValuesDataSize > 0) {
        // tag size 已经完成了计算 147
        size += 2 + this.fixed64ValuesSerializedSize + io.computeVar32Size(this.fixed64ValuesSerializedSize);
    }
    //stringValue
    if (this.stringValue != null) {
        // tag size 已经完成了计算 155
        size += io.computeStringFieldSize(2, this.stringValue);
    }
    //stringValues
    var stringValues_len = this.stringValues.length;
    if (stringValues_len > 0) {
        for (var i = 0; i < stringValues_len; i++) {
            //tag size 已经完成了计算 163
            size += 2 + io.computeStringSize(this.stringValues[i]);
        }
    }
    //beanValue
    if (this.beanValue != null) {
        var beanValueBeanSize = this.beanValue.getSerializedSize();
        // tag size 已经完成了计算 171
        size += beanValueBeanSize + io.computeVar32FieldSize(2, beanValueBeanSize);
    }
    //beanValues
    var beanValues_len = this.beanValues.length;
    for (var i = 0; i < beanValues_len; i++) {
        var beanValuesBeanSize = this.beanValues[i].getSerializedSize()
        // tag size 已经完成了计算 179
        size += beanValuesBeanSize + io.computeVar32FieldSize(2, beanValuesBeanSize);
    }
    //enumValue
    // tag size 已经完成了计算 187
    size += io.computeVar32FieldSize(2, this.enumValue);
    //enumValues
    var enumValues_len = this.enumValues.length;
    var enumValuesDataSize = 0;
    for (var i = 0; i < enumValues_len; i++) {
        enumValuesDataSize += io.computeVar32Size(this.enumValues[i]);
    }
    this.enumValuesSerializedSize = enumValuesDataSize;
    if (enumValuesDataSize > 0) {
        // tag size 已经完成了计算 195
        size += 2 + this.enumValuesSerializedSize + io.computeVar32Size(this.enumValuesSerializedSize);
    }
    if (this.booleanValue2 != null) {
        // tag size 已经完成了计算 200
        size += io.computeBooleanFieldSize(2, this.booleanValue2);
    }
    var booleanValues2_len = this.booleanValues2.length;
    var booleanValues2DataSize = 0;
    for (var i = 0; i < booleanValues2_len; i++) {
        booleanValues2DataSize += io.computeBooleanSize(this.booleanValues2[i]);
    }
    this.booleanValues2SerializedSize = booleanValues2DataSize;
    if (booleanValues2DataSize > 0) {
        // tag size 已经完成了计算 211
        size += 2 + this.booleanValues2SerializedSize + io.computeVar32Size(this.booleanValues2SerializedSize);
    }
    if (this.intValue2 != null) {
        // tag size 已经完成了计算 216
        size += io.computeVar32FieldSize(2, this.intValue2);
    }
    var intValues2_len = this.intValues2.length;
    var intValues2DataSize = 0;
    for (var i = 0; i < intValues2_len; i++) {
        intValues2DataSize += io.computeVar32Size(this.intValues2[i]);
    }
    this.intValues2SerializedSize = intValues2DataSize;
    if (intValues2DataSize > 0) {
        // tag size 已经完成了计算 227
        size += 2 + this.intValues2SerializedSize + io.computeVar32Size(this.intValues2SerializedSize);
    }
    if (this.longValue2 != null) {
        // tag size 已经完成了计算 232
        size += io.computeVar64FieldSize(2, this.longValue2);
    }
    var longValues2_len = this.longValues2.length;
    var longValues2DataSize = 0;
    for (var i = 0; i < longValues2_len; i++) {
        longValues2DataSize += io.computeVar64Size(this.longValues2[i]);
    }
    this.longValues2SerializedSize = longValues2DataSize;
    if (longValues2DataSize > 0) {
        // tag size 已经完成了计算 243
        size += 2 + this.longValues2SerializedSize + io.computeVar32Size(this.longValues2SerializedSize);
    }
    if (this.sintValue2 != null) {
        // tag size 已经完成了计算 248
        size += io.computeSintFieldSize(2, this.sintValue2);
    }
    var sintValues2_len = this.sintValues2.length;
    var sintValues2DataSize = 0;
    for (var i = 0; i < sintValues2_len; i++) {
        sintValues2DataSize += io.computeSintSize(this.sintValues2[i]);
    }
    this.sintValues2SerializedSize = sintValues2DataSize;
    if (sintValues2DataSize > 0) {
        // tag size 已经完成了计算 259
        size += 2 + this.sintValues2SerializedSize + io.computeVar32Size(this.sintValues2SerializedSize);
    }
    if (this.slongValue2 != null) {
        // tag size 已经完成了计算 264
        size += io.computeSlongFieldSize(2, this.slongValue2);
    }
    var slongValues2_len = this.slongValues2.length;
    var slongValues2DataSize = 0;
    for (var i = 0; i < slongValues2_len; i++) {
        slongValues2DataSize += io.computeSlongSize(this.slongValues2[i]);
    }
    this.slongValues2SerializedSize = slongValues2DataSize;
    if (slongValues2DataSize > 0) {
        // tag size 已经完成了计算 275
        size += 2 + this.slongValues2SerializedSize + io.computeVar32Size(this.slongValues2SerializedSize);
    }
    if (this.floatValue2 != null) {
        // tag size 已经完成了计算 281
        size += io.computeFloatFieldSize(2, this.floatValue2);
    }
    var floatValues2_len = this.floatValues2.length;
    var floatValues2DataSize = 0;
    for (var i = 0; i < floatValues2_len; i++) {
        floatValues2DataSize += io.computeFloatSize(this.floatValues2[i]);
    }
    this.floatValues2SerializedSize = floatValues2DataSize;
    if (floatValues2DataSize > 0) {
        // tag size 已经完成了计算 291
        size += 2 + this.floatValues2SerializedSize + io.computeVar32Size(this.floatValues2SerializedSize);
    }
    if (this.doubleValue2 != null) {
        // tag size 已经完成了计算 298
        size += io.computeDoubleFieldSize(2, this.doubleValue2);
    }
    var doubleValues2_len = this.doubleValues2.length;
    var doubleValues2DataSize = 0;
    for (var i = 0; i < doubleValues2_len; i++) {
        doubleValues2DataSize += io.computeDoubleSize(this.doubleValues2[i]);
    }
    this.doubleValues2SerializedSize = doubleValues2DataSize;
    if (doubleValues2DataSize > 0) {
        // tag size 已经完成了计算 307
        size += 2 + this.doubleValues2SerializedSize + io.computeVar32Size(this.doubleValues2SerializedSize);
    }
    if (this.fixed32Value2 != null) {
        // tag size 已经完成了计算 313
        size += io.computeFixed32FieldSize(2, this.fixed32Value2);
    }
    var fixed32Values2_len = this.fixed32Values2.length;
    var fixed32Values2DataSize = 0;
    for (var i = 0; i < fixed32Values2_len; i++) {
        fixed32Values2DataSize += io.computeFixed32Size(this.fixed32Values2[i]);
    }
    this.fixed32Values2SerializedSize = fixed32Values2DataSize;
    if (fixed32Values2DataSize > 0) {
        // tag size 已经完成了计算 323
        size += 2 + this.fixed32Values2SerializedSize + io.computeVar32Size(this.fixed32Values2SerializedSize);
    }
    if (this.fixed64Value2 != null) {
        // tag size 已经完成了计算 330
        size += io.computeFixed64FieldSize(2, this.fixed64Value2);
    }
    var fixed64Values2_len = this.fixed64Values2.length;
    var fixed64Values2DataSize = 0;
    for (var i = 0; i < fixed64Values2_len; i++) {
        fixed64Values2DataSize += io.computeFixed64Size(this.fixed64Values2[i]);
    }
    this.fixed64Values2SerializedSize = fixed64Values2DataSize;
    if (fixed64Values2DataSize > 0) {
        // tag size 已经完成了计算 339
        size += 2 + this.fixed64Values2SerializedSize + io.computeVar32Size(this.fixed64Values2SerializedSize);
    }
    if (this.stringValue2 != null) {
        // tag size 已经完成了计算 347
        size += io.computeStringFieldSize(2, this.stringValue2);
    }
    var stringValues2_len = this.stringValues2.length;
    if (stringValues2_len > 0) {
        for (var i = 0; i < stringValues2_len; i++) {
            //tag size 已经完成了计算 355
            size += 2 + io.computeStringSize(this.stringValues2[i]);
        }
    }
    if (this.beanValue2 != null) {
        var beanValue2BeanSize = this.beanValue2.getSerializedSize();
        // tag size 已经完成了计算 363
        size += beanValue2BeanSize + io.computeVar32FieldSize(2, beanValue2BeanSize);
    }
    var beanValues2_len = this.beanValues2.length;
    for (var i = 0; i < beanValues2_len; i++) {
        var beanValues2BeanSize = this.beanValues2[i].getSerializedSize()
        // tag size 已经完成了计算 371
        size += beanValues2BeanSize + io.computeVar32FieldSize(2, beanValues2BeanSize);
    }
    // tag size 已经完成了计算 379
    size += io.computeVar32FieldSize(2, this.enumValue2);
    var enumValues2_len = this.enumValues2.length;
    var enumValues2DataSize = 0;
    for (var i = 0; i < enumValues2_len; i++) {
        enumValues2DataSize += io.computeVar32Size(this.enumValues2[i]);
    }
    this.enumValues2SerializedSize = enumValues2DataSize;
    if (enumValues2DataSize > 0) {
        // tag size 已经完成了计算 387
        size += 2 + this.enumValues2SerializedSize + io.computeVar32Size(this.enumValues2SerializedSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.Echo格式化字符串
Example.Echo.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "Echo" + "{";
    //booleanValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("booleanValue", this._filedPad) + " = " + this.booleanValue;
    //booleanValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("booleanValues", this._filedPad) + " = ";
    var booleanValues_len = this.booleanValues.length;
    if (booleanValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; booleanValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.booleanValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //intValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("intValue", this._filedPad) + " = " + this.intValue;
    //intValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("intValues", this._filedPad) + " = ";
    var intValues_len = this.intValues.length;
    if (intValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; intValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.intValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //longValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("longValue", this._filedPad) + " = " + this.longValue;
    //longValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("longValues", this._filedPad) + " = ";
    var longValues_len = this.longValues.length;
    if (longValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; longValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.longValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //sintValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("sintValue", this._filedPad) + " = " + this.sintValue;
    //sintValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("sintValues", this._filedPad) + " = ";
    var sintValues_len = this.sintValues.length;
    if (sintValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; sintValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.sintValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //slongValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("slongValue", this._filedPad) + " = " + this.slongValue;
    //slongValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("slongValues", this._filedPad) + " = ";
    var slongValues_len = this.slongValues.length;
    if (slongValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; slongValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.slongValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //floatValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("floatValue", this._filedPad) + " = " + this.floatValue;
    //floatValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("floatValues", this._filedPad) + " = ";
    var floatValues_len = this.floatValues.length;
    if (floatValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; floatValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.floatValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //doubleValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("doubleValue", this._filedPad) + " = " + this.doubleValue;
    //doubleValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("doubleValues", this._filedPad) + " = ";
    var doubleValues_len = this.doubleValues.length;
    if (doubleValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; doubleValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.doubleValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //fixed32Value
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed32Value", this._filedPad) + " = " + this.fixed32Value;
    //fixed32Values
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed32Values", this._filedPad) + " = ";
    var fixed32Values_len = this.fixed32Values.length;
    if (fixed32Values_len > 0) {
        _str = _str + "[";
        for (var i = 0; fixed32Values_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.fixed32Values[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //fixed64Value
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed64Value", this._filedPad) + " = " + this.fixed64Value;
    //fixed64Values
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed64Values", this._filedPad) + " = ";
    var fixed64Values_len = this.fixed64Values.length;
    if (fixed64Values_len > 0) {
        _str = _str + "[";
        for (var i = 0; fixed64Values_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.fixed64Values[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //stringValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("stringValue", this._filedPad) + " = " + this.stringValue;
    //stringValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("stringValues", this._filedPad) + " = ";
    var stringValues_len = this.stringValues.length;
    if (stringValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; stringValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.stringValues[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //beanValue
    _str = _str + "\n";
    if (this.beanValue != null) {
        _str = _str + _indent + rightPad("beanValue", this._filedPad) + " = " + this.beanValue.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("beanValue", this._filedPad) + " = " + "null";
    }
    //beanValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("beanValues", this._filedPad) + " = ";
    var beanValues_len = this.beanValues.length;
    if (beanValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; beanValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.beanValues[i].toString(_indent + this._next_indent);
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    //enumValue
    _str = _str + "\n";
    _str = _str + _indent + rightPad("enumValue", this._filedPad) + " = " + Example.EchoEnum.valueToStr(this.enumValue);
    //enumValues
    _str = _str + "\n";
    _str = _str + _indent + rightPad("enumValues", this._filedPad) + " = ";
    var enumValues_len = this.enumValues.length;
    if (enumValues_len > 0) {
        _str = _str + "[";
        for (var i = 0; enumValues_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + Example.EchoEnum.valueToStr(this.enumValues[i]);
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("booleanValue2", this._filedPad) + " = " + this.booleanValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("booleanValues2", this._filedPad) + " = ";
    var booleanValues2_len = this.booleanValues2.length;
    if (booleanValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; booleanValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.booleanValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("intValue2", this._filedPad) + " = " + this.intValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("intValues2", this._filedPad) + " = ";
    var intValues2_len = this.intValues2.length;
    if (intValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; intValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.intValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("longValue2", this._filedPad) + " = " + this.longValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("longValues2", this._filedPad) + " = ";
    var longValues2_len = this.longValues2.length;
    if (longValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; longValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.longValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("sintValue2", this._filedPad) + " = " + this.sintValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("sintValues2", this._filedPad) + " = ";
    var sintValues2_len = this.sintValues2.length;
    if (sintValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; sintValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.sintValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("slongValue2", this._filedPad) + " = " + this.slongValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("slongValues2", this._filedPad) + " = ";
    var slongValues2_len = this.slongValues2.length;
    if (slongValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; slongValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.slongValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("floatValue2", this._filedPad) + " = " + this.floatValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("floatValues2", this._filedPad) + " = ";
    var floatValues2_len = this.floatValues2.length;
    if (floatValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; floatValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.floatValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("doubleValue2", this._filedPad) + " = " + this.doubleValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("doubleValues2", this._filedPad) + " = ";
    var doubleValues2_len = this.doubleValues2.length;
    if (doubleValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; doubleValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.doubleValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed32Value2", this._filedPad) + " = " + this.fixed32Value2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed32Values2", this._filedPad) + " = ";
    var fixed32Values2_len = this.fixed32Values2.length;
    if (fixed32Values2_len > 0) {
        _str = _str + "[";
        for (var i = 0; fixed32Values2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.fixed32Values2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed64Value2", this._filedPad) + " = " + this.fixed64Value2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("fixed64Values2", this._filedPad) + " = ";
    var fixed64Values2_len = this.fixed64Values2.length;
    if (fixed64Values2_len > 0) {
        _str = _str + "[";
        for (var i = 0; fixed64Values2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.fixed64Values2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("stringValue2", this._filedPad) + " = " + this.stringValue2;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("stringValues2", this._filedPad) + " = ";
    var stringValues2_len = this.stringValues2.length;
    if (stringValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; stringValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.stringValues2[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    if (this.beanValue2 != null) {
        _str = _str + _indent + rightPad("beanValue2", this._filedPad) + " = " + this.beanValue2.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("beanValue2", this._filedPad) + " = " + "null";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("beanValues2", this._filedPad) + " = ";
    var beanValues2_len = this.beanValues2.length;
    if (beanValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; beanValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.beanValues2[i].toString(_indent + this._next_indent);
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + rightPad("enumValue2", this._filedPad) + " = " + Example.EchoEnum.valueToStr(this.enumValue2);
    _str = _str + "\n";
    _str = _str + _indent + rightPad("enumValues2", this._filedPad) + " = ";
    var enumValues2_len = this.enumValues2.length;
    if (enumValues2_len > 0) {
        _str = _str + "[";
        for (var i = 0; enumValues2_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + Example.EchoEnum.valueToStr(this.enumValues2[i]);
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

/**
 *
 *  Echo中的一个bean
 */
Example.EchoBean = function () {
    //类型:int     
    this.value = 0;
    this.serializedSize = -1;
    //格式化时统一字段长度
    this._filedPad = 5;
};

//Example.EchoBean写入字节缓存
Example.EchoBean.prototype.write = function (buf) {
    if (this.value != null) {
        buf.writeVar32Field(8, this.value);
    }
};

//Example.EchoBean读取字节缓存
Example.EchoBean.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 0
            case 8 :
                this.value = buf.readVar32();
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.EchoBean计算序列化大小
Example.EchoBean.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 8
        size += io.computeVar32FieldSize(1, this.value);
    }
    this.serializedSize = size;
    return size;
};

//Example.EchoBean格式化字符串
Example.EchoBean.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "EchoBean" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.Sample = function () {
    //类型:int     
    this.value = 0;
    //list:int     
    this.values = new Array(0);
    this.serializedSize = -1;
    this.valuesSerializedSize = 0;
    //缩进6 + 3 = 9 个空格
    this._next_indent = "         ";
    //格式化时统一字段长度
    this._filedPad = 6;
};

//Example.Sample写入字节缓存
Example.Sample.prototype.write = function (buf) {
    this.getSerializedSize();
    if (this.value != null) {
        buf.writeVar32Field(8, this.value);
    }
    var values_len = this.values.length;
    if (values_len > 0) {
        buf.writeVar32(19);
        buf.writeVar32(this.valuesSerializedSize);
        for (var i = 0; i < values_len; i++) {
            buf.writeVar32(this.values[i]);
        }
    }
};

//Example.Sample读取字节缓存
Example.Sample.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 0
            case 8 :
                this.value = buf.readVar32();
                break;
            // 2 << 3 | 3
            case 19 :
                var valuesDataSize = buf.readVar32();
                var receiveValuesDataSize = 0;
                while (receiveValuesDataSize < valuesDataSize) {
                    var tempValues = buf.readVar32();
                    this.values.push(tempValues);
                }
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.Sample计算序列化大小
Example.Sample.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 8
        size += io.computeVar32FieldSize(1, this.value);
    }
    var values_len = this.values.length;
    var valuesDataSize = 0;
    for (var i = 0; i < values_len; i++) {
        valuesDataSize += io.computeVar32Size(this.values[i]);
    }
    this.valuesSerializedSize = valuesDataSize;
    if (valuesDataSize > 0) {
        // tag size 已经完成了计算 19
        size += 1 + this.valuesSerializedSize + io.computeVar32Size(this.valuesSerializedSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.Sample格式化字符串
Example.Sample.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "Sample" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + rightPad("values", this._filedPad) + " = ";
    var values_len = this.values.length;
    if (values_len > 0) {
        _str = _str + "[";
        for (var i = 0; values_len; i++) {
            _str = _str + "\n";
            _str = _str + this._next_indent;
            _str = _str + _indent + this.values[i];
        }
        _str = _str + "\n";
        _str = _str + this._next_indent;
        _str = _str + _indent + "]";
    } else {
        _str = _str + "null ";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};


Example.CSEchoMessage = function () {
    //类型:Example.Echo 
    this.echo = null;
    this.serializedSize = -1;
    //缩进4 + 3 = 7 个空格
    this._next_indent = "       ";
    //格式化时统一字段长度
    this._filedPad = 4;
};

Example.CSEchoMessage.MESSAGE_ID = 1000103;

Example.CSEchoMessage.prototype.getMessageId = function () {
    return Example.CSEchoMessage.MESSAGE_ID;
};

//Example.CSEchoMessage写入字节缓存
Example.CSEchoMessage.prototype.write = function (buf) {
    if (this.echo != null) {
        buf.writeVar32(11);
        buf.writeVar32(this.echo.getSerializedSize());
        this.echo.write(buf);
    }
};

//Example.CSEchoMessage读取字节缓存
Example.CSEchoMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.echo = new Example.Echo();
                this.echo.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.CSEchoMessage计算序列化大小
Example.CSEchoMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.echo != null) {
        var echoBeanSize = this.echo.getSerializedSize();
        // tag size 已经完成了计算 11
        size += echoBeanSize + io.computeVar32FieldSize(1, echoBeanSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.CSEchoMessage格式化字符串
Example.CSEchoMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "CSEchoMessage[1000103]" + "{";
    _str = _str + "\n";
    if (this.echo != null) {
        _str = _str + _indent + rightPad("echo", this._filedPad) + " = " + this.echo.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("echo", this._filedPad) + " = " + "null";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.SCEchoMessage = function () {
    //类型:Example.Echo 
    this.echo = null;
    this.serializedSize = -1;
    //缩进4 + 3 = 7 个空格
    this._next_indent = "       ";
    //格式化时统一字段长度
    this._filedPad = 4;
};

Example.SCEchoMessage.MESSAGE_ID = 1000104;

Example.SCEchoMessage.prototype.getMessageId = function () {
    return Example.SCEchoMessage.MESSAGE_ID;
};

//Example.SCEchoMessage写入字节缓存
Example.SCEchoMessage.prototype.write = function (buf) {
    if (this.echo != null) {
        buf.writeVar32(11);
        buf.writeVar32(this.echo.getSerializedSize());
        this.echo.write(buf);
    }
};

//Example.SCEchoMessage读取字节缓存
Example.SCEchoMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.echo = new Example.Echo();
                this.echo.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.SCEchoMessage计算序列化大小
Example.SCEchoMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.echo != null) {
        var echoBeanSize = this.echo.getSerializedSize();
        // tag size 已经完成了计算 11
        size += echoBeanSize + io.computeVar32FieldSize(1, echoBeanSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.SCEchoMessage格式化字符串
Example.SCEchoMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "SCEchoMessage[1000104]" + "{";
    _str = _str + "\n";
    if (this.echo != null) {
        _str = _str + _indent + rightPad("echo", this._filedPad) + " = " + this.echo.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("echo", this._filedPad) + " = " + "null";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.CSSampleMessage = function () {
    //类型:Example.Sample 
    this.sample = null;
    this.serializedSize = -1;
    //缩进6 + 3 = 9 个空格
    this._next_indent = "         ";
    //格式化时统一字段长度
    this._filedPad = 6;
};

Example.CSSampleMessage.MESSAGE_ID = 1000105;

Example.CSSampleMessage.prototype.getMessageId = function () {
    return Example.CSSampleMessage.MESSAGE_ID;
};

//Example.CSSampleMessage写入字节缓存
Example.CSSampleMessage.prototype.write = function (buf) {
    if (this.sample != null) {
        buf.writeVar32(11);
        buf.writeVar32(this.sample.getSerializedSize());
        this.sample.write(buf);
    }
};

//Example.CSSampleMessage读取字节缓存
Example.CSSampleMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.sample = new Example.Sample();
                this.sample.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.CSSampleMessage计算序列化大小
Example.CSSampleMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.sample != null) {
        var sampleBeanSize = this.sample.getSerializedSize();
        // tag size 已经完成了计算 11
        size += sampleBeanSize + io.computeVar32FieldSize(1, sampleBeanSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.CSSampleMessage格式化字符串
Example.CSSampleMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "CSSampleMessage[1000105]" + "{";
    _str = _str + "\n";
    if (this.sample != null) {
        _str = _str + _indent + rightPad("sample", this._filedPad) + " = " + this.sample.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("sample", this._filedPad) + " = " + "null";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.SCSampleMessage = function () {
    //类型:Example.Sample 
    this.sample = null;
    this.serializedSize = -1;
    //缩进6 + 3 = 9 个空格
    this._next_indent = "         ";
    //格式化时统一字段长度
    this._filedPad = 6;
};

Example.SCSampleMessage.MESSAGE_ID = 1000106;

Example.SCSampleMessage.prototype.getMessageId = function () {
    return Example.SCSampleMessage.MESSAGE_ID;
};

//Example.SCSampleMessage写入字节缓存
Example.SCSampleMessage.prototype.write = function (buf) {
    if (this.sample != null) {
        buf.writeVar32(11);
        buf.writeVar32(this.sample.getSerializedSize());
        this.sample.write(buf);
    }
};

//Example.SCSampleMessage读取字节缓存
Example.SCSampleMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.sample = new Example.Sample();
                this.sample.read(buf, buf.readVar32() + buf.getReaderIndex());
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.SCSampleMessage计算序列化大小
Example.SCSampleMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.sample != null) {
        var sampleBeanSize = this.sample.getSerializedSize();
        // tag size 已经完成了计算 11
        size += sampleBeanSize + io.computeVar32FieldSize(1, sampleBeanSize);
    }
    this.serializedSize = size;
    return size;
};

//Example.SCSampleMessage格式化字符串
Example.SCSampleMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "SCSampleMessage[1000106]" + "{";
    _str = _str + "\n";
    if (this.sample != null) {
        _str = _str + _indent + rightPad("sample", this._filedPad) + " = " + this.sample.toString(_indent + this._next_indent);
    } else {
        _str = _str + _indent + rightPad("sample", this._filedPad) + " = " + "null";
    }
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.CSSampleLongMessage = function () {
    //类型:long    
    this.value = 0;
    this.serializedSize = -1;
    //格式化时统一字段长度
    this._filedPad = 5;
};

Example.CSSampleLongMessage.MESSAGE_ID = 1000107;

Example.CSSampleLongMessage.prototype.getMessageId = function () {
    return Example.CSSampleLongMessage.MESSAGE_ID;
};

//Example.CSSampleLongMessage写入字节缓存
Example.CSSampleLongMessage.prototype.write = function (buf) {
    if (this.value != null) {
        buf.writeVar64Field(8, this.value);
    }
};

//Example.CSSampleLongMessage读取字节缓存
Example.CSSampleLongMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 0
            case 8 :
                this.value = buf.readVar64();
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.CSSampleLongMessage计算序列化大小
Example.CSSampleLongMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 8
        size += io.computeVar64FieldSize(1, this.value);
    }
    this.serializedSize = size;
    return size;
};

//Example.CSSampleLongMessage格式化字符串
Example.CSSampleLongMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "CSSampleLongMessage[1000107]" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.SCSampleLongMessage = function () {
    //类型:long    
    this.value = 0;
    this.serializedSize = -1;
    //格式化时统一字段长度
    this._filedPad = 5;
};

Example.SCSampleLongMessage.MESSAGE_ID = 1000108;

Example.SCSampleLongMessage.prototype.getMessageId = function () {
    return Example.SCSampleLongMessage.MESSAGE_ID;
};

//Example.SCSampleLongMessage写入字节缓存
Example.SCSampleLongMessage.prototype.write = function (buf) {
    if (this.value != null) {
        buf.writeVar64Field(8, this.value);
    }
};

//Example.SCSampleLongMessage读取字节缓存
Example.SCSampleLongMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 0
            case 8 :
                this.value = buf.readVar64();
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.SCSampleLongMessage计算序列化大小
Example.SCSampleLongMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 8
        size += io.computeVar64FieldSize(1, this.value);
    }
    this.serializedSize = size;
    return size;
};

//Example.SCSampleLongMessage格式化字符串
Example.SCSampleLongMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "SCSampleLongMessage[1000108]" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.CSSampleStrMessage = function () {
    //类型:String  
    this.value = null;
    this.serializedSize = -1;
    //格式化时统一字段长度
    this._filedPad = 5;
};

Example.CSSampleStrMessage.MESSAGE_ID = 1000109;

Example.CSSampleStrMessage.prototype.getMessageId = function () {
    return Example.CSSampleStrMessage.MESSAGE_ID;
};

//Example.CSSampleStrMessage写入字节缓存
Example.CSSampleStrMessage.prototype.write = function (buf) {
    if (this.value != null) {
        buf.writeStringField(11, this.value);
    }
};

//Example.CSSampleStrMessage读取字节缓存
Example.CSSampleStrMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.value = buf.readString();
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.CSSampleStrMessage计算序列化大小
Example.CSSampleStrMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 11
        size += io.computeStringFieldSize(1, this.value);
    }
    this.serializedSize = size;
    return size;
};

//Example.CSSampleStrMessage格式化字符串
Example.CSSampleStrMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "CSSampleStrMessage[1000109]" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};

Example.SCSampleStrMessage = function () {
    //类型:String  
    this.value = null;
    this.serializedSize = -1;
    //格式化时统一字段长度
    this._filedPad = 5;
};

Example.SCSampleStrMessage.MESSAGE_ID = 1000110;

Example.SCSampleStrMessage.prototype.getMessageId = function () {
    return Example.SCSampleStrMessage.MESSAGE_ID;
};

//Example.SCSampleStrMessage写入字节缓存
Example.SCSampleStrMessage.prototype.write = function (buf) {
    if (this.value != null) {
        buf.writeStringField(11, this.value);
    }
};

//Example.SCSampleStrMessage读取字节缓存
Example.SCSampleStrMessage.prototype.read = function (buf, endIndex) {
    while (true) {
        var tag = buf.readTag(endIndex);
        switch (tag) {
            case 0://end
                return;
            // 1 << 3 | 3
            case 11 :
                this.value = buf.readString();
                break;
            default://skip
                buf.skipTag(tag);
                break;
        }
    }
};

//Example.SCSampleStrMessage计算序列化大小
Example.SCSampleStrMessage.prototype.getSerializedSize = function () {
    var size = this.serializedSize;
    if (size > -1) {
        return size;
    }
    size = 0;
    if (this.value != null) {
        // tag size 已经完成了计算 11
        size += io.computeStringFieldSize(1, this.value);
    }
    this.serializedSize = size;
    return size;
};

//Example.SCSampleStrMessage格式化字符串
Example.SCSampleStrMessage.prototype.toString = function (_indent) {
    _indent = _indent == undefined ? "" : _indent;
    var _str = "";
    _str = _str + "SCSampleStrMessage[1000110]" + "{";
    _str = _str + "\n";
    _str = _str + _indent + rightPad("value", this._filedPad) + " = " + this.value;
    _str = _str + "\n";
    _str = _str + _indent + "}";
    return _str;
};


Example.SCEchoMessage.MessageDecoder = function () {
    this.getEmptyMessage = function () {
        return new Example.SCEchoMessage();
    }
};
io.regMessageDecoder(Example.SCEchoMessage.MESSAGE_ID, new Example.SCEchoMessage.MessageDecoder(), "Example.SCEchoMessage");

Example.SCSampleMessage.MessageDecoder = function () {
    this.getEmptyMessage = function () {
        return new Example.SCSampleMessage();
    }
};
io.regMessageDecoder(Example.SCSampleMessage.MESSAGE_ID, new Example.SCSampleMessage.MessageDecoder(), "Example.SCSampleMessage");

Example.SCSampleLongMessage.MessageDecoder = function () {
    this.getEmptyMessage = function () {
        return new Example.SCSampleLongMessage();
    }
};
io.regMessageDecoder(Example.SCSampleLongMessage.MESSAGE_ID, new Example.SCSampleLongMessage.MessageDecoder(), "Example.SCSampleLongMessage");

Example.SCSampleStrMessage.MessageDecoder = function () {
    this.getEmptyMessage = function () {
        return new Example.SCSampleStrMessage();
    }
};
io.regMessageDecoder(Example.SCSampleStrMessage.MESSAGE_ID, new Example.SCSampleStrMessage.MessageDecoder(), "Example.SCSampleStrMessage");
