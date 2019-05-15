package com.senpure.template;

import com.senpure.template.sovereignty.Sovereignty;
import com.senpure.template.sovereignty.TemplateBean;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Generator
 *
 * @author senpure
 * @date 2018-05-08
 */
public class Generator {

    private static Logger logger = LoggerFactory.getLogger(Generator.class);


    public final static void generate(TemplateBean bean, Template template, File file, boolean checkSovereignty) {

        if (checkSovereignty && !Sovereignty.getInstance().checkSovereignty(template)) {
            logger.error("{} 缺少 ${sovereignty}", template.getName());
            System.exit(0);
        }

        generateFile(bean, template, file);
        if (checkSovereignty && !bean.checkSovereignty()) {
            logger.error("{} 没有调用 ${sovereignty}", template.getName());
            if (file.exists()) {
                file.delete();
            }
            System.exit(0);
        }
    }

    public final static void generate(TemplateBean bean, Template template, File file) {
        generate(bean, template, file, true);
    }

    private static void generateFile(Object bean, Template template, File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            template.process(bean, new OutputStreamWriter(fos, "utf-8"));
            fos.close();
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException", e);
        } catch (TemplateException e) {
            logger.error("TemplateException", e);
        } catch (UnsupportedEncodingException e) {
            logger.error("UnsupportedEncodingException", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
    }

}