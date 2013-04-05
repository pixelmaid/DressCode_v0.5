// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-04-04 22:21:05

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.properties.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import com.pixelmaid.dresscode.data.*;
  
  import java.util.Map;
  import java.util.HashMap;



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
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Def", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", 
		"DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", 
		"DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", 
		"Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", 
		"Group", "HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", 
		"If", "In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", "LT", 
		"LTEquals", "Line", "Merge", "Modulus", "Move", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Rect", "Repeat", "Return", "Rotate", "SPECIAL", 
		"STATEMENTS", "Scale", "Sine", "Size", "Space", "String", "Stroke", "Subtract", 
		"TERNARY", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", 
		"While", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
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
	public static final int DOT=20;
	public static final int DOTLOOKUP=21;
	public static final int DOTPROPERTY=22;
	public static final int Def=23;
	public static final int Digit=24;
	public static final int Divide=25;
	public static final int Do=26;
	public static final int Dot=27;
	public static final int DotEnd=28;
	public static final int DotFill=29;
	public static final int DotHeight=30;
	public static final int DotOrigin=31;
	public static final int DotRotation=32;
	public static final int DotStart=33;
	public static final int DotStroke=34;
	public static final int DotWeight=35;
	public static final int DotWidth=36;
	public static final int DotX=37;
	public static final int DotY=38;
	public static final int EXP=39;
	public static final int EXP_LIST=40;
	public static final int Ellipse=41;
	public static final int Else=42;
	public static final int End=43;
	public static final int Equals=44;
	public static final int Excl=45;
	public static final int Expand=46;
	public static final int FUNCTION=47;
	public static final int FUNC_CALL=48;
	public static final int Fill=49;
	public static final int For=50;
	public static final int GT=51;
	public static final int GTEquals=52;
	public static final int Group=53;
	public static final int HEIGHT_CONSTANT=54;
	public static final int Hide=55;
	public static final int ID_LIST=56;
	public static final int IF=57;
	public static final int INDEXES=58;
	public static final int Identifier=59;
	public static final int If=60;
	public static final int In=61;
	public static final int Int=62;
	public static final int LAdd=63;
	public static final int LIST=64;
	public static final int LOOKUP=65;
	public static final int LRemove=66;
	public static final int LShape=67;
	public static final int LT=68;
	public static final int LTEquals=69;
	public static final int Line=70;
	public static final int Merge=71;
	public static final int Modulus=72;
	public static final int Move=73;
	public static final int Multiply=74;
	public static final int NEGATE=75;
	public static final int NEquals=76;
	public static final int NoFill=77;
	public static final int NoStroke=78;
	public static final int Null=79;
	public static final int Number=80;
	public static final int OBrace=81;
	public static final int OBracket=82;
	public static final int OParen=83;
	public static final int Or=84;
	public static final int PI_CONSTANT=85;
	public static final int Point=86;
	public static final int Polygon=87;
	public static final int Pow=88;
	public static final int Print=89;
	public static final int Println=90;
	public static final int QMark=91;
	public static final int Quad=92;
	public static final int RETURN=93;
	public static final int Rect=94;
	public static final int Repeat=95;
	public static final int Return=96;
	public static final int Rotate=97;
	public static final int SPECIAL=98;
	public static final int STATEMENTS=99;
	public static final int Scale=100;
	public static final int Sine=101;
	public static final int Size=102;
	public static final int Space=103;
	public static final int String=104;
	public static final int Stroke=105;
	public static final int Subtract=106;
	public static final int TERNARY=107;
	public static final int To=108;
	public static final int Triangle=109;
	public static final int UNARY_MIN=110;
	public static final int WIDTH_CONSTANT=111;
	public static final int Weight=112;
	public static final int While=113;

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


	 
	 double widthParam;
	 double heightParam;
	 DrawableManager drawableManager;
	  Scope currentScope = null;
	  public Map<String, FunctionType> functions = null;
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm, double w, double h) {
	    this(nodes, null, fns,dm,w,h);
	   
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,double w,double h) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	    this.drawableManager = dm;
	    widthParam = w;
	    heightParam = h;
	  }
	  



	// $ANTLR start "walk"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:48:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:49:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:49:6: block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:52:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||(LA2_0 >= UNARY_MIN && LA2_0 <= WIDTH_CONSTANT)||LA2_0==114||LA2_0==117) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:69:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:73:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:73:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:74:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:75:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:76:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:77:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:5: repeatStatement[false]
					{
					pushFollow(FOLLOW_repeatStatement_in_statement196);
					repeatStatement9=repeatStatement(false);
					state._fsp--;

					node = repeatStatement9; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:30: indexes
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
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
					case Point:
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
					case Merge:
					case Move:
					case NoFill:
					case NoStroke:
					case Rotate:
					case Scale:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall252); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall254); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall256);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions, widthParam, heightParam); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall268); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall270); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||(LA6_0 >= UNARY_MIN && LA6_0 <= WIDTH_CONSTANT)||LA6_0==114||LA6_0==117) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall272);
							expression15=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression15); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall285); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall287); 
					pushFollow(FOLLOW_expression_in_functionCall289);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall304); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall306); 
					pushFollow(FOLLOW_expression_in_functionCall308);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall322); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall324); 
					pushFollow(FOLLOW_expression_in_functionCall326);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall342); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall344); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall346);
							exprList19=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList19,FUNC_CALL20.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall359); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall361); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall363);
							exprList21=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList21,FUNC_CALL22.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall374);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall383);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall392);
					mathCall25=mathCall();
					state._fsp--;

					node= mathCall25; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL27=null;
		CommonTree FUNC_CALL29=null;
		CommonTree FUNC_CALL31=null;
		CommonTree FUNC_CALL33=null;
		CommonTree FUNC_CALL35=null;
		CommonTree FUNC_CALL37=null;
		CommonTree FUNC_CALL39=null;
		java.util.List<DCNode> exprList26 =null;
		java.util.List<DCNode> exprList28 =null;
		java.util.List<DCNode> exprList30 =null;
		java.util.List<DCNode> exprList32 =null;
		java.util.List<DCNode> exprList34 =null;
		java.util.List<DCNode> exprList36 =null;
		java.util.List<DCNode> exprList38 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
			int alt17=7;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FUNC_CALL) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt17=1;
						}
						break;
					case Line:
						{
						alt17=2;
						}
						break;
					case Rect:
						{
						alt17=3;
						}
						break;
					case Curve:
						{
						alt17=4;
						}
						break;
					case Polygon:
						{
						alt17=5;
						}
						break;
					case LShape:
						{
						alt17=6;
						}
						break;
					case Point:
						{
						alt17=7;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
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
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall419); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall421); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall423);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall435); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall437); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall439);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall452); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall454); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall456);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall470); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall472); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall474);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall488); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall490); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall492);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall504); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall506); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:25: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall508);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList36,FUNC_CALL37.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall521); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall523); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:25: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall525);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList38,FUNC_CALL39.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL61=null;
		CommonTree FUNC_CALL63=null;
		CommonTree FUNC_CALL65=null;
		java.util.List<DCNode> exprList40 =null;
		DCNode expression42 =null;
		java.util.List<DCNode> exprList44 =null;
		java.util.List<DCNode> exprList46 =null;
		java.util.List<DCNode> exprList48 =null;
		DCNode expression50 =null;
		DCNode expression52 =null;
		java.util.List<DCNode> exprList54 =null;
		DCNode expression56 =null;
		java.util.List<DCNode> exprList58 =null;
		DCNode expression60 =null;
		DCNode expression62 =null;
		java.util.List<DCNode> exprList64 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) )
			int alt25=13;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==FUNC_CALL) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt25=1;
						}
						break;
					case Copy:
						{
						alt25=2;
						}
						break;
					case Rotate:
						{
						alt25=3;
						}
						break;
					case Fill:
						{
						alt25=4;
						}
						break;
					case Stroke:
						{
						alt25=5;
						}
						break;
					case NoFill:
						{
						alt25=6;
						}
						break;
					case NoStroke:
						{
						alt25=7;
						}
						break;
					case Weight:
						{
						alt25=8;
						}
						break;
					case Hide:
						{
						alt25=9;
						}
						break;
					case Group:
						{
						alt25=10;
						}
						break;
					case Expand:
						{
						alt25=11;
						}
						break;
					case Merge:
						{
						alt25=12;
						}
						break;
					case Scale:
						{
						alt25=13;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 2, input);
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
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall552); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall554); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:22: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall556);
							exprList40=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList40,FUNC_CALL41.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall569); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall571); 
					pushFollow(FOLLOW_expression_in_transformCall573);
					expression42=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression42,FUNC_CALL43.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall584); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall586); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:24: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall588);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList44,FUNC_CALL45.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall599); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall601); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:22: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall603);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList46,FUNC_CALL47.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall616); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall618); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:24: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall620);
							exprList48=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList48,FUNC_CALL49.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall631); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall633); 
					pushFollow(FOLLOW_expression_in_transformCall635);
					expression50=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression50,FUNC_CALL51.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall645); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall647); 
					pushFollow(FOLLOW_expression_in_transformCall649);
					expression52=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression52,FUNC_CALL53.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall659); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall661); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:24: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall663);
							exprList54=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList54,FUNC_CALL55.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall674); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall676); 
					pushFollow(FOLLOW_expression_in_transformCall678);
					expression56=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression56,FUNC_CALL57.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall688); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall690); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:23: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall692);
							exprList58=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList58,FUNC_CALL59.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall703); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall705); 
					pushFollow(FOLLOW_expression_in_transformCall707);
					expression60=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression60,FUNC_CALL61.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:6: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall717); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall719); 
					pushFollow(FOLLOW_expression_in_transformCall721);
					expression62=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression62,FUNC_CALL63.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:6: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall731); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall733); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall735);
							exprList64=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList64,FUNC_CALL65.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL67=null;
		CommonTree FUNC_CALL69=null;
		DCNode expression66 =null;
		DCNode expression68 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==FUNC_CALL) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==DOWN) ) {
					int LA26_2 = input.LA(3);
					if ( (LA26_2==Cosine) ) {
						alt26=1;
					}
					else if ( (LA26_2==Sine) ) {
						alt26=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 2, input);
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
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall763); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall765); 
					pushFollow(FOLLOW_expression_in_mathCall767);
					expression66=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression66,FUNC_CALL67.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL69=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall777); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall779); 
					pushFollow(FOLLOW_expression_in_mathCall781);
					expression68=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression68,FUNC_CALL69.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement815); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement817);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:26: ( elseIfStat[ifNode] )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==EXP) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==DOWN) ) {
						int LA27_3 = input.LA(3);
						if ( (LA27_3==Add||LA27_3==Bool||LA27_3==COLOR_CONSTANT||LA27_3==DOTPROPERTY||LA27_3==Divide||LA27_3==Equals||(LA27_3 >= GT && LA27_3 <= GTEquals)||LA27_3==HEIGHT_CONSTANT||LA27_3==In||LA27_3==LOOKUP||(LA27_3 >= LT && LA27_3 <= LTEquals)||LA27_3==Modulus||(LA27_3 >= Multiply && LA27_3 <= NEquals)||(LA27_3 >= Null && LA27_3 <= Number)||LA27_3==PI_CONSTANT||LA27_3==Pow||(LA27_3 >= Subtract && LA27_3 <= TERNARY)||(LA27_3 >= UNARY_MIN && LA27_3 <= WIDTH_CONSTANT)||LA27_3==114||LA27_3==117) ) {
							alt27=1;
						}

					}

				}

				switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement821);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:48: ( elseStat[ifNode] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EXP) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement827);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression70 =null;
		BlockNode block71 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat847); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat849);
			expression70=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat851);
			block71=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression70, block71);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression72 =null;
		BlockNode block73 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat870); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat872);
			expression72=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat874);
			block73=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression72, block73);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block74 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat893); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat895);
			block74=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block74);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier75=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block76 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement920); 
			match(input, Token.DOWN, null); 
			Identifier75=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement922); 
			pushFollow(FOLLOW_expression_in_forStatement926);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement930);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement932);
			block76=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier75!=null?Identifier75.getText():null), a, b, block76, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier77=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block78 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement956); 
			match(input, Token.DOWN, null); 
			Identifier77=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement958); 
			pushFollow(FOLLOW_expression_in_repeatStatement962);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement966);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:51: (c= expression )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Add||LA29_0==Bool||LA29_0==COLOR_CONSTANT||LA29_0==DOTPROPERTY||LA29_0==Divide||LA29_0==Equals||(LA29_0 >= GT && LA29_0 <= GTEquals)||LA29_0==HEIGHT_CONSTANT||LA29_0==In||LA29_0==LOOKUP||(LA29_0 >= LT && LA29_0 <= LTEquals)||LA29_0==Modulus||(LA29_0 >= Multiply && LA29_0 <= NEquals)||(LA29_0 >= Null && LA29_0 <= Number)||LA29_0==PI_CONSTANT||LA29_0==Pow||(LA29_0 >= Subtract && LA29_0 <= TERNARY)||(LA29_0 >= UNARY_MIN && LA29_0 <= WIDTH_CONSTANT)||LA29_0==114||LA29_0==117) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement971);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement975);
			block78=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier77!=null?Identifier77.getText():null), a, b, c, block78, currentScope, lookup);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression79 =null;
		BlockNode block80 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement998); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1000);
			expression79=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1002);
			block80=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression79, block80);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier81=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1029); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:16: ( Identifier )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Identifier) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:17: Identifier
					{
					Identifier81=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1032); 
					i.add((Identifier81!=null?Identifier81.getText():null));
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression82 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1062); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:17: ( expression )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==Add||LA31_0==Bool||LA31_0==COLOR_CONSTANT||LA31_0==DOTPROPERTY||LA31_0==Divide||LA31_0==Equals||(LA31_0 >= GT && LA31_0 <= GTEquals)||LA31_0==HEIGHT_CONSTANT||LA31_0==In||LA31_0==LOOKUP||(LA31_0 >= LT && LA31_0 <= LTEquals)||LA31_0==Modulus||(LA31_0 >= Multiply && LA31_0 <= NEquals)||(LA31_0 >= Null && LA31_0 <= Number)||LA31_0==PI_CONSTANT||LA31_0==Pow||(LA31_0 >= Subtract && LA31_0 <= TERNARY)||(LA31_0 >= UNARY_MIN && LA31_0 <= WIDTH_CONSTANT)||LA31_0==114||LA31_0==117) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1065);
					expression82=expression();
					state._fsp--;

					e.add(expression82);
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number83=null;
		CommonTree Bool84=null;
		CommonTree COLOR_CONSTANT86=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup85 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt32=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt32=1;
				}
				break;
			case In:
				{
				alt32=2;
				}
				break;
			case 117:
				{
				alt32=3;
				}
				break;
			case 114:
				{
				alt32=4;
				}
				break;
			case Equals:
				{
				alt32=5;
				}
				break;
			case NEquals:
				{
				alt32=6;
				}
				break;
			case GTEquals:
				{
				alt32=7;
				}
				break;
			case LTEquals:
				{
				alt32=8;
				}
				break;
			case GT:
				{
				alt32=9;
				}
				break;
			case LT:
				{
				alt32=10;
				}
				break;
			case Add:
				{
				alt32=11;
				}
				break;
			case Subtract:
				{
				alt32=12;
				}
				break;
			case Multiply:
				{
				alt32=13;
				}
				break;
			case Divide:
				{
				alt32=14;
				}
				break;
			case Modulus:
				{
				alt32=15;
				}
				break;
			case Pow:
				{
				alt32=16;
				}
				break;
			case UNARY_MIN:
				{
				alt32=17;
				}
				break;
			case NEGATE:
				{
				alt32=18;
				}
				break;
			case Number:
				{
				alt32=19;
				}
				break;
			case Bool:
				{
				alt32=20;
				}
				break;
			case Null:
				{
				alt32=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt32=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt32=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt32=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt32=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt32=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1090); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1094);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1098);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1102);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1113); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1117);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1121);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:6: ^( '||' a= expression b= expression )
					{
					match(input,117,FOLLOW_117_in_expression1150); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1154);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1158);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:6: ^( '&&' a= expression b= expression )
					{
					match(input,114,FOLLOW_114_in_expression1185); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1189);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1193);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1220); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1224);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1228);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1255); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1259);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1263);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1290); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1294);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1298);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1325); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1329);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1333);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1364);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1368);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1400);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1404);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1436);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1440);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1468); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1472);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1476);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1504); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1508);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1512);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1540); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1544);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1548);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1576); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1580);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1584);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:192:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1612); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1616);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1620);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1648); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1652);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1687); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1691);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:6: Number
					{
					Number83=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1728); 
					node = new AtomNode(Double.parseDouble((Number83!=null?Number83.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:6: Bool
					{
					Bool84=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1780); 
					node = new AtomNode(Boolean.parseBoolean((Bool84!=null?Bool84.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1834); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1888);
					lookup85=lookup();
					state._fsp--;

					node = lookup85;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT86=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression1940); 
					node = new AtomNode((COLOR_CONSTANT86!=null?COLOR_CONSTANT86.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression1959); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2005); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2050); 
					node = new AtomNode(heightParam);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList87 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2109); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:13: ( exprList )?
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==EXP_LIST) ) {
					alt33=1;
				}
				switch (alt33) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2111);
						exprList87=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList87);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier90=null;
		CommonTree Identifier95=null;
		CommonTree String96=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall88 =null;
		java.util.List<PropertyNode> dotProperty89 =null;
		java.util.List<PropertyNode> dotProperty91 =null;
		DCNode functionCall92 =null;
		DCNode list93 =null;
		DCNode expression94 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt39=7;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==DOTPROPERTY) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==DOWN) ) {
					int LA39_3 = input.LA(3);
					if ( (LA39_3==Identifier) ) {
						alt39=2;
					}
					else if ( (LA39_3==FUNC_CALL) ) {
						alt39=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 3, input);
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
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA39_0==LOOKUP) ) {
				int LA39_2 = input.LA(2);
				if ( (LA39_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt39=6;
						}
						break;
					case String:
						{
						alt39=7;
						}
						break;
					case FUNC_CALL:
						{
						alt39=3;
						}
						break;
					case LIST:
						{
						alt39=4;
						}
						break;
					case Add:
					case Bool:
					case COLOR_CONSTANT:
					case DOTPROPERTY:
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
					case 114:
					case 117:
						{
						alt39=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 4, input);
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
							new NoViableAltException("", 39, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2136);
					functionCall88=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2138);
					dotProperty89=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall88, dotProperty89);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:213:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2146); 
					match(input, Token.DOWN, null); 
					Identifier90=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2148); 
					pushFollow(FOLLOW_dotProperty_in_lookup2150);
					dotProperty91=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier90!=null?Identifier90.getText():null), currentScope), dotProperty91);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2174); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2176);
					functionCall92=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:28: (i= indexes )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==INDEXES) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2180);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall92, i) : functionCall92;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2192); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2194);
					list93=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:21: (i= indexes )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==INDEXES) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2198);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list93, i) : list93;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2218); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2220);
					expression94=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:27: (i= indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==INDEXES) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2224);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression94, i) : expression94;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2238); 
					match(input, Token.DOWN, null); 
					Identifier95=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2240); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:27: (i= indexes )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==INDEXES) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2244);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier95!=null?Identifier95.getText():null), currentScope), i) : new IdentifierNode((Identifier95!=null?Identifier95.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2258); 
					match(input, Token.DOWN, null); 
					String96=(CommonTree)match(input,String,FOLLOW_String_in_lookup2260); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:23: (i= indexes )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==INDEXES) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2264);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String96!=null?String96.getText():null)), i) : new AtomNode((String96!=null?String96.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression97 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2314); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:16: ( expression )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==Add||LA40_0==Bool||LA40_0==COLOR_CONSTANT||LA40_0==DOTPROPERTY||LA40_0==Divide||LA40_0==Equals||(LA40_0 >= GT && LA40_0 <= GTEquals)||LA40_0==HEIGHT_CONSTANT||LA40_0==In||LA40_0==LOOKUP||(LA40_0 >= LT && LA40_0 <= LTEquals)||LA40_0==Modulus||(LA40_0 >= Multiply && LA40_0 <= NEquals)||(LA40_0 >= Null && LA40_0 <= Number)||LA40_0==PI_CONSTANT||LA40_0==Pow||(LA40_0 >= Subtract && LA40_0 <= TERNARY)||(LA40_0 >= UNARY_MIN && LA40_0 <= WIDTH_CONSTANT)||LA40_0==114||LA40_0==117) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2317);
					expression97=expression();
					state._fsp--;

					e.add(expression97);
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
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



	// $ANTLR start "dotProperty"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression98 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2355); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:12: ( dotExpression )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= DotEnd && LA41_0 <= DotY)) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2358);
					dotExpression98=dotExpression();
					state._fsp--;

					e.add(dotExpression98);
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
	// $ANTLR end "dotProperty"



	// $ANTLR start "dotExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt42=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt42=1;
				}
				break;
			case DotY:
				{
				alt42=2;
				}
				break;
			case DotStart:
				{
				alt42=3;
				}
				break;
			case DotEnd:
				{
				alt42=4;
				}
				break;
			case DotOrigin:
				{
				alt42=5;
				}
				break;
			case DotRotation:
				{
				alt42=6;
				}
				break;
			case DotWidth:
				{
				alt42=7;
				}
				break;
			case DotHeight:
				{
				alt42=8;
				}
				break;
			case DotFill:
				{
				alt42=9;
				}
				break;
			case DotStroke:
				{
				alt42=10;
				}
				break;
			case DotWeight:
				{
				alt42=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2386); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2394); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2402); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:249:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2410); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2418); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2426); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:252:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2434); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2442); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2450); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:255:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2457); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2464); 
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
	// $ANTLR end "dotExpression"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_walk64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0205000000000018L,0x0002000080000000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x2458100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall254 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall270 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall287 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall306 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall324 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall344 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall361 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall421 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall437 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall454 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall456 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall470 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall472 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall490 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall506 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall523 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall525 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall552 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall554 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall556 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall571 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall586 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall588 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall601 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall618 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall633 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall647 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall661 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall676 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall690 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall692 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall705 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall717 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall719 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall721 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall733 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall735 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall765 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_mathCall767 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall779 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_mathCall781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement817 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement821 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat849 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStat851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat872 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_elseIfStat874 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat893 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat895 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement922 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_forStatement926 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_forStatement930 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement932 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement956 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement958 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement962 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement966 = new BitSet(new long[]{0x2058100002402620L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement971 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_repeatStatement975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1000 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement1002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1032 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1065 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_TERNARY_in_expression1090 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1094 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1098 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1117 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_117_in_expression1150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1154 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_114_in_expression1185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1189 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1224 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1259 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1263 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1294 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1329 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1333 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1364 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1400 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1436 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1472 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1508 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1544 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1580 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1616 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2136 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2138 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2148 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2150 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2176 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2180 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2192 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2194 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2198 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2220 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2224 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2240 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2260 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2317 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2358 = new BitSet(new long[]{0x0000007FF0000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2464 = new BitSet(new long[]{0x0000000000000002L});
}
