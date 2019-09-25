package com.senpure.io.generator.habit;

import com.senpure.base.AppEvn;
import com.senpure.base.util.JSON;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * HabitUtil
 *
 * @author senpure
 * @time 2019-07-08 14:44:10
 */
public class HabitUtil {

    private static Logger logger = LoggerFactory.getLogger(HabitUtil.class);


    private static Habit habit;

    private static Habit loadHabit() {
        File save = new File(AppEvn.getClassRootPath(), "config/habit.json");
        logger.debug("行为配置文件路径{}", save.getAbsolutePath());
        if (!save.exists()) {
            return newHabit();
        }
        try {
            String config = FileUtils.readFileToString(save);
            Habit habit = JSON.parseObject(config, Habit.class);
            if (habit == null) {
                return newHabit();
            }
            HabitUtil.habit = habit;
            checkConfig(getUseConfig());
            return habit;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Habit newHabit() {
        Habit habit = new Habit();
        ProjectConfig config = new ProjectConfig();

        configInitValue(config);
        habit.setUserProject(config.getProjectName());
        habit.getConfigs().add(config);
        HabitUtil.habit = habit;
        return habit;
    }

    public static Habit getHabit() {
        if (habit != null) {
            return habit;
        }
        loadHabit();
        return habit;
    }

    public static ProjectConfig getUseConfig() {
        if (habit == null) {
            loadHabit();
        }
        for (ProjectConfig config : habit.getConfigs()) {
            if (Objects.equals(config.getProjectName(), habit.getUserProject())) {
                return config;
            }
        }
        return habit.getConfigs().get(0);
    }

    public static void configInitValue(ProjectConfig projectConfig) {

        projectConfig.setProtocolFileChooserPath(AppEvn.getClassRootPath());
        projectConfig.setProtocolDirectoryChooserPath(AppEvn.getClassRootPath());
        projectConfig.setProjectName("myProject");
        JavaConfig javaConfig = projectConfig.getJavaConfig();
        javaConfig.setEventHandlerCodeRootPath(AppEvn.getClassRootPath());
        javaConfig.setEventHandlerCodeRootChooserPath(new File(javaConfig.getEventHandlerCodeRootPath()).getParent());
        javaConfig.setProtocolCodeRootPath(AppEvn.getClassRootPath());
        javaConfig.setProtocolCodeRootChooserPath(new File(javaConfig.getProtocolCodeRootPath()).getParent());

        javaConfig.setCsMessageHandlerCodeRootPath(AppEvn.getClassRootPath());
        javaConfig.setCsMessageHandlerCodeRootChooserPath(new File(javaConfig.getCsMessageHandlerCodeRootPath()).getParent());

        javaConfig.setScMessageHandlerCodeRootPath(AppEvn.getClassRootPath());
        javaConfig.setScMessageHandlerCodeRootChooserPath(new File(javaConfig.getScMessageHandlerCodeRootPath()).getParent());

        LuaConfig luaConfig = projectConfig.getLuaConfig();
        luaConfig.setProtocolCodeRootPath(AppEvn.getClassRootPath());
        luaConfig.setProtocolCodeRootChooserPath(new File(luaConfig.getProtocolCodeRootPath()).getParent());
        luaConfig.setScMessageHandlerCodeRootPath(AppEvn.getClassRootPath());
        luaConfig.setScMessageHandlerCodeRootChooserPath(new File(luaConfig.getProtocolCodeRootPath()).getParent());
    }

    public static void checkConfig(ProjectConfig projectConfig) {
        if (!new File(projectConfig.getProtocolFileChooserPath()).exists()) {
            projectConfig.setProtocolFileChooserPath(AppEvn.getClassRootPath());
        }
        if (!new File(projectConfig.getProtocolDirectoryChooserPath()).exists()) {
            projectConfig.setProtocolDirectoryChooserPath(AppEvn.getClassRootPath());
        }
        JavaConfig javaConfig = projectConfig.getJavaConfig();
        if (!new File(javaConfig.getEventHandlerCodeRootPath()).exists()) {
            javaConfig.setEventHandlerCodeRootChooserPath(new File(javaConfig.getEventHandlerCodeRootPath()).getParent());
        }
        if (!new File(javaConfig.getProtocolCodeRootPath()).exists()) {
            javaConfig.setProtocolCodeRootChooserPath(new File(javaConfig.getProtocolCodeRootPath()).getParent());
        }
        if (!new File(javaConfig.getCsMessageHandlerCodeRootPath()).exists()) {
            javaConfig.setCsMessageHandlerCodeRootChooserPath(new File(javaConfig.getCsMessageHandlerCodeRootPath()).getParent());
        }
        if (!new File(javaConfig.getScMessageHandlerCodeRootPath()).exists()) {
            javaConfig.setScMessageHandlerCodeRootChooserPath(new File(javaConfig.getScMessageHandlerCodeRootPath()).getParent());
        }


        LuaConfig luaConfig = projectConfig.getLuaConfig();
        if (!new File(luaConfig.getProtocolCodeRootPath()).exists()) {
            luaConfig.setProtocolCodeRootChooserPath(new File(luaConfig.getProtocolCodeRootPath()).getParent());
        }
        if (!new File(luaConfig.getScMessageHandlerCodeRootPath()).exists()) {
            luaConfig.setScMessageHandlerCodeRootChooserPath(new File(luaConfig.getScMessageHandlerCodeRootPath()).getParent());
        }
        //其他的 如模板路径 不用检查了
    }

    public static void saveHabit(Habit habit) {
        logger.debug("save habit");
        String json = JSON.toJSONString(habit, true);
        File save = new File(AppEvn.getClassRootPath(), "config/habit.json");
        File parent = save.getParentFile();
        if (!parent.exists()) {
            if (!parent.mkdirs()) {
                return;
            }
        }
        try {
            FileUtils.writeStringToFile(save, json);
        } catch (IOException e) {
            e.printStackTrace();
            //logger.error("保存习惯配置出错", e);
        }
        logger.debug("save habit success");
    }
}
