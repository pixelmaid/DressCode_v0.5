// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g 2014-04-08 20:29:32

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.UI.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.templates.*;
  import com.pixelmaid.dresscode.antlr.types.tree.repeats.*;
  
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
public class PyEsqueTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_CALL", "AND_CALL", "ASSIGNMENT", 
		"ATan", "Add", "AddDesign", "And", "Arc", "Assert", "Assign", "BLOCK", 
		"Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", "Clip", "Cm", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Dedent", "Def", "Difference", "Digit", "Divide", "Do", "Dot", "EXP", 
		"EXP_LIST", "Ellipse", "Else", "Equals", "Excl", "Expand", "FUNCTION", 
		"FUNC_CALL", "Fill", "Flatten", "FollowCurve", "GT", "GTEquals", "Gaussian", 
		"GetAngle", "GetDistance", "GetEnd", "GetFill", "GetHeight", "GetIntersect", 
		"GetOrigin", "GetRadius", "GetRotation", "GetStart", "GetStroke", "GetWidth", 
		"GetX", "GetY", "Grid", "Group", "HEIGHT_CONSTANT", "Heading", "Hide", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Inch", "Indent", 
		"Int", "LAdd", "LIST", "LOOKUP", "LOOKUP_S", "LRemove", "LShape", "LT", 
		"LTEquals", "Line", "Map", "Merge", "MirrorX", "MirrorY", "Mm", "Modulus", 
		"Move", "MoveBy", "Multiply", "NEGATE", "NEquals", "NL", "NewLine", "NoFill", 
		"NoStroke", "Noise", "Null", "Number", "OBrace", "OBracket", "OParen", 
		"Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", "Pw", 
		"QMark", "Quad", "RETURN", "Radial", "Random", "Rect", "Repeat", "Return", 
		"Rotate", "Round", "SP", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", 
		"SemiColon", "SetCorner", "SetHFold", "SetHeight", "SetName", "SetSeam", 
		"SetVFold", "SetWidth", "Show", "Sine", "Size", "Skirt", "SkirtBack", 
		"Slider", "SpaceChars", "Spiral", "Sq", "Sqrt", "String", "Stroke", "Subtract", 
		"TERNARY", "Tan", "Template", "TemplateCollection", "To", "Triangle", 
		"UNARY_MIN", "Union", "Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", 
		"Xor", "'&&'", "'||'", "DotEnd", "DotFill", "DotHeight", "DotOrigin", 
		"DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", "DotX", 
		"DotY", "For"
	};
	public static final int EOF=-1;
	public static final int T__168=168;
	public static final int T__169=169;
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
	public static final int Dedent=30;
	public static final int Def=31;
	public static final int Difference=32;
	public static final int Digit=33;
	public static final int Divide=34;
	public static final int Do=35;
	public static final int Dot=36;
	public static final int EXP=37;
	public static final int EXP_LIST=38;
	public static final int Ellipse=39;
	public static final int Else=40;
	public static final int Equals=41;
	public static final int Excl=42;
	public static final int Expand=43;
	public static final int FUNCTION=44;
	public static final int FUNC_CALL=45;
	public static final int Fill=46;
	public static final int Flatten=47;
	public static final int FollowCurve=48;
	public static final int GT=49;
	public static final int GTEquals=50;
	public static final int Gaussian=51;
	public static final int GetAngle=52;
	public static final int GetDistance=53;
	public static final int GetEnd=54;
	public static final int GetFill=55;
	public static final int GetHeight=56;
	public static final int GetIntersect=57;
	public static final int GetOrigin=58;
	public static final int GetRadius=59;
	public static final int GetRotation=60;
	public static final int GetStart=61;
	public static final int GetStroke=62;
	public static final int GetWidth=63;
	public static final int GetX=64;
	public static final int GetY=65;
	public static final int Grid=66;
	public static final int Group=67;
	public static final int HEIGHT_CONSTANT=68;
	public static final int Heading=69;
	public static final int Hide=70;
	public static final int ID_LIST=71;
	public static final int IF=72;
	public static final int INDEXES=73;
	public static final int Identifier=74;
	public static final int If=75;
	public static final int In=76;
	public static final int Inch=77;
	public static final int Indent=78;
	public static final int Int=79;
	public static final int LAdd=80;
	public static final int LIST=81;
	public static final int LOOKUP=82;
	public static final int LOOKUP_S=83;
	public static final int LRemove=84;
	public static final int LShape=85;
	public static final int LT=86;
	public static final int LTEquals=87;
	public static final int Line=88;
	public static final int Map=89;
	public static final int Merge=90;
	public static final int MirrorX=91;
	public static final int MirrorY=92;
	public static final int Mm=93;
	public static final int Modulus=94;
	public static final int Move=95;
	public static final int MoveBy=96;
	public static final int Multiply=97;
	public static final int NEGATE=98;
	public static final int NEquals=99;
	public static final int NL=100;
	public static final int NewLine=101;
	public static final int NoFill=102;
	public static final int NoStroke=103;
	public static final int Noise=104;
	public static final int Null=105;
	public static final int Number=106;
	public static final int OBrace=107;
	public static final int OBracket=108;
	public static final int OParen=109;
	public static final int Or=110;
	public static final int PI_CONSTANT=111;
	public static final int Point=112;
	public static final int Polygon=113;
	public static final int Pow=114;
	public static final int Print=115;
	public static final int Println=116;
	public static final int Pw=117;
	public static final int QMark=118;
	public static final int Quad=119;
	public static final int RETURN=120;
	public static final int Radial=121;
	public static final int Random=122;
	public static final int Rect=123;
	public static final int Repeat=124;
	public static final int Return=125;
	public static final int Rotate=126;
	public static final int Round=127;
	public static final int SP=128;
	public static final int SPECIAL=129;
	public static final int STATEMENTS=130;
	public static final int SUB_CALL=131;
	public static final int Scale=132;
	public static final int SemiColon=133;
	public static final int SetCorner=134;
	public static final int SetHFold=135;
	public static final int SetHeight=136;
	public static final int SetName=137;
	public static final int SetSeam=138;
	public static final int SetVFold=139;
	public static final int SetWidth=140;
	public static final int Show=141;
	public static final int Sine=142;
	public static final int Size=143;
	public static final int Skirt=144;
	public static final int SkirtBack=145;
	public static final int Slider=146;
	public static final int SpaceChars=147;
	public static final int Spiral=148;
	public static final int Sq=149;
	public static final int Sqrt=150;
	public static final int String=151;
	public static final int Stroke=152;
	public static final int Subtract=153;
	public static final int TERNARY=154;
	public static final int Tan=155;
	public static final int Template=156;
	public static final int TemplateCollection=157;
	public static final int To=158;
	public static final int Triangle=159;
	public static final int UNARY_MIN=160;
	public static final int Union=161;
	public static final int Units=162;
	public static final int WIDTH_CONSTANT=163;
	public static final int Wave=164;
	public static final int Weight=165;
	public static final int While=166;
	public static final int Xor=167;
	public static final int DotEnd=170;
	public static final int DotFill=171;
	public static final int DotHeight=172;
	public static final int DotOrigin=173;
	public static final int DotRotation=174;
	public static final int DotStart=175;
	public static final int DotStroke=176;
	public static final int DotWeight=177;
	public static final int DotWidth=178;
	public static final int DotX=179;
	public static final int DotY=180;
	public static final int For=181;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PyEsqueTreeWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PyEsqueTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PyEsqueTreeWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g"; }


	 
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
	  
	  public PyEsqueTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui,double w, double h,int u) {
	    this(nodes, null, fns,dm,ui,w,h,u);
	   
	  }
	  
	  public PyEsqueTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui, double w,double h, int u) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	    this.drawableManager = dm;
	    this.uiManager = ui;
	    widthParam = w;
	    heightParam = h;
	    unitParam = u;  }
	  



	// $ANTLR start "walk"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:69:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:70:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:70:6: block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:73:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final BlockNode block() throws RecognitionException {
		BlockNode node = null;


		DCNode statement2 =null;
		DCNode expression3 =null;


			//System.out.println(" new block called");

		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope local = new Scope(currentScope);
		  currentScope = local;
		  currentFunction = bn;
		  ((NodeEvent)node).addEventListener(drawableManager);

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==FollowCurve||LA1_0==IF||LA1_0==Radial||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pw||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||(LA2_0 >= 168 && LA2_0 <= 169)) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:88:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:92:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | whileStatement | radialStatement | followCurveStatement | repeatStatement );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode whileStatement7 =null;
		DCNode radialStatement8 =null;
		DCNode followCurveStatement9 =null;
		DCNode repeatStatement10 =null;


			//System.out.println(" statement called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:96:3: ( assignment | functionCall | ifStatement | whileStatement | radialStatement | followCurveStatement | repeatStatement )
			int alt3=7;
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
			case While:
				{
				alt3=4;
				}
				break;
			case Radial:
				{
				alt3=5;
				}
				break;
			case FollowCurve:
				{
				alt3=6;
				}
				break;
			case Repeat:
				{
				alt3=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:96:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:97:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:98:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:99:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement177);
					whileStatement7=whileStatement();
					state._fsp--;

					node = whileStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:100:5: radialStatement
					{
					pushFollow(FOLLOW_radialStatement_in_statement185);
					radialStatement8=radialStatement();
					state._fsp--;

					node = radialStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:101:5: followCurveStatement
					{
					pushFollow(FOLLOW_followCurveStatement_in_statement193);
					followCurveStatement9=followCurveStatement();
					state._fsp--;

					node = followCurveStatement9; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:102:5: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement201);
					repeatStatement10=repeatStatement();
					state._fsp--;

					node = repeatStatement10; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier11=null;
		CommonTree ASSIGNMENT14=null;
		java.util.List<DCNode> indexes12 =null;
		DCNode expression13 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT14=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment230); 
			match(input, Token.DOWN, null); 
			Identifier11=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment232); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment234);
					indexes12=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||(LA5_0 >= 168 && LA5_0 <= 169)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:108:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment237);
					expression13=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier11!=null?Identifier11.getText():null), indexes12, expression13, currentScope,ASSIGNMENT14.getLine(),ASSIGNMENT14.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:118:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier15=null;
		CommonTree FUNC_CALL17=null;
		CommonTree FUNC_CALL19=null;
		CommonTree FUNC_CALL21=null;
		CommonTree FUNC_CALL23=null;
		CommonTree FUNC_CALL25=null;
		CommonTree FUNC_CALL27=null;
		CommonTree FUNC_CALL29=null;
		java.util.List<DCNode> exprList16 =null;
		DCNode expression18 =null;
		DCNode expression20 =null;
		DCNode expression22 =null;
		DCNode expression24 =null;
		java.util.List<DCNode> exprList26 =null;
		java.util.List<DCNode> exprList28 =null;
		DCNode primitiveCall30 =null;
		DCNode transformCall31 =null;
		DCNode patternCall32 =null;
		DCNode mathCall33 =null;
		DCNode getCall34 =null;
		DCNode uICall35 =null;
		DCNode templateCall36 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL17=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall279); 
					match(input, Token.DOWN, null); 
					Identifier15=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall281); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall283);
							exprList16=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier15!=null?Identifier15.getText():null), exprList16, functions, widthParam, heightParam, unitParam,FUNC_CALL17.getLine(),FUNC_CALL17.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:6: ^( FUNC_CALL Println ( expression )? )
					{
					FUNC_CALL19=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall295); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall297); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||(LA7_0 >= 168 && LA7_0 <= 169)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall299);
							expression18=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression18,FUNC_CALL19.getLine(),FUNC_CALL19.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:124:6: ^( FUNC_CALL Print expression )
					{
					FUNC_CALL21=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall312); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall314); 
					pushFollow(FOLLOW_expression_in_functionCall316);
					expression20=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression20,FUNC_CALL21.getLine(),FUNC_CALL21.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:125:6: ^( FUNC_CALL Assert expression )
					{
					FUNC_CALL23=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall331); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall333); 
					pushFollow(FOLLOW_expression_in_functionCall335);
					expression22=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression22,FUNC_CALL23.getLine(),FUNC_CALL23.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:126:6: ^( FUNC_CALL Size expression )
					{
					FUNC_CALL25=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall349); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall351); 
					pushFollow(FOLLOW_expression_in_functionCall353);
					expression24=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression24,FUNC_CALL25.getLine(),FUNC_CALL25.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall369); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall371); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall373);
							exprList26=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList26,FUNC_CALL27.getLine(),FUNC_CALL27.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall386); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall388); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall390);
							exprList28=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList28,FUNC_CALL29.getLine(),FUNC_CALL29.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:129:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall401);
					primitiveCall30=primitiveCall();
					state._fsp--;

					node = primitiveCall30; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:130:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall410);
					transformCall31=transformCall();
					state._fsp--;

					node = transformCall31; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:131:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall419);
					patternCall32=patternCall();
					state._fsp--;

					node = patternCall32; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:132:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall428);
					mathCall33=mathCall();
					state._fsp--;

					node= mathCall33; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall437);
					getCall34=getCall();
					state._fsp--;

					node= getCall34; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall445);
					uICall35=uICall();
					state._fsp--;

					node = uICall35; ((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:135:5: templateCall
					{
					pushFollow(FOLLOW_templateCall_in_functionCall453);
					templateCall36=templateCall();
					state._fsp--;

					node = templateCall36; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL38=null;
		CommonTree FUNC_CALL40=null;
		CommonTree FUNC_CALL42=null;
		CommonTree FUNC_CALL44=null;
		CommonTree FUNC_CALL46=null;
		CommonTree FUNC_CALL48=null;
		CommonTree FUNC_CALL50=null;
		java.util.List<DCNode> exprList37 =null;
		java.util.List<DCNode> exprList39 =null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;
		java.util.List<DCNode> exprList45 =null;
		java.util.List<DCNode> exprList47 =null;
		java.util.List<DCNode> exprList49 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall480); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall482); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall484);
							exprList37=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList37,FUNC_CALL38.getLine(),FUNC_CALL38.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall496); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall498); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall500);
							exprList39=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList39,FUNC_CALL40.getLine(),FUNC_CALL40.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall513); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall515); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall517);
							exprList41=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList41,FUNC_CALL42.getLine(),FUNC_CALL42.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall531); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall533); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall535);
							exprList43=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList43,FUNC_CALL44.getLine(),FUNC_CALL44.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall549); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall551); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall553);
							exprList45=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList45,FUNC_CALL46.getLine(),FUNC_CALL46.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall565); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall567); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall569);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall581); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall583); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall585);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall597); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall599); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall601);
							exprList47=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList47,FUNC_CALL48.getLine(),FUNC_CALL48.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall614); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall616); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall618);
							exprList49=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList49,FUNC_CALL50.getLine(),FUNC_CALL50.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		CommonTree FUNC_CALL96=null;
		java.util.List<DCNode> exprList51 =null;
		java.util.List<DCNode> exprList53 =null;
		java.util.List<DCNode> exprList55 =null;
		DCNode expression57 =null;
		java.util.List<DCNode> exprList59 =null;
		java.util.List<DCNode> exprList61 =null;
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
		DCNode expression83 =null;
		DCNode expression85 =null;
		java.util.List<DCNode> exprList87 =null;
		java.util.List<DCNode> exprList89 =null;
		java.util.List<DCNode> exprList91 =null;
		java.util.List<DCNode> exprList93 =null;
		DCNode expression95 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall645); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall647); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall649);
							exprList51=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList51,FUNC_CALL52.getLine(),FUNC_CALL52.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall663); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall665); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall667);
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList53,FUNC_CALL54.getLine(),FUNC_CALL54.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:154:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall681); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall683); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:154:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:154:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall685);
							exprList55=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList55,FUNC_CALL56.getLine(),FUNC_CALL56.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall698); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall700); 
					pushFollow(FOLLOW_expression_in_transformCall702);
					expression57=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression57,FUNC_CALL58.getLine(),FUNC_CALL58.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall713); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall715); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall717);
							exprList59=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList59,currentScope,FUNC_CALL60.getLine(),FUNC_CALL60.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall728); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall730); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall732);
							exprList61=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList61,FUNC_CALL62.getLine(),FUNC_CALL62.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall745); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall747); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall749);
							exprList63=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList63,FUNC_CALL64.getLine(),FUNC_CALL64.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:159:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall760); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall762); 
					pushFollow(FOLLOW_expression_in_transformCall764);
					expression65=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression65 ,FUNC_CALL66.getLine(),FUNC_CALL66.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall774); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall776); 
					pushFollow(FOLLOW_expression_in_transformCall778);
					expression67=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression67,FUNC_CALL68.getLine(),FUNC_CALL68.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall788); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall790); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall792);
							exprList69=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList69,FUNC_CALL70.getLine(),FUNC_CALL70.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:162:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall803); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall805); 
					pushFollow(FOLLOW_expression_in_transformCall807);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression71,FUNC_CALL72.getLine(),FUNC_CALL72.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall817); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall819); 
					pushFollow(FOLLOW_expression_in_transformCall821);
					expression73=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression73,FUNC_CALL74.getLine(),FUNC_CALL74.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall831); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall833); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall835);
							exprList75=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList75,FUNC_CALL76.getLine(),FUNC_CALL76.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall846); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall848); 
					pushFollow(FOLLOW_expression_in_transformCall850);
					expression77=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression77, currentScope,FUNC_CALL78.getLine(),FUNC_CALL78.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall859); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall861); 
					pushFollow(FOLLOW_expression_in_transformCall863);
					expression79=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression79,currentScope,FUNC_CALL80.getLine(),FUNC_CALL80.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall872); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall874); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall876);
							exprList81=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList81,FUNC_CALL82.getLine(),FUNC_CALL82.getCharPositionInLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall886); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall888); 
					pushFollow(FOLLOW_expression_in_transformCall890);
					expression83=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression83,FUNC_CALL84.getLine(),FUNC_CALL84.getCharPositionInLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:169:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall899); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall901); 
					pushFollow(FOLLOW_expression_in_transformCall903);
					expression85=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression85,FUNC_CALL86.getLine(),FUNC_CALL86.getCharPositionInLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall912); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall914); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall916);
							exprList87=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList87, currentScope,FUNC_CALL88.getLine(),FUNC_CALL88.getCharPositionInLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall926); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall928); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall930);
							exprList89=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList89, currentScope,FUNC_CALL90.getLine(),FUNC_CALL90.getCharPositionInLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall940); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall942); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall944);
							exprList91=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList91, currentScope,FUNC_CALL92.getLine(),FUNC_CALL92.getCharPositionInLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall954); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall956); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall958);
							exprList93=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList93, currentScope,FUNC_CALL94.getLine(),FUNC_CALL94.getCharPositionInLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:174:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall968); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall970); 
					pushFollow(FOLLOW_expression_in_transformCall972);
					expression95=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression95,currentScope,FUNC_CALL96.getLine(),FUNC_CALL96.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL98=null;
		CommonTree FUNC_CALL100=null;
		CommonTree FUNC_CALL102=null;
		java.util.List<DCNode> exprList97 =null;
		java.util.List<DCNode> exprList99 =null;
		java.util.List<DCNode> exprList101 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1004); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall1006); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1008);
							exprList97=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList97,currentScope,FUNC_CALL98.getLine(),FUNC_CALL98.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL100=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1020); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall1022); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1024);
							exprList99=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList99,currentScope,FUNC_CALL100.getLine(),FUNC_CALL100.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL102=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1036); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1038); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1040);
							exprList101=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList101,currentScope,FUNC_CALL102.getLine(),FUNC_CALL102.getCharPositionInLine(),widthParam, heightParam);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:186:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL130=null;
		CommonTree FUNC_CALL132=null;
		CommonTree FUNC_CALL134=null;
		DCNode expression103 =null;
		DCNode expression105 =null;
		DCNode expression107 =null;
		java.util.List<DCNode> exprList109 =null;
		java.util.List<DCNode> exprList111 =null;
		java.util.List<DCNode> exprList113 =null;
		DCNode expression115 =null;
		DCNode expression117 =null;
		java.util.List<DCNode> exprList119 =null;
		java.util.List<DCNode> exprList121 =null;
		DCNode expression123 =null;
		java.util.List<DCNode> exprList125 =null;
		DCNode expression127 =null;
		DCNode expression129 =null;
		DCNode expression131 =null;
		DCNode expression133 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL104=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1075); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1077); 
					pushFollow(FOLLOW_expression_in_mathCall1079);
					expression103=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression103,FUNC_CALL104.getLine(),FUNC_CALL104.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL106=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1089); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1091); 
					pushFollow(FOLLOW_expression_in_mathCall1093);
					expression105=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression105,FUNC_CALL106.getLine(),FUNC_CALL106.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL108=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1103); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1105); 
					pushFollow(FOLLOW_expression_in_mathCall1107);
					expression107=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression107,FUNC_CALL108.getLine(),FUNC_CALL108.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL110=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1117); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1119); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:22: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1121);
							exprList109=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ATanNode(exprList109,FUNC_CALL110.getLine(),FUNC_CALL110.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL112=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1132); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1134); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:24: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1136);
							exprList111=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList111,FUNC_CALL112.getLine(),FUNC_CALL112.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:192:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL114=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1147); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1149); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:192:21: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:192:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1151);
							exprList113=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PowFNode(exprList113,FUNC_CALL114.getLine(),FUNC_CALL114.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:193:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL116=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1161); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1163); 
					pushFollow(FOLLOW_expression_in_mathCall1165);
					expression115=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression115,FUNC_CALL116.getLine(),FUNC_CALL116.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL118=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1174); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1176); 
					pushFollow(FOLLOW_expression_in_mathCall1178);
					expression117=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression117,FUNC_CALL118.getLine(),FUNC_CALL118.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL120=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1187); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1189); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:26: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1191);
							exprList119=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList119,FUNC_CALL120.getLine(),FUNC_CALL120.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:196:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL122=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1202); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1204); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:196:23: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:196:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1206);
							exprList121=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList121,FUNC_CALL122.getLine(),FUNC_CALL122.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:197:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL124=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1217); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1219); 
					pushFollow(FOLLOW_expression_in_mathCall1221);
					expression123=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression123,FUNC_CALL124.getLine(),FUNC_CALL124.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL126=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1231); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1233); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:21: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1235);
							exprList125=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList125,FUNC_CALL126.getLine(),FUNC_CALL126.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:199:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL128=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1246); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1248); 
					pushFollow(FOLLOW_expression_in_mathCall1250);
					expression127=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression127,"inch",unitParam,FUNC_CALL128.getLine(),FUNC_CALL128.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:200:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL130=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1259); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1261); 
					pushFollow(FOLLOW_expression_in_mathCall1263);
					expression129=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression129,"mm",unitParam,FUNC_CALL130.getLine(),FUNC_CALL130.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:201:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL132=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1272); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1274); 
					pushFollow(FOLLOW_expression_in_mathCall1276);
					expression131=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression131,"cm",unitParam,FUNC_CALL132.getLine(),FUNC_CALL132.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:202:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL134=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1285); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1287); 
					pushFollow(FOLLOW_expression_in_mathCall1289);
					expression133=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression133,"units",unitParam,FUNC_CALL134.getLine(),FUNC_CALL134.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:208:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL136=null;
		CommonTree FUNC_CALL138=null;
		CommonTree FUNC_CALL140=null;
		CommonTree FUNC_CALL142=null;
		CommonTree FUNC_CALL144=null;
		CommonTree FUNC_CALL146=null;
		CommonTree FUNC_CALL148=null;
		CommonTree FUNC_CALL150=null;
		CommonTree FUNC_CALL152=null;
		CommonTree FUNC_CALL154=null;
		DCNode expression135 =null;
		DCNode expression137 =null;
		DCNode expression139 =null;
		DCNode expression141 =null;
		DCNode expression143 =null;
		DCNode expression145 =null;
		java.util.List<DCNode> exprList147 =null;
		java.util.List<DCNode> exprList149 =null;
		java.util.List<DCNode> exprList151 =null;
		java.util.List<DCNode> exprList153 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:209:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:209:5: ^( FUNC_CALL GetWidth expression )
					{
					FUNC_CALL136=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1327); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1329); 
					pushFollow(FOLLOW_expression_in_getCall1331);
					expression135=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression135,FUNC_CALL136.getLine(),FUNC_CALL136.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:210:5: ^( FUNC_CALL GetHeight expression )
					{
					FUNC_CALL138=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1341); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1343); 
					pushFollow(FOLLOW_expression_in_getCall1345);
					expression137=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression137,FUNC_CALL138.getLine(),FUNC_CALL138.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:211:5: ^( FUNC_CALL GetX expression )
					{
					FUNC_CALL140=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1354); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1356); 
					pushFollow(FOLLOW_expression_in_getCall1358);
					expression139=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression139,FUNC_CALL140.getLine(),FUNC_CALL140.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:212:5: ^( FUNC_CALL GetY expression )
					{
					FUNC_CALL142=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1367); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1369); 
					pushFollow(FOLLOW_expression_in_getCall1371);
					expression141=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression141,FUNC_CALL142.getLine(),FUNC_CALL142.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:213:5: ^( FUNC_CALL GetOrigin expression )
					{
					FUNC_CALL144=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1380); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1382); 
					pushFollow(FOLLOW_expression_in_getCall1384);
					expression143=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression143,FUNC_CALL144.getLine(),FUNC_CALL144.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:214:5: ^( FUNC_CALL GetRotation expression )
					{
					FUNC_CALL146=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1393); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1395); 
					pushFollow(FOLLOW_expression_in_getCall1397);
					expression145=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression145,FUNC_CALL146.getLine(),FUNC_CALL146.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:215:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1406); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1408); 
					pushFollow(FOLLOW_expression_in_getCall1410);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:216:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1418); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1420); 
					pushFollow(FOLLOW_expression_in_getCall1422);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:217:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1430); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1432); 
					pushFollow(FOLLOW_expression_in_getCall1434);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1441); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1443); 
					pushFollow(FOLLOW_expression_in_getCall1445);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					FUNC_CALL148=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1453); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1455); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:28: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==EXP_LIST) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1457);
							exprList147=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList147,FUNC_CALL148.getLine(),FUNC_CALL148.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					FUNC_CALL150=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1467); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1469); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:29: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1471);
							exprList149=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList149,FUNC_CALL150.getLine(),FUNC_CALL150.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					FUNC_CALL152=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1481); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1483); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:25: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1485);
							exprList151=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetAngleNode(exprList151,FUNC_CALL152.getLine(),FUNC_CALL152.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:222:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					FUNC_CALL154=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1496); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1498); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:222:26: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==EXP_LIST) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:222:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1500);
							exprList153=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetRadiusNode(exprList153,FUNC_CALL154.getLine(),FUNC_CALL154.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL156=null;
		java.util.List<DCNode> exprList155 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			FUNC_CALL156=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1528); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1530); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:25: ( exprList )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==EXP_LIST) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1532);
					exprList155=exprList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new SliderNode(exprList155,currentScope,FUNC_CALL156.getLine(),FUNC_CALL156.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:4: templateCall returns [DCNode node] : ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) );
	public final DCNode templateCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL158=null;
		CommonTree FUNC_CALL160=null;
		CommonTree FUNC_CALL162=null;
		CommonTree FUNC_CALL164=null;
		CommonTree FUNC_CALL166=null;
		CommonTree FUNC_CALL168=null;
		CommonTree FUNC_CALL170=null;
		CommonTree FUNC_CALL172=null;
		CommonTree FUNC_CALL174=null;
		java.util.List<DCNode> exprList157 =null;
		java.util.List<DCNode> exprList159 =null;
		java.util.List<DCNode> exprList161 =null;
		java.util.List<DCNode> exprList163 =null;
		java.util.List<DCNode> exprList165 =null;
		java.util.List<DCNode> exprList167 =null;
		java.util.List<DCNode> exprList169 =null;
		java.util.List<DCNode> exprList171 =null;
		java.util.List<DCNode> exprList173 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:4: ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:6: ^( FUNC_CALL Template ( exprList )? )
					{
					FUNC_CALL158=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1563); 
					match(input, Token.DOWN, null); 
					match(input,Template,FOLLOW_Template_in_templateCall1565); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:27: ( exprList )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==EXP_LIST) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1567);
							exprList157=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateNode(exprList157,FUNC_CALL158.getLine(),FUNC_CALL158.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:5: ^( FUNC_CALL SetWidth ( exprList )? )
					{
					FUNC_CALL160=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1578); 
					match(input, Token.DOWN, null); 
					match(input,SetWidth,FOLLOW_SetWidth_in_templateCall1580); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:26: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EXP_LIST) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1582);
							exprList159=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetWidthNode(exprList159,FUNC_CALL160.getLine(),FUNC_CALL160.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:5: ^( FUNC_CALL SetHeight ( exprList )? )
					{
					FUNC_CALL162=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1593); 
					match(input, Token.DOWN, null); 
					match(input,SetHeight,FOLLOW_SetHeight_in_templateCall1595); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:27: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EXP_LIST) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1597);
							exprList161=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHeightNode(exprList161,FUNC_CALL162.getLine(),FUNC_CALL162.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:5: ^( FUNC_CALL SetSeam ( exprList )? )
					{
					FUNC_CALL164=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1607); 
					match(input, Token.DOWN, null); 
					match(input,SetSeam,FOLLOW_SetSeam_in_templateCall1609); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:25: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EXP_LIST) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1611);
							exprList163=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetSeamNode(exprList163,FUNC_CALL164.getLine(),FUNC_CALL164.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:5: ^( FUNC_CALL SetName ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1621); 
					match(input, Token.DOWN, null); 
					match(input,SetName,FOLLOW_SetName_in_templateCall1623); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:25: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EXP_LIST) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1625);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:5: ^( FUNC_CALL SetVFold ( exprList )? )
					{
					FUNC_CALL166=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1634); 
					match(input, Token.DOWN, null); 
					match(input,SetVFold,FOLLOW_SetVFold_in_templateCall1636); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:26: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EXP_LIST) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1638);
							exprList165=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetVFoldNode(exprList165,FUNC_CALL166.getLine(),FUNC_CALL166.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:5: ^( FUNC_CALL SetHFold ( exprList )? )
					{
					FUNC_CALL168=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1648); 
					match(input, Token.DOWN, null); 
					match(input,SetHFold,FOLLOW_SetHFold_in_templateCall1650); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:26: ( exprList )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==EXP_LIST) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1652);
							exprList167=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHFoldNode(exprList167,FUNC_CALL168.getLine(),FUNC_CALL168.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:5: ^( FUNC_CALL SetCorner ( exprList )? )
					{
					FUNC_CALL170=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1662); 
					match(input, Token.DOWN, null); 
					match(input,SetCorner,FOLLOW_SetCorner_in_templateCall1664); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:27: ( exprList )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==EXP_LIST) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1666);
							exprList169=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCornerNode(exprList169,FUNC_CALL170.getLine(),FUNC_CALL170.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:5: ^( FUNC_CALL TemplateCollection ( exprList )? )
					{
					FUNC_CALL172=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1677); 
					match(input, Token.DOWN, null); 
					match(input,TemplateCollection,FOLLOW_TemplateCollection_in_templateCall1679); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:38: ( exprList )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==EXP_LIST) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:38: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1683);
							exprList171=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCollectionNode(exprList171,FUNC_CALL172.getLine(),FUNC_CALL172.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:5: ^( FUNC_CALL AddDesign ( exprList )? )
					{
					FUNC_CALL174=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1693); 
					match(input, Token.DOWN, null); 
					match(input,AddDesign,FOLLOW_AddDesign_in_templateCall1695); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:27: ( exprList )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==EXP_LIST) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1697);
							exprList173=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateAddDesignNode(exprList173,FUNC_CALL174.getLine(),FUNC_CALL174.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1734); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1736);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:26: ( elseIfStat[ifNode] )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==EXP) ) {
					int LA63_1 = input.LA(2);
					if ( (LA63_1==DOWN) ) {
						int LA63_3 = input.LA(3);
						if ( (LA63_3==Add||LA63_3==Bool||LA63_3==COLOR_CONSTANT||LA63_3==DOTPROPERTY||LA63_3==Divide||LA63_3==Equals||(LA63_3 >= GT && LA63_3 <= GTEquals)||LA63_3==HEIGHT_CONSTANT||LA63_3==In||LA63_3==LOOKUP||(LA63_3 >= LT && LA63_3 <= LTEquals)||LA63_3==Modulus||(LA63_3 >= Multiply && LA63_3 <= NEquals)||(LA63_3 >= Null && LA63_3 <= Number)||LA63_3==PI_CONSTANT||LA63_3==Pw||(LA63_3 >= Subtract && LA63_3 <= TERNARY)||LA63_3==UNARY_MIN||LA63_3==WIDTH_CONSTANT||(LA63_3 >= 168 && LA63_3 <= 169)) ) {
							alt63=1;
						}

					}

				}

				switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1740);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop63;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:48: ( elseStat[ifNode] )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1746);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:249:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression175 =null;
		BlockNode block176 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:250:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:250:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1766); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1768);
			expression175=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1770);
			block176=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression175, block176);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:253:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression177 =null;
		BlockNode block178 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1789); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1791);
			expression177=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1793);
			block178=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression177, block178);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:257:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block179 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:258:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:258:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1812); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1814);
			block179=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block179);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:261:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier180=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block181 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:262:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:262:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1839); 
			match(input, Token.DOWN, null); 
			Identifier180=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1841); 
			pushFollow(FOLLOW_expression_in_forStatement1845);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1849);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1851);
			block181=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier180!=null?Identifier180.getText():null), a, b, block181, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier182=null;
		CommonTree Repeat184=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block183 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			Repeat184=(CommonTree)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1874); 
			match(input, Token.DOWN, null); 
			Identifier182=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1876); 
			pushFollow(FOLLOW_expression_in_repeatStatement1880);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1884);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:51: (c= expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Add||LA65_0==Bool||LA65_0==COLOR_CONSTANT||LA65_0==DOTPROPERTY||LA65_0==Divide||LA65_0==Equals||(LA65_0 >= GT && LA65_0 <= GTEquals)||LA65_0==HEIGHT_CONSTANT||LA65_0==In||LA65_0==LOOKUP||(LA65_0 >= LT && LA65_0 <= LTEquals)||LA65_0==Modulus||(LA65_0 >= Multiply && LA65_0 <= NEquals)||(LA65_0 >= Null && LA65_0 <= Number)||LA65_0==PI_CONSTANT||LA65_0==Pw||(LA65_0 >= Subtract && LA65_0 <= TERNARY)||LA65_0==UNARY_MIN||LA65_0==WIDTH_CONSTANT||(LA65_0 >= 168 && LA65_0 <= 169)) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1889);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1893);
			block183=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier182!=null?Identifier182.getText():null), a, b, c, block183, currentScope, Repeat184.getLine(), Repeat184.getCharPositionInLine());
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



	// $ANTLR start "radialStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:268:1: radialStatement returns [DCNode node] : ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) ;
	public final DCNode radialStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree Radial186=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block185 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:2: ( ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:4: ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block )
			{
			Radial186=(CommonTree)match(input,Radial,FOLLOW_Radial_in_radialStatement1912); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1918); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1922); 
			pushFollow(FOLLOW_expression_in_radialStatement1927);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1931); 
			pushFollow(FOLLOW_expression_in_radialStatement1935);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_radialStatement1937);
			block185=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RadialStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), a, b, block185, currentScope,Radial186.getLine(), Radial186.getCharPositionInLine());
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
	// $ANTLR end "radialStatement"



	// $ANTLR start "followCurveStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:272:1: followCurveStatement returns [DCNode node] : ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block ) ;
	public final DCNode followCurveStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree FollowCurve188=null;
		DCNode c =null;
		DCNode a =null;
		BlockNode block187 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:273:2: ( ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:273:4: ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block )
			{
			FollowCurve188=(CommonTree)match(input,FollowCurve,FOLLOW_FollowCurve_in_followCurveStatement1957); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_followCurveStatement1961); 
			pushFollow(FOLLOW_statement_in_followCurveStatement1966);
			c=statement();
			state._fsp--;

			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_followCurveStatement1970); 
			pushFollow(FOLLOW_expression_in_followCurveStatement1974);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_followCurveStatement1976);
			block187=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new FollowCurveStatementNode((gId!=null?gId.getText():null), c, (id1!=null?id1.getText():null), a, block187, currentScope,FollowCurve188.getLine(), FollowCurve188.getCharPositionInLine());
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
	// $ANTLR end "followCurveStatement"



	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:276:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression189 =null;
		BlockNode block190 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1997); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1999);
			expression189=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement2001);
			block190=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression189, block190);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:280:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier191=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList2028); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:16: ( Identifier )+
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:17: Identifier
					{
					Identifier191=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList2031); 
					i.add((Identifier191!=null?Identifier191.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:285:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression192 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList2061); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:17: ( expression )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Add||LA67_0==Bool||LA67_0==COLOR_CONSTANT||LA67_0==DOTPROPERTY||LA67_0==Divide||LA67_0==Equals||(LA67_0 >= GT && LA67_0 <= GTEquals)||LA67_0==HEIGHT_CONSTANT||LA67_0==In||LA67_0==LOOKUP||(LA67_0 >= LT && LA67_0 <= LTEquals)||LA67_0==Modulus||(LA67_0 >= Multiply && LA67_0 <= NEquals)||(LA67_0 >= Null && LA67_0 <= Number)||LA67_0==PI_CONSTANT||LA67_0==Pw||(LA67_0 >= Subtract && LA67_0 <= TERNARY)||LA67_0==UNARY_MIN||LA67_0==WIDTH_CONSTANT||(LA67_0 >= 168 && LA67_0 <= 169)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList2064);
					expression192=expression();
					state._fsp--;

					e.add(expression192);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:291:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number193=null;
		CommonTree Bool194=null;
		CommonTree COLOR_CONSTANT196=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup195 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
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
			case 169:
				{
				alt68=3;
				}
				break;
			case 168:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression2089); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2093);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2097);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2101);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:293:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression2112); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2116);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2120);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:294:6: ^( '||' a= expression b= expression )
					{
					match(input,169,FOLLOW_169_in_expression2149); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2153);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2157);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:295:6: ^( '&&' a= expression b= expression )
					{
					match(input,168,FOLLOW_168_in_expression2184); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2188);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2192);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:296:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression2219); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2223);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2227);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:297:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression2254); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2258);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2262);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:298:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2293);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2297);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:299:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2324); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2328);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2332);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:300:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2359); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2363);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2367);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:301:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2395); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2399);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2403);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:302:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2431); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2435);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2439);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:303:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2467); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2471);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2475);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:304:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2503); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2507);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2511);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2539); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2543);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2547);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:306:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2575); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2579);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2583);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:307:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2611); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2615);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2619);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2647); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2651);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:309:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2686); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2690);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:6: Number
					{
					Number193=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2727); 
					node = new AtomNode(Double.parseDouble((Number193!=null?Number193.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:311:6: Bool
					{
					Bool194=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2779); 
					node = new AtomNode(Boolean.parseBoolean((Bool194!=null?Bool194.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:312:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2833); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:313:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2887);
					lookup195=lookup();
					state._fsp--;

					node = lookup195;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:314:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT196=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2939); 
					node = new AtomNode((COLOR_CONSTANT196!=null?COLOR_CONSTANT196.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:315:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2958); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression3004); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:317:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression3049); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:320:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList197 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list3108); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:13: ( exprList )?
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==EXP_LIST) ) {
					alt69=1;
				}
				switch (alt69) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list3110);
						exprList197=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList197);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:326:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier200=null;
		CommonTree DOTPROPERTY201=null;
		CommonTree LOOKUP204=null;
		CommonTree LOOKUP206=null;
		CommonTree LOOKUP208=null;
		CommonTree Identifier209=null;
		CommonTree LOOKUP210=null;
		CommonTree String211=null;
		CommonTree LOOKUP212=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall198 =null;
		java.util.List<PropertyNode> dotProperty199 =null;
		java.util.List<PropertyNode> dotProperty202 =null;
		DCNode functionCall203 =null;
		DCNode list205 =null;
		DCNode expression207 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:327:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
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
					case 168:
					case 169:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:327:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3133); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3135);
					functionCall198=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup3137);
					dotProperty199=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall198, dotProperty199);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:328:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY201=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3145); 
					match(input, Token.DOWN, null); 
					Identifier200=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3147); 
					pushFollow(FOLLOW_dotProperty_in_lookup3149);
					dotProperty202=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier200!=null?Identifier200.getText():null), currentScope,DOTPROPERTY201.getLine()), dotProperty202);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:334:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP204=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3173); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3175);
					functionCall203=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:334:28: (i= indexes )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==INDEXES) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:334:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3179);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall203, i,LOOKUP204.getLine()) : functionCall203;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:335:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP206=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3191); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup3193);
					list205=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:335:21: (i= indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==INDEXES) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:335:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3197);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list205, i, LOOKUP206.getLine()) : list205;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:336:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP208=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3217); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup3219);
					expression207=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:336:27: (i= indexes )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==INDEXES) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:336:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3223);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression207, i,LOOKUP208.getLine()) : expression207;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP210=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3237); 
					match(input, Token.DOWN, null); 
					Identifier209=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3239); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:27: (i= indexes )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==INDEXES) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3243);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier209!=null?Identifier209.getText():null), currentScope,LOOKUP210.getLine()), i,LOOKUP210.getLine()) : new IdentifierNode((Identifier209!=null?Identifier209.getText():null), currentScope,LOOKUP210.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:338:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP212=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3257); 
					match(input, Token.DOWN, null); 
					String211=(CommonTree)match(input,String,FOLLOW_String_in_lookup3259); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:338:23: (i= indexes )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==INDEXES) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:338:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3263);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String211!=null?String211.getText():null)), i,LOOKUP212.getLine()) : new AtomNode((String211!=null?String211.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:348:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression213 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3312); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:16: ( expression )+
			int cnt76=0;
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==Add||LA76_0==Bool||LA76_0==COLOR_CONSTANT||LA76_0==DOTPROPERTY||LA76_0==Divide||LA76_0==Equals||(LA76_0 >= GT && LA76_0 <= GTEquals)||LA76_0==HEIGHT_CONSTANT||LA76_0==In||LA76_0==LOOKUP||(LA76_0 >= LT && LA76_0 <= LTEquals)||LA76_0==Modulus||(LA76_0 >= Multiply && LA76_0 <= NEquals)||(LA76_0 >= Null && LA76_0 <= Number)||LA76_0==PI_CONSTANT||LA76_0==Pw||(LA76_0 >= Subtract && LA76_0 <= TERNARY)||LA76_0==UNARY_MIN||LA76_0==WIDTH_CONSTANT||(LA76_0 >= 168 && LA76_0 <= 169)) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3315);
					expression213=expression();
					state._fsp--;

					e.add(expression213);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:355:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression214 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3353); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:12: ( dotExpression )+
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3356);
					dotExpression214=dotExpression();
					state._fsp--;

					e.add(dotExpression214);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:360:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3384); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:362:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3392); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:363:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3400); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:364:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3408); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:365:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3416); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:366:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3424); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:367:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3432); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:368:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3440); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:369:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3448); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:370:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3455); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:371:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3462); 
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
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0001200000000048L,0x1200000000000100L,0x0000004000000000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_radialStatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_followCurveStatement_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment230 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment232 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41210L,0x0000030906000000L});
	public static final BitSet FOLLOW_indexes_in_assignment234 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_assignment237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall279 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall281 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall297 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall314 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall316 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall333 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall351 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall371 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall388 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall480 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall482 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall498 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall515 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall533 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall551 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall567 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall583 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall599 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall616 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall647 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall665 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall683 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall700 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall715 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall730 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall732 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall747 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall762 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall776 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall778 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall790 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall792 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall803 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall805 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall807 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall819 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall821 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall833 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall848 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall850 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall859 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall861 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall863 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall872 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall874 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall876 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall888 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall890 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall901 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall912 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall914 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall916 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall928 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall930 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall942 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall944 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall954 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall956 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall958 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall970 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall972 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1004 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall1006 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1020 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall1022 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1024 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1036 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1038 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1040 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1075 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1077 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1079 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1091 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1093 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1105 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1119 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1134 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1149 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1163 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1165 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1176 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1189 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1191 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1204 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1219 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1233 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1248 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1261 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1263 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1274 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1287 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1329 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1343 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1356 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1369 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1371 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1382 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1395 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1397 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1408 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1420 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1432 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1434 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1443 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1445 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1453 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1455 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1457 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1469 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1483 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1485 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1498 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1530 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Template_in_templateCall1565 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall1580 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall1595 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1597 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall1609 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetName_in_templateCall1623 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1634 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetVFold_in_templateCall1636 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHFold_in_templateCall1650 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetCorner_in_templateCall1664 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TemplateCollection_in_templateCall1679 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1693 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AddDesign_in_templateCall1695 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1736 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1740 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1766 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1768 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_ifStat1770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1791 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1812 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1814 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1841 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1845 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1849 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_forStatement1851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1876 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1880 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1884 = new BitSet(new long[]{0x000602042004C100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1889 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1893 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Radial_in_radialStatement1912 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1922 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1931 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1935 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_radialStatement1937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FollowCurve_in_followCurveStatement1957 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_followCurveStatement1961 = new BitSet(new long[]{0x0001200000000040L,0x1200000000000100L,0x0000004000000000L});
	public static final BitSet FOLLOW_statement_in_followCurveStatement1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Identifier_in_followCurveStatement1970 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_followCurveStatement1974 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_followCurveStatement1976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1999 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_whileStatement2001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList2028 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList2031 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList2061 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList2064 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_TERNARY_in_expression2089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2093 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2097 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression2112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2116 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2120 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_169_in_expression2149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2153 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_168_in_expression2184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2188 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression2219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2223 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression2254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2258 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2293 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2328 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2363 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2399 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2403 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2435 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2471 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2507 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2543 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2579 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2615 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2686 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression3004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression3049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list3108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list3110 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3135 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3147 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3175 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3179 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup3193 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup3219 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3239 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup3259 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3263 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3315 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3356 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x001FFC0000000000L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3462 = new BitSet(new long[]{0x0000000000000002L});
}
