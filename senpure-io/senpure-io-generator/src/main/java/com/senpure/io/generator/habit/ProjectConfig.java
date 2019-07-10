package com.senpure.io.generator.habit;

import java.util.List;

/**
 * ProjectConfig
 *
 * @author senpure
 * @time 2019-07-08 14:51:35
 */
public class ProjectConfig {

    private String projectName;
    private String protocolFileChooserPath;
    private String protocolDirectoryChooserPath;

    //字符串的写入json是一长串,不好手动修改
    private List<ProtocolFile> protocolFiles;
    private int tabPaneConfigIndex=0;
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

    public String getProtocolFileChooserPath() {
        return protocolFileChooserPath;
    }

    public void setProtocolFileChooserPath(String protocolFileChooserPath) {
        this.protocolFileChooserPath = protocolFileChooserPath;
    }

    public String getProtocolDirectoryChooserPath() {
        return protocolDirectoryChooserPath;
    }

    public void setProtocolDirectoryChooserPath(String protocolDirectoryChooserPath) {
        this.protocolDirectoryChooserPath = protocolDirectoryChooserPath;
    }

    public int getTabPaneConfigIndex() {
        return tabPaneConfigIndex;
    }

    public void setTabPaneConfigIndex(int tabPaneConfigIndex) {
        this.tabPaneConfigIndex = tabPaneConfigIndex;
    }


    public List<ProtocolFile> getProtocolFiles() {
        return protocolFiles;
    }

    public void setProtocolFiles(List<ProtocolFile> protocolFiles) {
        this.protocolFiles = protocolFiles;
    }
}
