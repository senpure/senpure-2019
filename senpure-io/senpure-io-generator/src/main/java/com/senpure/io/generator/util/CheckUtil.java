package com.senpure.io.generator.util;

import com.senpure.base.AppEvn;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/**
 * 防止失误消息id重复 类名重复等
 *
 * @author senpure
 * @time 2019-06-11 20:52:18
 */
public class CheckUtil {


    private static Logger logger = LoggerFactory.getLogger(CheckUtil.class);
    private static String lastProjectName = "";
    private static RandomAccessFile randomFile;
    private static File record;

    public static void loadData(String projectName) {
        if (lastProjectName.equalsIgnoreCase(projectName)) {
            return;
        }
        lastProjectName = projectName;

        if (randomFile != null) {
            try {
                randomFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.debug("projectName {}  fileSeparator {}", projectName, File.separator);
        record = new File(AppEvn.getClassRootPath(), "record/" + projectName.replace(File.separator, "").replace(":", "") + ".txt");
        if (!record.getParentFile().exists()) {
            record.getParentFile().mkdirs();
        }
        if (record.exists()) {
            try {
                List<String> lines = FileUtils.readLines(record);
                for (String str : lines) {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            randomFile = new RandomAccessFile(record, "rw");
            long length = randomFile.length();
            randomFile.seek(length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
