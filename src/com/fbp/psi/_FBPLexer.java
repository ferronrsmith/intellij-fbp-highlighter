/* The following code was generated by JFlex 1.4.3 on 3/17/16 4:08 AM */

package com.fbp.psi;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.fbp.psi.FBPTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/17/16 4:08 AM from the specification file
 * <tt>/Users/ferronsmith/personal_git/conscia/intellij-fbp-highlighter/src/com/fbp/psi/_FBPLexer.flex</tt>
 */
public class _FBPLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\1\1\1\1\1\22\0\1\1\1\0\1\21"+
    "\1\14\3\0\1\17\1\27\1\30\2\0\1\35\1\24\1\16\1\26"+
    "\12\15\1\34\2\0\1\25\1\33\2\0\4\23\1\11\3\23\1\3"+
    "\4\23\1\4\1\6\1\5\1\23\1\7\1\23\1\10\1\13\2\23"+
    "\1\12\2\23\1\31\1\20\1\32\1\0\1\23\1\0\32\26\u1fad\0"+
    "\2\22\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\4\3\1\4\1\5\1\6\2\1"+
    "\1\7\1\10\1\11\1\10\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\2\3\1\10\1\20\1\3\1\5\1\0"+
    "\1\21\3\0\1\22\3\3\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\u012c\0\u014a\0\36\0\u0168\0\u0186\0\u01a4"+
    "\0\36\0\36\0\36\0\36\0\36\0\u0186\0\u01c2\0\u010e"+
    "\0\u01e0\0\u0186\0\u01fe\0\u021c\0\u012c\0\36\0\u023a\0\u014a"+
    "\0\u0258\0\36\0\u0276\0\u0294\0\u02b2\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\2\5\1\6\2\5\1\7\2\5"+
    "\1\10\1\11\1\12\1\13\1\2\1\14\1\15\1\5"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\2"+
    "\1\25\1\26\37\0\2\3\36\0\1\5\1\27\7\5"+
    "\1\0\1\5\1\30\4\0\1\5\1\31\1\32\1\20"+
    "\6\0\1\32\3\0\11\5\1\0\1\5\1\30\4\0"+
    "\1\5\1\31\1\32\1\20\6\0\1\32\3\0\10\5"+
    "\1\33\1\0\1\5\1\30\4\0\1\5\1\31\1\32"+
    "\1\20\6\0\1\32\3\0\7\5\1\27\1\5\1\0"+
    "\1\5\1\30\4\0\1\5\1\31\1\32\1\20\6\0"+
    "\1\32\2\10\1\0\33\10\3\0\11\5\1\0\1\11"+
    "\1\34\4\0\1\5\1\31\1\32\1\20\6\0\1\32"+
    "\3\0\11\30\1\0\2\30\4\0\1\30\12\0\17\35"+
    "\1\36\1\37\15\35\20\40\1\41\1\36\14\40\3\0"+
    "\11\31\1\0\1\31\5\0\2\31\1\0\1\31\4\0"+
    "\1\42\5\0\11\32\1\0\1\32\5\0\1\32\1\0"+
    "\2\32\6\0\1\32\3\0\11\20\1\0\1\20\5\0"+
    "\1\20\1\31\1\32\1\20\6\0\1\32\3\0\2\5"+
    "\1\43\6\5\1\0\1\5\1\30\4\0\1\5\1\31"+
    "\1\32\1\20\6\0\1\32\3\0\11\31\1\0\1\31"+
    "\5\0\2\31\1\0\1\31\12\0\5\5\1\27\3\5"+
    "\1\0\1\5\1\30\4\0\1\5\1\31\1\32\1\20"+
    "\6\0\1\32\3\0\11\30\1\0\1\34\1\30\4\0"+
    "\1\30\12\0\2\35\1\0\33\35\2\40\1\0\33\40"+
    "\3\0\3\5\1\44\5\5\1\0\1\5\1\30\4\0"+
    "\1\5\1\31\1\32\1\20\6\0\1\32\3\0\4\5"+
    "\1\45\4\5\1\0\1\5\1\30\4\0\1\5\1\31"+
    "\1\32\1\20\6\0\1\32\3\0\5\5\1\46\3\5"+
    "\1\0\1\5\1\30\4\0\1\5\1\31\1\32\1\20"+
    "\6\0\1\32";

  private static int [] zzUnpackTrans() {
    int [] result = new int[720];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\1\11\3\1\5\11\7\1\1\0"+
    "\1\11\3\0\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _FBPLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _FBPLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 104) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return NODENAME;
          }
        case 20: break;
        case 15: 
          { return COMMA;
          }
        case 21: break;
        case 4: 
          { return COMMENT;
          }
        case 22: break;
        case 10: 
          { return LP;
          }
        case 23: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 24: break;
        case 7: 
          { return CHAR;
          }
        case 25: break;
        case 14: 
          { return COLON;
          }
        case 26: break;
        case 3: 
          { return PORTNAME;
          }
        case 27: break;
        case 12: 
          { return LB;
          }
        case 28: break;
        case 19: 
          { return PORTTOKEN;
          }
        case 29: break;
        case 16: 
          { return COMPMETA;
          }
        case 30: break;
        case 11: 
          { return RP;
          }
        case 31: break;
        case 9: 
          { return EQ;
          }
        case 32: break;
        case 17: 
          { return STRING;
          }
        case 33: break;
        case 13: 
          { return RB;
          }
        case 34: break;
        case 5: 
          { return NUMBER;
          }
        case 35: break;
        case 18: 
          { return OP;
          }
        case 36: break;
        case 6: 
          { return DOT;
          }
        case 37: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 38: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
