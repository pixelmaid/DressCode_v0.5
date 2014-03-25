// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g 2014-03-24 14:09:31

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
public class PyEsqueTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_CALL", "AND_CALL", "ASSIGNMENT", 
		"ATan", "Add", "AddDesign", "And", "Arc", "Assert", "Assign", "BLOCK", 
		"Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", "Clip", "Cm", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Dedent", "Def", "Difference", "Digit", "Divide", "Do", "Dot", "EXP", 
		"EXP_LIST", "Ellipse", "Else", "Equals", "Excl", "Expand", "FUNCTION", 
		"FUNC_CALL", "Fill", "Flatten", "GT", "GTEquals", "Gaussian", "GetAngle", 
		"GetDistance", "GetEnd", "GetFill", "GetHeight", "GetIntersect", "GetOrigin", 
		"GetRadius", "GetRotation", "GetStart", "GetStroke", "GetWidth", "GetX", 
		"GetY", "Grid", "Group", "HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", 
		"IF", "INDEXES", "Identifier", "If", "In", "Inch", "Indent", "Int", "LAdd", 
		"LIST", "LOOKUP", "LOOKUP_S", "LRemove", "LShape", "LT", "LTEquals", "Line", 
		"Map", "Merge", "MirrorX", "MirrorY", "Mm", "Modulus", "Move", "MoveBy", 
		"Multiply", "NEGATE", "NEquals", "NL", "NewLine", "NoFill", "NoStroke", 
		"Noise", "Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "Pw", "QMark", "Quad", 
		"RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", "Round", "SP", 
		"SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "SemiColon", "SetCorner", 
		"SetHFold", "SetHeight", "SetName", "SetSeam", "SetVFold", "SetWidth", 
		"Show", "Sine", "Size", "Skirt", "SkirtBack", "Slider", "SpaceChars", 
		"Spiral", "Sq", "Sqrt", "String", "Stroke", "Subtract", "TERNARY", "Tan", 
		"Template", "TemplateCollection", "To", "Triangle", "UNARY_MIN", "Union", 
		"Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", "Xor", "'&&'", "'||'", 
		"DotEnd", "DotFill", "DotHeight", "DotOrigin", "DotRotation", "DotStart", 
		"DotStroke", "DotWeight", "DotWidth", "DotX", "DotY", "For"
	};
	public static final int EOF=-1;
	public static final int T__166=166;
	public static final int T__167=167;
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
	public static final int GT=48;
	public static final int GTEquals=49;
	public static final int Gaussian=50;
	public static final int GetAngle=51;
	public static final int GetDistance=52;
	public static final int GetEnd=53;
	public static final int GetFill=54;
	public static final int GetHeight=55;
	public static final int GetIntersect=56;
	public static final int GetOrigin=57;
	public static final int GetRadius=58;
	public static final int GetRotation=59;
	public static final int GetStart=60;
	public static final int GetStroke=61;
	public static final int GetWidth=62;
	public static final int GetX=63;
	public static final int GetY=64;
	public static final int Grid=65;
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
	public static final int Random=120;
	public static final int Rect=121;
	public static final int Repeat=122;
	public static final int Return=123;
	public static final int Rotate=124;
	public static final int Round=125;
	public static final int SP=126;
	public static final int SPECIAL=127;
	public static final int STATEMENTS=128;
	public static final int SUB_CALL=129;
	public static final int Scale=130;
	public static final int SemiColon=131;
	public static final int SetCorner=132;
	public static final int SetHFold=133;
	public static final int SetHeight=134;
	public static final int SetName=135;
	public static final int SetSeam=136;
	public static final int SetVFold=137;
	public static final int SetWidth=138;
	public static final int Show=139;
	public static final int Sine=140;
	public static final int Size=141;
	public static final int Skirt=142;
	public static final int SkirtBack=143;
	public static final int Slider=144;
	public static final int SpaceChars=145;
	public static final int Spiral=146;
	public static final int Sq=147;
	public static final int Sqrt=148;
	public static final int String=149;
	public static final int Stroke=150;
	public static final int Subtract=151;
	public static final int TERNARY=152;
	public static final int Tan=153;
	public static final int Template=154;
	public static final int TemplateCollection=155;
	public static final int To=156;
	public static final int Triangle=157;
	public static final int UNARY_MIN=158;
	public static final int Union=159;
	public static final int Units=160;
	public static final int WIDTH_CONSTANT=161;
	public static final int Wave=162;
	public static final int Weight=163;
	public static final int While=164;
	public static final int Xor=165;
	public static final int DotEnd=168;
	public static final int DotFill=169;
	public static final int DotHeight=170;
	public static final int DotOrigin=171;
	public static final int DotRotation=172;
	public static final int DotStart=173;
	public static final int DotStroke=174;
	public static final int DotWeight=175;
	public static final int DotWidth=176;
	public static final int DotX=177;
	public static final int DotY=178;
	public static final int For=179;

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:67:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:68:3: ( block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:68:6: block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:71:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block96); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block99); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:28: statement
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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pw||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||(LA2_0 >= 166 && LA2_0 <= 167)) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:85:87: expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:89:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | whileStatement | repeatStatement );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode whileStatement7 =null;
		DCNode repeatStatement8 =null;


			//System.out.println(" statement called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:93:3: ( assignment | functionCall | ifStatement | whileStatement | repeatStatement )
			int alt3=5;
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
			case Repeat:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:93:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement142);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:94:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement155);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:95:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement166);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:96:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement178);
					whileStatement7=whileStatement();
					state._fsp--;

					node = whileStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:97:5: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement186);
					repeatStatement8=repeatStatement();
					state._fsp--;

					node = repeatStatement8; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:102:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier9=null;
		CommonTree ASSIGNMENT12=null;
		java.util.List<DCNode> indexes10 =null;
		DCNode expression11 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:3: ( ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:6: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
			{
			ASSIGNMENT12=(CommonTree)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment215); 
			match(input, Token.DOWN, null); 
			Identifier9=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment217); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment219);
					indexes10=indexes();
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:39: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Add||LA5_0==Bool||LA5_0==COLOR_CONSTANT||LA5_0==DOTPROPERTY||LA5_0==Divide||LA5_0==Equals||(LA5_0 >= GT && LA5_0 <= GTEquals)||LA5_0==HEIGHT_CONSTANT||LA5_0==In||LA5_0==LOOKUP||(LA5_0 >= LT && LA5_0 <= LTEquals)||LA5_0==Modulus||(LA5_0 >= Multiply && LA5_0 <= NEquals)||(LA5_0 >= Null && LA5_0 <= Number)||LA5_0==PI_CONSTANT||LA5_0==Pw||(LA5_0 >= Subtract && LA5_0 <= TERNARY)||LA5_0==UNARY_MIN||LA5_0==WIDTH_CONSTANT||(LA5_0 >= 166 && LA5_0 <= 167)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:103:39: expression
					{
					pushFollow(FOLLOW_expression_in_assignment222);
					expression11=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier9!=null?Identifier9.getText():null), indexes10, expression11, currentScope,ASSIGNMENT12.getLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:112:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
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
		DCNode uICall29 =null;
		DCNode templateCall30 =null;


			//System.out.println("function called");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:116:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:116:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					FUNC_CALL15=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall261); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall263); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:116:29: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EXP_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:116:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall265);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions, widthParam, heightParam, unitParam,FUNC_CALL15.getLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:117:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall277); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall279); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:117:26: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Add||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==DOTPROPERTY||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==HEIGHT_CONSTANT||LA7_0==In||LA7_0==LOOKUP||(LA7_0 >= LT && LA7_0 <= LTEquals)||LA7_0==Modulus||(LA7_0 >= Multiply && LA7_0 <= NEquals)||(LA7_0 >= Null && LA7_0 <= Number)||LA7_0==PI_CONSTANT||LA7_0==Pw||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==WIDTH_CONSTANT||(LA7_0 >= 166 && LA7_0 <= 167)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:117:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall281);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:118:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall294); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall296); 
					pushFollow(FOLLOW_expression_in_functionCall298);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:119:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall313); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall315); 
					pushFollow(FOLLOW_expression_in_functionCall317);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:120:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall331); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall333); 
					pushFollow(FOLLOW_expression_in_functionCall335);
					expression19=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression19); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL21=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall351); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall353); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:23: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:121:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall355);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL23=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall368); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall370); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:26: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EXP_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:122:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall372);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:123:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall383);
					primitiveCall24=primitiveCall();
					state._fsp--;

					node = primitiveCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:124:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall392);
					transformCall25=transformCall();
					state._fsp--;

					node = transformCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:125:6: patternCall
					{
					pushFollow(FOLLOW_patternCall_in_functionCall401);
					patternCall26=patternCall();
					state._fsp--;

					node = patternCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:126:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall410);
					mathCall27=mathCall();
					state._fsp--;

					node= mathCall27; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:127:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall419);
					getCall28=getCall();
					state._fsp--;

					node= getCall28; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:128:5: uICall
					{
					pushFollow(FOLLOW_uICall_in_functionCall427);
					uICall29=uICall();
					state._fsp--;

					node = uICall29; ((NodeEvent)node).addEventListener(uiManager);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:129:5: templateCall
					{
					pushFollow(FOLLOW_templateCall_in_functionCall435);
					templateCall30=templateCall();
					state._fsp--;

					node = templateCall30; ((NodeEvent)node).addEventListener(drawableManager);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:133:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL Skirt ( exprList )? ) | ^( FUNC_CALL SkirtBack ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL32=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall462); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall464); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:25: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:134:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall466);
							exprList31=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList31,FUNC_CALL32.getLine(),FUNC_CALL32.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:135:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL34=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall478); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall480); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:135:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:135:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall482);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:136:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL36=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall495); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall497); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:136:22: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:136:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall499);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:137:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall513); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall515); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:137:24: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:137:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall517);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:138:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall531); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall533); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:138:26: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:138:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall535);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:6: ^( FUNC_CALL Skirt ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall547); 
					match(input, Token.DOWN, null); 
					match(input,Skirt,FOLLOW_Skirt_in_primitiveCall549); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:24: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:139:24: exprList
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
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:7: ^( FUNC_CALL SkirtBack ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall563); 
					match(input, Token.DOWN, null); 
					match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall565); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:29: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:140:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall567);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:7: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall579); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall581); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:26: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:141:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall583);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall596); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall598); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:25: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:142:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall600);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:145:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Heading ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Show expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) | ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall627); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall629); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:22: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:146:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall631);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall645); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall647); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:25: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:147:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall649);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:6: ^( FUNC_CALL Heading ( exprList )? )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall663); 
					match(input, Token.DOWN, null); 
					match(input,Heading,FOLLOW_Heading_in_transformCall665); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:26: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:148:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall667);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:149:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall680); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall682); 
					pushFollow(FOLLOW_expression_in_transformCall684);
					expression51=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression51,FUNC_CALL52.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall695); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall697); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:150:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall699);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall710); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall712); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:22: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:151:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall714);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall727); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall729); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:24: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:152:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall731);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:153:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall742); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall744); 
					pushFollow(FOLLOW_expression_in_transformCall746);
					expression59=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression59 ,FUNC_CALL60.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:154:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall756); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall758); 
					pushFollow(FOLLOW_expression_in_transformCall760);
					expression61=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression61,FUNC_CALL62.getLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall770); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall772); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:155:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall774);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:156:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall785); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall787); 
					pushFollow(FOLLOW_expression_in_transformCall789);
					expression65=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression65,FUNC_CALL66.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:157:5: ^( FUNC_CALL Show expression )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall799); 
					match(input, Token.DOWN, null); 
					match(input,Show,FOLLOW_Show_in_transformCall801); 
					pushFollow(FOLLOW_expression_in_transformCall803);
					expression67=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ShowNode(expression67,FUNC_CALL68.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall813); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall815); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:23: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:158:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall817);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:159:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall828); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall830); 
					pushFollow(FOLLOW_expression_in_transformCall832);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression71, currentScope, FUNC_CALL72.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:160:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall841); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall843); 
					pushFollow(FOLLOW_expression_in_transformCall845);
					expression73=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression73,currentScope,FUNC_CALL74.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall854); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall856); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:23: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:161:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall858);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:162:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall868); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall870); 
					pushFollow(FOLLOW_expression_in_transformCall872);
					expression77=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression77,FUNC_CALL78.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:163:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall881); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall883); 
					pushFollow(FOLLOW_expression_in_transformCall885);
					expression79=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression79,FUNC_CALL80.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall894); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall896); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:23: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:164:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall898);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall908); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall910); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:28: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:165:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall912);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall922); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall924); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:22: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:166:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall926);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall936); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall938); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:21: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==EXP_LIST) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:167:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall940);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:168:5: ^( FUNC_CALL Flatten expression )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall950); 
					match(input, Token.DOWN, null); 
					match(input,Flatten,FOLLOW_Flatten_in_transformCall952); 
					pushFollow(FOLLOW_expression_in_transformCall954);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:172:5: patternCall returns [DCNode node] : ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) );
	public final DCNode patternCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		CommonTree FUNC_CALL96=null;
		java.util.List<DCNode> exprList91 =null;
		java.util.List<DCNode> exprList93 =null;
		java.util.List<DCNode> exprList95 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:4: ( ^( FUNC_CALL Grid ( exprList )? ) | ^( FUNC_CALL Wave ( exprList )? ) | ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:6: ^( FUNC_CALL Grid ( exprList )? )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall986); 
					match(input, Token.DOWN, null); 
					match(input,Grid,FOLLOW_Grid_in_patternCall988); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:23: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==EXP_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:173:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall990);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:174:6: ^( FUNC_CALL Wave ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1002); 
					match(input, Token.DOWN, null); 
					match(input,Wave,FOLLOW_Wave_in_patternCall1004); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:174:23: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==EXP_LIST) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:174:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1006);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:6: ^( FUNC_CALL Arc ( exprList )? )
					{
					FUNC_CALL96=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_patternCall1018); 
					match(input, Token.DOWN, null); 
					match(input,Arc,FOLLOW_Arc_in_patternCall1020); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:22: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==EXP_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:175:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1022);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:179:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan ( exprList )? ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Pow ( exprList )? ) | ^( FUNC_CALL Sqrt expression ) | ^( FUNC_CALL Sq expression ) | ^( FUNC_CALL Gaussian ( exprList )? ) | ^( FUNC_CALL Noise ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) | ^( FUNC_CALL Inch expression ) | ^( FUNC_CALL Mm expression ) | ^( FUNC_CALL Cm expression ) | ^( FUNC_CALL Units expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:180:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL98=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1054); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall1056); 
					pushFollow(FOLLOW_expression_in_mathCall1058);
					expression97=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression97,FUNC_CALL98.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:181:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL100=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1068); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall1070); 
					pushFollow(FOLLOW_expression_in_mathCall1072);
					expression99=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression99,FUNC_CALL100.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:182:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL102=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1082); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall1084); 
					pushFollow(FOLLOW_expression_in_mathCall1086);
					expression101=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TanNode(expression101,FUNC_CALL102.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:183:5: ^( FUNC_CALL ATan ( exprList )? )
					{
					FUNC_CALL104=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1096); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall1098); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:183:22: ( exprList )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==EXP_LIST) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:183:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1100);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:184:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL106=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1111); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall1113); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:184:24: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==EXP_LIST) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:184:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1115);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:185:5: ^( FUNC_CALL Pow ( exprList )? )
					{
					FUNC_CALL108=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1126); 
					match(input, Token.DOWN, null); 
					match(input,Pow,FOLLOW_Pow_in_mathCall1128); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:185:21: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==EXP_LIST) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:185:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1130);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:186:5: ^( FUNC_CALL Sqrt expression )
					{
					FUNC_CALL110=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1140); 
					match(input, Token.DOWN, null); 
					match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1142); 
					pushFollow(FOLLOW_expression_in_mathCall1144);
					expression109=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqrtNode(expression109,FUNC_CALL110.getLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:187:5: ^( FUNC_CALL Sq expression )
					{
					FUNC_CALL112=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1153); 
					match(input, Token.DOWN, null); 
					match(input,Sq,FOLLOW_Sq_in_mathCall1155); 
					pushFollow(FOLLOW_expression_in_mathCall1157);
					expression111=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SqNode(expression111,FUNC_CALL112.getLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:5: ^( FUNC_CALL Gaussian ( exprList )? )
					{
					FUNC_CALL114=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1166); 
					match(input, Token.DOWN, null); 
					match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1168); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:26: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==EXP_LIST) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:188:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1170);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:5: ^( FUNC_CALL Noise ( exprList )? )
					{
					FUNC_CALL116=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1181); 
					match(input, Token.DOWN, null); 
					match(input,Noise,FOLLOW_Noise_in_mathCall1183); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:23: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==EXP_LIST) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:189:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1185);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:190:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL118=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1196); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall1198); 
					pushFollow(FOLLOW_expression_in_mathCall1200);
					expression117=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new RoundNode(expression117,FUNC_CALL118.getLine());
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL120=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1210); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall1212); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:21: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==EXP_LIST) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:191:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1214);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:192:5: ^( FUNC_CALL Inch expression )
					{
					FUNC_CALL122=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1225); 
					match(input, Token.DOWN, null); 
					match(input,Inch,FOLLOW_Inch_in_mathCall1227); 
					pushFollow(FOLLOW_expression_in_mathCall1229);
					expression121=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression121,"inch",unitParam,FUNC_CALL122.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:193:5: ^( FUNC_CALL Mm expression )
					{
					FUNC_CALL124=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1238); 
					match(input, Token.DOWN, null); 
					match(input,Mm,FOLLOW_Mm_in_mathCall1240); 
					pushFollow(FOLLOW_expression_in_mathCall1242);
					expression123=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression123,"mm",unitParam,FUNC_CALL124.getLine());
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:194:5: ^( FUNC_CALL Cm expression )
					{
					FUNC_CALL126=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1251); 
					match(input, Token.DOWN, null); 
					match(input,Cm,FOLLOW_Cm_in_mathCall1253); 
					pushFollow(FOLLOW_expression_in_mathCall1255);
					expression125=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ConversionNode(expression125,"cm",unitParam,FUNC_CALL126.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:195:5: ^( FUNC_CALL Units expression )
					{
					FUNC_CALL128=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall1264); 
					match(input, Token.DOWN, null); 
					match(input,Units,FOLLOW_Units_in_mathCall1266); 
					pushFollow(FOLLOW_expression_in_mathCall1268);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:201:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:202:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) | ^( FUNC_CALL GetIntersect ( exprList )? ) | ^( FUNC_CALL GetAngle ( exprList )? ) | ^( FUNC_CALL GetRadius ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:202:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1306); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1308); 
					pushFollow(FOLLOW_expression_in_getCall1310);
					expression129=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetWidthNode(expression129);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:203:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1320); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1322); 
					pushFollow(FOLLOW_expression_in_getCall1324);
					expression130=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetHeightNode(expression130);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:204:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1333); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1335); 
					pushFollow(FOLLOW_expression_in_getCall1337);
					expression131=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetXNode(expression131);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:205:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1346); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1348); 
					pushFollow(FOLLOW_expression_in_getCall1350);
					expression132=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetYNode(expression132);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:206:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1359); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1361); 
					pushFollow(FOLLOW_expression_in_getCall1363);
					expression133=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetOriginNode(expression133);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:207:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1372); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1374); 
					pushFollow(FOLLOW_expression_in_getCall1376);
					expression134=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GetRotationNode(expression134);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:208:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1385); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1387); 
					pushFollow(FOLLOW_expression_in_getCall1389);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:209:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1397); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1399); 
					pushFollow(FOLLOW_expression_in_getCall1401);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:210:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1409); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1411); 
					pushFollow(FOLLOW_expression_in_getCall1413);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:211:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1420); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1422); 
					pushFollow(FOLLOW_expression_in_getCall1424);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:212:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1432); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1434); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:212:28: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==EXP_LIST) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:212:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1436);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:213:4: ^( FUNC_CALL GetIntersect ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1446); 
					match(input, Token.DOWN, null); 
					match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1448); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:213:29: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==EXP_LIST) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:213:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1450);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:214:4: ^( FUNC_CALL GetAngle ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1460); 
					match(input, Token.DOWN, null); 
					match(input,GetAngle,FOLLOW_GetAngle_in_getCall1462); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:214:25: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EXP_LIST) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:214:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1464);
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:215:4: ^( FUNC_CALL GetRadius ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1475); 
					match(input, Token.DOWN, null); 
					match(input,GetRadius,FOLLOW_GetRadius_in_getCall1477); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:215:26: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==EXP_LIST) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:215:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1479);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:218:3: uICall returns [DCNode node] : ^( FUNC_CALL Slider ( exprList )? ) ;
	public final DCNode uICall() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList139 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:4: ( ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:6: ^( FUNC_CALL Slider ( exprList )? )
			{
			match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_uICall1507); 
			match(input, Token.DOWN, null); 
			match(input,Slider,FOLLOW_Slider_in_uICall1509); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:25: ( exprList )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==EXP_LIST) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:219:25: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall1511);
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



	// $ANTLR start "templateCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:222:4: templateCall returns [DCNode node] : ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) );
	public final DCNode templateCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL141=null;
		CommonTree FUNC_CALL143=null;
		CommonTree FUNC_CALL145=null;
		CommonTree FUNC_CALL147=null;
		CommonTree FUNC_CALL149=null;
		CommonTree FUNC_CALL151=null;
		CommonTree FUNC_CALL153=null;
		CommonTree FUNC_CALL155=null;
		CommonTree FUNC_CALL157=null;
		java.util.List<DCNode> exprList140 =null;
		java.util.List<DCNode> exprList142 =null;
		java.util.List<DCNode> exprList144 =null;
		java.util.List<DCNode> exprList146 =null;
		java.util.List<DCNode> exprList148 =null;
		java.util.List<DCNode> exprList150 =null;
		java.util.List<DCNode> exprList152 =null;
		java.util.List<DCNode> exprList154 =null;
		java.util.List<DCNode> exprList156 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:223:4: ( ^( FUNC_CALL Template ( exprList )? ) | ^( FUNC_CALL SetWidth ( exprList )? ) | ^( FUNC_CALL SetHeight ( exprList )? ) | ^( FUNC_CALL SetSeam ( exprList )? ) | ^( FUNC_CALL SetName ( exprList )? ) | ^( FUNC_CALL SetVFold ( exprList )? ) | ^( FUNC_CALL SetHFold ( exprList )? ) | ^( FUNC_CALL SetCorner ( exprList )? ) | ^( FUNC_CALL TemplateCollection ( exprList )? ) | ^( FUNC_CALL AddDesign ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:223:6: ^( FUNC_CALL Template ( exprList )? )
					{
					FUNC_CALL141=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1542); 
					match(input, Token.DOWN, null); 
					match(input,Template,FOLLOW_Template_in_templateCall1544); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:223:27: ( exprList )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==EXP_LIST) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:223:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1546);
							exprList140=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateNode(exprList140,FUNC_CALL141.getLine(),FUNC_CALL141.getCharPositionInLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:224:5: ^( FUNC_CALL SetWidth ( exprList )? )
					{
					FUNC_CALL143=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1557); 
					match(input, Token.DOWN, null); 
					match(input,SetWidth,FOLLOW_SetWidth_in_templateCall1559); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:224:26: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EXP_LIST) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:224:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1561);
							exprList142=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetWidthNode(exprList142,FUNC_CALL143.getLine(),FUNC_CALL143.getCharPositionInLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:5: ^( FUNC_CALL SetHeight ( exprList )? )
					{
					FUNC_CALL145=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1572); 
					match(input, Token.DOWN, null); 
					match(input,SetHeight,FOLLOW_SetHeight_in_templateCall1574); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:27: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EXP_LIST) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:225:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1576);
							exprList144=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHeightNode(exprList144,FUNC_CALL145.getLine(),FUNC_CALL145.getCharPositionInLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:5: ^( FUNC_CALL SetSeam ( exprList )? )
					{
					FUNC_CALL147=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1586); 
					match(input, Token.DOWN, null); 
					match(input,SetSeam,FOLLOW_SetSeam_in_templateCall1588); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:25: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EXP_LIST) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:226:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1590);
							exprList146=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetSeamNode(exprList146,FUNC_CALL147.getLine(),FUNC_CALL147.getCharPositionInLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:5: ^( FUNC_CALL SetName ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1600); 
					match(input, Token.DOWN, null); 
					match(input,SetName,FOLLOW_SetName_in_templateCall1602); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:25: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EXP_LIST) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:227:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1604);
							exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:5: ^( FUNC_CALL SetVFold ( exprList )? )
					{
					FUNC_CALL149=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1613); 
					match(input, Token.DOWN, null); 
					match(input,SetVFold,FOLLOW_SetVFold_in_templateCall1615); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:26: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EXP_LIST) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:228:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1617);
							exprList148=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetVFoldNode(exprList148,FUNC_CALL149.getLine(),FUNC_CALL149.getCharPositionInLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:5: ^( FUNC_CALL SetHFold ( exprList )? )
					{
					FUNC_CALL151=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1627); 
					match(input, Token.DOWN, null); 
					match(input,SetHFold,FOLLOW_SetHFold_in_templateCall1629); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:26: ( exprList )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==EXP_LIST) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:229:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1631);
							exprList150=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetHFoldNode(exprList150,FUNC_CALL151.getLine(),FUNC_CALL151.getCharPositionInLine());
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:5: ^( FUNC_CALL SetCorner ( exprList )? )
					{
					FUNC_CALL153=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1641); 
					match(input, Token.DOWN, null); 
					match(input,SetCorner,FOLLOW_SetCorner_in_templateCall1643); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:27: ( exprList )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==EXP_LIST) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:230:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1645);
							exprList152=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCornerNode(exprList152,FUNC_CALL153.getLine(),FUNC_CALL153.getCharPositionInLine());
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:5: ^( FUNC_CALL TemplateCollection ( exprList )? )
					{
					FUNC_CALL155=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1656); 
					match(input, Token.DOWN, null); 
					match(input,TemplateCollection,FOLLOW_TemplateCollection_in_templateCall1658); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:38: ( exprList )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==EXP_LIST) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:231:38: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1662);
							exprList154=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateSetCollectionNode(exprList154,FUNC_CALL155.getLine(),FUNC_CALL155.getCharPositionInLine());
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:5: ^( FUNC_CALL AddDesign ( exprList )? )
					{
					FUNC_CALL157=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_templateCall1672); 
					match(input, Token.DOWN, null); 
					match(input,AddDesign,FOLLOW_AddDesign_in_templateCall1674); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:27: ( exprList )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==EXP_LIST) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:232:27: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall1676);
							exprList156=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new TemplateAddDesignNode(exprList156,FUNC_CALL157.getLine(),FUNC_CALL157.getCharPositionInLine());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:236:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1713); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1715);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:26: ( elseIfStat[ifNode] )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==EXP) ) {
					int LA63_1 = input.LA(2);
					if ( (LA63_1==DOWN) ) {
						int LA63_3 = input.LA(3);
						if ( (LA63_3==Add||LA63_3==Bool||LA63_3==COLOR_CONSTANT||LA63_3==DOTPROPERTY||LA63_3==Divide||LA63_3==Equals||(LA63_3 >= GT && LA63_3 <= GTEquals)||LA63_3==HEIGHT_CONSTANT||LA63_3==In||LA63_3==LOOKUP||(LA63_3 >= LT && LA63_3 <= LTEquals)||LA63_3==Modulus||(LA63_3 >= Multiply && LA63_3 <= NEquals)||(LA63_3 >= Null && LA63_3 <= Number)||LA63_3==PI_CONSTANT||LA63_3==Pw||(LA63_3 >= Subtract && LA63_3 <= TERNARY)||LA63_3==UNARY_MIN||LA63_3==WIDTH_CONSTANT||(LA63_3 >= 166 && LA63_3 <= 167)) ) {
							alt63=1;
						}

					}

				}

				switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1719);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop63;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:48: ( elseStat[ifNode] )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:239:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1725);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:242:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression158 =null;
		BlockNode block159 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:243:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1745); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1747);
			expression158=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1749);
			block159=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression158, block159);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:246:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression160 =null;
		BlockNode block161 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:247:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:247:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1768); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1770);
			expression160=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1772);
			block161=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression160, block161);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:250:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block162 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:251:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:251:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1791); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1793);
			block162=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block162);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:254:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier163=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block164 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:255:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:255:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1818); 
			match(input, Token.DOWN, null); 
			Identifier163=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1820); 
			pushFollow(FOLLOW_expression_in_forStatement1824);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1828);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1830);
			block164=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier163!=null?Identifier163.getText():null), a, b, block164, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:258:1: repeatStatement returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier165=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block166 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:259:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:259:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1853); 
			match(input, Token.DOWN, null); 
			Identifier165=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1855); 
			pushFollow(FOLLOW_expression_in_repeatStatement1859);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1863);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:259:51: (c= expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Add||LA65_0==Bool||LA65_0==COLOR_CONSTANT||LA65_0==DOTPROPERTY||LA65_0==Divide||LA65_0==Equals||(LA65_0 >= GT && LA65_0 <= GTEquals)||LA65_0==HEIGHT_CONSTANT||LA65_0==In||LA65_0==LOOKUP||(LA65_0 >= LT && LA65_0 <= LTEquals)||LA65_0==Modulus||(LA65_0 >= Multiply && LA65_0 <= NEquals)||(LA65_0 >= Null && LA65_0 <= Number)||LA65_0==PI_CONSTANT||LA65_0==Pw||(LA65_0 >= Subtract && LA65_0 <= TERNARY)||LA65_0==UNARY_MIN||LA65_0==WIDTH_CONSTANT||(LA65_0 >= 166 && LA65_0 <= 167)) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:259:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1868);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement1872);
			block166=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier165!=null?Identifier165.getText():null), a, b, c, block166, currentScope);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:263:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression167 =null;
		BlockNode block168 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:264:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:264:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1895); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1897);
			expression167=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1899);
			block168=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression167, block168);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:267:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier169=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1926); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:16: ( Identifier )+
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:269:17: Identifier
					{
					Identifier169=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1929); 
					i.add((Identifier169!=null?Identifier169.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:272:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression170 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1959); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:17: ( expression )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Add||LA67_0==Bool||LA67_0==COLOR_CONSTANT||LA67_0==DOTPROPERTY||LA67_0==Divide||LA67_0==Equals||(LA67_0 >= GT && LA67_0 <= GTEquals)||LA67_0==HEIGHT_CONSTANT||LA67_0==In||LA67_0==LOOKUP||(LA67_0 >= LT && LA67_0 <= LTEquals)||LA67_0==Modulus||(LA67_0 >= Multiply && LA67_0 <= NEquals)||(LA67_0 >= Null && LA67_0 <= Number)||LA67_0==PI_CONSTANT||LA67_0==Pw||(LA67_0 >= Subtract && LA67_0 <= TERNARY)||LA67_0==UNARY_MIN||LA67_0==WIDTH_CONSTANT||(LA67_0 >= 166 && LA67_0 <= 167)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:274:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1962);
					expression170=expression();
					state._fsp--;

					e.add(expression170);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:278:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number171=null;
		CommonTree Bool172=null;
		CommonTree COLOR_CONSTANT174=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup173 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:279:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
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
			case 167:
				{
				alt68=3;
				}
				break;
			case 166:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:279:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1987); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1991);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1995);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1999);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:280:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression2010); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2014);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2018);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:281:6: ^( '||' a= expression b= expression )
					{
					match(input,167,FOLLOW_167_in_expression2047); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2051);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2055);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:282:6: ^( '&&' a= expression b= expression )
					{
					match(input,166,FOLLOW_166_in_expression2082); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2086);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2090);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:283:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression2117); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2121);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2125);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:284:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression2152); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2156);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2160);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:285:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression2187); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2191);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2195);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:286:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression2222); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2226);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2230);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:287:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression2257); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2261);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2265);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:288:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression2293); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2297);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2301);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:289:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression2329); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2333);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2337);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:290:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression2365); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2369);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2373);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:291:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression2401); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2405);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2409);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:292:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression2437); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2441);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2445);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:293:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression2473); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2477);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2481);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:294:6: ^( '^' a= expression b= expression )
					{
					match(input,Pw,FOLLOW_Pw_in_expression2509); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2513);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression2517);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:295:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2545); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2549);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:296:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2584); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2588);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:297:6: Number
					{
					Number171=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2625); 
					node = new AtomNode(Double.parseDouble((Number171!=null?Number171.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:298:6: Bool
					{
					Bool172=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2677); 
					node = new AtomNode(Boolean.parseBoolean((Bool172!=null?Bool172.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:299:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2731); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:300:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2785);
					lookup173=lookup();
					state._fsp--;

					node = lookup173;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:301:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT174=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2837); 
					node = new AtomNode((COLOR_CONSTANT174!=null?COLOR_CONSTANT174.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:302:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2856); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:303:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2902); 
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:304:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2947); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:307:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList175 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list3006); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:13: ( exprList )?
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==EXP_LIST) ) {
					alt69=1;
				}
				switch (alt69) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:308:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list3008);
						exprList175=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList175);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:313:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier178=null;
		CommonTree DOTPROPERTY179=null;
		CommonTree LOOKUP182=null;
		CommonTree LOOKUP184=null;
		CommonTree LOOKUP186=null;
		CommonTree Identifier187=null;
		CommonTree LOOKUP188=null;
		CommonTree String189=null;
		CommonTree LOOKUP190=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall176 =null;
		java.util.List<PropertyNode> dotProperty177 =null;
		java.util.List<PropertyNode> dotProperty180 =null;
		DCNode functionCall181 =null;
		DCNode list183 =null;
		DCNode expression185 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:314:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
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
					case 166:
					case 167:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:314:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3031); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3033);
					functionCall176=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup3035);
					dotProperty177=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall176, dotProperty177);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:315:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					DOTPROPERTY179=(CommonTree)match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup3043); 
					match(input, Token.DOWN, null); 
					Identifier178=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3045); 
					pushFollow(FOLLOW_dotProperty_in_lookup3047);
					dotProperty180=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier178!=null?Identifier178.getText():null), currentScope,DOTPROPERTY179.getLine()), dotProperty180);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					LOOKUP182=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3071); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup3073);
					functionCall181=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:28: (i= indexes )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==INDEXES) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:321:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3077);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall181, i,LOOKUP182.getLine()) : functionCall181;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:6: ^( LOOKUP list (i= indexes )? )
					{
					LOOKUP184=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3089); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup3091);
					list183=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:21: (i= indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==INDEXES) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:322:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3095);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list183, i, LOOKUP184.getLine()) : list183;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:323:6: ^( LOOKUP expression (i= indexes )? )
					{
					LOOKUP186=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3115); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup3117);
					expression185=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:323:27: (i= indexes )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==INDEXES) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:323:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3121);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression185, i,LOOKUP186.getLine()) : expression185;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:324:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					LOOKUP188=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3135); 
					match(input, Token.DOWN, null); 
					Identifier187=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup3137); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:324:27: (i= indexes )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==INDEXES) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:324:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3141);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier187!=null?Identifier187.getText():null), currentScope,LOOKUP188.getLine()), i,LOOKUP188.getLine()) : new IdentifierNode((Identifier187!=null?Identifier187.getText():null), currentScope,LOOKUP188.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:325:6: ^( LOOKUP String (i= indexes )? )
					{
					LOOKUP190=(CommonTree)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup3155); 
					match(input, Token.DOWN, null); 
					String189=(CommonTree)match(input,String,FOLLOW_String_in_lookup3157); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:325:23: (i= indexes )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==INDEXES) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:325:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3161);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String189!=null?String189.getText():null)), i,LOOKUP190.getLine()) : new AtomNode((String189!=null?String189.getText():null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:335:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression191 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes3210); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:16: ( expression )+
			int cnt76=0;
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==Add||LA76_0==Bool||LA76_0==COLOR_CONSTANT||LA76_0==DOTPROPERTY||LA76_0==Divide||LA76_0==Equals||(LA76_0 >= GT && LA76_0 <= GTEquals)||LA76_0==HEIGHT_CONSTANT||LA76_0==In||LA76_0==LOOKUP||(LA76_0 >= LT && LA76_0 <= LTEquals)||LA76_0==Modulus||(LA76_0 >= Multiply && LA76_0 <= NEquals)||(LA76_0 >= Null && LA76_0 <= Number)||LA76_0==PI_CONSTANT||LA76_0==Pw||(LA76_0 >= Subtract && LA76_0 <= TERNARY)||LA76_0==UNARY_MIN||LA76_0==WIDTH_CONSTANT||(LA76_0 >= 166 && LA76_0 <= 167)) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:337:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes3213);
					expression191=expression();
					state._fsp--;

					e.add(expression191);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:342:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression192 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty3251); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:12: ( dotExpression )+
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:344:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3254);
					dotExpression192=dotExpression();
					state._fsp--;

					e.add(dotExpression192);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:347:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:348:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:348:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression3282); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:349:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression3290); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:350:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression3298); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:351:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression3306); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:352:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression3314); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:353:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression3322); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:354:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression3330); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:355:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression3338); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:356:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression3346); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:357:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression3353); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsqueTreeWalker.g:358:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression3360); 
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
	public static final BitSet FOLLOW_statement_in_block102 = new BitSet(new long[]{0x0000200000000048L,0x0400000000000080L,0x0000001000000000L});
	public static final BitSet FOLLOW_RETURN_in_block110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment215 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment217 = new BitSet(new long[]{0x0003020420048108L,0x0010430720620908L,0x000000C241800000L});
	public static final BitSet FOLLOW_indexes_in_assignment219 = new BitSet(new long[]{0x0003020420048108L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_assignment222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall263 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall279 = new BitSet(new long[]{0x0003020420048108L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_functionCall281 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall296 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_functionCall298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall313 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall315 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_functionCall317 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall333 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_functionCall335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall353 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall355 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall368 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall370 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall462 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall464 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall480 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall482 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall497 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall499 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall515 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall533 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall549 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall551 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall565 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall581 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall596 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall598 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall600 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall629 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall647 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Heading_in_transformCall665 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall682 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall697 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall699 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall712 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall714 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall729 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall744 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall758 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall770 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall772 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall774 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall787 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall789 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall799 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Show_in_transformCall801 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall803 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall815 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall817 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall828 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall830 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall832 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall841 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall843 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall845 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall856 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall870 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall872 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall883 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall896 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall908 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall910 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall912 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall922 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall924 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall926 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall938 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall950 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Flatten_in_transformCall952 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_transformCall954 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Grid_in_patternCall988 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall990 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Wave_in_patternCall1004 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1006 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_patternCall1018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Arc_in_patternCall1020 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_patternCall1022 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1056 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall1070 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1072 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall1084 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1096 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall1098 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1100 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall1113 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Pow_in_mathCall1128 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1142 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1144 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1153 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sq_in_mathCall1155 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1168 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1170 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Noise_in_mathCall1183 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall1198 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall1212 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall1214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Inch_in_mathCall1227 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Mm_in_mathCall1240 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cm_in_mathCall1253 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1255 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall1264 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Units_in_mathCall1266 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_mathCall1268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1306 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1308 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1310 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1322 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1335 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1348 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1350 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1361 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1374 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1387 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1397 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1399 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1409 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1411 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1413 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1422 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_getCall1424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1434 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1448 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1450 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1462 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1475 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1477 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_uICall1507 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Slider_in_uICall1509 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_uICall1511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Template_in_templateCall1544 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall1559 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1572 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall1574 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1586 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall1588 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetName_in_templateCall1602 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1604 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1613 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetVFold_in_templateCall1615 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetHFold_in_templateCall1629 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SetCorner_in_templateCall1643 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TemplateCollection_in_templateCall1658 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_templateCall1672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AddDesign_in_templateCall1674 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_exprList_in_templateCall1676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1715 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1719 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1747 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_ifStat1749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1770 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1820 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_forStatement1824 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_forStatement1828 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_forStatement1830 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1855 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1859 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1863 = new BitSet(new long[]{0x000302042004C100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1868 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1872 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1897 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_whileStatement1899 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1929 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1959 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1962 = new BitSet(new long[]{0x0003020420048108L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_TERNARY_in_expression1987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1991 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression1995 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression1999 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression2010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2014 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2018 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_167_in_expression2047 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2051 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2055 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_166_in_expression2082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2086 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression2117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2121 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression2152 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2156 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2160 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression2187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2191 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression2222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2226 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression2257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2261 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression2293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2297 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2301 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression2329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2333 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression2365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2369 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression2401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2405 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression2437 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2441 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2445 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression2473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2477 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2481 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pw_in_expression2509 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2513 = new BitSet(new long[]{0x0003020420048100L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_expression_in_expression2517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2588 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list3006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list3008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3031 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3033 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup3043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3045 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3047 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3071 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup3073 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup3091 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3095 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup3117 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup3137 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup3155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup3157 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexes_in_lookup3161 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes3210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes3213 = new BitSet(new long[]{0x0003020420048108L,0x0010430720620808L,0x000000C241800000L});
	public static final BitSet FOLLOW_DOT_in_dotProperty3251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3254 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0007FF0000000000L});
	public static final BitSet FOLLOW_DotX_in_dotExpression3282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression3290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression3314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression3322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression3330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression3338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression3346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression3353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression3360 = new BitSet(new long[]{0x0000000000000002L});
}
