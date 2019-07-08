package com.senpure.io.generator.ui;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.ui.view.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * UiBoot
 *
 * @author senpure
 * @time 2019-07-05 16:01:04
 */
@SpringBootApplication
public class UiBoot extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();

        launch(UiBoot.class, MainView.class,args);
    }
}
