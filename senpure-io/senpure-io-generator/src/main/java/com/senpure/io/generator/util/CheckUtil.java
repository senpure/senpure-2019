package com.senpure.io.generator.util;

import com.senpure.base.AppEvn;
import com.senpure.base.util.JSON;
import com.senpure.base.util.StringUtil;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Message;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private static Map<String, CheckObj> nameMap = new HashMap<>();
    private static Map<Integer, CheckObj> eventMap = new HashMap<>();
    private static Map<Integer, CheckObj> messageMap = new HashMap<>();

    public static String recordPath() {
        return record.getAbsolutePath();
    }

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
        nameMap.clear();
        eventMap.clear();
        messageMap.clear();

        record = new File(AppEvn.getClassRootPath(), "record/" + projectName.replace(File.separator, "").replace(":", "") + ".txt");
        if (!record.getParentFile().exists()) {
            record.getParentFile().mkdirs();
        }
        if (record.exists()) {
            try {
                List<String> lines = FileUtils.readLines(record);
                for (String line : lines) {
                    readLine(line);
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


    public static boolean check(Message bean) {
        String name = bean.getNamespace() + "." + bean.getType() + bean.getName();
        if (check(name, bean, "message", bean.getId())) {
            CheckObj obj = messageMap.get(bean.getId());
            if (obj != null) {
                if (!name.equals(obj.name)) {
                    logger.error("消息id重复 {} {}.{}  {}.{} ", bean.getId(), obj.filePath, obj.name, bean.getFilePath(), name);
                    logger.info("如果确认以前的消息不需要,请关闭程序然后删除{} 里面的相关记录", recordPath());
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean check(Event bean) {
        String name = bean.getNamespace() + "." + bean.getName();
        if (check(name, bean, "event", bean.getId())) {
            CheckObj obj = eventMap.get(bean.getId());
            if (obj != null) {
                if (!name.equals(obj.name)) {
                    logger.error("事件id重复 {} {}.{}  {}.{} ", bean.getId(), obj.filePath, obj.name, bean.getFilePath(), name);
                    logger.info("如果确认以前的事件不需要,请关闭程序然后删除{} 里面的相关记录", recordPath());
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean check(Enum bean) {
        String name = bean.getNamespace() + "." + bean.getName();

        return check(name, bean, "enum", 0);
    }

    public static boolean check(Bean bean) {
        String name = bean.getNamespace() + "." + bean.getName();
        return check(name, bean, "bean", 0);
    }

    private static boolean check(String name, Bean bean, String head, int id) {
        CheckObj obj = nameMap.get(name);
        if (obj != null) {
            if (!obj.filePath.equals(bean.getFilePath())) {
                logger.error("不同的文件含有相同的命名 {} \n{} \n{}", name, obj.filePath, bean.getFilePath());
                return false;
            }
        } else {
            obj = new CheckObj();
            obj.setHead(head);
            obj.setName(name);
            if (id > 0) {
                obj.setId(id);
            }
            obj.setFilePath(bean.getFilePath());
            nameMap.put(name, obj);
            try {
                randomFile.writeBytes(JSON.toJSONString(obj) + "\n");
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }

        }
        return true;
    }

    public static void readLine(String line) {

        CheckObj obj = JSON.parseObject(line, CheckObj.class);
        String head = obj.head;
        String key = obj.name;
        if (head.equals("bean")) {
            nameMap.put(key, obj);
        } else if (head.equals("enum")) {
            nameMap.put(key, obj);
        } else if (head.equals("message")) {
            nameMap.put(key, obj);

            messageMap.put(obj.id, obj);
        } else if (head.equals("event")) {
            nameMap.put(key, obj);
            eventMap.put(obj.id, obj);
        }
    }

    private static void readId(Map<Integer, String> map, String line) {
        int left = line.indexOf("[");
        int right = line.indexOf("]");
        String idStr = line.substring(left + 1, right).trim();
        Integer id = Integer.valueOf(idStr);
        String name = line.substring(right + 1).trim();
        map.put(id, name);
        readName(name);
    }

    private static void readName(String name) {
        int point = StringUtil.indexOf(name, ".", 1, true);
        String key = name.substring(0, point);
        String value = name.substring(point + 1);
        //  nameMap.put(key, value);
    }

    /**
     * 合法返回true
     *
     * @param namespace
     * @param name
     * @return
     */
    private boolean checkName(String namespace, String name) {

        if (Objects.equals(nameMap.get(name), namespace)) {
            logger.error("名字相同");
            return false;
        }

        return true;
    }

    private static class CheckObj {

        String head;
        Integer id;
        String name;

        String filePath;

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }


    }

    public static void main(String[] args) {

        CheckObj obj = new CheckObj();
        obj.setHead("message");
        obj.setName("jkl");

        obj.id = 105;
        obj.setFilePath("ppp");


        System.out.println(JSON.toJSONString(obj));

    }
}
