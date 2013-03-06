// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-03-05 18:58:55

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
   import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.app.Window;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", 
		"Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "Def", "Digit", "Divide", 
		"Do", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", "Expand", 
		"FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", "Group", "HEIGHT_CONSTANT", 
		"Hide", "ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LAdd", 
		"LIST", "LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Modulus", 
		"Move", "Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", "Null", 
		"Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", "Point", 
		"Polygon", "Pow", "Print", "Println", "QMark", "Quad", "RETURN", "Rect", 
		"Repeat", "Return", "Rotate", "SPECIAL", "STATEMENTS", "Scale", "Sine", 
		"Size", "Space", "String", "Stroke", "Subtract", "TERNARY", "To", "Triangle", 
		"UNARY_MIN", "WIDTH_CONSTANT", "Weight", "While", "'&&'", "';'", "'|'", 
		"'||'"
	};
	public static final int EOF=-1;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int COLOR_CONSTANT=13;
	public static final int CParen=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Copy=17;
	public static final int Cosine=18;
	public static final int Curve=19;
	public static final int Def=20;
	public static final int Digit=21;
	public static final int Divide=22;
	public static final int Do=23;
	public static final int EXP=24;
	public static final int EXP_LIST=25;
	public static final int Ellipse=26;
	public static final int Else=27;
	public static final int End=28;
	public static final int Equals=29;
	public static final int Excl=30;
	public static final int Expand=31;
	public static final int FUNCTION=32;
	public static final int FUNC_CALL=33;
	public static final int Fill=34;
	public static final int For=35;
	public static final int GT=36;
	public static final int GTEquals=37;
	public static final int Group=38;
	public static final int HEIGHT_CONSTANT=39;
	public static final int Hide=40;
	public static final int ID_LIST=41;
	public static final int IF=42;
	public static final int INDEXES=43;
	public static final int Identifier=44;
	public static final int If=45;
	public static final int In=46;
	public static final int Int=47;
	public static final int LAdd=48;
	public static final int LIST=49;
	public static final int LOOKUP=50;
	public static final int LRemove=51;
	public static final int LShape=52;
	public static final int LT=53;
	public static final int LTEquals=54;
	public static final int Line=55;
	public static final int Modulus=56;
	public static final int Move=57;
	public static final int Multiply=58;
	public static final int NEGATE=59;
	public static final int NEquals=60;
	public static final int NoFill=61;
	public static final int NoStroke=62;
	public static final int Null=63;
	public static final int Number=64;
	public static final int OBrace=65;
	public static final int OBracket=66;
	public static final int OParen=67;
	public static final int Or=68;
	public static final int PI_CONSTANT=69;
	public static final int Point=70;
	public static final int Polygon=71;
	public static final int Pow=72;
	public static final int Print=73;
	public static final int Println=74;
	public static final int QMark=75;
	public static final int Quad=76;
	public static final int RETURN=77;
	public static final int Rect=78;
	public static final int Repeat=79;
	public static final int Return=80;
	public static final int Rotate=81;
	public static final int SPECIAL=82;
	public static final int STATEMENTS=83;
	public static final int Scale=84;
	public static final int Sine=85;
	public static final int Size=86;
	public static final int Space=87;
	public static final int String=88;
	public static final int Stroke=89;
	public static final int Subtract=90;
	public static final int TERNARY=91;
	public static final int To=92;
	public static final int Triangle=93;
	public static final int UNARY_MIN=94;
	public static final int WIDTH_CONSTANT=95;
	public static final int Weight=96;
	public static final int While=97;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PogoTreeWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PogoTreeWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g"; }


	 
	  Scope currentScope = null;
	  public Map<String, FunctionType> functions = null;
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns) {
	    this(nodes, null, fns);
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	  }



	// $ANTLR start "walk"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:37:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:38:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:38:6: block
			{
			pushFollow(FOLLOW_block_in_walk64);
			block1=block();
			state._fsp--;

			node = block1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "walk"



	// $ANTLR start "block"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:41:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final BlockNode block() throws RecognitionException {
		BlockNode node = null;


		DCNode statement2 =null;
		DCNode expression3 =null;


			//System.out.println(" new block called");

		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope local = new Scope(currentScope);
		  currentScope = local;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:28: statement
						{
						pushFollow(FOLLOW_statement_in_block101);
						statement2=statement();
						state._fsp--;

						bn.addStatement(statement2);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input,RETURN,FOLLOW_RETURN_in_block109); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||(LA2_0 >= UNARY_MIN && LA2_0 <= WIDTH_CONSTANT)||LA2_0==98||LA2_0==101) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:54:87: expression
						{
						pushFollow(FOLLOW_expression_in_block112);
						expression3=expression();
						state._fsp--;

						bn.addReturn(expression3);
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			}


			  currentScope = currentScope.parent();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:58:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode forStatement7 =null;
		DCNode whileStatement8 =null;
		DCNode repeatStatement9 =null;


			//System.out.println(" statement called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
			int alt3=6;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			case For:
				{
				alt3=4;
				}
				break;
			case While:
				{
				alt3=5;
				}
				break;
			case Repeat:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:63:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:64:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:66:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:67:5: repeatStatement[false]
					{
					pushFollow(FOLLOW_repeatStatement_in_statement196);
					repeatStatement9=repeatStatement(false);
					state._fsp--;

					node = repeatStatement9;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignment"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:70:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_assignment225);
			expression12=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier10!=null?Identifier10.getText():null), indexes11, expression12, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "functionCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:74:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier13=null;
		CommonTree FUNC_CALL20=null;
		CommonTree FUNC_CALL22=null;
		java.util.List<DCNode> exprList14 =null;
		DCNode expression15 =null;
		DCNode expression16 =null;
		DCNode expression17 =null;
		DCNode expression18 =null;
		java.util.List<DCNode> exprList19 =null;
		java.util.List<DCNode> exprList21 =null;
		DCNode primitiveCall23 =null;
		DCNode transformCall24 =null;
		DCNode mathCall25 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
			int alt9=10;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FUNC_CALL) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt9=1;
						}
						break;
					case Println:
						{
						alt9=2;
						}
						break;
					case Print:
						{
						alt9=3;
						}
						break;
					case Assert:
						{
						alt9=4;
						}
						break;
					case Size:
						{
						alt9=5;
						}
						break;
					case LAdd:
						{
						alt9=6;
						}
						break;
					case LRemove:
						{
						alt9=7;
						}
						break;
					case Curve:
					case Ellipse:
					case LShape:
					case Line:
					case Polygon:
					case Rect:
						{
						alt9=8;
						}
						break;
					case Copy:
					case Expand:
					case Fill:
					case Group:
					case Hide:
					case Move:
					case NoFill:
					case NoStroke:
					case Rotate:
					case Stroke:
					case Weight:
						{
						alt9=9;
						}
						break;
					case Cosine:
					case Sine:
						{
						alt9=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall251); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall253); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall255);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall267); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall269); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||(LA6_0 >= UNARY_MIN && LA6_0 <= WIDTH_CONSTANT)||LA6_0==98||LA6_0==101) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall271);
							expression15=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression15);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:80:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall284); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall286); 
					pushFollow(FOLLOW_expression_in_functionCall288);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall303); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall305); 
					pushFollow(FOLLOW_expression_in_functionCall307);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression17);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall321); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall323); 
					pushFollow(FOLLOW_expression_in_functionCall325);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression18);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:83:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall341); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall343); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:83:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:83:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall345);
							exprList19=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList19,FUNC_CALL20.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall358); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall360); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall362);
							exprList21=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList21,FUNC_CALL22.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:85:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall373);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23;
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall382);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24;
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:87:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall391);
					mathCall25=mathCall();
					state._fsp--;

					node= mathCall25;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "primitiveCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL27=null;
		CommonTree FUNC_CALL29=null;
		CommonTree FUNC_CALL31=null;
		CommonTree FUNC_CALL33=null;
		CommonTree FUNC_CALL35=null;
		CommonTree FUNC_CALL37=null;
		java.util.List<DCNode> exprList26 =null;
		java.util.List<DCNode> exprList28 =null;
		java.util.List<DCNode> exprList30 =null;
		java.util.List<DCNode> exprList32 =null;
		java.util.List<DCNode> exprList34 =null;
		java.util.List<DCNode> exprList36 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) )
			int alt16=6;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FUNC_CALL) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt16=1;
						}
						break;
					case Line:
						{
						alt16=2;
						}
						break;
					case Rect:
						{
						alt16=3;
						}
						break;
					case Curve:
						{
						alt16=4;
						}
						break;
					case Polygon:
						{
						alt16=5;
						}
						break;
					case LShape:
						{
						alt16=6;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall418); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall420); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall422);
							exprList26=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList26,FUNC_CALL27.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall434); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall436); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall438);
							exprList28=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList28,FUNC_CALL29.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall451); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall453); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall455);
							exprList30=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList30,FUNC_CALL31.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall469); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall471); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall473);
							exprList32=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList32,FUNC_CALL33.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall487); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall489); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall491);
							exprList34=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList34,FUNC_CALL35.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:6: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall503); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall505); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:25: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall507);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList36,FUNC_CALL37.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "primitiveCall"



	// $ANTLR start "transformCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:100:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL39=null;
		CommonTree FUNC_CALL41=null;
		CommonTree FUNC_CALL43=null;
		CommonTree FUNC_CALL45=null;
		CommonTree FUNC_CALL47=null;
		CommonTree FUNC_CALL49=null;
		CommonTree FUNC_CALL51=null;
		CommonTree FUNC_CALL53=null;
		CommonTree FUNC_CALL55=null;
		CommonTree FUNC_CALL57=null;
		CommonTree FUNC_CALL59=null;
		java.util.List<DCNode> exprList38 =null;
		DCNode expression40 =null;
		java.util.List<DCNode> exprList42 =null;
		java.util.List<DCNode> exprList44 =null;
		java.util.List<DCNode> exprList46 =null;
		DCNode expression48 =null;
		DCNode expression50 =null;
		java.util.List<DCNode> exprList52 =null;
		DCNode expression54 =null;
		java.util.List<DCNode> exprList56 =null;
		DCNode expression58 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) )
			int alt23=11;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==FUNC_CALL) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt23=1;
						}
						break;
					case Copy:
						{
						alt23=2;
						}
						break;
					case Rotate:
						{
						alt23=3;
						}
						break;
					case Fill:
						{
						alt23=4;
						}
						break;
					case Stroke:
						{
						alt23=5;
						}
						break;
					case NoFill:
						{
						alt23=6;
						}
						break;
					case NoStroke:
						{
						alt23=7;
						}
						break;
					case Weight:
						{
						alt23=8;
						}
						break;
					case Hide:
						{
						alt23=9;
						}
						break;
					case Group:
						{
						alt23=10;
						}
						break;
					case Expand:
						{
						alt23=11;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 23, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall534); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall536); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:22: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall538);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList38,FUNC_CALL39.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:102:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall551); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall553); 
					pushFollow(FOLLOW_expression_in_transformCall555);
					expression40=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression40,FUNC_CALL41.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall566); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall568); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:24: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall570);
							exprList42=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList42,FUNC_CALL43.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall581); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall583); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:22: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall585);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList44,FUNC_CALL45.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall598); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall600); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:24: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall602);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList46,FUNC_CALL47.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall613); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall615); 
					pushFollow(FOLLOW_expression_in_transformCall617);
					expression48=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression48,FUNC_CALL49.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall627); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall629); 
					pushFollow(FOLLOW_expression_in_transformCall631);
					expression50=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression50,FUNC_CALL51.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall641); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall643); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:24: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall645);
							exprList52=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList52,FUNC_CALL53.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall656); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall658); 
					pushFollow(FOLLOW_expression_in_transformCall660);
					expression54=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression54,FUNC_CALL55.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall670); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall672); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:23: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall674);
							exprList56=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList56,FUNC_CALL57.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall685); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall687); 
					pushFollow(FOLLOW_expression_in_transformCall689);
					expression58=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression58,FUNC_CALL59.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "transformCall"



	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL61=null;
		CommonTree FUNC_CALL63=null;
		DCNode expression60 =null;
		DCNode expression62 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==FUNC_CALL) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==DOWN) ) {
					int LA24_2 = input.LA(3);
					if ( (LA24_2==Cosine) ) {
						alt24=1;
					}
					else if ( (LA24_2==Sine) ) {
						alt24=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 24, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall716); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall718); 
					pushFollow(FOLLOW_expression_in_mathCall720);
					expression60=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression60,FUNC_CALL61.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall730); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall732); 
					pushFollow(FOLLOW_expression_in_mathCall734);
					expression62=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression62,FUNC_CALL63.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "mathCall"



	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement768); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement770);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:26: ( elseIfStat[ifNode] )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==EXP) ) {
					int LA25_1 = input.LA(2);
					if ( (LA25_1==DOWN) ) {
						int LA25_3 = input.LA(3);
						if ( (LA25_3==Add||LA25_3==Bool||LA25_3==COLOR_CONSTANT||LA25_3==Divide||LA25_3==Equals||(LA25_3 >= GT && LA25_3 <= GTEquals)||LA25_3==HEIGHT_CONSTANT||LA25_3==In||LA25_3==LOOKUP||(LA25_3 >= LT && LA25_3 <= LTEquals)||LA25_3==Modulus||(LA25_3 >= Multiply && LA25_3 <= NEquals)||(LA25_3 >= Null && LA25_3 <= Number)||LA25_3==PI_CONSTANT||LA25_3==Pow||(LA25_3 >= Subtract && LA25_3 <= TERNARY)||(LA25_3 >= UNARY_MIN && LA25_3 <= WIDTH_CONSTANT)||LA25_3==98||LA25_3==101) ) {
							alt25=1;
						}

					}

				}

				switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement774);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:48: ( elseStat[ifNode] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EXP) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement780);
					elseStat(ifNode);
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

			node = ifNode;
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "ifStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression64 =null;
		BlockNode block65 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat800); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat802);
			expression64=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat804);
			block65=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression64, block65);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStat"



	// $ANTLR start "elseIfStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression66 =null;
		BlockNode block67 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat823); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat825);
			expression66=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat827);
			block67=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression66, block67);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseIfStat"



	// $ANTLR start "elseStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block68 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat846); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat848);
			block68=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block68);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseStat"



	// $ANTLR start "forStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier69=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block70 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement873); 
			match(input, Token.DOWN, null); 
			Identifier69=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement875); 
			pushFollow(FOLLOW_expression_in_forStatement879);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement883);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement885);
			block70=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier69!=null?Identifier69.getText():null), a, b, block70, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "forStatement"



	// $ANTLR start "repeatStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier71=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block72 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement909); 
			match(input, Token.DOWN, null); 
			Identifier71=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement911); 
			pushFollow(FOLLOW_expression_in_repeatStatement915);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement919);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:51: (c= expression )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Add||LA27_0==Bool||LA27_0==COLOR_CONSTANT||LA27_0==Divide||LA27_0==Equals||(LA27_0 >= GT && LA27_0 <= GTEquals)||LA27_0==HEIGHT_CONSTANT||LA27_0==In||LA27_0==LOOKUP||(LA27_0 >= LT && LA27_0 <= LTEquals)||LA27_0==Modulus||(LA27_0 >= Multiply && LA27_0 <= NEquals)||(LA27_0 >= Null && LA27_0 <= Number)||LA27_0==PI_CONSTANT||LA27_0==Pow||(LA27_0 >= Subtract && LA27_0 <= TERNARY)||(LA27_0 >= UNARY_MIN && LA27_0 <= WIDTH_CONSTANT)||LA27_0==98||LA27_0==101) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement924);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement928);
			block72=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier71!=null?Identifier71.getText():null), a, b, c, block72, currentScope, lookup);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "repeatStatement"



	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression73 =null;
		BlockNode block74 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement951); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement953);
			expression73=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement955);
			block74=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression73, block74);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "idList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier75=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList982); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:16: ( Identifier )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==Identifier) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:17: Identifier
					{
					Identifier75=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList985); 
					i.add((Identifier75!=null?Identifier75.getText():null));
					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression76 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1015); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:17: ( expression )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==Add||LA29_0==Bool||LA29_0==COLOR_CONSTANT||LA29_0==Divide||LA29_0==Equals||(LA29_0 >= GT && LA29_0 <= GTEquals)||LA29_0==HEIGHT_CONSTANT||LA29_0==In||LA29_0==LOOKUP||(LA29_0 >= LT && LA29_0 <= LTEquals)||LA29_0==Modulus||(LA29_0 >= Multiply && LA29_0 <= NEquals)||(LA29_0 >= Null && LA29_0 <= Number)||LA29_0==PI_CONSTANT||LA29_0==Pow||(LA29_0 >= Subtract && LA29_0 <= TERNARY)||(LA29_0 >= UNARY_MIN && LA29_0 <= WIDTH_CONSTANT)||LA29_0==98||LA29_0==101) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1018);
					expression76=expression();
					state._fsp--;

					e.add(expression76);
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number77=null;
		CommonTree Bool78=null;
		CommonTree COLOR_CONSTANT80=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup79 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt30=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt30=1;
				}
				break;
			case In:
				{
				alt30=2;
				}
				break;
			case 101:
				{
				alt30=3;
				}
				break;
			case 98:
				{
				alt30=4;
				}
				break;
			case Equals:
				{
				alt30=5;
				}
				break;
			case NEquals:
				{
				alt30=6;
				}
				break;
			case GTEquals:
				{
				alt30=7;
				}
				break;
			case LTEquals:
				{
				alt30=8;
				}
				break;
			case GT:
				{
				alt30=9;
				}
				break;
			case LT:
				{
				alt30=10;
				}
				break;
			case Add:
				{
				alt30=11;
				}
				break;
			case Subtract:
				{
				alt30=12;
				}
				break;
			case Multiply:
				{
				alt30=13;
				}
				break;
			case Divide:
				{
				alt30=14;
				}
				break;
			case Modulus:
				{
				alt30=15;
				}
				break;
			case Pow:
				{
				alt30=16;
				}
				break;
			case UNARY_MIN:
				{
				alt30=17;
				}
				break;
			case NEGATE:
				{
				alt30=18;
				}
				break;
			case Number:
				{
				alt30=19;
				}
				break;
			case Bool:
				{
				alt30=20;
				}
				break;
			case Null:
				{
				alt30=21;
				}
				break;
			case LOOKUP:
				{
				alt30=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt30=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt30=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt30=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt30=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1043); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1047);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1051);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1055);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1066); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1070);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1074);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:6: ^( '||' a= expression b= expression )
					{
					match(input,101,FOLLOW_101_in_expression1103); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1107);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1111);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:6: ^( '&&' a= expression b= expression )
					{
					match(input,98,FOLLOW_98_in_expression1138); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1142);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1146);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1173); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1177);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1181);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1208); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1212);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1216);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1243); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1247);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1251);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1278); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1282);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1286);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1313); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1317);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1321);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1349); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1353);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1357);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1385); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1389);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1393);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1421); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1425);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1429);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1457); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1461);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1465);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1493); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1497);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1501);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1529); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1533);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1537);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1565); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1569);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1573);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1601); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1605);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1640); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1644);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:6: Number
					{
					Number77=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1681); 
					node = new AtomNode(Double.parseDouble((Number77!=null?Number77.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:6: Bool
					{
					Bool78=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1733); 
					node = new AtomNode(Boolean.parseBoolean((Bool78!=null?Bool78.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1787); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1841);
					lookup79=lookup();
					state._fsp--;

					node = lookup79;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT80=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression1893); 
					node = new AtomNode((COLOR_CONSTANT80!=null?COLOR_CONSTANT80.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression1912); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression1958); 
					node = new AtomNode(Window.canvas.width);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2003); 
					node = new AtomNode(Window.canvas.height);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "list"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList81 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2062); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:13: ( exprList )?
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==EXP_LIST) ) {
					alt31=1;
				}
				switch (alt31) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2064);
						exprList81=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList81);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "list"



	// $ANTLR start "lookup"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:1: lookup returns [DCNode node] : ( ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) | ^( LOOKUP forStatement (i= indexes )? ) | ^( LOOKUP whileStatement (i= indexes )? ) | ^( LOOKUP repeatStatement[true] (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier85=null;
		CommonTree String86=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall82 =null;
		DCNode list83 =null;
		DCNode expression84 =null;
		DCNode forStatement87 =null;
		DCNode whileStatement88 =null;
		DCNode repeatStatement89 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:3: ( ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) | ^( LOOKUP forStatement (i= indexes )? ) | ^( LOOKUP whileStatement (i= indexes )? ) | ^( LOOKUP repeatStatement[true] (i= indexes )? ) )
			int alt40=8;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LOOKUP) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt40=4;
						}
						break;
					case String:
						{
						alt40=5;
						}
						break;
					case FUNC_CALL:
						{
						alt40=1;
						}
						break;
					case LIST:
						{
						alt40=2;
						}
						break;
					case Add:
					case Bool:
					case COLOR_CONSTANT:
					case Divide:
					case Equals:
					case GT:
					case GTEquals:
					case HEIGHT_CONSTANT:
					case In:
					case LOOKUP:
					case LT:
					case LTEquals:
					case Modulus:
					case Multiply:
					case NEGATE:
					case NEquals:
					case Null:
					case Number:
					case PI_CONSTANT:
					case Pow:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case WIDTH_CONSTANT:
					case 98:
					case 101:
						{
						alt40=3;
						}
						break;
					case For:
						{
						alt40=6;
						}
						break;
					case While:
						{
						alt40=7;
						}
						break;
					case Repeat:
						{
						alt40=8;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:6: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2087); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2089);
					functionCall82=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:29: (i= indexes )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==INDEXES) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:29: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2093);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall82, i) : functionCall82;
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2105); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2107);
					list83=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:21: (i= indexes )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==INDEXES) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2111);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list83, i) : list83;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2131); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2133);
					expression84=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:27: (i= indexes )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==INDEXES) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2137);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression84, i) : expression84;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2151); 
					match(input, Token.DOWN, null); 
					Identifier85=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2153); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:27: (i= indexes )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==INDEXES) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2157);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier85!=null?Identifier85.getText():null), currentScope), i) : new IdentifierNode((Identifier85!=null?Identifier85.getText():null), currentScope);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2171); 
					match(input, Token.DOWN, null); 
					String86=(CommonTree)match(input,String,FOLLOW_String_in_lookup2173); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:23: (i= indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==INDEXES) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2177);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String86!=null?String86.getText():null)), i) : new AtomNode((String86!=null?String86.getText():null));
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:6: ^( LOOKUP forStatement (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2195); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_forStatement_in_lookup2197);
					forStatement87=forStatement();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:29: (i= indexes )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==INDEXES) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:29: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2201);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(forStatement87, i) : forStatement87;
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:6: ^( LOOKUP whileStatement (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2215); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_whileStatement_in_lookup2217);
					whileStatement88=whileStatement();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:31: (i= indexes )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==INDEXES) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:31: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2221);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(whileStatement88, i) : whileStatement88;
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:6: ^( LOOKUP repeatStatement[true] (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2235); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_repeatStatement_in_lookup2237);
					repeatStatement89=repeatStatement(true);
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:38: (i= indexes )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==INDEXES) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:38: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2242);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(repeatStatement89, i) : repeatStatement89;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "lookup"



	// $ANTLR start "indexes"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression90 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2278); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:16: ( expression )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==Add||LA41_0==Bool||LA41_0==COLOR_CONSTANT||LA41_0==Divide||LA41_0==Equals||(LA41_0 >= GT && LA41_0 <= GTEquals)||LA41_0==HEIGHT_CONSTANT||LA41_0==In||LA41_0==LOOKUP||(LA41_0 >= LT && LA41_0 <= LTEquals)||LA41_0==Modulus||(LA41_0 >= Multiply && LA41_0 <= NEquals)||(LA41_0 >= Null && LA41_0 <= Number)||LA41_0==PI_CONSTANT||LA41_0==Pow||(LA41_0 >= Subtract && LA41_0 <= TERNARY)||(LA41_0 >= UNARY_MIN && LA41_0 <= WIDTH_CONSTANT)||LA41_0==98||LA41_0==101) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2281);
					expression90=expression();
					state._fsp--;

					e.add(expression90);
					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					EarlyExitException eee = new EarlyExitException(41, input);
					throw eee;
				}
				cnt41++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "indexes"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_walk64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0000040A00000018L,0x0000000200008000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x9D6448B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall253 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall255 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall269 = new BitSet(new long[]{0x9D6440B020402428L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_functionCall271 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall286 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_functionCall288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall303 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall305 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_functionCall307 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall323 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_functionCall325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall343 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall360 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall420 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall436 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall453 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall471 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall489 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall505 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall536 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall553 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_transformCall555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall566 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall568 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall583 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall600 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall613 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall615 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_transformCall617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall629 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_transformCall631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall643 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall658 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_transformCall660 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall672 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall687 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_transformCall689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall718 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_mathCall720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall732 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_mathCall734 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement770 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement774 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat802 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStat804 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat825 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_elseIfStat827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat848 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement875 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_forStatement879 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_forStatement883 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement911 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_repeatStatement915 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_repeatStatement919 = new BitSet(new long[]{0x9D6440B020402620L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_repeatStatement924 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_repeatStatement928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement953 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement955 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList985 = new BitSet(new long[]{0x0000100000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1018 = new BitSet(new long[]{0x9D6440B020402428L,0x00000024CC000121L});
	public static final BitSet FOLLOW_TERNARY_in_expression1043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1047 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1051 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1055 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1066 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1070 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1074 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_101_in_expression1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1107 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_expression1138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1142 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1146 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1177 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1181 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1212 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1247 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1282 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1313 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1317 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1353 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1389 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1425 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1461 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1465 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1497 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1533 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1569 = new BitSet(new long[]{0x9D6440B020402420L,0x00000024CC000121L});
	public static final BitSet FOLLOW_expression_in_expression1573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1605 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2064 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2087 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2089 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2093 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2107 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2131 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2133 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2153 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2173 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2177 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forStatement_in_lookup2197 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2201 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2215 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_whileStatement_in_lookup2217 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_repeatStatement_in_lookup2237 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2281 = new BitSet(new long[]{0x9D6440B020402428L,0x00000024CC000121L});
}
