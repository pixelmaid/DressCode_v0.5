// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-04-11 14:52:31

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.properties.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import com.pixelmaid.dresscode.data.*;
  
  import java.util.Map;
  import java.util.HashMap;
  import java.util.LinkedList;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "ATan", "Add", "And", 
		"Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", 
		"CParen", "Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", 
		"DOTPROPERTY", "Def", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", 
		"DotHeight", "DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", 
		"DotWidth", "DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", 
		"Equals", "Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", 
		"GTEquals", "Group", "HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", 
		"Identifier", "If", "In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", 
		"LShape", "LT", "LTEquals", "Line", "Map", "Merge", "MirrorX", "MirrorY", 
		"Modulus", "Move", "Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", 
		"Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "QMark", "Quad", "RETURN", 
		"Random", "Rect", "Repeat", "Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", 
		"Scale", "Sine", "Size", "Space", "String", "Stroke", "Subtract", "TERNARY", 
		"Tan", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", "While", 
		"'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int ASSIGNMENT=4;
	public static final int ATan=5;
	public static final int Add=6;
	public static final int And=7;
	public static final int Assert=8;
	public static final int Assign=9;
	public static final int BLOCK=10;
	public static final int Bool=11;
	public static final int CBrace=12;
	public static final int CBracket=13;
	public static final int COLOR_CONSTANT=14;
	public static final int CParen=15;
	public static final int Comma=16;
	public static final int Comment=17;
	public static final int Copy=18;
	public static final int Cosine=19;
	public static final int Curve=20;
	public static final int DOT=21;
	public static final int DOTLOOKUP=22;
	public static final int DOTPROPERTY=23;
	public static final int Def=24;
	public static final int Digit=25;
	public static final int Divide=26;
	public static final int Do=27;
	public static final int Dot=28;
	public static final int DotEnd=29;
	public static final int DotFill=30;
	public static final int DotHeight=31;
	public static final int DotOrigin=32;
	public static final int DotRotation=33;
	public static final int DotStart=34;
	public static final int DotStroke=35;
	public static final int DotWeight=36;
	public static final int DotWidth=37;
	public static final int DotX=38;
	public static final int DotY=39;
	public static final int EXP=40;
	public static final int EXP_LIST=41;
	public static final int Ellipse=42;
	public static final int Else=43;
	public static final int End=44;
	public static final int Equals=45;
	public static final int Excl=46;
	public static final int Expand=47;
	public static final int FUNCTION=48;
	public static final int FUNC_CALL=49;
	public static final int Fill=50;
	public static final int For=51;
	public static final int GT=52;
	public static final int GTEquals=53;
	public static final int Group=54;
	public static final int HEIGHT_CONSTANT=55;
	public static final int Hide=56;
	public static final int ID_LIST=57;
	public static final int IF=58;
	public static final int INDEXES=59;
	public static final int Identifier=60;
	public static final int If=61;
	public static final int In=62;
	public static final int Int=63;
	public static final int LAdd=64;
	public static final int LIST=65;
	public static final int LOOKUP=66;
	public static final int LRemove=67;
	public static final int LShape=68;
	public static final int LT=69;
	public static final int LTEquals=70;
	public static final int Line=71;
	public static final int Map=72;
	public static final int Merge=73;
	public static final int MirrorX=74;
	public static final int MirrorY=75;
	public static final int Modulus=76;
	public static final int Move=77;
	public static final int Multiply=78;
	public static final int NEGATE=79;
	public static final int NEquals=80;
	public static final int NoFill=81;
	public static final int NoStroke=82;
	public static final int Null=83;
	public static final int Number=84;
	public static final int OBrace=85;
	public static final int OBracket=86;
	public static final int OParen=87;
	public static final int Or=88;
	public static final int PI_CONSTANT=89;
	public static final int Point=90;
	public static final int Polygon=91;
	public static final int Pow=92;
	public static final int Print=93;
	public static final int Println=94;
	public static final int QMark=95;
	public static final int Quad=96;
	public static final int RETURN=97;
	public static final int Random=98;
	public static final int Rect=99;
	public static final int Repeat=100;
	public static final int Return=101;
	public static final int Rotate=102;
	public static final int Round=103;
	public static final int SPECIAL=104;
	public static final int STATEMENTS=105;
	public static final int Scale=106;
	public static final int Sine=107;
	public static final int Size=108;
	public static final int Space=109;
	public static final int String=110;
	public static final int Stroke=111;
	public static final int Subtract=112;
	public static final int TERNARY=113;
	public static final int Tan=114;
	public static final int To=115;
	public static final int Triangle=116;
	public static final int UNARY_MIN=117;
	public static final int WIDTH_CONSTANT=118;
	public static final int Weight=119;
	public static final int While=120;

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
	  
	  
	  private List<String> errors = new LinkedList<String>();
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        errors.add(hdr + " " + msg);
	    }
	    public List<String> getErrors() {
	        return errors;
	    }
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:61:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:6: block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||(LA2_0 >= UNARY_MIN && LA2_0 <= WIDTH_CONSTANT)||LA2_0==121||LA2_0==124) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:87:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:88:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:89:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:5: repeatStatement[false]
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: indexes
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
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
					case MirrorX:
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
					case ATan:
					case Cosine:
					case Map:
					case Random:
					case Round:
					case Sine:
					case Tan:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall252); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall254); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall268); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall270); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||(LA6_0 >= UNARY_MIN && LA6_0 <= WIDTH_CONSTANT)||LA6_0==121||LA6_0==124) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: expression
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:6: ^( FUNC_CALL Print expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:6: ^( FUNC_CALL Assert expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:6: ^( FUNC_CALL Size expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall342); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall344); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall359); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall361); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall374);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall383);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: mathCall
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall419); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall421); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:25: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall435); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall437); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:22: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall452); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall454); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:22: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall470); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall472); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:24: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall488); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall490); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:26: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:6: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall504); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall506); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:25: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:25: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall521); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall523); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:25: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:25: exprList
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) );
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
		CommonTree FUNC_CALL67=null;
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
		DCNode expression66 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) )
			int alt25=14;
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
					case MirrorX:
						{
						alt25=14;
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall552); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall554); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:22: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:22: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:5: ^( FUNC_CALL Copy expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall584); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall586); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:24: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:24: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall599); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall601); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:22: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:22: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall616); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall618); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:24: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:24: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:5: ^( FUNC_CALL NoFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:5: ^( FUNC_CALL NoStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall659); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall661); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:5: ^( FUNC_CALL Hide expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall688); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall690); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:23: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:23: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:5: ^( FUNC_CALL Expand expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:6: ^( FUNC_CALL Merge expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:6: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall731); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall733); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: exprList
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
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:6: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall746); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall748); 
					pushFollow(FOLLOW_expression_in_transformCall750);
					expression66=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression66,FUNC_CALL67.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL69=null;
		CommonTree FUNC_CALL71=null;
		CommonTree FUNC_CALL73=null;
		CommonTree FUNC_CALL75=null;
		CommonTree FUNC_CALL77=null;
		CommonTree FUNC_CALL79=null;
		CommonTree FUNC_CALL81=null;
		DCNode expression68 =null;
		DCNode expression70 =null;
		DCNode expression72 =null;
		DCNode expression74 =null;
		java.util.List<DCNode> exprList76 =null;
		DCNode expression78 =null;
		java.util.List<DCNode> exprList80 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) )
			int alt28=7;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==FUNC_CALL) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt28=1;
						}
						break;
					case Sine:
						{
						alt28=2;
						}
						break;
					case Tan:
						{
						alt28=3;
						}
						break;
					case ATan:
						{
						alt28=4;
						}
						break;
					case Random:
						{
						alt28=5;
						}
						break;
					case Round:
						{
						alt28=6;
						}
						break;
					case Map:
						{
						alt28=7;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 2, input);
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
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL69=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall777); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall779); 
					pushFollow(FOLLOW_expression_in_mathCall781);
					expression68=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression68,FUNC_CALL69.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL71=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall791); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall793); 
					pushFollow(FOLLOW_expression_in_mathCall795);
					expression70=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression70,FUNC_CALL71.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL73=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall805); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall807); 
					pushFollow(FOLLOW_expression_in_mathCall809);
					expression72=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression72,FUNC_CALL73.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL75=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall819); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall821); 
					pushFollow(FOLLOW_expression_in_mathCall823);
					expression74=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ATanNode(expression74,FUNC_CALL75.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL77=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall837); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall839); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall841);
							exprList76=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList76,FUNC_CALL77.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL79=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall852); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall854); 
					pushFollow(FOLLOW_expression_in_mathCall856);
					expression78=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression78,FUNC_CALL79.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL81=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall866); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall868); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:21: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall870);
							exprList80=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList80,FUNC_CALL81.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement909); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement911);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:26: ( elseIfStat[ifNode] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==EXP) ) {
					int LA29_1 = input.LA(2);
					if ( (LA29_1==DOWN) ) {
						int LA29_3 = input.LA(3);
						if ( (LA29_3==Add||LA29_3==Bool||LA29_3==COLOR_CONSTANT||LA29_3==DOTPROPERTY||LA29_3==Divide||LA29_3==Equals||(LA29_3 >= GT && LA29_3 <= GTEquals)||LA29_3==HEIGHT_CONSTANT||LA29_3==In||LA29_3==LOOKUP||(LA29_3 >= LT && LA29_3 <= LTEquals)||LA29_3==Modulus||(LA29_3 >= Multiply && LA29_3 <= NEquals)||(LA29_3 >= Null && LA29_3 <= Number)||LA29_3==PI_CONSTANT||LA29_3==Pow||(LA29_3 >= Subtract && LA29_3 <= TERNARY)||(LA29_3 >= UNARY_MIN && LA29_3 <= WIDTH_CONSTANT)||LA29_3==121||LA29_3==124) ) {
							alt29=1;
						}

					}

				}

				switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement915);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:48: ( elseStat[ifNode] )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EXP) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement921);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression82 =null;
		BlockNode block83 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat941); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat943);
			expression82=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat945);
			block83=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression82, block83);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression84 =null;
		BlockNode block85 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat964); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat966);
			expression84=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat968);
			block85=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression84, block85);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block86 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat987); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat989);
			block86=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block86);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier87=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block88 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1014); 
			match(input, Token.DOWN, null); 
			Identifier87=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1016); 
			pushFollow(FOLLOW_expression_in_forStatement1020);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1024);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1026);
			block88=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier87!=null?Identifier87.getText():null), a, b, block88, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier89=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block90 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1050); 
			match(input, Token.DOWN, null); 
			Identifier89=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1052); 
			pushFollow(FOLLOW_expression_in_repeatStatement1056);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1060);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:51: (c= expression )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Add||LA31_0==Bool||LA31_0==COLOR_CONSTANT||LA31_0==DOTPROPERTY||LA31_0==Divide||LA31_0==Equals||(LA31_0 >= GT && LA31_0 <= GTEquals)||LA31_0==HEIGHT_CONSTANT||LA31_0==In||LA31_0==LOOKUP||(LA31_0 >= LT && LA31_0 <= LTEquals)||LA31_0==Modulus||(LA31_0 >= Multiply && LA31_0 <= NEquals)||(LA31_0 >= Null && LA31_0 <= Number)||LA31_0==PI_CONSTANT||LA31_0==Pow||(LA31_0 >= Subtract && LA31_0 <= TERNARY)||(LA31_0 >= UNARY_MIN && LA31_0 <= WIDTH_CONSTANT)||LA31_0==121||LA31_0==124) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1065);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1069);
			block90=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier89!=null?Identifier89.getText():null), a, b, c, block90, currentScope, lookup);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression91 =null;
		BlockNode block92 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1092); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1094);
			expression91=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1096);
			block92=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression91, block92);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier93=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1123); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:16: ( Identifier )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Identifier) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:17: Identifier
					{
					Identifier93=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1126); 
					i.add((Identifier93!=null?Identifier93.getText():null));
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression94 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1156); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:17: ( expression )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Add||LA33_0==Bool||LA33_0==COLOR_CONSTANT||LA33_0==DOTPROPERTY||LA33_0==Divide||LA33_0==Equals||(LA33_0 >= GT && LA33_0 <= GTEquals)||LA33_0==HEIGHT_CONSTANT||LA33_0==In||LA33_0==LOOKUP||(LA33_0 >= LT && LA33_0 <= LTEquals)||LA33_0==Modulus||(LA33_0 >= Multiply && LA33_0 <= NEquals)||(LA33_0 >= Null && LA33_0 <= Number)||LA33_0==PI_CONSTANT||LA33_0==Pow||(LA33_0 >= Subtract && LA33_0 <= TERNARY)||(LA33_0 >= UNARY_MIN && LA33_0 <= WIDTH_CONSTANT)||LA33_0==121||LA33_0==124) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1159);
					expression94=expression();
					state._fsp--;

					e.add(expression94);
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number95=null;
		CommonTree Bool96=null;
		CommonTree COLOR_CONSTANT98=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup97 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt34=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt34=1;
				}
				break;
			case In:
				{
				alt34=2;
				}
				break;
			case 124:
				{
				alt34=3;
				}
				break;
			case 121:
				{
				alt34=4;
				}
				break;
			case Equals:
				{
				alt34=5;
				}
				break;
			case NEquals:
				{
				alt34=6;
				}
				break;
			case GTEquals:
				{
				alt34=7;
				}
				break;
			case LTEquals:
				{
				alt34=8;
				}
				break;
			case GT:
				{
				alt34=9;
				}
				break;
			case LT:
				{
				alt34=10;
				}
				break;
			case Add:
				{
				alt34=11;
				}
				break;
			case Subtract:
				{
				alt34=12;
				}
				break;
			case Multiply:
				{
				alt34=13;
				}
				break;
			case Divide:
				{
				alt34=14;
				}
				break;
			case Modulus:
				{
				alt34=15;
				}
				break;
			case Pow:
				{
				alt34=16;
				}
				break;
			case UNARY_MIN:
				{
				alt34=17;
				}
				break;
			case NEGATE:
				{
				alt34=18;
				}
				break;
			case Number:
				{
				alt34=19;
				}
				break;
			case Bool:
				{
				alt34=20;
				}
				break;
			case Null:
				{
				alt34=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt34=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt34=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt34=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt34=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt34=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1184); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1188);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1192);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1196);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1207); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1211);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1215);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:6: ^( '||' a= expression b= expression )
					{
					match(input,124,FOLLOW_124_in_expression1244); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1248);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1252);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:6: ^( '&&' a= expression b= expression )
					{
					match(input,121,FOLLOW_121_in_expression1279); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1283);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1287);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1314); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1318);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1322);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1349); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1353);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1357);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1384); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1388);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1392);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1419); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1423);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1427);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1454); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1458);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1462);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1490); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1494);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1498);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1526); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1530);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1534);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1562); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1566);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1570);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1598); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1602);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1606);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1634); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1638);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1642);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1670); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1674);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1678);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:213:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1706); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1710);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1714);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1742); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1746);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1781); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1785);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:216:6: Number
					{
					Number95=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1822); 
					node = new AtomNode(Double.parseDouble((Number95!=null?Number95.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:6: Bool
					{
					Bool96=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1874); 
					node = new AtomNode(Boolean.parseBoolean((Bool96!=null?Bool96.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1928); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1982);
					lookup97=lookup();
					state._fsp--;

					node = lookup97;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT98=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2034); 
					node = new AtomNode((COLOR_CONSTANT98!=null?COLOR_CONSTANT98.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2053); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2099); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2144); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList99 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2203); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:13: ( exprList )?
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==EXP_LIST) ) {
					alt35=1;
				}
				switch (alt35) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2205);
						exprList99=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList99);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:232:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier102=null;
		CommonTree Identifier107=null;
		CommonTree String108=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall100 =null;
		java.util.List<PropertyNode> dotProperty101 =null;
		java.util.List<PropertyNode> dotProperty103 =null;
		DCNode functionCall104 =null;
		DCNode list105 =null;
		DCNode expression106 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt41=7;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==DOTPROPERTY) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==DOWN) ) {
					int LA41_3 = input.LA(3);
					if ( (LA41_3==Identifier) ) {
						alt41=2;
					}
					else if ( (LA41_3==FUNC_CALL) ) {
						alt41=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 3, input);
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
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA41_0==LOOKUP) ) {
				int LA41_2 = input.LA(2);
				if ( (LA41_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt41=6;
						}
						break;
					case String:
						{
						alt41=7;
						}
						break;
					case FUNC_CALL:
						{
						alt41=3;
						}
						break;
					case LIST:
						{
						alt41=4;
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
					case 121:
					case 124:
						{
						alt41=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 4, input);
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
							new NoViableAltException("", 41, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2228); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2230);
					functionCall100=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2232);
					dotProperty101=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall100, dotProperty101);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2240); 
					match(input, Token.DOWN, null); 
					Identifier102=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2242); 
					pushFollow(FOLLOW_dotProperty_in_lookup2244);
					dotProperty103=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier102!=null?Identifier102.getText():null), currentScope), dotProperty103);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2268); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2270);
					functionCall104=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:28: (i= indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==INDEXES) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2274);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall104, i) : functionCall104;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2286); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2288);
					list105=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:21: (i= indexes )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==INDEXES) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2292);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list105, i) : list105;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2312); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2314);
					expression106=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:27: (i= indexes )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==INDEXES) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2318);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression106, i) : expression106;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2332); 
					match(input, Token.DOWN, null); 
					Identifier107=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2334); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:27: (i= indexes )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==INDEXES) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2338);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier107!=null?Identifier107.getText():null), currentScope), i) : new IdentifierNode((Identifier107!=null?Identifier107.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2352); 
					match(input, Token.DOWN, null); 
					String108=(CommonTree)match(input,String,FOLLOW_String_in_lookup2354); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:23: (i= indexes )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==INDEXES) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2358);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String108!=null?String108.getText():null)), i) : new AtomNode((String108!=null?String108.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression109 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2408); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:16: ( expression )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==Add||LA42_0==Bool||LA42_0==COLOR_CONSTANT||LA42_0==DOTPROPERTY||LA42_0==Divide||LA42_0==Equals||(LA42_0 >= GT && LA42_0 <= GTEquals)||LA42_0==HEIGHT_CONSTANT||LA42_0==In||LA42_0==LOOKUP||(LA42_0 >= LT && LA42_0 <= LTEquals)||LA42_0==Modulus||(LA42_0 >= Multiply && LA42_0 <= NEquals)||(LA42_0 >= Null && LA42_0 <= Number)||LA42_0==PI_CONSTANT||LA42_0==Pow||(LA42_0 >= Subtract && LA42_0 <= TERNARY)||(LA42_0 >= UNARY_MIN && LA42_0 <= WIDTH_CONSTANT)||LA42_0==121||LA42_0==124) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2411);
					expression109=expression();
					state._fsp--;

					e.add(expression109);
					}
					break;

				default :
					if ( cnt42 >= 1 ) break loop42;
					EarlyExitException eee = new EarlyExitException(42, input);
					throw eee;
				}
				cnt42++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression110 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2449); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:12: ( dotExpression )+
			int cnt43=0;
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= DotEnd && LA43_0 <= DotY)) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2452);
					dotExpression110=dotExpression();
					state._fsp--;

					e.add(dotExpression110);
					}
					break;

				default :
					if ( cnt43 >= 1 ) break loop43;
					EarlyExitException eee = new EarlyExitException(43, input);
					throw eee;
				}
				cnt43++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt44=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt44=1;
				}
				break;
			case DotY:
				{
				alt44=2;
				}
				break;
			case DotStart:
				{
				alt44=3;
				}
				break;
			case DotEnd:
				{
				alt44=4;
				}
				break;
			case DotOrigin:
				{
				alt44=5;
				}
				break;
			case DotRotation:
				{
				alt44=6;
				}
				break;
			case DotWidth:
				{
				alt44=7;
				}
				break;
			case DotHeight:
				{
				alt44=8;
				}
				break;
			case DotFill:
				{
				alt44=9;
				}
				break;
			case DotStroke:
				{
				alt44=10;
				}
				break;
			case DotWeight:
				{
				alt44=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2480); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2488); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2496); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:270:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2504); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:271:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2512); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2520); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:273:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2528); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:274:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2536); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2544); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:276:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2551); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2558); 
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
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x040A000000000018L,0x0100001000000000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x48B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall254 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall270 = new BitSet(new long[]{0x40B0200004804848L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_functionCall272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall287 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_functionCall289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall306 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall324 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_functionCall326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall344 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall361 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall421 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall437 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall454 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall456 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall470 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall472 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall490 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall506 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall523 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall525 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall552 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall554 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall556 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall571 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall586 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall588 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall601 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall618 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall633 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall647 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall661 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall676 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall690 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall692 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall705 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall717 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall719 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall721 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall733 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall735 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall748 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_transformCall750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall779 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_mathCall781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall793 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_mathCall795 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall807 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_mathCall809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall821 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_mathCall823 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall837 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall839 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall841 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall854 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_mathCall856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall866 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall868 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall870 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement911 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement915 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement921 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat941 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat943 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_ifStat945 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat964 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat966 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_elseIfStat968 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat989 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1016 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_forStatement1020 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_forStatement1024 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_forStatement1026 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1052 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1056 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1060 = new BitSet(new long[]{0x40B0200004804C40L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1065 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_repeatStatement1069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1094 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_whileStatement1096 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1126 = new BitSet(new long[]{0x1000000000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1159 = new BitSet(new long[]{0x40B0200004804848L,0x126300001219D064L});
	public static final BitSet FOLLOW_TERNARY_in_expression1184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1188 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1192 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1211 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1215 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_124_in_expression1244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1248 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1252 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_121_in_expression1279 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1283 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1287 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1318 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1353 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1388 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1423 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1454 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1458 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1494 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1498 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1530 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1534 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1566 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1602 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1634 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1638 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1674 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1710 = new BitSet(new long[]{0x40B0200004804840L,0x126300001219D064L});
	public static final BitSet FOLLOW_expression_in_expression1714 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1785 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2230 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2240 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2242 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2270 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2288 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2314 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2318 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2332 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2334 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2354 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2411 = new BitSet(new long[]{0x40B0200004804848L,0x126300001219D064L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2452 = new BitSet(new long[]{0x000000FFE0000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2558 = new BitSet(new long[]{0x0000000000000002L});
}
