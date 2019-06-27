package com.senpure.io.generator.reader;

import com.senpure.base.AppEvn;
import com.senpure.base.util.Assert;
import com.senpure.base.util.StringUtil;
import com.senpure.io.antlr.IoBaseListener;
import com.senpure.io.antlr.IoLexer;
import com.senpure.io.antlr.IoParser;
import com.senpure.io.generator.Constant;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.*;
import com.senpure.io.generator.util.ProtocolUtil;
import com.senpure.io.generator.util.TemplateUtil;
import com.senpure.template.FileUtil;
import com.senpure.template.Generator;
import freemarker.template.Configuration;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * IoProtocolReader
 *
 * @author senpure
 * @time 2019-05-15 16:23:49
 */
public class IoProtocolReader extends IoBaseListener {

    private static Logger logger = LoggerFactory.getLogger(IoProtocolReader.class);
    private List<Message> messages = new ArrayList<>(128);
    private List<Bean> beans = new ArrayList<>(128);
    private List<Event> events = new ArrayList<>(128);
    private List<Enum> enums = new ArrayList<>(128);

    private Bean bean;
    private Enum anEnum;
    private Message message;
    private Event event;
    private String namespace = "com.senpure.io";
    private String javaPackage = "com.senpure.io";
    private boolean enterJavaPackage = false;
    private boolean enterNamespace = false;
    private Field field;

    private int fieldIndex = 1;
    protected IoErrorListener ioErrorListener;

    protected String filePath;
    protected Map<String, IoProtocolReader> ioProtocolReaderMap;
    protected List<String> importIos = new ArrayList<>();
    protected List<String> importKeys = new ArrayList<>();

    protected StringBuilder errorBuiler = new StringBuilder();

    public boolean isHasError() {
        return ioErrorListener.isHasError();
    }


    protected void checkErrorBuilder() {
        if (errorBuiler.length() > 0) {
            errorBuiler.append("\n");
        }
    }

    private void setBeanValue() {
        bean.setJavaPack(javaPackage);
        bean.setNamespace(namespace);
        bean.setFilePath(filePath);
        fieldIndex = 1;

    }

    private void setBeanName(ParserRuleContext ctx) {
        bean.setOriginalName(ctx.getText());
        bean.setName(StringUtil.toUpperFirstLetter(bean.getOriginalName()));
        Token token = ctx.getStart();
        bean.getNameLocation().setLine(token.getLine());
        bean.getNameLocation().setPosition(token.getCharPositionInLine());
    }


    @Override
    public void enterImportValue(IoParser.ImportValueContext ctx) {
        String path = ctx.getText();
        importIos.add(path);
        File importFile = FileUtil.file(path, new File(filePath).getParent());
        if (importFile.exists()) {
            String key = importFile.getAbsolutePath();
            importKeys.add(key);
            IoReader.getInstance().read(importFile);
        } else {
            //  Assert.error(filePath + " 引用文件 不存在 " + path);
            checkErrorBuilder();
            errorBuiler.append(filePath).append("引用文件 不存在 ").append(path);
        }


    }


    @Override
    public void enterJavaPackageValue(IoParser.JavaPackageValueContext ctx) {
        if (enterJavaPackage) {
            return;
        }
        enterJavaPackage = true;
        javaPackage = ctx.getText();

    }

    @Override
    public void enterNamespaceValue(IoParser.NamespaceValueContext ctx) {
        if (enterNamespace) {
            return;
        }
        enterNamespace = true;
        namespace = ctx.getText();
        if (!enterJavaPackage) {
            String[] temp = namespace.split("\\.");
            for (String s : temp) {
                if (s.length() > 0) {
                    if (Character.isDigit(s.charAt(0))) {
                        return;
                    }
                }

            }
            javaPackage = namespace;
        }
    }


    @Override
    public void enterMessage(IoParser.MessageContext ctx) {
        message = new Message();
        messages.add(message);
        bean = message;
        setBeanValue();
        message.setJavaHandlerPack(javaPackage);
        if (Constant.JAVA_PACK_MESSAGE.trim().length() > 0) {
            message.setJavaPack(message.getJavaPack() + "." + Constant.JAVA_PACK_MESSAGE);
        }
        if (Constant.JAVA_PACK_HANDLER.trim().length() > 0) {
            message.setJavaHandlerPack(message.getJavaHandlerPack() + "." + Constant.JAVA_PACK_HANDLER);
        }


    }

    @Override
    public void enterEntityComment(IoParser.EntityCommentContext ctx) {
        String c = ctx.getText().substring(2).trim();
        if (c.length() > 0) {
            String ex = bean.getExplain();
            if (ex == null) {
                ex = "";
            }
            bean.setExplain(ex + c);
        }
    }

    @Override
    public void enterMessageType(IoParser.MessageTypeContext ctx) {
        message.setType(ctx.getText().toUpperCase());
    }

    @Override
    public void enterMessageId(IoParser.MessageIdContext ctx) {
        message.setId(Integer.valueOf(ctx.getText()));
    }

    @Override
    public void enterMessageName(IoParser.MessageNameContext ctx) {
        setBeanName(ctx);
    }

    @Override
    public void enterField(IoParser.FieldContext ctx) {
        field = new Field();
        bean.getFields().add(field);

    }

    @Override
    public void enterFieldType(IoParser.FieldTypeContext ctx) {
        field.setClassType(ctx.getText());
        Token token = ctx.getStart();

        field.getTypeLocation().setLine(token.getLine());
        field.getTypeLocation().setPosition(token.getCharPositionInLine());

        field.setBaseField(ProtocolUtil.isBaseField(field.getClassType()));
        if (field.isBaseField()) {
            bean.setHasBean(false);
        } else {
            bean.setHasBean(true);
        }
        bean.getSingleField().put(field.getClassType(), field);
    }

    @Override
    public void enterFieldList(IoParser.FieldListContext ctx) {
        field.setList(true);
    }

    @Override
    public void enterFieldName(IoParser.FieldNameContext ctx) {
        field.setName(ctx.getText());
        Token token = ctx.getStart();
        field.getNameLocation().setLine(token.getLine());
        field.getNameLocation().setPosition(token.getCharPositionInLine());
    }

    @Override
    public void enterFieldIndex(IoParser.FieldIndexContext ctx) {
        field.setIndex(Integer.valueOf(ctx.getText()));
    }

    @Override
    public void enterFieldComment(IoParser.FieldCommentContext ctx) {
        String c = ctx.getText().substring(2).trim();
        if (c.length() > 0) {
            field.setExplain(c);
        }
    }

    private void fieldCheck() {

        if (field.getIndex() == 0) {
            field.setIndex(fieldIndex++);
        }
        if (field.getIndex() < 0) {
            checkErrorBuilder();
            errorBuiler.append(filePath).append(field.getNameLocation()).append(" ")
                    .append(field.getName()).append("index 为负数");
            // Assert.error(field.getNameLocation().toString() + " " + field.getName() + "index 为负数");
        }
        for (int i = 0; i < bean.getFields().size() - 1; i++) {
            Field f = bean.getFields().get(i);
            if (f.getIndex() == field.getIndex()) {
                checkErrorBuilder();
                errorBuiler.append(filePath).append(":");
                errorBuiler.append(bean.getName()).append(" field index 相同 [").append(f.getIndex()).append("] ");
                errorBuiler.append(f.getNameLocation()).append(" ").append(f.getName());
                errorBuiler.append(",").append(field.getNameLocation()).append(" ").append(field.getName());
                //Assert.error(bean.getName() + " field index 相同 " + f.getNameLocation().toString() + " " + f.getName() +
                //      "," + field.getNameLocation().toString() + " " + field.getIndex());
            }
            if (f.getName().equals(field.getName())) {
                checkErrorBuilder();
                errorBuiler.append(filePath).append(":");
                errorBuiler.append(bean.getName()).append("  field name 相同");
                errorBuiler.append(f.getNameLocation()).append(" ").append(f.getName());
                errorBuiler.append(",").append(field.getNameLocation()).append(" ").append(field.getName());
                // Assert.error(bean.getName() + " field name 相同 " + f.getNameLocation().toString() + " " + f.getName() +
                //        "," + field.getNameLocation().toString() + " " + field.getName());
            }
        }
        int fieldLen = field.getName().length();
        if (fieldLen > bean.getFieldMaxLen()) {
            bean.setFieldMaxLen(fieldLen);
        }
        if (field.isBaseField()) {
            field.setWriteType(ProtocolUtil.getWriteType(field.getClassType()));
            field.setJavaType(ProtocolUtil.getJavaType(field.getClassType()));
            if (field.isList() && !field.getClassType().equals("String")) {
                field.setWriteType(ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
            }
            field.setTag(field.getIndex() << 3 | field.getWriteType());
        } else {
            field.setJavaType(field.getClassType());
            field.setWriteType(ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
            field.setTag(field.getIndex() << 3 | ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
        }
        logger.debug("{} {} {}", bean.getType(), bean.getName(), field);
    }

    @Override
    public void exitField(IoParser.FieldContext ctx) {

        fieldCheck();
    }


    @Override
    public void enterBean(IoParser.BeanContext ctx) {
        bean = new Bean();
        beans.add(bean);
        setBeanValue();
        if (Constant.JAVA_PACK_BEAN.trim().length() > 0) {
            bean.setJavaPack(bean.getJavaPack() + "." + Constant.JAVA_PACK_BEAN);
        }
    }

    @Override
    public void enterBeanName(IoParser.BeanNameContext ctx) {
        setBeanName(ctx);
    }

    @Override
    public void enterEnumSymbol(IoParser.EnumSymbolContext ctx) {
        anEnum = new Enum();
        bean = anEnum;
        enums.add(anEnum);
        setBeanValue();
        if (Constant.JAVA_PACK_ENUM.trim().length() > 0) {
            bean.setJavaPack(bean.getJavaPack() + "." + Constant.JAVA_PACK_ENUM);
        }

    }

    @Override
    public void enterEnumName(IoParser.EnumNameContext ctx) {
        setBeanName(ctx);
    }


    @Override
    public void enterEnumField(IoParser.EnumFieldContext ctx) {
        field = new Field();
        if (bean.getFields().size() == 0) {
            anEnum.setDefaultField(field);
        }
        bean.getFields().add(field);
    }


    @Override
    public void exitEnumField(IoParser.EnumFieldContext ctx) {
        fieldCheck();
    }

    @Override
    public void exitEnumSymbol(IoParser.EnumSymbolContext ctx) {
        if (anEnum.getDefaultField().getIndex() != 1) {
            checkErrorBuilder();
            errorBuiler.append(filePath).append(": 枚举第一个字段index必须为一 ").append(anEnum.getName());
        }
    }

    @Override
    public void enterEvent(IoParser.EventContext ctx) {
        event = new Event();
        bean = event;
        events.add(event);
        setBeanValue();
        event.setJavaHandlerPack(javaPackage);
        if (Constant.JAVA_PACK_EVENT.trim().length() > 0) {
            event.setJavaPack(event.getJavaPack() + "." + Constant.JAVA_PACK_EVENT);
        }
        if (Constant.JAVA_PACK_EVENT_HANDLER.trim().length() > 0) {
            event.setJavaHandlerPack(event.getJavaHandlerPack() + "." + Constant.JAVA_PACK_EVENT_HANDLER);
        }
    }

    @Override
    public void enterEventName(IoParser.EventNameContext ctx) {
        setBeanName(ctx);
    }

    @Override
    public void enterEventId(IoParser.EventIdContext ctx) {
        event.setId(Integer.valueOf(ctx.getText()));
    }


    @Override
    public void exitProtocol(IoParser.ProtocolContext ctx) {
        check();
        findBenAndAssignment();
        if (errorBuiler.length() > 0) {
            Assert.error("校验不合法\n" + errorBuiler.toString());
        }
    }

    private void checkName(Bean a, Bean b, String aName, String bName) {
        if (aName.equals(bName)&&a.getNamespace().equals(b.getNamespace())) {

            checkErrorBuilder();
            errorBuiler.append(filePath).append(": 同有命名空间name重复 ").append(aName);
            errorBuiler.append(a.getNameLocation()).append(" ").append(b.getNameLocation());
        }
    }

    private void checkId(Bean a, Bean b, String aName, String bName, int aId, int bId) {
        if (aId == bId) {
            checkErrorBuilder();
            errorBuiler.append(filePath).append(": Id重复 ").append(aId);
            errorBuiler.append(" ");
            errorBuiler.append(a.getNameLocation()).append(aName)
                    .append(" <--> ").append(b.getNameLocation()).append(bName);
        }
    }

    private void check() {

        List<Bean> beanAndEnums = new ArrayList<>();
        beanAndEnums.addAll(beans);
        beanAndEnums.addAll(enums);

        for (int i = 0; i < beanAndEnums.size() - 1; i++) {
            Bean a = beanAndEnums.get(i);
            for (int j = i + 1; j < beanAndEnums.size(); j++) {
                Bean b = beanAndEnums.get(j);
                checkName(a, b, a.getName(), b.getName());
            }
        }
        for (int i = 0; i < messages.size() - 1; i++) {
            Message a = messages.get(i);
            for (int j = i + 1; j < messages.size(); j++) {
                Message b = messages.get(j);
                String aName = a.getType() + a.getName();
                String bName = b.getType() + b.getName();
                checkName(a, b, aName, bName);
                checkId(a, b, aName, bName, a.getId(), b.getId());
            }

        }
        for (int i = 0; i < events.size() - 1; i++) {
            Event a = events.get(i);
            for (int j = i + 1; j < events.size(); j++) {
                Event b = events.get(j);
                String aName = a.getName();
                String bName = b.getName();
                checkName(a, b, aName, bName);
                checkId(a, b, aName, bName, a.getId(), b.getId());

            }
        }

    }

    private void findBenAndAssignment() {
        List<Bean> finds = new ArrayList<>();
        // List<Bean> modelBeans = new ArrayList<>();
        List<Bean> allBeans = new ArrayList<>();
        finds.addAll(beans);
        finds.addAll(events);
        finds.addAll(messages);

        // modelBeans.addAll(beans);
        // modelBeans.addAll(enums);
        allBeans.addAll(beans);
        allBeans.addAll(enums);
        for (String importKey : importKeys) {
            IoProtocolReader value = ioProtocolReaderMap.get(importKey);
            allBeans.addAll(value.beans);
            allBeans.addAll(value.enums);
        }

        findBenAndAssignment(finds, allBeans);
    }

    /**
     * @param beans
     * @param allBeans
     */
    //给bean 下的 bean赋值
    private void findBenAndAssignment(List<Bean> beans, List<Bean> allBeans) {
        for (Bean bean : beans) {
            for (Field field : bean.getFields()) {
                if (!field.isBaseField()) {
                    Bean b = findBean(field.getClassType(), allBeans);
                    if (b != null) {
                        field.setBean(b);
                    } else {
                        checkErrorBuilder();
                        errorBuiler.append(filePath).append(field.getTypeLocation()).append(" ")
                                .append(bean.getType());
                        errorBuiler.append(bean.getName()).append(".").append(field.getName());
                        errorBuiler.append("[");
                        errorBuiler.append(field.getClassType())
                                .append("] Type,未定义，或未引用 ");
                        // Assert.error(filePath + " line " + field.getTypeLocation().getLine() + ":" + field.getTypeLocation().getPosition() + " " + bean.getType() + bean.getName() + "." + field.getName()
                        //      + "[" + field.getClassType() + "] Type,未定义，或未引用");
                    }

                }
            }
        }
    }

    private static Bean findBean(String type, List<Bean> beans) {
        for (Bean bean : beans) {
            if (bean.getOriginalName().equals(type)) {
                return bean;
            }
        }
        return null;
    }

    public void read(File file, Map<String, IoProtocolReader> ioProtocolReaderMap) {
        try {
            this.filePath = file.getPath();
            this.ioProtocolReaderMap = ioProtocolReaderMap;
            this.ioErrorListener = new IoErrorListener(filePath);
            read(CharStreams.fromFileName(file.getAbsolutePath(), Charset.forName("utf-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    CommonTokenStream tokens;

    protected void read(CharStream input) {
        Lexer lexer = new IoLexer(input);
        tokens = new CommonTokenStream(lexer);

        IoParser parser = new IoParser(tokens);
        //清除consoleErrorListener
        parser.getErrorListeners().clear();
        parser.addErrorListener(ioErrorListener);
        IoParser.ProtocolContext protocolContext = parser.protocol();
        ParseTreeWalker walker = new ParseTreeWalker();
        if (!isHasError()) {
            walker.walk(this, protocolContext);
            // findBenAndAssignment(ioProtocolReaderMap);
        }

    }


    private void protocolString() {

        File javaFile = new File(TemplateUtil.templateDir(), "java2");
        Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        try {
            cfg.setDirectoryForTemplateLoading(new File(TemplateUtil.templateDir(), "java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        TemplateUtil.share(cfg);
        for (Bean b : beans) {
            File file = new File(FileUtil.file("../../src/test/java"), FileUtil.fullFileEnd(b.getJavaPack().replace(".", File.separator)) + b.getJavaName() + ".java");
            //File file = new File(AppEvn.getClassRootPath(), msg.getJavaName() + ".java");
            if (!file.getParentFile().exists()) {

                file.getParentFile().mkdirs();
            }
            logger.info(file.getAbsolutePath());
            try {
                Generator.generate(b, cfg.getTemplate("bean.ftl"), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Message msg : messages) {

            File file = new File(FileUtil.file("../../src/test/java"), FileUtil.fullFileEnd(msg.getJavaPack().replace(".", File.separator)) + msg.getJavaName() + ".java");
            //File file = new File(AppEvn.getClassRootPath(), msg.getJavaName() + ".java");
            if (!file.getParentFile().exists()) {

                file.getParentFile().mkdirs();
            }
            logger.info(file.getAbsolutePath());
            try {
                Generator.generate(msg, cfg.getTemplate("message.ftl"), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Enum anEnum : enums) {
            File file = new File(FileUtil.file("../../src/test/java"), FileUtil.fullFileEnd(anEnum.getJavaPack().replace(".", File.separator)) + anEnum.getJavaName() + ".java");
            if (!file.getParentFile().exists()) {

                file.getParentFile().mkdirs();
            }
            try {
                Generator.generate(anEnum, cfg.getTemplate("enum.ftl"), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<Bean> getBeans() {
        return beans;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Enum> getEnums() {
        return enums;
    }

    public List<String> getImportIos() {
        return importIos;
    }

    public List<String> getImportKeys() {
        return importKeys;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getJavaPackage() {
        return javaPackage;
    }


    public String getFilePath() {
        return filePath;
    }

    public Map<String, IoProtocolReader> getIoProtocolReaderMap() {
        return ioProtocolReaderMap;
    }

    public static void main(String[] args) throws IOException {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();

        IoProtocolReader reader = IoReader.getInstance().read(new File(AppEvn.getClassRootPath(), "hello.io"));

        if (!reader.isHasError()) {

            reader.protocolString();
        }
        //System.out.println(FileUtil.file("lll"));
    }
}
