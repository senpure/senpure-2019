package com.senpure.io.generator.ui.appender;

import javafx.application.Platform;
import javafx.scene.control.TextArea;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.Serializable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * TextAreaAppender
 *
 * @author senpure
 * @time 2019-07-10 09:38:46
 */
@Plugin(name = "TextArea", category = "Core", elementType = "appender", printObject = true)
public class TextAreaAppender extends AbstractAppender {

    private static TextArea textArea;

    private static BlockingQueue<String> queue = new LinkedBlockingDeque();

    static {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (textArea != null) {

                        try {
                            String str = queue.take();
                            Platform.runLater(() -> textArea.insertText(0, str));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        thread.setName("textArea-thread");
        thread.setDaemon(true);
        thread.start();
    }

    public static void setTextArea(TextArea textArea) {
        TextAreaAppender.textArea = textArea;
    }

    protected TextAreaAppender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, Property[] properties) {
        super(name, filter, layout, ignoreExceptions, properties);
    }

    @Override
    public void append(LogEvent event) {
        queue.offer(new String(getLayout().toByteArray(event)));

    }


    @PluginFactory
    public static TextAreaAppender createAppender(@PluginAttribute("name") String name,
                                                  @PluginElement("Filter") final Filter filter,
                                                  @PluginElement("Layout") Layout<? extends Serializable> layout

    ) {

        if (layout == null) {
            layout = PatternLayout.createDefaultLayout();
        }
        return new TextAreaAppender(name, filter, layout, true, null);
    }


}
