package com.senpure.io.generator.executor;

import com.senpure.base.util.Assert;
import com.senpure.io.generator.habit.LuaConfig;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.Message;
import com.senpure.io.generator.util.TemplateUtil;
import com.senpure.template.Generator;
import com.senpure.template.sovereignty.Sovereignty;
import com.senpure.template.sovereignty.TemplateBean;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * LuaExecutor
 *
 * @author senpure
 * @time 2019-08-12 11:40:31
 */
public class LuaExecutor {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Configuration cfg;
    private ExecutorContext context;

    private LuaConfig luaConfig;

    public LuaExecutor(Configuration cfg, ExecutorContext context) {
        this.cfg = cfg;
        this.context = context;
        this.luaConfig = context.getLuaConfig();
    }

    public void changeTemplateDir2Lua() {
        try {
            cfg.setDirectoryForTemplateLoading(new File(TemplateUtil.templateDir(), context.getLuaTemplateDir()));
        } catch (IOException e) {
            Assert.error(e);
        }
    }

    private void checkFile(File file) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
    }

    public void generate() {
        changeTemplateDir2Lua();


        switch (luaConfig.getType()) {
            case LuaConfig.TYPE_MIX:
                generateByMix();
                break;
            case LuaConfig.TYPE_FILE:
                generateByFile();
                break;
            case LuaConfig.TYPE_NAMESPACE:
                generateByNamespace();
                break;
            default:
                generateByFile();
                break;
        }

    }

    private void generate(LuaMixBean bean, Template template, File file, boolean overwrite) {
        boolean thisOverwrite = false;
        if (file.exists()) {
            if (!overwrite) {
                logger.warn("文件存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                return;
            } else {
                thisOverwrite = true;
            }

        } else {
            checkFile(file);
        }
        bean.setSovereignty(Sovereignty.getInstance().sovereigntyLuaComment());
        if (thisOverwrite) {
            logger.info("覆盖生成  {} {}", file.getName(), file.getAbsoluteFile());
        } else {
            logger.info("生成  {} {}", file.getName(), file.getAbsoluteFile());
        }
        Generator.generate(bean, template, file);
    }

    public void generateByMix() {
        Template template = null;
        try {
            template = cfg.getTemplate(luaConfig.getLuaBeanTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        LuaMixBean bean = new LuaMixBean();
        bean.setBeans(context.getBeans());
        bean.setEnums(context.getEnums());
        bean.getMessages().addAll(context.getMessages());
        bean.compute();
        File file = new File(luaConfig.getLuaProtocolCodeRootPath(), luaConfig.getLuaMixFileName() + ".lua");

        generate(bean, template, file, true);
    }

    public void generateByFile() {
        Template template = null;
        try {
            template = cfg.getTemplate(luaConfig.getLuaBeanTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        Map<String, List<Bean>> fileMap = new HashMap<>();
        dispatchByFile(fileMap, context.getBeans());
        dispatchByFile(fileMap, context.getEnums());
        dispatchByFile(fileMap, context.getMessages());
        Map<File, LuaMixBean> luaMixBeanMap = new HashMap<>();
        for (Map.Entry<String, List<Bean>> entry : fileMap.entrySet()) {
            String fileName = new File(entry.getKey()).getName();
            fileName = fileName.substring(0, fileName.length() - 3);
            File file = new File(luaConfig.getLuaProtocolCodeRootPath(), fileName + ".lua");
            LuaMixBean bean = new LuaMixBean();
            List<Bean> beans = entry.getValue();
            for (Bean b : beans) {
                if (b instanceof Message) {
                    bean.getMessages().add((Message) b);
                } else if (b instanceof Enum) {
                    bean.getEnums().add((Enum) b);
                } else {
                    bean.getBeans().add(b);
                }
            }
            LuaMixBean luaMixBean = luaMixBeanMap.get(file);
            if (luaMixBean == null) {
                luaMixBeanMap.put(file, bean);
            } else {
                luaMixBean.merge(bean);
            }
        }
        for (Map.Entry<File, LuaMixBean> entry : luaMixBeanMap.entrySet()) {
            LuaMixBean luaMixBean = entry.getValue();
            luaMixBean.compute();
            generate(luaMixBean, template, entry.getKey(), true);
        }
    }

    private void pick(LuaMixBean bean, Bean b) {
        if (b instanceof Message) {
            bean.getMessages().add((Message) b);
        } else if (b instanceof Enum) {
            bean.getEnums().add((Enum) b);
        } else {
            bean.getBeans().add(b);
        }
    }

    public void generateByNamespace() {
        Template template = null;
        try {
            template = cfg.getTemplate(luaConfig.getLuaBeanTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        Map<String, List<Bean>> namespaceMap = new HashMap<>();
        dispatchByNamespace(namespaceMap, context.getBeans());
        dispatchByNamespace(namespaceMap, context.getEnums());
        dispatchByNamespace(namespaceMap, context.getMessages());

        for (Map.Entry<String, List<Bean>> entry : namespaceMap.entrySet()) {
            File file = new File(luaConfig.getLuaProtocolCodeRootPath(), entry.getKey().replace(".", File.separator) + ".lua");
            LuaMixBean bean = new LuaMixBean();
            List<Bean> beans = entry.getValue();
            for (Bean b : beans) {
                pick(bean, b);
            }
            bean.compute();
            generate(bean, template, file, true);
        }
    }

    private void dispatchByNamespace(Map<String, List<Bean>> namespaceMap, List<? extends Bean> beans) {
        for (Bean bean : beans) {
            List<Bean> list = namespaceMap.get(bean.getLua().getNamespace());
            if (list == null) {
                list = new ArrayList<>();
                namespaceMap.put(bean.getLua().getNamespace(), list);
            }
            list.add(bean);
        }
    }

    private void dispatchByFile(Map<String, List<Bean>> fileMap, List<? extends Bean> beans) {
        for (Bean bean : beans) {
            List<Bean> list = fileMap.get(bean.getFilePath());
            if (list == null) {
                list = new ArrayList<>();
                fileMap.put(bean.getFilePath(), list);
            }
            list.add(bean);
        }
    }

    public class LuaMixBean extends TemplateBean {
        private List<Bean> beans = new ArrayList();
        private List<Enum> enums = new ArrayList();
        private List<Message> messages = new ArrayList();

        private int namespaceMaxLen = 0;
        private int namespaceAndNameMaxLen = 0;
        private int nameMaxLen = 0;
        private int messageIdMaxLen = 0;
        private Set<String> namespaces = new HashSet<>();

        public void merge(LuaMixBean target) {
            enums.addAll(target.enums);
            beans.addAll(target.beans);
            messages.addAll(target.messages);
        }

        public void compute() {
            compute(enums);
            compute(beans);
            compute(messages);
            computeMessageId(messages);
        }

        private void compute(List<? extends Bean> beans) {
            for (Bean bean : beans) {
                String namespace = bean.getLua().getNamespace();
                String name = bean.getLua().getName();
                String namespaceAndName = namespace + "." + name;
                int nameLen = name.length();
                nameMaxLen = nameLen > nameMaxLen ? nameLen : nameMaxLen;
                int namespaceAndNameLen = namespaceAndName.length();
                namespaceAndNameMaxLen = namespaceAndNameLen > namespaceAndNameMaxLen ? namespaceAndNameLen : namespaceAndNameMaxLen;
                if (namespaces.add(bean.getLua().getNamespace())) {
                    int namespaceLen = namespace.length();
                    namespaceMaxLen = namespaceLen > namespaceMaxLen ? namespaceLen : namespaceMaxLen;
                }
            }
        }

        private void computeMessageId(List<Message> beans) {
            for (Message bean : beans) {
                int len = (bean.getId() + "").length();
                messageIdMaxLen = len > messageIdMaxLen ? len : messageIdMaxLen;
            }
        }

        public List<Bean> getBeans() {
            return beans;
        }

        public void setBeans(List<Bean> beans) {
            this.beans = beans;
        }

        public List<Enum> getEnums() {
            return enums;
        }

        public void setEnums(List<Enum> enums) {
            this.enums = enums;
        }

        public List<Message> getMessages() {
            return messages;
        }

        public void setMessages(List<Message> messages) {
            this.messages = messages;
        }

        public Set<String> getNamespaces() {
            return namespaces;
        }

        public void setNamespaces(Set<String> namespaces) {
            this.namespaces = namespaces;
        }

        public int getNamespaceAndNameMaxLen() {
            return namespaceAndNameMaxLen;
        }

        public void setNamespaceAndNameMaxLen(int namespaceAndNameMaxLen) {
            this.namespaceAndNameMaxLen = namespaceAndNameMaxLen;
        }

        public int getNameMaxLen() {
            return nameMaxLen;
        }

        public void setNameMaxLen(int nameMaxLen) {
            this.nameMaxLen = nameMaxLen;
        }

        public int getNamespaceMaxLen() {
            return namespaceMaxLen;
        }

        public void setNamespaceMaxLen(int namespaceMaxLen) {
            this.namespaceMaxLen = namespaceMaxLen;
        }

        public int getMessageIdMaxLen() {
            return messageIdMaxLen;
        }

        public void setMessageIdMaxLen(int messageIdMaxLen) {
            this.messageIdMaxLen = messageIdMaxLen;
        }
    }

    public static void main(String[] args) {

        File file = new File("pp/fdf.txt");
        File file2 = new File("pp/fdf.txt");

        System.out.println(file == file2);
        System.out.println(file.equals(file2));
    }
}
