package com.fbp.highlight;

import com.fbp.parser.FBPLexerAdapter;
import com.fbp.psi.FBPTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPSyntaxHighlighter extends SyntaxHighlighterBase {
    static final TextAttributesKey KEY = createTextAttributesKey("FBP_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    static final TextAttributesKey OP = createTextAttributesKey("OP", DefaultLanguageHighlighterColors.KEYWORD);
    static final TextAttributesKey STRING = createTextAttributesKey("FBP_STRING", DefaultLanguageHighlighterColors.STRING);
    static final TextAttributesKey COMMENT = createTextAttributesKey("FBP_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    static final TextAttributesKey BRACKETS = createTextAttributesKey("FBP_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    static final TextAttributesKey PARENTHESES = createTextAttributesKey("FBP_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    static final TextAttributesKey NUMBER = createTextAttributesKey("FBP_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("FBP_BAD_CHAR", HighlighterColors.BAD_CHARACTER);
    static final TextAttributesKey COLON = createTextAttributesKey("FBP_COLON", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    static final TextAttributesKey COMPONENT = createTextAttributesKey("FBP_PARAMS", DefaultLanguageHighlighterColors.PARAMETER);
    static final TextAttributesKey METADATA = createTextAttributesKey("FBP_METADATA", DefaultLanguageHighlighterColors.METADATA);


    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FBPLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {

        TextAttributesKey item = null;

        if (tokenType.equals(FBPTypes.OP)) {
            item = OP;
        } else if (tokenType.equals(FBPTypes.PORTNAME)) {
            item = KEY;
        } else if (tokenType.equals(FBPTypes.COMMENT)) {
            item = COMMENT;
        } else if (tokenType.equals(FBPTypes.LB)) {
            item = BRACKETS;
        } else if (tokenType.equals(FBPTypes.RB)) {
            item = BRACKETS;
        } else if (tokenType.equals(FBPTypes.LP)) {
            item = PARENTHESES;
        } else if (tokenType.equals(FBPTypes.RP)) {
            item = PARENTHESES;
        } else if (tokenType.equals(FBPTypes.NUMBER)) {
            item = NUMBER;
        } else if (tokenType.equals(FBPTypes.STRING)) {
            item = STRING;
        } else if (tokenType.equals(FBPTypes.COLON)) {
            item = COLON;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            item = BAD_CHARACTER;
        } else if (tokenType.equals(FBPTypes.COMPONENT)) {
            item = COMPONENT;
        } else if (tokenType.equals(FBPTypes.METADATA)) {
            item = METADATA;
        }

        return item == null ? EMPTY_KEYS : SyntaxHighlighterBase.pack(item);
    }
}