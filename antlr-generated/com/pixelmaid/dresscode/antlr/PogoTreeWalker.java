// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2014-03-25 18:17:15

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.UI.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.templates.*;
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
		"ATan", "Add", "AddDesign", "And", "Arc", "Assert", "Assign", "BLOCK", 
		"Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", "Clip", "Cm", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Def", "Difference", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", 
		"DotHeight", "DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", 
		"DotWidth", "DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", 
		"Equals", "Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "Flatten", 
		"For", "GT", "GTEquals", "Gaussian", "GetAngle", "GetDistance", "GetEnd", 
		"GetFill", "GetHeight", "GetIntersect", "GetOrigin", "GetRadius", "GetRotation", 
		"GetStart", "GetStroke", "GetWidth", "GetX", "GetY", "Grid", "Group", 
		"HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", 
		"If", "In", "Inch", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", 
		"LT", "LTEquals", "Line", "Map", "Merge", "MirrorX", "MirrorY", "Mm", 
		"Modulus", "Move", "MoveBy", "Multiply", "NEGATE", "NEquals", "NoFill", 
		"NoStroke", "Noise", "Null", "Number", "OBrace", "OBracket", "OParen", 
		"Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", "Pw", 
		"QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", 
		"Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "SetCorner", "SetHFold", 
		"SetHeight", "SetName", "SetSeam", "SetVFold", "SetWidth", "Show", "Sine", 
		"Size", "Skirt", "SkirtBack", "Slider", "Space", "Spiral", "Sq", "Sqrt", 
		"String", "Stroke", "Subtract", "TERNARY", "Tan", "Template", "TemplateCollection", 
		"To", "Triangle", "UNARY_MIN", "Union", "Units", "WIDTH_CONSTANT", "Wave", 
		"Weight", "While", "Xor", "'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__172=172;
	public static final int T__173=173;
	public static final int T__174=174;
	public static final int ADD_CALL=4;
	public static final int AND_CALL=5;
	public static final int ASSIGNMENT=6;
	public static final int ATan=7;
	public static final int Add=8;
	public static final int AddDesign=9;
	public static final int And=10;
	public static final int Arc=11;
	public static final int Assert=12;
	public static final int Assign=13;
	public static final int BLOCK=14;
	public static final int Bool=15;
	public static final int CBrace=16;
	public static final int CBracket=17;
	public static final int COLOR_CONSTANT=18;
	public static final int CParen=19;
	public static final int Clip=20;
	public static final int Cm=21;
	public static final int Comma=22;
	public static final int Comment=23;
	public static final int Copy=24;
	public static final int Cosine=25;
	public static final int Curve=26;
	public static final int DOT=27;
	public static final int DOTLOOKUP=28;
	public static final int DOTPROPERTY=29;
	public static final int Def=30;
	public static final int Difference=31;
	public static final int Digit=32;
	public static final int Divide=33;
	public static final int Do=34;
	public static final int Dot=35;
	public static final int DotEnd=36;
	public static final int DotFill=37;
	public static final int DotHeight=38;
	public static final int DotOrigin=39;
	public static final int DotRotation=40;
	public static final int DotStart=41;
	public static final int DotStroke=42;
	public static final int DotWeight=43;
	public static final int DotWidth=44;
	public static final int DotX=45;
	public static final int DotY=46;
	public static final int EXP=47;
	public static final int EXP_LIST=48;
	public static final int Ellipse=49;
	public static final int Else=50;
	public static final int End=51;
	public static final int Equals=52;
	public static final int Excl=53;
	public static final int Expand=54;
	public static final int FUNCTION=55;
	public static final int FUNC_CALL=56;
	public static final int Fill=57;
	public static final int Flatten=58;
	public static final int For=59;
	public static final int GT=60;
	public static final int GTEquals=61;
	public static final int Gaussian=62;
	public static final int GetAngle=63;
	public static final int GetDistance=64;
	public static final int GetEnd=65;
	public static final int GetFill=66;
	public static final int GetHeight=67;
	public static final int GetIntersect=68;
	public static final int GetOrigin=69;
	public static final int GetRadius=70;
	public static final int GetRotation=71;
	public static final int GetStart=72;
	public static final int GetStroke=73;
	public static final int GetWidth=74;
	public static final int GetX=75;
	public static final int GetY=76;
	public static final int Grid=77;
	public static final int Group=78;
	public static final int HEIGHT_CONSTANT=79;
	public static final int Heading=80;
	public static final int Hide=81;
	public static final int ID_LIST=82;
	public static final int IF=83;
	public static final int INDEXES=84;
	public static final int Identifier=85;
	public static final int If=86;
	public static final int In=87;
	public static final int Inch=88;
	public static final int Int=89;
	public static final int LAdd=90;
	public static final int LIST=91;
	public static final int LOOKUP=92;
	public static final int LRemove=93;
	public static final int LShape=94;
	public static final int LT=95;
	public static final int LTEquals=96;
	public static final int Line=97;
	public static final int Map=98;
	public static final int Merge=99;
	public static final int MirrorX=100;
	public static final int MirrorY=101;
	public static final int Mm=102;
	public static final int Modulus=103;
	public static final int Move=104;
	public static final int MoveBy=105;
	public static final int Multiply=106;
	public static final int NEGATE=107;
	public static final int NEquals=108;
	public static final int NoFill=109;
	public static final int NoStroke=110;
	public static final int Noise=111;
	public static final int Null=112;
	public static final int Number=113;
	public static final int OBrace=114;
	public static final int OBracket=115;
	public static final int OParen=116;
	public static final int Or=117;
	public static final int PI_CONSTANT=118;
	public static final int Point=119;
	public static final int Polygon=120;
	public static final int Pow=121;
	public static final int Print=122;
	public static final int Println=123;
	public static final int Pw=124;
	public static final int QMark=125;
	public static final int Quad=126;
	public static final int RETURN=127;
	public static final int Random=128;
	public static final int Rect=129;
	public static final int Repeat=130;
	public static final int Return=131;
	public static final int Rotate=132;
	public static final int Round=133;
	public static final int SPECIAL=134;
	public static final int STATEMENTS=135;
	public static final int SUB_CALL=136;
	public static final int Scale=137;
	public static final int SetCorner=138;
	public static final int SetHFold=139;
	public static final int SetHeight=140;
	public static final int SetName=141;
	public static final int SetSeam=142;
	public static final int SetVFold=143;
	public static final int SetWidth=144;
	public static final int Show=145;
	public static final int Sine=146;
	public static final int Size=147;
	public static final int Skirt=148;
	public static final int SkirtBack=149;
	public static final int Slider=150;
	public static final int Space=151;
	public static final int Spiral=152;
	public static final int Sq=153;
	public static final int Sqrt=154;
	public static final int String=155;
	public static final int Stroke=156;
	public static final int Subtract=157;
	public static final int TERNARY=158;
	public static final int Tan=159;
	public static final int Template=160;
	public static final int TemplateCollection=161;
	public static final int To=162;
	public static final int Triangle=163;
	public static final int UNARY_MIN=164;
	public static final int Union=165;
	public static final int Units=166;
	public static final int WIDTH_CONSTANT=167;
	public static final int Wave=168;
	public static final int Weight=169;
	public static final int While=170;
	public static final int Xor=171;

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
	 UserUIManager uiManager;
	  Scope currentScope = null;
	  BlockNode currentFunction = null;
	  
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:68:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:69:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:69:6: block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:72:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block96); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block99); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pw||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==172||LA2_0==174) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement142);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement155);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement166);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement178);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement189);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:5: repeatStatement
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:102:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		CommonTree ASSIGNMENT13=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT13=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||LA5_0==172||LA5_0==174) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:39: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
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
		DCNode templateCall31 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
			int alt10=14;
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
					case AddDesign:
					case SetCorner:
					case SetHFold:
					case SetHeight:
					case SetName:
					case SetSeam:
					case SetVFold:
					case SetWidth:
					case Template:
					case TemplateCollection:
						{
						alt10=14;
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL16=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall253); 
					match(input, Token.DOWN, null); 
					Identifier14=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall255); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:29: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall269); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall271); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||LA7_0==172||LA7_0==174) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:26: expression
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: ^( FUNC_CALL Print expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:6: ^( FUNC_CALL Assert expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:115:6: ^( FUNC_CALL Size expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall343); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall345); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:116:23: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL24=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall360); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall362); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:26: exprList
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall375);
					primitiveCall25=primitiveCall();
					state._fsp--;

					node = primitiveCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall384);
					transformCall26=transformCall();
					state._fsp--;

					node = transformCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall393);
					patternCall27=patternCall();
					state._fsp--;

					node = patternCall27; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall402);
					mathCall28=mathCall();
					state._fsp--;

					node= mathCall28; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall411);
					getCall29=getCall();
					state._fsp--;

					node= getCall29; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall419);
					uICall30=uICall();
					state._fsp--;

					node = uICall30; ((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:5: templateCall
					{
					pushFollow(FOLLOW_templateCall_in_functionCall427);
					templateCall31=templateCall();
					state._fsp--;

					node = templateCall31; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL33=null;
		CommonTree FUNC_CALL35=null;
		CommonTree FUNC_CALL37=null;
		CommonTree FUNC_CALL39=null;
		CommonTree FUNC_CALL41=null;
		CommonTree FUNC_CALL43=null;
		CommonTree FUNC_CALL45=null;
		java.util.List<DCNode> exprList32 =null;
		java.util.List<DCNode> exprList34 =null;
		java.util.List<DCNode> exprList36 =null;
		java.util.List<DCNode> exprList38 =null;
		java.util.List<DCNode> exprList40 =null;
		java.util.List<DCNode> exprList42 =null;
		java.util.List<DCNode> exprList44 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall454); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall456); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall458);
							exprList32=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList32,FUNC_CALL33.getLine(),FUNC_CALL33.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall470); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall472); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall474);
							exprList34=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList34,FUNC_CALL35.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall487); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall489); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall491);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList36,FUNC_CALL37.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall505); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall507); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall509);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList38,FUNC_CALL39.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall523); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall525); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall527);
							exprList40=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList40,FUNC_CALL41.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall539); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall541); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall543);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall555); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall557); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall559);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall571); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall573); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall575);
							exprList42=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList42,FUNC_CALL43.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall588); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall590); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall592);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList44,FUNC_CALL45.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL87=null;
		CommonTree FUNC_CALL89=null;
		CommonTree FUNC_CALL91=null;
		java.util.List<DCNode> exprList46 =null;
		java.util.List<DCNode> exprList48 =null;
		java.util.List<DCNode> exprList50 =null;
		DCNode expression52 =null;
		java.util.List<DCNode> exprList54 =null;
		java.util.List<DCNode> exprList56 =null;
		java.util.List<DCNode> exprList58 =null;
		DCNode expression60 =null;
		DCNode expression62 =null;
		java.util.List<DCNode> exprList64 =null;
		DCNode expression66 =null;
		DCNode expression68 =null;
		java.util.List<DCNode> exprList70 =null;
		DCNode expression72 =null;
		DCNode expression74 =null;
		java.util.List<DCNode> exprList76 =null;
		DCNode expression78 =null;
		DCNode expression80 =null;
		java.util.List<DCNode> exprList82 =null;
		java.util.List<DCNode> exprList84 =null;
		java.util.List<DCNode> exprList86 =null;
		java.util.List<DCNode> exprList88 =null;
		DCNode expression90 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall619); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall621); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall623);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList46,FUNC_CALL47.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall637); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall639); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall641);
							exprList48=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList48,FUNC_CALL49.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall655); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall657); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall659);
							exprList50=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList50,FUNC_CALL51.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall672); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall674); 
					pushFollow(FOLLOW_expression_in_transformCall676);
					expression52=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression52,FUNC_CALL53.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall687); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall689); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall691);
							exprList54=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList54,currentScope,FUNC_CALL55.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall702); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall704); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall706);
							exprList56=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList56,FUNC_CALL57.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall719); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall721); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall723);
							exprList58=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList58,FUNC_CALL59.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall734); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall736); 
					pushFollow(FOLLOW_expression_in_transformCall738);
					expression60=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression60 ,FUNC_CALL61.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall748); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall750); 
					pushFollow(FOLLOW_expression_in_transformCall752);
					expression62=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression62,FUNC_CALL63.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall762); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall764); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall766);
							exprList64=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList64,FUNC_CALL65.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall777); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall779); 
					pushFollow(FOLLOW_expression_in_transformCall781);
					expression66=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression66,FUNC_CALL67.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL69=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall791); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall793); 
					pushFollow(FOLLOW_expression_in_transformCall795);
					expression68=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression68,FUNC_CALL69.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL71=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall805); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall807); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall809);
							exprList70=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList70,FUNC_CALL71.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL73=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall820); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall822); 
					pushFollow(FOLLOW_expression_in_transformCall824);
					expression72=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression72, currentScope, FUNC_CALL73.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL75=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall833); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall835); 
					pushFollow(FOLLOW_expression_in_transformCall837);
					expression74=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression74,currentScope,FUNC_CALL75.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL77=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall846); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall848); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall850);
							exprList76=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList76,FUNC_CALL77.getLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL79=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall860); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall862); 
					pushFollow(FOLLOW_expression_in_transformCall864);
					expression78=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression78,FUNC_CALL79.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL81=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall873); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall875); 
					pushFollow(FOLLOW_expression_in_transformCall877);
					expression80=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression80,FUNC_CALL81.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL83=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall886); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall888); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall890);
							exprList82=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList82, currentScope, FUNC_CALL83.getLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL85=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall900); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall902); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall904);
							exprList84=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList84, currentScope, FUNC_CALL85.getLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL87=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall914); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall916); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall918);
							exprList86=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList86, currentScope, FUNC_CALL87.getLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL89=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall928); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall930); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall932);
							exprList88=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList88, currentScope, FUNC_CALL89.getLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL91=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall942); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall944); 
					pushFollow(FOLLOW_expression_in_transformCall946);
					expression90=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression90,currentScope, FUNC_CALL91.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL93=null;
		CommonTree FUNC_CALL95=null;
		CommonTree FUNC_CALL97=null;
		java.util.List<DCNode> exprList92 =null;
		java.util.List<DCNode> exprList94 =null;
		java.util.List<DCNode> exprList96 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL93=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall978); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall980); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall982);
							exprList92=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList92,currentScope,FUNC_CALL93.getLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL95=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall994); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall996); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall998);
							exprList94=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList94,currentScope,FUNC_CALL95.getLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL97=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1010); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1012); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1014);
							exprList96=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList96,currentScope,FUNC_CALL97.getLine(),widthParam, heightParam);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL99=null;
		CommonTree FUNC_CALL101=null;
		CommonTree FUNC_CALL103=null;
		CommonTree FUNC_CALL105=null;
		CommonTree FUNC_CALL107=null;
		CommonTree FUNC_CALL109=null;
		CommonTree FUNC_CALL111=null;
		CommonTree FUNC_CALL113=null;
		CommonTree FUNC_CALL115=null;
		CommonTree FUNC_CALL117=null;
		CommonTree FUNC_CALL119=null;
		CommonTree FUNC_CALL121=null;
		CommonTree FUNC_CALL123=null;
		CommonTree FUNC_CALL125=null;
		CommonTree FUNC_CALL127=null;
		CommonTree FUNC_CALL129=null;
		DCNode expression98 =null;
		DCNode expression100 =null;
		DCNode expression102 =null;
		java.util.List<DCNode> exprList104 =null;
		java.util.List<DCNode> exprList106 =null;
		java.util.List<DCNode> exprList108 =null;
		DCNode expression110 =null;
		DCNode expression112 =null;
		java.util.List<DCNode> exprList114 =null;
		java.util.List<DCNode> exprList116 =null;
		DCNode expression118 =null;
		java.util.List<DCNode> exprList120 =null;
		DCNode expression122 =null;
		DCNode expression124 =null;
		DCNode expression126 =null;
		DCNode expression128 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL99=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1046); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1048); 
					pushFollow(FOLLOW_expression_in_mathCall1050);
					expression98=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression98,FUNC_CALL99.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL101=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1060); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1062); 
					pushFollow(FOLLOW_expression_in_mathCall1064);
					expression100=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression100,FUNC_CALL101.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL103=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1074); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1076); 
					pushFollow(FOLLOW_expression_in_mathCall1078);
					expression102=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression102,FUNC_CALL103.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL105=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1088); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1090); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:22: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1092);
							exprList104=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ATanNode(exprList104,FUNC_CALL105.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL107=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1103); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1105); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:24: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1107);
							exprList106=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList106,FUNC_CALL107.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL109=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1118); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1120); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:21: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1122);
							exprList108=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PowFNode(exprList108,FUNC_CALL109.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL111=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1132); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1134); 
					pushFollow(FOLLOW_expression_in_mathCall1136);
					expression110=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression110,FUNC_CALL111.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL113=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1145); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1147); 
					pushFollow(FOLLOW_expression_in_mathCall1149);
					expression112=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression112,FUNC_CALL113.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL115=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1158); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1160); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:26: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1162);
							exprList114=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList114,FUNC_CALL115.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL117=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1173); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1175); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:23: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1177);
							exprList116=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList116,FUNC_CALL117.getLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL119=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1188); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1190); 
					pushFollow(FOLLOW_expression_in_mathCall1192);
					expression118=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression118,FUNC_CALL119.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL121=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1202); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1204); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:21: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1206);
							exprList120=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList120,FUNC_CALL121.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL123=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1217); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1219); 
					pushFollow(FOLLOW_expression_in_mathCall1221);
					expression122=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression122,"inch",unitParam,FUNC_CALL123.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL125=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1230); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1232); 
					pushFollow(FOLLOW_expression_in_mathCall1234);
					expression124=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression124,"mm",unitParam,FUNC_CALL125.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL127=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1243); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1245); 
					pushFollow(FOLLOW_expression_in_mathCall1247);
					expression126=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression126,"cm",unitParam,FUNC_CALL127.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL129=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1256); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1258); 
					pushFollow(FOLLOW_expression_in_mathCall1260);
					expression128=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression128,"units",unitParam,FUNC_CALL129.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:196:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		DCNode expression130 =null;
		DCNode expression131 =null;
		DCNode expression132 =null;
		DCNode expression133 =null;
		DCNode expression134 =null;
		DCNode expression135 =null;
		java.util.List<DCNode> exprList136 =null;
		java.util.List<DCNode> exprList137 =null;
		java.util.List<DCNode> exprList138 =null;
		java.util.List<DCNode> exprList139 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1298); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1300); 
					pushFollow(FOLLOW_expression_in_getCall1302);
					expression130=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression130);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1312); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1314); 
					pushFollow(FOLLOW_expression_in_getCall1316);
					expression131=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression131);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1325); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1327); 
					pushFollow(FOLLOW_expression_in_getCall1329);
					expression132=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression132);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1338); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1340); 
					pushFollow(FOLLOW_expression_in_getCall1342);
					expression133=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression133);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1351); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1353); 
					pushFollow(FOLLOW_expression_in_getCall1355);
					expression134=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression134);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1364); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1366); 
					pushFollow(FOLLOW_expression_in_getCall1368);
					expression135=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression135);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1377); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1379); 
					pushFollow(FOLLOW_expression_in_getCall1381);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1389); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1391); 
					pushFollow(FOLLOW_expression_in_getCall1393);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:205:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1401); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1403); 
					pushFollow(FOLLOW_expression_in_getCall1405);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1412); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1414); 
					pushFollow(FOLLOW_expression_in_getCall1416);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1424); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1426); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:28: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==EXP_LIST) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1428);
							exprList136=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList136);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1438); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1440); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:29: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1442);
							exprList137=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList137);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1452); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1454); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:25: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1456);
							exprList138=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetAngleNode(exprList138);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1467); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1469); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:26: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==EXP_LIST) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1471);
							exprList139=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetRadiusNode(exprList139);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:213:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList140 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1499); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1501); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:25: ( exprList )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==EXP_LIST) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1503);
					exprList140=exprList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new SliderNode(exprList140,currentScope);
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



	// $ANTLR start "templateCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:4: templateCall returns [DCNode node] : ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) );
	public final DCNode templateCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL142=null;
		CommonTree FUNC_CALL144=null;
		CommonTree FUNC_CALL146=null;
		CommonTree FUNC_CALL148=null;
		CommonTree FUNC_CALL150=null;
		CommonTree FUNC_CALL152=null;
		CommonTree FUNC_CALL154=null;
		CommonTree FUNC_CALL156=null;
		CommonTree FUNC_CALL158=null;
		java.util.List<DCNode> exprList141 =null;
		java.util.List<DCNode> exprList143 =null;
		java.util.List<DCNode> exprList145 =null;
		java.util.List<DCNode> exprList147 =null;
		java.util.List<DCNode> exprList149 =null;
		java.util.List<DCNode> exprList151 =null;
		java.util.List<DCNode> exprList153 =null;
		java.util.List<DCNode> exprList155 =null;
		java.util.List<DCNode> exprList157 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:4: ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) )
			int alt62=10;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==FUNC_CALL) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Template:
						{
						alt62=1;
						}
						break;
					case SetWidth:
						{
						alt62=2;
						}
						break;
					case SetHeight:
						{
						alt62=3;
						}
						break;
					case SetSeam:
						{
						alt62=4;
						}
						break;
					case SetName:
						{
						alt62=5;
						}
						break;
					case SetVFold:
						{
						alt62=6;
						}
						break;
					case SetHFold:
						{
						alt62=7;
						}
						break;
					case SetCorner:
						{
						alt62=8;
						}
						break;
					case TemplateCollection:
						{
						alt62=9;
						}
						break;
					case AddDesign:
						{
						alt62=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 62, 2, input);
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
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:6: ^( FUNC_CALL Template ( exprList )? )
					{
					FUNC_CALL142=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1534); 
					match(input, Token.DOWN, null); 
					match(input,Template,FOLLOW_Template_in_templateCall1536); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:27: ( exprList )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==EXP_LIST) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1538);
							exprList141=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateNode(exprList141,FUNC_CALL142.getLine(),FUNC_CALL142.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:5: ^( FUNC_CALL SetWidth ( exprList )? )
					{
					FUNC_CALL144=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1549); 
					match(input, Token.DOWN, null); 
					match(input,SetWidth,FOLLOW_SetWidth_in_templateCall1551); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:26: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EXP_LIST) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1553);
							exprList143=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetWidthNode(exprList143,FUNC_CALL144.getLine(),FUNC_CALL144.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:5: ^( FUNC_CALL SetHeight ( exprList )? )
					{
					FUNC_CALL146=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1564); 
					match(input, Token.DOWN, null); 
					match(input,SetHeight,FOLLOW_SetHeight_in_templateCall1566); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:27: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EXP_LIST) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1568);
							exprList145=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHeightNode(exprList145,FUNC_CALL146.getLine(),FUNC_CALL146.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:5: ^( FUNC_CALL SetSeam ( exprList )? )
					{
					FUNC_CALL148=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1578); 
					match(input, Token.DOWN, null); 
					match(input,SetSeam,FOLLOW_SetSeam_in_templateCall1580); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:25: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EXP_LIST) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1582);
							exprList147=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetSeamNode(exprList147,FUNC_CALL148.getLine(),FUNC_CALL148.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:5: ^( FUNC_CALL SetName ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1592); 
					match(input, Token.DOWN, null); 
					match(input,SetName,FOLLOW_SetName_in_templateCall1594); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:25: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EXP_LIST) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1596);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:5: ^( FUNC_CALL SetVFold ( exprList )? )
					{
					FUNC_CALL150=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1605); 
					match(input, Token.DOWN, null); 
					match(input,SetVFold,FOLLOW_SetVFold_in_templateCall1607); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:26: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EXP_LIST) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1609);
							exprList149=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetVFoldNode(exprList149,FUNC_CALL150.getLine(),FUNC_CALL150.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:5: ^( FUNC_CALL SetHFold ( exprList )? )
					{
					FUNC_CALL152=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1619); 
					match(input, Token.DOWN, null); 
					match(input,SetHFold,FOLLOW_SetHFold_in_templateCall1621); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:26: ( exprList )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==EXP_LIST) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1623);
							exprList151=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHFoldNode(exprList151,FUNC_CALL152.getLine(),FUNC_CALL152.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:5: ^( FUNC_CALL SetCorner ( exprList )? )
					{
					FUNC_CALL154=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1633); 
					match(input, Token.DOWN, null); 
					match(input,SetCorner,FOLLOW_SetCorner_in_templateCall1635); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:27: ( exprList )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==EXP_LIST) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1637);
							exprList153=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCornerNode(exprList153,FUNC_CALL154.getLine(),FUNC_CALL154.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:5: ^( FUNC_CALL TemplateCollection ( exprList )? )
					{
					FUNC_CALL156=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1648); 
					match(input, Token.DOWN, null); 
					match(input,TemplateCollection,FOLLOW_TemplateCollection_in_templateCall1650); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:38: ( exprList )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==EXP_LIST) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:38: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1654);
							exprList155=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCollectionNode(exprList155,FUNC_CALL156.getLine(),FUNC_CALL156.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:5: ^( FUNC_CALL AddDesign ( exprList )? )
					{
					FUNC_CALL158=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1664); 
					match(input, Token.DOWN, null); 
					match(input,AddDesign,FOLLOW_AddDesign_in_templateCall1666); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:27: ( exprList )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==EXP_LIST) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1668);
							exprList157=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateAddDesignNode(exprList157,FUNC_CALL158.getLine(),FUNC_CALL158.getCharPositionInLine());
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
	// $ANTLR end "templateCall"



	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:231:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1705); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1707);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:26: ( elseIfStat[ifNode] )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==EXP) ) {
					int LA63_1 = input.LA(2);
					if ( (LA63_1==DOWN) ) {
						int LA63_3 = input.LA(3);
						if ( (LA63_3==Add||LA63_3==Bool||LA63_3==COLOR_CONSTANT||LA63_3==DOTPROPERTY||LA63_3==Divide||LA63_3==Equals||(LA63_3 >= GT && LA63_3 <= GTEquals)||LA63_3==HEIGHT_CONSTANT||LA63_3==In||LA63_3==LOOKUP||(LA63_3 >= LT && LA63_3 <= LTEquals)||LA63_3==Modulus||(LA63_3 >= Multiply && LA63_3 <= NEquals)||(LA63_3 >= Null && LA63_3 <= Number)||LA63_3==PI_CONSTANT||LA63_3==Pw||(LA63_3 >= Subtract && LA63_3 <= TERNARY)||LA63_3==UNARY_MIN||LA63_3==WIDTH_CONSTANT||LA63_3==172||LA63_3==174) ) {
							alt63=1;
						}

					}

				}

				switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1711);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop63;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:48: ( elseStat[ifNode] )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1717);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression159 =null;
		BlockNode block160 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1737); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1739);
			expression159=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1741);
			block160=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression159, block160);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression161 =null;
		BlockNode block162 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1760); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1762);
			expression161=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1764);
			block162=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression161, block162);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block163 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1783); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1785);
			block163=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block163);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:249:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier164=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block165 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1810); 
			match(input, Token.DOWN, null); 
			Identifier164=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1812); 
			pushFollow(FOLLOW_expression_in_forStatement1816);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1820);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1822);
			block165=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier164!=null?Identifier164.getText():null), a, b, block165, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier166=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block167 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1845); 
			match(input, Token.DOWN, null); 
			Identifier166=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1847); 
			pushFollow(FOLLOW_expression_in_repeatStatement1851);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1855);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:51: (c= expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Add||LA65_0==Bool||LA65_0==COLOR_CONSTANT||LA65_0==DOTPROPERTY||LA65_0==Divide||LA65_0==Equals||(LA65_0 >= GT && LA65_0 <= GTEquals)||LA65_0==HEIGHT_CONSTANT||LA65_0==In||LA65_0==LOOKUP||(LA65_0 >= LT && LA65_0 <= LTEquals)||LA65_0==Modulus||(LA65_0 >= Multiply && LA65_0 <= NEquals)||(LA65_0 >= Null && LA65_0 <= Number)||LA65_0==PI_CONSTANT||LA65_0==Pw||(LA65_0 >= Subtract && LA65_0 <= TERNARY)||LA65_0==UNARY_MIN||LA65_0==WIDTH_CONSTANT||LA65_0==172||LA65_0==174) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1860);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1864);
			block167=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier166!=null?Identifier166.getText():null), a, b, c, block167, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression168 =null;
		BlockNode block169 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:259:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1887); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1889);
			expression168=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1891);
			block169=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression168, block169);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier170=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1918); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:16: ( Identifier )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==Identifier) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:17: Identifier
					{
					Identifier170=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1921); 
					i.add((Identifier170!=null?Identifier170.getText():null));
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression171 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1951); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:17: ( expression )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Add||LA67_0==Bool||LA67_0==COLOR_CONSTANT||LA67_0==DOTPROPERTY||LA67_0==Divide||LA67_0==Equals||(LA67_0 >= GT && LA67_0 <= GTEquals)||LA67_0==HEIGHT_CONSTANT||LA67_0==In||LA67_0==LOOKUP||(LA67_0 >= LT && LA67_0 <= LTEquals)||LA67_0==Modulus||(LA67_0 >= Multiply && LA67_0 <= NEquals)||(LA67_0 >= Null && LA67_0 <= Number)||LA67_0==PI_CONSTANT||LA67_0==Pw||(LA67_0 >= Subtract && LA67_0 <= TERNARY)||LA67_0==UNARY_MIN||LA67_0==WIDTH_CONSTANT||LA67_0==172||LA67_0==174) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:269:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1954);
					expression171=expression();
					state._fsp--;

					e.add(expression171);
					}
					break;

				default :
					if ( cnt67 >= 1 ) break loop67;
					EarlyExitException eee = new EarlyExitException(67, input);
					throw eee;
				}
				cnt67++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:273:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number172=null;
		CommonTree Bool173=null;
		CommonTree COLOR_CONSTANT175=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup174 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:274:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt68=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt68=1;
				}
				break;
			case In:
				{
				alt68=2;
				}
				break;
			case 174:
				{
				alt68=3;
				}
				break;
			case 172:
				{
				alt68=4;
				}
				break;
			case Equals:
				{
				alt68=5;
				}
				break;
			case NEquals:
				{
				alt68=6;
				}
				break;
			case GTEquals:
				{
				alt68=7;
				}
				break;
			case LTEquals:
				{
				alt68=8;
				}
				break;
			case GT:
				{
				alt68=9;
				}
				break;
			case LT:
				{
				alt68=10;
				}
				break;
			case Add:
				{
				alt68=11;
				}
				break;
			case Subtract:
				{
				alt68=12;
				}
				break;
			case Multiply:
				{
				alt68=13;
				}
				break;
			case Divide:
				{
				alt68=14;
				}
				break;
			case Modulus:
				{
				alt68=15;
				}
				break;
			case Pw:
				{
				alt68=16;
				}
				break;
			case UNARY_MIN:
				{
				alt68=17;
				}
				break;
			case NEGATE:
				{
				alt68=18;
				}
				break;
			case Number:
				{
				alt68=19;
				}
				break;
			case Bool:
				{
				alt68=20;
				}
				break;
			case Null:
				{
				alt68=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt68=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt68=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt68=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt68=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt68=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:274:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1979); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1983);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1987);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1991);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression2002); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2006);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2010);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:276:6: ^( '||' a= expression b= expression )
					{
					match(input,174,FOLLOW_174_in_expression2039); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2043);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2047);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:6: ^( '&&' a= expression b= expression )
					{
					match(input,172,FOLLOW_172_in_expression2074); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2078);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2082);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:278:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression2109); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2113);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2117);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:279:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression2144); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2148);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2152);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2179); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2183);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2187);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:281:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2214); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2218);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2222);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2249); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2253);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2257);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:283:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2285); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2289);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2293);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2321); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2325);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2329);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2361);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2365);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:286:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2393); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2397);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2401);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2429); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2433);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2437);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2465); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2469);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2473);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2501); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2505);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2509);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:290:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2537); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2541);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:291:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2576); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2580);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:292:6: Number
					{
					Number172=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2617); 
					node = new AtomNode(Double.parseDouble((Number172!=null?Number172.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:6: Bool
					{
					Bool173=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2669); 
					node = new AtomNode(Boolean.parseBoolean((Bool173!=null?Bool173.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:294:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2723); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:295:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2777);
					lookup174=lookup();
					state._fsp--;

					node = lookup174;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:296:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT175=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2829); 
					node = new AtomNode((COLOR_CONSTANT175!=null?COLOR_CONSTANT175.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:297:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2848); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2894); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:299:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2939); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:302:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList176 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2998); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:13: ( exprList )?
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==EXP_LIST) ) {
					alt69=1;
				}
				switch (alt69) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:303:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list3000);
						exprList176=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList176);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:308:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier179=null;
		CommonTree DOTPROPERTY180=null;
		CommonTree LOOKUP183=null;
		CommonTree LOOKUP185=null;
		CommonTree LOOKUP187=null;
		CommonTree Identifier188=null;
		CommonTree LOOKUP189=null;
		CommonTree String190=null;
		CommonTree LOOKUP191=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall177 =null;
		java.util.List<PropertyNode> dotProperty178 =null;
		java.util.List<PropertyNode> dotProperty181 =null;
		DCNode functionCall182 =null;
		DCNode list184 =null;
		DCNode expression186 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:309:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt75=7;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==DOTPROPERTY) ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1==DOWN) ) {
					int LA75_3 = input.LA(3);
					if ( (LA75_3==Identifier) ) {
						alt75=2;
					}
					else if ( (LA75_3==FUNC_CALL) ) {
						alt75=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 75, 3, input);
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
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA75_0==LOOKUP) ) {
				int LA75_2 = input.LA(2);
				if ( (LA75_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt75=6;
						}
						break;
					case String:
						{
						alt75=7;
						}
						break;
					case FUNC_CALL:
						{
						alt75=3;
						}
						break;
					case LIST:
						{
						alt75=4;
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
					case 172:
					case 174:
						{
						alt75=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 75, 4, input);
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
							new NoViableAltException("", 75, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:309:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3023); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3025);
					functionCall177=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup3027);
					dotProperty178=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall177, dotProperty178);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:310:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY180=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3035); 
					match(input, Token.DOWN, null); 
					Identifier179=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3037); 
					pushFollow(FOLLOW_dotProperty_in_lookup3039);
					dotProperty181=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier179!=null?Identifier179.getText():null), currentScope,DOTPROPERTY180.getLine()), dotProperty181);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP183=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3063); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3065);
					functionCall182=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:28: (i= indexes )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==INDEXES) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:316:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3069);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall182, i,LOOKUP183.getLine()) : functionCall182;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:317:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP185=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3081); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup3083);
					list184=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:317:21: (i= indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==INDEXES) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:317:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3087);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list184, i, LOOKUP185.getLine()) : list184;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:318:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP187=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3107); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup3109);
					expression186=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:318:27: (i= indexes )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==INDEXES) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:318:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3113);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression186, i,LOOKUP187.getLine()) : expression186;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:319:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP189=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3127); 
					match(input, Token.DOWN, null); 
					Identifier188=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3129); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:319:27: (i= indexes )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==INDEXES) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:319:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3133);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier188!=null?Identifier188.getText():null), currentScope,LOOKUP189.getLine()), i,LOOKUP189.getLine()) : new IdentifierNode((Identifier188!=null?Identifier188.getText():null), currentScope,LOOKUP189.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:320:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP191=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3147); 
					match(input, Token.DOWN, null); 
					String190=(CommonTree)match(input,String,FOLLOW_String_in_lookup3149); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:320:23: (i= indexes )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==INDEXES) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:320:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3153);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String190!=null?String190.getText():null)), i,LOOKUP191.getLine()) : new AtomNode((String190!=null?String190.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:330:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression192 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:332:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:332:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3203); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:332:16: ( expression )+
			int cnt76=0;
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==Add||LA76_0==Bool||LA76_0==COLOR_CONSTANT||LA76_0==DOTPROPERTY||LA76_0==Divide||LA76_0==Equals||(LA76_0 >= GT && LA76_0 <= GTEquals)||LA76_0==HEIGHT_CONSTANT||LA76_0==In||LA76_0==LOOKUP||(LA76_0 >= LT && LA76_0 <= LTEquals)||LA76_0==Modulus||(LA76_0 >= Multiply && LA76_0 <= NEquals)||(LA76_0 >= Null && LA76_0 <= Number)||LA76_0==PI_CONSTANT||LA76_0==Pw||(LA76_0 >= Subtract && LA76_0 <= TERNARY)||LA76_0==UNARY_MIN||LA76_0==WIDTH_CONSTANT||LA76_0==172||LA76_0==174) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:332:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3206);
					expression192=expression();
					state._fsp--;

					e.add(expression192);
					}
					break;

				default :
					if ( cnt76 >= 1 ) break loop76;
					EarlyExitException eee = new EarlyExitException(76, input);
					throw eee;
				}
				cnt76++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:337:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression193 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:339:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:339:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3244); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:339:12: ( dotExpression )+
			int cnt77=0;
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( ((LA77_0 >= DotEnd && LA77_0 <= DotY)) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:339:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3247);
					dotExpression193=dotExpression();
					state._fsp--;

					e.add(dotExpression193);
					}
					break;

				default :
					if ( cnt77 >= 1 ) break loop77;
					EarlyExitException eee = new EarlyExitException(77, input);
					throw eee;
				}
				cnt77++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:342:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:343:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt78=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt78=1;
				}
				break;
			case DotY:
				{
				alt78=2;
				}
				break;
			case DotStart:
				{
				alt78=3;
				}
				break;
			case DotEnd:
				{
				alt78=4;
				}
				break;
			case DotOrigin:
				{
				alt78=5;
				}
				break;
			case DotRotation:
				{
				alt78=6;
				}
				break;
			case DotWidth:
				{
				alt78=7;
				}
				break;
			case DotHeight:
				{
				alt78=8;
				}
				break;
			case DotFill:
				{
				alt78=9;
				}
				break;
			case DotStroke:
				{
				alt78=10;
				}
				break;
			case DotWeight:
				{
				alt78=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:343:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3275); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:344:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3283); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:345:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3291); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:346:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3299); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:347:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3307); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:348:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3315); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:349:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3323); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:350:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3331); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:351:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3339); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:352:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3346); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:353:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3353); 
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
	public static final BitSet FOLLOW_statement_in_block102 = new BitSet(new long[]{0x0900000000000048L,0x0000000000080000L,0x0000040000000004L});
	public static final BitSet FOLLOW_RETURN_in_block110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x3010000220048108L,0x10431C8190908000L,0x0000509060000000L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x3010000220048108L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall255 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall271 = new BitSet(new long[]{0x3010000220048108L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_functionCall273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall288 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_functionCall290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall307 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_functionCall309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall325 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_functionCall327 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall345 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall362 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall454 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall456 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall458 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall470 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall472 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall489 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall507 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall525 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall541 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall543 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall555 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall557 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall559 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall573 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall575 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall590 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall621 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall623 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall639 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall641 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall655 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall657 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall674 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall689 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall704 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall721 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall736 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall750 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall764 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall766 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall779 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall793 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall795 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall807 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall822 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall835 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall848 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall850 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall862 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall875 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall888 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall890 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall902 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall904 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall914 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall916 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall928 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall930 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall932 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall942 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall944 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_transformCall946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall980 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall982 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall996 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall998 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1012 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1046 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1048 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1050 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1062 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1064 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1074 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1076 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1078 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1088 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1090 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1092 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1105 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1120 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1134 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1147 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1160 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1175 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1177 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1190 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1204 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1219 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1230 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1232 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1234 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1245 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1258 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1300 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1314 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1316 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1327 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1340 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1353 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1355 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1366 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1379 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1389 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1391 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1403 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1405 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1412 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1414 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_getCall1416 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1426 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1440 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1454 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1456 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1469 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1501 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Template_in_templateCall1536 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall1551 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall1566 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall1580 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1592 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetName_in_templateCall1594 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1596 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetVFold_in_templateCall1607 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1609 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHFold_in_templateCall1621 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1623 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1633 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetCorner_in_templateCall1635 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1637 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TemplateCollection_in_templateCall1650 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AddDesign_in_templateCall1666 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1707 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1711 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1739 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_ifStat1741 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1762 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1785 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1812 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1816 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1820 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_forStatement1822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1845 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1847 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1851 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1855 = new BitSet(new long[]{0x301000022004C100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1860 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1889 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_whileStatement1891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1921 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1954 = new BitSet(new long[]{0x3010000220048108L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_TERNARY_in_expression1979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1983 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression1987 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression1991 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression2002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2006 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2010 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_174_in_expression2039 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2043 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2047 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_172_in_expression2074 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2078 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2082 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression2109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2113 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression2144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2148 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2152 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2183 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2218 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2253 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2289 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2325 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2361 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2397 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2433 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2469 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2505 = new BitSet(new long[]{0x3010000220048100L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_expression_in_expression2509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2541 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2580 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list3000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3023 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3025 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3027 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3035 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3037 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3039 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3065 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_indexes_in_lookup3069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup3083 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_indexes_in_lookup3087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup3109 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_indexes_in_lookup3113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3129 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_indexes_in_lookup3133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup3149 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
	public static final BitSet FOLLOW_indexes_in_lookup3153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3206 = new BitSet(new long[]{0x3010000220048108L,0x10431C8190808000L,0x0000509060000000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3247 = new BitSet(new long[]{0x00007FF000000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3353 = new BitSet(new long[]{0x0000000000000002L});
}
