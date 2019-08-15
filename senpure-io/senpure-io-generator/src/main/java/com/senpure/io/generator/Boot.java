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
import java.util.ArrayList;
import java.util.List;
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
            ProjectConfig config = null;
            String useProject = System.getProperty("useProject");
            if (useProject == null) {
                config = HabitUtil.getUseConfig();
            } else {
                for (ProjectConfig projectConfig : HabitUtil.getHabit().getConfigs()) {
                    if (Objects.equals(projectConfig.getProjectName(), useProject)) {
                        config = projectConfig;
                        break;
                    }
                }
                if (config == null) {
                    logger.info("项目 {} 没有配置 ", useProject);
                    return;
                }
            }
            logger.info("使用项目 {} ", config.getProjectName());
            boolean useOverwrite = false;
            String overwrite = System.getProperty("overwrite");
            if (overwrite == null) {
                if (hasExtraOverwrite(config)) {
                    logger.info("(1)静默模式要使额外覆盖设置生效请使用参数-DextraOverwrite=true");
                    logger.info("(2)静默模式要使额外覆盖设置生效请使用参数-DextraOverwrite=true");
                    logger.info("(3)静默模式要使额外覆盖设置生效请使用参数-DextraOverwrite=true");
                }

            } else {
                if (Objects.equals(overwrite, "true")) {
                    useOverwrite = true;
                }
            }

            if (config.getProtocolFiles().size() == 0) {
                logger.warn("没有配置协议文件");
                return;
            }
            IoReader.getInstance().clear();
            StringBuilder errorBuilder = new StringBuilder();
            boolean error = false;
            List<IoProtocolReader> ioProtocolReaders = new ArrayList<>();
            for (ProtocolFile protocolFile : config.getProtocolFiles()) {
                try {
                    IoProtocolReader ioProtocolReader = IoReader.getInstance().read(new File(protocolFile.getPath()));
                    ioProtocolReaders.add(ioProtocolReader);
                    if (ioProtocolReader.isHasError()) {
                        if (errorBuilder.length() > 0) {
                            errorBuilder.append("\n");
                        }
                        errorBuilder.append(ioProtocolReader.getFilePath()).append(" ").append(ioProtocolReader.getFilePath());
                        //logger.error("{} 出现语法错误", ioProtocolReader.getFilePath());
                        error = true;
                    }
                } catch (Exception e) {
                    if (errorBuilder.length() > 0) {
                        errorBuilder.append("\n");
                    }
                    errorBuilder.append(e.getMessage());
                    //logger.error(e.getMessage());
                    error = true;
                }

            }
            if (error) {
                logger.error("协议错误\n{}", errorBuilder.toString());
                return;
            }
            ExecutorContext executorContext = new ExecutorContext();
            for (IoProtocolReader ioProtocolReader : ioProtocolReaders) {
                executorContext.getEnums().addAll(ioProtocolReader.getEnums());
                executorContext.getBeans().addAll(ioProtocolReader.getBeans());
                executorContext.getMessages().addAll(ioProtocolReader.getMessages());
                executorContext.getEvents().addAll(ioProtocolReader.getEvents());
            }
            executorContext.setProjectName(config.getProjectName());

            if (!useOverwrite) {
                JavaConfig javaConfig = config.getJavaConfig();
                javaConfig.setJavaEventHandlerOverwrite(false);
                javaConfig.setJavaCSMessageHandlerOverwrite(false);
                javaConfig.setJavaSCMessageHandlerOverwrite(false);
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

    private static boolean hasExtraOverwrite(ProjectConfig config) {
        JavaConfig javaConfig = config.getJavaConfig();

        if (javaConfig.isJavaCSMessageHandlerOverwrite()) {
            return true;
        }
        if (javaConfig.isJavaSCMessageHandlerOverwrite()) {

            return true;
        }
        if (javaConfig.isJavaEventHandlerOverwrite()) {

            return true;
        }

        return false;
    }
}
