// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: final.jflex

package Analizadores;

import static Analizadores.sym.*;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int ESTUDIANTE = 2;
  public static final int USUARIO = 4;
  public static final int CATEDRATICO = 6;
  public static final int EDIFICIO = 8;
  public static final int SALON = 10;
  public static final int CURSO = 12;
  public static final int HORARIO = 14;
  public static final int ASIGNAR = 16;
  public static final int COMILLA = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  2, 2
  };

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     2,  0,  3,  0,  0,  0,  0,  0,  4,  5,  0,  0,  6,  7,  0,  0, 
     8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  7,  9,  0,  0,  0,  0, 
     0, 10, 11, 12, 13, 14,  7,  7, 15, 16,  7,  7, 17,  7, 18, 19, 
     7,  7, 20, 21, 22, 23,  7,  7,  7,  7,  7,  0,  0,  0,  0,  7, 
     0, 24, 11, 25, 26, 27, 28, 29,  7, 30,  7,  7, 31,  7, 32, 33, 
     7,  7, 34, 35, 36, 37,  7,  7,  7,  7,  7,  0,  1,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\11\6\1\11\36\6\1\12\3\6\1\13\10\6"+
    "\1\14\4\6\1\15\1\16\3\6\1\17\5\6\1\20"+
    "\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[84];
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
    "\0\0\0\46\0\114\0\162\0\230\0\162\0\162\0\162"+
    "\0\162\0\276\0\344\0\162\0\u010a\0\u0130\0\u0156\0\u017c"+
    "\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a\0\162\0\u0260\0\u0286"+
    "\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\u036a\0\u0390\0\u03b6"+
    "\0\u03dc\0\u0402\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\u04e6"+
    "\0\u050c\0\u0532\0\u0558\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616"+
    "\0\u063c\0\u0662\0\u0688\0\u06ae\0\276\0\u06d4\0\u06fa\0\u0720"+
    "\0\276\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de\0\u0804\0\u082a"+
    "\0\u0850\0\276\0\u0876\0\u089c\0\u08c2\0\u08e8\0\276\0\276"+
    "\0\u090e\0\u0934\0\u095a\0\276\0\u0980\0\u09a6\0\u09cc\0\u09f2"+
    "\0\u0a18\0\276\0\276\0\276";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[84];
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
    "\1\4\2\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\12\1\16\1\12\1\17\1\20\5\12"+
    "\1\21\1\12\1\22\1\12\1\23\1\12\1\24\12\12"+
    "\50\4\1\25\1\26\3\4\2\25\1\4\34\25\47\0"+
    "\2\5\52\0\2\12\1\0\34\12\7\0\1\12\1\13"+
    "\1\0\34\12\7\0\2\12\1\0\31\12\1\27\2\12"+
    "\7\0\2\12\1\0\11\12\1\30\4\12\1\31\10\12"+
    "\1\30\3\12\1\32\7\0\2\12\1\0\13\12\1\33"+
    "\4\12\1\34\10\12\1\33\2\12\7\0\2\12\1\0"+
    "\27\12\1\35\4\12\7\0\2\12\1\0\16\12\1\36"+
    "\15\12\7\0\2\12\1\0\31\12\1\37\2\12\7\0"+
    "\2\12\1\0\11\12\1\30\15\12\1\30\4\12\7\0"+
    "\2\12\1\0\13\12\1\33\15\12\1\33\2\12\2\0"+
    "\1\25\4\0\2\25\1\0\34\25\7\0\2\12\1\0"+
    "\24\12\1\40\7\12\7\0\2\12\1\0\7\12\1\41"+
    "\15\12\1\41\6\12\7\0\2\12\1\0\32\12\1\42"+
    "\1\12\7\0\2\12\1\0\30\12\1\43\3\12\7\0"+
    "\2\12\1\0\14\12\1\44\15\12\1\44\1\12\7\0"+
    "\2\12\1\0\24\12\1\45\7\12\7\0\2\12\1\0"+
    "\30\12\1\46\3\12\7\0\2\12\1\0\25\12\1\47"+
    "\6\12\7\0\2\12\1\0\33\12\1\50\7\0\2\12"+
    "\1\0\23\12\1\51\10\12\7\0\2\12\1\0\1\52"+
    "\15\12\1\52\15\12\7\0\2\12\1\0\21\12\1\53"+
    "\12\12\7\0\2\12\1\0\31\12\1\54\2\12\7\0"+
    "\2\12\1\0\15\12\1\55\15\12\1\55\7\0\2\12"+
    "\1\0\22\12\1\56\11\12\7\0\2\12\1\0\16\12"+
    "\1\57\15\12\7\0\2\12\1\0\27\12\1\60\4\12"+
    "\7\0\2\12\1\0\16\12\1\61\15\12\7\0\2\12"+
    "\1\0\26\12\1\62\5\12\7\0\2\12\1\0\1\12"+
    "\1\63\32\12\7\0\2\12\1\0\20\12\1\64\13\12"+
    "\7\0\2\12\1\0\27\12\1\65\4\12\7\0\2\12"+
    "\1\0\3\12\1\66\14\12\1\66\13\12\7\0\2\12"+
    "\1\0\24\12\1\67\7\12\7\0\2\12\1\0\30\12"+
    "\1\70\3\12\7\0\2\12\1\0\26\12\1\71\5\12"+
    "\7\0\2\12\1\0\30\12\1\72\3\12\7\0\2\12"+
    "\1\0\16\12\1\73\15\12\7\0\2\12\1\0\11\12"+
    "\1\74\15\12\1\74\4\12\7\0\2\12\1\0\30\12"+
    "\1\75\3\12\7\0\2\12\1\0\6\12\1\76\15\12"+
    "\1\76\7\12\7\0\2\12\1\0\17\12\1\77\14\12"+
    "\7\0\2\12\1\0\24\12\1\100\7\12\7\0\2\12"+
    "\1\0\24\12\1\101\7\12\7\0\2\12\1\0\30\12"+
    "\1\102\3\12\7\0\2\12\1\0\12\12\1\103\15\12"+
    "\1\103\3\12\7\0\2\12\1\0\16\12\1\104\15\12"+
    "\7\0\2\12\1\0\1\105\15\12\1\105\15\12\7\0"+
    "\2\12\1\0\24\12\1\106\7\12\7\0\2\12\1\0"+
    "\27\12\1\107\4\12\7\0\2\12\1\0\27\12\1\110"+
    "\4\12\7\0\2\12\1\0\1\111\15\12\1\111\15\12"+
    "\7\0\2\12\1\0\32\12\1\112\1\12\7\0\2\12"+
    "\1\0\10\12\1\113\15\12\1\113\5\12\7\0\2\12"+
    "\1\0\27\12\1\114\4\12\7\0\2\12\1\0\3\12"+
    "\1\115\14\12\1\115\13\12\7\0\2\12\1\0\24\12"+
    "\1\116\7\12\7\0\2\12\1\0\14\12\1\117\15\12"+
    "\1\117\1\12\7\0\2\12\1\0\11\12\1\120\15\12"+
    "\1\120\4\12\7\0\2\12\1\0\17\12\1\121\14\12"+
    "\7\0\2\12\1\0\4\12\1\122\14\12\1\122\12\12"+
    "\7\0\2\12\1\0\12\12\1\123\15\12\1\123\3\12"+
    "\7\0\2\12\1\0\27\12\1\124\4\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2622];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\4\11\2\1\1\11\11\1\1\11"+
    "\76\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[84];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 19: break;
          case 2:
            { yybegin(COMILLA); return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 20: break;
          case 3:
            { return new Symbol(sym.PARENTESIS_ABRE,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 21: break;
          case 4:
            { return new Symbol(sym.PARENTESIS_CIERRA,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 22: break;
          case 5:
            { return new Symbol(sym.COMA,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 23: break;
          case 6:
            { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 24: break;
          case 7:
            { return new Symbol(sym.NUMEROS,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 25: break;
          case 8:
            { return new Symbol(sym.PUNTO_COMA,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 26: break;
          case 9:
            { yybegin(YYINITIAL); return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 27: break;
          case 10:
            { return new Symbol(sym.CURSO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 28: break;
          case 11:
            { return new Symbol(sym.SALON,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 29: break;
          case 12:
            { return new Symbol(sym.ASIGNAR,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 30: break;
          case 13:
            { return new Symbol(sym.HORARIO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 31: break;
          case 14:
            { return new Symbol(sym.USUARIO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 32: break;
          case 15:
            { return new Symbol(sym.EDIFICIO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 33: break;
          case 16:
            { return new Symbol(sym.ESTUDIANTE,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 34: break;
          case 17:
            { return new Symbol(sym.COLABORADOR,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 35: break;
          case 18:
            { return new Symbol(sym.CATEDRATICO,yyline+1, yycolumn+1,yytext());
            }
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
