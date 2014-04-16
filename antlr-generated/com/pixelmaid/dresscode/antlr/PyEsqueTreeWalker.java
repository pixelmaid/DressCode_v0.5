// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g 2014-04-16 18:48:52

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
		"GetX", "GetY", "Group", "HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", 
		"IF", "INDEXES", "Identifier", "If", "In", "Inch", "Indent", "Int", "LAdd", 
		"LIST", "LOOKUP", "LOOKUP_S", "LRemove", "LShape", "LT", "LTEquals", "Line", 
		"Map", "Merge", "MirrorX", "MirrorY", "Mm", "Modulus", "Move", "MoveBy", 
		"Multiply", "NEGATE", "NEquals", "NL", "NewLine", "NoFill", "NoStroke", 
		"Noise", "Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "Pw", "QMark", "Quad", 
		"RETURN", "Radial", "Random", "Rect", "Repeat", "Return", "Rotate", "Round", 
		"Row", "SP", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "SemiColon", 
		"SetCorner", "SetHFold", "SetHeight", "SetName", "SetSeam", "SetVFold", 
		"SetWidth", "Show", "Sine", "Size", "Skirt", "SkirtBack", "Slider", "SpaceChars", 
		"Spiral", "Sq", "Sqrt", "String", "Stroke", "Subtract", "TERNARY", "Tan", 
		"Template", "TemplateCollection", "To", "Triangle", "UNARY_MIN", "Union", 
		"Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", "Xor", "'&&'", "'||'", 
		"DotEnd", "DotFill", "DotHeight", "DotOrigin", "DotRotation", "DotStart", 
		"DotStroke", "DotWeight", "DotWidth", "DotX", "DotY", "For", "Grid"
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
	public static final int Group=66;
	public static final int HEIGHT_CONSTANT=67;
	public static final int Heading=68;
	public static final int Hide=69;
	public static final int ID_LIST=70;
	public static final int IF=71;
	public static final int INDEXES=72;
	public static final int Identifier=73;
	public static final int If=74;
	public static final int In=75;
	public static final int Inch=76;
	public static final int Indent=77;
	public static final int Int=78;
	public static final int LAdd=79;
	public static final int LIST=80;
	public static final int LOOKUP=81;
	public static final int LOOKUP_S=82;
	public static final int LRemove=83;
	public static final int LShape=84;
	public static final int LT=85;
	public static final int LTEquals=86;
	public static final int Line=87;
	public static final int Map=88;
	public static final int Merge=89;
	public static final int MirrorX=90;
	public static final int MirrorY=91;
	public static final int Mm=92;
	public static final int Modulus=93;
	public static final int Move=94;
	public static final int MoveBy=95;
	public static final int Multiply=96;
	public static final int NEGATE=97;
	public static final int NEquals=98;
	public static final int NL=99;
	public static final int NewLine=100;
	public static final int NoFill=101;
	public static final int NoStroke=102;
	public static final int Noise=103;
	public static final int Null=104;
	public static final int Number=105;
	public static final int OBrace=106;
	public static final int OBracket=107;
	public static final int OParen=108;
	public static final int Or=109;
	public static final int PI_CONSTANT=110;
	public static final int Point=111;
	public static final int Polygon=112;
	public static final int Pow=113;
	public static final int Print=114;
	public static final int Println=115;
	public static final int Pw=116;
	public static final int QMark=117;
	public static final int Quad=118;
	public static final int RETURN=119;
	public static final int Radial=120;
	public static final int Random=121;
	public static final int Rect=122;
	public static final int Repeat=123;
	public static final int Return=124;
	public static final int Rotate=125;
	public static final int Round=126;
	public static final int Row=127;
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
	public static final int Grid=182;

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
	 public Scope currentScope = null;
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
		  bn.scope = local;
		  currentFunction = bn;
		  ((NodeEvent)node).addEventListener(drawableManager);

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==Arc||LA1_0==FUNC_CALL||LA1_0==FollowCurve||LA1_0==IF||LA1_0==Radial||LA1_0==Repeat||LA1_0==Row||LA1_0==Spiral||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pw||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||(LA2_0 >= 168 && LA2_0 <= 169)) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:93:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | whileStatement | radialStatement | spiralStatement | rowStatement | arcStatement | drawableRepeatStatement | followCurveStatement | repeatStatement );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode whileStatement7 =null;
		DCNode radialStatement8 =null;
		DCNode spiralStatement9 =null;
		DCNode rowStatement10 =null;
		DCNode arcStatement11 =null;
		DCNode drawableRepeatStatement12 =null;
		DCNode followCurveStatement13 =null;
		DCNode repeatStatement14 =null;


			//System.out.println(" statement called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:97:3: ( assignment | functionCall | ifStatement | whileStatement | radialStatement | spiralStatement | rowStatement | arcStatement | drawableRepeatStatement | followCurveStatement | repeatStatement )
			int alt3=11;
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
			case Spiral:
				{
				alt3=6;
				}
				break;
			case Row:
				{
				alt3=7;
				}
				break;
			case Arc:
				{
				alt3=8;
				}
				break;
			case Repeat:
				{
				int LA3_9 = input.LA(2);
				if ( (LA3_9==DOWN) ) {
					int LA3_11 = input.LA(3);
					if ( (LA3_11==Identifier) ) {
						int LA3_12 = input.LA(4);
						if ( (LA3_12==Identifier) ) {
							alt3=9;
						}
						else if ( (LA3_12==Add||LA3_12==Bool||LA3_12==COLOR_CONSTANT||LA3_12==DOTPROPERTY||LA3_12==Divide||LA3_12==Equals||(LA3_12 >= GT && LA3_12 <= GTEquals)||LA3_12==HEIGHT_CONSTANT||LA3_12==In||LA3_12==LOOKUP||(LA3_12 >= LT && LA3_12 <= LTEquals)||LA3_12==Modulus||(LA3_12 >= Multiply && LA3_12 <= NEquals)||(LA3_12 >= Null && LA3_12 <= Number)||LA3_12==PI_CONSTANT||LA3_12==Pw||(LA3_12 >= Subtract && LA3_12 <= TERNARY)||LA3_12==UNARY_MIN||LA3_12==WIDTH_CONSTANT||(LA3_12 >= 168 && LA3_12 <= 169)) ) {
							alt3=11;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 11, input);
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
							new NoViableAltException("", 3, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FollowCurve:
				{
				alt3=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:97:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:98:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:99:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:100:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement177);
					whileStatement7=whileStatement();
					state._fsp--;

					node = whileStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:101:5: radialStatement
					{
					pushFollow(FOLLOW_radialStatement_in_statement185);
					radialStatement8=radialStatement();
					state._fsp--;

					node = radialStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:102:5: spiralStatement
					{
					pushFollow(FOLLOW_spiralStatement_in_statement193);
					spiralStatement9=spiralStatement();
					state._fsp--;

					node = spiralStatement9; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:5: rowStatement
					{
					pushFollow(FOLLOW_rowStatement_in_statement201);
					rowStatement10=rowStatement();
					state._fsp--;

					node = rowStatement10; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:104:5: arcStatement
					{
					pushFollow(FOLLOW_arcStatement_in_statement209);
					arcStatement11=arcStatement();
					state._fsp--;

					node = arcStatement11; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:105:5: drawableRepeatStatement
					{
					pushFollow(FOLLOW_drawableRepeatStatement_in_statement217);
					drawableRepeatStatement12=drawableRepeatStatement();
					state._fsp--;

					node = drawableRepeatStatement12; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:106:5: followCurveStatement
					{
					pushFollow(FOLLOW_followCurveStatement_in_statement225);
					followCurveStatement13=followCurveStatement();
					state._fsp--;

					node = followCurveStatement13; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:107:5: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement233);
					repeatStatement14=repeatStatement();
					state._fsp--;

					node = repeatStatement14; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:112:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier15=null;
		CommonTree ASSIGNMENT18=null;
		java.util.List<DCNode> indexes16 =null;
		DCNode expression17 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT18=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment262); 
			match(input, Token.DOWN, null); 
			Identifier15=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment264); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment266);
					indexes16=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||(LA5_0 >= 168 && LA5_0 <= 169)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:113:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment269);
					expression17=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier15!=null?Identifier15.getText():null), indexes16, expression17, currentScope,ASSIGNMENT18.getLine(),ASSIGNMENT18.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier19=null;
		CommonTree FUNC_CALL21=null;
		CommonTree FUNC_CALL23=null;
		CommonTree FUNC_CALL25=null;
		CommonTree FUNC_CALL27=null;
		CommonTree FUNC_CALL29=null;
		CommonTree FUNC_CALL31=null;
		CommonTree FUNC_CALL33=null;
		java.util.List<DCNode> exprList20 =null;
		DCNode expression22 =null;
		DCNode expression24 =null;
		DCNode expression26 =null;
		DCNode expression28 =null;
		java.util.List<DCNode> exprList30 =null;
		java.util.List<DCNode> exprList32 =null;
		DCNode primitiveCall34 =null;
		DCNode transformCall35 =null;
		DCNode patternCall36 =null;
		DCNode mathCall37 =null;
		DCNode getCall38 =null;
		DCNode uICall39 =null;
		DCNode templateCall40 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
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
					case Wave:
					case Grid:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL21=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall311); 
					match(input, Token.DOWN, null); 
					Identifier19=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall313); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall315);
							exprList20=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier19!=null?Identifier19.getText():null), exprList20, functions, widthParam, heightParam, unitParam,FUNC_CALL21.getLine(),FUNC_CALL21.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:6: ^( FUNC_CALL Println ( expression )? )
					{
					FUNC_CALL23=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall327); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall329); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||(LA7_0 >= 168 && LA7_0 <= 169)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall331);
							expression22=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression22,FUNC_CALL23.getLine(),FUNC_CALL23.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:129:6: ^( FUNC_CALL Print expression )
					{
					FUNC_CALL25=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall344); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall346); 
					pushFollow(FOLLOW_expression_in_functionCall348);
					expression24=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression24,FUNC_CALL25.getLine(),FUNC_CALL25.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:130:6: ^( FUNC_CALL Assert expression )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall363); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall365); 
					pushFollow(FOLLOW_expression_in_functionCall367);
					expression26=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression26,FUNC_CALL27.getLine(),FUNC_CALL27.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:131:6: ^( FUNC_CALL Size expression )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall381); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall383); 
					pushFollow(FOLLOW_expression_in_functionCall385);
					expression28=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression28,FUNC_CALL29.getLine(),FUNC_CALL29.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:132:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall401); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall403); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:132:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:132:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall405);
							exprList30=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList30,FUNC_CALL31.getLine(),FUNC_CALL31.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall418); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall420); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall422);
							exprList32=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList32,FUNC_CALL33.getLine(),FUNC_CALL33.getCharPositionInLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall433);
					primitiveCall34=primitiveCall();
					state._fsp--;

					node = primitiveCall34; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:135:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall442);
					transformCall35=transformCall();
					state._fsp--;

					node = transformCall35; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:136:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall451);
					patternCall36=patternCall();
					state._fsp--;

					node = patternCall36; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:137:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall460);
					mathCall37=mathCall();
					state._fsp--;

					node= mathCall37; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:138:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall469);
					getCall38=getCall();
					state._fsp--;

					node= getCall38; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall477);
					uICall39=uICall();
					state._fsp--;

					node = uICall39; ((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:5: templateCall
					{
					pushFollow(FOLLOW_templateCall_in_functionCall485);
					templateCall40=templateCall();
					state._fsp--;

					node = templateCall40; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:144:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL42=null;
		CommonTree FUNC_CALL44=null;
		CommonTree FUNC_CALL46=null;
		CommonTree FUNC_CALL48=null;
		CommonTree FUNC_CALL50=null;
		CommonTree FUNC_CALL52=null;
		CommonTree FUNC_CALL54=null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;
		java.util.List<DCNode> exprList45 =null;
		java.util.List<DCNode> exprList47 =null;
		java.util.List<DCNode> exprList49 =null;
		java.util.List<DCNode> exprList51 =null;
		java.util.List<DCNode> exprList53 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall512); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall514); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall516);
							exprList41=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList41,FUNC_CALL42.getLine(),FUNC_CALL42.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall528); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall530); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall532);
							exprList43=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList43,FUNC_CALL44.getLine(),FUNC_CALL44.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall545); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall547); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall549);
							exprList45=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList45,FUNC_CALL46.getLine(),FUNC_CALL46.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall563); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall565); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall567);
							exprList47=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList47,FUNC_CALL48.getLine(),FUNC_CALL48.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:149:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall581); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall583); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:149:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:149:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall585);
							exprList49=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList49,FUNC_CALL50.getLine(),FUNC_CALL50.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall597); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall599); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall601);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall613); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall615); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall617);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall629); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall631); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall633);
							exprList51=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList51,FUNC_CALL52.getLine(),FUNC_CALL52.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall646); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall648); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall650);
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList53,FUNC_CALL54.getLine(),FUNC_CALL54.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move OParen d= expression fc= Comma x= expression Comma y= expression CParen ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide OParen expression CParen ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree fc=null;
		CommonTree FUNC_CALL55=null;
		CommonTree CParen56=null;
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
		CommonTree Hide77=null;
		CommonTree CParen78=null;
		CommonTree FUNC_CALL80=null;
		CommonTree FUNC_CALL82=null;
		CommonTree FUNC_CALL84=null;
		CommonTree FUNC_CALL86=null;
		CommonTree FUNC_CALL88=null;
		CommonTree FUNC_CALL90=null;
		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		CommonTree FUNC_CALL96=null;
		CommonTree FUNC_CALL98=null;
		CommonTree FUNC_CALL100=null;
		CommonTree FUNC_CALL102=null;
		DCNode d =null;
		DCNode x =null;
		DCNode y =null;
		java.util.List<DCNode> exprList57 =null;
		java.util.List<DCNode> exprList59 =null;
		DCNode expression61 =null;
		java.util.List<DCNode> exprList63 =null;
		java.util.List<DCNode> exprList65 =null;
		java.util.List<DCNode> exprList67 =null;
		DCNode expression69 =null;
		DCNode expression71 =null;
		java.util.List<DCNode> exprList73 =null;
		DCNode expression75 =null;
		DCNode expression79 =null;
		java.util.List<DCNode> exprList81 =null;
		DCNode expression83 =null;
		DCNode expression85 =null;
		java.util.List<DCNode> exprList87 =null;
		DCNode expression89 =null;
		DCNode expression91 =null;
		java.util.List<DCNode> exprList93 =null;
		java.util.List<DCNode> exprList95 =null;
		java.util.List<DCNode> exprList97 =null;
		java.util.List<DCNode> exprList99 =null;
		DCNode expression101 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:4: ( ^( FUNC_CALL Move OParen d= expression fc= Comma x= expression Comma y= expression CParen ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide OParen expression CParen ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
			int alt33=23;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==FUNC_CALL) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt33=1;
						}
						break;
					case MoveBy:
						{
						alt33=2;
						}
						break;
					case Heading:
						{
						alt33=3;
						}
						break;
					case Copy:
						{
						alt33=4;
						}
						break;
					case Rotate:
						{
						alt33=5;
						}
						break;
					case Fill:
						{
						alt33=6;
						}
						break;
					case Stroke:
						{
						alt33=7;
						}
						break;
					case NoFill:
						{
						alt33=8;
						}
						break;
					case NoStroke:
						{
						alt33=9;
						}
						break;
					case Weight:
						{
						alt33=10;
						}
						break;
					case Hide:
						{
						alt33=11;
						}
						break;
					case Show:
						{
						alt33=12;
						}
						break;
					case Group:
						{
						alt33=13;
						}
						break;
					case Expand:
						{
						alt33=14;
						}
						break;
					case Merge:
						{
						alt33=15;
						}
						break;
					case Scale:
						{
						alt33=16;
						}
						break;
					case MirrorX:
						{
						alt33=17;
						}
						break;
					case MirrorY:
						{
						alt33=18;
						}
						break;
					case Union:
						{
						alt33=19;
						}
						break;
					case Difference:
						{
						alt33=20;
						}
						break;
					case Clip:
						{
						alt33=21;
						}
						break;
					case Xor:
						{
						alt33=22;
						}
						break;
					case Flatten:
						{
						alt33=23;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 2, input);
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
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:5: ^( FUNC_CALL Move OParen d= expression fc= Comma x= expression Comma y= expression CParen )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall677); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall679); 
					match(input,OParen,FOLLOW_OParen_in_transformCall681); 
					pushFollow(FOLLOW_expression_in_transformCall686);
					d=expression();
					state._fsp--;

					fc=(CommonTree)match(input,Comma,FOLLOW_Comma_in_transformCall692); 
					pushFollow(FOLLOW_expression_in_transformCall697);
					x=expression();
					state._fsp--;

					match(input,Comma,FOLLOW_Comma_in_transformCall699); 
					pushFollow(FOLLOW_expression_in_transformCall703);
					y=expression();
					state._fsp--;

					CParen56=(CommonTree)match(input,CParen,FOLLOW_CParen_in_transformCall705); 
					match(input, Token.UP, null); 

					node = new MoveNode(d,x, y,FUNC_CALL55.getLine(),FUNC_CALL55.getCharPositionInLine());
					   node.setLimits(fc.getCharPositionInLine(),CParen56.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall722); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall724); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:25: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall726);
							exprList57=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList57,FUNC_CALL58.getLine(),FUNC_CALL58.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall740); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall742); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:26: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall744);
							exprList59=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new HeadingNode(exprList59,FUNC_CALL60.getLine(),FUNC_CALL60.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:162:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall757); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall759); 
					pushFollow(FOLLOW_expression_in_transformCall761);
					expression61=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression61,FUNC_CALL62.getLine(),FUNC_CALL62.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall772); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall774); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:24: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall776);
							exprList63=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList63,currentScope,FUNC_CALL64.getLine(),FUNC_CALL64.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall787); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall789); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:22: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall791);
							exprList65=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList65,FUNC_CALL66.getLine(),FUNC_CALL66.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall804); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall806); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:24: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall808);
							exprList67=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList67,FUNC_CALL68.getLine(),FUNC_CALL68.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall819); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall821); 
					pushFollow(FOLLOW_expression_in_transformCall823);
					expression69=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression69 ,FUNC_CALL70.getLine(),FUNC_CALL70.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall833); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall835); 
					pushFollow(FOLLOW_expression_in_transformCall837);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression71,FUNC_CALL72.getLine(),FUNC_CALL72.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall847); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall849); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall851);
							exprList73=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList73,FUNC_CALL74.getLine(),FUNC_CALL74.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:169:5: ^( FUNC_CALL Hide OParen expression CParen )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall862); 
					match(input, Token.DOWN, null); 
					Hide77=(CommonTree)match(input,Hide,FOLLOW_Hide_in_transformCall864); 
					match(input,OParen,FOLLOW_OParen_in_transformCall866); 
					pushFollow(FOLLOW_expression_in_transformCall868);
					expression75=expression();
					state._fsp--;

					CParen78=(CommonTree)match(input,CParen,FOLLOW_CParen_in_transformCall870); 
					match(input, Token.UP, null); 

					node = new HideNode(expression75,FUNC_CALL76.getLine(),FUNC_CALL76.getCharPositionInLine());
					   	node.setLimits(Hide77.getCharPositionInLine(),CParen78.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:171:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall880); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall882); 
					pushFollow(FOLLOW_expression_in_transformCall884);
					expression79=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression79,FUNC_CALL80.getLine(),FUNC_CALL80.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall894); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall896); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:23: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall898);
							exprList81=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList81,FUNC_CALL82.getLine(),FUNC_CALL82.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall909); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall911); 
					pushFollow(FOLLOW_expression_in_transformCall913);
					expression83=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression83, currentScope,FUNC_CALL84.getLine(),FUNC_CALL84.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:174:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall922); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall924); 
					pushFollow(FOLLOW_expression_in_transformCall926);
					expression85=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression85,currentScope,FUNC_CALL86.getLine(),FUNC_CALL86.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall935); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall937); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall939);
							exprList87=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList87,FUNC_CALL88.getLine(),FUNC_CALL88.getCharPositionInLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:176:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall949); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall951); 
					pushFollow(FOLLOW_expression_in_transformCall953);
					expression89=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression89,FUNC_CALL90.getLine(),FUNC_CALL90.getCharPositionInLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:177:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall962); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall964); 
					pushFollow(FOLLOW_expression_in_transformCall966);
					expression91=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression91,FUNC_CALL92.getLine(),FUNC_CALL92.getCharPositionInLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall975); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall977); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:178:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall979);
							exprList93=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList93, currentScope,FUNC_CALL94.getLine(),FUNC_CALL94.getCharPositionInLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall989); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall991); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:28: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall993);
							exprList95=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList95, currentScope,FUNC_CALL96.getLine(),FUNC_CALL96.getCharPositionInLine());
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall1003); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall1005); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:22: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1007);
							exprList97=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList97, currentScope,FUNC_CALL98.getLine(),FUNC_CALL98.getCharPositionInLine());
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL100=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall1017); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall1019); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:21: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1021);
							exprList99=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList99, currentScope,FUNC_CALL100.getLine(),FUNC_CALL100.getCharPositionInLine());
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:182:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL102=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall1031); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall1033); 
					pushFollow(FOLLOW_expression_in_transformCall1035);
					expression101=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new FlattenNode(expression101,currentScope,FUNC_CALL102.getLine(),FUNC_CALL102.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:186:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL104=null;
		CommonTree FUNC_CALL106=null;
		CommonTree FUNC_CALL108=null;
		java.util.List<DCNode> exprList103 =null;
		java.util.List<DCNode> exprList105 =null;
		java.util.List<DCNode> exprList107 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==FUNC_CALL) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Grid:
						{
						alt37=1;
						}
						break;
					case Wave:
						{
						alt37=2;
						}
						break;
					case Arc:
						{
						alt37=3;
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL104=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1067); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall1069); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:23: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==EXP_LIST) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1071);
							exprList103=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GridNode(exprList103,currentScope,FUNC_CALL104.getLine(),FUNC_CALL104.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL106=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1083); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall1085); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1087);
							exprList105=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WaveNode(exprList105,currentScope,FUNC_CALL106.getLine(),FUNC_CALL106.getCharPositionInLine(),widthParam, heightParam);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL108=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1099); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1101); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:22: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1103);
							exprList107=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ArcNode(exprList107,currentScope,FUNC_CALL108.getLine(),FUNC_CALL108.getCharPositionInLine(),widthParam, heightParam);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


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
		CommonTree FUNC_CALL136=null;
		CommonTree FUNC_CALL138=null;
		CommonTree FUNC_CALL140=null;
		DCNode expression109 =null;
		DCNode expression111 =null;
		DCNode expression113 =null;
		java.util.List<DCNode> exprList115 =null;
		java.util.List<DCNode> exprList117 =null;
		java.util.List<DCNode> exprList119 =null;
		DCNode expression121 =null;
		DCNode expression123 =null;
		java.util.List<DCNode> exprList125 =null;
		java.util.List<DCNode> exprList127 =null;
		DCNode expression129 =null;
		java.util.List<DCNode> exprList131 =null;
		DCNode expression133 =null;
		DCNode expression135 =null;
		DCNode expression137 =null;
		DCNode expression139 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
			int alt44=16;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==FUNC_CALL) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt44=1;
						}
						break;
					case Sine:
						{
						alt44=2;
						}
						break;
					case Tan:
						{
						alt44=3;
						}
						break;
					case ATan:
						{
						alt44=4;
						}
						break;
					case Random:
						{
						alt44=5;
						}
						break;
					case Pow:
						{
						alt44=6;
						}
						break;
					case Sqrt:
						{
						alt44=7;
						}
						break;
					case Sq:
						{
						alt44=8;
						}
						break;
					case Gaussian:
						{
						alt44=9;
						}
						break;
					case Noise:
						{
						alt44=10;
						}
						break;
					case Round:
						{
						alt44=11;
						}
						break;
					case Map:
						{
						alt44=12;
						}
						break;
					case Inch:
						{
						alt44=13;
						}
						break;
					case Mm:
						{
						alt44=14;
						}
						break;
					case Cm:
						{
						alt44=15;
						}
						break;
					case Units:
						{
						alt44=16;
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL110=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1138); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1140); 
					pushFollow(FOLLOW_expression_in_mathCall1142);
					expression109=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression109,FUNC_CALL110.getLine(),FUNC_CALL110.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:196:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL112=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1152); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1154); 
					pushFollow(FOLLOW_expression_in_mathCall1156);
					expression111=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression111,FUNC_CALL112.getLine(),FUNC_CALL112.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:197:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL114=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1166); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1168); 
					pushFollow(FOLLOW_expression_in_mathCall1170);
					expression113=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression113,FUNC_CALL114.getLine(),FUNC_CALL114.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL116=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1180); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1182); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:22: ( exprList )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==EXP_LIST) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:198:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1184);
							exprList115=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ATanNode(exprList115,FUNC_CALL116.getLine(),FUNC_CALL116.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:199:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL118=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1195); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1197); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:199:24: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:199:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1199);
							exprList117=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RandomNode(exprList117,FUNC_CALL118.getLine(),FUNC_CALL118.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:200:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL120=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1210); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1212); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:200:21: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:200:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1214);
							exprList119=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PowFNode(exprList119,FUNC_CALL120.getLine(),FUNC_CALL120.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:201:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL122=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1224); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1226); 
					pushFollow(FOLLOW_expression_in_mathCall1228);
					expression121=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression121,FUNC_CALL122.getLine(),FUNC_CALL122.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:202:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL124=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1237); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1239); 
					pushFollow(FOLLOW_expression_in_mathCall1241);
					expression123=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression123,FUNC_CALL124.getLine(),FUNC_CALL124.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:203:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL126=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1250); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1252); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:203:26: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:203:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1254);
							exprList125=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GaussianNode(exprList125,FUNC_CALL126.getLine(),FUNC_CALL126.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:204:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL128=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1265); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1267); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:204:23: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:204:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1269);
							exprList127=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new NoiseNode(exprList127,FUNC_CALL128.getLine(),FUNC_CALL128.getCharPositionInLine());
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:205:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL130=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1280); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1282); 
					pushFollow(FOLLOW_expression_in_mathCall1284);
					expression129=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression129,FUNC_CALL130.getLine(),FUNC_CALL130.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:206:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL132=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1294); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1296); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:206:21: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:206:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1298);
							exprList131=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MapNode(exprList131,FUNC_CALL132.getLine(),FUNC_CALL132.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:207:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL134=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1309); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1311); 
					pushFollow(FOLLOW_expression_in_mathCall1313);
					expression133=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression133,"inch",unitParam,FUNC_CALL134.getLine(),FUNC_CALL134.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:208:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL136=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1322); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1324); 
					pushFollow(FOLLOW_expression_in_mathCall1326);
					expression135=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression135,"mm",unitParam,FUNC_CALL136.getLine(),FUNC_CALL136.getCharPositionInLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:209:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL138=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1335); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1337); 
					pushFollow(FOLLOW_expression_in_mathCall1339);
					expression137=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression137,"cm",unitParam,FUNC_CALL138.getLine(),FUNC_CALL138.getCharPositionInLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:210:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL140=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1348); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1350); 
					pushFollow(FOLLOW_expression_in_mathCall1352);
					expression139=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression139,"units",unitParam,FUNC_CALL140.getLine(),FUNC_CALL140.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:216:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final DCNode getCall() throws RecognitionException {
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
		CommonTree FUNC_CALL160=null;
		DCNode expression141 =null;
		DCNode expression143 =null;
		DCNode expression145 =null;
		DCNode expression147 =null;
		DCNode expression149 =null;
		DCNode expression151 =null;
		java.util.List<DCNode> exprList153 =null;
		java.util.List<DCNode> exprList155 =null;
		java.util.List<DCNode> exprList157 =null;
		java.util.List<DCNode> exprList159 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:217:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
			int alt49=14;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==FUNC_CALL) ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt49=1;
						}
						break;
					case GetHeight:
						{
						alt49=2;
						}
						break;
					case GetX:
						{
						alt49=3;
						}
						break;
					case GetY:
						{
						alt49=4;
						}
						break;
					case GetOrigin:
						{
						alt49=5;
						}
						break;
					case GetRotation:
						{
						alt49=6;
						}
						break;
					case GetFill:
						{
						alt49=7;
						}
						break;
					case GetStroke:
						{
						alt49=8;
						}
						break;
					case GetStart:
						{
						alt49=9;
						}
						break;
					case GetEnd:
						{
						alt49=10;
						}
						break;
					case GetDistance:
						{
						alt49=11;
						}
						break;
					case GetIntersect:
						{
						alt49=12;
						}
						break;
					case GetAngle:
						{
						alt49=13;
						}
						break;
					case GetRadius:
						{
						alt49=14;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 49, 2, input);
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
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:217:5: ^( FUNC_CALL GetWidth expression )
					{
					FUNC_CALL142=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1390); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1392); 
					pushFollow(FOLLOW_expression_in_getCall1394);
					expression141=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression141,FUNC_CALL142.getLine(),FUNC_CALL142.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:5: ^( FUNC_CALL GetHeight expression )
					{
					FUNC_CALL144=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1404); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1406); 
					pushFollow(FOLLOW_expression_in_getCall1408);
					expression143=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression143,FUNC_CALL144.getLine(),FUNC_CALL144.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:5: ^( FUNC_CALL GetX expression )
					{
					FUNC_CALL146=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1417); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1419); 
					pushFollow(FOLLOW_expression_in_getCall1421);
					expression145=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression145,FUNC_CALL146.getLine(),FUNC_CALL146.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:220:5: ^( FUNC_CALL GetY expression )
					{
					FUNC_CALL148=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1430); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1432); 
					pushFollow(FOLLOW_expression_in_getCall1434);
					expression147=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression147,FUNC_CALL148.getLine(),FUNC_CALL148.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:221:5: ^( FUNC_CALL GetOrigin expression )
					{
					FUNC_CALL150=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1443); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1445); 
					pushFollow(FOLLOW_expression_in_getCall1447);
					expression149=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression149,FUNC_CALL150.getLine(),FUNC_CALL150.getCharPositionInLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:222:5: ^( FUNC_CALL GetRotation expression )
					{
					FUNC_CALL152=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1456); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1458); 
					pushFollow(FOLLOW_expression_in_getCall1460);
					expression151=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression151,FUNC_CALL152.getLine(),FUNC_CALL152.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:223:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1469); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1471); 
					pushFollow(FOLLOW_expression_in_getCall1473);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:224:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1481); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1483); 
					pushFollow(FOLLOW_expression_in_getCall1485);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1493); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1495); 
					pushFollow(FOLLOW_expression_in_getCall1497);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1504); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1506); 
					pushFollow(FOLLOW_expression_in_getCall1508);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					FUNC_CALL154=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1516); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1518); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:28: ( exprList )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==EXP_LIST) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1520);
							exprList153=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DistanceNode(exprList153,FUNC_CALL154.getLine(),FUNC_CALL154.getCharPositionInLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					FUNC_CALL156=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1530); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1532); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:29: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==EXP_LIST) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1534);
							exprList155=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new IntersectNode(exprList155,FUNC_CALL156.getLine(),FUNC_CALL156.getCharPositionInLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					FUNC_CALL158=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1544); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1546); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:25: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1548);
							exprList157=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetAngleNode(exprList157,FUNC_CALL158.getLine(),FUNC_CALL158.getCharPositionInLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					FUNC_CALL160=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1559); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1561); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:26: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1563);
							exprList159=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GetRadiusNode(exprList159,FUNC_CALL160.getLine(),FUNC_CALL160.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:233:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL162=null;
		java.util.List<DCNode> exprList161 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			FUNC_CALL162=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1591); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1593); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:25: ( exprList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==EXP_LIST) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:234:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1595);
					exprList161=exprList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new SliderNode(exprList161,currentScope,FUNC_CALL162.getLine(),FUNC_CALL162.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:237:4: templateCall returns [DCNode node] : ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) );
	public final DCNode templateCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL164=null;
		CommonTree FUNC_CALL166=null;
		CommonTree FUNC_CALL168=null;
		CommonTree FUNC_CALL170=null;
		CommonTree FUNC_CALL172=null;
		CommonTree FUNC_CALL174=null;
		CommonTree FUNC_CALL176=null;
		CommonTree FUNC_CALL178=null;
		CommonTree FUNC_CALL180=null;
		java.util.List<DCNode> exprList163 =null;
		java.util.List<DCNode> exprList165 =null;
		java.util.List<DCNode> exprList167 =null;
		java.util.List<DCNode> exprList169 =null;
		java.util.List<DCNode> exprList171 =null;
		java.util.List<DCNode> exprList173 =null;
		java.util.List<DCNode> exprList175 =null;
		java.util.List<DCNode> exprList177 =null;
		java.util.List<DCNode> exprList179 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:4: ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) )
			int alt61=10;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==FUNC_CALL) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Template:
						{
						alt61=1;
						}
						break;
					case SetWidth:
						{
						alt61=2;
						}
						break;
					case SetHeight:
						{
						alt61=3;
						}
						break;
					case SetSeam:
						{
						alt61=4;
						}
						break;
					case SetName:
						{
						alt61=5;
						}
						break;
					case SetVFold:
						{
						alt61=6;
						}
						break;
					case SetHFold:
						{
						alt61=7;
						}
						break;
					case SetCorner:
						{
						alt61=8;
						}
						break;
					case TemplateCollection:
						{
						alt61=9;
						}
						break;
					case AddDesign:
						{
						alt61=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 61, 2, input);
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
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:6: ^( FUNC_CALL Template ( exprList )? )
					{
					FUNC_CALL164=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1626); 
					match(input, Token.DOWN, null); 
					match(input,Template,FOLLOW_Template_in_templateCall1628); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:27: ( exprList )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==EXP_LIST) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:238:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1630);
							exprList163=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateNode(exprList163,FUNC_CALL164.getLine(),FUNC_CALL164.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:5: ^( FUNC_CALL SetWidth ( exprList )? )
					{
					FUNC_CALL166=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1641); 
					match(input, Token.DOWN, null); 
					match(input,SetWidth,FOLLOW_SetWidth_in_templateCall1643); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:26: ( exprList )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==EXP_LIST) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1645);
							exprList165=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetWidthNode(exprList165,FUNC_CALL166.getLine(),FUNC_CALL166.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:240:5: ^( FUNC_CALL SetHeight ( exprList )? )
					{
					FUNC_CALL168=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1656); 
					match(input, Token.DOWN, null); 
					match(input,SetHeight,FOLLOW_SetHeight_in_templateCall1658); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:240:27: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EXP_LIST) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:240:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1660);
							exprList167=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHeightNode(exprList167,FUNC_CALL168.getLine(),FUNC_CALL168.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:241:5: ^( FUNC_CALL SetSeam ( exprList )? )
					{
					FUNC_CALL170=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1670); 
					match(input, Token.DOWN, null); 
					match(input,SetSeam,FOLLOW_SetSeam_in_templateCall1672); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:241:25: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EXP_LIST) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:241:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1674);
							exprList169=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetSeamNode(exprList169,FUNC_CALL170.getLine(),FUNC_CALL170.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:242:5: ^( FUNC_CALL SetName ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1684); 
					match(input, Token.DOWN, null); 
					match(input,SetName,FOLLOW_SetName_in_templateCall1686); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:242:25: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EXP_LIST) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:242:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1688);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:5: ^( FUNC_CALL SetVFold ( exprList )? )
					{
					FUNC_CALL172=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1697); 
					match(input, Token.DOWN, null); 
					match(input,SetVFold,FOLLOW_SetVFold_in_templateCall1699); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:26: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EXP_LIST) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1701);
							exprList171=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetVFoldNode(exprList171,FUNC_CALL172.getLine(),FUNC_CALL172.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:244:5: ^( FUNC_CALL SetHFold ( exprList )? )
					{
					FUNC_CALL174=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1711); 
					match(input, Token.DOWN, null); 
					match(input,SetHFold,FOLLOW_SetHFold_in_templateCall1713); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:244:26: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EXP_LIST) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:244:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1715);
							exprList173=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHFoldNode(exprList173,FUNC_CALL174.getLine(),FUNC_CALL174.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:5: ^( FUNC_CALL SetCorner ( exprList )? )
					{
					FUNC_CALL176=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1725); 
					match(input, Token.DOWN, null); 
					match(input,SetCorner,FOLLOW_SetCorner_in_templateCall1727); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:27: ( exprList )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==EXP_LIST) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:245:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1729);
							exprList175=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCornerNode(exprList175,FUNC_CALL176.getLine(),FUNC_CALL176.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:5: ^( FUNC_CALL TemplateCollection ( exprList )? )
					{
					FUNC_CALL178=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1740); 
					match(input, Token.DOWN, null); 
					match(input,TemplateCollection,FOLLOW_TemplateCollection_in_templateCall1742); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:38: ( exprList )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==EXP_LIST) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:38: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1746);
							exprList177=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCollectionNode(exprList177,FUNC_CALL178.getLine(),FUNC_CALL178.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:247:5: ^( FUNC_CALL AddDesign ( exprList )? )
					{
					FUNC_CALL180=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1756); 
					match(input, Token.DOWN, null); 
					match(input,AddDesign,FOLLOW_AddDesign_in_templateCall1758); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:247:27: ( exprList )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==EXP_LIST) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:247:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1760);
							exprList179=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateAddDesignNode(exprList179,FUNC_CALL180.getLine(),FUNC_CALL180.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:251:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1797); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1799);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:26: ( elseIfStat[ifNode] )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==EXP) ) {
					int LA62_1 = input.LA(2);
					if ( (LA62_1==DOWN) ) {
						int LA62_3 = input.LA(3);
						if ( (LA62_3==Add||LA62_3==Bool||LA62_3==COLOR_CONSTANT||LA62_3==DOTPROPERTY||LA62_3==Divide||LA62_3==Equals||(LA62_3 >= GT && LA62_3 <= GTEquals)||LA62_3==HEIGHT_CONSTANT||LA62_3==In||LA62_3==LOOKUP||(LA62_3 >= LT && LA62_3 <= LTEquals)||LA62_3==Modulus||(LA62_3 >= Multiply && LA62_3 <= NEquals)||(LA62_3 >= Null && LA62_3 <= Number)||LA62_3==PI_CONSTANT||LA62_3==Pw||(LA62_3 >= Subtract && LA62_3 <= TERNARY)||LA62_3==UNARY_MIN||LA62_3==WIDTH_CONSTANT||(LA62_3 >= 168 && LA62_3 <= 169)) ) {
							alt62=1;
						}

					}

				}

				switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1803);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop62;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:48: ( elseStat[ifNode] )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==EXP) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1809);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:257:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression181 =null;
		BlockNode block182 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:258:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:258:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1829); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1831);
			expression181=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1833);
			block182=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression181, block182);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:261:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression183 =null;
		BlockNode block184 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:262:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:262:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1852); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1854);
			expression183=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1856);
			block184=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression183, block184);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:265:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block185 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:266:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1875); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1877);
			block185=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block185);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier186=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block187 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:270:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:270:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1902); 
			match(input, Token.DOWN, null); 
			Identifier186=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1904); 
			pushFollow(FOLLOW_expression_in_forStatement1908);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1912);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1914);
			block187=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier186!=null?Identifier186.getText():null), a, b, block187, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:273:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier188=null;
		CommonTree Repeat190=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block189 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			Repeat190=(CommonTree)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1937); 
			match(input, Token.DOWN, null); 
			Identifier188=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1939); 
			pushFollow(FOLLOW_expression_in_repeatStatement1943);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1947);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:51: (c= expression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==Add||LA64_0==Bool||LA64_0==COLOR_CONSTANT||LA64_0==DOTPROPERTY||LA64_0==Divide||LA64_0==Equals||(LA64_0 >= GT && LA64_0 <= GTEquals)||LA64_0==HEIGHT_CONSTANT||LA64_0==In||LA64_0==LOOKUP||(LA64_0 >= LT && LA64_0 <= LTEquals)||LA64_0==Modulus||(LA64_0 >= Multiply && LA64_0 <= NEquals)||(LA64_0 >= Null && LA64_0 <= Number)||LA64_0==PI_CONSTANT||LA64_0==Pw||(LA64_0 >= Subtract && LA64_0 <= TERNARY)||LA64_0==UNARY_MIN||LA64_0==WIDTH_CONSTANT||(LA64_0 >= 168 && LA64_0 <= 169)) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1952);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1956);
			block189=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier188!=null?Identifier188.getText():null), a, b, c, block189, currentScope, Repeat190.getLine(), Repeat190.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:276:1: radialStatement returns [DCNode node] : ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) ;
	public final DCNode radialStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree Radial192=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block191 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:2: ( ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:277:4: ^( Radial gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block )
			{
			Radial192=(CommonTree)match(input,Radial,FOLLOW_Radial_in_radialStatement1975); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1981); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1985); 
			pushFollow(FOLLOW_expression_in_radialStatement1990);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_radialStatement1994); 
			pushFollow(FOLLOW_expression_in_radialStatement1998);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_radialStatement2000);
			block191=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RadialStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), a, b, block191, currentScope,Radial192.getLine(), Radial192.getCharPositionInLine());
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



	// $ANTLR start "spiralStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:280:1: spiralStatement returns [DCNode node] : ^( Spiral gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) ;
	public final DCNode spiralStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree Spiral194=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block193 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:281:2: ( ^( Spiral gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:281:4: ^( Spiral gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block )
			{
			Spiral194=(CommonTree)match(input,Spiral,FOLLOW_Spiral_in_spiralStatement2020); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_spiralStatement2026); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_spiralStatement2030); 
			pushFollow(FOLLOW_expression_in_spiralStatement2035);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_spiralStatement2039); 
			pushFollow(FOLLOW_expression_in_spiralStatement2043);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_spiralStatement2045);
			block193=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new SpiralStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), a, b, block193, currentScope,Spiral194.getLine(), Spiral194.getCharPositionInLine());
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
	// $ANTLR end "spiralStatement"



	// $ANTLR start "rowStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:284:1: rowStatement returns [DCNode node] : ^( Row gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) ;
	public final DCNode rowStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree Row196=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block195 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:285:2: ( ^( Row gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:285:4: ^( Row gId= Identifier id1= Identifier a= expression id2= Identifier b= expression block )
			{
			Row196=(CommonTree)match(input,Row,FOLLOW_Row_in_rowStatement2065); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_rowStatement2071); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_rowStatement2075); 
			pushFollow(FOLLOW_expression_in_rowStatement2080);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_rowStatement2084); 
			pushFollow(FOLLOW_expression_in_rowStatement2088);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_rowStatement2090);
			block195=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RowStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), a, b, block195, currentScope,Row196.getLine(), Row196.getCharPositionInLine());
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
	// $ANTLR end "rowStatement"



	// $ANTLR start "arcStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:288:1: arcStatement returns [DCNode node] : ^( Arc gId= Identifier id1= Identifier a= expression id2= Identifier b= expression id3= Identifier c= expression block ) ;
	public final DCNode arcStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree id3=null;
		CommonTree Arc198=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block197 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:289:2: ( ^( Arc gId= Identifier id1= Identifier a= expression id2= Identifier b= expression id3= Identifier c= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:289:4: ^( Arc gId= Identifier id1= Identifier a= expression id2= Identifier b= expression id3= Identifier c= expression block )
			{
			Arc198=(CommonTree)match(input,Arc,FOLLOW_Arc_in_arcStatement2110); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arcStatement2116); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arcStatement2120); 
			pushFollow(FOLLOW_expression_in_arcStatement2125);
			a=expression();
			state._fsp--;

			id2=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arcStatement2129); 
			pushFollow(FOLLOW_expression_in_arcStatement2133);
			b=expression();
			state._fsp--;

			id3=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arcStatement2137); 
			pushFollow(FOLLOW_expression_in_arcStatement2141);
			c=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_arcStatement2143);
			block197=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ArcStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), (id2!=null?id2.getText():null), (id3!=null?id3.getText():null), a, b,c, block197, currentScope,Arc198.getLine(), Arc198.getCharPositionInLine());
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
	// $ANTLR end "arcStatement"



	// $ANTLR start "drawableRepeatStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:291:1: drawableRepeatStatement returns [DCNode node] : ^( Repeat gId= Identifier id1= Identifier a= expression block ) ;
	public final DCNode drawableRepeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree Repeat200=null;
		DCNode a =null;
		BlockNode block199 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:2: ( ^( Repeat gId= Identifier id1= Identifier a= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:4: ^( Repeat gId= Identifier id1= Identifier a= expression block )
			{
			Repeat200=(CommonTree)match(input,Repeat,FOLLOW_Repeat_in_drawableRepeatStatement2161); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_drawableRepeatStatement2167); 
			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_drawableRepeatStatement2171); 
			pushFollow(FOLLOW_expression_in_drawableRepeatStatement2176);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_drawableRepeatStatement2178);
			block199=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new DrawableRepeatStatementNode((gId!=null?gId.getText():null), (id1!=null?id1.getText():null), a, block199, currentScope,Repeat200.getLine(), Repeat200.getCharPositionInLine());
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
	// $ANTLR end "drawableRepeatStatement"



	// $ANTLR start "followCurveStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:295:1: followCurveStatement returns [DCNode node] : ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block ) ;
	public final DCNode followCurveStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree gId=null;
		CommonTree id1=null;
		CommonTree FollowCurve202=null;
		DCNode c =null;
		DCNode a =null;
		BlockNode block201 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:296:2: ( ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:296:4: ^( FollowCurve gId= Identifier c= statement id1= Identifier a= expression block )
			{
			FollowCurve202=(CommonTree)match(input,FollowCurve,FOLLOW_FollowCurve_in_followCurveStatement2198); 
			match(input, Token.DOWN, null); 
			gId=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_followCurveStatement2202); 
			pushFollow(FOLLOW_statement_in_followCurveStatement2207);
			c=statement();
			state._fsp--;

			id1=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_followCurveStatement2211); 
			pushFollow(FOLLOW_expression_in_followCurveStatement2215);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_followCurveStatement2217);
			block201=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new FollowCurveStatementNode((gId!=null?gId.getText():null), c, (id1!=null?id1.getText():null), a, block201, currentScope,FollowCurve202.getLine(), FollowCurve202.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:299:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression203 =null;
		BlockNode block204 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:300:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:300:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement2238); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement2240);
			expression203=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement2242);
			block204=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression203, block204);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:303:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier205=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList2269); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:16: ( Identifier )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==Identifier) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:305:17: Identifier
					{
					Identifier205=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList2272); 
					i.add((Identifier205!=null?Identifier205.getText():null));
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression206 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList2302); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:17: ( expression )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==Add||LA66_0==Bool||LA66_0==COLOR_CONSTANT||LA66_0==DOTPROPERTY||LA66_0==Divide||LA66_0==Equals||(LA66_0 >= GT && LA66_0 <= GTEquals)||LA66_0==HEIGHT_CONSTANT||LA66_0==In||LA66_0==LOOKUP||(LA66_0 >= LT && LA66_0 <= LTEquals)||LA66_0==Modulus||(LA66_0 >= Multiply && LA66_0 <= NEquals)||(LA66_0 >= Null && LA66_0 <= Number)||LA66_0==PI_CONSTANT||LA66_0==Pw||(LA66_0 >= Subtract && LA66_0 <= TERNARY)||LA66_0==UNARY_MIN||LA66_0==WIDTH_CONSTANT||(LA66_0 >= 168 && LA66_0 <= 169)) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:310:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList2305);
					expression206=expression();
					state._fsp--;

					e.add(expression206);
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
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:314:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number207=null;
		CommonTree Bool208=null;
		CommonTree COLOR_CONSTANT210=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup209 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:315:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt67=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt67=1;
				}
				break;
			case In:
				{
				alt67=2;
				}
				break;
			case 169:
				{
				alt67=3;
				}
				break;
			case 168:
				{
				alt67=4;
				}
				break;
			case Equals:
				{
				alt67=5;
				}
				break;
			case NEquals:
				{
				alt67=6;
				}
				break;
			case GTEquals:
				{
				alt67=7;
				}
				break;
			case LTEquals:
				{
				alt67=8;
				}
				break;
			case GT:
				{
				alt67=9;
				}
				break;
			case LT:
				{
				alt67=10;
				}
				break;
			case Add:
				{
				alt67=11;
				}
				break;
			case Subtract:
				{
				alt67=12;
				}
				break;
			case Multiply:
				{
				alt67=13;
				}
				break;
			case Divide:
				{
				alt67=14;
				}
				break;
			case Modulus:
				{
				alt67=15;
				}
				break;
			case Pw:
				{
				alt67=16;
				}
				break;
			case UNARY_MIN:
				{
				alt67=17;
				}
				break;
			case NEGATE:
				{
				alt67=18;
				}
				break;
			case Number:
				{
				alt67=19;
				}
				break;
			case Bool:
				{
				alt67=20;
				}
				break;
			case Null:
				{
				alt67=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt67=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt67=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt67=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt67=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt67=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:315:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression2330); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2334);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2338);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2342);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:316:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression2353); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2357);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2361);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:317:6: ^( '||' a= expression b= expression )
					{
					match(input,169,FOLLOW_169_in_expression2390); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2394);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2398);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:318:6: ^( '&&' a= expression b= expression )
					{
					match(input,168,FOLLOW_168_in_expression2425); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2429);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2433);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:319:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression2460); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2464);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2468);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:320:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression2495); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2499);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2503);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2530); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2534);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2538);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2565); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2569);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2573);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:323:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2600); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2604);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2608);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:324:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2636); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2640);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2644);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:325:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2672); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2676);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2680);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:326:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2708); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2712);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2716);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:327:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2744); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2748);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2752);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:328:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2780); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2784);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2788);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:329:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2816); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2820);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2824);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:330:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2852); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2856);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2860);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:331:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2888); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2892);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:332:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2927); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2931);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:333:6: Number
					{
					Number207=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2968); 
					node = new AtomNode(Double.parseDouble((Number207!=null?Number207.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:334:6: Bool
					{
					Bool208=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression3020); 
					node = new AtomNode(Boolean.parseBoolean((Bool208!=null?Bool208.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:335:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression3074); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:336:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression3128);
					lookup209=lookup();
					state._fsp--;

					node = lookup209;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT210=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression3180); 
					node = new AtomNode((COLOR_CONSTANT210!=null?COLOR_CONSTANT210.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:338:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression3199); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:339:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression3245); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:340:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression3290); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:343:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList211 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list3349); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:13: ( exprList )?
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==EXP_LIST) ) {
					alt68=1;
				}
				switch (alt68) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list3351);
						exprList211=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList211);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:349:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier214=null;
		CommonTree DOTPROPERTY215=null;
		CommonTree LOOKUP218=null;
		CommonTree LOOKUP220=null;
		CommonTree LOOKUP222=null;
		CommonTree Identifier223=null;
		CommonTree LOOKUP224=null;
		CommonTree String225=null;
		CommonTree LOOKUP226=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall212 =null;
		java.util.List<PropertyNode> dotProperty213 =null;
		java.util.List<PropertyNode> dotProperty216 =null;
		DCNode functionCall217 =null;
		DCNode list219 =null;
		DCNode expression221 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt74=7;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==DOTPROPERTY) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==DOWN) ) {
					int LA74_3 = input.LA(3);
					if ( (LA74_3==Identifier) ) {
						alt74=2;
					}
					else if ( (LA74_3==FUNC_CALL) ) {
						alt74=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 74, 3, input);
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
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA74_0==LOOKUP) ) {
				int LA74_2 = input.LA(2);
				if ( (LA74_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt74=6;
						}
						break;
					case String:
						{
						alt74=7;
						}
						break;
					case FUNC_CALL:
						{
						alt74=3;
						}
						break;
					case LIST:
						{
						alt74=4;
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
						alt74=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 74, 4, input);
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
							new NoViableAltException("", 74, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3374); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3376);
					functionCall212=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup3378);
					dotProperty213=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall212, dotProperty213);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:351:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY215=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3386); 
					match(input, Token.DOWN, null); 
					Identifier214=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3388); 
					pushFollow(FOLLOW_dotProperty_in_lookup3390);
					dotProperty216=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier214!=null?Identifier214.getText():null), currentScope,DOTPROPERTY215.getLine()), dotProperty216);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP218=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3414); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3416);
					functionCall217=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:28: (i= indexes )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==INDEXES) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3420);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall217, i,LOOKUP218.getLine()) : functionCall217;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:358:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP220=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup3434);
					list219=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:358:21: (i= indexes )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==INDEXES) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:358:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3438);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list219, i, LOOKUP220.getLine()) : list219;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:359:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP222=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3458); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup3460);
					expression221=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:359:27: (i= indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==INDEXES) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:359:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3464);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression221, i,LOOKUP222.getLine()) : expression221;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:360:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP224=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3478); 
					match(input, Token.DOWN, null); 
					Identifier223=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3480); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:360:27: (i= indexes )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==INDEXES) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:360:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3484);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier223!=null?Identifier223.getText():null), currentScope,LOOKUP224.getLine()), i,LOOKUP224.getLine()) : new IdentifierNode((Identifier223!=null?Identifier223.getText():null), currentScope,LOOKUP224.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP226=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3498); 
					match(input, Token.DOWN, null); 
					String225=(CommonTree)match(input,String,FOLLOW_String_in_lookup3500); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:23: (i= indexes )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==INDEXES) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:361:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3504);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String225!=null?String225.getText():null)), i,LOOKUP226.getLine()) : new AtomNode((String225!=null?String225.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:371:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression227 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:373:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:373:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3553); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:373:16: ( expression )+
			int cnt75=0;
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==Add||LA75_0==Bool||LA75_0==COLOR_CONSTANT||LA75_0==DOTPROPERTY||LA75_0==Divide||LA75_0==Equals||(LA75_0 >= GT && LA75_0 <= GTEquals)||LA75_0==HEIGHT_CONSTANT||LA75_0==In||LA75_0==LOOKUP||(LA75_0 >= LT && LA75_0 <= LTEquals)||LA75_0==Modulus||(LA75_0 >= Multiply && LA75_0 <= NEquals)||(LA75_0 >= Null && LA75_0 <= Number)||LA75_0==PI_CONSTANT||LA75_0==Pw||(LA75_0 >= Subtract && LA75_0 <= TERNARY)||LA75_0==UNARY_MIN||LA75_0==WIDTH_CONSTANT||(LA75_0 >= 168 && LA75_0 <= 169)) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:373:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3556);
					expression227=expression();
					state._fsp--;

					e.add(expression227);
					}
					break;

				default :
					if ( cnt75 >= 1 ) break loop75;
					EarlyExitException eee = new EarlyExitException(75, input);
					throw eee;
				}
				cnt75++;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:378:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression228 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:380:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:380:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3594); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:380:12: ( dotExpression )+
			int cnt76=0;
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( ((LA76_0 >= DotEnd && LA76_0 <= DotY)) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:380:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3597);
					dotExpression228=dotExpression();
					state._fsp--;

					e.add(dotExpression228);
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
	// $ANTLR end "dotProperty"



	// $ANTLR start "dotExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:383:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:384:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt77=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt77=1;
				}
				break;
			case DotY:
				{
				alt77=2;
				}
				break;
			case DotStart:
				{
				alt77=3;
				}
				break;
			case DotEnd:
				{
				alt77=4;
				}
				break;
			case DotOrigin:
				{
				alt77=5;
				}
				break;
			case DotRotation:
				{
				alt77=6;
				}
				break;
			case DotWidth:
				{
				alt77=7;
				}
				break;
			case DotHeight:
				{
				alt77=8;
				}
				break;
			case DotFill:
				{
				alt77=9;
				}
				break;
			case DotStroke:
				{
				alt77=10;
				}
				break;
			case DotWeight:
				{
				alt77=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:384:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3625); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:385:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3633); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:386:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3641); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:387:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3649); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:388:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3657); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:389:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3665); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:390:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3673); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:391:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3681); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:392:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3689); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:393:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3696); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:394:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3703); 
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
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0001200000000848L,0x8900000000000080L,0x0000004000100000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_radialStatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spiralStatement_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rowStatement_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arcStatement_in_statement209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drawableRepeatStatement_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_followCurveStatement_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment264 = new BitSet(new long[]{0x0006020420048108L,0x0010430720620908L,0x0000030906000000L});
	public static final BitSet FOLLOW_indexes_in_assignment266 = new BitSet(new long[]{0x0006020420048108L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_assignment269 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall313 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall315 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall329 = new BitSet(new long[]{0x0006020420048108L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall346 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall348 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall365 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall383 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_functionCall385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall403 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall405 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall420 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall514 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall516 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall530 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall547 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall565 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall583 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall599 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall613 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall615 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall631 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall648 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall679 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall681 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall686 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Comma_in_transformCall692 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall697 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Comma_in_transformCall699 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall703 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CParen_in_transformCall705 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall724 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall742 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall757 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall759 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall772 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall774 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall787 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall789 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall791 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall804 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall806 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall808 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall821 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall823 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall835 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall849 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall862 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall864 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall866 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall868 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CParen_in_transformCall870 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall880 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall882 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall884 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall896 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall911 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall913 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall922 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall924 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall926 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall937 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall951 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall962 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall964 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall977 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall989 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall991 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall993 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall1003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall1005 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall1007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall1017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall1019 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall1021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall1031 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall1033 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_transformCall1035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall1069 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1071 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall1085 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1099 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1101 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1103 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1140 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1152 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1154 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1156 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1168 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1170 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1182 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1197 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1199 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1212 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1226 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1239 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1252 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1267 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1269 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1282 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1284 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1296 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1311 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1313 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1324 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1337 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1350 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_mathCall1352 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1390 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1392 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1406 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1419 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1421 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1432 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1434 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1445 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1458 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1471 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1483 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1485 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1495 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1506 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_getCall1508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1518 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1530 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1532 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1534 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1544 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1546 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1561 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1593 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Template_in_templateCall1628 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall1643 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall1658 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1660 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall1672 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetName_in_templateCall1686 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1697 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetVFold_in_templateCall1699 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHFold_in_templateCall1713 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetCorner_in_templateCall1727 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TemplateCollection_in_templateCall1742 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AddDesign_in_templateCall1758 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1799 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1803 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1831 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_ifStat1833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1854 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1904 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1908 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_forStatement1912 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_forStatement1914 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1939 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1943 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1947 = new BitSet(new long[]{0x000602042004C100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1952 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1956 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Radial_in_radialStatement1975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1985 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_radialStatement1994 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_radialStatement1998 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_radialStatement2000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Spiral_in_spiralStatement2020 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_spiralStatement2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_spiralStatement2030 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_spiralStatement2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_spiralStatement2039 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_spiralStatement2043 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_spiralStatement2045 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Row_in_rowStatement2065 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_rowStatement2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_rowStatement2075 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_rowStatement2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_rowStatement2084 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_rowStatement2088 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_rowStatement2090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Arc_in_arcStatement2110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_arcStatement2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_arcStatement2120 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_arcStatement2125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_arcStatement2129 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_arcStatement2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_arcStatement2137 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_arcStatement2141 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_arcStatement2143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_drawableRepeatStatement2161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_drawableRepeatStatement2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_drawableRepeatStatement2171 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_drawableRepeatStatement2176 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_drawableRepeatStatement2178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FollowCurve_in_followCurveStatement2198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_followCurveStatement2202 = new BitSet(new long[]{0x0001200000000840L,0x8900000000000080L,0x0000004000100000L});
	public static final BitSet FOLLOW_statement_in_followCurveStatement2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_followCurveStatement2211 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_followCurveStatement2215 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_followCurveStatement2217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement2238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement2240 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_whileStatement2242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList2269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList2272 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList2302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList2305 = new BitSet(new long[]{0x0006020420048108L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_TERNARY_in_expression2330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2334 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2338 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression2353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2357 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2361 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_169_in_expression2390 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2394 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_168_in_expression2425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2429 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression2460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2464 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression2495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2499 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2530 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2534 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2569 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2604 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2640 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2676 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2680 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2708 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2712 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2744 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2748 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2784 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2820 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2856 = new BitSet(new long[]{0x0006020420048100L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_expression_in_expression2860 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2888 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2892 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2927 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2931 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression3020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression3074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression3199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression3245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression3290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list3349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list3351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3376 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3388 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3416 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup3434 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3458 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup3460 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3480 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup3500 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3553 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3556 = new BitSet(new long[]{0x0006020420048108L,0x0010430720620808L,0x0000030906000000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3594 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3597 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x001FFC0000000000L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3703 = new BitSet(new long[]{0x0000000000000002L});
}
