package com.senpure.io.generator.ui.view;

import com.senpure.io.generator.habit.Habit;
import com.senpure.io.generator.habit.HabitUtil;
import com.senpure.io.generator.habit.ProjectConfig;
import com.senpure.io.generator.ui.model.FileConverter;
import com.senpure.io.generator.ui.model.FileData;
import com.senpure.io.generator.ui.model.MessageData;
import com.senpure.io.generator.util.TemplateUtil;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

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


    //java--↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    @FXML
    private ChoiceBox<File> javaMessageHandler;
    @FXML
    private ChoiceBox<File> javaMessage;
    @FXML
    private ChoiceBox<File> javaBean;
    @FXML
    private ChoiceBox<File> javaEnum;
    @FXML
    private ChoiceBox<File> javaEvent;
    @FXML
    private ChoiceBox<File> javaEventHandler;


    @FXML
    private CheckBox javaEnumCheckBox;
    @FXML
    private CheckBox javaBeanCheckBox;
    @FXML
    private CheckBox javaMessageCheckBox;
    @FXML
    private CheckBox javaMessageHandlerCheckBox;
    @FXML
    private CheckBox javaMessageHandlerCoverCheckBox;

    @FXML
    private CheckBox javaEventCheckBox;
    @FXML
    private CheckBox javaEventHandlerCheckBox;

    @FXML
    private CheckBox javaEventHandlerCoverCheckBox;

    //java--↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    private FileChooser messageChooser;
    private DirectoryChooser messageDirectoryChooser;
    private DirectoryChooser javaBeanCodeRootPathChooser;
    private DirectoryChooser javaCodeRootPathChooser;

    private ResourceBundle resources;
    private Habit habit;
    private ProjectConfig config;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.resources = resources;
        habit = HabitUtil.getHabit();
        config = HabitUtil.getUseConfig();
        intProjectName();
        initTableView();
        initTextFieldValue();
        initChooser();
        initTemplate();
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
    }

    private void initChooser() {
        messageChooser = new FileChooser();
        messageChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("io", "*.io")
        );
        messageChooser.setInitialDirectory(new File(config.getMessageChooserPath()));

        messageDirectoryChooser = new DirectoryChooser();
        messageDirectoryChooser.setInitialDirectory(new File(config.getMessageDirectoryChooserPath()));
        javaCodeRootPathChooser = new DirectoryChooser();
        javaCodeRootPathChooser.setInitialDirectory(new File(config.getJavaCodeRootPath()));
        javaBeanCodeRootPathChooser = new DirectoryChooser();
        javaBeanCodeRootPathChooser.setInitialDirectory(new File(config.getJavaBeanCodeRootChooserPath()));

    }

    private void initTemplate() {
        File javaFolder = new File(TemplateUtil.templateDir(), "java");
        File[] files = javaFolder.listFiles();
        for (File file : files) {
            // logger.info("{} = {}",file.getName(),file.getName().toLowerCase().endsWith("eventHandler.ftl".toLowerCase()));
            if (file.getName().toLowerCase().endsWith("eventHandler.ftl".toLowerCase())) {
                javaEventHandler.getItems().add(file);
                if (file.getName().equals(config.getJavaEventHandlerTemplate())) {
                    javaEventHandler.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("handler.ftl")) {
                javaMessageHandler.getItems().add(file);
                if (file.getName().equals(config.getJavaMessageHandlerTemplate())) {
                    javaMessageHandler.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("bean.ftl")) {
                javaBean.getItems().add(file);
                if (file.getName().equals(config.getJavaBeanTemplate())) {
                    javaBean.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("message.ftl")) {
                javaMessage.getItems().add(file);
                if (file.getName().equals(config.getJavaMessageTemplate())) {
                    javaMessage.getSelectionModel().select(file);
                }
            } else if (file.getName().toLowerCase().endsWith("event.ftl")) {
                javaEvent.getItems().add(file);
                if (file.getName().equals(config.getJavaEventTemplate())) {
                    javaEvent.getSelectionModel().select(file);
                }

            } else if (file.getName().toLowerCase().endsWith("enum.ftl")) {
                javaEnum.getItems().add(file);
                if (file.getName().equals(config.getJavaEnumTemplate())) {
                    javaEnum.getSelectionModel().select(file);
                }
            }
        }
        FileConverter fileConverter = new FileConverter();
        javaMessageHandler.setConverter(fileConverter);
        javaEnum.setConverter(fileConverter);
        javaBean.setConverter(fileConverter);
        javaMessage.setConverter(fileConverter);
        javaEvent.setConverter(fileConverter);
        javaEventHandler.setConverter(fileConverter);
        javaMessageHandlerCoverCheckBox.setSelected(config.isJavaMessageHandlerCover());
        javaEventHandlerCoverCheckBox.setSelected(config.isJavaEventHandlerCover());


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
}
