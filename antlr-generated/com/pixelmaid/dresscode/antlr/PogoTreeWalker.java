// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-08-21 18:14:44

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
		"Expand", "FUNCTION", "FUNC_CALL", "Fill", "Flatten", "For", "GT", "GTEquals", 
		"Gaussian", "GetDistance", "GetEnd", "GetFill", "GetHeight", "GetIntersect", 
		"GetOrigin", "GetRotation", "GetStart", "GetStroke", "GetWidth", "GetX", 
		"GetY", "Grid", "Group", "HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", 
		"IF", "INDEXES", "Identifier", "If", "In", "Inch", "Int", "LAdd", "LIST", 
		"LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Map", "Merge", 
		"MirrorX", "MirrorY", "Mm", "Modulus", "Move", "MoveBy", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Noise", "Null", "Number", "OBrace", 
		"OBracket", "OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", 
		"Print", "Println", "QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", 
		"Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", 
		"Show", "Sine", "Size", "Skirt", "SkirtBack", "Space", "Spiral", "String", 
		"Stroke", "Subtract", "TERNARY", "Tan", "To", "Triangle", "UNARY_MIN", 
		"Union", "Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", "Xor", 
		"'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
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
	public static final int Flatten=57;
	public static final int For=58;
	public static final int GT=59;
	public static final int GTEquals=60;
	public static final int Gaussian=61;
	public static final int GetDistance=62;
	public static final int GetEnd=63;
	public static final int GetFill=64;
	public static final int GetHeight=65;
	public static final int GetIntersect=66;
	public static final int GetOrigin=67;
	public static final int GetRotation=68;
	public static final int GetStart=69;
	public static final int GetStroke=70;
	public static final int GetWidth=71;
	public static final int GetX=72;
	public static final int GetY=73;
	public static final int Grid=74;
	public static final int Group=75;
	public static final int HEIGHT_CONSTANT=76;
	public static final int Heading=77;
	public static final int Hide=78;
	public static final int ID_LIST=79;
	public static final int IF=80;
	public static final int INDEXES=81;
	public static final int Identifier=82;
	public static final int If=83;
	public static final int In=84;
	public static final int Inch=85;
	public static final int Int=86;
	public static final int LAdd=87;
	public static final int LIST=88;
	public static final int LOOKUP=89;
	public static final int LRemove=90;
	public static final int LShape=91;
	public static final int LT=92;
	public static final int LTEquals=93;
	public static final int Line=94;
	public static final int Map=95;
	public static final int Merge=96;
	public static final int MirrorX=97;
	public static final int MirrorY=98;
	public static final int Mm=99;
	public static final int Modulus=100;
	public static final int Move=101;
	public static final int MoveBy=102;
	public static final int Multiply=103;
	public static final int NEGATE=104;
	public static final int NEquals=105;
	public static final int NoFill=106;
	public static final int NoStroke=107;
	public static final int Noise=108;
	public static final int Null=109;
	public static final int Number=110;
	public static final int OBrace=111;
	public static final int OBracket=112;
	public static final int OParen=113;
	public static final int Or=114;
	public static final int PI_CONSTANT=115;
	public static final int Point=116;
	public static final int Polygon=117;
	public static final int Pow=118;
	public static final int Print=119;
	public static final int Println=120;
	public static final int QMark=121;
	public static final int Quad=122;
	public static final int RETURN=123;
	public static final int Random=124;
	public static final int Rect=125;
	public static final int Repeat=126;
	public static final int Return=127;
	public static final int Rotate=128;
	public static final int Round=129;
	public static final int SPECIAL=130;
	public static final int STATEMENTS=131;
	public static final int SUB_CALL=132;
	public static final int Scale=133;
	public static final int Show=134;
	public static final int Sine=135;
	public static final int Size=136;
	public static final int Skirt=137;
	public static final int SkirtBack=138;
	public static final int Space=139;
	public static final int Spiral=140;
	public static final int String=141;
	public static final int Stroke=142;
	public static final int Subtract=143;
	public static final int TERNARY=144;
	public static final int Tan=145;
	public static final int To=146;
	public static final int Triangle=147;
	public static final int UNARY_MIN=148;
	public static final int Union=149;
	public static final int Units=150;
	public static final int WIDTH_CONSTANT=151;
	public static final int Wave=152;
	public static final int Weight=153;
	public static final int While=154;
	public static final int Xor=155;

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
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==156||LA2_0==158) ) {
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
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pow||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||LA5_0==156||LA5_0==158) ) {
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
		CommonTree FUNC_CALL15=null;
		CommonTree FUNC_CALL21=null;
		CommonTree FUNC_CALL23=null;
		java.util.List<DCNode> exprList14 =null;
		DCNode expression16 =null;
		DCNode expression17 =null;
		DCNode expression18 =null;
		DCNode expression19 =null;
		java.util.List<DCNode> exprList20 =null;
		java.util.List<DCNode> exprList22 =null;
		DCNode primitiveCall24 =null;
		DCNode transformCall25 =null;
		DCNode patternCall26 =null;
		DCNode mathCall27 =null;
		DCNode getCall28 =null;


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
					case Flatten:
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
					case Gaussian:
					case Inch:
					case Map:
					case Mm:
					case Noise:
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
					FUNC_CALL15=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall253); 
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

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions, widthParam, heightParam, unitParam,FUNC_CALL15.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
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
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pow||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||LA7_0==156||LA7_0==158) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall273);
							expression16=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression16); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall286); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall288); 
					pushFollow(FOLLOW_expression_in_functionCall290);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall305); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall307); 
					pushFollow(FOLLOW_expression_in_functionCall309);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall323); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall325); 
					pushFollow(FOLLOW_expression_in_functionCall327);
					expression19=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression19); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL21=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall343); 
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
							exprList20=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList20,FUNC_CALL21.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL23=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall360); 
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
							exprList22=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList22,FUNC_CALL23.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall375);
					primitiveCall24=primitiveCall();
					state._fsp--;

					node = primitiveCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall384);
					transformCall25=transformCall();
					state._fsp--;

					node = transformCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall393);
					patternCall26=patternCall();
					state._fsp--;

					node = patternCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall402);
					mathCall27=mathCall();
					state._fsp--;

					node= mathCall27; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall411);
					getCall28=getCall();
					state._fsp--;

					node= getCall28; ((NodeEvent)node).addEventListener(drawableManager);
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


		CommonTree FUNC_CALL30=null;
		CommonTree FUNC_CALL32=null;
		CommonTree FUNC_CALL34=null;
		CommonTree FUNC_CALL36=null;
		CommonTree FUNC_CALL38=null;
		CommonTree FUNC_CALL40=null;
		CommonTree FUNC_CALL42=null;
		java.util.List<DCNode> exprList29 =null;
		java.util.List<DCNode> exprList31 =null;
		java.util.List<DCNode> exprList33 =null;
		java.util.List<DCNode> exprList35 =null;
		java.util.List<DCNode> exprList37 =null;
		java.util.List<DCNode> exprList39 =null;
		java.util.List<DCNode> exprList41 =null;

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
					FUNC_CALL30=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall441); 
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
							exprList29=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList29,FUNC_CALL30.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL32=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall457); 
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
							exprList31=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList31,FUNC_CALL32.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL34=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall474); 
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
							exprList33=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList33,FUNC_CALL34.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL36=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall492); 
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
							exprList35=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList35,FUNC_CALL36.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall510); 
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
							exprList37=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList37,FUNC_CALL38.getLine());
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
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall558); 
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
							exprList39=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList39,FUNC_CALL40.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall575); 
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
							exprList41=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList41,FUNC_CALL42.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL44=null;
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
		CommonTree FUNC_CALL86=null;
		CommonTree FUNC_CALL88=null;
		java.util.List<DCNode> exprList43 =null;
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
		DCNode expression65 =null;
		java.util.List<DCNode> exprList67 =null;
		DCNode expression69 =null;
		DCNode expression71 =null;
		java.util.List<DCNode> exprList73 =null;
		DCNode expression75 =null;
		DCNode expression77 =null;
		java.util.List<DCNode> exprList79 =null;
		java.util.List<DCNode> exprList81 =null;
		java.util.List<DCNode> exprList83 =null;
		java.util.List<DCNode> exprList85 =null;
		DCNode expression87 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
			int alt34=23;
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
					case Flatten:
						{
						alt34=23;
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
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall606); 
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
							exprList43=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList43,FUNC_CALL44.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall624); 
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
							exprList45=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList45,FUNC_CALL46.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall642); 
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
							exprList47=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList47,FUNC_CALL48.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall659); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall661); 
					pushFollow(FOLLOW_expression_in_transformCall663);
					expression49=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression49,FUNC_CALL50.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall674); 
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
							exprList51=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList51,currentScope,FUNC_CALL52.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall689); 
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
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList53,FUNC_CALL54.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall706); 
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
							exprList55=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList55,FUNC_CALL56.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall721); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall723); 
					pushFollow(FOLLOW_expression_in_transformCall725);
					expression57=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression57 ,FUNC_CALL58.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall735); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall737); 
					pushFollow(FOLLOW_expression_in_transformCall739);
					expression59=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression59,FUNC_CALL60.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall749); 
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
							exprList61=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList61,FUNC_CALL62.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall764); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall766); 
					pushFollow(FOLLOW_expression_in_transformCall768);
					expression63=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression63,FUNC_CALL64.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall778); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall780); 
					pushFollow(FOLLOW_expression_in_transformCall782);
					expression65=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression65,FUNC_CALL66.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall792); 
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
							exprList67=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList67,FUNC_CALL68.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall807); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall809); 
					pushFollow(FOLLOW_expression_in_transformCall811);
					expression69=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression69, currentScope, FUNC_CALL70.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall820); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall822); 
					pushFollow(FOLLOW_expression_in_transformCall824);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression71,currentScope,FUNC_CALL72.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall833); 
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
							exprList73=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList73,FUNC_CALL74.getLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall847); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall849); 
					pushFollow(FOLLOW_expression_in_transformCall851);
					expression75=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression75,FUNC_CALL76.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall860); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall862); 
					pushFollow(FOLLOW_expression_in_transformCall864);
					expression77=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression77,FUNC_CALL78.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall873); 
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
							exprList79=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList79, currentScope, FUNC_CALL80.getLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall887); 
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
							exprList81=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList81, currentScope, FUNC_CALL82.getLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall901); 
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
							exprList83=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList83, currentScope, FUNC_CALL84.getLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall915); 
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
							exprList85=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList85, currentScope, FUNC_CALL86.getLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall929); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall931); 
					pushFollow(FOLLOW_expression_in_transformCall933);
					expression87=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression87,currentScope, FUNC_CALL88.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL90=null;
		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		java.util.List<DCNode> exprList89 =null;
		java.util.List<DCNode> exprList91 =null;
		java.util.List<DCNode> exprList93 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall965); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall967); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall969);
							exprList89=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList89,currentScope,FUNC_CALL90.getLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall981); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall983); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall985);
							exprList91=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList91,currentScope,FUNC_CALL92.getLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall997); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall999); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1001);
							exprList93=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList93,currentScope,FUNC_CALL94.getLine(),widthParam, heightParam);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL96=null;
		CommonTree FUNC_CALL98=null;
		CommonTree FUNC_CALL100=null;
		CommonTree FUNC_CALL102=null;
		CommonTree FUNC_CALL104=null;
		CommonTree FUNC_CALL106=null;
		CommonTree FUNC_CALL108=null;
		CommonTree FUNC_CALL110=null;
		CommonTree FUNC_CALL112=null;
		CommonTree FUNC_CALL114=null;
		CommonTree FUNC_CALL116=null;
		CommonTree FUNC_CALL118=null;
		CommonTree FUNC_CALL120=null;
		DCNode expression95 =null;
		DCNode expression97 =null;
		DCNode expression99 =null;
		DCNode expression101 =null;
		java.util.List<DCNode> exprList103 =null;
		java.util.List<DCNode> exprList105 =null;
		java.util.List<DCNode> exprList107 =null;
		DCNode expression109 =null;
		java.util.List<DCNode> exprList111 =null;
		DCNode expression113 =null;
		DCNode expression115 =null;
		DCNode expression117 =null;
		DCNode expression119 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
			int alt43=13;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==FUNC_CALL) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt43=1;
						}
						break;
					case Sine:
						{
						alt43=2;
						}
						break;
					case Tan:
						{
						alt43=3;
						}
						break;
					case ATan:
						{
						alt43=4;
						}
						break;
					case Random:
						{
						alt43=5;
						}
						break;
					case Gaussian:
						{
						alt43=6;
						}
						break;
					case Noise:
						{
						alt43=7;
						}
						break;
					case Round:
						{
						alt43=8;
						}
						break;
					case Map:
						{
						alt43=9;
						}
						break;
					case Inch:
						{
						alt43=10;
						}
						break;
					case Mm:
						{
						alt43=11;
						}
						break;
					case Cm:
						{
						alt43=12;
						}
						break;
					case Units:
						{
						alt43=13;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 2, input);
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
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1030); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1032); 
					pushFollow(FOLLOW_expression_in_mathCall1034);
					expression95=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression95,FUNC_CALL96.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1044); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1046); 
					pushFollow(FOLLOW_expression_in_mathCall1048);
					expression97=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression97,FUNC_CALL98.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL100=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1058); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1060); 
					pushFollow(FOLLOW_expression_in_mathCall1062);
					expression99=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression99,FUNC_CALL100.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL102=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1072); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1074); 
					pushFollow(FOLLOW_expression_in_mathCall1076);
					expression101=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ATanNode(expression101,FUNC_CALL102.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL104=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1086); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1088); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:24: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1090);
							exprList103=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList103,FUNC_CALL104.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL106=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1101); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1103); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:26: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1105);
							exprList105=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList105,FUNC_CALL106.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL108=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1116); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1118); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:23: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1120);
							exprList107=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList107,FUNC_CALL108.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL110=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1131); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1133); 
					pushFollow(FOLLOW_expression_in_mathCall1135);
					expression109=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression109,FUNC_CALL110.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL112=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1145); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1147); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:21: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1149);
							exprList111=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList111,FUNC_CALL112.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL114=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1160); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1162); 
					pushFollow(FOLLOW_expression_in_mathCall1164);
					expression113=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression113,"inch",unitParam,FUNC_CALL114.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL116=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1173); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1175); 
					pushFollow(FOLLOW_expression_in_mathCall1177);
					expression115=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression115,"mm",unitParam,FUNC_CALL116.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL118=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1186); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1188); 
					pushFollow(FOLLOW_expression_in_mathCall1190);
					expression117=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression117,"cm",unitParam,FUNC_CALL118.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL120=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1199); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1201); 
					pushFollow(FOLLOW_expression_in_mathCall1203);
					expression119=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression119,"units",unitParam,FUNC_CALL120.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		DCNode expression121 =null;
		DCNode expression122 =null;
		DCNode expression123 =null;
		DCNode expression124 =null;
		DCNode expression125 =null;
		DCNode expression126 =null;
		java.util.List<DCNode> exprList127 =null;
		java.util.List<DCNode> exprList128 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) )
			int alt46=12;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==FUNC_CALL) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt46=1;
						}
						break;
					case GetHeight:
						{
						alt46=2;
						}
						break;
					case GetX:
						{
						alt46=3;
						}
						break;
					case GetY:
						{
						alt46=4;
						}
						break;
					case GetOrigin:
						{
						alt46=5;
						}
						break;
					case GetRotation:
						{
						alt46=6;
						}
						break;
					case GetFill:
						{
						alt46=7;
						}
						break;
					case GetStroke:
						{
						alt46=8;
						}
						break;
					case GetStart:
						{
						alt46=9;
						}
						break;
					case GetEnd:
						{
						alt46=10;
						}
						break;
					case GetDistance:
						{
						alt46=11;
						}
						break;
					case GetIntersect:
						{
						alt46=12;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 2, input);
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
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1238); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1240); 
					pushFollow(FOLLOW_expression_in_getCall1242);
					expression121=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression121);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1252); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1254); 
					pushFollow(FOLLOW_expression_in_getCall1256);
					expression122=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression122);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1265); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1267); 
					pushFollow(FOLLOW_expression_in_getCall1269);
					expression123=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression123);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1278); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1280); 
					pushFollow(FOLLOW_expression_in_getCall1282);
					expression124=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression124);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1291); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1293); 
					pushFollow(FOLLOW_expression_in_getCall1295);
					expression125=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression125);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1304); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1306); 
					pushFollow(FOLLOW_expression_in_getCall1308);
					expression126=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression126);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:192:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1317); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1319); 
					pushFollow(FOLLOW_expression_in_getCall1321);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1329); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1331); 
					pushFollow(FOLLOW_expression_in_getCall1333);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1341); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1343); 
					pushFollow(FOLLOW_expression_in_getCall1345);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1352); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1354); 
					pushFollow(FOLLOW_expression_in_getCall1356);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1364); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1366); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:28: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1368);
							exprList127=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList127);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1378); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1380); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:29: ( exprList )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==EXP_LIST) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1382);
							exprList128=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList128);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1416); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1418);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:26: ( elseIfStat[ifNode] )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==EXP) ) {
					int LA47_1 = input.LA(2);
					if ( (LA47_1==DOWN) ) {
						int LA47_3 = input.LA(3);
						if ( (LA47_3==Add||LA47_3==Bool||LA47_3==COLOR_CONSTANT||LA47_3==DOTPROPERTY||LA47_3==Divide||LA47_3==Equals||(LA47_3 >= GT && LA47_3 <= GTEquals)||LA47_3==HEIGHT_CONSTANT||LA47_3==In||LA47_3==LOOKUP||(LA47_3 >= LT && LA47_3 <= LTEquals)||LA47_3==Modulus||(LA47_3 >= Multiply && LA47_3 <= NEquals)||(LA47_3 >= Null && LA47_3 <= Number)||LA47_3==PI_CONSTANT||LA47_3==Pow||(LA47_3 >= Subtract && LA47_3 <= TERNARY)||LA47_3==UNARY_MIN||LA47_3==WIDTH_CONSTANT||LA47_3==156||LA47_3==158) ) {
							alt47=1;
						}

					}

				}

				switch (alt47) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1422);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop47;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:48: ( elseStat[ifNode] )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==EXP) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1428);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression129 =null;
		BlockNode block130 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1448); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1450);
			expression129=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1452);
			block130=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression129, block130);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression131 =null;
		BlockNode block132 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1471); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1473);
			expression131=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1475);
			block132=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression131, block132);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block133 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1494); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1496);
			block133=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block133);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier134=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block135 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1521); 
			match(input, Token.DOWN, null); 
			Identifier134=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1523); 
			pushFollow(FOLLOW_expression_in_forStatement1527);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1531);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1533);
			block135=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier134!=null?Identifier134.getText():null), a, b, block135, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier136=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block137 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1556); 
			match(input, Token.DOWN, null); 
			Identifier136=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1558); 
			pushFollow(FOLLOW_expression_in_repeatStatement1562);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1566);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:51: (c= expression )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Add||LA49_0==Bool||LA49_0==COLOR_CONSTANT||LA49_0==DOTPROPERTY||LA49_0==Divide||LA49_0==Equals||(LA49_0 >= GT && LA49_0 <= GTEquals)||LA49_0==HEIGHT_CONSTANT||LA49_0==In||LA49_0==LOOKUP||(LA49_0 >= LT && LA49_0 <= LTEquals)||LA49_0==Modulus||(LA49_0 >= Multiply && LA49_0 <= NEquals)||(LA49_0 >= Null && LA49_0 <= Number)||LA49_0==PI_CONSTANT||LA49_0==Pow||(LA49_0 >= Subtract && LA49_0 <= TERNARY)||LA49_0==UNARY_MIN||LA49_0==WIDTH_CONSTANT||LA49_0==156||LA49_0==158) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1571);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1575);
			block137=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier136!=null?Identifier136.getText():null), a, b, c, block137, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression138 =null;
		BlockNode block139 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1598); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1600);
			expression138=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1602);
			block139=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression138, block139);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:231:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier140=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1629); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:16: ( Identifier )+
			int cnt50=0;
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==Identifier) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:17: Identifier
					{
					Identifier140=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1632); 
					i.add((Identifier140!=null?Identifier140.getText():null));
					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:236:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression141 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1662); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:17: ( expression )+
			int cnt51=0;
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Add||LA51_0==Bool||LA51_0==COLOR_CONSTANT||LA51_0==DOTPROPERTY||LA51_0==Divide||LA51_0==Equals||(LA51_0 >= GT && LA51_0 <= GTEquals)||LA51_0==HEIGHT_CONSTANT||LA51_0==In||LA51_0==LOOKUP||(LA51_0 >= LT && LA51_0 <= LTEquals)||LA51_0==Modulus||(LA51_0 >= Multiply && LA51_0 <= NEquals)||(LA51_0 >= Null && LA51_0 <= Number)||LA51_0==PI_CONSTANT||LA51_0==Pow||(LA51_0 >= Subtract && LA51_0 <= TERNARY)||LA51_0==UNARY_MIN||LA51_0==WIDTH_CONSTANT||LA51_0==156||LA51_0==158) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1665);
					expression141=expression();
					state._fsp--;

					e.add(expression141);
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
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number142=null;
		CommonTree Bool143=null;
		CommonTree COLOR_CONSTANT145=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup144 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt52=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt52=1;
				}
				break;
			case In:
				{
				alt52=2;
				}
				break;
			case 158:
				{
				alt52=3;
				}
				break;
			case 156:
				{
				alt52=4;
				}
				break;
			case Equals:
				{
				alt52=5;
				}
				break;
			case NEquals:
				{
				alt52=6;
				}
				break;
			case GTEquals:
				{
				alt52=7;
				}
				break;
			case LTEquals:
				{
				alt52=8;
				}
				break;
			case GT:
				{
				alt52=9;
				}
				break;
			case LT:
				{
				alt52=10;
				}
				break;
			case Add:
				{
				alt52=11;
				}
				break;
			case Subtract:
				{
				alt52=12;
				}
				break;
			case Multiply:
				{
				alt52=13;
				}
				break;
			case Divide:
				{
				alt52=14;
				}
				break;
			case Modulus:
				{
				alt52=15;
				}
				break;
			case Pow:
				{
				alt52=16;
				}
				break;
			case UNARY_MIN:
				{
				alt52=17;
				}
				break;
			case NEGATE:
				{
				alt52=18;
				}
				break;
			case Number:
				{
				alt52=19;
				}
				break;
			case Bool:
				{
				alt52=20;
				}
				break;
			case Null:
				{
				alt52=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt52=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt52=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt52=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt52=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt52=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1690); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1694);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1698);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1702);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1713); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1717);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1721);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:6: ^( '||' a= expression b= expression )
					{
					match(input,158,FOLLOW_158_in_expression1750); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1754);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1758);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:6: ^( '&&' a= expression b= expression )
					{
					match(input,156,FOLLOW_156_in_expression1785); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1789);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1793);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1820); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1824);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1828);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1855); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1859);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1863);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:249:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1890); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1894);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1898);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1925); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1929);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1933);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1960); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1964);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1968);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:252:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1996); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2000);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2004);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2032); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2036);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2040);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2068); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2072);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2076);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:255:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2104); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2108);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2112);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2140); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2144);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2148);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:257:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2176); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2180);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2184);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression2212); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2216);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2220);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2248); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2252);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:260:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2287); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2291);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:6: Number
					{
					Number142=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2328); 
					node = new AtomNode(Double.parseDouble((Number142!=null?Number142.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:6: Bool
					{
					Bool143=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2380); 
					node = new AtomNode(Boolean.parseBoolean((Bool143!=null?Bool143.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2434); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2488);
					lookup144=lookup();
					state._fsp--;

					node = lookup144;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT145=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2540); 
					node = new AtomNode((COLOR_CONSTANT145!=null?COLOR_CONSTANT145.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2559); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2605); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2650); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:271:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList146 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2709); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:13: ( exprList )?
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==EXP_LIST) ) {
					alt53=1;
				}
				switch (alt53) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2711);
						exprList146=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList146);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier149=null;
		CommonTree LOOKUP152=null;
		CommonTree LOOKUP154=null;
		CommonTree LOOKUP156=null;
		CommonTree Identifier157=null;
		CommonTree LOOKUP158=null;
		CommonTree String159=null;
		CommonTree LOOKUP160=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall147 =null;
		java.util.List<PropertyNode> dotProperty148 =null;
		java.util.List<PropertyNode> dotProperty150 =null;
		DCNode functionCall151 =null;
		DCNode list153 =null;
		DCNode expression155 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:278:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt59=7;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==DOTPROPERTY) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==DOWN) ) {
					int LA59_3 = input.LA(3);
					if ( (LA59_3==Identifier) ) {
						alt59=2;
					}
					else if ( (LA59_3==FUNC_CALL) ) {
						alt59=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 59, 3, input);
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
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA59_0==LOOKUP) ) {
				int LA59_2 = input.LA(2);
				if ( (LA59_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt59=6;
						}
						break;
					case String:
						{
						alt59=7;
						}
						break;
					case FUNC_CALL:
						{
						alt59=3;
						}
						break;
					case LIST:
						{
						alt59=4;
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
					case 156:
					case 158:
						{
						alt59=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 59, 4, input);
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
							new NoViableAltException("", 59, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:278:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2734); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2736);
					functionCall147=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2738);
					dotProperty148=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall147, dotProperty148);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:279:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2746); 
					match(input, Token.DOWN, null); 
					Identifier149=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2748); 
					pushFollow(FOLLOW_dotProperty_in_lookup2750);
					dotProperty150=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier149!=null?Identifier149.getText():null), currentScope), dotProperty150);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP152=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2774); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2776);
					functionCall151=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:28: (i= indexes )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==INDEXES) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2780);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall151, i,LOOKUP152.getLine()) : functionCall151;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP154=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2792); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2794);
					list153=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:21: (i= indexes )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==INDEXES) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2798);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list153, i, LOOKUP154.getLine()) : list153;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP156=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2818); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2820);
					expression155=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:27: (i= indexes )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==INDEXES) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2824);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression155, i,LOOKUP156.getLine()) : expression155;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP158=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2838); 
					match(input, Token.DOWN, null); 
					Identifier157=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2840); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:27: (i= indexes )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==INDEXES) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2844);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier157!=null?Identifier157.getText():null), currentScope), i,LOOKUP158.getLine()) : new IdentifierNode((Identifier157!=null?Identifier157.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP160=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2858); 
					match(input, Token.DOWN, null); 
					String159=(CommonTree)match(input,String,FOLLOW_String_in_lookup2860); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:23: (i= indexes )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==INDEXES) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2864);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String159!=null?String159.getText():null)), i,LOOKUP160.getLine()) : new AtomNode((String159!=null?String159.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:299:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression161 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2914); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:16: ( expression )+
			int cnt60=0;
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==Add||LA60_0==Bool||LA60_0==COLOR_CONSTANT||LA60_0==DOTPROPERTY||LA60_0==Divide||LA60_0==Equals||(LA60_0 >= GT && LA60_0 <= GTEquals)||LA60_0==HEIGHT_CONSTANT||LA60_0==In||LA60_0==LOOKUP||(LA60_0 >= LT && LA60_0 <= LTEquals)||LA60_0==Modulus||(LA60_0 >= Multiply && LA60_0 <= NEquals)||(LA60_0 >= Null && LA60_0 <= Number)||LA60_0==PI_CONSTANT||LA60_0==Pow||(LA60_0 >= Subtract && LA60_0 <= TERNARY)||LA60_0==UNARY_MIN||LA60_0==WIDTH_CONSTANT||LA60_0==156||LA60_0==158) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2917);
					expression161=expression();
					state._fsp--;

					e.add(expression161);
					}
					break;

				default :
					if ( cnt60 >= 1 ) break loop60;
					EarlyExitException eee = new EarlyExitException(60, input);
					throw eee;
				}
				cnt60++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:306:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression162 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2955); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:12: ( dotExpression )+
			int cnt61=0;
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( ((LA61_0 >= DotEnd && LA61_0 <= DotY)) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2958);
					dotExpression162=dotExpression();
					state._fsp--;

					e.add(dotExpression162);
					}
					break;

				default :
					if ( cnt61 >= 1 ) break loop61;
					EarlyExitException eee = new EarlyExitException(61, input);
					throw eee;
				}
				cnt61++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:311:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:312:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt62=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt62=1;
				}
				break;
			case DotY:
				{
				alt62=2;
				}
				break;
			case DotStart:
				{
				alt62=3;
				}
				break;
			case DotEnd:
				{
				alt62=4;
				}
				break;
			case DotOrigin:
				{
				alt62=5;
				}
				break;
			case DotRotation:
				{
				alt62=6;
				}
				break;
			case DotWidth:
				{
				alt62=7;
				}
				break;
			case DotHeight:
				{
				alt62=8;
				}
				break;
			case DotFill:
				{
				alt62=9;
				}
				break;
			case DotStroke:
				{
				alt62=10;
				}
				break;
			case DotWeight:
				{
				alt62=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:312:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2986); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:313:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2994); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:314:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3002); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:315:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3010); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3018); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:317:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3026); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:318:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3034); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:319:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3042); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:320:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3050); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:321:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3057); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:322:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3064); 
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
	public static final BitSet FOLLOW_statement_in_block102 = new BitSet(new long[]{0x0480000000000048L,0x4000000000010000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RETURN_in_block110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x1808000110024108L,0x0048639032121000L,0x0000000050918000L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x1808000110024108L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall255 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall271 = new BitSet(new long[]{0x1808000110024108L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_functionCall273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall288 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_functionCall290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall307 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_functionCall309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall325 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
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
	public static final BitSet FOLLOW_Copy_in_transformCall661 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
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
	public static final BitSet FOLLOW_NoFill_in_transformCall723 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall735 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall737 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall739 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall751 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall753 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall766 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall768 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall780 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall794 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall809 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall822 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall835 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall849 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall862 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
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
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall929 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall931 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_transformCall933 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall967 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall969 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall983 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall999 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1030 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1032 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1034 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1046 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1048 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1060 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1062 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1074 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1088 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1103 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1118 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1120 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1131 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1133 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1147 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1160 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1162 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1164 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1175 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1177 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1188 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1201 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_mathCall1203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1240 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1254 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1267 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1269 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1280 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1282 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1293 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1295 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1306 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1319 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1331 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1333 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1343 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1354 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_getCall1356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1366 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1380 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1418 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1422 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1450 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_ifStat1452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1473 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1523 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_forStatement1527 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_forStatement1531 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_forStatement1533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1558 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1562 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1566 = new BitSet(new long[]{0x1808000110026100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1571 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1575 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1600 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_whileStatement1602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1632 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1665 = new BitSet(new long[]{0x1808000110024108L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_TERNARY_in_expression1690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1694 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1698 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1717 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1721 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_158_in_expression1750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1754 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1758 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_156_in_expression1785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1789 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1824 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1828 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1859 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1863 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1890 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1894 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1925 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1929 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1933 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1960 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1964 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression1968 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2000 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2004 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2032 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2036 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2040 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2072 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2108 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2144 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2148 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2176 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2180 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression2212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2216 = new BitSet(new long[]{0x1808000110024100L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_expression_in_expression2220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2252 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2711 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2736 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2748 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2776 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_indexes_in_lookup2780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2794 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_indexes_in_lookup2798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2820 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_indexes_in_lookup2824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2840 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_indexes_in_lookup2844 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2858 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2860 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_indexes_in_lookup2864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2914 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2917 = new BitSet(new long[]{0x1808000110024108L,0x0048639032101000L,0x0000000050918000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2958 = new BitSet(new long[]{0x00003FF800000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3064 = new BitSet(new long[]{0x0000000000000002L});
}
