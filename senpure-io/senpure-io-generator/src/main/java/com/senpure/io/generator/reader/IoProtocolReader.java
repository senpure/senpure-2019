package com.senpure.io.generator.reader;

import com.senpure.base.AppEvn;
import com.senpure.base.util.Assert;
import com.senpure.base.util.StringUtil;
import com.senpure.io.antlr.IoBaseListener;
import com.senpure.io.antlr.IoLexer;
import com.senpure.io.antlr.IoParser;
import com.senpure.io.generator.Boot;
import com.senpure.io.generator.Constant;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Field;
import com.senpure.io.generator.model.Message;
import com.senpure.io.generator.util.ProtocolUtil;
import com.senpure.io.generator.util.TemplateUtil;
import com.senpure.template.Generator;
import freemarker.template.Configuration;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    private Bean bean;
    private Message message;
    private Event event;
    private String namespace = "com.senpure.io";
    private String javaPackage = "com.senpure.io";
    private Field field;

    private void setBeanValue(Bean bean) {
        bean.setJavaPack(javaPackage);
        bean.setNamespace(namespace);
    }

    @Override
    public void enterJavaPackageValue(IoParser.JavaPackageValueContext ctx) {
        javaPackage = ctx.getText();
    }

    @Override
    public void enterNamespace(IoParser.NamespaceContext ctx) {
        namespace = ctx.getText();
    }

    @Override
    public void enterMessage(IoParser.MessageContext ctx) {
        message = new Message();
        messages.add(message);
        bean = message;
        setBeanValue(bean);
        message.setHandlerJavaPack(javaPackage);
        if (Constant.JAVA_PACK_MESSAGE.trim().length() > 0) {
            message.setJavaPack(message.getJavaPack() + "." + Constant.JAVA_PACK_MESSAGE);
        }
        if (Constant.JAVA_PACK_HANDLER.trim().length() > 0) {
            message.setHandlerJavaPack(message.getHandlerJavaPack() + "." + Constant.JAVA_PACK_HANDLER);
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
        message.setName(StringUtil.toUpperFirstLetter(ctx.getText()));
    }

    @Override
    public void enterField(IoParser.FieldContext ctx) {
        field = new Field();
        bean.getFields().add(field);
        field.setBean(bean);
    }

    @Override
    public void enterFieldType(IoParser.FieldTypeContext ctx) {
        field.setClassType(ctx.getText());
        bean.getSingleField().put(field.getClassType(), field);
        field.setBaseField(ProtocolUtil.isBaseField(field.getClassType()));
        if (field.isBaseField()) {
            bean.setHasBean(false);
        } else {
            bean.setHasBean(true);
        }
    }

    @Override
    public void enterFieldName(IoParser.FieldNameContext ctx) {
        field.setName(ctx.getText());
    }

    @Override
    public void enterFieldComment(IoParser.FieldCommentContext ctx) {
        String c = ctx.getText().substring(2).trim();
        if (c.length() > 0) {
            field.setExplain(c);
        }
    }

    @Override
    public void exitField(IoParser.FieldContext ctx) {
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
    public void enterBean(IoParser.BeanContext ctx) {
        bean = new Bean();
        beans.add(bean);
        setBeanValue(bean);
        if (Constant.JAVA_PACK_BEAN.trim().length() > 0) {
            bean.setJavaPack(bean.getJavaPack() + "." + Constant.JAVA_PACK_BEAN);
        }
    }

    @Override
    public void enterBeanName(IoParser.BeanNameContext ctx) {
        bean.setName(StringUtil.toUpperFirstLetter(ctx.getText()));
    }

    @Override
    public void enterEvent(IoParser.EventContext ctx) {
        event = new Event();
        bean = event;
        events.add(event);
        setBeanValue(event);
        event.setHandlerJavaPack(javaPackage);
        if (Constant.JAVA_PACK_EVENT.trim().length() > 0) {
            event.setJavaPack(event.getJavaPack() + "." + Constant.JAVA_PACK_EVENT);
        }
        if (Constant.JAVA_PACK_EVENT_HANDLER.trim().length() > 0) {
            event.setHandlerJavaPack(event.getHandlerJavaPack() + "." + Constant.JAVA_PACK_EVENT_HANDLER);
        }
    }

    @Override
    public void enterEventName(IoParser.EventNameContext ctx) {
        bean.setName(StringUtil.toUpperFirstLetter(ctx.getText()));
    }

    @Override
    public void enterEventId(IoParser.EventIdContext ctx) {
        event.setId(Integer.valueOf(ctx.getText()));
    }

    @Override
    public void exitMessage(IoParser.MessageContext ctx) {

    }

    private void findBenAndAssignment() {
        List<Bean> finds = new ArrayList<>();
        List<Bean> modelBeans = new ArrayList<>();
        List<Bean> allBeans = new ArrayList<>();
        finds.addAll(beans);
        finds.addAll(events);
        finds.addAll(messages);

        modelBeans.addAll(beans);
        allBeans.addAll(beans);
        findBenAndAssignment(finds, modelBeans, allBeans);
    }

    //给bean 下的 bean赋值
    private static void findBenAndAssignment(List<Bean> beans, List<Bean> modelBeans, List<Bean> allBeans) {
        for (Bean bean : beans) {
            for (Field field : bean.getFields()) {
                if (!field.isBaseField()) {
                    Bean b = findBean(field.getClassType(), modelBeans);
                    if (b == null) {
                        b = findBean(field.getClassType(), allBeans);
                    } else {
                        field.setOtherPart(false);
                    }
                    if (b != null) {
                        field.setBean(b);
                    } else {
                        Assert.error(
                                (bean.getType().equalsIgnoreCase("NA") ? "" : bean.getType()) + bean.getName() + "." + field.getName()
                                        + "[" + field.getClassType() + "] Type,未定义，或未引用");
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

    private void ioWalk() throws IOException {
        Lexer lexer = new IoLexer(CharStreams.fromStream(getClass().
                getResourceAsStream("/hello.io")));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IoParser parser = new IoParser(tokens);

        parser.addErrorListener(new DiagnosticErrorListener(false));

        // DefaultErrorStrategy();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, parser.protocol());
    }

    private void protocolString() {

        File javaFile = new File(TemplateUtil.templateDir(), "java2");
        Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        try {
            cfg.setDirectoryForTemplateLoading(new File(TemplateUtil.templateDir(), "java2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        TemplateUtil.share(cfg);
        for (Message msg : messages) {
            File file = new File(AppEvn.getClassRootPath(Boot.class), msg.getName() + ".java");
            try {
                Generator.generate(msg, cfg.getTemplate("message.ftl"), file, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        AppEvn.installAnsiConsole();

        IoProtocolReader reader = new IoProtocolReader();
        reader.ioWalk();
        reader.protocolString();
    }
}
