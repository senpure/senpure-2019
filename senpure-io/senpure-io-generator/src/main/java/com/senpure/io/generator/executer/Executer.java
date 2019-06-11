package com.senpure.io.generator.executer;

import com.senpure.base.AppEvn;
import com.senpure.base.util.Assert;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Message;
import com.senpure.io.generator.reader.IoProtocolReader;
import com.senpure.io.generator.reader.IoReader;
import com.senpure.io.generator.util.TemplateUtil;
import com.senpure.template.FileUtil;
import com.senpure.template.Generator;
import com.senpure.template.sovereignty.Sovereignty;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Executer
 *
 * @author senpure
 * @time 2019-06-11 15:56:05
 */
public class Executer {

    private Configuration cfg;

    private Logger logger = LoggerFactory.getLogger(getClass());
    private ExecuterContext context;

    public Executer(ExecuterContext context) {
        this.context = context;
        cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        TemplateUtil.share(cfg);
    }


    public void changeTemplateDir2Java() {
        try {
            cfg.setDirectoryForTemplateLoading(new File(TemplateUtil.templateDir(), context.getJavaTemplateDir()));
        } catch (IOException e) {
            Assert.error(e);
        }
    }

    public void generate() {
        if (context.isGenerateJavaBean()) {
            generateJavaBean();
            generateJavaEnum();
        }
        if (context.isGenerateJavaMessage()) {
            generateJavaMessage();
        }
        if (context.isGenerateJavaMessageHandler()) {
            generateJavaMessageHandler();
        }
        if (context.isGenerateJavaEvent()) {
            generateJavaEvent();
        }
        if (context.isGenerateJavaEventHandler()) {
            generateJavaEventHandler();
        }
    }

    private void checkFile(File file) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
    }

    public void generateJavaBean() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaBeanTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getBeans()) {
            File file = new File(context.getJavaBeanCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPack().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.debug("生成 bean {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }

    public void generateJavaEnum() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaEnumTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getEnums()) {
            File file = new File(context.getJavaBeanCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPack().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.debug("生成 enum {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }


    public void generateJavaMessage() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaMessageTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getMessages()) {
            File file = new File(context.getJavaBeanCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPack().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.debug("生成 message {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }


    public void generateJavaMessageHandler() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaMessageHandlerTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Message message : context.getMessages()) {
            if (message.getType().equals("CS")) {
                if (!context.isGenerateJavaCSMessageHandler()) {
                    continue;
                }
            } else if (message.getType().equals("SC")) {
                if (!context.isGenerateJavaSCMessageHandler()) {
                    continue;
                }
            }
            File file = new File(context.getJavaCodeRootPath(), FileUtil.fullFileEnd(message.getJavaHandlerPack().replace(".", File.separator)) + message.getJavaHandlerName() + ".java");
            boolean cover = false;
            if (file.exists()) {
                if (!context.isJavaMessageHandlerCover()) {
                    logger.warn("messageHandler 存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                    continue;
                } else {
                    cover = true;
                }

            }
            checkFile(file);
            message.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            if (cover) {
                logger.debug("覆盖生成 messageHandler {} {}", file.getName(), file.getAbsoluteFile());
            } else {
                logger.debug("生成 messageHandler {} {}", file.getName(), file.getAbsoluteFile());
            }

            Generator.generate(message, template, file);
        }

    }

    public void generateJavaEvent() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaEventTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getEvents()) {
            File file = new File(context.getJavaBeanCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPack().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.debug("生成 event {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }

    public void generateJavaEventHandler() {
        changeTemplateDir2Java();
        Template template = null;
        try {
            template = cfg.getTemplate(context.getJavaEventHandlerTemplate());
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Event event : context.getEvents()) {
            File file = new File(context.getJavaCodeRootPath(), FileUtil.fullFileEnd(event.getJavaHandlerPack().replace(".", File.separator)) + event.getJavaHandlerName() + ".java");
            boolean cover = false;
            if (file.exists()) {
                if (!context.isJavaEventHandlerCover()) {
                    logger.warn("eventHandler 存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                    continue;
                } else {
                    cover = true;
                }

            }
            checkFile(file);
            event.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            if (cover) {
                logger.debug("覆盖生成 eventHandler {} {}", file.getName(), file.getAbsoluteFile());
            } else {
                logger.debug("生成 eventHandler {} {}", file.getName(), file.getAbsoluteFile());
            }

            Generator.generate(event, template, file);
        }

    }

    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();


        List<String> paths = new ArrayList<>();
        paths.add("hello.io");
        paths.add("hello2.io");
        paths.add("ioMessage.io");
        for (String path : paths) {
            IoReader.getInstance().read(new File(AppEvn.getClassRootPath(), path));
        }
        Map<String, IoProtocolReader> ioProtocolReaderMap = IoReader.getInstance().getIoProtocolReaderMap();

        ExecuterContext context = new ExecuterContext();

        for (IoProtocolReader value : ioProtocolReaderMap.values()) {
            context.addBeans(value.getBeans());
            context.addEnums(value.getEnums());
            context.addEvents(value.getEvents());
            context.addMessages(value.getMessages());
        }
        context.setJavaCodeRootPath(FileUtil.file("../../src/test/java").getAbsolutePath());
        context.setJavaBeanCodeRootPath(FileUtil.file("../../src/test/java").getAbsolutePath());
        Executer executer = new Executer(context);
        executer.generate();
    }
}
