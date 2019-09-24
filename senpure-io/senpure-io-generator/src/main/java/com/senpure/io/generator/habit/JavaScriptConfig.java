package com.senpure.io.generator.habit;

import com.senpure.io.generator.executor.JavaScriptExecutor;
import com.senpure.io.generator.executor.LanguageExecutor;

/**
 * Config
 *
 * @author senpure
 * @time 2019-08-12 10:48:13
 */
public class JavaScriptConfig extends ScriptLanguageConfig {

    @Override
    public LanguageExecutor languageExecutor() {
        return new JavaScriptExecutor();
    }
}
