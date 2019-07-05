package com.senpure.io.ui.view;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextInputDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private ResourceBundle resources;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.resources = resources;

        logger.debug(resources.getBaseBundleName());
        projectName.getItems().add("ppppppppp");
        projectName.getSelectionModel().select(0);


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
