package com.fbp.parser;

import com.fbp.psi._FBPLexer;
import com.intellij.lexer.FlexAdapter;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPLexerAdapter extends FlexAdapter {
    public FBPLexerAdapter() {
        super(new _FBPLexer(null));
    }
}
