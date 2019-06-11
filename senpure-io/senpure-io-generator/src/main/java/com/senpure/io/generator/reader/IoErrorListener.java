package com.senpure.io.generator.reader;

import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * IoErrorListener
 *
 * @author senpure
 * @time 2019-06-06 17:18:55
 */
public class IoErrorListener extends DiagnosticErrorListener {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private File file;

    public IoErrorListener(File file) {
        super(false);
        this.file = file;
    }

    public IoErrorListener(File file, boolean exactOnly) {
        super(exactOnly);
        this.file = file;
    }

    private boolean hasError;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        logger.error("{}: line {} : {} {}", file.getAbsoluteFile(), line, charPositionInLine, msg);
        hasError = true;
    }

    public boolean isHasError() {
        return hasError;
    }
}
