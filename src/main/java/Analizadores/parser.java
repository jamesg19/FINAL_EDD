
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\004\000\002\003\004\000\002\003\004" +
    "\000\002\003\004\000\002\003\004\000\002\003\004\000" +
    "\002\003\004\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\005\017" +
    "\000\002\004\023\000\002\004\017\000\002\006\017\000" +
    "\002\007\011\000\002\010\015\000\002\011\017\000\002" +
    "\012\027\000\002\013\015\000\002\014\003\000\002\014" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\022\004\023\006\022\007\024\010\020\011" +
    "\005\012\025\013\007\014\013\001\002\000\024\002\ufff5" +
    "\004\023\006\022\007\024\010\020\011\005\012\025\013" +
    "\007\014\013\001\002\000\004\020\173\001\002\000\024" +
    "\002\ufff7\004\023\006\022\007\024\010\020\011\005\012" +
    "\025\013\007\014\013\001\002\000\004\020\146\001\002" +
    "\000\024\002\ufff2\004\023\006\022\007\024\010\020\011" +
    "\005\012\025\013\007\014\013\001\002\000\024\002\ufff0" +
    "\004\023\006\022\007\024\010\020\011\005\012\025\013" +
    "\007\014\013\001\002\000\004\002\000\001\002\000\004" +
    "\020\132\001\002\000\004\002\131\001\002\000\024\002" +
    "\ufff4\004\023\006\022\007\024\010\020\011\005\012\025" +
    "\013\007\014\013\001\002\000\024\002\ufff3\004\023\006" +
    "\022\007\024\010\020\011\005\012\025\013\007\014\013" +
    "\001\002\000\024\002\ufff1\004\023\006\022\007\024\010" +
    "\020\011\005\012\025\013\007\014\013\001\002\000\004" +
    "\020\120\001\002\000\024\002\ufff6\004\023\006\022\007" +
    "\024\010\020\011\005\012\025\013\007\014\013\001\002" +
    "\000\004\020\072\001\002\000\004\020\056\001\002\000" +
    "\004\020\042\001\002\000\004\020\026\001\002\000\004" +
    "\005\027\001\002\000\004\016\030\001\002\000\004\015" +
    "\031\001\002\000\004\022\032\001\002\000\004\015\033" +
    "\001\002\000\004\016\034\001\002\000\004\005\035\001" +
    "\002\000\004\016\036\001\002\000\004\005\037\001\002" +
    "\000\004\021\040\001\002\000\004\017\041\001\002\000" +
    "\024\002\uffe9\004\uffe9\006\uffe9\007\uffe9\010\uffe9\011\uffe9" +
    "\012\uffe9\013\uffe9\014\uffe9\001\002\000\004\005\043\001" +
    "\002\000\004\016\044\001\002\000\004\015\045\001\002" +
    "\000\004\022\046\001\002\000\004\015\047\001\002\000" +
    "\004\016\050\001\002\000\004\015\051\001\002\000\004" +
    "\022\052\001\002\000\004\015\053\001\002\000\004\021" +
    "\054\001\002\000\004\017\055\001\002\000\024\002\uffec" +
    "\004\uffec\006\uffec\007\uffec\010\uffec\011\uffec\012\uffec\013" +
    "\uffec\014\uffec\001\002\000\004\005\057\001\002\000\004" +
    "\016\060\001\002\000\004\015\061\001\002\000\004\022" +
    "\062\001\002\000\004\015\063\001\002\000\004\016\064" +
    "\001\002\000\004\015\065\001\002\000\004\022\066\001" +
    "\002\000\004\015\067\001\002\000\004\021\070\001\002" +
    "\000\004\017\071\001\002\000\024\002\uffef\004\uffef\006" +
    "\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013\uffef\014\uffef" +
    "\001\002\000\004\005\073\001\002\000\004\016\074\001" +
    "\002\000\004\022\075\001\002\000\004\016\076\001\002" +
    "\000\004\015\077\001\002\000\004\022\100\001\002\000" +
    "\004\015\101\001\002\000\004\016\102\001\002\000\010" +
    "\004\105\015\104\023\103\001\002\000\004\021\uffe5\001" +
    "\002\000\004\022\111\001\002\000\004\021\uffe6\001\002" +
    "\000\004\021\107\001\002\000\004\017\110\001\002\000" +
    "\024\002\uffed\004\uffed\006\uffed\007\uffed\010\uffed\011\uffed" +
    "\012\uffed\013\uffed\014\uffed\001\002\000\004\015\112\001" +
    "\002\000\004\016\113\001\002\000\006\004\105\023\103" +
    "\001\002\000\004\021\115\001\002\000\004\017\116\001" +
    "\002\000\024\002\uffee\004\uffee\006\uffee\007\uffee\010\uffee" +
    "\011\uffee\012\uffee\013\uffee\014\uffee\001\002\000\004\002" +
    "\ufffe\001\002\000\004\015\121\001\002\000\004\022\122" +
    "\001\002\000\004\015\123\001\002\000\004\021\124\001" +
    "\002\000\004\017\125\001\002\000\024\002\uffeb\004\uffeb" +
    "\006\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\014" +
    "\uffeb\001\002\000\004\002\ufff9\001\002\000\004\002\ufffb" +
    "\001\002\000\004\002\ufffc\001\002\000\004\002\001\001" +
    "\002\000\004\005\133\001\002\000\004\016\134\001\002" +
    "\000\004\005\135\001\002\000\004\016\136\001\002\000" +
    "\004\005\137\001\002\000\004\016\140\001\002\000\004" +
    "\005\141\001\002\000\004\021\142\001\002\000\004\017" +
    "\143\001\002\000\024\002\uffe7\004\uffe7\006\uffe7\007\uffe7" +
    "\010\uffe7\011\uffe7\012\uffe7\013\uffe7\014\uffe7\001\002\000" +
    "\004\002\ufff8\001\002\000\004\002\ufffa\001\002\000\004" +
    "\005\147\001\002\000\004\016\150\001\002\000\004\015" +
    "\151\001\002\000\004\022\152\001\002\000\004\015\153" +
    "\001\002\000\004\016\154\001\002\000\004\015\155\001" +
    "\002\000\004\022\156\001\002\000\004\015\157\001\002" +
    "\000\004\016\160\001\002\000\004\005\161\001\002\000" +
    "\004\016\162\001\002\000\004\005\163\001\002\000\004" +
    "\016\164\001\002\000\004\022\165\001\002\000\004\016" +
    "\166\001\002\000\004\005\167\001\002\000\004\021\170" +
    "\001\002\000\004\017\171\001\002\000\024\002\uffe8\004" +
    "\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8" +
    "\014\uffe8\001\002\000\004\002\uffff\001\002\000\004\015" +
    "\174\001\002\000\004\022\175\001\002\000\004\015\176" +
    "\001\002\000\004\016\177\001\002\000\004\005\200\001" +
    "\002\000\004\016\201\001\002\000\004\005\202\001\002" +
    "\000\004\021\203\001\002\000\004\017\204\001\002\000" +
    "\024\002\uffea\004\uffea\006\uffea\007\uffea\010\uffea\011\uffea" +
    "\012\uffea\013\uffea\014\uffea\001\002\000\004\002\ufffd\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\026\002\013\003\011\004\020\005\005\006" +
    "\003\007\014\010\015\011\007\012\016\013\010\001\001" +
    "\000\024\003\204\004\020\005\005\006\003\007\014\010" +
    "\015\011\007\012\016\013\010\001\001\000\002\001\001" +
    "\000\024\003\171\004\020\005\005\006\003\007\014\010" +
    "\015\011\007\012\016\013\010\001\001\000\002\001\001" +
    "\000\024\003\144\004\020\005\005\006\003\007\014\010" +
    "\015\011\007\012\016\013\010\001\001\000\024\003\143" +
    "\004\020\005\005\006\003\007\014\010\015\011\007\012" +
    "\016\013\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\024\003\127\004\020\005\005\006" +
    "\003\007\014\010\015\011\007\012\016\013\010\001\001" +
    "\000\024\003\126\004\020\005\005\006\003\007\014\010" +
    "\015\011\007\012\016\013\010\001\001\000\024\003\125" +
    "\004\020\005\005\006\003\007\014\010\015\011\007\012" +
    "\016\013\010\001\001\000\002\001\001\000\024\003\116" +
    "\004\020\005\005\006\003\007\014\010\015\011\007\012" +
    "\016\013\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\014\105\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\113\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //constructor
	public parser( LexerCup lex){
	 super(lex);
	}
	public void report_error(String message, Object info){
		System.out.println("\nREPORT ERROR");
	}
	public void report_fatal_error(String message, Object info){
		System.out.println("\nREPORT FATAL");
	}
	public void syntax_error(Symbol curl_token){
		

		System.out.println("\nSE ESPERABA: "+symbl_name_from_id(expected_token_ids().get(0)));
        System.out.println("syntaxerr: " + symbl_name_from_id(cur_token.sym) +" Columna: "+cur_token.right+" Linea: "+cur_token.left+" Valor:"+cur_token.value);
	}
	protected int error_sync_size() {
        return 1;
    }




/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= estado_inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // estado_inicial ::= parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("estado_inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // parametros ::= estudiante parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // parametros ::= usuario parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // parametros ::= catedratico parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // parametros ::= edificio parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // parametros ::= salon parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // parametros ::= curso parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // parametros ::= horario parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parametros ::= asignar parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parametros ::= estudiante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parametros ::= usuario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // parametros ::= catedratico 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // parametros ::= edificio 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // parametros ::= salon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // parametros ::= curso 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // parametros ::= horario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // parametros ::= asignar 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // estudiante ::= ESTUDIANTE PARENTESIS_ABRE NUMEROS COMA COMILLA TEXTO COMILLA COMA COMILLA TEXTO COMILLA PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("estudiante",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // usuario ::= USUARIO PARENTESIS_ABRE NUMEROS COMA TEXTO COMA COMILLA TEXTO COMILLA COMA COMILLA TEXTO COMILLA COMA student_colab PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object r = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("usuario",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // usuario ::= USUARIO PARENTESIS_ABRE NUMEROS COMA TEXTO COMA COMILLA TEXTO COMILLA COMA student_colab PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object r = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("usuario",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // catedratico ::= CATEDRATICO PARENTESIS_ABRE NUMEROS COMA COMILLA TEXTO COMILLA COMA COMILLA TEXTO COMILLA PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catedratico",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // edificio ::= EDIFICIO PARENTESIS_ABRE COMILLA TEXTO COMILLA PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("edificio",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // salon ::= SALON PARENTESIS_ABRE COMILLA TEXTO COMILLA COMA NUMEROS COMA NUMEROS PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("salon",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // curso ::= CURSO PARENTESIS_ABRE NUMEROS COMA COMILLA TEXTO COMILLA COMA NUMEROS COMA NUMEROS PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("curso",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // horario ::= HORARIO PARENTESIS_ABRE NUMEROS COMA COMILLA TEXTO COMILLA COMA COMILLA TEXTO COMILLA COMA NUMEROS COMA NUMEROS COMA TEXTO COMA NUMEROS PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("horario",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-20)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // asignar ::= ASIGNAR PARENTESIS_ABRE NUMEROS COMA NUMEROS COMA NUMEROS COMA NUMEROS PARENTESIS_CIERRA PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("asignar",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // student_colab ::= ESTUDIANTE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("student_colab",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // student_colab ::= COLABORADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("student_colab",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
