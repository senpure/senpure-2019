package com.senpure.io.generator.reader;

import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * IoErrorListener
 *
 * @author senpure
 * @time 2019-06-06 17:18:55
 */
public class IoErrorListener extends DiagnosticErrorListener {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public IoErrorListener() {
        super(false);
    }

    public IoErrorListener(boolean exactOnly) {
        super(exactOnly);
    }

    private boolean hasError;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        logger.error("line {} : {} {}", line, charPositionInLine, msg);
        hasError = true;
    }

    public boolean isHasError() {
        return hasError;
    }
}
