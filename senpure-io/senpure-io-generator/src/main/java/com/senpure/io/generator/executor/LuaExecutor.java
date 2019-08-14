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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        for (Bean beanBean : bean.getEnums()) {
            bean.getNamespaces().add(beanBean.getLua().getNamespace());
        }
        for (Bean beanBean : bean.getBeans()) {
            bean.getNamespaces().add(beanBean.getLua().getNamespace());
        }   for (Bean beanBean : bean.getMessages()) {
            bean.getNamespaces().add(beanBean.getLua().getNamespace());
        }

        File file = new File(luaConfig.getLuaBeanCodeRootPath(), luaConfig.getLuaMixFileName() + ".lua");
        boolean cover = false;
        if (file.exists()) {
            if (!luaConfig.isLuaMixFileOverwrite()) {
                logger.warn("文件存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                return;
            } else {
                cover = true;
            }

        } else {
            checkFile(file);
        }
        bean.setSovereignty(Sovereignty.getInstance().sovereigntyLuaComment());
        if (cover) {
            logger.info("覆盖生成  {} {}", file.getName(), file.getAbsoluteFile());
        } else {
            logger.info("生成  {} {}", file.getName(), file.getAbsoluteFile());
        }
        Generator.generate(bean, template, file);

    }

    public class LuaMixBean extends TemplateBean {
        private List<Bean> beans = new ArrayList();


        private List<Enum> enums = new ArrayList();
        private List<Message> messages = new ArrayList();

        private Set<String> namespaces = new HashSet<>();
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
    }
}
