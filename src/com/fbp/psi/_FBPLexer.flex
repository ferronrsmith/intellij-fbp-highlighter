package com.fbp.psi;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.fbp.psi.FBPTypes.*;

%%

%{
  public _FBPLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _FBPLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

WHITE_SPACE=[ \t\n\x0B\f\r]+
PORTTOKEN=(INPORT|EXPORT|OUTPORT)
COMMENT=#.*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
CHAR=[\n\r\u2028\u2029]
PORTNAME=[A-Z.0-9_]+
NODENAME=[a-zA-Z0-9_\-/]+
COMPMETA=[a-zA-Z/=_,0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "("                { return LP; }
  ")"                { return RP; }
  "["                { return LB; }
  "]"                { return RB; }
  "->"               { return OP; }
  ":"                { return COLON; }
  ","                { return COMMA; }
  "="                { return EQ; }
  "."                { return DOT; }

  {WHITE_SPACE}      { return WHITE_SPACE; }
  {PORTTOKEN}        { return PORTTOKEN; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {CHAR}             { return CHAR; }
  {PORTNAME}         { return PORTNAME; }
  {NODENAME}         { return NODENAME; }
  {COMPMETA}         { return COMPMETA; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
