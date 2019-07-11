package com.senpure.io.generator.ui.view;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.Constant;
import com.senpure.io.generator.executor.CheckException;
import com.senpure.io.generator.executor.Executor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.habit.*;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Message;
import com.senpure.io.generator.reader.IoProtocolReader;
import com.senpure.io.generator.reader.IoReader;
import com.senpure.io.generator.ui.UiContext;
import com.senpure.io.generator.ui.appender.TextAreaAppender;
import com.senpure.io.generator.ui.model.FileConverter;
import com.senpure.io.generator.ui.model.FileData;
import com.senpure.io.generator.ui.model.ProtocolData;
import com.senpure.io.generator.util.CheckUtil;
import com.senpure.io.generator.util.NoteUtil;
import com.senpure.io.generator.util.TemplateUtil;
import de.felixroske.jfxsupport.FXMLController;
import javafx.animation.PathTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.util.Duration;
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
    private TableView<FileData> tableViewFileView;

    @FXML
    private TableColumn<FileData, String> tableName;
    @FXML
    private TableColumn<FileData, String> tablePath;

    @FXML
    private TableView<ProtocolData> tableViewProtocolView;

    @FXML
    private TableColumn<ProtocolData, String> tableProtocolName;
    @FXML
    private TableColumn<ProtocolData, Boolean> tableProtocolCheckBok;
    @FXML
    private TableColumn<ProtocolData, String> tableProtocolType;
    @FXML
    private TableColumn<ProtocolData, String> tableProtocolExplain;

    @FXML
    private TabPane tabPaneConfig;

    @FXML
    private Accordion accordionMessage;
    @FXML
    private TitledPane titledPaneProtocolConfig;
    @FXML
    private TitledPane titledPaneProtocolView;
    @FXML
    private TextArea textAreaLog;
    @FXML
    private Button btnDelRecord;

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

    private Set<File> protocolFiles = new HashSet<>();

    private List<Enum> enums = new ArrayList<>();
    private List<Bean> beans = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TextAreaAppender.setTextArea(textAreaLog);
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
        initProtocolFiles();
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
        tableProtocolName.setCellValueFactory(param -> param.getValue().nameProperty());
        tableProtocolCheckBok.setCellFactory(CheckBoxTableCell.forTableColumn(tableProtocolCheckBok));
        tableProtocolCheckBok.setCellValueFactory(param -> param.getValue().generateProperty());
        tableProtocolType.setCellValueFactory(param -> param.getValue().typeProperty());
        tableProtocolExplain.setCellValueFactory(param -> param.getValue().explainProperty());
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
        fileChooserIoFile.setInitialDirectory(new File(config.getProtocolFileChooserPath()));
        directoryChooser = new DirectoryChooser();
        // directoryChooserIoDirectory.setInitialDirectory(new File(config.getProtocolDirectoryChooserPath()));


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

        //覆盖操作不读取
        // checkJavaCSMessageHandlerCover.setSelected(javaConfig.isJavaCSMessageHandlerCover());
        // checkJavaSCMessageHandlerCover.setSelected(javaConfig.isJavaSCMessageHandlerCover());
        // checkJavaEventHandlerCover.setSelected(javaConfig.isJavaEventHandlerCover());
    }

    private void initPlane() {
        accordionMessage.setExpandedPane(titledPaneProtocolConfig);
        //accordionMessage.setExpandedPane(titledPaneProtocolView);
        tabPaneConfig.getSelectionModel().select(config.getTabPaneConfigIndex());
    }

    private void initProtocolFiles() {
        if (config.getProtocolFiles() != null) {
            for (ProtocolFile protocolFile : config.getProtocolFiles()) {
                File file = new File(protocolFile.getPath());
                if (file.getName().endsWith(".io")) {
                    if (file.exists()) {
                        addFileToView(file);
                    }
                }
            }
        }
    }

    public void addProtocolFile() {
        logger.debug("增加协议文件");
        List<File> files = fileChooserIoFile.showOpenMultipleDialog(UiContext.getPrimaryStage());
        if (files != null) {
            fileChooserIoFile.setInitialDirectory(files.get(0).getParentFile());
            config.setProtocolFileChooserPath(files.get(0).getParentFile().toString());

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

    public void addProtocolDirectory() {
        logger.debug("增加协议文件夹");
        directoryChooser.setInitialDirectory(new File(config.getProtocolDirectoryChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            config.setProtocolDirectoryChooserPath(file.getParent());
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
        if (protocolFiles.add(file)) {
            FileData fileData = new FileData(file);
            tableViewFileView.getItems().add(fileData);
        } else {
            logger.warn("已经存在{}->{}", file.getName(), file.getAbsolutePath());
        }
    }

    public void removeFile() {
        int index = tableViewFileView.getSelectionModel().getFocusedIndex();

        if (index > -1) {
            FileData fileData = tableViewFileView.getItems().remove(index);
            protocolFiles.remove(fileData.getFile());
            logger.debug("移除 {} -> {}", fileData.getName(), fileData.getPath());
        } else {
            logger.warn("没有选择任何文件");
        }
    }

    public void removeAllFile() {
        tableViewFileView.getItems().clear();
        protocolFiles.clear();
    }


    public void protocolView() {

        if (protocolFiles.size() == 0) {
            logger.warn("没有选择协议文件");
            return;
        }
        tableViewProtocolView.getItems().clear();
        enums.clear();
        beans.clear();
        messages.clear();
        events.clear();
        IoReader.getInstance().getIoProtocolReaderMap().clear();

        List<ProtocolData> protocolDatas = new ArrayList<>();
        boolean error = false;
        for (File file : protocolFiles) {
            IoProtocolReader ioProtocolReader;
            try {
                ioProtocolReader = IoReader.getInstance().read(file);
            } catch (Exception e) {
                logger.error(e.getMessage());
                error = true;
                continue;
            }
            if (ioProtocolReader.isHasError()) {
                logger.error("{} 出现语法错误 ", ioProtocolReader.getFilePath());
                error = true;
                continue;
            }
            enums.addAll(ioProtocolReader.getEnums());
            beans.addAll(ioProtocolReader.getBeans());
            messages.addAll(ioProtocolReader.getMessages());
            events.addAll(ioProtocolReader.getEvents());
            for (Bean bean : ioProtocolReader.getEnums()) {
                ProtocolData protocolData = new ProtocolData(bean, "enum");
                protocolDatas.add(protocolData);
            }
            for (Bean bean : ioProtocolReader.getBeans()) {
                ProtocolData protocolData = new ProtocolData(bean, "bean");
                protocolDatas.add(protocolData);
            }
            for (Bean bean : ioProtocolReader.getMessages()) {
                if (bean.getType().equals(Constant.ENTITY_TYPE_CS_MESSAGE)) {
                    ProtocolData protocolData = new ProtocolData(bean, "csMessage");
                    protocolDatas.add(protocolData);
                } else {
                    ProtocolData protocolData = new ProtocolData(bean, "scMessage");
                    protocolDatas.add(protocolData);
                }

            }
            for (Bean bean : ioProtocolReader.getEvents()) {
                ProtocolData protocolData = new ProtocolData(bean, "event");
                protocolDatas.add(protocolData);
            }

        }

        if (error) {
            //  logger.error("协议文件语法或格式不对请仔细检查修改");
            return;
        }
        if (protocolDatas.size() == 0) {
            logger.warn("没有可读消息");
            return;
        }
        accordionMessage.setExpandedPane(titledPaneProtocolView);
        for (ProtocolData protocolData : protocolDatas) {
            if (tableViewProtocolView.getItems().contains(protocolData)) {
                protocolData.getBean().setGenerate(false);
            } else {
                tableViewProtocolView.getItems().add(protocolData);
            }
        }

    }

    public void choiceJavaBeanCodeRootPath() {
        directoryChooser.setInitialDirectory(new File(javaConfig.getJavaBeanCodeRootChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            javaConfig.setJavaBeanCodeRootChooserPath(file.getParent());
            textFieldJavaBeanCodeRootPath.setText(file.getAbsolutePath());
        }
    }

    public void choiceJavaCSMessageHandlerCodeRootPath() {
        directoryChooser.setInitialDirectory(new File(javaConfig.getJavaCSMessageHandlerCodeRootChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            javaConfig.setJavaCSMessageHandlerCodeRootChooserPath(file.getParent());
            textFieldJavaCSMessageHandlerCodeRootPath.setText(file.getAbsolutePath());
        }
    }

    public void choiceJavaSCMessageHandlerCodeRootPath() {
        directoryChooser.setInitialDirectory(new File(javaConfig.getJavaSCMessageHandlerCodeRootChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            javaConfig.setJavaSCMessageHandlerCodeRootChooserPath(file.getParent());
            textFieldJavaSCMessageHandlerCodeRootPath.setText(file.getAbsolutePath());
        }
    }

    public void choiceJavaEventHandlerCodeRootPath() {
        directoryChooser.setInitialDirectory(new File(javaConfig.getJavaEventHandlerCodeRootChooserPath()));
        File file = directoryChooser.showDialog(UiContext.getPrimaryStage());
        if (file != null) {
            javaConfig.setJavaEventHandlerCodeRootChooserPath(file.getParent());
            textFieldJavaEventHandlerCodeRootPath.setText(file.getAbsolutePath());
        }
    }


    public void updateProjectName() {
        TextInputDialog dialog = new TextInputDialog(projectName.getSelectionModel().getSelectedItem());
        dialog.setTitle("修改操作");
        dialog.setHeaderText("修改项目名 ");
        dialog.setContentText(resources.getString("label.input.project.name"));
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your name: " + result.get());
        }
    }

    public void createProject() {
        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, animation Text Input Dialog");
        dialog.setContentText("Please enter your name:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your name: " + result.get());
        }
    }

    public void clearLog() {
        textAreaLog.clear();
        //  btnDelRecord.setVisible(true);
        // animation(textAreaLog);
        // animation(btnDelRecord);
    }

    public void openLog() {
        File logFile = new File(AppEvn.getClassRootPath(), "generator.log");
        if (!AppEvn.classInJar(getClass())) {
            logFile = new File(System.getProperty("user.dir"), "generator.log");
        }
        if (AppEvn.isWindowsOS()) {

            NoteUtil.openNote(logFile, 12);
        } else {
            logger.debug("日志文件路径{} ", logFile.getAbsoluteFile());
        }
    }


    public void generateJavaCode() {
        ExecutorContext executorContext;
        if (tableViewProtocolView.getItems().size() == 0) {
            if (protocolFiles.size() == 0) {
                logger.warn("没有选择协议文件");
                return;
            }
            IoReader.getInstance().getIoProtocolReaderMap().clear();
            boolean error = false;
            for (File file : protocolFiles) {
                IoProtocolReader ioProtocolReader;
                try {
                    ioProtocolReader = IoReader.getInstance().read(file);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                    error = true;
                    continue;
                }
                if (ioProtocolReader.isHasError()) {
                    error = true;
                    logger.error("{} 语法错误", ioProtocolReader.getFilePath());
                }
            }
            if (error) {
                return;
            }
            JavaConfig javaConfig = new JavaConfig();
            javaConfigValue(javaConfig, false);
            executorContext = new ExecutorContext();
            executorContext.setProjectName(config.getProjectName());
            executorContext.setJavaConfig(javaConfig);
            Map<String, IoProtocolReader> ioProtocolReaderMap = IoReader.getInstance().getIoProtocolReaderMap();
            for (IoProtocolReader ioProtocolReader : ioProtocolReaderMap.values()) {
                executorContext.getEnums().addAll(ioProtocolReader.getEnums());
                executorContext.getBeans().addAll(ioProtocolReader.getBeans());
                executorContext.getMessages().addAll(ioProtocolReader.getMessages());
                executorContext.getEvents().addAll(ioProtocolReader.getEvents());
            }


        } else {
            JavaConfig javaConfig = new JavaConfig();
            javaConfigValue(javaConfig, false);
            executorContext = new ExecutorContext();
            executorContext.setProjectName(config.getProjectName());
            executorContext.setJavaConfig(javaConfig);
            for (Enum anEnum : enums) {
                if (anEnum.isGenerate()) {
                    executorContext.getEnums().add(anEnum);
                }
            }
            for (Bean bean : beans) {
                if (bean.isGenerate()) {
                    executorContext.getBeans().add(bean);
                }
            }
            for (Message message : messages) {
                if (message.isGenerate()) {
                    executorContext.getMessages().add(message);
                }
            }
            for (Event event : events) {
                if (event.isGenerate()) {
                    executorContext.getEvents().add(event);
                }
            }


        }
        Executor executor = new Executor(executorContext);

        try {
            executor.generate();
            logger.info("代码生成完成");
        } catch (CheckException e) {

            Platform.runLater(() -> {
                btnDelRecord.setVisible(true);
                btnDelRecord.requestFocus();
                animation(btnDelRecord);

            });


            logger.error("代码检查不通过");
        } catch (Exception e) {
            logger.error("代码生成失败", e);
        }
    }

    private void animation(Node node) {
        Path path = new Path();//创建一个路径对象
        double x;
        double y;
        x = 50;
        y = 10;
        //logger.debug("x = {} y ={}",x,y);
        int value = 5;
        path.getElements().add(new MoveTo(x, y));//从哪个位置开始动画，一般来说给组件的默认位置就行
        path.getElements().add(new LineTo(x - value, y + value));//添加一个向左移动的路径
        path.getElements().add(new LineTo(x + value, y + value));//添加一个向右移动的路径  这样就完成第一遍摇头
        path.getElements().add(new LineTo(x - value, y + value));//添加一个向左移动的路径 第二遍
        path.getElements().add(new LineTo(x + value, y + value));//添加一个向右移动的路径  这样就完成第二遍摇头

        path.getElements().add(new LineTo(x, y + value));//最后移动到原来的位置
        PathTransition pathTransition = new PathTransition();//创建一个动画对象
        pathTransition.setDuration(Duration.seconds(1.2));//动画持续时间 0.5秒
        pathTransition.setPath(path);//把我们设置好的动画路径放入里面
        pathTransition.setNode(node);//给动画添加组件，让某个组件来完成这个动画
        pathTransition.setCycleCount(1);//执行1遍
        pathTransition.play();//执行动画
    }

    public void btnDelRecordKeyRelease(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            delRecordFile();
        }
    }

    public void delRecordFile() {
        CheckUtil.closeCheck();
        File file = CheckUtil.getProjectNameFile(config.getProjectName());
        if (file.exists()) {
            if (file.delete()) {
                logger.info("删除记录文件 {}", file.getAbsoluteFile());
            } else {
                logger.info("删除记录文件失败 {}", file.getAbsoluteFile());
            }
        }
        btnDelRecord.setVisible(false);
    }

    public void updateConfig() {
        config.setTabPaneConfigIndex(tabPaneConfig.getSelectionModel().getSelectedIndex());
        List<ProtocolFile> protocolFiles = new ArrayList<>();
        for (FileData item : tableViewFileView.getItems()) {
            ProtocolFile protocolFile = new ProtocolFile();
            protocolFile.setName(item.getFile().getName());
            protocolFile.setPath(item.getFile().getAbsolutePath());
            protocolFiles.add(protocolFile);
        }
        config.setProtocolFiles(protocolFiles);

        //java
        javaConfigValue(javaConfig, true);
        //java

    }

    private void javaConfigValue(JavaConfig javaConfig, boolean save) {
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
        if (save) {
            javaConfig.setJavaEventHandlerCover(false);
            javaConfig.setJavaCSMessageHandlerCover(false);
            javaConfig.setJavaSCMessageHandlerCover(false);
        } else {
            javaConfig.setJavaEventHandlerCover(checkJavaEventHandlerCover.isSelected());
            javaConfig.setJavaCSMessageHandlerCover(checkJavaCSMessageHandlerCover.isSelected());
            javaConfig.setJavaSCMessageHandlerCover(checkJavaSCMessageHandlerCover.isSelected());
        }
        javaConfig.setGenerateJavaBean(checkJavaBean.isSelected());
        javaConfig.setGenerateJavaEnum(checkJavaEnum.isSelected());
        javaConfig.setGenerateJavaEvent(checkJavaEvent.isSelected());
        javaConfig.setGenerateJavaMessage(checkJavaMessage.isSelected());
        javaConfig.setGenerateJavaEventHandler(checkJavaEventHandler.isSelected());
        javaConfig.setGenerateJavaCSMessageHandler(checkJavaCSMessageHandler.isSelected());
        javaConfig.setGenerateJavaSCMessageHandler(checkJavaSCMessageHandler.isSelected());
    }
}
