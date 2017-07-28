/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package simple.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static simple.language.psi.SimpleTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Simple.flex</tt>
 */
class SimpleLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

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
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 13696 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\11\1\33\1\34\2\11\1\14\1\35\3\11\1\36\10\11\1\37\1\40\20\11\1\41\2\11"+
    "\1\42\5\11\1\43\4\11\1\44\1\45\4\11\51\14\1\46\3\14\1\47\1\50\4\14\1\51\12"+
    "\11\1\52\u0381\11");

  /* The ZZ_CMAP_Y table has 2752 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6\1\7\1\1\1\10\1\11\1\12\1\13\1\12\1\13\34"+
    "\12\1\14\1\15\1\16\10\1\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\23\12\12\1\4"+
    "\1\12\1\24\1\4\1\12\1\25\4\1\1\12\1\6\1\26\2\1\2\12\1\6\1\1\1\27\1\4\5\12"+
    "\1\30\1\31\1\32\1\1\1\33\1\12\1\1\1\34\5\12\1\35\1\36\1\37\1\12\1\6\1\40\1"+
    "\12\1\41\1\42\1\1\1\12\1\43\4\1\1\12\1\44\4\1\1\45\2\12\1\46\1\1\1\47\1\50"+
    "\1\4\1\51\1\52\1\53\1\54\1\55\1\56\1\50\1\15\1\57\1\52\1\53\1\60\1\1\1\61"+
    "\1\62\1\63\1\64\1\21\1\53\1\65\1\1\1\66\1\50\1\67\1\70\1\52\1\53\1\65\1\1"+
    "\1\56\1\50\1\36\1\71\1\72\1\73\1\74\1\1\1\66\1\62\1\1\1\75\1\33\1\53\1\46"+
    "\1\1\1\76\1\50\1\1\1\75\1\33\1\53\1\77\1\1\1\55\1\50\1\100\1\75\1\33\1\12"+
    "\1\101\1\55\1\102\1\50\1\103\1\104\1\105\1\12\1\106\1\107\1\1\1\62\1\1\1\4"+
    "\2\12\1\110\1\107\1\111\2\1\1\112\1\113\1\114\1\115\1\116\1\117\2\1\1\66\1"+
    "\1\1\111\1\1\1\120\1\12\1\121\1\1\1\122\7\1\2\12\1\6\1\102\1\111\1\123\1\124"+
    "\1\125\1\126\1\111\2\12\1\127\2\12\1\130\24\12\1\131\1\132\2\12\1\131\2\12"+
    "\1\133\1\134\1\13\3\12\1\134\3\12\1\6\2\1\1\12\1\1\5\12\1\135\1\4\45\12\1"+
    "\136\1\12\1\4\1\6\4\12\1\6\1\137\1\140\1\15\1\12\1\15\1\12\1\15\1\140\1\66"+
    "\3\12\1\141\1\1\1\142\1\111\2\1\1\111\5\12\1\25\2\12\1\143\4\12\1\35\1\12"+
    "\1\144\2\1\1\62\1\12\1\145\1\44\2\12\1\146\1\12\1\74\1\111\2\1\1\12\1\107"+
    "\3\12\1\44\2\1\2\111\1\147\5\1\1\104\2\12\1\141\1\150\1\111\2\1\1\151\1\12"+
    "\1\152\1\37\2\12\1\35\1\1\2\12\1\141\1\1\1\153\1\37\1\12\1\145\6\1\1\154\1"+
    "\155\14\12\4\1\21\12\1\135\2\12\1\135\1\156\1\12\1\145\3\12\1\157\1\160\1"+
    "\161\1\121\1\160\2\1\1\162\4\1\1\163\1\1\1\121\6\1\1\164\1\165\1\166\1\167"+
    "\1\170\3\1\1\171\147\1\2\12\1\144\2\12\1\144\10\12\1\172\1\173\2\12\1\127"+
    "\3\12\1\174\1\1\1\12\1\107\4\175\4\1\1\102\35\1\1\176\2\1\1\177\1\4\4\12\1"+
    "\200\1\4\4\12\1\130\1\104\1\12\1\145\1\4\4\12\1\144\1\1\1\12\1\6\3\1\1\12"+
    "\40\1\133\12\1\35\4\1\135\12\1\35\2\1\10\12\1\121\4\1\2\12\1\145\20\12\1\121"+
    "\1\12\1\201\1\1\2\12\1\144\1\102\1\12\1\145\4\12\1\35\2\1\1\202\1\203\5\12"+
    "\1\204\1\12\1\145\1\25\3\1\1\202\1\205\1\12\1\26\1\1\3\12\1\141\1\203\2\12"+
    "\1\141\1\1\1\111\1\1\1\206\1\37\1\12\1\35\1\12\1\107\1\1\1\12\1\121\1\45\2"+
    "\12\1\26\1\102\1\111\1\207\1\210\2\12\1\43\1\1\1\211\1\111\1\12\1\212\3\12"+
    "\1\213\1\214\1\215\1\6\1\63\1\216\1\217\1\175\2\12\1\130\1\35\7\12\1\26\1"+
    "\111\72\12\1\141\1\12\1\220\2\12\1\146\20\1\26\12\1\145\6\12\1\74\2\1\1\107"+
    "\1\221\1\53\1\222\1\223\6\12\1\15\1\1\1\151\25\12\1\145\1\1\4\12\1\203\2\12"+
    "\1\25\2\1\1\146\7\1\1\207\7\12\1\121\1\1\1\111\1\4\1\6\1\4\1\6\1\224\4\12"+
    "\1\144\1\225\1\226\2\1\1\227\1\12\1\13\1\230\2\145\2\1\7\12\1\6\30\1\1\12"+
    "\1\121\3\12\1\66\2\1\2\12\1\1\1\12\1\231\2\12\1\35\1\12\1\145\2\12\1\232\3"+
    "\1\11\12\1\145\1\111\5\1\2\12\1\25\3\12\1\141\11\1\23\12\1\107\1\12\1\35\1"+
    "\25\11\1\1\233\2\12\1\234\1\12\1\35\1\12\1\107\1\12\1\144\4\1\1\12\1\235\1"+
    "\12\1\35\1\12\1\74\4\1\3\12\1\236\4\1\1\66\1\237\1\12\1\141\2\1\1\12\1\121"+
    "\1\12\1\121\2\1\1\120\1\12\1\44\1\1\3\12\1\35\1\12\1\35\1\12\1\26\1\12\1\15"+
    "\6\1\4\12\1\43\3\1\3\12\1\26\3\12\1\26\60\1\1\151\2\12\1\25\2\1\1\62\1\1\1"+
    "\151\2\12\2\1\1\12\1\43\1\111\1\151\1\12\1\107\1\62\1\1\2\12\1\240\1\151\2"+
    "\12\1\26\1\241\1\242\2\1\1\12\1\21\1\146\5\1\1\243\1\244\1\43\2\12\1\144\1"+
    "\1\1\111\1\70\1\52\1\53\1\65\1\1\1\245\1\15\21\1\3\12\1\1\1\246\1\111\12\1"+
    "\2\12\1\144\2\1\1\247\2\1\3\12\1\1\1\250\1\111\2\1\2\12\1\6\1\1\1\111\3\1"+
    "\1\12\1\74\1\1\1\111\26\1\4\12\1\111\1\102\34\1\3\12\1\43\20\1\71\12\1\74"+
    "\16\1\14\12\1\141\53\1\2\12\1\144\75\1\44\12\1\107\33\1\43\12\1\43\1\12\1"+
    "\144\1\111\6\1\1\12\1\145\1\1\3\12\1\1\1\141\1\111\1\151\1\251\1\12\67\1\4"+
    "\12\1\44\1\66\3\1\1\151\6\1\1\15\77\1\6\12\1\6\1\121\1\43\1\74\66\1\5\12\1"+
    "\207\3\12\1\140\1\252\1\253\1\254\3\12\1\255\1\256\1\12\1\257\1\260\1\33\24"+
    "\12\1\261\1\12\1\33\1\130\1\12\1\130\1\12\1\207\1\12\1\207\1\144\1\12\1\144"+
    "\1\12\1\53\1\12\1\53\1\12\1\262\3\263\14\12\1\44\123\1\1\254\1\12\1\264\1"+
    "\265\1\266\1\267\1\270\1\271\1\272\1\146\1\273\1\146\24\1\55\12\1\107\2\1"+
    "\103\12\1\44\15\12\1\145\150\12\1\15\25\1\41\12\1\145\36\1");

  /* The ZZ_CMAP_A table has 3008 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\11\1\2\1\1\22\0\1\2\6\0\1\3\3\0\1\10\1\0\1\4\1\6\1\0\12\5"+
    "\3\0\1\7\3\0\32\3\4\0\14\3\12\0\1\11\24\0\1\3\12\0\1\3\4\0\1\3\5\0\27\3\1"+
    "\0\12\3\4\0\14\3\16\0\5\3\7\0\1\3\1\0\1\3\1\0\5\3\1\0\2\3\2\0\4\3\1\0\1\3"+
    "\6\0\1\3\1\0\3\3\1\0\1\3\1\0\4\3\1\0\23\3\1\0\13\3\10\0\15\3\2\0\1\3\6\0\10"+
    "\3\10\0\3\3\15\0\12\5\4\0\6\3\1\0\1\3\17\0\2\3\7\0\2\3\12\5\3\3\2\0\2\3\1"+
    "\0\16\3\15\0\11\3\13\0\1\3\16\0\12\5\6\3\4\0\2\3\4\0\1\3\5\0\6\3\4\0\1\3\11"+
    "\0\1\3\3\0\1\3\7\0\11\3\7\0\5\3\17\0\26\3\3\0\1\3\2\0\1\3\7\0\12\3\4\0\12"+
    "\5\1\3\4\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3\1\0\1\3\3\0\4\3\3\0\1\3\20\0\1\3"+
    "\15\0\2\3\1\0\1\3\5\0\6\3\4\0\2\3\1\0\2\3\1\0\2\3\1\0\2\3\17\0\4\3\1\0\1\3"+
    "\7\0\12\5\2\0\3\3\20\0\11\3\1\0\2\3\1\0\2\3\1\0\5\3\3\0\1\3\2\0\1\3\30\0\1"+
    "\3\13\0\10\3\2\0\1\3\3\0\1\3\1\0\6\3\3\0\3\3\1\0\4\3\3\0\2\3\1\0\1\3\1\0\2"+
    "\3\3\0\2\3\3\0\3\3\3\0\14\3\13\0\10\3\1\0\2\3\10\0\3\3\5\0\4\3\1\0\5\3\3\0"+
    "\1\3\3\0\2\3\15\0\13\3\2\0\1\3\21\0\1\3\12\0\6\3\5\0\22\3\3\0\10\3\1\0\11"+
    "\3\1\0\1\3\2\0\7\3\11\0\1\3\1\0\2\3\14\0\12\5\7\0\2\3\1\0\1\3\2\0\2\3\1\0"+
    "\1\3\2\0\1\3\6\0\4\3\1\0\7\3\1\0\3\3\1\0\1\3\1\0\1\3\2\0\2\3\1\0\4\3\1\0\2"+
    "\3\11\0\1\3\2\0\5\3\1\0\1\3\11\0\12\5\2\0\14\3\1\0\24\3\13\0\5\3\3\0\6\3\4"+
    "\0\4\3\3\0\1\3\3\0\2\3\7\0\3\3\4\0\15\3\14\0\1\3\1\0\6\3\1\0\1\3\5\0\1\3\2"+
    "\0\13\3\1\0\15\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3\2\0\1\3\1\0\4\3\2\0\7\3\1"+
    "\0\1\3\1\0\4\3\2\0\16\3\2\0\6\3\2\0\15\3\2\0\1\3\1\0\10\3\7\0\15\3\1\0\6\3"+
    "\23\0\1\3\4\0\1\3\3\0\11\3\1\0\1\3\5\0\17\3\1\0\16\3\2\0\14\3\13\0\1\3\15"+
    "\0\7\3\7\0\16\3\15\0\2\3\12\5\3\0\3\3\11\0\4\3\1\0\4\3\3\0\2\3\11\0\10\3\1"+
    "\0\1\3\1\0\1\3\1\0\1\3\1\0\6\3\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3\3\0\4\3\2\0"+
    "\6\3\14\0\2\11\7\0\1\3\15\0\1\3\2\0\1\3\4\0\1\3\2\0\12\3\1\0\1\3\3\0\5\3\6"+
    "\0\1\3\1\0\1\3\1\0\1\3\1\0\4\3\1\0\13\3\2\0\4\3\5\0\5\3\4\0\1\3\4\0\2\3\13"+
    "\0\5\3\6\0\4\3\3\0\2\3\14\0\10\3\7\0\10\3\1\0\7\3\6\0\2\3\12\0\5\3\5\0\2\3"+
    "\3\0\7\3\6\0\3\3\12\5\2\3\13\0\11\3\2\0\27\3\2\0\7\3\1\0\3\3\1\0\4\3\1\0\4"+
    "\3\2\0\6\3\3\0\1\3\1\0\1\3\2\0\5\3\1\0\12\3\12\5\5\3\1\0\3\3\1\0\10\3\4\0"+
    "\7\3\3\0\1\3\3\0\2\3\1\0\1\3\3\0\2\3\2\0\5\3\2\0\1\3\1\0\1\3\30\0\3\3\3\0"+
    "\6\3\2\0\6\3\2\0\6\3\11\0\7\3\4\0\5\3\3\0\5\3\5\0\1\3\1\0\10\3\1\0\5\3\1\0"+
    "\1\3\1\0\2\3\1\0\2\3\1\0\12\3\6\0\12\3\2\0\6\3\2\0\6\3\2\0\6\3\2\0\3\3\3\0"+
    "\14\3\1\0\16\3\1\0\2\3\1\0\2\3\1\0\10\3\6\0\4\3\4\0\16\3\2\0\1\3\1\0\14\3"+
    "\1\0\2\3\3\0\1\3\2\0\4\3\1\0\2\3\12\0\10\3\6\0\6\3\1\0\3\3\1\0\12\3\3\0\1"+
    "\3\12\0\4\3\13\0\12\5\1\3\1\0\1\3\3\0\7\3\1\0\1\3\1\0\4\3\1\0\17\3\1\0\2\3"+
    "\14\0\3\3\4\0\2\3\1\0\1\3\20\0\4\3\10\0\1\3\13\0\10\3\5\0\3\3\2\0\1\3\2\0"+
    "\2\3\2\0\4\3\1\0\14\3\1\0\1\3\1\0\7\3\1\0\21\3\1\0\4\3\2\0\10\3\1\0\7\3\1"+
    "\0\14\3\1\0\4\3\1\0\5\3\1\0\1\3\3\0\14\3\2\0\13\3\1\0\10\3\2\0\22\5\1\0\2"+
    "\3\1\0\1\3\2\0\1\3\1\0\12\3\1\0\4\3\1\0\1\3\1\0\1\3\6\0\1\3\4\0\1\3\1\0\1"+
    "\3\1\0\1\3\1\0\3\3\1\0\2\3\1\0\1\3\2\0\1\3\1\0\1\3\1\0\1\3\1\0\1\3\1\0\1\3"+
    "\1\0\2\3\1\0\1\3\2\0\4\3\1\0\7\3\1\0\4\3\1\0\4\3\1\0\1\3\1\0\12\3\1\0\5\3"+
    "\1\0\3\3\1\0\5\3\1\0\5\3");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\4\1\5"+
    "\1\6\1\0\1\7\1\10\1\0\1\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[14];
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
    "\0\0\0\12\0\24\0\36\0\50\0\62\0\74\0\12"+
    "\0\12\0\106\0\120\0\132\0\144\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[14];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\14\0\1\3\2\0\1\12\7\0\1\4\12\0"+
    "\1\5\1\0\1\5\10\0\1\13\1\14\7\0\1\5"+
    "\1\0\1\7\1\15\7\0\1\13\5\0\1\13\1\0"+
    "\10\13\5\0\1\14\1\15\10\0\1\16\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[110];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\2\11\1\0\2\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[14];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 9: break;
          case 2: 
            { return FRESH_LINE;
            }
          case 10: break;
          case 3: 
            { return TokenType.WHITE_SPACE;
            }
          case 11: break;
          case 4: 
            { return IDENTIFIER;
            }
          case 12: break;
          case 5: 
            { return EQ;
            }
          case 13: break;
          case 6: 
            { return OPERATOR;
            }
          case 14: break;
          case 7: 
            { return COMMENT;
            }
          case 15: break;
          case 8: 
            { return NUMBER_LITERAL;
            }
          case 16: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}