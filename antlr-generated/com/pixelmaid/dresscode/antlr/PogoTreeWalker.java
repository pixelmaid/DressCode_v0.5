// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-06-17 18:52:56

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
		"ATan", "Add", "And", "Arc", "Assert", "Assign", "BLOCK", "Bool", "CBrace", 
		"CBracket", "COLOR_CONSTANT", "CParen", "Clip", "Cm", "Comma", "Comment", 
		"Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", "Def", "Difference", 
		"Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", "DotOrigin", 
		"DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", "DotX", 
		"DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", 
		"Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", "GetDistance", 
		"GetEnd", "GetFill", "GetHeight", "GetIntersect", "GetOrigin", "GetRotation", 
		"GetStart", "GetStroke", "GetWidth", "GetX", "GetY", "Grid", "Group", 
		"HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", 
		"If", "In", "Inch", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", 
		"LT", "LTEquals", "Line", "Map", "Merge", "MirrorX", "MirrorY", "Mm", 
		"Modulus", "Move", "MoveBy", "Multiply", "NEGATE", "NEquals", "NoFill", 
		"NoStroke", "Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "QMark", "Quad", "RETURN", 
		"Random", "Rect", "Repeat", "Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", 
		"SUB_CALL", "Scale", "Show", "Sine", "Size", "Skirt", "SkirtBack", "Space", 
		"Spiral", "String", "Stroke", "Subtract", "TERNARY", "Tan", "To", "Triangle", 
		"UNARY_MIN", "Union", "Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", 
		"Xor", "'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__153=153;
	public static final int T__154=154;
	public static final int T__155=155;
	public static final int ADD_CALL=4;
	public static final int AND_CALL=5;
	public static final int ASSIGNMENT=6;
	public static final int ATan=7;
	public static final int Add=8;
	public static final int And=9;
	public static final int Arc=10;
	public static final int Assert=11;
	public static final int Assign=12;
	public static final int BLOCK=13;
	public static final int Bool=14;
	public static final int CBrace=15;
	public static final int CBracket=16;
	public static final int COLOR_CONSTANT=17;
	public static final int CParen=18;
	public static final int Clip=19;
	public static final int Cm=20;
	public static final int Comma=21;
	public static final int Comment=22;
	public static final int Copy=23;
	public static final int Cosine=24;
	public static final int Curve=25;
	public static final int DOT=26;
	public static final int DOTLOOKUP=27;
	public static final int DOTPROPERTY=28;
	public static final int Def=29;
	public static final int Difference=30;
	public static final int Digit=31;
	public static final int Divide=32;
	public static final int Do=33;
	public static final int Dot=34;
	public static final int DotEnd=35;
	public static final int DotFill=36;
	public static final int DotHeight=37;
	public static final int DotOrigin=38;
	public static final int DotRotation=39;
	public static final int DotStart=40;
	public static final int DotStroke=41;
	public static final int DotWeight=42;
	public static final int DotWidth=43;
	public static final int DotX=44;
	public static final int DotY=45;
	public static final int EXP=46;
	public static final int EXP_LIST=47;
	public static final int Ellipse=48;
	public static final int Else=49;
	public static final int End=50;
	public static final int Equals=51;
	public static final int Excl=52;
	public static final int Expand=53;
	public static final int FUNCTION=54;
	public static final int FUNC_CALL=55;
	public static final int Fill=56;
	public static final int For=57;
	public static final int GT=58;
	public static final int GTEquals=59;
	public static final int GetDistance=60;
	public static final int GetEnd=61;
	public static final int GetFill=62;
	public static final int GetHeight=63;
	public static final int GetIntersect=64;
	public static final int GetOrigin=65;
	public static final int GetRotation=66;
	public static final int GetStart=67;
	public static final int GetStroke=68;
	public static final int GetWidth=69;
	public static final int GetX=70;
	public static final int GetY=71;
	public static final int Grid=72;
	public static final int Group=73;
	public static final int HEIGHT_CONSTANT=74;
	public static final int Heading=75;
	public static final int Hide=76;
	public static final int ID_LIST=77;
	public static final int IF=78;
	public static final int INDEXES=79;
	public static final int Identifier=80;
	public static final int If=81;
	public static final int In=82;
	public static final int Inch=83;
	public static final int Int=84;
	public static final int LAdd=85;
	public static final int LIST=86;
	public static final int LOOKUP=87;
	public static final int LRemove=88;
	public static final int LShape=89;
	public static final int LT=90;
	public static final int LTEquals=91;
	public static final int Line=92;
	public static final int Map=93;
	public static final int Merge=94;
	public static final int MirrorX=95;
	public static final int MirrorY=96;
	public static final int Mm=97;
	public static final int Modulus=98;
	public static final int Move=99;
	public static final int MoveBy=100;
	public static final int Multiply=101;
	public static final int NEGATE=102;
	public static final int NEquals=103;
	public static final int NoFill=104;
	public static final int NoStroke=105;
	public static final int Null=106;
	public static final int Number=107;
	public static final int OBrace=108;
	public static final int OBracket=109;
	public static final int OParen=110;
	public static final int Or=111;
	public static final int PI_CONSTANT=112;
	public static final int Point=113;
	public static final int Polygon=114;
	public static final int Pow=115;
	public static final int Print=116;
	public static final int Println=117;
	public static final int QMark=118;
	public static final int Quad=119;
	public static final int RETURN=120;
	public static final int Random=121;
	public static final int Rect=122;
	public static final int Repeat=123;
	public static final int Return=124;
	public static final int Rotate=125;
	public static final int Round=126;
	public static final int SPECIAL=127;
	public static final int STATEMENTS=128;
	public static final int SUB_CALL=129;
	public static final int Scale=130;
	public static final int Show=131;
	public static final int Sine=132;
	public static final int Size=133;
	public static final int Skirt=134;
	public static final int SkirtBack=135;
	public static final int Space=136;
	public static final int Spiral=137;
	public static final int String=138;
	public static final int Stroke=139;
	public static final int Subtract=140;
	public static final int TERNARY=141;
	public static final int Tan=142;
	public static final int To=143;
	public static final int Triangle=144;
	public static final int UNARY_MIN=145;
	public static final int Union=146;
	public static final int Units=147;
	public static final int WIDTH_CONSTANT=148;
	public static final int Wave=149;
	public static final int Weight=150;
	public static final int While=151;
	public static final int Xor=152;

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
	 int unitParam;
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
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm, double w, double h,int u) {
	    this(nodes, null, fns,dm,w,h,u);
	   
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,double w,double h, int u) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	    this.drawableManager = dm;
	    widthParam = w;
	    heightParam = h;
	    unitParam = u;
	  }
	  



	// $ANTLR start "walk"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:64:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:6: block
			{
			pushFollow(FOLLOW_block_in_walk65);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:68:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block96); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block99); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:28: statement
						{
						pushFollow(FOLLOW_statement_in_block102);
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

			match(input,RETURN,FOLLOW_RETURN_in_block110); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==153||LA2_0==155) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:87: expression
						{
						pushFollow(FOLLOW_expression_in_block113);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:85:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:89:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:89:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement142);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement155);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement166);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement178);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement189);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:5: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement197);
					repeatStatement9=repeatStatement();
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pow||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||LA5_0==153||LA5_0==155) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment225);
					expression12=expression();
					state._fsp--;

					}
					break;

			}

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:102:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall );
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
		DCNode patternCall25 =null;
		DCNode mathCall26 =null;
		DCNode getCall27 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall )
			int alt10=12;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FUNC_CALL) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt10=1;
						}
						break;
					case Println:
						{
						alt10=2;
						}
						break;
					case Print:
						{
						alt10=3;
						}
						break;
					case Assert:
						{
						alt10=4;
						}
						break;
					case Size:
						{
						alt10=5;
						}
						break;
					case LAdd:
						{
						alt10=6;
						}
						break;
					case LRemove:
						{
						alt10=7;
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
						alt10=8;
						}
						break;
					case Clip:
					case Copy:
					case Difference:
					case Expand:
					case Fill:
					case Group:
					case Heading:
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
					case Show:
					case Stroke:
					case Union:
					case Weight:
					case Xor:
						{
						alt10=9;
						}
						break;
					case Arc:
					case Grid:
					case Wave:
						{
						alt10=10;
						}
						break;
					case ATan:
					case Cm:
					case Cosine:
					case Inch:
					case Map:
					case Mm:
					case Random:
					case Round:
					case Sine:
					case Tan:
					case Units:
						{
						alt10=11;
						}
						break;
					case GetDistance:
					case GetEnd:
					case GetFill:
					case GetHeight:
					case GetIntersect:
					case GetOrigin:
					case GetRotation:
					case GetStart:
					case GetStroke:
					case GetWidth:
					case GetX:
					case GetY:
						{
						alt10=12;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall253); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall255); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall257);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions, widthParam, heightParam, unitParam	); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall269); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall271); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pow||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||LA7_0==153||LA7_0==155) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall273);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall286); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall288); 
					pushFollow(FOLLOW_expression_in_functionCall290);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall305); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall307); 
					pushFollow(FOLLOW_expression_in_functionCall309);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall323); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall325); 
					pushFollow(FOLLOW_expression_in_functionCall327);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall343); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall345); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall347);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall360); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall362); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall364);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall375);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall384);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall393);
					patternCall25=patternCall();
					state._fsp--;

					node = patternCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall402);
					mathCall26=mathCall();
					state._fsp--;

					node= mathCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall411);
					getCall27=getCall();
					state._fsp--;

					node= getCall27; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL29=null;
		CommonTree FUNC_CALL31=null;
		CommonTree FUNC_CALL33=null;
		CommonTree FUNC_CALL35=null;
		CommonTree FUNC_CALL37=null;
		CommonTree FUNC_CALL39=null;
		CommonTree FUNC_CALL41=null;
		java.util.List<DCNode> exprList28 =null;
		java.util.List<DCNode> exprList30 =null;
		java.util.List<DCNode> exprList32 =null;
		java.util.List<DCNode> exprList34 =null;
		java.util.List<DCNode> exprList36 =null;
		java.util.List<DCNode> exprList38 =null;
		java.util.List<DCNode> exprList40 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
			int alt20=9;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==FUNC_CALL) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt20=1;
						}
						break;
					case Line:
						{
						alt20=2;
						}
						break;
					case Rect:
						{
						alt20=3;
						}
						break;
					case Curve:
						{
						alt20=4;
						}
						break;
					case Polygon:
						{
						alt20=5;
						}
						break;
					case Skirt:
						{
						alt20=6;
						}
						break;
					case SkirtBack:
						{
						alt20=7;
						}
						break;
					case LShape:
						{
						alt20=8;
						}
						break;
					case Point:
						{
						alt20=9;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 2, input);
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
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall441); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall443); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall445);
							exprList28=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList28,FUNC_CALL29.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall457); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall459); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall461);
							exprList30=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList30,FUNC_CALL31.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall474); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall476); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall478);
							exprList32=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList32,FUNC_CALL33.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall492); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall494); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall496);
							exprList34=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList34,FUNC_CALL35.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall510); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall512); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall514);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList36,FUNC_CALL37.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall526); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall528); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall530);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall542); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall544); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall546);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall558); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall560); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall562);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList38,FUNC_CALL39.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall575); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall577); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall579);
							exprList40=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList40,FUNC_CALL41.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL69=null;
		CommonTree FUNC_CALL71=null;
		CommonTree FUNC_CALL73=null;
		CommonTree FUNC_CALL75=null;
		CommonTree FUNC_CALL77=null;
		CommonTree FUNC_CALL79=null;
		CommonTree FUNC_CALL81=null;
		CommonTree FUNC_CALL83=null;
		CommonTree FUNC_CALL85=null;
		java.util.List<DCNode> exprList42 =null;
		java.util.List<DCNode> exprList44 =null;
		java.util.List<DCNode> exprList46 =null;
		DCNode expression48 =null;
		java.util.List<DCNode> exprList50 =null;
		java.util.List<DCNode> exprList52 =null;
		java.util.List<DCNode> exprList54 =null;
		DCNode expression56 =null;
		DCNode expression58 =null;
		java.util.List<DCNode> exprList60 =null;
		DCNode expression62 =null;
		DCNode expression64 =null;
		java.util.List<DCNode> exprList66 =null;
		DCNode expression68 =null;
		DCNode expression70 =null;
		java.util.List<DCNode> exprList72 =null;
		DCNode expression74 =null;
		DCNode expression76 =null;
		java.util.List<DCNode> exprList78 =null;
		java.util.List<DCNode> exprList80 =null;
		java.util.List<DCNode> exprList82 =null;
		java.util.List<DCNode> exprList84 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) )
			int alt34=22;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==FUNC_CALL) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt34=1;
						}
						break;
					case MoveBy:
						{
						alt34=2;
						}
						break;
					case Heading:
						{
						alt34=3;
						}
						break;
					case Copy:
						{
						alt34=4;
						}
						break;
					case Rotate:
						{
						alt34=5;
						}
						break;
					case Fill:
						{
						alt34=6;
						}
						break;
					case Stroke:
						{
						alt34=7;
						}
						break;
					case NoFill:
						{
						alt34=8;
						}
						break;
					case NoStroke:
						{
						alt34=9;
						}
						break;
					case Weight:
						{
						alt34=10;
						}
						break;
					case Hide:
						{
						alt34=11;
						}
						break;
					case Show:
						{
						alt34=12;
						}
						break;
					case Group:
						{
						alt34=13;
						}
						break;
					case Expand:
						{
						alt34=14;
						}
						break;
					case Merge:
						{
						alt34=15;
						}
						break;
					case Scale:
						{
						alt34=16;
						}
						break;
					case MirrorX:
						{
						alt34=17;
						}
						break;
					case MirrorY:
						{
						alt34=18;
						}
						break;
					case Union:
						{
						alt34=19;
						}
						break;
					case Difference:
						{
						alt34=20;
						}
						break;
					case Clip:
						{
						alt34=21;
						}
						break;
					case Xor:
						{
						alt34=22;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 2, input);
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
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall606); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall608); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall610);
							exprList42=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList42,FUNC_CALL43.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall624); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall626); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall628);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList44,FUNC_CALL45.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall642); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall644); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall646);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList46,FUNC_CALL47.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall659); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall661); 
					pushFollow(FOLLOW_expression_in_transformCall663);
					expression48=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression48,FUNC_CALL49.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall674); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall676); 
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
							pushFollow(FOLLOW_exprList_in_transformCall678);
							exprList50=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList50,currentScope,FUNC_CALL51.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall689); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall691); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall693);
							exprList52=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList52,FUNC_CALL53.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall706); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall708); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall710);
							exprList54=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList54,FUNC_CALL55.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall721); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall723); 
					pushFollow(FOLLOW_expression_in_transformCall725);
					expression56=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression56 ,FUNC_CALL57.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall735); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall737); 
					pushFollow(FOLLOW_expression_in_transformCall739);
					expression58=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression58,FUNC_CALL59.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall749); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall751); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall753);
							exprList60=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList60,FUNC_CALL61.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall764); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall766); 
					pushFollow(FOLLOW_expression_in_transformCall768);
					expression62=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression62,FUNC_CALL63.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall778); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall780); 
					pushFollow(FOLLOW_expression_in_transformCall782);
					expression64=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression64,FUNC_CALL65.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall792); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall794); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall796);
							exprList66=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList66,FUNC_CALL67.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL69=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall807); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall809); 
					pushFollow(FOLLOW_expression_in_transformCall811);
					expression68=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression68, currentScope, FUNC_CALL69.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL71=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall820); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall822); 
					pushFollow(FOLLOW_expression_in_transformCall824);
					expression70=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression70,currentScope,FUNC_CALL71.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL73=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall833); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall835); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall837);
							exprList72=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList72,FUNC_CALL73.getLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL75=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall847); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall849); 
					pushFollow(FOLLOW_expression_in_transformCall851);
					expression74=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression74,FUNC_CALL75.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL77=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall860); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall862); 
					pushFollow(FOLLOW_expression_in_transformCall864);
					expression76=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression76,FUNC_CALL77.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL79=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall873); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall875); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall877);
							exprList78=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList78, currentScope, FUNC_CALL79.getLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL81=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall887); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall889); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall891);
							exprList80=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList80, currentScope, FUNC_CALL81.getLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL83=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall901); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall903); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall905);
							exprList82=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList82, currentScope, FUNC_CALL83.getLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL85=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall915); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall917); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall919);
							exprList84=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList84, currentScope, FUNC_CALL85.getLine());
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



	// $ANTLR start "patternCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL87=null;
		CommonTree FUNC_CALL89=null;
		CommonTree FUNC_CALL91=null;
		java.util.List<DCNode> exprList86 =null;
		java.util.List<DCNode> exprList88 =null;
		java.util.List<DCNode> exprList90 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==FUNC_CALL) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Grid:
						{
						alt38=1;
						}
						break;
					case Wave:
						{
						alt38=2;
						}
						break;
					case Arc:
						{
						alt38=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 2, input);
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
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL87=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall949); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall951); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall953);
							exprList86=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList86,currentScope,FUNC_CALL87.getLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL89=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall965); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall967); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall969);
							exprList88=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList88,currentScope,FUNC_CALL89.getLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL91=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall981); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall983); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall985);
							exprList90=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList90,currentScope,FUNC_CALL91.getLine(),widthParam, heightParam);
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
	// $ANTLR end "patternCall"



	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL93=null;
		CommonTree FUNC_CALL95=null;
		CommonTree FUNC_CALL97=null;
		CommonTree FUNC_CALL99=null;
		CommonTree FUNC_CALL101=null;
		CommonTree FUNC_CALL103=null;
		CommonTree FUNC_CALL105=null;
		CommonTree FUNC_CALL107=null;
		CommonTree FUNC_CALL109=null;
		CommonTree FUNC_CALL111=null;
		CommonTree FUNC_CALL113=null;
		DCNode expression92 =null;
		DCNode expression94 =null;
		DCNode expression96 =null;
		DCNode expression98 =null;
		java.util.List<DCNode> exprList100 =null;
		DCNode expression102 =null;
		java.util.List<DCNode> exprList104 =null;
		DCNode expression106 =null;
		DCNode expression108 =null;
		DCNode expression110 =null;
		DCNode expression112 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
			int alt41=11;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==FUNC_CALL) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt41=1;
						}
						break;
					case Sine:
						{
						alt41=2;
						}
						break;
					case Tan:
						{
						alt41=3;
						}
						break;
					case ATan:
						{
						alt41=4;
						}
						break;
					case Random:
						{
						alt41=5;
						}
						break;
					case Round:
						{
						alt41=6;
						}
						break;
					case Map:
						{
						alt41=7;
						}
						break;
					case Inch:
						{
						alt41=8;
						}
						break;
					case Mm:
						{
						alt41=9;
						}
						break;
					case Cm:
						{
						alt41=10;
						}
						break;
					case Units:
						{
						alt41=11;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 2, input);
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL93=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1014); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1016); 
					pushFollow(FOLLOW_expression_in_mathCall1018);
					expression92=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression92,FUNC_CALL93.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL95=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1028); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1030); 
					pushFollow(FOLLOW_expression_in_mathCall1032);
					expression94=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression94,FUNC_CALL95.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL97=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1042); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1044); 
					pushFollow(FOLLOW_expression_in_mathCall1046);
					expression96=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression96,FUNC_CALL97.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL99=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1056); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1058); 
					pushFollow(FOLLOW_expression_in_mathCall1060);
					expression98=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ATanNode(expression98,FUNC_CALL99.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL101=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1074); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1076); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:24: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1078);
							exprList100=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList100,FUNC_CALL101.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL103=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1089); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1091); 
					pushFollow(FOLLOW_expression_in_mathCall1093);
					expression102=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression102,FUNC_CALL103.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL105=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1103); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1105); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:21: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1107);
							exprList104=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList104,FUNC_CALL105.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL107=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1118); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1120); 
					pushFollow(FOLLOW_expression_in_mathCall1122);
					expression106=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression106,"inch",unitParam,FUNC_CALL107.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL109=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1131); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1133); 
					pushFollow(FOLLOW_expression_in_mathCall1135);
					expression108=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression108,"mm",unitParam,FUNC_CALL109.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL111=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1144); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1146); 
					pushFollow(FOLLOW_expression_in_mathCall1148);
					expression110=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression110,"cm",unitParam,FUNC_CALL111.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL113=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1157); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1159); 
					pushFollow(FOLLOW_expression_in_mathCall1161);
					expression112=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression112,"units",unitParam,FUNC_CALL113.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		DCNode expression114 =null;
		DCNode expression115 =null;
		DCNode expression116 =null;
		DCNode expression117 =null;
		DCNode expression118 =null;
		DCNode expression119 =null;
		java.util.List<DCNode> exprList120 =null;
		java.util.List<DCNode> exprList121 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) )
			int alt44=12;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==FUNC_CALL) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt44=1;
						}
						break;
					case GetHeight:
						{
						alt44=2;
						}
						break;
					case GetX:
						{
						alt44=3;
						}
						break;
					case GetY:
						{
						alt44=4;
						}
						break;
					case GetOrigin:
						{
						alt44=5;
						}
						break;
					case GetRotation:
						{
						alt44=6;
						}
						break;
					case GetFill:
						{
						alt44=7;
						}
						break;
					case GetStroke:
						{
						alt44=8;
						}
						break;
					case GetStart:
						{
						alt44=9;
						}
						break;
					case GetEnd:
						{
						alt44=10;
						}
						break;
					case GetDistance:
						{
						alt44=11;
						}
						break;
					case GetIntersect:
						{
						alt44=12;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 44, 2, input);
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
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1196); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1198); 
					pushFollow(FOLLOW_expression_in_getCall1200);
					expression114=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression114);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1210); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1212); 
					pushFollow(FOLLOW_expression_in_getCall1214);
					expression115=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression115);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1223); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1225); 
					pushFollow(FOLLOW_expression_in_getCall1227);
					expression116=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression116);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1236); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1238); 
					pushFollow(FOLLOW_expression_in_getCall1240);
					expression117=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression117);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1249); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1251); 
					pushFollow(FOLLOW_expression_in_getCall1253);
					expression118=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression118);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1262); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1264); 
					pushFollow(FOLLOW_expression_in_getCall1266);
					expression119=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression119);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1275); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1277); 
					pushFollow(FOLLOW_expression_in_getCall1279);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1287); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1289); 
					pushFollow(FOLLOW_expression_in_getCall1291);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1299); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1301); 
					pushFollow(FOLLOW_expression_in_getCall1303);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:192:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1310); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1312); 
					pushFollow(FOLLOW_expression_in_getCall1314);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1322); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1324); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:28: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1326);
							exprList120=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList120);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1336); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1338); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:29: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1340);
							exprList121=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList121);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1374); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1376);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:26: ( elseIfStat[ifNode] )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==EXP) ) {
					int LA45_1 = input.LA(2);
					if ( (LA45_1==DOWN) ) {
						int LA45_3 = input.LA(3);
						if ( (LA45_3==Add||LA45_3==Bool||LA45_3==COLOR_CONSTANT||LA45_3==DOTPROPERTY||LA45_3==Divide||LA45_3==Equals||(LA45_3 >= GT && LA45_3 <= GTEquals)||LA45_3==HEIGHT_CONSTANT||LA45_3==In||LA45_3==LOOKUP||(LA45_3 >= LT && LA45_3 <= LTEquals)||LA45_3==Modulus||(LA45_3 >= Multiply && LA45_3 <= NEquals)||(LA45_3 >= Null && LA45_3 <= Number)||LA45_3==PI_CONSTANT||LA45_3==Pow||(LA45_3 >= Subtract && LA45_3 <= TERNARY)||LA45_3==UNARY_MIN||LA45_3==WIDTH_CONSTANT||LA45_3==153||LA45_3==155) ) {
							alt45=1;
						}

					}

				}

				switch (alt45) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1380);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop45;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:48: ( elseStat[ifNode] )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==EXP) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1386);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression122 =null;
		BlockNode block123 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1406); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1408);
			expression122=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1410);
			block123=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression122, block123);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression124 =null;
		BlockNode block125 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1429); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1431);
			expression124=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1433);
			block125=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression124, block125);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block126 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1452); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1454);
			block126=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block126);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier127=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block128 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:216:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:216:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1479); 
			match(input, Token.DOWN, null); 
			Identifier127=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1481); 
			pushFollow(FOLLOW_expression_in_forStatement1485);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1489);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1491);
			block128=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier127!=null?Identifier127.getText():null), a, b, block128, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier129=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block130 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1514); 
			match(input, Token.DOWN, null); 
			Identifier129=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1516); 
			pushFollow(FOLLOW_expression_in_repeatStatement1520);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1524);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:51: (c= expression )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Add||LA47_0==Bool||LA47_0==COLOR_CONSTANT||LA47_0==DOTPROPERTY||LA47_0==Divide||LA47_0==Equals||(LA47_0 >= GT && LA47_0 <= GTEquals)||LA47_0==HEIGHT_CONSTANT||LA47_0==In||LA47_0==LOOKUP||(LA47_0 >= LT && LA47_0 <= LTEquals)||LA47_0==Modulus||(LA47_0 >= Multiply && LA47_0 <= NEquals)||(LA47_0 >= Null && LA47_0 <= Number)||LA47_0==PI_CONSTANT||LA47_0==Pow||(LA47_0 >= Subtract && LA47_0 <= TERNARY)||LA47_0==UNARY_MIN||LA47_0==WIDTH_CONSTANT||LA47_0==153||LA47_0==155) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1529);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1533);
			block130=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier129!=null?Identifier129.getText():null), a, b, c, block130, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression131 =null;
		BlockNode block132 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1556); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1558);
			expression131=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1560);
			block132=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression131, block132);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier133=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1587); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:16: ( Identifier )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==Identifier) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:17: Identifier
					{
					Identifier133=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1590); 
					i.add((Identifier133!=null?Identifier133.getText():null));
					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression134 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1620); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:17: ( expression )+
			int cnt49=0;
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==Add||LA49_0==Bool||LA49_0==COLOR_CONSTANT||LA49_0==DOTPROPERTY||LA49_0==Divide||LA49_0==Equals||(LA49_0 >= GT && LA49_0 <= GTEquals)||LA49_0==HEIGHT_CONSTANT||LA49_0==In||LA49_0==LOOKUP||(LA49_0 >= LT && LA49_0 <= LTEquals)||LA49_0==Modulus||(LA49_0 >= Multiply && LA49_0 <= NEquals)||(LA49_0 >= Null && LA49_0 <= Number)||LA49_0==PI_CONSTANT||LA49_0==Pow||(LA49_0 >= Subtract && LA49_0 <= TERNARY)||LA49_0==UNARY_MIN||LA49_0==WIDTH_CONSTANT||LA49_0==153||LA49_0==155) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1623);
					expression134=expression();
					state._fsp--;

					e.add(expression134);
					}
					break;

				default :
					if ( cnt49 >= 1 ) break loop49;
					EarlyExitException eee = new EarlyExitException(49, input);
					throw eee;
				}
				cnt49++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:239:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number135=null;
		CommonTree Bool136=null;
		CommonTree COLOR_CONSTANT138=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup137 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt50=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt50=1;
				}
				break;
			case In:
				{
				alt50=2;
				}
				break;
			case 155:
				{
				alt50=3;
				}
				break;
			case 153:
				{
				alt50=4;
				}
				break;
			case Equals:
				{
				alt50=5;
				}
				break;
			case NEquals:
				{
				alt50=6;
				}
				break;
			case GTEquals:
				{
				alt50=7;
				}
				break;
			case LTEquals:
				{
				alt50=8;
				}
				break;
			case GT:
				{
				alt50=9;
				}
				break;
			case LT:
				{
				alt50=10;
				}
				break;
			case Add:
				{
				alt50=11;
				}
				break;
			case Subtract:
				{
				alt50=12;
				}
				break;
			case Multiply:
				{
				alt50=13;
				}
				break;
			case Divide:
				{
				alt50=14;
				}
				break;
			case Modulus:
				{
				alt50=15;
				}
				break;
			case Pow:
				{
				alt50=16;
				}
				break;
			case UNARY_MIN:
				{
				alt50=17;
				}
				break;
			case NEGATE:
				{
				alt50=18;
				}
				break;
			case Number:
				{
				alt50=19;
				}
				break;
			case Bool:
				{
				alt50=20;
				}
				break;
			case Null:
				{
				alt50=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt50=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt50=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt50=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt50=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt50=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1648); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1652);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1656);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1660);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1675);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1679);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: ^( '||' a= expression b= expression )
					{
					match(input,155,FOLLOW_155_in_expression1708); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1712);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1716);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: ^( '&&' a= expression b= expression )
					{
					match(input,153,FOLLOW_153_in_expression1743); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1747);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1751);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1778); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1782);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1786);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1813); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1817);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1821);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1848); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1852);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1856);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1883); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1887);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1891);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1918); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1922);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1926);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:249:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1954); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1958);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1962);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1990); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1994);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1998);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2026); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2030);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2034);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:252:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2062); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2066);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2070);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2098); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2102);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2106);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2138);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2142);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:255:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression2170); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2174);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2178);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2206); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2210);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:257:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2245); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2249);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:6: Number
					{
					Number135=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2286); 
					node = new AtomNode(Double.parseDouble((Number135!=null?Number135.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:6: Bool
					{
					Bool136=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2338); 
					node = new AtomNode(Boolean.parseBoolean((Bool136!=null?Bool136.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:260:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2392); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2446);
					lookup137=lookup();
					state._fsp--;

					node = lookup137;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT138=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2498); 
					node = new AtomNode((COLOR_CONSTANT138!=null?COLOR_CONSTANT138.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2517); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2563); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2608); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList139 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2667); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:13: ( exprList )?
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==EXP_LIST) ) {
					alt51=1;
				}
				switch (alt51) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2669);
						exprList139=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList139);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:274:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier142=null;
		CommonTree LOOKUP145=null;
		CommonTree LOOKUP147=null;
		CommonTree LOOKUP149=null;
		CommonTree Identifier150=null;
		CommonTree LOOKUP151=null;
		CommonTree String152=null;
		CommonTree LOOKUP153=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall140 =null;
		java.util.List<PropertyNode> dotProperty141 =null;
		java.util.List<PropertyNode> dotProperty143 =null;
		DCNode functionCall144 =null;
		DCNode list146 =null;
		DCNode expression148 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt57=7;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==DOTPROPERTY) ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1==DOWN) ) {
					int LA57_3 = input.LA(3);
					if ( (LA57_3==Identifier) ) {
						alt57=2;
					}
					else if ( (LA57_3==FUNC_CALL) ) {
						alt57=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 57, 3, input);
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
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA57_0==LOOKUP) ) {
				int LA57_2 = input.LA(2);
				if ( (LA57_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt57=6;
						}
						break;
					case String:
						{
						alt57=7;
						}
						break;
					case FUNC_CALL:
						{
						alt57=3;
						}
						break;
					case LIST:
						{
						alt57=4;
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
					case 153:
					case 155:
						{
						alt57=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 57, 4, input);
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
							new NoViableAltException("", 57, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2692); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2694);
					functionCall140=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2696);
					dotProperty141=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall140, dotProperty141);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:276:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2704); 
					match(input, Token.DOWN, null); 
					Identifier142=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2706); 
					pushFollow(FOLLOW_dotProperty_in_lookup2708);
					dotProperty143=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier142!=null?Identifier142.getText():null), currentScope), dotProperty143);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP145=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2732); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2734);
					functionCall144=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:28: (i= indexes )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==INDEXES) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2738);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall144, i,LOOKUP145.getLine()) : functionCall144;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:283:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP147=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2750); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2752);
					list146=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:283:21: (i= indexes )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==INDEXES) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:283:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2756);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list146, i, LOOKUP147.getLine()) : list146;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP149=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2776); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2778);
					expression148=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:27: (i= indexes )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==INDEXES) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2782);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression148, i,LOOKUP149.getLine()) : expression148;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP151=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2796); 
					match(input, Token.DOWN, null); 
					Identifier150=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2798); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:27: (i= indexes )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==INDEXES) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2802);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier150!=null?Identifier150.getText():null), currentScope), i,LOOKUP151.getLine()) : new IdentifierNode((Identifier150!=null?Identifier150.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP153=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2816); 
					match(input, Token.DOWN, null); 
					String152=(CommonTree)match(input,String,FOLLOW_String_in_lookup2818); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:23: (i= indexes )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==INDEXES) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2822);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String152!=null?String152.getText():null)), i,LOOKUP153.getLine()) : new AtomNode((String152!=null?String152.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:296:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression154 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2872); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:16: ( expression )+
			int cnt58=0;
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==Add||LA58_0==Bool||LA58_0==COLOR_CONSTANT||LA58_0==DOTPROPERTY||LA58_0==Divide||LA58_0==Equals||(LA58_0 >= GT && LA58_0 <= GTEquals)||LA58_0==HEIGHT_CONSTANT||LA58_0==In||LA58_0==LOOKUP||(LA58_0 >= LT && LA58_0 <= LTEquals)||LA58_0==Modulus||(LA58_0 >= Multiply && LA58_0 <= NEquals)||(LA58_0 >= Null && LA58_0 <= Number)||LA58_0==PI_CONSTANT||LA58_0==Pow||(LA58_0 >= Subtract && LA58_0 <= TERNARY)||LA58_0==UNARY_MIN||LA58_0==WIDTH_CONSTANT||LA58_0==153||LA58_0==155) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2875);
					expression154=expression();
					state._fsp--;

					e.add(expression154);
					}
					break;

				default :
					if ( cnt58 >= 1 ) break loop58;
					EarlyExitException eee = new EarlyExitException(58, input);
					throw eee;
				}
				cnt58++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression155 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:305:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:305:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2913); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:305:12: ( dotExpression )+
			int cnt59=0;
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= DotEnd && LA59_0 <= DotY)) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:305:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2916);
					dotExpression155=dotExpression();
					state._fsp--;

					e.add(dotExpression155);
					}
					break;

				default :
					if ( cnt59 >= 1 ) break loop59;
					EarlyExitException eee = new EarlyExitException(59, input);
					throw eee;
				}
				cnt59++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:309:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt60=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt60=1;
				}
				break;
			case DotY:
				{
				alt60=2;
				}
				break;
			case DotStart:
				{
				alt60=3;
				}
				break;
			case DotEnd:
				{
				alt60=4;
				}
				break;
			case DotOrigin:
				{
				alt60=5;
				}
				break;
			case DotRotation:
				{
				alt60=6;
				}
				break;
			case DotWidth:
				{
				alt60=7;
				}
				break;
			case DotHeight:
				{
				alt60=8;
				}
				break;
			case DotFill:
				{
				alt60=9;
				}
				break;
			case DotStroke:
				{
				alt60=10;
				}
				break;
			case DotWeight:
				{
				alt60=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:309:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2944); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:310:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2952); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:311:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2960); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:312:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2968); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:313:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2976); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:314:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2984); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:315:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2992); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3000); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:317:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3008); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:318:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3015); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:319:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3022); 
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



	public static final BitSet FOLLOW_block_in_walk65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block99 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block102 = new BitSet(new long[]{0x0280000000000048L,0x0800000000004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RETURN_in_block110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x0C08000110024108L,0x00090CE40C848400L,0x000000000A123000L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x0C08000110024108L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall255 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall271 = new BitSet(new long[]{0x0C08000110024108L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_functionCall273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall288 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_functionCall290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall307 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_functionCall309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall325 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_functionCall327 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall345 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall362 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall443 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall445 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall459 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall476 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall478 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall494 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall512 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall528 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall544 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall558 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall560 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall562 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall577 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall579 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall608 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall626 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall628 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall644 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall661 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall676 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall691 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall708 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall723 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall735 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall737 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall739 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall751 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall753 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall766 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall768 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall780 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall794 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall809 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall822 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall835 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall849 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall862 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_transformCall864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall875 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall889 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall903 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall915 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall917 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall951 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall967 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall969 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall983 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1016 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1018 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1028 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1030 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1042 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1044 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1046 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1058 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1074 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1076 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1078 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1091 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1093 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1105 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1120 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1131 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1133 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1146 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1148 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1159 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_mathCall1161 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1198 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1212 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1223 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1225 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1238 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1251 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1264 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1277 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1289 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1301 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1312 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_getCall1314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1324 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1338 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1340 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1376 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1380 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1408 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_ifStat1410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1431 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1481 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_forStatement1485 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_forStatement1489 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_forStatement1491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1516 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1520 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1524 = new BitSet(new long[]{0x0C08000110026100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1529 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1558 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_whileStatement1560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1590 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1623 = new BitSet(new long[]{0x0C08000110024108L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_TERNARY_in_expression1648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1652 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1656 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1660 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1675 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_155_in_expression1708 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1712 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_153_in_expression1743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1747 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1782 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1817 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1821 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1852 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1887 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1922 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1926 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1954 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1958 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1962 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1990 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1994 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression1998 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2026 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2030 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression2034 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2066 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression2070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2098 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2102 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression2106 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2138 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression2142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression2170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2174 = new BitSet(new long[]{0x0C08000110024100L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_expression_in_expression2178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2210 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2249 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2669 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2694 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2696 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2706 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2708 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2734 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_indexes_in_lookup2738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2752 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_indexes_in_lookup2756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2778 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_indexes_in_lookup2782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2796 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2798 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_indexes_in_lookup2802 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2818 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_indexes_in_lookup2822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2872 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2875 = new BitSet(new long[]{0x0C08000110024108L,0x00090CE40C840400L,0x000000000A123000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2916 = new BitSet(new long[]{0x00003FF800000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3022 = new BitSet(new long[]{0x0000000000000002L});
}
