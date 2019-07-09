package com.senpure.io.generator.ui.view;

import com.senpure.io.generator.habit.Habit;
import com.senpure.io.generator.habit.HabitUtil;
import com.senpure.io.generator.habit.JavaConfig;
import com.senpure.io.generator.habit.ProjectConfig;
import com.senpure.io.generator.ui.UiContext;
import com.senpure.io.generator.ui.model.FileConverter;
import com.senpure.io.generator.ui.model.FileData;
import com.senpure.io.generator.ui.model.MessageData;
import com.senpure.io.generator.util.TemplateUtil;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.util.*;

/**
 * MainController
 *
 * @author senpure
 * @time 2019-07-05 14:19:11
 */
@FXMLController
public class MainController implements Initializable {


    private Logger logger = LoggerFactory.getLogger(getClass());
    @FXML
    private ChoiceBox<String> projectName;

    @FXML
    private TableView<FileData> tableViewIoView;

    @FXML
    private TableColumn<FileData, String> tableName;
    @FXML
    private TableColumn<FileData, String> tablePath;

    @FXML
    private TableColumn<MessageData, String> tableMessageName;
    @FXML
    private TableColumn<MessageData, Boolean> tableMessageCheckBok;
    @FXML
    private TableColumn<MessageData, String> tableMessageType;
    @FXML
    private TableColumn<MessageData, String> tableMessageExplain;


    @FXML
    private Accordion accordionMessage;
    @FXML
    private TitledPane titledPaneMessageConfig;
    @FXML
    private TitledPane titledPaneMessageView;

    //java--↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    @FXML
    private TextField textFieldJavaBeanCodeRootPath;
    @FXML
    private TextField textFieldJavaEventHandlerCodeRootPath;
    @FXML
    private TextField textFieldJavaCSMessageHandlerCodeRootPath;
    @FXML
    private TextField textFieldJavaSCMessageHandlerCodeRootPath;

    @FXML
    private ChoiceBox<File> choiceJavaCSMessageHandler;
    @FXML
    private ChoiceBox<File> choiceJavaSCMessageHandler;
    @FXML
    private ChoiceBox<File> choiceJavaMessage;
    @FXML
    private ChoiceBox<File> choiceJavaBean;
    @FXML
    private ChoiceBox<File> choiceJavaEnum;
    @FXML
    private ChoiceBox<File> choiceJavaEvent;
    @FXML
    private ChoiceBox<File> choiceJavaEventHandler;


    @FXML
    private CheckBox checkJavaEnum;
    @FXML
    private CheckBox checkJavaBean;
    @FXML
    private CheckBox checkJavaMessage;
    @FXML
    private CheckBox checkJavaCSMessageHandler;
    @FXML
    private CheckBox checkJavaSCMessageHandler;
    @FXML
    private CheckBox checkJavaCSMessageHandlerCover;

    @FXML
    private CheckBox checkJavaSCMessageHandlerCover;

    @FXML
    private CheckBox checkJavaEvent;
    @FXML
    private CheckBox checkJavaEventHandler;

    @FXML
    private CheckBox checkJavaEventHandlerCover;

    //java--↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    private FileChooser fileChooserIoFile;
    private DirectoryChooser directoryChooser;
    // private DirectoryChooser directoryChooserJavaBeanCodeRootPath;
    // private DirectoryChooser directoryChooserJavaEventHandlerCodeRootPath;
    // private DirectoryChooser directoryChooserJavaCSMessageHandlerCodeRootPath;
    //  private DirectoryChooser directoryChooserJavaSCMessageHandlerCodeRootPath;
    private ResourceBundle resources;
    private Habit habit;
    private JavaConfig javaConfig;

    private ProjectConfig config;

    private Set<File> ioFiles = new HashSet<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.resources = resources;
        habit = HabitUtil.getHabit();
        config = HabitUtil.getUseConfig();
        javaConfig = config.getJavaConfig();
        intProjectName();
        initTableView();
        initTextFieldValue();
        initChooser();
        initTemplate();

        initPlane();
    }

    private void intProjectName() {
        for (ProjectConfig habitConfig : habit.getConfigs()) {
            projectName.getItems().add(habitConfig.getProjectName());
            if (habitConfig.getProjectName().equals(config.getProjectName())) {
                projectName.getSelectionModel().select(habitConfig.getProjectName());
            }
        }
    }

    private void initTableView() {
        tableName.setCellValueFactory(param -> param.getValue().nameProperty());
        tablePath.setCellValueFactory(param -> param.getValue().pathProperty());
        //----
        tableMessageName.setCellValueFactory(param -> param.getValue().nameProperty());
        tableMessageCheckBok.setCellFactory(CheckBoxTableCell.forTableColumn(tableMessageCheckBok));
        tableMessageCheckBok.setCellValueFactory(param -> param.getValue().generateProperty());
        tableMessageType.setCellValueFactory(param -> param.getValue().typeProperty());
        tableMessageExplain.setCellValueFactory(param -> param.getValue().explainProperty());
    }

    private void initTextFieldValue() {
        textFieldJavaBeanCodeRootPath.setText(javaConfig.getJavaBeanCodeRootPath());
        textFieldJavaEventHandlerCodeRootPath.setText(javaConfig.getJavaEventHandlerCodeRootPath());
        textFieldJavaCSMessageHandlerCodeRootPath.setText(javaConfig.getJavaCSMessageHandlerCodeRootPath());
        textFieldJavaSCMessageHandlerCodeRootPath.setText(javaConfig.getJavaSCMessageHandlerCodeRootPath());
    }

    private void initChooser() {
        fileChooserIoFile = new FileChooser();
        fileChooserIoFile.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("io", "*.io")
        );
        fileChooserIoFile.setInitialDirectory(new File(config.getIoFileChooserPath()));
        directoryChooser = new DirectoryChooser();
        // directoryChooserIoDirectory.setInitialDirectory(new File(config.getIoDirectoryChooserPath()));


//        directoryChooserJavaEventHandlerCodeRootPath = new DirectoryChooser();
//        directoryChooserJavaEventHandlerCodeRootPath.setInitialDirectory(new File(javaConfig.getJavaEventHandlerCodeRootChooserPath()));
//        directoryChooserJavaBeanCodeRootPath = new DirectoryChooser();
//        directoryChooserJavaBeanCodeRootPath.setInitialDirectory(new File(javaConfig.getJavaBeanCodeRootChooserPath()));

    }

    private void initTemplate() {
        initJavaTemplate();
    }

    private void initJavaTemplate() {
        File javaFolder = new File(TemplateUtil.templateDir(), "java");
        File[] files = javaFolder.listFiles();
        for (File file : files) {
            // logger.info("{} = {}",file.getName(),file.getName().toLowerCase().endsWith("eventHandler.ftl".toLowerCase()));
            if (file.getName().toLowerCase().endsWith("eventHandler.ftl".toLowerCase())) {
                choiceJavaEventHandler.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaEventHandlerTemplate())) {
                    choiceJavaEventHandler.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("handler.ftl")) {
                choiceJavaCSMessageHandler.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaCSMessageHandlerTemplate())) {
                    choiceJavaCSMessageHandler.getSelectionModel().select(file);
                }
                choiceJavaSCMessageHandler.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaSCMessageHandlerTemplate())) {
                    choiceJavaSCMessageHandler.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("bean.ftl")) {
                choiceJavaBean.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaBeanTemplate())) {
                    choiceJavaBean.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("message.ftl")) {
                choiceJavaMessage.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaMessageTemplate())) {
                    choiceJavaMessage.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("event.ftl")) {
                choiceJavaEvent.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaEventTemplate())) {
                    choiceJavaEvent.getSelectionModel().select(file);
                }

            } else if (file.getName().toLowerCase().endsWith("enum.ftl")) {
                choiceJavaEnum.getItems().add(file);
                if (file.getName().equals(javaConfig.getJavaEnumTemplate())) {
                    choiceJavaEnum.getSelectionModel().select(file);
                }
            }
        }
        FileConverter fileConverter = new FileConverter();
        choiceJavaCSMessageHandler.setConverter(fileConverter);
        choiceJavaSCMessageHandler.setConverter(fileConverter);
        choiceJavaEnum.setConverter(fileConverter);
        choiceJavaBean.setConverter(fileConverter);
        choiceJavaMessage.setConverter(fileConverter);
        choiceJavaEvent.setConverter(fileConverter);
        choiceJavaEventHandler.setConverter(fileConverter);

        checkJavaEnum.setSelected(javaConfig.isGenerateJavaEnum());
        checkJavaBean.setSelected(javaConfig.isGenerateJavaBean());
        checkJavaMessage.setSelected(javaConfig.isGenerateJavaMessage());
        checkJavaEvent.setSelected(javaConfig.isGenerateJavaEvent());
        checkJavaCSMessageHandler.setSelected(javaConfig.isGenerateJavaCSMessageHandler());
        checkJavaSCMessageHandler.setSelected(javaConfig.isGenerateJavaSCMessageHandler());
        checkJavaEventHandler.setSelected(javaConfig.isGenerateJavaEventHandler());

        checkJavaCSMessageHandlerCover.setSelected(javaConfig.isJavaCSMessageHandlerCover());
        checkJavaSCMessageHandlerCover.setSelected(javaConfig.isJavaSCMessageHandlerCover());
        checkJavaEventHandlerCover.setSelected(javaConfig.isJavaEventHandlerCover());
    }

    private void initPlane() {
        accordionMessage.setExpandedPane(titledPaneMessageConfig);
    }

    public void addIoFile() {
        logger.debug("增加io文件");
        List<File> files = fileChooserIoFile.showOpenMultipleDialog(UiContext.getPrimaryStage());
        if (files != null) {
            fileChooserIoFile.setInitialDirectory(files.get(0).getParentFile());
            config.setIoFileChooserPath(files.get(0).getParentFile().toString());

            files.forEach(file ->
                    {
                        logger.debug("文件全路径:{}", file.getAbsolutePath());
                        addFileToView(file);
                    }

            );
            //logger.debug("文件全路径:{}",file.getAbsolutePath());
        } else {
            logger.debug("没有选择任何文件");
        }

    }

    public void addIoDirectory() {
        logger.debug("增加io文件夹");
        directoryChooser.setInitialDirectory(new File(config.getIoDirectoryChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            config.setIoDirectoryChooserPath(file.getParent());
            int count = addDirectoryToView(file);
            if (count == 0) {
                logger.debug("没有符合条件的文件");
            }
        } else {
            logger.debug("没有选择任何文件");
        }

    }

    private int addDirectoryToView(File file) {
        int count = 0;
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                count += addDirectoryToView(f);
            }
            if (f.getName().endsWith(".io")) {
                count++;
                logger.debug("文件全路径:{}", f.getAbsolutePath());
                addFileToView(f);
            }
        }
        return count;
    }

    private void addFileToView(File file) {
        if (ioFiles.add(file)) {
            FileData fileData = new FileData(file);
            tableViewIoView.getItems().add(fileData);
        } else {
            logger.warn("已经存在{}->{}", file.getName(), file.getAbsolutePath());
        }


    }

    public void updateProjectName() {
        TextInputDialog dialog = new TextInputDialog(projectName.getSelectionModel().getSelectedItem());
        // dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText(resources.getString("label.input.project.name"));
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your name: " + result.get());
        }
    }

    public void createProject() {
        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your name: " + result.get());
        }
    }

    public void updateConfig() {
        //java
        javaConfig.setJavaEventHandlerCodeRootPath(textFieldJavaEventHandlerCodeRootPath.getText());
        javaConfig.setJavaBeanCodeRootPath(textFieldJavaBeanCodeRootPath.getText());
        javaConfig.setJavaCSMessageHandlerCodeRootPath(textFieldJavaCSMessageHandlerCodeRootPath.getText());
        javaConfig.setJavaSCMessageHandlerCodeRootPath(textFieldJavaSCMessageHandlerCodeRootPath.getText());
        javaConfig.setJavaEnumTemplate(choiceJavaEnum.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaBeanTemplate(choiceJavaBean.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaMessageTemplate(choiceJavaMessage.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaEventTemplate(choiceJavaEvent.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaCSMessageHandlerTemplate(choiceJavaCSMessageHandler.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaSCMessageHandlerTemplate(choiceJavaSCMessageHandler.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaEventHandlerTemplate(choiceJavaEventHandler.getSelectionModel().getSelectedItem().getName());
        javaConfig.setJavaEventHandlerCover(checkJavaEventHandlerCover.isSelected());
        javaConfig.setJavaCSMessageHandlerCover(checkJavaCSMessageHandlerCover.isSelected());
        javaConfig.setJavaSCMessageHandlerCover(checkJavaSCMessageHandlerCover.isSelected());


        javaConfig.setGenerateJavaBean(checkJavaBean.isSelected());
        javaConfig.setGenerateJavaEnum(checkJavaEnum.isSelected());
        javaConfig.setGenerateJavaEvent(checkJavaEvent.isSelected());
        javaConfig.setGenerateJavaMessage(checkJavaMessage.isSelected());
        javaConfig.setGenerateJavaEventHandler(checkJavaEventHandler.isSelected());
        javaConfig.setGenerateJavaCSMessageHandler(checkJavaCSMessageHandler.isSelected());
        javaConfig.setGenerateJavaSCMessageHandler(checkJavaSCMessageHandler.isSelected());
        //java

    }
}
