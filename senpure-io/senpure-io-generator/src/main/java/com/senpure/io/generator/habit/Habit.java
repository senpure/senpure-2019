package com.senpure.io.generator.habit;

import java.util.ArrayList;
import java.util.List;

/**
 * Habit
 *
 * @author senpure
 * @time 2019-07-08 14:33:59
 */
public class Habit {

    private String userProject;
    private boolean silence = false;
    private List<ProjectConfig> configs = new ArrayList<>();




    public String getUserProject() {
        return userProject;
    }

    public void setUserProject(String userProject) {
        this.userProject = userProject;
    }

    public List<ProjectConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<ProjectConfig> configs) {
        this.configs = configs;
    }

    public boolean isSilence() {
        return silence;
    }

    public void setSilence(boolean silence) {
        this.silence = silence;
    }
}
