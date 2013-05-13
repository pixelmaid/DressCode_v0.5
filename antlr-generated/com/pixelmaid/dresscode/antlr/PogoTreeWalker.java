// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-05-13 16:06:32

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_CALL", "AND_CALL", "ASSIGNMENT", 
		"ATan", "Add", "And", "Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", 
		"COLOR_CONSTANT", "CParen", "Clip", "Comma", "Comment", "Copy", "Cosine", 
		"Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", "Def", "Difference", "Digit", 
		"Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", "DotOrigin", 
		"DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", "DotX", 
		"DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", 
		"Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", "GetDistance", 
		"GetEnd", "GetFill", "GetHeight", "GetOrigin", "GetRotation", "GetStart", 
		"GetStroke", "GetWidth", "GetX", "GetY", "Group", "HEIGHT_CONSTANT", "Hide", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LAdd", "LIST", 
		"LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Map", "Merge", 
		"MirrorX", "MirrorY", "Modulus", "Move", "MoveBy", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", 
		"Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "Sine", "Size", 
		"Skirt", "SkirtBack", "Space", "String", "Stroke", "Subtract", "TERNARY", 
		"Tan", "To", "Triangle", "UNARY_MIN", "Union", "WIDTH_CONSTANT", "Weight", 
		"While", "Xor", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int ADD_CALL=4;
	public static final int AND_CALL=5;
	public static final int ASSIGNMENT=6;
	public static final int ATan=7;
	public static final int Add=8;
	public static final int And=9;
	public static final int Assert=10;
	public static final int Assign=11;
	public static final int BLOCK=12;
	public static final int Bool=13;
	public static final int CBrace=14;
	public static final int CBracket=15;
	public static final int COLOR_CONSTANT=16;
	public static final int CParen=17;
	public static final int Clip=18;
	public static final int Comma=19;
	public static final int Comment=20;
	public static final int Copy=21;
	public static final int Cosine=22;
	public static final int Curve=23;
	public static final int DOT=24;
	public static final int DOTLOOKUP=25;
	public static final int DOTPROPERTY=26;
	public static final int Def=27;
	public static final int Difference=28;
	public static final int Digit=29;
	public static final int Divide=30;
	public static final int Do=31;
	public static final int Dot=32;
	public static final int DotEnd=33;
	public static final int DotFill=34;
	public static final int DotHeight=35;
	public static final int DotOrigin=36;
	public static final int DotRotation=37;
	public static final int DotStart=38;
	public static final int DotStroke=39;
	public static final int DotWeight=40;
	public static final int DotWidth=41;
	public static final int DotX=42;
	public static final int DotY=43;
	public static final int EXP=44;
	public static final int EXP_LIST=45;
	public static final int Ellipse=46;
	public static final int Else=47;
	public static final int End=48;
	public static final int Equals=49;
	public static final int Excl=50;
	public static final int Expand=51;
	public static final int FUNCTION=52;
	public static final int FUNC_CALL=53;
	public static final int Fill=54;
	public static final int For=55;
	public static final int GT=56;
	public static final int GTEquals=57;
	public static final int GetDistance=58;
	public static final int GetEnd=59;
	public static final int GetFill=60;
	public static final int GetHeight=61;
	public static final int GetOrigin=62;
	public static final int GetRotation=63;
	public static final int GetStart=64;
	public static final int GetStroke=65;
	public static final int GetWidth=66;
	public static final int GetX=67;
	public static final int GetY=68;
	public static final int Group=69;
	public static final int HEIGHT_CONSTANT=70;
	public static final int Hide=71;
	public static final int ID_LIST=72;
	public static final int IF=73;
	public static final int INDEXES=74;
	public static final int Identifier=75;
	public static final int If=76;
	public static final int In=77;
	public static final int Int=78;
	public static final int LAdd=79;
	public static final int LIST=80;
	public static final int LOOKUP=81;
	public static final int LRemove=82;
	public static final int LShape=83;
	public static final int LT=84;
	public static final int LTEquals=85;
	public static final int Line=86;
	public static final int Map=87;
	public static final int Merge=88;
	public static final int MirrorX=89;
	public static final int MirrorY=90;
	public static final int Modulus=91;
	public static final int Move=92;
	public static final int MoveBy=93;
	public static final int Multiply=94;
	public static final int NEGATE=95;
	public static final int NEquals=96;
	public static final int NoFill=97;
	public static final int NoStroke=98;
	public static final int Null=99;
	public static final int Number=100;
	public static final int OBrace=101;
	public static final int OBracket=102;
	public static final int OParen=103;
	public static final int Or=104;
	public static final int PI_CONSTANT=105;
	public static final int Point=106;
	public static final int Polygon=107;
	public static final int Pow=108;
	public static final int Print=109;
	public static final int Println=110;
	public static final int QMark=111;
	public static final int Quad=112;
	public static final int RETURN=113;
	public static final int Random=114;
	public static final int Rect=115;
	public static final int Repeat=116;
	public static final int Return=117;
	public static final int Rotate=118;
	public static final int Round=119;
	public static final int SPECIAL=120;
	public static final int STATEMENTS=121;
	public static final int SUB_CALL=122;
	public static final int Scale=123;
	public static final int Sine=124;
	public static final int Size=125;
	public static final int Skirt=126;
	public static final int SkirtBack=127;
	public static final int Space=128;
	public static final int String=129;
	public static final int Stroke=130;
	public static final int Subtract=131;
	public static final int TERNARY=132;
	public static final int Tan=133;
	public static final int To=134;
	public static final int Triangle=135;
	public static final int UNARY_MIN=136;
	public static final int Union=137;
	public static final int WIDTH_CONSTANT=138;
	public static final int Weight=139;
	public static final int While=140;
	public static final int Xor=141;

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
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g"; }


	 
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:61:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:3: ( block )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:6: block
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:28: statement
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
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==142||LA2_0==145) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:87: expression
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:87:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:88:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:89:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:5: repeatStatement[false]
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: indexes
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
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
		DCNode getCall26 =null;


			//System.out.println("function called");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
			int alt9=11;
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
					case Skirt:
					case SkirtBack:
						{
						alt9=8;
						}
						break;
					case Clip:
					case Copy:
					case Difference:
					case Expand:
					case Fill:
					case Group:
					case Hide:
					case Merge:
					case MirrorX:
					case MirrorY:
					case Move:
					case MoveBy:
					case NoFill:
					case NoStroke:
					case Rotate:
					case Scale:
					case Stroke:
					case Union:
					case Weight:
					case Xor:
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
					case GetDistance:
					case GetEnd:
					case GetFill:
					case GetHeight:
					case GetOrigin:
					case GetRotation:
					case GetStart:
					case GetStroke:
					case GetWidth:
					case GetX:
					case GetY:
						{
						alt9=11;
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall252); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall254); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: exprList
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall268); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall270); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||LA6_0==UNARY_MIN||LA6_0==WIDTH_CONSTANT||LA6_0==142||LA6_0==145) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: expression
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:6: ^( FUNC_CALL Print expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:6: ^( FUNC_CALL Assert expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:6: ^( FUNC_CALL Size expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall342); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall344); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: exprList
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall359); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall361); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: exprList
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall374);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall383);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall392);
					mathCall25=mathCall();
					state._fsp--;

					node= mathCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall401);
					getCall26=getCall();
					state._fsp--;

					node= getCall26; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL28=null;
		CommonTree FUNC_CALL30=null;
		CommonTree FUNC_CALL32=null;
		CommonTree FUNC_CALL34=null;
		CommonTree FUNC_CALL36=null;
		CommonTree FUNC_CALL38=null;
		CommonTree FUNC_CALL40=null;
		CommonTree FUNC_CALL42=null;
		CommonTree FUNC_CALL44=null;
		java.util.List<DCNode> exprList27 =null;
		java.util.List<DCNode> exprList29 =null;
		java.util.List<DCNode> exprList31 =null;
		java.util.List<DCNode> exprList33 =null;
		java.util.List<DCNode> exprList35 =null;
		java.util.List<DCNode> exprList37 =null;
		java.util.List<DCNode> exprList39 =null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
			int alt19=9;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FUNC_CALL) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt19=1;
						}
						break;
					case Line:
						{
						alt19=2;
						}
						break;
					case Rect:
						{
						alt19=3;
						}
						break;
					case Curve:
						{
						alt19=4;
						}
						break;
					case Polygon:
						{
						alt19=5;
						}
						break;
					case Skirt:
						{
						alt19=6;
						}
						break;
					case SkirtBack:
						{
						alt19=7;
						}
						break;
					case LShape:
						{
						alt19=8;
						}
						break;
					case Point:
						{
						alt19=9;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
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
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL28=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall431); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall433); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall435);
							exprList27=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList27,FUNC_CALL28.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL30=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall447); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall449); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall451);
							exprList29=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList29,FUNC_CALL30.getLine());
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL32=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall464); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall466); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall468);
							exprList31=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList31,FUNC_CALL32.getLine());
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL34=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall482); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall484); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall486);
							exprList33=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList33,FUNC_CALL34.getLine());
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL36=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall500); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall502); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall504);
							exprList35=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList35,FUNC_CALL36.getLine());
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall516); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall518); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:24: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall520);
							exprList37=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new SkirtNode(exprList37,FUNC_CALL38.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall533); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall535); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:29: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall537);
							exprList39=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new SkirtBackNode(exprList39,FUNC_CALL40.getLine());
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall550); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall552); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:26: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall554);
							exprList41=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList41,FUNC_CALL42.getLine());
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall567); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall569); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:25: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall571);
							exprList43=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList43,FUNC_CALL44.getLine());
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL46=null;
		CommonTree FUNC_CALL48=null;
		CommonTree FUNC_CALL50=null;
		CommonTree FUNC_CALL52=null;
		CommonTree FUNC_CALL54=null;
		CommonTree FUNC_CALL56=null;
		CommonTree FUNC_CALL58=null;
		CommonTree FUNC_CALL60=null;
		CommonTree FUNC_CALL62=null;
		CommonTree FUNC_CALL64=null;
		CommonTree FUNC_CALL66=null;
		CommonTree FUNC_CALL68=null;
		CommonTree FUNC_CALL70=null;
		CommonTree FUNC_CALL72=null;
		CommonTree FUNC_CALL74=null;
		CommonTree FUNC_CALL76=null;
		CommonTree FUNC_CALL78=null;
		CommonTree FUNC_CALL80=null;
		CommonTree FUNC_CALL82=null;
		CommonTree FUNC_CALL84=null;
		java.util.List<DCNode> exprList45 =null;
		java.util.List<DCNode> exprList47 =null;
		DCNode expression49 =null;
		java.util.List<DCNode> exprList51 =null;
		java.util.List<DCNode> exprList53 =null;
		java.util.List<DCNode> exprList55 =null;
		DCNode expression57 =null;
		DCNode expression59 =null;
		java.util.List<DCNode> exprList61 =null;
		DCNode expression63 =null;
		java.util.List<DCNode> exprList65 =null;
		DCNode expression67 =null;
		DCNode expression69 =null;
		java.util.List<DCNode> exprList71 =null;
		DCNode expression73 =null;
		DCNode expression75 =null;
		java.util.List<DCNode> exprList77 =null;
		java.util.List<DCNode> exprList79 =null;
		java.util.List<DCNode> exprList81 =null;
		java.util.List<DCNode> exprList83 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) )
			int alt32=20;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==FUNC_CALL) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt32=1;
						}
						break;
					case MoveBy:
						{
						alt32=2;
						}
						break;
					case Copy:
						{
						alt32=3;
						}
						break;
					case Rotate:
						{
						alt32=4;
						}
						break;
					case Fill:
						{
						alt32=5;
						}
						break;
					case Stroke:
						{
						alt32=6;
						}
						break;
					case NoFill:
						{
						alt32=7;
						}
						break;
					case NoStroke:
						{
						alt32=8;
						}
						break;
					case Weight:
						{
						alt32=9;
						}
						break;
					case Hide:
						{
						alt32=10;
						}
						break;
					case Group:
						{
						alt32=11;
						}
						break;
					case Expand:
						{
						alt32=12;
						}
						break;
					case Merge:
						{
						alt32=13;
						}
						break;
					case Scale:
						{
						alt32=14;
						}
						break;
					case MirrorX:
						{
						alt32=15;
						}
						break;
					case MirrorY:
						{
						alt32=16;
						}
						break;
					case Union:
						{
						alt32=17;
						}
						break;
					case Difference:
						{
						alt32=18;
						}
						break;
					case Clip:
						{
						alt32=19;
						}
						break;
					case Xor:
						{
						alt32=20;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 2, input);
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
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall598); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall600); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall602);
							exprList45=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList45,FUNC_CALL46.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall616); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall618); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:25: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall620);
							exprList47=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList47,FUNC_CALL48.getLine());
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall633); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall635); 
					pushFollow(FOLLOW_expression_in_transformCall637);
					expression49=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression49,FUNC_CALL50.getLine());
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall648); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall650); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall652);
							exprList51=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList51,currentScope,FUNC_CALL52.getLine());
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall663); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall665); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall667);
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList53,FUNC_CALL54.getLine());
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall680); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall682); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall684);
							exprList55=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList55,FUNC_CALL56.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall695); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall697); 
					pushFollow(FOLLOW_expression_in_transformCall699);
					expression57=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression57 ,FUNC_CALL58.getLine());
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall709); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall711); 
					pushFollow(FOLLOW_expression_in_transformCall713);
					expression59=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression59,FUNC_CALL60.getLine());
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall723); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall725); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall727);
							exprList61=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList61,FUNC_CALL62.getLine());
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall738); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall740); 
					pushFollow(FOLLOW_expression_in_transformCall742);
					expression63=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression63,FUNC_CALL64.getLine());
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall752); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall754); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:23: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall756);
							exprList65=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList65,FUNC_CALL66.getLine());
					}
					break;
				case 12 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall767); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall769); 
					pushFollow(FOLLOW_expression_in_transformCall771);
					expression67=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression67, currentScope, FUNC_CALL68.getLine());
					}
					break;
				case 13 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall780); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall782); 
					pushFollow(FOLLOW_expression_in_transformCall784);
					expression69=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression69,currentScope,FUNC_CALL70.getLine());
					}
					break;
				case 14 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall793); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall795); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:23: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall797);
							exprList71=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList71,FUNC_CALL72.getLine());
					}
					break;
				case 15 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall807); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall809); 
					pushFollow(FOLLOW_expression_in_transformCall811);
					expression73=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression73,FUNC_CALL74.getLine());
					}
					break;
				case 16 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall820); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall822); 
					pushFollow(FOLLOW_expression_in_transformCall824);
					expression75=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression75,FUNC_CALL76.getLine());
					}
					break;
				case 17 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall833); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall835); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall837);
							exprList77=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList77, currentScope, FUNC_CALL78.getLine());
					}
					break;
				case 18 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall847); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall849); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:28: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall851);
							exprList79=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList79, currentScope, FUNC_CALL80.getLine());
					}
					break;
				case 19 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall861); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall863); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:22: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall865);
							exprList81=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList81, currentScope, FUNC_CALL82.getLine());
					}
					break;
				case 20 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall875); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall877); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:21: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall879);
							exprList83=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList83, currentScope, FUNC_CALL84.getLine());
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL86=null;
		CommonTree FUNC_CALL88=null;
		CommonTree FUNC_CALL90=null;
		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		CommonTree FUNC_CALL96=null;
		CommonTree FUNC_CALL98=null;
		DCNode expression85 =null;
		DCNode expression87 =null;
		DCNode expression89 =null;
		DCNode expression91 =null;
		java.util.List<DCNode> exprList93 =null;
		DCNode expression95 =null;
		java.util.List<DCNode> exprList97 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) )
			int alt35=7;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==FUNC_CALL) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt35=1;
						}
						break;
					case Sine:
						{
						alt35=2;
						}
						break;
					case Tan:
						{
						alt35=3;
						}
						break;
					case ATan:
						{
						alt35=4;
						}
						break;
					case Random:
						{
						alt35=5;
						}
						break;
					case Round:
						{
						alt35=6;
						}
						break;
					case Map:
						{
						alt35=7;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 2, input);
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
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall907); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall909); 
					pushFollow(FOLLOW_expression_in_mathCall911);
					expression85=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression85,FUNC_CALL86.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall921); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall923); 
					pushFollow(FOLLOW_expression_in_mathCall925);
					expression87=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression87,FUNC_CALL88.getLine());
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall935); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall937); 
					pushFollow(FOLLOW_expression_in_mathCall939);
					expression89=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression89,FUNC_CALL90.getLine());
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall949); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall951); 
					pushFollow(FOLLOW_expression_in_mathCall953);
					expression91=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ATanNode(expression91,FUNC_CALL92.getLine());
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall967); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall969); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:24: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall971);
							exprList93=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList93,FUNC_CALL94.getLine());
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall982); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall984); 
					pushFollow(FOLLOW_expression_in_mathCall986);
					expression95=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression95,FUNC_CALL96.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall996); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall998); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:21: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==EXP_LIST) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1000);
							exprList97=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList97,FUNC_CALL98.getLine());
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



	// $ANTLR start "getCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		DCNode expression99 =null;
		DCNode expression100 =null;
		DCNode expression101 =null;
		DCNode expression102 =null;
		DCNode expression103 =null;
		DCNode expression104 =null;
		java.util.List<DCNode> exprList105 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt37=11;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==FUNC_CALL) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt37=1;
						}
						break;
					case GetHeight:
						{
						alt37=2;
						}
						break;
					case GetX:
						{
						alt37=3;
						}
						break;
					case GetY:
						{
						alt37=4;
						}
						break;
					case GetOrigin:
						{
						alt37=5;
						}
						break;
					case GetRotation:
						{
						alt37=6;
						}
						break;
					case GetFill:
						{
						alt37=7;
						}
						break;
					case GetStroke:
						{
						alt37=8;
						}
						break;
					case GetStart:
						{
						alt37=9;
						}
						break;
					case GetEnd:
						{
						alt37=10;
						}
						break;
					case GetDistance:
						{
						alt37=11;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 2, input);
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
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1037); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1039); 
					pushFollow(FOLLOW_expression_in_getCall1041);
					expression99=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression99);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1051); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1053); 
					pushFollow(FOLLOW_expression_in_getCall1055);
					expression100=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression100);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1064); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1066); 
					pushFollow(FOLLOW_expression_in_getCall1068);
					expression101=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression101);
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1077); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1079); 
					pushFollow(FOLLOW_expression_in_getCall1081);
					expression102=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression102);
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1090); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1092); 
					pushFollow(FOLLOW_expression_in_getCall1094);
					expression103=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression103);
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1103); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1105); 
					pushFollow(FOLLOW_expression_in_getCall1107);
					expression104=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression104);
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1116); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1118); 
					pushFollow(FOLLOW_expression_in_getCall1120);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1128); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1130); 
					pushFollow(FOLLOW_expression_in_getCall1132);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1140); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1142); 
					pushFollow(FOLLOW_expression_in_getCall1144);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1151); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1153); 
					pushFollow(FOLLOW_expression_in_getCall1155);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1163); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1165); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:28: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1167);
							exprList105=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList105);
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
	// $ANTLR end "getCall"



	// $ANTLR start "ifStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1204); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1206);
			ifStat(ifNode);
			state._fsp--;

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:26: ( elseIfStat[ifNode] )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==EXP) ) {
					int LA38_1 = input.LA(2);
					if ( (LA38_1==DOWN) ) {
						int LA38_3 = input.LA(3);
						if ( (LA38_3==Add||LA38_3==Bool||LA38_3==COLOR_CONSTANT||LA38_3==DOTPROPERTY||LA38_3==Divide||LA38_3==Equals||(LA38_3 >= GT && LA38_3 <= GTEquals)||LA38_3==HEIGHT_CONSTANT||LA38_3==In||LA38_3==LOOKUP||(LA38_3 >= LT && LA38_3 <= LTEquals)||LA38_3==Modulus||(LA38_3 >= Multiply && LA38_3 <= NEquals)||(LA38_3 >= Null && LA38_3 <= Number)||LA38_3==PI_CONSTANT||LA38_3==Pow||(LA38_3 >= Subtract && LA38_3 <= TERNARY)||LA38_3==UNARY_MIN||LA38_3==WIDTH_CONSTANT||LA38_3==142||LA38_3==145) ) {
							alt38=1;
						}

					}

				}

				switch (alt38) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1210);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop38;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:48: ( elseStat[ifNode] )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==EXP) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1216);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression106 =null;
		BlockNode block107 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:3: ( ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1236); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1238);
			expression106=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1240);
			block107=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression106, block107);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression108 =null;
		BlockNode block109 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:192:3: ( ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:192:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1259); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1261);
			expression108=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1263);
			block109=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression108, block109);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block110 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:3: ( ^( EXP block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1282); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1284);
			block110=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block110);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier111=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block112 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1309); 
			match(input, Token.DOWN, null); 
			Identifier111=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1311); 
			pushFollow(FOLLOW_expression_in_forStatement1315);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1319);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1321);
			block112=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier111!=null?Identifier111.getText():null), a, b, block112, currentScope);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier113=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block114 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1345); 
			match(input, Token.DOWN, null); 
			Identifier113=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1347); 
			pushFollow(FOLLOW_expression_in_repeatStatement1351);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1355);
			b=expression();
			state._fsp--;

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:51: (c= expression )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Add||LA40_0==Bool||LA40_0==COLOR_CONSTANT||LA40_0==DOTPROPERTY||LA40_0==Divide||LA40_0==Equals||(LA40_0 >= GT && LA40_0 <= GTEquals)||LA40_0==HEIGHT_CONSTANT||LA40_0==In||LA40_0==LOOKUP||(LA40_0 >= LT && LA40_0 <= LTEquals)||LA40_0==Modulus||(LA40_0 >= Multiply && LA40_0 <= NEquals)||(LA40_0 >= Null && LA40_0 <= Number)||LA40_0==PI_CONSTANT||LA40_0==Pow||(LA40_0 >= Subtract && LA40_0 <= TERNARY)||LA40_0==UNARY_MIN||LA40_0==WIDTH_CONSTANT||LA40_0==142||LA40_0==145) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1360);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1364);
			block114=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier113!=null?Identifier113.getText():null), a, b, c, block114, currentScope, lookup);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression115 =null;
		BlockNode block116 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:3: ( ^( While expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1387); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1389);
			expression115=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1391);
			block116=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression115, block116);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier117=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1418); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:16: ( Identifier )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==Identifier) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:17: Identifier
					{
					Identifier117=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1421); 
					i.add((Identifier117!=null?Identifier117.getText():null));
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression118 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1451); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:17: ( expression )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==Add||LA42_0==Bool||LA42_0==COLOR_CONSTANT||LA42_0==DOTPROPERTY||LA42_0==Divide||LA42_0==Equals||(LA42_0 >= GT && LA42_0 <= GTEquals)||LA42_0==HEIGHT_CONSTANT||LA42_0==In||LA42_0==LOOKUP||(LA42_0 >= LT && LA42_0 <= LTEquals)||LA42_0==Modulus||(LA42_0 >= Multiply && LA42_0 <= NEquals)||(LA42_0 >= Null && LA42_0 <= Number)||LA42_0==PI_CONSTANT||LA42_0==Pow||(LA42_0 >= Subtract && LA42_0 <= TERNARY)||LA42_0==UNARY_MIN||LA42_0==WIDTH_CONSTANT||LA42_0==142||LA42_0==145) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1454);
					expression118=expression();
					state._fsp--;

					e.add(expression118);
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
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number119=null;
		CommonTree Bool120=null;
		CommonTree COLOR_CONSTANT122=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup121 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt43=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt43=1;
				}
				break;
			case In:
				{
				alt43=2;
				}
				break;
			case 145:
				{
				alt43=3;
				}
				break;
			case 142:
				{
				alt43=4;
				}
				break;
			case Equals:
				{
				alt43=5;
				}
				break;
			case NEquals:
				{
				alt43=6;
				}
				break;
			case GTEquals:
				{
				alt43=7;
				}
				break;
			case LTEquals:
				{
				alt43=8;
				}
				break;
			case GT:
				{
				alt43=9;
				}
				break;
			case LT:
				{
				alt43=10;
				}
				break;
			case Add:
				{
				alt43=11;
				}
				break;
			case Subtract:
				{
				alt43=12;
				}
				break;
			case Multiply:
				{
				alt43=13;
				}
				break;
			case Divide:
				{
				alt43=14;
				}
				break;
			case Modulus:
				{
				alt43=15;
				}
				break;
			case Pow:
				{
				alt43=16;
				}
				break;
			case UNARY_MIN:
				{
				alt43=17;
				}
				break;
			case NEGATE:
				{
				alt43=18;
				}
				break;
			case Number:
				{
				alt43=19;
				}
				break;
			case Bool:
				{
				alt43=20;
				}
				break;
			case Null:
				{
				alt43=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt43=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt43=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt43=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt43=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt43=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1479); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1483);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1487);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1491);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1502); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1506);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1510);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:6: ^( '||' a= expression b= expression )
					{
					match(input,145,FOLLOW_145_in_expression1539); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1543);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1547);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:6: ^( '&&' a= expression b= expression )
					{
					match(input,142,FOLLOW_142_in_expression1574); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1578);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1582);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1609); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1613);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1617);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:229:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1644); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1648);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1652);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1679); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1683);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1687);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:231:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1714); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1718);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1722);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:232:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1749); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1753);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1757);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1785); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1789);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1793);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1821); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1825);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1829);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1857); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1861);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1865);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:236:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1893); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1897);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1901);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1929); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1933);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1937);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1965); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1969);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1973);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:239:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression2001); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2005);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2009);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2037); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2041);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2076); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2080);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: Number
					{
					Number119=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2117); 
					node = new AtomNode(Double.parseDouble((Number119!=null?Number119.getText():null)));
					}
					break;
				case 20 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: Bool
					{
					Bool120=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2169); 
					node = new AtomNode(Boolean.parseBoolean((Bool120!=null?Bool120.getText():null)));
					}
					break;
				case 21 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2223); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2277);
					lookup121=lookup();
					state._fsp--;

					node = lookup121;
					}
					break;
				case 23 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT122=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2329); 
					node = new AtomNode((COLOR_CONSTANT122!=null?COLOR_CONSTANT122.getText():null));
					}
					break;
				case 24 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2348); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2394); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:249:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2439); 
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:252:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList123 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:3: ( ^( LIST ( exprList )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2498); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:13: ( exprList )?
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==EXP_LIST) ) {
					alt44=1;
				}
				switch (alt44) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2500);
						exprList123=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList123);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier126=null;
		CommonTree Identifier131=null;
		CommonTree String132=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall124 =null;
		java.util.List<PropertyNode> dotProperty125 =null;
		java.util.List<PropertyNode> dotProperty127 =null;
		DCNode functionCall128 =null;
		DCNode list129 =null;
		DCNode expression130 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt50=7;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==DOTPROPERTY) ) {
				int LA50_1 = input.LA(2);
				if ( (LA50_1==DOWN) ) {
					int LA50_3 = input.LA(3);
					if ( (LA50_3==Identifier) ) {
						alt50=2;
					}
					else if ( (LA50_3==FUNC_CALL) ) {
						alt50=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 50, 3, input);
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
							new NoViableAltException("", 50, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA50_0==LOOKUP) ) {
				int LA50_2 = input.LA(2);
				if ( (LA50_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt50=6;
						}
						break;
					case String:
						{
						alt50=7;
						}
						break;
					case FUNC_CALL:
						{
						alt50=3;
						}
						break;
					case LIST:
						{
						alt50=4;
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
					case 142:
					case 145:
						{
						alt50=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 50, 4, input);
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
							new NoViableAltException("", 50, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2523); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2525);
					functionCall124=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2527);
					dotProperty125=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall124, dotProperty125);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:260:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2535); 
					match(input, Token.DOWN, null); 
					Identifier126=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2537); 
					pushFollow(FOLLOW_dotProperty_in_lookup2539);
					dotProperty127=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier126!=null?Identifier126.getText():null), currentScope), dotProperty127);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2563); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2565);
					functionCall128=functionCall();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:28: (i= indexes )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==INDEXES) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2569);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall128, i) : functionCall128;
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2581); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2583);
					list129=list();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:21: (i= indexes )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==INDEXES) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2587);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list129, i) : list129;
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2607); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2609);
					expression130=expression();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:27: (i= indexes )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==INDEXES) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2613);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression130, i) : expression130;
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2627); 
					match(input, Token.DOWN, null); 
					Identifier131=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2629); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:27: (i= indexes )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==INDEXES) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2633);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier131!=null?Identifier131.getText():null), currentScope), i) : new IdentifierNode((Identifier131!=null?Identifier131.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:270:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2647); 
					match(input, Token.DOWN, null); 
					String132=(CommonTree)match(input,String,FOLLOW_String_in_lookup2649); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:270:23: (i= indexes )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==INDEXES) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:270:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2653);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String132!=null?String132.getText():null)), i) : new AtomNode((String132!=null?String132.getText():null));
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression133 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2703); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:16: ( expression )+
			int cnt51=0;
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Add||LA51_0==Bool||LA51_0==COLOR_CONSTANT||LA51_0==DOTPROPERTY||LA51_0==Divide||LA51_0==Equals||(LA51_0 >= GT && LA51_0 <= GTEquals)||LA51_0==HEIGHT_CONSTANT||LA51_0==In||LA51_0==LOOKUP||(LA51_0 >= LT && LA51_0 <= LTEquals)||LA51_0==Modulus||(LA51_0 >= Multiply && LA51_0 <= NEquals)||(LA51_0 >= Null && LA51_0 <= Number)||LA51_0==PI_CONSTANT||LA51_0==Pow||(LA51_0 >= Subtract && LA51_0 <= TERNARY)||LA51_0==UNARY_MIN||LA51_0==WIDTH_CONSTANT||LA51_0==142||LA51_0==145) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2706);
					expression133=expression();
					state._fsp--;

					e.add(expression133);
					}
					break;

				default :
					if ( cnt51 >= 1 ) break loop51;
					EarlyExitException eee = new EarlyExitException(51, input);
					throw eee;
				}
				cnt51++;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression134 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2744); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:12: ( dotExpression )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( ((LA52_0 >= DotEnd && LA52_0 <= DotY)) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2747);
					dotExpression134=dotExpression();
					state._fsp--;

					e.add(dotExpression134);
					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:292:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt53=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt53=1;
				}
				break;
			case DotY:
				{
				alt53=2;
				}
				break;
			case DotStart:
				{
				alt53=3;
				}
				break;
			case DotEnd:
				{
				alt53=4;
				}
				break;
			case DotOrigin:
				{
				alt53=5;
				}
				break;
			case DotRotation:
				{
				alt53=6;
				}
				break;
			case DotWidth:
				{
				alt53=7;
				}
				break;
			case DotHeight:
				{
				alt53=8;
				}
				break;
			case DotFill:
				{
				alt53=9;
				}
				break;
			case DotStroke:
				{
				alt53=10;
				}
				break;
			case DotWeight:
				{
				alt53=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2775); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:294:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2783); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:295:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2791); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:296:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2799); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:297:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2807); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2815); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:299:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2823); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:300:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2831); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2839); 
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:302:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2846); 
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2853); 
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
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x00A0000000000048L,0x0010000000000200L,0x0000000000001000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322440L,0x0000000000024518L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall254 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall270 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_functionCall272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall287 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_functionCall289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall306 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall324 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_functionCall326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall344 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall361 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall433 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall435 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall449 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall466 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall484 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall502 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall518 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall535 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall552 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall569 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall600 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall618 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall633 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall635 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall637 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall650 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall665 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall682 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall697 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall699 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall711 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall713 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall723 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall725 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall727 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall740 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall754 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall769 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall771 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall782 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall784 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall795 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall809 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall822 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_transformCall824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall835 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall849 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall863 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall865 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall877 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall879 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall909 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_mathCall911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall921 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall923 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_mathCall925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall937 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_mathCall939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall951 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_mathCall953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall967 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall969 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall971 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall984 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_mathCall986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall998 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1037 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1039 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1041 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1051 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1053 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1055 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1064 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1066 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1068 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1077 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1079 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1081 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1090 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1092 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1094 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1105 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1118 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1120 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1130 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1142 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1144 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1153 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_getCall1155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1165 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1167 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1206 = new BitSet(new long[]{0x0000100000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1210 = new BitSet(new long[]{0x0000100000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1238 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_ifStat1240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1261 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1263 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1284 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1311 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_forStatement1315 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_forStatement1319 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_forStatement1321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1347 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1351 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1355 = new BitSet(new long[]{0x0302000044013100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1360 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1389 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_whileStatement1391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1421 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1454 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_TERNARY_in_expression1479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1483 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1487 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1506 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1510 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_145_in_expression1539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1543 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_142_in_expression1574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1578 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1609 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1613 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1648 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1683 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1687 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1718 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1722 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1753 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1757 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1789 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1821 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1825 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1857 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1861 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1865 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1893 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1897 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1901 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1929 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1933 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1969 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression1973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression2001 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2005 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_expression_in_expression2009 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2037 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2041 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2080 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2525 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2537 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2565 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2583 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2609 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2629 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2649 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2653 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2706 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000024518L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2744 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2747 = new BitSet(new long[]{0x00000FFE00000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2853 = new BitSet(new long[]{0x0000000000000002L});
}
