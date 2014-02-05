// $ANTLR 3.5 /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2014-02-04 17:50:40

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.UI.*; 
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
		"Gaussian", "GetAngle", "GetDistance", "GetEnd", "GetFill", "GetHeight", 
		"GetIntersect", "GetOrigin", "GetRadius", "GetRotation", "GetStart", "GetStroke", 
		"GetWidth", "GetX", "GetY", "Grid", "Group", "HEIGHT_CONSTANT", "Heading", 
		"Hide", "ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Inch", 
		"Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", "LT", "LTEquals", 
		"Line", "Map", "Merge", "MirrorX", "MirrorY", "Mm", "Modulus", "Move", 
		"MoveBy", "Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", "Noise", 
		"Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "Pw", "QMark", "Quad", 
		"RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", "Round", "SPECIAL", 
		"STATEMENTS", "SUB_CALL", "Scale", "Show", "Sine", "Size", "Skirt", "SkirtBack", 
		"Slider", "Space", "Spiral", "Sq", "Sqrt", "String", "Stroke", "Subtract", 
		"TERNARY", "Tan", "To", "Triangle", "UNARY_MIN", "Union", "Units", "WIDTH_CONSTANT", 
		"Wave", "Weight", "While", "Xor", "'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__162=162;
	public static final int T__163=163;
	public static final int T__164=164;
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
	public static final int GetAngle=62;
	public static final int GetDistance=63;
	public static final int GetEnd=64;
	public static final int GetFill=65;
	public static final int GetHeight=66;
	public static final int GetIntersect=67;
	public static final int GetOrigin=68;
	public static final int GetRadius=69;
	public static final int GetRotation=70;
	public static final int GetStart=71;
	public static final int GetStroke=72;
	public static final int GetWidth=73;
	public static final int GetX=74;
	public static final int GetY=75;
	public static final int Grid=76;
	public static final int Group=77;
	public static final int HEIGHT_CONSTANT=78;
	public static final int Heading=79;
	public static final int Hide=80;
	public static final int ID_LIST=81;
	public static final int IF=82;
	public static final int INDEXES=83;
	public static final int Identifier=84;
	public static final int If=85;
	public static final int In=86;
	public static final int Inch=87;
	public static final int Int=88;
	public static final int LAdd=89;
	public static final int LIST=90;
	public static final int LOOKUP=91;
	public static final int LRemove=92;
	public static final int LShape=93;
	public static final int LT=94;
	public static final int LTEquals=95;
	public static final int Line=96;
	public static final int Map=97;
	public static final int Merge=98;
	public static final int MirrorX=99;
	public static final int MirrorY=100;
	public static final int Mm=101;
	public static final int Modulus=102;
	public static final int Move=103;
	public static final int MoveBy=104;
	public static final int Multiply=105;
	public static final int NEGATE=106;
	public static final int NEquals=107;
	public static final int NoFill=108;
	public static final int NoStroke=109;
	public static final int Noise=110;
	public static final int Null=111;
	public static final int Number=112;
	public static final int OBrace=113;
	public static final int OBracket=114;
	public static final int OParen=115;
	public static final int Or=116;
	public static final int PI_CONSTANT=117;
	public static final int Point=118;
	public static final int Polygon=119;
	public static final int Pow=120;
	public static final int Print=121;
	public static final int Println=122;
	public static final int Pw=123;
	public static final int QMark=124;
	public static final int Quad=125;
	public static final int RETURN=126;
	public static final int Random=127;
	public static final int Rect=128;
	public static final int Repeat=129;
	public static final int Return=130;
	public static final int Rotate=131;
	public static final int Round=132;
	public static final int SPECIAL=133;
	public static final int STATEMENTS=134;
	public static final int SUB_CALL=135;
	public static final int Scale=136;
	public static final int Show=137;
	public static final int Sine=138;
	public static final int Size=139;
	public static final int Skirt=140;
	public static final int SkirtBack=141;
	public static final int Slider=142;
	public static final int Space=143;
	public static final int Spiral=144;
	public static final int Sq=145;
	public static final int Sqrt=146;
	public static final int String=147;
	public static final int Stroke=148;
	public static final int Subtract=149;
	public static final int TERNARY=150;
	public static final int Tan=151;
	public static final int To=152;
	public static final int Triangle=153;
	public static final int UNARY_MIN=154;
	public static final int Union=155;
	public static final int Units=156;
	public static final int WIDTH_CONSTANT=157;
	public static final int Wave=158;
	public static final int Weight=159;
	public static final int While=160;
	public static final int Xor=161;

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
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g"; }


	 
	 double widthParam;
	 double heightParam;
	 int unitParam;
	 DrawableManager drawableManager;
	 UserUIManager uiManager;
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
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui,double w, double h,int u) {
	    this(nodes, null, fns,dm,ui,w,h,u);
	   
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui, double w,double h, int u) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	    this.drawableManager = dm;
	    this.uiManager = ui;
	    widthParam = w;
	    heightParam = h;
	    unitParam = u;
	  }
	  



	// $ANTLR start "walk"
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:67:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:68:3: ( block )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:68:6: block
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block96); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block99); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:28: statement
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
				// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pw||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==162||LA2_0==164) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:87: expression
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:88:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement142);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement155);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement166);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement178);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement189);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:5: repeatStatement
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:100:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		CommonTree ASSIGNMENT13=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT13=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||LA5_0==162||LA5_0==164) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:101:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment225);
					expression12=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier10!=null?Identifier10.getText():null), indexes11, expression12, currentScope,ASSIGNMENT13.getLine());
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier14=null;
		CommonTree FUNC_CALL16=null;
		CommonTree FUNC_CALL22=null;
		CommonTree FUNC_CALL24=null;
		java.util.List<DCNode> exprList15 =null;
		DCNode expression17 =null;
		DCNode expression18 =null;
		DCNode expression19 =null;
		DCNode expression20 =null;
		java.util.List<DCNode> exprList21 =null;
		java.util.List<DCNode> exprList23 =null;
		DCNode primitiveCall25 =null;
		DCNode transformCall26 =null;
		DCNode patternCall27 =null;
		DCNode mathCall28 =null;
		DCNode getCall29 =null;
		DCNode uICall30 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall )
			int alt10=13;
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
					case Pow:
					case Random:
					case Round:
					case Sine:
					case Sq:
					case Sqrt:
					case Tan:
					case Units:
						{
						alt10=11;
						}
						break;
					case GetAngle:
					case GetDistance:
					case GetEnd:
					case GetFill:
					case GetHeight:
					case GetIntersect:
					case GetOrigin:
					case GetRadius:
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
					case Slider:
						{
						alt10=13;
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL16=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall253); 
					match(input, Token.DOWN, null); 
					Identifier14=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall255); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall257);
							exprList15=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier14!=null?Identifier14.getText():null), exprList15, functions, widthParam, heightParam, unitParam,FUNC_CALL16.getLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall269); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall271); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||LA7_0==162||LA7_0==164) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall273);
							expression17=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall286); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall288); 
					pushFollow(FOLLOW_expression_in_functionCall290);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall305); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall307); 
					pushFollow(FOLLOW_expression_in_functionCall309);
					expression19=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression19); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall323); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall325); 
					pushFollow(FOLLOW_expression_in_functionCall327);
					expression20=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression20); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall343); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall345); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall347);
							exprList21=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList21,FUNC_CALL22.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL24=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall360); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall362); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall364);
							exprList23=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList23,FUNC_CALL24.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall375);
					primitiveCall25=primitiveCall();
					state._fsp--;

					node = primitiveCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall384);
					transformCall26=transformCall();
					state._fsp--;

					node = transformCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall393);
					patternCall27=patternCall();
					state._fsp--;

					node = patternCall27; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall402);
					mathCall28=mathCall();
					state._fsp--;

					node= mathCall28; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall411);
					getCall29=getCall();
					state._fsp--;

					node= getCall29; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall419);
					uICall30=uICall();
					state._fsp--;

					node = uICall30; ((NodeEvent)node).addEventListener(uiManager);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL32=null;
		CommonTree FUNC_CALL34=null;
		CommonTree FUNC_CALL36=null;
		CommonTree FUNC_CALL38=null;
		CommonTree FUNC_CALL40=null;
		CommonTree FUNC_CALL42=null;
		CommonTree FUNC_CALL44=null;
		java.util.List<DCNode> exprList31 =null;
		java.util.List<DCNode> exprList33 =null;
		java.util.List<DCNode> exprList35 =null;
		java.util.List<DCNode> exprList37 =null;
		java.util.List<DCNode> exprList39 =null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL32=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall446); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall448); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall450);
							exprList31=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList31,FUNC_CALL32.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL34=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall462); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall464); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall466);
							exprList33=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList33,FUNC_CALL34.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL36=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall479); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall481); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall483);
							exprList35=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList35,FUNC_CALL36.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall497); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall499); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall501);
							exprList37=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList37,FUNC_CALL38.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall515); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall517); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall519);
							exprList39=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList39,FUNC_CALL40.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall531); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall533); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall535);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall547); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall549); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall551);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall563); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall565); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall567);
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall580); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall582); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall584);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
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
		CommonTree FUNC_CALL86=null;
		CommonTree FUNC_CALL88=null;
		CommonTree FUNC_CALL90=null;
		java.util.List<DCNode> exprList45 =null;
		java.util.List<DCNode> exprList47 =null;
		java.util.List<DCNode> exprList49 =null;
		DCNode expression51 =null;
		java.util.List<DCNode> exprList53 =null;
		java.util.List<DCNode> exprList55 =null;
		java.util.List<DCNode> exprList57 =null;
		DCNode expression59 =null;
		DCNode expression61 =null;
		java.util.List<DCNode> exprList63 =null;
		DCNode expression65 =null;
		DCNode expression67 =null;
		java.util.List<DCNode> exprList69 =null;
		DCNode expression71 =null;
		DCNode expression73 =null;
		java.util.List<DCNode> exprList75 =null;
		DCNode expression77 =null;
		DCNode expression79 =null;
		java.util.List<DCNode> exprList81 =null;
		java.util.List<DCNode> exprList83 =null;
		java.util.List<DCNode> exprList85 =null;
		java.util.List<DCNode> exprList87 =null;
		DCNode expression89 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall611); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall613); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall615);
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall629); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall631); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall633);
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall647); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall649); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall651);
							exprList49=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList49,FUNC_CALL50.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall664); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall666); 
					pushFollow(FOLLOW_expression_in_transformCall668);
					expression51=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression51,FUNC_CALL52.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall679); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall681); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall683);
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList53,currentScope,FUNC_CALL54.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall694); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall696); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall698);
							exprList55=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList55,FUNC_CALL56.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall711); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall713); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall715);
							exprList57=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList57,FUNC_CALL58.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall726); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall728); 
					pushFollow(FOLLOW_expression_in_transformCall730);
					expression59=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression59 ,FUNC_CALL60.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall740); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall742); 
					pushFollow(FOLLOW_expression_in_transformCall744);
					expression61=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression61,FUNC_CALL62.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall754); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall756); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall758);
							exprList63=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList63,FUNC_CALL64.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall769); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall771); 
					pushFollow(FOLLOW_expression_in_transformCall773);
					expression65=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression65,FUNC_CALL66.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall783); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall785); 
					pushFollow(FOLLOW_expression_in_transformCall787);
					expression67=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression67,FUNC_CALL68.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall797); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall799); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall801);
							exprList69=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList69,FUNC_CALL70.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall812); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall814); 
					pushFollow(FOLLOW_expression_in_transformCall816);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression71, currentScope, FUNC_CALL72.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall825); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall827); 
					pushFollow(FOLLOW_expression_in_transformCall829);
					expression73=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression73,currentScope,FUNC_CALL74.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall838); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall840); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall842);
							exprList75=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList75,FUNC_CALL76.getLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall852); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall854); 
					pushFollow(FOLLOW_expression_in_transformCall856);
					expression77=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression77,FUNC_CALL78.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall865); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall867); 
					pushFollow(FOLLOW_expression_in_transformCall869);
					expression79=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression79,FUNC_CALL80.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall878); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall880); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall882);
							exprList81=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList81, currentScope, FUNC_CALL82.getLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall892); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall894); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall896);
							exprList83=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList83, currentScope, FUNC_CALL84.getLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall906); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall908); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall910);
							exprList85=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList85, currentScope, FUNC_CALL86.getLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall920); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall922); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall924);
							exprList87=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList87, currentScope, FUNC_CALL88.getLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall934); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall936); 
					pushFollow(FOLLOW_expression_in_transformCall938);
					expression89=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression89,currentScope, FUNC_CALL90.getLine());
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		CommonTree FUNC_CALL96=null;
		java.util.List<DCNode> exprList91 =null;
		java.util.List<DCNode> exprList93 =null;
		java.util.List<DCNode> exprList95 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall970); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall972); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall974);
							exprList91=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList91,currentScope,FUNC_CALL92.getLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall986); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall988); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall990);
							exprList93=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList93,currentScope,FUNC_CALL94.getLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1002); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1004); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1006);
							exprList95=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList95,currentScope,FUNC_CALL96.getLine(),widthParam, heightParam);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL122=null;
		CommonTree FUNC_CALL124=null;
		CommonTree FUNC_CALL126=null;
		CommonTree FUNC_CALL128=null;
		DCNode expression97 =null;
		DCNode expression99 =null;
		DCNode expression101 =null;
		java.util.List<DCNode> exprList103 =null;
		java.util.List<DCNode> exprList105 =null;
		java.util.List<DCNode> exprList107 =null;
		DCNode expression109 =null;
		DCNode expression111 =null;
		java.util.List<DCNode> exprList113 =null;
		java.util.List<DCNode> exprList115 =null;
		DCNode expression117 =null;
		java.util.List<DCNode> exprList119 =null;
		DCNode expression121 =null;
		DCNode expression123 =null;
		DCNode expression125 =null;
		DCNode expression127 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
			int alt45=16;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==FUNC_CALL) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt45=1;
						}
						break;
					case Sine:
						{
						alt45=2;
						}
						break;
					case Tan:
						{
						alt45=3;
						}
						break;
					case ATan:
						{
						alt45=4;
						}
						break;
					case Random:
						{
						alt45=5;
						}
						break;
					case Pow:
						{
						alt45=6;
						}
						break;
					case Sqrt:
						{
						alt45=7;
						}
						break;
					case Sq:
						{
						alt45=8;
						}
						break;
					case Gaussian:
						{
						alt45=9;
						}
						break;
					case Noise:
						{
						alt45=10;
						}
						break;
					case Round:
						{
						alt45=11;
						}
						break;
					case Map:
						{
						alt45=12;
						}
						break;
					case Inch:
						{
						alt45=13;
						}
						break;
					case Mm:
						{
						alt45=14;
						}
						break;
					case Cm:
						{
						alt45=15;
						}
						break;
					case Units:
						{
						alt45=16;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 2, input);
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
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1038); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1040); 
					pushFollow(FOLLOW_expression_in_mathCall1042);
					expression97=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression97,FUNC_CALL98.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL100=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1052); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1054); 
					pushFollow(FOLLOW_expression_in_mathCall1056);
					expression99=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression99,FUNC_CALL100.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL102=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1066); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1068); 
					pushFollow(FOLLOW_expression_in_mathCall1070);
					expression101=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression101,FUNC_CALL102.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL104=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1080); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1082); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:22: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1084);
							exprList103=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ATanNode(exprList103,FUNC_CALL104.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL106=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1095); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1097); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:24: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1099);
							exprList105=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList105,FUNC_CALL106.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL108=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1110); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1112); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:21: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1114);
							exprList107=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PowFNode(exprList107,FUNC_CALL108.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL110=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1124); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1126); 
					pushFollow(FOLLOW_expression_in_mathCall1128);
					expression109=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression109,FUNC_CALL110.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL112=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1137); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1139); 
					pushFollow(FOLLOW_expression_in_mathCall1141);
					expression111=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression111,FUNC_CALL112.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL114=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1150); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1152); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:26: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1154);
							exprList113=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList113,FUNC_CALL114.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL116=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1165); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1167); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:23: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1169);
							exprList115=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList115,FUNC_CALL116.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL118=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1180); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1182); 
					pushFollow(FOLLOW_expression_in_mathCall1184);
					expression117=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression117,FUNC_CALL118.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL120=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1194); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1196); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:21: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1198);
							exprList119=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList119,FUNC_CALL120.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL122=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1209); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1211); 
					pushFollow(FOLLOW_expression_in_mathCall1213);
					expression121=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression121,"inch",unitParam,FUNC_CALL122.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL124=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1222); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1224); 
					pushFollow(FOLLOW_expression_in_mathCall1226);
					expression123=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression123,"mm",unitParam,FUNC_CALL124.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL126=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1235); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1237); 
					pushFollow(FOLLOW_expression_in_mathCall1239);
					expression125=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression125,"cm",unitParam,FUNC_CALL126.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL128=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1248); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1250); 
					pushFollow(FOLLOW_expression_in_mathCall1252);
					expression127=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression127,"units",unitParam,FUNC_CALL128.getLine());
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		DCNode expression129 =null;
		DCNode expression130 =null;
		DCNode expression131 =null;
		DCNode expression132 =null;
		DCNode expression133 =null;
		DCNode expression134 =null;
		java.util.List<DCNode> exprList135 =null;
		java.util.List<DCNode> exprList136 =null;
		java.util.List<DCNode> exprList137 =null;
		java.util.List<DCNode> exprList138 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
			int alt50=14;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==FUNC_CALL) ) {
				int LA50_1 = input.LA(2);
				if ( (LA50_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt50=1;
						}
						break;
					case GetHeight:
						{
						alt50=2;
						}
						break;
					case GetX:
						{
						alt50=3;
						}
						break;
					case GetY:
						{
						alt50=4;
						}
						break;
					case GetOrigin:
						{
						alt50=5;
						}
						break;
					case GetRotation:
						{
						alt50=6;
						}
						break;
					case GetFill:
						{
						alt50=7;
						}
						break;
					case GetStroke:
						{
						alt50=8;
						}
						break;
					case GetStart:
						{
						alt50=9;
						}
						break;
					case GetEnd:
						{
						alt50=10;
						}
						break;
					case GetDistance:
						{
						alt50=11;
						}
						break;
					case GetIntersect:
						{
						alt50=12;
						}
						break;
					case GetAngle:
						{
						alt50=13;
						}
						break;
					case GetRadius:
						{
						alt50=14;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 50, 2, input);
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1290); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1292); 
					pushFollow(FOLLOW_expression_in_getCall1294);
					expression129=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression129);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1304); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1306); 
					pushFollow(FOLLOW_expression_in_getCall1308);
					expression130=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression130);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1317); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1319); 
					pushFollow(FOLLOW_expression_in_getCall1321);
					expression131=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression131);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1330); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1332); 
					pushFollow(FOLLOW_expression_in_getCall1334);
					expression132=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression132);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1343); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1345); 
					pushFollow(FOLLOW_expression_in_getCall1347);
					expression133=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression133);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1356); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1358); 
					pushFollow(FOLLOW_expression_in_getCall1360);
					expression134=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression134);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1369); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1371); 
					pushFollow(FOLLOW_expression_in_getCall1373);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1381); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1383); 
					pushFollow(FOLLOW_expression_in_getCall1385);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1393); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1395); 
					pushFollow(FOLLOW_expression_in_getCall1397);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1404); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1406); 
					pushFollow(FOLLOW_expression_in_getCall1408);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1416); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1418); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:28: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==EXP_LIST) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1420);
							exprList135=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList135);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1430); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1432); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:29: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1434);
							exprList136=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList136);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1444); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1446); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:25: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1448);
							exprList137=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetAngleNode(exprList137);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1459); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1461); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:26: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==EXP_LIST) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1463);
							exprList138=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetRadiusNode(exprList138);
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



	// $ANTLR start "uICall"
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList139 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1491); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1493); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:25: ( exprList )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==EXP_LIST) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1495);
					exprList139=exprList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new SliderNode(exprList139,currentScope);
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
	// $ANTLR end "uICall"



	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1534); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1536);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:26: ( elseIfStat[ifNode] )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==EXP) ) {
					int LA52_1 = input.LA(2);
					if ( (LA52_1==DOWN) ) {
						int LA52_3 = input.LA(3);
						if ( (LA52_3==Add||LA52_3==Bool||LA52_3==COLOR_CONSTANT||LA52_3==DOTPROPERTY||LA52_3==Divide||LA52_3==Equals||(LA52_3 >= GT && LA52_3 <= GTEquals)||LA52_3==HEIGHT_CONSTANT||LA52_3==In||LA52_3==LOOKUP||(LA52_3 >= LT && LA52_3 <= LTEquals)||LA52_3==Modulus||(LA52_3 >= Multiply && LA52_3 <= NEquals)||(LA52_3 >= Null && LA52_3 <= Number)||LA52_3==PI_CONSTANT||LA52_3==Pw||(LA52_3 >= Subtract && LA52_3 <= TERNARY)||LA52_3==UNARY_MIN||LA52_3==WIDTH_CONSTANT||LA52_3==162||LA52_3==164) ) {
							alt52=1;
						}

					}

				}

				switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1540);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop52;
				}
			}

			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:48: ( elseStat[ifNode] )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EXP) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1546);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression140 =null;
		BlockNode block141 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1566); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1568);
			expression140=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1570);
			block141=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression140, block141);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression142 =null;
		BlockNode block143 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1589); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1591);
			expression142=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1593);
			block143=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression142, block143);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:229:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block144 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1612); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1614);
			block144=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block144);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier145=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block146 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1639); 
			match(input, Token.DOWN, null); 
			Identifier145=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1641); 
			pushFollow(FOLLOW_expression_in_forStatement1645);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1649);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1651);
			block146=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier145!=null?Identifier145.getText():null), a, b, block146, currentScope);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier147=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block148 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1674); 
			match(input, Token.DOWN, null); 
			Identifier147=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1676); 
			pushFollow(FOLLOW_expression_in_repeatStatement1680);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1684);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:51: (c= expression )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==Add||LA54_0==Bool||LA54_0==COLOR_CONSTANT||LA54_0==DOTPROPERTY||LA54_0==Divide||LA54_0==Equals||(LA54_0 >= GT && LA54_0 <= GTEquals)||LA54_0==HEIGHT_CONSTANT||LA54_0==In||LA54_0==LOOKUP||(LA54_0 >= LT && LA54_0 <= LTEquals)||LA54_0==Modulus||(LA54_0 >= Multiply && LA54_0 <= NEquals)||(LA54_0 >= Null && LA54_0 <= Number)||LA54_0==PI_CONSTANT||LA54_0==Pw||(LA54_0 >= Subtract && LA54_0 <= TERNARY)||LA54_0==UNARY_MIN||LA54_0==WIDTH_CONSTANT||LA54_0==162||LA54_0==164) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1689);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1693);
			block148=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier147!=null?Identifier147.getText():null), a, b, c, block148, currentScope);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression149 =null;
		BlockNode block150 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1716); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1718);
			expression149=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1720);
			block150=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression149, block150);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier151=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1747); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:16: ( Identifier )+
			int cnt55=0;
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==Identifier) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:17: Identifier
					{
					Identifier151=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1750); 
					i.add((Identifier151!=null?Identifier151.getText():null));
					}
					break;

				default :
					if ( cnt55 >= 1 ) break loop55;
					EarlyExitException eee = new EarlyExitException(55, input);
					throw eee;
				}
				cnt55++;
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression152 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1780); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:17: ( expression )+
			int cnt56=0;
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Add||LA56_0==Bool||LA56_0==COLOR_CONSTANT||LA56_0==DOTPROPERTY||LA56_0==Divide||LA56_0==Equals||(LA56_0 >= GT && LA56_0 <= GTEquals)||LA56_0==HEIGHT_CONSTANT||LA56_0==In||LA56_0==LOOKUP||(LA56_0 >= LT && LA56_0 <= LTEquals)||LA56_0==Modulus||(LA56_0 >= Multiply && LA56_0 <= NEquals)||(LA56_0 >= Null && LA56_0 <= Number)||LA56_0==PI_CONSTANT||LA56_0==Pw||(LA56_0 >= Subtract && LA56_0 <= TERNARY)||LA56_0==UNARY_MIN||LA56_0==WIDTH_CONSTANT||LA56_0==162||LA56_0==164) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1783);
					expression152=expression();
					state._fsp--;

					e.add(expression152);
					}
					break;

				default :
					if ( cnt56 >= 1 ) break loop56;
					EarlyExitException eee = new EarlyExitException(56, input);
					throw eee;
				}
				cnt56++;
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:257:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number153=null;
		CommonTree Bool154=null;
		CommonTree COLOR_CONSTANT156=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup155 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt57=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt57=1;
				}
				break;
			case In:
				{
				alt57=2;
				}
				break;
			case 164:
				{
				alt57=3;
				}
				break;
			case 162:
				{
				alt57=4;
				}
				break;
			case Equals:
				{
				alt57=5;
				}
				break;
			case NEquals:
				{
				alt57=6;
				}
				break;
			case GTEquals:
				{
				alt57=7;
				}
				break;
			case LTEquals:
				{
				alt57=8;
				}
				break;
			case GT:
				{
				alt57=9;
				}
				break;
			case LT:
				{
				alt57=10;
				}
				break;
			case Add:
				{
				alt57=11;
				}
				break;
			case Subtract:
				{
				alt57=12;
				}
				break;
			case Multiply:
				{
				alt57=13;
				}
				break;
			case Divide:
				{
				alt57=14;
				}
				break;
			case Modulus:
				{
				alt57=15;
				}
				break;
			case Pw:
				{
				alt57=16;
				}
				break;
			case UNARY_MIN:
				{
				alt57=17;
				}
				break;
			case NEGATE:
				{
				alt57=18;
				}
				break;
			case Number:
				{
				alt57=19;
				}
				break;
			case Bool:
				{
				alt57=20;
				}
				break;
			case Null:
				{
				alt57=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt57=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt57=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt57=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt57=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt57=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1808); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1812);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1816);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1820);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1831); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1835);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1839);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:260:6: ^( '||' a= expression b= expression )
					{
					match(input,164,FOLLOW_164_in_expression1868); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1872);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1876);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:6: ^( '&&' a= expression b= expression )
					{
					match(input,162,FOLLOW_162_in_expression1903); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1907);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1911);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1938); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1942);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1946);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1973); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1977);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1981);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2008); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2012);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2016);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2043); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2047);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2051);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2078); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2082);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2086);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2114); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2118);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2122);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2150); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2154);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2158);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2186); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2190);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2194);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:270:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2222); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2226);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2230);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:271:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2258); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2262);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2266);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:272:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2294); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2298);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2302);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:273:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2330); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2334);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2338);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:274:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2366); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2370);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2405); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2409);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:276:6: Number
					{
					Number153=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2446); 
					node = new AtomNode(Double.parseDouble((Number153!=null?Number153.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:6: Bool
					{
					Bool154=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2498); 
					node = new AtomNode(Boolean.parseBoolean((Bool154!=null?Bool154.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:278:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2552); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:279:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2606);
					lookup155=lookup();
					state._fsp--;

					node = lookup155;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT156=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2658); 
					node = new AtomNode((COLOR_CONSTANT156!=null?COLOR_CONSTANT156.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:281:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2677); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2723); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:283:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2768); 
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList157 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2827); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:13: ( exprList )?
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==EXP_LIST) ) {
					alt58=1;
				}
				switch (alt58) {
					case 1 :
						// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2829);
						exprList157=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList157);
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:292:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier160=null;
		CommonTree DOTPROPERTY161=null;
		CommonTree LOOKUP164=null;
		CommonTree LOOKUP166=null;
		CommonTree LOOKUP168=null;
		CommonTree Identifier169=null;
		CommonTree LOOKUP170=null;
		CommonTree String171=null;
		CommonTree LOOKUP172=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall158 =null;
		java.util.List<PropertyNode> dotProperty159 =null;
		java.util.List<PropertyNode> dotProperty162 =null;
		DCNode functionCall163 =null;
		DCNode list165 =null;
		DCNode expression167 =null;

		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt64=7;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==DOTPROPERTY) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==DOWN) ) {
					int LA64_3 = input.LA(3);
					if ( (LA64_3==Identifier) ) {
						alt64=2;
					}
					else if ( (LA64_3==FUNC_CALL) ) {
						alt64=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 3, input);
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
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA64_0==LOOKUP) ) {
				int LA64_2 = input.LA(2);
				if ( (LA64_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt64=6;
						}
						break;
					case String:
						{
						alt64=7;
						}
						break;
					case FUNC_CALL:
						{
						alt64=3;
						}
						break;
					case LIST:
						{
						alt64=4;
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
					case Pw:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case WIDTH_CONSTANT:
					case 162:
					case 164:
						{
						alt64=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 4, input);
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
							new NoViableAltException("", 64, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2852); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2854);
					functionCall158=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2856);
					dotProperty159=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall158, dotProperty159);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:294:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY161=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2864); 
					match(input, Token.DOWN, null); 
					Identifier160=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2866); 
					pushFollow(FOLLOW_dotProperty_in_lookup2868);
					dotProperty162=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier160!=null?Identifier160.getText():null), currentScope,DOTPROPERTY161.getLine()), dotProperty162);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:300:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP164=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2892); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2894);
					functionCall163=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:300:28: (i= indexes )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==INDEXES) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:300:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2898);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall163, i,LOOKUP164.getLine()) : functionCall163;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP166=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2910); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2912);
					list165=list();
					state._fsp--;

					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:21: (i= indexes )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==INDEXES) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2916);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list165, i, LOOKUP166.getLine()) : list165;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:302:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP168=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2936); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2938);
					expression167=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:302:27: (i= indexes )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==INDEXES) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:302:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2942);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression167, i,LOOKUP168.getLine()) : expression167;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP170=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2956); 
					match(input, Token.DOWN, null); 
					Identifier169=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2958); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:27: (i= indexes )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==INDEXES) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2962);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier169!=null?Identifier169.getText():null), currentScope,LOOKUP170.getLine()), i,LOOKUP170.getLine()) : new IdentifierNode((Identifier169!=null?Identifier169.getText():null), currentScope,LOOKUP170.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:304:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP172=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2976); 
					match(input, Token.DOWN, null); 
					String171=(CommonTree)match(input,String,FOLLOW_String_in_lookup2978); 
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:304:23: (i= indexes )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==INDEXES) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:304:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2982);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String171!=null?String171.getText():null)), i,LOOKUP172.getLine()) : new AtomNode((String171!=null?String171.getText():null));
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:314:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression173 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3032); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:16: ( expression )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==Add||LA65_0==Bool||LA65_0==COLOR_CONSTANT||LA65_0==DOTPROPERTY||LA65_0==Divide||LA65_0==Equals||(LA65_0 >= GT && LA65_0 <= GTEquals)||LA65_0==HEIGHT_CONSTANT||LA65_0==In||LA65_0==LOOKUP||(LA65_0 >= LT && LA65_0 <= LTEquals)||LA65_0==Modulus||(LA65_0 >= Multiply && LA65_0 <= NEquals)||(LA65_0 >= Null && LA65_0 <= Number)||LA65_0==PI_CONSTANT||LA65_0==Pw||(LA65_0 >= Subtract && LA65_0 <= TERNARY)||LA65_0==UNARY_MIN||LA65_0==WIDTH_CONSTANT||LA65_0==162||LA65_0==164) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3035);
					expression173=expression();
					state._fsp--;

					e.add(expression173);
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:321:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression174 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:323:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:323:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3073); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:323:12: ( dotExpression )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( ((LA66_0 >= DotEnd && LA66_0 <= DotY)) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:323:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3076);
					dotExpression174=dotExpression();
					state._fsp--;

					e.add(dotExpression174);
					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					EarlyExitException eee = new EarlyExitException(66, input);
					throw eee;
				}
				cnt66++;
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
	// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:326:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:327:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt67=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt67=1;
				}
				break;
			case DotY:
				{
				alt67=2;
				}
				break;
			case DotStart:
				{
				alt67=3;
				}
				break;
			case DotEnd:
				{
				alt67=4;
				}
				break;
			case DotOrigin:
				{
				alt67=5;
				}
				break;
			case DotRotation:
				{
				alt67=6;
				}
				break;
			case DotWidth:
				{
				alt67=7;
				}
				break;
			case DotHeight:
				{
				alt67=8;
				}
				break;
			case DotFill:
				{
				alt67=9;
				}
				break;
			case DotStroke:
				{
				alt67=10;
				}
				break;
			case DotWeight:
				{
				alt67=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:327:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3104); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:328:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3112); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:329:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3120); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:330:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3128); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:331:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3136); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:332:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3144); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:333:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3152); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:334:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3160); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:335:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3168); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:336:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3175); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Desktop/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:337:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3182); 
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
	public static final BitSet FOLLOW_statement_in_block102 = new BitSet(new long[]{0x0480000000000048L,0x0000000000040000L,0x0000000100000002L});
	public static final BitSet FOLLOW_RETURN_in_block110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x1808000110024108L,0x08218E40C8484000L,0x0000001424600000L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x1808000110024108L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall255 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall271 = new BitSet(new long[]{0x1808000110024108L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_functionCall273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall288 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_functionCall290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall307 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_functionCall309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall325 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
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
	public static final BitSet FOLLOW_uICall_in_functionCall419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall448 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall450 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall462 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall464 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall481 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall499 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall517 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall533 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall549 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall551 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall565 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall582 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall613 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall631 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall649 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall666 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall681 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall696 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall698 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall713 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall726 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall728 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall742 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall756 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall758 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall769 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall771 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall785 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall787 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall799 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall801 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall812 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall814 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall816 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall827 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall840 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall854 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall865 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall867 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall869 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall880 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall882 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall894 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall896 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall906 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall908 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall910 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall922 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall924 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall934 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall936 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_transformCall938 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall972 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall988 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall990 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1004 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1006 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1038 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1040 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1042 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1052 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1054 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1056 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1066 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1068 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1080 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1082 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1084 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1097 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1112 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1114 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1126 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1139 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1152 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1167 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1182 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1196 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1198 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1211 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1224 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1226 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1237 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1250 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_mathCall1252 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1292 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1306 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1319 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1332 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1345 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1358 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1371 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1383 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1395 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1397 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1406 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_getCall1408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1418 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1432 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1434 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1446 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1461 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1491 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1493 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1495 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1536 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1540 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1566 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1568 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_ifStat1570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1591 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1593 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1614 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1639 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1641 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_forStatement1645 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_forStatement1649 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_forStatement1651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1676 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1680 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1684 = new BitSet(new long[]{0x1808000110026100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1689 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1718 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_block_in_whileStatement1720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1750 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1783 = new BitSet(new long[]{0x1808000110024108L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_TERNARY_in_expression1808 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1812 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1816 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1835 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1839 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_164_in_expression1868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1872 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1876 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_162_in_expression1903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1907 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1942 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1977 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression1981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2012 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2016 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2047 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2051 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2082 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2118 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2154 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2190 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2194 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2226 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2262 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2298 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2334 = new BitSet(new long[]{0x1808000110024100L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_expression_in_expression2338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2370 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2854 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2866 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2894 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_indexes_in_lookup2898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2912 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_indexes_in_lookup2916 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2938 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_indexes_in_lookup2942 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2956 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2958 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_indexes_in_lookup2962 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2976 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2978 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_indexes_in_lookup2982 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3032 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3035 = new BitSet(new long[]{0x1808000110024108L,0x08218E40C8404000L,0x0000001424600000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3076 = new BitSet(new long[]{0x00003FF800000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3182 = new BitSet(new long[]{0x0000000000000002L});
}
