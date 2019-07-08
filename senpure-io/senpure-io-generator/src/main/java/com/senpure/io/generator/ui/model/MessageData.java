package com.senpure.io.generator.ui.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

/**
 * MessageData
 *
 * @author senpure
 * @time 2019-07-08 16:55:35
 */
public class MessageData {

    private StringProperty name;
    private BooleanProperty generate;
    private StringProperty type;
    private StringProperty explain;

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public boolean isGenerate() {
        return generate.get();
    }

    public BooleanProperty generateProperty() {
        return generate;
    }

    public void setGenerate(boolean generate) {
        this.generate.set(generate);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getExplain() {
        return explain.get();
    }

    public StringProperty explainProperty() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain.set(explain);
    }
}
