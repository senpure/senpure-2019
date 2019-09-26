package com.senpure.io.generator;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.ui.UiBoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * Boot
 *
 * @author senpure
 * @time 2019-05-15 14:26:10
 */

public class Boot {



    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();
        if (Objects.equals(System.getProperty("silence"), "true")) {


        } else {
            UiBoot.main(args);
        }
        // SpringApplication.run(Boot.class, args);
    }



}
