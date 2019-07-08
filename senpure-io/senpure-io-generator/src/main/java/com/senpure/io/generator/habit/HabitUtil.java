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

    public static ProjectConfig useConfig;
    public static Habit habit;

    private static Habit loadHabit() {
        File save = new File(AppEvn.getClassRootPath(), "config/habit.json");

        logger.debug("行为配置文件路径{}", save.getAbsolutePath());
        if (!save.exists()) {
            Habit habit = new Habit();
            ProjectConfig config = new ProjectConfig();
            configInitValue(config);
            habit.setUserProject(config.getProjectName());
            habit.getConfigs().add(config);
            HabitUtil.useConfig = config;
            HabitUtil.habit = habit;
            return habit;
        }
        try {
            String config = FileUtils.readFileToString(save);
            Habit habit = JSON.parseObject(config, Habit.class);
            HabitUtil.habit = habit;
            checkConfig(getUseConfig());
            return habit;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Habit getHabit() {
        if (habit != null) {
            return habit;
        }
        loadHabit();
        return habit;
    }

    public static ProjectConfig getUseConfig() {
        if (useConfig != null) {
            return useConfig;
        }
        for (ProjectConfig config : habit.getConfigs()) {
            if (Objects.equals(config.getProjectName(), habit.getUserProject())) {
                return config;
            }
        }
        return null;
    }

    public static void configInitValue(ProjectConfig config) {
        config.setProjectName(AppEvn.getClassRootPath());
        config.setJavaCodeRootPath(AppEvn.getClassRootPath());
        config.setJavaBeanCodeRootPath(AppEvn.getClassRootPath());
    }

    public static void checkConfig(ProjectConfig config) {

        if (!new File(config.getJavaCodeRootPath()).exists()) {
            config.setJavaCodeRootPath(AppEvn.getClassRootPath());
            config.setJavaCodeRootChooserPath(new File(config.getJavaCodeRootPath()).getParent());
        }
        if (!new File(config.getJavaBeanCodeRootPath()).exists()) {
            config.setJavaBeanCodeRootPath(AppEvn.getClassRootPath());
            config.setJavaBeanCodeRootChooserPath(new File(config.getJavaBeanCodeRootPath()).getParent());
        }

        if (!new File(config.getMessageChooserPath()).exists()) {
            config.setMessageChooserPath(AppEvn.getClassRootPath());
        }
        if (!new File(config.getMessageDirectoryChooserPath()).exists()) {
            config.setMessageDirectoryChooserPath(AppEvn.getClassRootPath());
        }
        //其他的 如模板路径 不用检查了
    }

    public static void saveHabit(Habit habit) {
        logger.debug("save habit");
        String json = JSON.toJSONString(habit, true);
        File save = new File(AppEvn.getClassRootPath(), "config/habit.json");
        if (!save.getParentFile().exists()) {
            save.getParentFile().mkdirs();
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
