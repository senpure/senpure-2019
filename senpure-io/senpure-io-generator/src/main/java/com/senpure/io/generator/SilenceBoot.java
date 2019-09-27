package com.senpure.io.generator;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.executor.Executor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.habit.*;
import com.senpure.io.generator.reader.IoProtocolReader;
import com.senpure.io.generator.reader.IoReader;

import com.senpure.template.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SilenceBoot
 *
 * @author senpure
 * @time 2019-09-25 17:57:51
 */
public class SilenceBoot {
    private static Logger logger = LoggerFactory.getLogger(SilenceBoot.class);

    public static void main(String[] args) {
        AppEvn.tryMarkClassRootPath();
        AppEvn.installAnsiConsole();
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
        String fileStr = System.getProperty("protocolFile");
        List<File> files = new ArrayList<>();
        if (fileStr != null) {
            String[] fileNames = fileStr.split(",");
            for (String fileName : fileNames) {
                File file = new File(fileName);
                findFile(file, files);
            }
        } else {
            for (ProtocolFile protocolFile : config.getProtocolFiles()) {
                files.add(new File(protocolFile.getPath()));

            }
        }
        if (files.size() == 0) {
            logger.warn("没有配置协议文件");
            return;
        }
        if (!useOverwrite) {
            config.getJavaConfig().notAllowExtraOverwrite();
            config.getLuaConfig().notAllowExtraOverwrite();
            config.getJsConfig().notAllowExtraOverwrite();
        } else {
            logger.info("不使用覆盖设置");
        }

        IoReader.getInstance().clear();
        StringBuilder errorBuilder = new StringBuilder();
        boolean error = false;
        List<IoProtocolReader> ioProtocolReaders = new ArrayList<>();
        for (File file : files) {
            try {
                IoProtocolReader ioProtocolReader = IoReader.getInstance().read(file);
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

        boolean notGenerate = true;
        if (checkGenerateJava(config.getJavaConfig())) {
            notGenerate = false;
            executorContext.addLanguageConfig(config.getJavaConfig());
        }
        if (checkGenerateLua(config.getLuaConfig())) {
            notGenerate = false;
            executorContext.addLanguageConfig(config.getLuaConfig());
        }
        if (checkGenerateJs(config.getJsConfig())) {
            notGenerate = false;
            executorContext.addLanguageConfig(config.getJsConfig());
        }
        //不生成任何文件生成java
        if (notGenerate) {
            executorContext.addLanguageConfig(config.getJavaConfig());
        }
        Executor executor = new Executor(executorContext);
        executor.generate();
    }


    private static void fileRootPath(AbstractLanguageConfig config, File file) {
        config.setProtocolCodeRootPath(file.getAbsolutePath());
        config.setCsMessageHandlerCodeRootPath(file.getAbsolutePath());
        config.setScMessageHandlerCodeRootPath(file.getAbsolutePath());
        config.setEventHandlerCodeRootPath(file.getAbsolutePath());
    }

    private static boolean isTrue(String str) {
        if (str != null && Objects.equals(str, "true")) {
            return true;
        }
        return false;
    }

    private static boolean isFalse(String str) {
        if (str != null && Objects.equals(str, "false")) {
            return true;
        }
        return false;
    }

    private static boolean checkGenerateJava(JavaConfig config) {
        String generateOut = System.getProperty("javaOut");
        String generateJava = System.getProperty("generateJava");
        if (isFalse(generateJava)) {
            return false;
        }
        if (generateOut != null) {
            File file = FileUtil.file(generateOut);
            fileRootPath(config, file);
            return true;
        }

        return isTrue(generateJava);
    }

    private static boolean checkGenerateLua(LuaConfig config) {
        String generateLua = System.getProperty("generateLua");
        if (isFalse(generateLua)) {
            return false;
        }
        String generateOut = System.getProperty("luaOut");
        if (generateOut != null) {
            File file = FileUtil.file(generateOut);
            fileRootPath(config, file);

            return true;
        }
        return isTrue(generateLua);
    }

    private static boolean checkGenerateJs(JavaScriptConfig config) {
        String generate = System.getProperty("generateJs");
        if (isFalse(generate)) {
            return false;
        }
        String out = System.getProperty("jsOut");
        if (out != null) {
            File file = FileUtil.file(out);
            fileRootPath(config, file);
            config.setDtsCodeRootPath(file.getAbsolutePath());
            return true;
        }
        return isTrue(generate);
    }

    private static boolean hasExtraOverwrite(ProjectConfig config) {

        if (config.getJsConfig().hasExtraOverwrite()) {
            return true;
        }

        if (config.getLuaConfig().hasExtraOverwrite()) {
            return true;
        }
        if (config.getJsConfig().hasExtraOverwrite()) {
            return true;
        }
        return false;
    }

    private static void findFile(File file, List<File> files) {
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                findFile(listFile, files);
            }
        } else {
            if (file.getName().endsWith(Constant.PROTOCOL_FILE_SUFFIX)) {
                files.add(file);
            }
        }

    }
}
