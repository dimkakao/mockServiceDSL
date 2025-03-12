package org.dmytro.demodsl.parser.custom_listener;

import org.antlr.v4.runtime.*;

public class SyntaxErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
    }
}
