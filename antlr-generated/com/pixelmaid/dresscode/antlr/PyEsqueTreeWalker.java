// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g 2014-04-08 16:52:03

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
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==IF||LA1_0==Radial||LA1_0==Repeat||LA1_0==While) ) {
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:92:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | whileStatement | radialStatement | repeatStatement );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode whileStatement7 =null;
		DCNode radialStatement8 =null;
		DCNode repeatStatement9 =null;


			//System.out.println(" statement called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:96:3: ( assignment | functionCall | ifStatement | whileStatement | radialStatement | repeatStatement )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:101:5: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement193);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:106:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		CommonTree ASSIGNMENT13=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT13=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment222); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment224); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment226);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||(LA5_0 >= 168 && LA5_0 <= 169)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment229);
					expression12=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier10!=null?Identifier10.getText():null), indexes11, expression12, currentScope,ASSIGNMENT13.getLine(),ASSIGNMENT13.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:117:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier14=null;
		CommonTree FUNC_CALL16=null;
		CommonTree FUNC_CALL18=null;
		CommonTree FUNC_CALL20=null;
		CommonTree FUNC_CALL22=null;
		CommonTree FUNC_CALL24=null;
		CommonTree FUNC_CALL26=null;
		CommonTree FUNC_CALL28=null;
		java.util.List<DCNode> exprList15 =null;
		DCNode expression17 =null;
		DCNode expression19 =null;
		DCNode expression21 =null;
		DCNode expression23 =null;
		java.util.List<DCNode> exprList25 =null;
		java.util.List<DCNode> exprList27 =null;
		DCNode primitiveCall29 =null;
		DCNode transformCall30 =null;
		DCNode patternCall31 =null;
		DCNode mathCall32 =null;
		DCNode getCall33 =null;
		DCNode uICall34 =null;
		DCNode templateCall35 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
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
					case FollowCurve:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL16=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall271); 
					match(input, Token.DOWN, null); 
					Identifier14=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall273); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall275);
							exprList15=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier14!=null?Identifier14.getText():null), exprList15, functions, widthParam, heightParam, unitParam,FUNC_CALL16.getLine(),FUNC_CALL16.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:6: ^( FUNC_CALL Println ( expression )? )
					{
					FUNC_CALL18=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall287); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall289); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||(LA7_0 >= 168 && LA7_0 <= 169)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall291);
							expression17=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression17,FUNC_CALL18.getLine(),FUNC_CALL18.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:6: ^( FUNC_CALL Print expression )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall304); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall306); 
					pushFollow(FOLLOW_expression_in_functionCall308);
					expression19=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression19,FUNC_CALL20.getLine(),FUNC_CALL20.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:124:6: ^( FUNC_CALL Assert expression )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall323); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall325); 
					pushFollow(FOLLOW_expression_in_functionCall327);
					expression21=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression21,FUNC_CALL22.getLine(),FUNC_CALL22.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:125:6: ^( FUNC_CALL Size expression )
					{
					FUNC_CALL24=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall341); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall343); 
					pushFollow(FOLLOW_expression_in_functionCall345);
					expression23=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression23,FUNC_CALL24.getLine(),FUNC_CALL24.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:126:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL26=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall361); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall363); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:126:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:126:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall365);
							exprList25=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList25,FUNC_CALL26.getLine(),FUNC_CALL26.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL28=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall378); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall380); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall382);
							exprList27=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList27,FUNC_CALL28.getLine(),FUNC_CALL28.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall393);
					primitiveCall29=primitiveCall();
					state._fsp--;

					node = primitiveCall29; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:129:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall402);
					transformCall30=transformCall();
					state._fsp--;

					node = transformCall30; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:130:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall411);
					patternCall31=patternCall();
					state._fsp--;

					node = patternCall31; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:131:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall420);
					mathCall32=mathCall();
					state._fsp--;

					node= mathCall32; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:132:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall429);
					getCall33=getCall();
					state._fsp--;

					node= getCall33; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall437);
					uICall34=uICall();
					state._fsp--;

					node = uICall34; ((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:5: templateCall
					{
					pushFollow(FOLLOW_templateCall_in_functionCall445);
					templateCall35=templateCall();
					state._fsp--;

					node = templateCall35; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:138:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL37=null;
		CommonTree FUNC_CALL39=null;
		CommonTree FUNC_CALL41=null;
		CommonTree FUNC_CALL43=null;
		CommonTree FUNC_CALL45=null;
		CommonTree FUNC_CALL47=null;
		CommonTree FUNC_CALL49=null;
		java.util.List<DCNode> exprList36 =null;
		java.util.List<DCNode> exprList38 =null;
		java.util.List<DCNode> exprList40 =null;
		java.util.List<DCNode> exprList42 =null;
		java.util.List<DCNode> exprList44 =null;
		java.util.List<DCNode> exprList46 =null;
		java.util.List<DCNode> exprList48 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall472); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall474); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall476);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList36,FUNC_CALL37.getLine(),FUNC_CALL37.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall488); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall490); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall492);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList38,FUNC_CALL39.getLine(),FUNC_CALL39.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall505); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall507); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall509);
							exprList40=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList40,FUNC_CALL41.getLine(),FUNC_CALL41.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall523); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall525); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall527);
							exprList42=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList42,FUNC_CALL43.getLine(),FUNC_CALL43.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall541); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall543); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:143:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall545);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList44,FUNC_CALL45.getLine(),FUNC_CALL45.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall557); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall559); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall561);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall573); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall575); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall577);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall589); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall591); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall593);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList46,FUNC_CALL47.getLine(),FUNC_CALL47.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall606); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall608); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall610);
							exprList48=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList48,FUNC_CALL49.getLine(),FUNC_CALL49.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL93=null;
		CommonTree FUNC_CALL95=null;
		java.util.List<DCNode> exprList50 =null;
		java.util.List<DCNode> exprList52 =null;
		java.util.List<DCNode> exprList54 =null;
		DCNode expression56 =null;
		java.util.List<DCNode> exprList58 =null;
		java.util.List<DCNode> exprList60 =null;
		java.util.List<DCNode> exprList62 =null;
		DCNode expression64 =null;
		DCNode expression66 =null;
		java.util.List<DCNode> exprList68 =null;
		DCNode expression70 =null;
		DCNode expression72 =null;
		java.util.List<DCNode> exprList74 =null;
		DCNode expression76 =null;
		DCNode expression78 =null;
		java.util.List<DCNode> exprList80 =null;
		DCNode expression82 =null;
		DCNode expression84 =null;
		java.util.List<DCNode> exprList86 =null;
		java.util.List<DCNode> exprList88 =null;
		java.util.List<DCNode> exprList90 =null;
		java.util.List<DCNode> exprList92 =null;
		DCNode expression94 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall637); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall639); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall641);
							exprList50=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList50,FUNC_CALL51.getLine(),FUNC_CALL51.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall655); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall657); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall659);
							exprList52=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList52,FUNC_CALL53.getLine(),FUNC_CALL53.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall673); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall675); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall677);
							exprList54=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList54,FUNC_CALL55.getLine(),FUNC_CALL55.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:154:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall690); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall692); 
					pushFollow(FOLLOW_expression_in_transformCall694);
					expression56=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression56,FUNC_CALL57.getLine(),FUNC_CALL57.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall705); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall707); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall709);
							exprList58=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList58,currentScope,FUNC_CALL59.getLine(),FUNC_CALL59.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall720); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall722); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall724);
							exprList60=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList60,FUNC_CALL61.getLine(),FUNC_CALL61.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall737); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall739); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall741);
							exprList62=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList62,FUNC_CALL63.getLine(),FUNC_CALL63.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall752); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall754); 
					pushFollow(FOLLOW_expression_in_transformCall756);
					expression64=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression64 ,FUNC_CALL65.getLine(),FUNC_CALL65.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:159:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall766); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall768); 
					pushFollow(FOLLOW_expression_in_transformCall770);
					expression66=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression66,FUNC_CALL67.getLine(),FUNC_CALL67.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL69=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall780); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall782); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall784);
							exprList68=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList68,FUNC_CALL69.getLine(),FUNC_CALL69.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL71=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall795); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall797); 
					pushFollow(FOLLOW_expression_in_transformCall799);
					expression70=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression70,FUNC_CALL71.getLine(),FUNC_CALL71.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:162:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL73=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall809); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall811); 
					pushFollow(FOLLOW_expression_in_transformCall813);
					expression72=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression72,FUNC_CALL73.getLine(),FUNC_CALL73.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL75=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall823); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall825); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall827);
							exprList74=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList74,FUNC_CALL75.getLine(),FUNC_CALL75.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL77=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall838); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall840); 
					pushFollow(FOLLOW_expression_in_transformCall842);
					expression76=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression76, currentScope,FUNC_CALL77.getLine(),FUNC_CALL77.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL79=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall851); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall853); 
					pushFollow(FOLLOW_expression_in_transformCall855);
					expression78=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression78,currentScope,FUNC_CALL79.getLine(),FUNC_CALL79.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL81=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall864); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall866); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall868);
							exprList80=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList80,FUNC_CALL81.getLine(),FUNC_CALL81.getCharPositionInLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL83=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall878); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall880); 
					pushFollow(FOLLOW_expression_in_transformCall882);
					expression82=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression82,FUNC_CALL83.getLine(),FUNC_CALL83.getCharPositionInLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL85=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall891); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall893); 
					pushFollow(FOLLOW_expression_in_transformCall895);
					expression84=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression84,FUNC_CALL85.getLine(),FUNC_CALL85.getCharPositionInLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:169:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL87=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall904); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall906); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:169:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:169:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall908);
							exprList86=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList86, currentScope,FUNC_CALL87.getLine(),FUNC_CALL87.getCharPositionInLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL89=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall918); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall920); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:170:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall922);
							exprList88=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList88, currentScope,FUNC_CALL89.getLine(),FUNC_CALL89.getCharPositionInLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL91=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall932); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall934); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall936);
							exprList90=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList90, currentScope,FUNC_CALL91.getLine(),FUNC_CALL91.getCharPositionInLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL93=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall946); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall948); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall950);
							exprList92=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList92, currentScope,FUNC_CALL93.getLine(),FUNC_CALL93.getCharPositionInLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL95=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall960); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall962); 
					pushFollow(FOLLOW_expression_in_transformCall964);
					expression94=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression94,currentScope,FUNC_CALL95.getLine(),FUNC_CALL95.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:177:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) | ^( FUNC_CALL FollowCurve ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL97=null;
		CommonTree FUNC_CALL99=null;
		CommonTree FUNC_CALL101=null;
		CommonTree FUNC_CALL103=null;
		java.util.List<DCNode> exprList96 =null;
		java.util.List<DCNode> exprList98 =null;
		java.util.List<DCNode> exprList100 =null;
		java.util.List<DCNode> exprList102 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) | ^( FUNC_CALL FollowCurve ( exprList )? ) )
			int alt39=4;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==FUNC_CALL) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Grid:
						{
						alt39=1;
						}
						break;
					case Wave:
						{
						alt39=2;
						}
						break;
					case Arc:
						{
						alt39=3;
						}
						break;
					case FollowCurve:
						{
						alt39=4;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 2, input);
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL97=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall996); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall998); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1000);
							exprList96=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList96,currentScope,FUNC_CALL97.getLine(),FUNC_CALL97.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL99=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1012); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall1014); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1016);
							exprList98=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList98,currentScope,FUNC_CALL99.getLine(),FUNC_CALL99.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL101=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1028); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1030); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1032);
							exprList100=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList100,currentScope,FUNC_CALL101.getLine(),FUNC_CALL101.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:6: ^( FUNC_CALL FollowCurve ( exprList )? )
					{
					FUNC_CALL103=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1044); 
					match(input, Token.DOWN, null); 
					match(input,FollowCurve,FOLLOW_FollowCurve_in_patternCall1046); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:30: ( exprList )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==EXP_LIST) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:30: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1048);
							exprList102=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FollowCurveNode(exprList102,currentScope,FUNC_CALL103.getLine(),FUNC_CALL103.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:185:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL131=null;
		CommonTree FUNC_CALL133=null;
		CommonTree FUNC_CALL135=null;
		DCNode expression104 =null;
		DCNode expression106 =null;
		DCNode expression108 =null;
		java.util.List<DCNode> exprList110 =null;
		java.util.List<DCNode> exprList112 =null;
		java.util.List<DCNode> exprList114 =null;
		DCNode expression116 =null;
		DCNode expression118 =null;
		java.util.List<DCNode> exprList120 =null;
		java.util.List<DCNode> exprList122 =null;
		DCNode expression124 =null;
		java.util.List<DCNode> exprList126 =null;
		DCNode expression128 =null;
		DCNode expression130 =null;
		DCNode expression132 =null;
		DCNode expression134 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:186:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
			int alt46=16;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==FUNC_CALL) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt46=1;
						}
						break;
					case Sine:
						{
						alt46=2;
						}
						break;
					case Tan:
						{
						alt46=3;
						}
						break;
					case ATan:
						{
						alt46=4;
						}
						break;
					case Random:
						{
						alt46=5;
						}
						break;
					case Pow:
						{
						alt46=6;
						}
						break;
					case Sqrt:
						{
						alt46=7;
						}
						break;
					case Sq:
						{
						alt46=8;
						}
						break;
					case Gaussian:
						{
						alt46=9;
						}
						break;
					case Noise:
						{
						alt46=10;
						}
						break;
					case Round:
						{
						alt46=11;
						}
						break;
					case Map:
						{
						alt46=12;
						}
						break;
					case Inch:
						{
						alt46=13;
						}
						break;
					case Mm:
						{
						alt46=14;
						}
						break;
					case Cm:
						{
						alt46=15;
						}
						break;
					case Units:
						{
						alt46=16;
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:186:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL105=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1079); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1081); 
					pushFollow(FOLLOW_expression_in_mathCall1083);
					expression104=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression104,FUNC_CALL105.getLine(),FUNC_CALL105.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL107=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1093); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1095); 
					pushFollow(FOLLOW_expression_in_mathCall1097);
					expression106=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression106,FUNC_CALL107.getLine(),FUNC_CALL107.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL109=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1107); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1109); 
					pushFollow(FOLLOW_expression_in_mathCall1111);
					expression108=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression108,FUNC_CALL109.getLine(),FUNC_CALL109.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL111=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1121); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1123); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:22: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1125);
							exprList110=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ATanNode(exprList110,FUNC_CALL111.getLine(),FUNC_CALL111.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL113=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1136); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1138); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:24: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1140);
							exprList112=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList112,FUNC_CALL113.getLine(),FUNC_CALL113.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL115=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1151); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1153); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:21: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1155);
							exprList114=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PowFNode(exprList114,FUNC_CALL115.getLine(),FUNC_CALL115.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:192:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL117=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1165); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1167); 
					pushFollow(FOLLOW_expression_in_mathCall1169);
					expression116=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression116,FUNC_CALL117.getLine(),FUNC_CALL117.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:193:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL119=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1178); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1180); 
					pushFollow(FOLLOW_expression_in_mathCall1182);
					expression118=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression118,FUNC_CALL119.getLine(),FUNC_CALL119.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL121=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1191); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1193); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:26: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1195);
							exprList120=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList120,FUNC_CALL121.getLine(),FUNC_CALL121.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL123=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1206); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1208); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:23: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1210);
							exprList122=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList122,FUNC_CALL123.getLine(),FUNC_CALL123.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:196:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL125=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1221); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1223); 
					pushFollow(FOLLOW_expression_in_mathCall1225);
					expression124=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression124,FUNC_CALL125.getLine(),FUNC_CALL125.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:197:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL127=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1235); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1237); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:197:21: ( exprList )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==EXP_LIST) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:197:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1239);
							exprList126=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList126,FUNC_CALL127.getLine(),FUNC_CALL127.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL129=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1250); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1252); 
					pushFollow(FOLLOW_expression_in_mathCall1254);
					expression128=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression128,"inch",unitParam,FUNC_CALL129.getLine(),FUNC_CALL129.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:199:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL131=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1263); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1265); 
					pushFollow(FOLLOW_expression_in_mathCall1267);
					expression130=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression130,"mm",unitParam,FUNC_CALL131.getLine(),FUNC_CALL131.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:200:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL133=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1276); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1278); 
					pushFollow(FOLLOW_expression_in_mathCall1280);
					expression132=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression132,"cm",unitParam,FUNC_CALL133.getLine(),FUNC_CALL133.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:201:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL135=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1289); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1291); 
					pushFollow(FOLLOW_expression_in_mathCall1293);
					expression134=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression134,"units",unitParam,FUNC_CALL135.getLine(),FUNC_CALL135.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:207:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL137=null;
		CommonTree FUNC_CALL139=null;
		CommonTree FUNC_CALL141=null;
		CommonTree FUNC_CALL143=null;
		CommonTree FUNC_CALL145=null;
		CommonTree FUNC_CALL147=null;
		CommonTree FUNC_CALL149=null;
		CommonTree FUNC_CALL151=null;
		CommonTree FUNC_CALL153=null;
		CommonTree FUNC_CALL155=null;
		DCNode expression136 =null;
		DCNode expression138 =null;
		DCNode expression140 =null;
		DCNode expression142 =null;
		DCNode expression144 =null;
		DCNode expression146 =null;
		java.util.List<DCNode> exprList148 =null;
		java.util.List<DCNode> exprList150 =null;
		java.util.List<DCNode> exprList152 =null;
		java.util.List<DCNode> exprList154 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:208:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
			int alt51=14;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==FUNC_CALL) ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt51=1;
						}
						break;
					case GetHeight:
						{
						alt51=2;
						}
						break;
					case GetX:
						{
						alt51=3;
						}
						break;
					case GetY:
						{
						alt51=4;
						}
						break;
					case GetOrigin:
						{
						alt51=5;
						}
						break;
					case GetRotation:
						{
						alt51=6;
						}
						break;
					case GetFill:
						{
						alt51=7;
						}
						break;
					case GetStroke:
						{
						alt51=8;
						}
						break;
					case GetStart:
						{
						alt51=9;
						}
						break;
					case GetEnd:
						{
						alt51=10;
						}
						break;
					case GetDistance:
						{
						alt51=11;
						}
						break;
					case GetIntersect:
						{
						alt51=12;
						}
						break;
					case GetAngle:
						{
						alt51=13;
						}
						break;
					case GetRadius:
						{
						alt51=14;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 51, 2, input);
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
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:208:5: ^( FUNC_CALL GetWidth expression )
					{
					FUNC_CALL137=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1331); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1333); 
					pushFollow(FOLLOW_expression_in_getCall1335);
					expression136=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression136,FUNC_CALL137.getLine(),FUNC_CALL137.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:209:5: ^( FUNC_CALL GetHeight expression )
					{
					FUNC_CALL139=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1345); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1347); 
					pushFollow(FOLLOW_expression_in_getCall1349);
					expression138=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression138,FUNC_CALL139.getLine(),FUNC_CALL139.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:210:5: ^( FUNC_CALL GetX expression )
					{
					FUNC_CALL141=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1358); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1360); 
					pushFollow(FOLLOW_expression_in_getCall1362);
					expression140=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression140,FUNC_CALL141.getLine(),FUNC_CALL141.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:211:5: ^( FUNC_CALL GetY expression )
					{
					FUNC_CALL143=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1371); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1373); 
					pushFollow(FOLLOW_expression_in_getCall1375);
					expression142=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression142,FUNC_CALL143.getLine(),FUNC_CALL143.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:212:5: ^( FUNC_CALL GetOrigin expression )
					{
					FUNC_CALL145=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1384); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1386); 
					pushFollow(FOLLOW_expression_in_getCall1388);
					expression144=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression144,FUNC_CALL145.getLine(),FUNC_CALL145.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:213:5: ^( FUNC_CALL GetRotation expression )
					{
					FUNC_CALL147=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1397); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1399); 
					pushFollow(FOLLOW_expression_in_getCall1401);
					expression146=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression146,FUNC_CALL147.getLine(),FUNC_CALL147.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:214:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1410); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1412); 
					pushFollow(FOLLOW_expression_in_getCall1414);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:215:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1422); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1424); 
					pushFollow(FOLLOW_expression_in_getCall1426);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:216:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1434); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1436); 
					pushFollow(FOLLOW_expression_in_getCall1438);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:217:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1445); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1447); 
					pushFollow(FOLLOW_expression_in_getCall1449);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					FUNC_CALL149=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1457); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1459); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:28: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1461);
							exprList148=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList148,FUNC_CALL149.getLine(),FUNC_CALL149.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					FUNC_CALL151=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1471); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1473); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:29: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1475);
							exprList150=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList150,FUNC_CALL151.getLine(),FUNC_CALL151.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					FUNC_CALL153=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1485); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1487); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:25: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==EXP_LIST) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1489);
							exprList152=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetAngleNode(exprList152,FUNC_CALL153.getLine(),FUNC_CALL153.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					FUNC_CALL155=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1500); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1502); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:26: ( exprList )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==EXP_LIST) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1504);
							exprList154=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetRadiusNode(exprList154,FUNC_CALL155.getLine(),FUNC_CALL155.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:224:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL157=null;
		java.util.List<DCNode> exprList156 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			FUNC_CALL157=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1532); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1534); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:25: ( exprList )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==EXP_LIST) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1536);
					exprList156=exprList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new SliderNode(exprList156,currentScope,FUNC_CALL157.getLine(),FUNC_CALL157.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:4: templateCall returns [DCNode node] : ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) );
	public final DCNode templateCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL159=null;
		CommonTree FUNC_CALL161=null;
		CommonTree FUNC_CALL163=null;
		CommonTree FUNC_CALL165=null;
		CommonTree FUNC_CALL167=null;
		CommonTree FUNC_CALL169=null;
		CommonTree FUNC_CALL171=null;
		CommonTree FUNC_CALL173=null;
		CommonTree FUNC_CALL175=null;
		java.util.List<DCNode> exprList158 =null;
		java.util.List<DCNode> exprList160 =null;
		java.util.List<DCNode> exprList162 =null;
		java.util.List<DCNode> exprList164 =null;
		java.util.List<DCNode> exprList166 =null;
		java.util.List<DCNode> exprList168 =null;
		java.util.List<DCNode> exprList170 =null;
		java.util.List<DCNode> exprList172 =null;
		java.util.List<DCNode> exprList174 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:4: ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) )
			int alt63=10;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==FUNC_CALL) ) {
				int LA63_1 = input.LA(2);
				if ( (LA63_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Template:
						{
						alt63=1;
						}
						break;
					case SetWidth:
						{
						alt63=2;
						}
						break;
					case SetHeight:
						{
						alt63=3;
						}
						break;
					case SetSeam:
						{
						alt63=4;
						}
						break;
					case SetName:
						{
						alt63=5;
						}
						break;
					case SetVFold:
						{
						alt63=6;
						}
						break;
					case SetHFold:
						{
						alt63=7;
						}
						break;
					case SetCorner:
						{
						alt63=8;
						}
						break;
					case TemplateCollection:
						{
						alt63=9;
						}
						break;
					case AddDesign:
						{
						alt63=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 63, 2, input);
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
							new NoViableAltException("", 63, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:6: ^( FUNC_CALL Template ( exprList )? )
					{
					FUNC_CALL159=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1567); 
					match(input, Token.DOWN, null); 
					match(input,Template,FOLLOW_Template_in_templateCall1569); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:27: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EXP_LIST) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1571);
							exprList158=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateNode(exprList158,FUNC_CALL159.getLine(),FUNC_CALL159.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:5: ^( FUNC_CALL SetWidth ( exprList )? )
					{
					FUNC_CALL161=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1582); 
					match(input, Token.DOWN, null); 
					match(input,SetWidth,FOLLOW_SetWidth_in_templateCall1584); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:26: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EXP_LIST) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1586);
							exprList160=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetWidthNode(exprList160,FUNC_CALL161.getLine(),FUNC_CALL161.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:5: ^( FUNC_CALL SetHeight ( exprList )? )
					{
					FUNC_CALL163=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1597); 
					match(input, Token.DOWN, null); 
					match(input,SetHeight,FOLLOW_SetHeight_in_templateCall1599); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:27: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EXP_LIST) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1601);
							exprList162=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHeightNode(exprList162,FUNC_CALL163.getLine(),FUNC_CALL163.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:5: ^( FUNC_CALL SetSeam ( exprList )? )
					{
					FUNC_CALL165=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1611); 
					match(input, Token.DOWN, null); 
					match(input,SetSeam,FOLLOW_SetSeam_in_templateCall1613); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:25: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EXP_LIST) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1615);
							exprList164=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetSeamNode(exprList164,FUNC_CALL165.getLine(),FUNC_CALL165.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:5: ^( FUNC_CALL SetName ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1625); 
					match(input, Token.DOWN, null); 
					match(input,SetName,FOLLOW_SetName_in_templateCall1627); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:25: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EXP_LIST) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1629);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:5: ^( FUNC_CALL SetVFold ( exprList )? )
					{
					FUNC_CALL167=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1638); 
					match(input, Token.DOWN, null); 
					match(input,SetVFold,FOLLOW_SetVFold_in_templateCall1640); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:26: ( exprList )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==EXP_LIST) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1642);
							exprList166=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetVFoldNode(exprList166,FUNC_CALL167.getLine(),FUNC_CALL167.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:5: ^( FUNC_CALL SetHFold ( exprList )? )
					{
					FUNC_CALL169=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1652); 
					match(input, Token.DOWN, null); 
					match(input,SetHFold,FOLLOW_SetHFold_in_templateCall1654); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:26: ( exprList )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==EXP_LIST) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:235:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1656);
							exprList168=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHFoldNode(exprList168,FUNC_CALL169.getLine(),FUNC_CALL169.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:5: ^( FUNC_CALL SetCorner ( exprList )? )
					{
					FUNC_CALL171=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1666); 
					match(input, Token.DOWN, null); 
					match(input,SetCorner,FOLLOW_SetCorner_in_templateCall1668); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:27: ( exprList )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==EXP_LIST) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1670);
							exprList170=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCornerNode(exprList170,FUNC_CALL171.getLine(),FUNC_CALL171.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:5: ^( FUNC_CALL TemplateCollection ( exprList )? )
					{
					FUNC_CALL173=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1681); 
					match(input, Token.DOWN, null); 
					match(input,TemplateCollection,FOLLOW_TemplateCollection_in_templateCall1683); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:38: ( exprList )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==EXP_LIST) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:38: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1687);
							exprList172=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCollectionNode(exprList172,FUNC_CALL173.getLine(),FUNC_CALL173.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:5: ^( FUNC_CALL AddDesign ( exprList )? )
					{
					FUNC_CALL175=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1697); 
					match(input, Token.DOWN, null); 
					match(input,AddDesign,FOLLOW_AddDesign_in_templateCall1699); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:27: ( exprList )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==EXP_LIST) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1701);
							exprList174=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateAddDesignNode(exprList174,FUNC_CALL175.getLine(),FUNC_CALL175.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:242:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1738); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1740);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:26: ( elseIfStat[ifNode] )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==EXP) ) {
					int LA64_1 = input.LA(2);
					if ( (LA64_1==DOWN) ) {
						int LA64_3 = input.LA(3);
						if ( (LA64_3==Add||LA64_3==Bool||LA64_3==COLOR_CONSTANT||LA64_3==DOTPROPERTY||LA64_3==Divide||LA64_3==Equals||(LA64_3 >= GT && LA64_3 <= GTEquals)||LA64_3==HEIGHT_CONSTANT||LA64_3==In||LA64_3==LOOKUP||(LA64_3 >= LT && LA64_3 <= LTEquals)||LA64_3==Modulus||(LA64_3 >= Multiply && LA64_3 <= NEquals)||(LA64_3 >= Null && LA64_3 <= Number)||LA64_3==PI_CONSTANT||LA64_3==Pw||(LA64_3 >= Subtract && LA64_3 <= TERNARY)||LA64_3==UNARY_MIN||LA64_3==WIDTH_CONSTANT||(LA64_3 >= 168 && LA64_3 <= 169)) ) {
							alt64=1;
						}

					}

				}

				switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1744);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop64;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:48: ( elseStat[ifNode] )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==EXP) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1750);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:248:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression176 =null;
		BlockNode block177 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:249:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:249:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1770); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1772);
			expression176=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1774);
			block177=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression176, block177);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:252:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression178 =null;
		BlockNode block179 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:253:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:253:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1793); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1795);
			expression178=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1797);
			block179=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression178, block179);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:256:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block180 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:257:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:257:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1816); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1818);
			block180=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block180);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:260:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier181=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block182 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:261:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:261:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1843); 
			match(input, Token.DOWN, null); 
			Identifier181=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1845); 
			pushFollow(FOLLOW_expression_in_forStatement1849);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1853);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1855);
			block182=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier181!=null?Identifier181.getText():null), a, b, block182, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:264:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier183=null;
		CommonTree Repeat185=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block184 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			Repeat185=(CommonTree)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1878); 
			match(input, Token.DOWN, null); 
			Identifier183=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1880); 
			pushFollow(FOLLOW_expression_in_repeatStatement1884);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1888);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:51: (c= expression )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==Add||LA66_0==Bool||LA66_0==COLOR_CONSTANT||LA66_0==DOTPROPERTY||LA66_0==Divide||LA66_0==Equals||(LA66_0 >= GT && LA66_0 <= GTEquals)||LA66_0==HEIGHT_CONSTANT||LA66_0==In||LA66_0==LOOKUP||(LA66_0 >= LT && LA66_0 <= LTEquals)||LA66_0==Modulus||(LA66_0 >= Multiply && LA66_0 <= NEquals)||(LA66_0 >= Null && LA66_0 <= Number)||LA66_0==PI_CONSTANT||LA66_0==Pw||(LA66_0 >= Subtract && LA66_0 <= TERNARY)||LA66_0==UNARY_MIN||LA66_0==WIDTH_CONSTANT||(LA66_0 >= 168 && LA66_0 <= 169)) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1893);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1897);
			block184=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier183!=null?Identifier183.getText():null), a, b, c, block184, currentScope, Repeat185.getLine(), Repeat185.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:267:1: radialStatement returns [DCNode node] : ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) ;
	public final DCNode radialStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block186 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:268:2: ( ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:268:4: ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block )
			{
			match(input,Radial,FOLLOW_Radial_in_radialStatement1916); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1922); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1926); 
			pushFollow(FOLLOW_expression_in_radialStatement1931);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1935); 
			pushFollow(FOLLOW_expression_in_radialStatement1939);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_radialStatement1941);
			block186=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RadialStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), a, b, block186, currentScope);
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



	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:271:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression187 =null;
		BlockNode block188 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:272:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:272:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1962); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1964);
			expression187=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1966);
			block188=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression187, block188);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:275:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier189=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1993); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:16: ( Identifier )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Identifier) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:17: Identifier
					{
					Identifier189=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1996); 
					i.add((Identifier189!=null?Identifier189.getText():null));
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:280:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression190 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList2026); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:17: ( expression )+
			int cnt68=0;
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==Add||LA68_0==Bool||LA68_0==COLOR_CONSTANT||LA68_0==DOTPROPERTY||LA68_0==Divide||LA68_0==Equals||(LA68_0 >= GT && LA68_0 <= GTEquals)||LA68_0==HEIGHT_CONSTANT||LA68_0==In||LA68_0==LOOKUP||(LA68_0 >= LT && LA68_0 <= LTEquals)||LA68_0==Modulus||(LA68_0 >= Multiply && LA68_0 <= NEquals)||(LA68_0 >= Null && LA68_0 <= Number)||LA68_0==PI_CONSTANT||LA68_0==Pw||(LA68_0 >= Subtract && LA68_0 <= TERNARY)||LA68_0==UNARY_MIN||LA68_0==WIDTH_CONSTANT||(LA68_0 >= 168 && LA68_0 <= 169)) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList2029);
					expression190=expression();
					state._fsp--;

					e.add(expression190);
					}
					break;

				default :
					if ( cnt68 >= 1 ) break loop68;
					EarlyExitException eee = new EarlyExitException(68, input);
					throw eee;
				}
				cnt68++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:286:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number191=null;
		CommonTree Bool192=null;
		CommonTree COLOR_CONSTANT194=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup193 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt69=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt69=1;
				}
				break;
			case In:
				{
				alt69=2;
				}
				break;
			case 169:
				{
				alt69=3;
				}
				break;
			case 168:
				{
				alt69=4;
				}
				break;
			case Equals:
				{
				alt69=5;
				}
				break;
			case NEquals:
				{
				alt69=6;
				}
				break;
			case GTEquals:
				{
				alt69=7;
				}
				break;
			case LTEquals:
				{
				alt69=8;
				}
				break;
			case GT:
				{
				alt69=9;
				}
				break;
			case LT:
				{
				alt69=10;
				}
				break;
			case Add:
				{
				alt69=11;
				}
				break;
			case Subtract:
				{
				alt69=12;
				}
				break;
			case Multiply:
				{
				alt69=13;
				}
				break;
			case Divide:
				{
				alt69=14;
				}
				break;
			case Modulus:
				{
				alt69=15;
				}
				break;
			case Pw:
				{
				alt69=16;
				}
				break;
			case UNARY_MIN:
				{
				alt69=17;
				}
				break;
			case NEGATE:
				{
				alt69=18;
				}
				break;
			case Number:
				{
				alt69=19;
				}
				break;
			case Bool:
				{
				alt69=20;
				}
				break;
			case Null:
				{
				alt69=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt69=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt69=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt69=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt69=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt69=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression2054); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2058);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2062);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2066);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:288:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression2077); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2081);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2085);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:289:6: ^( '||' a= expression b= expression )
					{
					match(input,169,FOLLOW_169_in_expression2114); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2118);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2122);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:290:6: ^( '&&' a= expression b= expression )
					{
					match(input,168,FOLLOW_168_in_expression2149); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2153);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2157);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:291:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression2184); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2188);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2192);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression2219); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2223);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2227);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:293:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2254); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2258);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2262);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:294:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2293);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2297);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:295:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2324); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2328);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2332);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:296:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2364);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2368);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:297:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2400);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2404);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:298:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2436);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2440);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:299:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2468); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2472);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2476);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:300:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2504); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2508);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2512);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:301:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2540); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2544);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2548);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:302:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2576); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2580);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2584);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:303:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2612); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2616);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:304:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2651); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2655);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:6: Number
					{
					Number191=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2692); 
					node = new AtomNode(Double.parseDouble((Number191!=null?Number191.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:306:6: Bool
					{
					Bool192=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2744); 
					node = new AtomNode(Boolean.parseBoolean((Bool192!=null?Bool192.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:307:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2798); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2852);
					lookup193=lookup();
					state._fsp--;

					node = lookup193;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:309:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT194=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2904); 
					node = new AtomNode((COLOR_CONSTANT194!=null?COLOR_CONSTANT194.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2923); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:311:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2969); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:312:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression3014); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:315:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList195 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list3073); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:13: ( exprList )?
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==EXP_LIST) ) {
					alt70=1;
				}
				switch (alt70) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list3075);
						exprList195=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList195);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier198=null;
		CommonTree DOTPROPERTY199=null;
		CommonTree LOOKUP202=null;
		CommonTree LOOKUP204=null;
		CommonTree LOOKUP206=null;
		CommonTree Identifier207=null;
		CommonTree LOOKUP208=null;
		CommonTree String209=null;
		CommonTree LOOKUP210=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall196 =null;
		java.util.List<PropertyNode> dotProperty197 =null;
		java.util.List<PropertyNode> dotProperty200 =null;
		DCNode functionCall201 =null;
		DCNode list203 =null;
		DCNode expression205 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt76=7;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==DOTPROPERTY) ) {
				int LA76_1 = input.LA(2);
				if ( (LA76_1==DOWN) ) {
					int LA76_3 = input.LA(3);
					if ( (LA76_3==Identifier) ) {
						alt76=2;
					}
					else if ( (LA76_3==FUNC_CALL) ) {
						alt76=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 76, 3, input);
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
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA76_0==LOOKUP) ) {
				int LA76_2 = input.LA(2);
				if ( (LA76_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt76=6;
						}
						break;
					case String:
						{
						alt76=7;
						}
						break;
					case FUNC_CALL:
						{
						alt76=3;
						}
						break;
					case LIST:
						{
						alt76=4;
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
						alt76=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 76, 4, input);
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
							new NoViableAltException("", 76, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3098); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3100);
					functionCall196=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup3102);
					dotProperty197=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall196, dotProperty197);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:323:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY199=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3110); 
					match(input, Token.DOWN, null); 
					Identifier198=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3112); 
					pushFollow(FOLLOW_dotProperty_in_lookup3114);
					dotProperty200=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier198!=null?Identifier198.getText():null), currentScope,DOTPROPERTY199.getLine()), dotProperty200);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:329:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP202=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3138); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3140);
					functionCall201=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:329:28: (i= indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==INDEXES) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:329:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3144);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall201, i,LOOKUP202.getLine()) : functionCall201;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:330:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP204=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3156); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup3158);
					list203=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:330:21: (i= indexes )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==INDEXES) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:330:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3162);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list203, i, LOOKUP204.getLine()) : list203;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:331:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP206=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3182); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup3184);
					expression205=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:331:27: (i= indexes )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==INDEXES) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:331:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3188);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression205, i,LOOKUP206.getLine()) : expression205;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:332:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP208=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3202); 
					match(input, Token.DOWN, null); 
					Identifier207=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3204); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:332:27: (i= indexes )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==INDEXES) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:332:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3208);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier207!=null?Identifier207.getText():null), currentScope,LOOKUP208.getLine()), i,LOOKUP208.getLine()) : new IdentifierNode((Identifier207!=null?Identifier207.getText():null), currentScope,LOOKUP208.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:333:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP210=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3222); 
					match(input, Token.DOWN, null); 
					String209=(CommonTree)match(input,String,FOLLOW_String_in_lookup3224); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:333:23: (i= indexes )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==INDEXES) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:333:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3228);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String209!=null?String209.getText():null)), i,LOOKUP210.getLine()) : new AtomNode((String209!=null?String209.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:343:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression211 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:345:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:345:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3277); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:345:16: ( expression )+
			int cnt77=0;
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==Add||LA77_0==Bool||LA77_0==COLOR_CONSTANT||LA77_0==DOTPROPERTY||LA77_0==Divide||LA77_0==Equals||(LA77_0 >= GT && LA77_0 <= GTEquals)||LA77_0==HEIGHT_CONSTANT||LA77_0==In||LA77_0==LOOKUP||(LA77_0 >= LT && LA77_0 <= LTEquals)||LA77_0==Modulus||(LA77_0 >= Multiply && LA77_0 <= NEquals)||(LA77_0 >= Null && LA77_0 <= Number)||LA77_0==PI_CONSTANT||LA77_0==Pw||(LA77_0 >= Subtract && LA77_0 <= TERNARY)||LA77_0==UNARY_MIN||LA77_0==WIDTH_CONSTANT||(LA77_0 >= 168 && LA77_0 <= 169)) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:345:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3280);
					expression211=expression();
					state._fsp--;

					e.add(expression211);
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
	// $ANTLR end "indexes"



	// $ANTLR start "dotProperty"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression212 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:352:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:352:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3318); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:352:12: ( dotExpression )+
			int cnt78=0;
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( ((LA78_0 >= DotEnd && LA78_0 <= DotY)) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:352:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3321);
					dotExpression212=dotExpression();
					state._fsp--;

					e.add(dotExpression212);
					}
					break;

				default :
					if ( cnt78 >= 1 ) break loop78;
					EarlyExitException eee = new EarlyExitException(78, input);
					throw eee;
				}
				cnt78++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:355:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:356:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt79=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt79=1;
				}
				break;
			case DotY:
				{
				alt79=2;
				}
				break;
			case DotStart:
				{
				alt79=3;
				}
				break;
			case DotEnd:
				{
				alt79=4;
				}
				break;
			case DotOrigin:
				{
				alt79=5;
				}
				break;
			case DotRotation:
				{
				alt79=6;
				}
				break;
			case DotWidth:
				{
				alt79=7;
				}
				break;
			case DotHeight:
				{
				alt79=8;
				}
				break;
			case DotFill:
				{
				alt79=9;
				}
				break;
			case DotStroke:
				{
				alt79=10;
				}
				break;
			case DotWeight:
				{
				alt79=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:356:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3349); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3357); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:358:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3365); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:359:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3373); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:360:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3381); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3389); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:362:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3397); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:363:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3405); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:364:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3413); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:365:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3420); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:366:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3427); 
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
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0000200000000048L,0x1200000000000100L,0x0000004000000000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_radialStatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment224 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41210L,0x0000030906000000L});
	public static final BitSet FOLLOW_indexes_in_assignment226 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_assignment229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall273 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall289 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall306 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall325 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall327 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall343 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall363 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall380 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall472 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall474 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall490 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall507 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall525 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall543 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall559 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall575 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall591 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall593 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall608 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall639 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall641 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall655 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall657 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall673 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall675 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall692 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall694 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall707 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall720 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall722 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall724 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall739 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall741 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall754 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall766 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall768 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall782 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall784 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall795 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall797 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall799 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall811 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall825 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall840 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall853 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall866 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall880 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall882 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall893 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall895 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall906 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall908 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall920 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall922 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall934 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall936 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall946 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall948 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall950 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall960 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall962 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall964 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall998 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1012 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall1014 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1016 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1028 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1030 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FollowCurve_in_patternCall1046 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1048 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1081 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1083 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1093 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1095 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1097 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1109 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1123 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1138 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1140 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1153 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1167 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1180 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1193 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1208 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1210 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1223 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1237 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1252 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1263 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1265 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1267 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1276 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1278 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1280 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1291 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1333 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1347 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1360 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1371 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1373 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1375 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1386 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1397 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1399 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1412 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1422 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1424 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1426 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1436 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1445 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1447 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1449 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1459 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1473 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1487 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1489 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1502 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1534 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Template_in_templateCall1569 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall1584 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall1599 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall1613 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetName_in_templateCall1627 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1638 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetVFold_in_templateCall1640 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1652 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHFold_in_templateCall1654 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetCorner_in_templateCall1668 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TemplateCollection_in_templateCall1683 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1687 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1697 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AddDesign_in_templateCall1699 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1740 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1744 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1770 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1772 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_ifStat1774 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1795 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1843 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1845 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1849 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1853 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_forStatement1855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1880 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1884 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1888 = new BitSet(new long[]{0x000602042004C100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1893 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1897 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Radial_in_radialStatement1916 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1926 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1935 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1939 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_radialStatement1941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1962 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1964 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_whileStatement1966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1993 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1996 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList2026 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList2029 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_TERNARY_in_expression2054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2058 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2062 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression2077 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2081 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2085 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_169_in_expression2114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2118 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_168_in_expression2149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2153 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression2184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2188 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression2219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2223 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2258 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2293 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2328 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2364 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2400 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2436 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2472 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2508 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2544 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2580 = new BitSet(new long[]{0x0006020420048100L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list3073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list3075 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3098 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3100 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3112 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3114 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3140 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3144 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup3158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup3184 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3204 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup3224 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexes_in_lookup3228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3280 = new BitSet(new long[]{0x0006020420048108L,0x0020860E40C41010L,0x0000030906000000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3318 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3321 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x001FFC0000000000L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3427 = new BitSet(new long[]{0x0000000000000002L});
}
