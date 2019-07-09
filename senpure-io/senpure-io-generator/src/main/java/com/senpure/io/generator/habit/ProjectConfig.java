package com.senpure.io.generator.habit;

/**
 * ProjectConfig
 *
 * @author senpure
 * @time 2019-07-08 14:51:35
 */
public class ProjectConfig {

    private String projectName;
    private String ioFileChooserPath;
    private String ioDirectoryChooserPath;
    private JavaConfig javaConfig = new JavaConfig();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public JavaConfig getJavaConfig() {
        return javaConfig;
    }

    public void setJavaConfig(JavaConfig javaConfig) {
        this.javaConfig = javaConfig;
    }

    public String getIoFileChooserPath() {
        return ioFileChooserPath;
    }

    public void setIoFileChooserPath(String ioFileChooserPath) {
        this.ioFileChooserPath = ioFileChooserPath;
    }

    public String getIoDirectoryChooserPath() {
        return ioDirectoryChooserPath;
    }

    public void setIoDirectoryChooserPath(String ioDirectoryChooserPath) {
        this.ioDirectoryChooserPath = ioDirectoryChooserPath;
    }
}
