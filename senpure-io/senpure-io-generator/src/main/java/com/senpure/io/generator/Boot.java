package com.senpure.io.generator;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.executor.Executor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.habit.*;
import com.senpure.io.generator.reader.IoProtocolReader;
import com.senpure.io.generator.reader.IoReader;
import com.senpure.io.generator.ui.UiBoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Objects;

/**
 * Boot
 *
 * @author senpure
 * @time 2019-05-15 14:26:10
 */

public class Boot {

    private static Logger logger = LoggerFactory.getLogger(Boot.class);

    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();
        if (Objects.equals(System.getProperty("silence"), "true")) {
            ProjectConfig config = HabitUtil.getUseConfig();
            logger.info("使用项目 {} ", config.getProjectName());
            boolean useCover = false;
            String cover = System.getProperty("cover");
            if (cover == null) {
                if (hasCover(config)) {
                    logger.info("静默模式要使覆盖设置生效请使用参数-Dsilence=true");
                    logger.info("静默模式要使覆盖设置生效请使用参数-Dsilence=true");
                    logger.info("静默模式要使覆盖设置生效请使用参数-Dsilence=true");
                }

            } else {
                if (Objects.equals(cover, "true")) {
                    useCover = true;
                }
            }

            if (config.getProtocolFiles().size() == 0) {
                logger.warn("没有配置协议文件");
                return;
            }
            IoReader.getInstance().clear();
            boolean error = false;
            for (ProtocolFile protocolFile : config.getProtocolFiles()) {
                try {
                    IoProtocolReader ioProtocolReader = IoReader.getInstance().read(new File(protocolFile.getPath()));
                    if (ioProtocolReader.isHasError()) {
                        logger.error("{} 出现语法错误", ioProtocolReader.getFilePath());
                        error = true;
                    }
                } catch (Exception e) {
                    logger.error(e.getMessage());
                    error = true;
                }

            }
            if (error) {
                return;
            }
            ExecutorContext executorContext = new ExecutorContext();
            for (IoProtocolReader ioProtocolReader : IoReader.getInstance().getIoProtocolReaderMap().values()) {
                executorContext.getEnums().addAll(ioProtocolReader.getEnums());
                executorContext.getBeans().addAll(ioProtocolReader.getBeans());
                executorContext.getMessages().addAll(ioProtocolReader.getMessages());
                executorContext.getEvents().addAll(ioProtocolReader.getEvents());
            }
            executorContext.setProjectName(config.getProjectName());

            if (!useCover) {
                JavaConfig javaConfig = config.getJavaConfig();
                javaConfig.setJavaEventHandlerCover(false);
                javaConfig.setJavaCSMessageHandlerCover(false);
                javaConfig.setJavaSCMessageHandlerCover(false);
            } else {
                logger.info("不使用覆盖设置");
            }

            String generateJava = System.getProperty("generateJava");
            if (generateJava == null || Objects.equals(generateJava, "true")) {
                executorContext.setJavaConfig(config.getJavaConfig());
            }
            Executor executor = new Executor(executorContext);
            executor.generate();

        } else {
            UiBoot.main(args);
        }
        // SpringApplication.run(Boot.class, args);
    }

    private static boolean hasCover(ProjectConfig config) {
        JavaConfig javaConfig = config.getJavaConfig();

        if (javaConfig.isJavaCSMessageHandlerCover()) {
            return true;
        }
        if (javaConfig.isJavaSCMessageHandlerCover()) {

            return true;
        }
        if (javaConfig.isJavaEventHandlerCover()) {

            return true;
        }

        return false;
    }
}
