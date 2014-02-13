// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2014-02-13 17:26:11

  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.data.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PogoParser extends Parser {
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
		"STATEMENTS", "SUB_CALL", "Scale", "SetHeight", "SetName", "SetSeam", 
		"SetWidth", "Show", "Sine", "Size", "Skirt", "SkirtBack", "Slider", "Space", 
		"Spiral", "Sq", "Sqrt", "String", "Stroke", "Subtract", "TERNARY", "Tan", 
		"Template", "To", "Triangle", "UNARY_MIN", "Union", "Units", "WIDTH_CONSTANT", 
		"Wave", "Weight", "While", "Xor", "'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__167=167;
	public static final int T__168=168;
	public static final int T__169=169;
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
	public static final int SetHeight=137;
	public static final int SetName=138;
	public static final int SetSeam=139;
	public static final int SetWidth=140;
	public static final int Show=141;
	public static final int Sine=142;
	public static final int Size=143;
	public static final int Skirt=144;
	public static final int SkirtBack=145;
	public static final int Slider=146;
	public static final int Space=147;
	public static final int Spiral=148;
	public static final int Sq=149;
	public static final int Sqrt=150;
	public static final int String=151;
	public static final int Stroke=152;
	public static final int Subtract=153;
	public static final int TERNARY=154;
	public static final int Tan=155;
	public static final int Template=156;
	public static final int To=157;
	public static final int Triangle=158;
	public static final int UNARY_MIN=159;
	public static final int Union=160;
	public static final int Units=161;
	public static final int WIDTH_CONSTANT=162;
	public static final int Wave=163;
	public static final int Weight=164;
	public static final int While=165;
	public static final int Xor=166;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }


	  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
	  public DrawableManager drawableManager;
	  private int widthParam, heightParam;
	  
	  public PogoParser(CommonTokenStream tokens){
	  	super(tokens);

	  }
	  private void defineFunction(String id, Object idList, Object block) {

	    // `idList` is possibly null! Create an empty tree in that case. 
	    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

	    // `block` is never null.
	    CommonTree blockTree = (CommonTree)block;

	    // The function name with the number of parameters after it the unique key
	    String key = id + idListTree.getChildCount();
	    functions.put(key, new FunctionType(id, idListTree, blockTree));
	    System.out.println("defined function:"+id);
	  }


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:1: parse : block EOF -> block ;
	public final PogoParser.parse_return parse() throws RecognitionException {
		PogoParser.parse_return retval = new PogoParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:3: ( block EOF -> block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse188);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse190);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:16: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final PogoParser.block_return block() throws RecognitionException {
		PogoParser.block_return retval = new PogoParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope functionDecl4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ATan||(LA1_0 >= Arc && LA1_0 <= Assert)||(LA1_0 >= Clip && LA1_0 <= Cm)||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Difference||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= Gaussian && LA1_0 <= Group)||(LA1_0 >= Heading && LA1_0 <= Hide)||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==Inch||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= Mm)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= Noise)||(LA1_0 >= Point && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= Slider)||(LA1_0 >= Sq && LA1_0 <= Sqrt)||LA1_0==Stroke||(LA1_0 >= Tan && LA1_0 <= Template)||(LA1_0 >= Union && LA1_0 <= Units)||(LA1_0 >= Wave && LA1_0 <= Xor)||LA1_0==168) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:6: statement
					{
					pushFollow(FOLLOW_statement_in_block208);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block212);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block217);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block219);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,168,FOLLOW_168_in_block221);  
					stream_168.add(char_literal7);

					}
					break;

			}

			// AST REWRITE
			// elements: expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:51: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
	public final PogoParser.statement_return statement() throws RecognitionException {
		PogoParser.statement_return retval = new PogoParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope functionCall10 =null;
		ParserRuleReturnScope ifStatement12 =null;
		ParserRuleReturnScope forStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;
		ParserRuleReturnScope repeatStatement15 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket||LA3_1==168) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 168:
				{
				alt3=1;
				}
				break;
			case ATan:
			case Arc:
			case Assert:
			case Clip:
			case Cm:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
			case Flatten:
			case Gaussian:
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
			case Grid:
			case Group:
			case Heading:
			case Hide:
			case Inch:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Mm:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Noise:
			case Point:
			case Polygon:
			case Pow:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case SetHeight:
			case SetName:
			case SetSeam:
			case SetWidth:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Slider:
			case Sq:
			case Sqrt:
			case Stroke:
			case Tan:
			case Template:
			case Union:
			case Units:
			case Wave:
			case Weight:
			case Xor:
				{
				alt3=2;
				}
				break;
			case If:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement263);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,168,FOLLOW_168_in_statement265);  
					stream_168.add(char_literal9);

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement278);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,168,FOLLOW_168_in_statement280);  
					stream_168.add(char_literal11);

					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement292);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement299);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement306);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement313);
					repeatStatement15=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:1: assignment : ( Identifier ( indexes )? ( '=' expression )? -> ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) |);
	public final PogoParser.assignment_return assignment() throws RecognitionException {
		PogoParser.assignment_return retval = new PogoParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier16=null;
		Token char_literal18=null;
		ParserRuleReturnScope indexes17 =null;
		ParserRuleReturnScope expression19 =null;

		Object Identifier16_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:3: ( Identifier ( indexes )? ( '=' expression )? -> ^( ASSIGNMENT Identifier ( indexes )? ( expression )? ) |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Identifier) ) {
				alt6=1;
			}
			else if ( (LA6_0==168) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:6: Identifier ( indexes )? ( '=' expression )?
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment327);  
					stream_Identifier.add(Identifier16);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment329);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:26: ( '=' expression )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==Assign) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:27: '=' expression
							{
							char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment333);  
							stream_Assign.add(char_literal18);

							pushFollow(FOLLOW_expression_in_assignment335);
							expression19=expression();
							state._fsp--;

							stream_expression.add(expression19.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: expression, indexes, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:45: -> ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:48: ^( ASSIGNMENT Identifier ( indexes )? ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:72: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:81: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:3: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall );
	public final PogoParser.functionCall_return functionCall() throws RecognitionException {
		PogoParser.functionCall_return retval = new PogoParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		Token Println24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token Print28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token Assert32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token Size36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token LAdd40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		Token LRemove44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		ParserRuleReturnScope exprList22 =null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope exprList42 =null;
		ParserRuleReturnScope exprList46 =null;
		ParserRuleReturnScope primitiveCall48 =null;
		ParserRuleReturnScope transformCall49 =null;
		ParserRuleReturnScope patternCall50 =null;
		ParserRuleReturnScope mathCall51 =null;
		ParserRuleReturnScope getCall52 =null;
		ParserRuleReturnScope uICall53 =null;
		ParserRuleReturnScope templateCall54 =null;

		Object Identifier20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal23_tree=null;
		Object Println24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;
		Object Print28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object Assert32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object Size36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		Object LAdd40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object LRemove44_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_LRemove=new RewriteRuleTokenStream(adaptor,"token LRemove");
		RewriteRuleTokenStream stream_LAdd=new RewriteRuleTokenStream(adaptor,"token LAdd");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall | uICall | templateCall )
			int alt11=14;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt11=1;
				}
				break;
			case Println:
				{
				alt11=2;
				}
				break;
			case Print:
				{
				alt11=3;
				}
				break;
			case Assert:
				{
				alt11=4;
				}
				break;
			case Size:
				{
				alt11=5;
				}
				break;
			case LAdd:
				{
				alt11=6;
				}
				break;
			case LRemove:
				{
				alt11=7;
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
				alt11=8;
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
				alt11=9;
				}
				break;
			case Arc:
			case Grid:
			case Wave:
				{
				alt11=10;
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
				alt11=11;
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
				alt11=12;
				}
				break;
			case Slider:
				{
				alt11=13;
				}
				break;
			case SetHeight:
			case SetName:
			case SetSeam:
			case SetWidth:
			case Template:
				{
				alt11=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall371);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall373);  
					stream_OParen.add(char_literal21);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:21: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ATan||(LA7_0 >= Arc && LA7_0 <= Assert)||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Clip && LA7_0 <= Cm)||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Difference||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||(LA7_0 >= Fill && LA7_0 <= Flatten)||(LA7_0 >= Gaussian && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==Inch||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= Mm)||(LA7_0 >= Move && LA7_0 <= MoveBy)||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= Slider)||(LA7_0 >= Sq && LA7_0 <= Subtract)||(LA7_0 >= Tan && LA7_0 <= Template)||(LA7_0 >= Union && LA7_0 <= Weight)||LA7_0==Xor) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall375);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall378);  
					stream_CParen.add(char_literal23);

					// AST REWRITE
					// elements: Identifier, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:61: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall396);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall398);  
					stream_OParen.add(char_literal25);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:18: ( expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ATan||(LA8_0 >= Arc && LA8_0 <= Assert)||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Clip && LA8_0 <= Cm)||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Difference||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||(LA8_0 >= Fill && LA8_0 <= Flatten)||(LA8_0 >= Gaussian && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==Inch||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= Mm)||(LA8_0 >= Move && LA8_0 <= MoveBy)||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= Slider)||(LA8_0 >= Sq && LA8_0 <= Subtract)||(LA8_0 >= Tan && LA8_0 <= Template)||(LA8_0 >= Union && LA8_0 <= Weight)||LA8_0==Xor) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall400);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall403);  
					stream_CParen.add(char_literal27);

					// AST REWRITE
					// elements: expression, Println
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 101:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:58: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall422);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall424);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall426);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall428);  
					stream_CParen.add(char_literal31);

					// AST REWRITE
					// elements: Print, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:38: ^( FUNC_CALL Print expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Print.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall449);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall451);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall453);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall455);  
					stream_CParen.add(char_literal35);

					// AST REWRITE
					// elements: expression, Assert
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:38: ^( FUNC_CALL Assert expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Assert.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall475);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall477);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall479);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall481);  
					stream_CParen.add(char_literal39);

					// AST REWRITE
					// elements: Size, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:38: ^( FUNC_CALL Size expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Size.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: LAdd '(' ( exprList )? ')'
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall503);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall505);  
					stream_OParen.add(char_literal41);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:15: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ATan||(LA9_0 >= Arc && LA9_0 <= Assert)||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Clip && LA9_0 <= Cm)||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Difference||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||(LA9_0 >= Fill && LA9_0 <= Flatten)||(LA9_0 >= Gaussian && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==Inch||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= Mm)||(LA9_0 >= Move && LA9_0 <= MoveBy)||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= Slider)||(LA9_0 >= Sq && LA9_0 <= Subtract)||(LA9_0 >= Tan && LA9_0 <= Template)||(LA9_0 >= Union && LA9_0 <= Weight)||LA9_0==Xor) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall507);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall510);  
					stream_CParen.add(char_literal43);

					// AST REWRITE
					// elements: exprList, LAdd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:34: ^( FUNC_CALL LAdd ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:6: LRemove '(' ( exprList )? ')'
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall531);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall533);  
					stream_OParen.add(char_literal45);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:18: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ATan||(LA10_0 >= Arc && LA10_0 <= Assert)||LA10_0==Bool||LA10_0==COLOR_CONSTANT||(LA10_0 >= Clip && LA10_0 <= Cm)||(LA10_0 >= Copy && LA10_0 <= Curve)||LA10_0==Difference||LA10_0==Ellipse||(LA10_0 >= Excl && LA10_0 <= Expand)||(LA10_0 >= Fill && LA10_0 <= Flatten)||(LA10_0 >= Gaussian && LA10_0 <= Hide)||LA10_0==Identifier||LA10_0==Inch||LA10_0==LAdd||(LA10_0 >= LRemove && LA10_0 <= LShape)||(LA10_0 >= Line && LA10_0 <= Mm)||(LA10_0 >= Move && LA10_0 <= MoveBy)||(LA10_0 >= NoFill && LA10_0 <= Number)||(LA10_0 >= OBracket && LA10_0 <= OParen)||(LA10_0 >= PI_CONSTANT && LA10_0 <= Println)||(LA10_0 >= Random && LA10_0 <= Rect)||(LA10_0 >= Rotate && LA10_0 <= Round)||(LA10_0 >= Scale && LA10_0 <= Slider)||(LA10_0 >= Sq && LA10_0 <= Subtract)||(LA10_0 >= Tan && LA10_0 <= Template)||(LA10_0 >= Union && LA10_0 <= Weight)||LA10_0==Xor) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall535);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall538);  
					stream_CParen.add(char_literal47);

					// AST REWRITE
					// elements: exprList, LRemove
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:37: ^( FUNC_CALL LRemove ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:57: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall559);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall566);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:6: patternCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternCall_in_functionCall573);
					patternCall50=patternCall();
					state._fsp--;

					adaptor.addChild(root_0, patternCall50.getTree());

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall580);
					mathCall51=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall51.getTree());

					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:5: getCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_getCall_in_functionCall586);
					getCall52=getCall();
					state._fsp--;

					adaptor.addChild(root_0, getCall52.getTree());

					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:5: uICall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_uICall_in_functionCall592);
					uICall53=uICall();
					state._fsp--;

					adaptor.addChild(root_0, uICall53.getTree());

					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:5: templateCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_templateCall_in_functionCall598);
					templateCall54=templateCall();
					state._fsp--;

					adaptor.addChild(root_0, templateCall54.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class primitiveCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token Line59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token Rect63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token Curve67=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token Polygon71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token Skirt75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token SkirtBack79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token LShape83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token Point87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope exprList57 =null;
		ParserRuleReturnScope exprList61 =null;
		ParserRuleReturnScope exprList65 =null;
		ParserRuleReturnScope exprList69 =null;
		ParserRuleReturnScope exprList73 =null;
		ParserRuleReturnScope exprList77 =null;
		ParserRuleReturnScope exprList81 =null;
		ParserRuleReturnScope exprList85 =null;
		ParserRuleReturnScope exprList89 =null;

		Object Ellipse55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object Line59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object Rect63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object Curve67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object Polygon71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object Skirt75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object SkirtBack79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object LShape83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object Point87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_LShape=new RewriteRuleTokenStream(adaptor,"token LShape");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_SkirtBack=new RewriteRuleTokenStream(adaptor,"token SkirtBack");
		RewriteRuleTokenStream stream_Skirt=new RewriteRuleTokenStream(adaptor,"token Skirt");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleTokenStream stream_Point=new RewriteRuleTokenStream(adaptor,"token Point");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
			int alt21=9;
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt21=1;
				}
				break;
			case Line:
				{
				alt21=2;
				}
				break;
			case Rect:
				{
				alt21=3;
				}
				break;
			case Curve:
				{
				alt21=4;
				}
				break;
			case Polygon:
				{
				alt21=5;
				}
				break;
			case Skirt:
				{
				alt21=6;
				}
				break;
			case SkirtBack:
				{
				alt21=7;
				}
				break;
			case LShape:
				{
				alt21=8;
				}
				break;
			case Point:
				{
				alt21=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse55=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall618);  
					stream_Ellipse.add(Ellipse55);

					char_literal56=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall620);  
					stream_OParen.add(char_literal56);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||(LA12_0 >= Arc && LA12_0 <= Assert)||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Clip && LA12_0 <= Cm)||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Difference||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||(LA12_0 >= Fill && LA12_0 <= Flatten)||(LA12_0 >= Gaussian && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==Inch||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= Mm)||(LA12_0 >= Move && LA12_0 <= MoveBy)||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= Slider)||(LA12_0 >= Sq && LA12_0 <= Subtract)||(LA12_0 >= Tan && LA12_0 <= Template)||(LA12_0 >= Union && LA12_0 <= Weight)||LA12_0==Xor) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall622);
							exprList57=exprList();
							state._fsp--;

							stream_exprList.add(exprList57.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall625);  
					stream_CParen.add(char_literal58);

					// AST REWRITE
					// elements: Ellipse, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:56: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:5: Line '(' ( exprList )? ')'
					{
					Line59=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall645);  
					stream_Line.add(Line59);

					char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall647);  
					stream_OParen.add(char_literal60);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||(LA13_0 >= Arc && LA13_0 <= Assert)||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Clip && LA13_0 <= Cm)||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Difference||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||(LA13_0 >= Fill && LA13_0 <= Flatten)||(LA13_0 >= Gaussian && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==Inch||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= Mm)||(LA13_0 >= Move && LA13_0 <= MoveBy)||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= Slider)||(LA13_0 >= Sq && LA13_0 <= Subtract)||(LA13_0 >= Tan && LA13_0 <= Template)||(LA13_0 >= Union && LA13_0 <= Weight)||LA13_0==Xor) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall649);
							exprList61=exprList();
							state._fsp--;

							stream_exprList.add(exprList61.getTree());
							}
							break;

					}

					char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall652);  
					stream_CParen.add(char_literal62);

					// AST REWRITE
					// elements: Line, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:5: Rect '(' ( exprList )? ')'
					{
					Rect63=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall672);  
					stream_Rect.add(Rect63);

					char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall674);  
					stream_OParen.add(char_literal64);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:14: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||(LA14_0 >= Arc && LA14_0 <= Assert)||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Clip && LA14_0 <= Cm)||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Difference||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||(LA14_0 >= Fill && LA14_0 <= Flatten)||(LA14_0 >= Gaussian && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==Inch||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= Mm)||(LA14_0 >= Move && LA14_0 <= MoveBy)||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= Slider)||(LA14_0 >= Sq && LA14_0 <= Subtract)||(LA14_0 >= Tan && LA14_0 <= Template)||(LA14_0 >= Union && LA14_0 <= Weight)||LA14_0==Xor) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall676);
							exprList65=exprList();
							state._fsp--;

							stream_exprList.add(exprList65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall679);  
					stream_CParen.add(char_literal66);

					// AST REWRITE
					// elements: Rect, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:5: Curve '(' ( exprList )? ')'
					{
					Curve67=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall699);  
					stream_Curve.add(Curve67);

					char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall701);  
					stream_OParen.add(char_literal68);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||(LA15_0 >= Arc && LA15_0 <= Assert)||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Clip && LA15_0 <= Cm)||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Difference||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||(LA15_0 >= Fill && LA15_0 <= Flatten)||(LA15_0 >= Gaussian && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==Inch||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= Mm)||(LA15_0 >= Move && LA15_0 <= MoveBy)||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= Slider)||(LA15_0 >= Sq && LA15_0 <= Subtract)||(LA15_0 >= Tan && LA15_0 <= Template)||(LA15_0 >= Union && LA15_0 <= Weight)||LA15_0==Xor) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall703);
							exprList69=exprList();
							state._fsp--;

							stream_exprList.add(exprList69.getTree());
							}
							break;

					}

					char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall706);  
					stream_CParen.add(char_literal70);

					// AST REWRITE
					// elements: exprList, Curve
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:5: Polygon '(' ( exprList )? ')'
					{
					Polygon71=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall724);  
					stream_Polygon.add(Polygon71);

					char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall726);  
					stream_OParen.add(char_literal72);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||(LA16_0 >= Arc && LA16_0 <= Assert)||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Clip && LA16_0 <= Cm)||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Difference||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||(LA16_0 >= Fill && LA16_0 <= Flatten)||(LA16_0 >= Gaussian && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==Inch||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= Mm)||(LA16_0 >= Move && LA16_0 <= MoveBy)||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= Slider)||(LA16_0 >= Sq && LA16_0 <= Subtract)||(LA16_0 >= Tan && LA16_0 <= Template)||(LA16_0 >= Union && LA16_0 <= Weight)||LA16_0==Xor) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall728);
							exprList73=exprList();
							state._fsp--;

							stream_exprList.add(exprList73.getTree());
							}
							break;

					}

					char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall731);  
					stream_CParen.add(char_literal74);

					// AST REWRITE
					// elements: exprList, Polygon
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:55: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:5: Skirt '(' ( exprList )? ')'
					{
					Skirt75=(Token)match(input,Skirt,FOLLOW_Skirt_in_primitiveCall749);  
					stream_Skirt.add(Skirt75);

					char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall751);  
					stream_OParen.add(char_literal76);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||(LA17_0 >= Arc && LA17_0 <= Assert)||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Clip && LA17_0 <= Cm)||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Difference||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||(LA17_0 >= Fill && LA17_0 <= Flatten)||(LA17_0 >= Gaussian && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==Inch||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= Mm)||(LA17_0 >= Move && LA17_0 <= MoveBy)||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= Slider)||(LA17_0 >= Sq && LA17_0 <= Subtract)||(LA17_0 >= Tan && LA17_0 <= Template)||(LA17_0 >= Union && LA17_0 <= Weight)||LA17_0==Xor) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall753);
							exprList77=exprList();
							state._fsp--;

							stream_exprList.add(exprList77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall756);  
					stream_CParen.add(char_literal78);

					// AST REWRITE
					// elements: exprList, Skirt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:29: -> ^( FUNC_CALL Skirt ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:33: ^( FUNC_CALL Skirt ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Skirt.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:5: SkirtBack '(' ( exprList )? ')'
					{
					SkirtBack79=(Token)match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall774);  
					stream_SkirtBack.add(SkirtBack79);

					char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall776);  
					stream_OParen.add(char_literal80);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:19: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ATan||(LA18_0 >= Arc && LA18_0 <= Assert)||LA18_0==Bool||LA18_0==COLOR_CONSTANT||(LA18_0 >= Clip && LA18_0 <= Cm)||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Difference||LA18_0==Ellipse||(LA18_0 >= Excl && LA18_0 <= Expand)||(LA18_0 >= Fill && LA18_0 <= Flatten)||(LA18_0 >= Gaussian && LA18_0 <= Hide)||LA18_0==Identifier||LA18_0==Inch||LA18_0==LAdd||(LA18_0 >= LRemove && LA18_0 <= LShape)||(LA18_0 >= Line && LA18_0 <= Mm)||(LA18_0 >= Move && LA18_0 <= MoveBy)||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||(LA18_0 >= PI_CONSTANT && LA18_0 <= Println)||(LA18_0 >= Random && LA18_0 <= Rect)||(LA18_0 >= Rotate && LA18_0 <= Round)||(LA18_0 >= Scale && LA18_0 <= Slider)||(LA18_0 >= Sq && LA18_0 <= Subtract)||(LA18_0 >= Tan && LA18_0 <= Template)||(LA18_0 >= Union && LA18_0 <= Weight)||LA18_0==Xor) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall778);
							exprList81=exprList();
							state._fsp--;

							stream_exprList.add(exprList81.getTree());
							}
							break;

					}

					char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall781);  
					stream_CParen.add(char_literal82);

					// AST REWRITE
					// elements: exprList, SkirtBack
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:33: -> ^( FUNC_CALL SkirtBack ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:37: ^( FUNC_CALL SkirtBack ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SkirtBack.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:59: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:6: LShape '(' ( exprList )? ')'
					{
					LShape83=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall800);  
					stream_LShape.add(LShape83);

					char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall802);  
					stream_OParen.add(char_literal84);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||(LA19_0 >= Arc && LA19_0 <= Assert)||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Clip && LA19_0 <= Cm)||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Difference||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||(LA19_0 >= Fill && LA19_0 <= Flatten)||(LA19_0 >= Gaussian && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==Inch||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= Mm)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= Slider)||(LA19_0 >= Sq && LA19_0 <= Subtract)||(LA19_0 >= Tan && LA19_0 <= Template)||(LA19_0 >= Union && LA19_0 <= Weight)||LA19_0==Xor) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall804);
							exprList85=exprList();
							state._fsp--;

							stream_exprList.add(exprList85.getTree());
							}
							break;

					}

					char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall807);  
					stream_CParen.add(char_literal86);

					// AST REWRITE
					// elements: exprList, LShape
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:31: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:35: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:54: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:7: Point '(' ( exprList )? ')'
					{
					Point87=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall827);  
					stream_Point.add(Point87);

					char_literal88=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall829);  
					stream_OParen.add(char_literal88);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ATan||(LA20_0 >= Arc && LA20_0 <= Assert)||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Clip && LA20_0 <= Cm)||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Difference||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||(LA20_0 >= Fill && LA20_0 <= Flatten)||(LA20_0 >= Gaussian && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==Inch||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= Mm)||(LA20_0 >= Move && LA20_0 <= MoveBy)||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Println)||(LA20_0 >= Random && LA20_0 <= Rect)||(LA20_0 >= Rotate && LA20_0 <= Round)||(LA20_0 >= Scale && LA20_0 <= Slider)||(LA20_0 >= Sq && LA20_0 <= Subtract)||(LA20_0 >= Tan && LA20_0 <= Template)||(LA20_0 >= Union && LA20_0 <= Weight)||LA20_0==Xor) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall831);
							exprList89=exprList();
							state._fsp--;

							stream_exprList.add(exprList89.getTree());
							}
							break;

					}

					char_literal90=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall834);  
					stream_CParen.add(char_literal90);

					// AST REWRITE
					// elements: Point, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:31: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:35: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:53: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitiveCall"


	public static class transformCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "transformCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Heading '(' ( exprList )? ')' -> ^( FUNC_CALL Heading ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Show '(' expression ')' -> ^( FUNC_CALL Show expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) | Flatten '(' expression ')' -> ^( FUNC_CALL Flatten expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token MoveBy95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token Heading99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token Copy103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token Rotate107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		Token Fill111=null;
		Token char_literal112=null;
		Token char_literal114=null;
		Token Stroke115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		Token NoFill119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token NoStroke123=null;
		Token char_literal124=null;
		Token char_literal126=null;
		Token Weight127=null;
		Token char_literal128=null;
		Token char_literal130=null;
		Token Hide131=null;
		Token char_literal132=null;
		Token char_literal134=null;
		Token Show135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		Token Group139=null;
		Token char_literal140=null;
		Token char_literal142=null;
		Token Expand143=null;
		Token char_literal144=null;
		Token char_literal146=null;
		Token Merge147=null;
		Token char_literal148=null;
		Token char_literal150=null;
		Token Scale151=null;
		Token char_literal152=null;
		Token char_literal154=null;
		Token MirrorX155=null;
		Token char_literal156=null;
		Token char_literal158=null;
		Token MirrorY159=null;
		Token char_literal160=null;
		Token char_literal162=null;
		Token Union163=null;
		Token char_literal164=null;
		Token char_literal166=null;
		Token Difference167=null;
		Token char_literal168=null;
		Token char_literal170=null;
		Token Clip171=null;
		Token char_literal172=null;
		Token char_literal174=null;
		Token Xor175=null;
		Token char_literal176=null;
		Token char_literal178=null;
		Token Flatten179=null;
		Token char_literal180=null;
		Token char_literal182=null;
		ParserRuleReturnScope exprList93 =null;
		ParserRuleReturnScope exprList97 =null;
		ParserRuleReturnScope exprList101 =null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope exprList109 =null;
		ParserRuleReturnScope exprList113 =null;
		ParserRuleReturnScope exprList117 =null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope exprList129 =null;
		ParserRuleReturnScope expression133 =null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope exprList141 =null;
		ParserRuleReturnScope expression145 =null;
		ParserRuleReturnScope expression149 =null;
		ParserRuleReturnScope exprList153 =null;
		ParserRuleReturnScope expression157 =null;
		ParserRuleReturnScope expression161 =null;
		ParserRuleReturnScope exprList165 =null;
		ParserRuleReturnScope exprList169 =null;
		ParserRuleReturnScope exprList173 =null;
		ParserRuleReturnScope exprList177 =null;
		ParserRuleReturnScope expression181 =null;

		Object Move91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object MoveBy95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object Heading99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object Copy103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object Rotate107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		Object Fill111_tree=null;
		Object char_literal112_tree=null;
		Object char_literal114_tree=null;
		Object Stroke115_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		Object NoFill119_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object NoStroke123_tree=null;
		Object char_literal124_tree=null;
		Object char_literal126_tree=null;
		Object Weight127_tree=null;
		Object char_literal128_tree=null;
		Object char_literal130_tree=null;
		Object Hide131_tree=null;
		Object char_literal132_tree=null;
		Object char_literal134_tree=null;
		Object Show135_tree=null;
		Object char_literal136_tree=null;
		Object char_literal138_tree=null;
		Object Group139_tree=null;
		Object char_literal140_tree=null;
		Object char_literal142_tree=null;
		Object Expand143_tree=null;
		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		Object Merge147_tree=null;
		Object char_literal148_tree=null;
		Object char_literal150_tree=null;
		Object Scale151_tree=null;
		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		Object MirrorX155_tree=null;
		Object char_literal156_tree=null;
		Object char_literal158_tree=null;
		Object MirrorY159_tree=null;
		Object char_literal160_tree=null;
		Object char_literal162_tree=null;
		Object Union163_tree=null;
		Object char_literal164_tree=null;
		Object char_literal166_tree=null;
		Object Difference167_tree=null;
		Object char_literal168_tree=null;
		Object char_literal170_tree=null;
		Object Clip171_tree=null;
		Object char_literal172_tree=null;
		Object char_literal174_tree=null;
		Object Xor175_tree=null;
		Object char_literal176_tree=null;
		Object char_literal178_tree=null;
		Object Flatten179_tree=null;
		Object char_literal180_tree=null;
		Object char_literal182_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Clip=new RewriteRuleTokenStream(adaptor,"token Clip");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Merge=new RewriteRuleTokenStream(adaptor,"token Merge");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Scale=new RewriteRuleTokenStream(adaptor,"token Scale");
		RewriteRuleTokenStream stream_Xor=new RewriteRuleTokenStream(adaptor,"token Xor");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_Show=new RewriteRuleTokenStream(adaptor,"token Show");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_Union=new RewriteRuleTokenStream(adaptor,"token Union");
		RewriteRuleTokenStream stream_Flatten=new RewriteRuleTokenStream(adaptor,"token Flatten");
		RewriteRuleTokenStream stream_MoveBy=new RewriteRuleTokenStream(adaptor,"token MoveBy");
		RewriteRuleTokenStream stream_MirrorY=new RewriteRuleTokenStream(adaptor,"token MirrorY");
		RewriteRuleTokenStream stream_MirrorX=new RewriteRuleTokenStream(adaptor,"token MirrorX");
		RewriteRuleTokenStream stream_Difference=new RewriteRuleTokenStream(adaptor,"token Difference");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Heading '(' ( exprList )? ')' -> ^( FUNC_CALL Heading ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Show '(' expression ')' -> ^( FUNC_CALL Show expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) | Flatten '(' expression ')' -> ^( FUNC_CALL Flatten expression ) )
			int alt35=23;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt35=1;
				}
				break;
			case MoveBy:
				{
				alt35=2;
				}
				break;
			case Heading:
				{
				alt35=3;
				}
				break;
			case Copy:
				{
				alt35=4;
				}
				break;
			case Rotate:
				{
				alt35=5;
				}
				break;
			case Fill:
				{
				alt35=6;
				}
				break;
			case Stroke:
				{
				alt35=7;
				}
				break;
			case NoFill:
				{
				alt35=8;
				}
				break;
			case NoStroke:
				{
				alt35=9;
				}
				break;
			case Weight:
				{
				alt35=10;
				}
				break;
			case Hide:
				{
				alt35=11;
				}
				break;
			case Show:
				{
				alt35=12;
				}
				break;
			case Group:
				{
				alt35=13;
				}
				break;
			case Expand:
				{
				alt35=14;
				}
				break;
			case Merge:
				{
				alt35=15;
				}
				break;
			case Scale:
				{
				alt35=16;
				}
				break;
			case MirrorX:
				{
				alt35=17;
				}
				break;
			case MirrorY:
				{
				alt35=18;
				}
				break;
			case Union:
				{
				alt35=19;
				}
				break;
			case Difference:
				{
				alt35=20;
				}
				break;
			case Clip:
				{
				alt35=21;
				}
				break;
			case Xor:
				{
				alt35=22;
				}
				break;
			case Flatten:
				{
				alt35=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Move '(' ( exprList )? ')'
					{
					Move91=(Token)match(input,Move,FOLLOW_Move_in_transformCall865);  
					stream_Move.add(Move91);

					char_literal92=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall867);  
					stream_OParen.add(char_literal92);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:15: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||(LA22_0 >= Arc && LA22_0 <= Assert)||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Clip && LA22_0 <= Cm)||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Difference||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||(LA22_0 >= Fill && LA22_0 <= Flatten)||(LA22_0 >= Gaussian && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==Inch||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= Mm)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= Slider)||(LA22_0 >= Sq && LA22_0 <= Subtract)||(LA22_0 >= Tan && LA22_0 <= Template)||(LA22_0 >= Union && LA22_0 <= Weight)||LA22_0==Xor) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall869);
							exprList93=exprList();
							state._fsp--;

							stream_exprList.add(exprList93.getTree());
							}
							break;

					}

					char_literal94=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall872);  
					stream_CParen.add(char_literal94);

					// AST REWRITE
					// elements: Move, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:49: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy95=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall890);  
					stream_MoveBy.add(MoveBy95);

					char_literal96=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall892);  
					stream_OParen.add(char_literal96);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||(LA23_0 >= Arc && LA23_0 <= Assert)||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Clip && LA23_0 <= Cm)||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Difference||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||(LA23_0 >= Fill && LA23_0 <= Flatten)||(LA23_0 >= Gaussian && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==Inch||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= Mm)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= Slider)||(LA23_0 >= Sq && LA23_0 <= Subtract)||(LA23_0 >= Tan && LA23_0 <= Template)||(LA23_0 >= Union && LA23_0 <= Weight)||LA23_0==Xor) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall894);
							exprList97=exprList();
							state._fsp--;

							stream_exprList.add(exprList97.getTree());
							}
							break;

					}

					char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall897);  
					stream_CParen.add(char_literal98);

					// AST REWRITE
					// elements: exprList, MoveBy
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:34: ^( FUNC_CALL MoveBy ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MoveBy.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:53: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Heading '(' ( exprList )? ')'
					{
					Heading99=(Token)match(input,Heading,FOLLOW_Heading_in_transformCall916);  
					stream_Heading.add(Heading99);

					char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall918);  
					stream_OParen.add(char_literal100);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:18: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||(LA24_0 >= Arc && LA24_0 <= Assert)||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Clip && LA24_0 <= Cm)||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Difference||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||(LA24_0 >= Fill && LA24_0 <= Flatten)||(LA24_0 >= Gaussian && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==Inch||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= Mm)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= Slider)||(LA24_0 >= Sq && LA24_0 <= Subtract)||(LA24_0 >= Tan && LA24_0 <= Template)||(LA24_0 >= Union && LA24_0 <= Weight)||LA24_0==Xor) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall920);
							exprList101=exprList();
							state._fsp--;

							stream_exprList.add(exprList101.getTree());
							}
							break;

					}

					char_literal102=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall923);  
					stream_CParen.add(char_literal102);

					// AST REWRITE
					// elements: exprList, Heading
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:32: -> ^( FUNC_CALL Heading ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:35: ^( FUNC_CALL Heading ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Heading.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:55: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: Copy '(' expression ')'
					{
					Copy103=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall942);  
					stream_Copy.add(Copy103);

					char_literal104=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall944);  
					stream_OParen.add(char_literal104);

					pushFollow(FOLLOW_expression_in_transformCall946);
					expression105=expression();
					state._fsp--;

					stream_expression.add(expression105.getTree());
					char_literal106=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall948);  
					stream_CParen.add(char_literal106);

					// AST REWRITE
					// elements: expression, Copy
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:33: ^( FUNC_CALL Copy expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Copy.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Rotate '(' ( exprList )? ')'
					{
					Rotate107=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall965);  
					stream_Rotate.add(Rotate107);

					char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall967);  
					stream_OParen.add(char_literal108);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:17: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||(LA25_0 >= Arc && LA25_0 <= Assert)||LA25_0==Bool||LA25_0==COLOR_CONSTANT||(LA25_0 >= Clip && LA25_0 <= Cm)||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Difference||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||(LA25_0 >= Fill && LA25_0 <= Flatten)||(LA25_0 >= Gaussian && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==Inch||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= Mm)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= Slider)||(LA25_0 >= Sq && LA25_0 <= Subtract)||(LA25_0 >= Tan && LA25_0 <= Template)||(LA25_0 >= Union && LA25_0 <= Weight)||LA25_0==Xor) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall969);
							exprList109=exprList();
							state._fsp--;

							stream_exprList.add(exprList109.getTree());
							}
							break;

					}

					char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall972);  
					stream_CParen.add(char_literal110);

					// AST REWRITE
					// elements: Rotate, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: Fill '(' ( exprList )? ')'
					{
					Fill111=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall989);  
					stream_Fill.add(Fill111);

					char_literal112=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall991);  
					stream_OParen.add(char_literal112);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:15: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||(LA26_0 >= Arc && LA26_0 <= Assert)||LA26_0==Bool||LA26_0==COLOR_CONSTANT||(LA26_0 >= Clip && LA26_0 <= Cm)||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Difference||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||(LA26_0 >= Fill && LA26_0 <= Flatten)||(LA26_0 >= Gaussian && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==Inch||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= Mm)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= Slider)||(LA26_0 >= Sq && LA26_0 <= Subtract)||(LA26_0 >= Tan && LA26_0 <= Template)||(LA26_0 >= Union && LA26_0 <= Weight)||LA26_0==Xor) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall993);
							exprList113=exprList();
							state._fsp--;

							stream_exprList.add(exprList113.getTree());
							}
							break;

					}

					char_literal114=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall996);  
					stream_CParen.add(char_literal114);

					// AST REWRITE
					// elements: exprList, Fill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:48: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: Stroke '(' ( exprList )? ')'
					{
					Stroke115=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall1013);  
					stream_Stroke.add(Stroke115);

					char_literal116=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1015);  
					stream_OParen.add(char_literal116);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:17: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||(LA27_0 >= Arc && LA27_0 <= Assert)||LA27_0==Bool||LA27_0==COLOR_CONSTANT||(LA27_0 >= Clip && LA27_0 <= Cm)||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Difference||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||(LA27_0 >= Fill && LA27_0 <= Flatten)||(LA27_0 >= Gaussian && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==Inch||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= Mm)||(LA27_0 >= Move && LA27_0 <= MoveBy)||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= Slider)||(LA27_0 >= Sq && LA27_0 <= Subtract)||(LA27_0 >= Tan && LA27_0 <= Template)||(LA27_0 >= Union && LA27_0 <= Weight)||LA27_0==Xor) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1017);
							exprList117=exprList();
							state._fsp--;

							stream_exprList.add(exprList117.getTree());
							}
							break;

					}

					char_literal118=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1020);  
					stream_CParen.add(char_literal118);

					// AST REWRITE
					// elements: Stroke, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:6: NoFill '(' expression ')'
					{
					NoFill119=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall1037);  
					stream_NoFill.add(NoFill119);

					char_literal120=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1039);  
					stream_OParen.add(char_literal120);

					pushFollow(FOLLOW_expression_in_transformCall1041);
					expression121=expression();
					state._fsp--;

					stream_expression.add(expression121.getTree());
					char_literal122=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1043);  
					stream_CParen.add(char_literal122);

					// AST REWRITE
					// elements: expression, NoFill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:34: ^( FUNC_CALL NoFill expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoFill.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: NoStroke '(' expression ')'
					{
					NoStroke123=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall1059);  
					stream_NoStroke.add(NoStroke123);

					char_literal124=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1061);  
					stream_OParen.add(char_literal124);

					pushFollow(FOLLOW_expression_in_transformCall1063);
					expression125=expression();
					state._fsp--;

					stream_expression.add(expression125.getTree());
					char_literal126=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1065);  
					stream_CParen.add(char_literal126);

					// AST REWRITE
					// elements: NoStroke, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:36: ^( FUNC_CALL NoStroke expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoStroke.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:6: Weight '(' ( exprList )? ')'
					{
					Weight127=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall1081);  
					stream_Weight.add(Weight127);

					char_literal128=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1083);  
					stream_OParen.add(char_literal128);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:17: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||(LA28_0 >= Arc && LA28_0 <= Assert)||LA28_0==Bool||LA28_0==COLOR_CONSTANT||(LA28_0 >= Clip && LA28_0 <= Cm)||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Difference||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||(LA28_0 >= Fill && LA28_0 <= Flatten)||(LA28_0 >= Gaussian && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==Inch||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= Mm)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= Slider)||(LA28_0 >= Sq && LA28_0 <= Subtract)||(LA28_0 >= Tan && LA28_0 <= Template)||(LA28_0 >= Union && LA28_0 <= Weight)||LA28_0==Xor) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1085);
							exprList129=exprList();
							state._fsp--;

							stream_exprList.add(exprList129.getTree());
							}
							break;

					}

					char_literal130=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1088);  
					stream_CParen.add(char_literal130);

					// AST REWRITE
					// elements: Weight, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: Hide '(' expression ')'
					{
					Hide131=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall1105);  
					stream_Hide.add(Hide131);

					char_literal132=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1107);  
					stream_OParen.add(char_literal132);

					pushFollow(FOLLOW_expression_in_transformCall1109);
					expression133=expression();
					state._fsp--;

					stream_expression.add(expression133.getTree());
					char_literal134=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1111);  
					stream_CParen.add(char_literal134);

					// AST REWRITE
					// elements: expression, Hide
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:32: ^( FUNC_CALL Hide expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Hide.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:6: Show '(' expression ')'
					{
					Show135=(Token)match(input,Show,FOLLOW_Show_in_transformCall1127);  
					stream_Show.add(Show135);

					char_literal136=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1129);  
					stream_OParen.add(char_literal136);

					pushFollow(FOLLOW_expression_in_transformCall1131);
					expression137=expression();
					state._fsp--;

					stream_expression.add(expression137.getTree());
					char_literal138=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1133);  
					stream_CParen.add(char_literal138);

					// AST REWRITE
					// elements: Show, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 141:29: -> ^( FUNC_CALL Show expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:32: ^( FUNC_CALL Show expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Show.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Group '(' ( exprList )? ')'
					{
					Group139=(Token)match(input,Group,FOLLOW_Group_in_transformCall1149);  
					stream_Group.add(Group139);

					char_literal140=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1151);  
					stream_OParen.add(char_literal140);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:16: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ATan||(LA29_0 >= Arc && LA29_0 <= Assert)||LA29_0==Bool||LA29_0==COLOR_CONSTANT||(LA29_0 >= Clip && LA29_0 <= Cm)||(LA29_0 >= Copy && LA29_0 <= Curve)||LA29_0==Difference||LA29_0==Ellipse||(LA29_0 >= Excl && LA29_0 <= Expand)||(LA29_0 >= Fill && LA29_0 <= Flatten)||(LA29_0 >= Gaussian && LA29_0 <= Hide)||LA29_0==Identifier||LA29_0==Inch||LA29_0==LAdd||(LA29_0 >= LRemove && LA29_0 <= LShape)||(LA29_0 >= Line && LA29_0 <= Mm)||(LA29_0 >= Move && LA29_0 <= MoveBy)||(LA29_0 >= NoFill && LA29_0 <= Number)||(LA29_0 >= OBracket && LA29_0 <= OParen)||(LA29_0 >= PI_CONSTANT && LA29_0 <= Println)||(LA29_0 >= Random && LA29_0 <= Rect)||(LA29_0 >= Rotate && LA29_0 <= Round)||(LA29_0 >= Scale && LA29_0 <= Slider)||(LA29_0 >= Sq && LA29_0 <= Subtract)||(LA29_0 >= Tan && LA29_0 <= Template)||(LA29_0 >= Union && LA29_0 <= Weight)||LA29_0==Xor) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1153);
							exprList141=exprList();
							state._fsp--;

							stream_exprList.add(exprList141.getTree());
							}
							break;

					}

					char_literal142=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1156);  
					stream_CParen.add(char_literal142);

					// AST REWRITE
					// elements: exprList, Group
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:6: Expand '(' expression ')'
					{
					Expand143=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1173);  
					stream_Expand.add(Expand143);

					char_literal144=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1175);  
					stream_OParen.add(char_literal144);

					pushFollow(FOLLOW_expression_in_transformCall1177);
					expression145=expression();
					state._fsp--;

					stream_expression.add(expression145.getTree());
					char_literal146=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1179);  
					stream_CParen.add(char_literal146);

					// AST REWRITE
					// elements: expression, Expand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:34: ^( FUNC_CALL Expand expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Expand.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: Merge '(' expression ')'
					{
					Merge147=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1195);  
					stream_Merge.add(Merge147);

					char_literal148=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1197);  
					stream_OParen.add(char_literal148);

					pushFollow(FOLLOW_expression_in_transformCall1199);
					expression149=expression();
					state._fsp--;

					stream_expression.add(expression149.getTree());
					char_literal150=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1201);  
					stream_CParen.add(char_literal150);

					// AST REWRITE
					// elements: expression, Merge
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:33: ^( FUNC_CALL Merge expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Merge.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:6: Scale '(' ( exprList )? ')'
					{
					Scale151=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1217);  
					stream_Scale.add(Scale151);

					char_literal152=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1219);  
					stream_OParen.add(char_literal152);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:16: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||(LA30_0 >= Arc && LA30_0 <= Assert)||LA30_0==Bool||LA30_0==COLOR_CONSTANT||(LA30_0 >= Clip && LA30_0 <= Cm)||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Difference||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||(LA30_0 >= Fill && LA30_0 <= Flatten)||(LA30_0 >= Gaussian && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==Inch||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= Mm)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= Slider)||(LA30_0 >= Sq && LA30_0 <= Subtract)||(LA30_0 >= Tan && LA30_0 <= Template)||(LA30_0 >= Union && LA30_0 <= Weight)||LA30_0==Xor) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1221);
							exprList153=exprList();
							state._fsp--;

							stream_exprList.add(exprList153.getTree());
							}
							break;

					}

					char_literal154=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1224);  
					stream_CParen.add(char_literal154);

					// AST REWRITE
					// elements: Scale, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:32: ^( FUNC_CALL Scale ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:6: MirrorX '(' expression ')'
					{
					MirrorX155=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1241);  
					stream_MirrorX.add(MirrorX155);

					char_literal156=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1243);  
					stream_OParen.add(char_literal156);

					pushFollow(FOLLOW_expression_in_transformCall1245);
					expression157=expression();
					state._fsp--;

					stream_expression.add(expression157.getTree());
					char_literal158=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1247);  
					stream_CParen.add(char_literal158);

					// AST REWRITE
					// elements: expression, MirrorX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:35: ^( FUNC_CALL MirrorX expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MirrorX.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:6: MirrorY '(' expression ')'
					{
					MirrorY159=(Token)match(input,MirrorY,FOLLOW_MirrorY_in_transformCall1263);  
					stream_MirrorY.add(MirrorY159);

					char_literal160=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1265);  
					stream_OParen.add(char_literal160);

					pushFollow(FOLLOW_expression_in_transformCall1267);
					expression161=expression();
					state._fsp--;

					stream_expression.add(expression161.getTree());
					char_literal162=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1269);  
					stream_CParen.add(char_literal162);

					// AST REWRITE
					// elements: MirrorY, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:32: -> ^( FUNC_CALL MirrorY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:35: ^( FUNC_CALL MirrorY expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MirrorY.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:6: Union '(' ( exprList )? ')'
					{
					Union163=(Token)match(input,Union,FOLLOW_Union_in_transformCall1285);  
					stream_Union.add(Union163);

					char_literal164=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1287);  
					stream_OParen.add(char_literal164);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:16: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ATan||(LA31_0 >= Arc && LA31_0 <= Assert)||LA31_0==Bool||LA31_0==COLOR_CONSTANT||(LA31_0 >= Clip && LA31_0 <= Cm)||(LA31_0 >= Copy && LA31_0 <= Curve)||LA31_0==Difference||LA31_0==Ellipse||(LA31_0 >= Excl && LA31_0 <= Expand)||(LA31_0 >= Fill && LA31_0 <= Flatten)||(LA31_0 >= Gaussian && LA31_0 <= Hide)||LA31_0==Identifier||LA31_0==Inch||LA31_0==LAdd||(LA31_0 >= LRemove && LA31_0 <= LShape)||(LA31_0 >= Line && LA31_0 <= Mm)||(LA31_0 >= Move && LA31_0 <= MoveBy)||(LA31_0 >= NoFill && LA31_0 <= Number)||(LA31_0 >= OBracket && LA31_0 <= OParen)||(LA31_0 >= PI_CONSTANT && LA31_0 <= Println)||(LA31_0 >= Random && LA31_0 <= Rect)||(LA31_0 >= Rotate && LA31_0 <= Round)||(LA31_0 >= Scale && LA31_0 <= Slider)||(LA31_0 >= Sq && LA31_0 <= Subtract)||(LA31_0 >= Tan && LA31_0 <= Template)||(LA31_0 >= Union && LA31_0 <= Weight)||LA31_0==Xor) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1289);
							exprList165=exprList();
							state._fsp--;

							stream_exprList.add(exprList165.getTree());
							}
							break;

					}

					char_literal166=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1292);  
					stream_CParen.add(char_literal166);

					// AST REWRITE
					// elements: exprList, Union
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:29: -> ^( FUNC_CALL Union ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:32: ^( FUNC_CALL Union ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Union.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:6: Difference '(' ( exprList )? ')'
					{
					Difference167=(Token)match(input,Difference,FOLLOW_Difference_in_transformCall1309);  
					stream_Difference.add(Difference167);

					char_literal168=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1311);  
					stream_OParen.add(char_literal168);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:21: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ATan||(LA32_0 >= Arc && LA32_0 <= Assert)||LA32_0==Bool||LA32_0==COLOR_CONSTANT||(LA32_0 >= Clip && LA32_0 <= Cm)||(LA32_0 >= Copy && LA32_0 <= Curve)||LA32_0==Difference||LA32_0==Ellipse||(LA32_0 >= Excl && LA32_0 <= Expand)||(LA32_0 >= Fill && LA32_0 <= Flatten)||(LA32_0 >= Gaussian && LA32_0 <= Hide)||LA32_0==Identifier||LA32_0==Inch||LA32_0==LAdd||(LA32_0 >= LRemove && LA32_0 <= LShape)||(LA32_0 >= Line && LA32_0 <= Mm)||(LA32_0 >= Move && LA32_0 <= MoveBy)||(LA32_0 >= NoFill && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= PI_CONSTANT && LA32_0 <= Println)||(LA32_0 >= Random && LA32_0 <= Rect)||(LA32_0 >= Rotate && LA32_0 <= Round)||(LA32_0 >= Scale && LA32_0 <= Slider)||(LA32_0 >= Sq && LA32_0 <= Subtract)||(LA32_0 >= Tan && LA32_0 <= Template)||(LA32_0 >= Union && LA32_0 <= Weight)||LA32_0==Xor) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1313);
							exprList169=exprList();
							state._fsp--;

							stream_exprList.add(exprList169.getTree());
							}
							break;

					}

					char_literal170=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1316);  
					stream_CParen.add(char_literal170);

					// AST REWRITE
					// elements: exprList, Difference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 149:34: -> ^( FUNC_CALL Difference ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:37: ^( FUNC_CALL Difference ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Difference.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:60: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:6: Clip '(' ( exprList )? ')'
					{
					Clip171=(Token)match(input,Clip,FOLLOW_Clip_in_transformCall1333);  
					stream_Clip.add(Clip171);

					char_literal172=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1335);  
					stream_OParen.add(char_literal172);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:15: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ATan||(LA33_0 >= Arc && LA33_0 <= Assert)||LA33_0==Bool||LA33_0==COLOR_CONSTANT||(LA33_0 >= Clip && LA33_0 <= Cm)||(LA33_0 >= Copy && LA33_0 <= Curve)||LA33_0==Difference||LA33_0==Ellipse||(LA33_0 >= Excl && LA33_0 <= Expand)||(LA33_0 >= Fill && LA33_0 <= Flatten)||(LA33_0 >= Gaussian && LA33_0 <= Hide)||LA33_0==Identifier||LA33_0==Inch||LA33_0==LAdd||(LA33_0 >= LRemove && LA33_0 <= LShape)||(LA33_0 >= Line && LA33_0 <= Mm)||(LA33_0 >= Move && LA33_0 <= MoveBy)||(LA33_0 >= NoFill && LA33_0 <= Number)||(LA33_0 >= OBracket && LA33_0 <= OParen)||(LA33_0 >= PI_CONSTANT && LA33_0 <= Println)||(LA33_0 >= Random && LA33_0 <= Rect)||(LA33_0 >= Rotate && LA33_0 <= Round)||(LA33_0 >= Scale && LA33_0 <= Slider)||(LA33_0 >= Sq && LA33_0 <= Subtract)||(LA33_0 >= Tan && LA33_0 <= Template)||(LA33_0 >= Union && LA33_0 <= Weight)||LA33_0==Xor) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1337);
							exprList173=exprList();
							state._fsp--;

							stream_exprList.add(exprList173.getTree());
							}
							break;

					}

					char_literal174=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1340);  
					stream_CParen.add(char_literal174);

					// AST REWRITE
					// elements: exprList, Clip
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 150:28: -> ^( FUNC_CALL Clip ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:31: ^( FUNC_CALL Clip ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Clip.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:48: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 22 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:6: Xor '(' ( exprList )? ')'
					{
					Xor175=(Token)match(input,Xor,FOLLOW_Xor_in_transformCall1357);  
					stream_Xor.add(Xor175);

					char_literal176=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1359);  
					stream_OParen.add(char_literal176);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:14: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ATan||(LA34_0 >= Arc && LA34_0 <= Assert)||LA34_0==Bool||LA34_0==COLOR_CONSTANT||(LA34_0 >= Clip && LA34_0 <= Cm)||(LA34_0 >= Copy && LA34_0 <= Curve)||LA34_0==Difference||LA34_0==Ellipse||(LA34_0 >= Excl && LA34_0 <= Expand)||(LA34_0 >= Fill && LA34_0 <= Flatten)||(LA34_0 >= Gaussian && LA34_0 <= Hide)||LA34_0==Identifier||LA34_0==Inch||LA34_0==LAdd||(LA34_0 >= LRemove && LA34_0 <= LShape)||(LA34_0 >= Line && LA34_0 <= Mm)||(LA34_0 >= Move && LA34_0 <= MoveBy)||(LA34_0 >= NoFill && LA34_0 <= Number)||(LA34_0 >= OBracket && LA34_0 <= OParen)||(LA34_0 >= PI_CONSTANT && LA34_0 <= Println)||(LA34_0 >= Random && LA34_0 <= Rect)||(LA34_0 >= Rotate && LA34_0 <= Round)||(LA34_0 >= Scale && LA34_0 <= Slider)||(LA34_0 >= Sq && LA34_0 <= Subtract)||(LA34_0 >= Tan && LA34_0 <= Template)||(LA34_0 >= Union && LA34_0 <= Weight)||LA34_0==Xor) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1361);
							exprList177=exprList();
							state._fsp--;

							stream_exprList.add(exprList177.getTree());
							}
							break;

					}

					char_literal178=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1364);  
					stream_CParen.add(char_literal178);

					// AST REWRITE
					// elements: exprList, Xor
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 151:27: -> ^( FUNC_CALL Xor ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:30: ^( FUNC_CALL Xor ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Xor.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:46: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:6: Flatten '(' expression ')'
					{
					Flatten179=(Token)match(input,Flatten,FOLLOW_Flatten_in_transformCall1381);  
					stream_Flatten.add(Flatten179);

					char_literal180=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1383);  
					stream_OParen.add(char_literal180);

					pushFollow(FOLLOW_expression_in_transformCall1385);
					expression181=expression();
					state._fsp--;

					stream_expression.add(expression181.getTree());
					char_literal182=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1387);  
					stream_CParen.add(char_literal182);

					// AST REWRITE
					// elements: expression, Flatten
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 152:32: -> ^( FUNC_CALL Flatten expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:35: ^( FUNC_CALL Flatten expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Flatten.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transformCall"


	public static class patternCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "patternCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:4: patternCall : ( Grid '(' ( exprList )? ')' -> ^( FUNC_CALL Grid ( exprList )? ) | Wave '(' ( exprList )? ')' -> ^( FUNC_CALL Wave ( exprList )? ) | Arc '(' ( exprList )? ')' -> ^( FUNC_CALL Arc ( exprList )? ) );
	public final PogoParser.patternCall_return patternCall() throws RecognitionException {
		PogoParser.patternCall_return retval = new PogoParser.patternCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Grid183=null;
		Token char_literal184=null;
		Token char_literal186=null;
		Token Wave187=null;
		Token char_literal188=null;
		Token char_literal190=null;
		Token Arc191=null;
		Token char_literal192=null;
		Token char_literal194=null;
		ParserRuleReturnScope exprList185 =null;
		ParserRuleReturnScope exprList189 =null;
		ParserRuleReturnScope exprList193 =null;

		Object Grid183_tree=null;
		Object char_literal184_tree=null;
		Object char_literal186_tree=null;
		Object Wave187_tree=null;
		Object char_literal188_tree=null;
		Object char_literal190_tree=null;
		Object Arc191_tree=null;
		Object char_literal192_tree=null;
		Object char_literal194_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Arc=new RewriteRuleTokenStream(adaptor,"token Arc");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Grid=new RewriteRuleTokenStream(adaptor,"token Grid");
		RewriteRuleTokenStream stream_Wave=new RewriteRuleTokenStream(adaptor,"token Wave");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:4: ( Grid '(' ( exprList )? ')' -> ^( FUNC_CALL Grid ( exprList )? ) | Wave '(' ( exprList )? ')' -> ^( FUNC_CALL Wave ( exprList )? ) | Arc '(' ( exprList )? ')' -> ^( FUNC_CALL Arc ( exprList )? ) )
			int alt39=3;
			switch ( input.LA(1) ) {
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:6: Grid '(' ( exprList )? ')'
					{
					Grid183=(Token)match(input,Grid,FOLLOW_Grid_in_patternCall1417);  
					stream_Grid.add(Grid183);

					char_literal184=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1419);  
					stream_OParen.add(char_literal184);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:15: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==ATan||(LA36_0 >= Arc && LA36_0 <= Assert)||LA36_0==Bool||LA36_0==COLOR_CONSTANT||(LA36_0 >= Clip && LA36_0 <= Cm)||(LA36_0 >= Copy && LA36_0 <= Curve)||LA36_0==Difference||LA36_0==Ellipse||(LA36_0 >= Excl && LA36_0 <= Expand)||(LA36_0 >= Fill && LA36_0 <= Flatten)||(LA36_0 >= Gaussian && LA36_0 <= Hide)||LA36_0==Identifier||LA36_0==Inch||LA36_0==LAdd||(LA36_0 >= LRemove && LA36_0 <= LShape)||(LA36_0 >= Line && LA36_0 <= Mm)||(LA36_0 >= Move && LA36_0 <= MoveBy)||(LA36_0 >= NoFill && LA36_0 <= Number)||(LA36_0 >= OBracket && LA36_0 <= OParen)||(LA36_0 >= PI_CONSTANT && LA36_0 <= Println)||(LA36_0 >= Random && LA36_0 <= Rect)||(LA36_0 >= Rotate && LA36_0 <= Round)||(LA36_0 >= Scale && LA36_0 <= Slider)||(LA36_0 >= Sq && LA36_0 <= Subtract)||(LA36_0 >= Tan && LA36_0 <= Template)||(LA36_0 >= Union && LA36_0 <= Weight)||LA36_0==Xor) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1421);
							exprList185=exprList();
							state._fsp--;

							stream_exprList.add(exprList185.getTree());
							}
							break;

					}

					char_literal186=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1424);  
					stream_CParen.add(char_literal186);

					// AST REWRITE
					// elements: Grid, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 156:29: -> ^( FUNC_CALL Grid ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:32: ^( FUNC_CALL Grid ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Grid.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:49: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:6: Wave '(' ( exprList )? ')'
					{
					Wave187=(Token)match(input,Wave,FOLLOW_Wave_in_patternCall1442);  
					stream_Wave.add(Wave187);

					char_literal188=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1444);  
					stream_OParen.add(char_literal188);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:15: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==ATan||(LA37_0 >= Arc && LA37_0 <= Assert)||LA37_0==Bool||LA37_0==COLOR_CONSTANT||(LA37_0 >= Clip && LA37_0 <= Cm)||(LA37_0 >= Copy && LA37_0 <= Curve)||LA37_0==Difference||LA37_0==Ellipse||(LA37_0 >= Excl && LA37_0 <= Expand)||(LA37_0 >= Fill && LA37_0 <= Flatten)||(LA37_0 >= Gaussian && LA37_0 <= Hide)||LA37_0==Identifier||LA37_0==Inch||LA37_0==LAdd||(LA37_0 >= LRemove && LA37_0 <= LShape)||(LA37_0 >= Line && LA37_0 <= Mm)||(LA37_0 >= Move && LA37_0 <= MoveBy)||(LA37_0 >= NoFill && LA37_0 <= Number)||(LA37_0 >= OBracket && LA37_0 <= OParen)||(LA37_0 >= PI_CONSTANT && LA37_0 <= Println)||(LA37_0 >= Random && LA37_0 <= Rect)||(LA37_0 >= Rotate && LA37_0 <= Round)||(LA37_0 >= Scale && LA37_0 <= Slider)||(LA37_0 >= Sq && LA37_0 <= Subtract)||(LA37_0 >= Tan && LA37_0 <= Template)||(LA37_0 >= Union && LA37_0 <= Weight)||LA37_0==Xor) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1446);
							exprList189=exprList();
							state._fsp--;

							stream_exprList.add(exprList189.getTree());
							}
							break;

					}

					char_literal190=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1449);  
					stream_CParen.add(char_literal190);

					// AST REWRITE
					// elements: Wave, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 157:29: -> ^( FUNC_CALL Wave ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:32: ^( FUNC_CALL Wave ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Wave.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:49: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:6: Arc '(' ( exprList )? ')'
					{
					Arc191=(Token)match(input,Arc,FOLLOW_Arc_in_patternCall1467);  
					stream_Arc.add(Arc191);

					char_literal192=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1469);  
					stream_OParen.add(char_literal192);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:14: ( exprList )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==ATan||(LA38_0 >= Arc && LA38_0 <= Assert)||LA38_0==Bool||LA38_0==COLOR_CONSTANT||(LA38_0 >= Clip && LA38_0 <= Cm)||(LA38_0 >= Copy && LA38_0 <= Curve)||LA38_0==Difference||LA38_0==Ellipse||(LA38_0 >= Excl && LA38_0 <= Expand)||(LA38_0 >= Fill && LA38_0 <= Flatten)||(LA38_0 >= Gaussian && LA38_0 <= Hide)||LA38_0==Identifier||LA38_0==Inch||LA38_0==LAdd||(LA38_0 >= LRemove && LA38_0 <= LShape)||(LA38_0 >= Line && LA38_0 <= Mm)||(LA38_0 >= Move && LA38_0 <= MoveBy)||(LA38_0 >= NoFill && LA38_0 <= Number)||(LA38_0 >= OBracket && LA38_0 <= OParen)||(LA38_0 >= PI_CONSTANT && LA38_0 <= Println)||(LA38_0 >= Random && LA38_0 <= Rect)||(LA38_0 >= Rotate && LA38_0 <= Round)||(LA38_0 >= Scale && LA38_0 <= Slider)||(LA38_0 >= Sq && LA38_0 <= Subtract)||(LA38_0 >= Tan && LA38_0 <= Template)||(LA38_0 >= Union && LA38_0 <= Weight)||LA38_0==Xor) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1471);
							exprList193=exprList();
							state._fsp--;

							stream_exprList.add(exprList193.getTree());
							}
							break;

					}

					char_literal194=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1474);  
					stream_CParen.add(char_literal194);

					// AST REWRITE
					// elements: exprList, Arc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 158:28: -> ^( FUNC_CALL Arc ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:31: ^( FUNC_CALL Arc ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Arc.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:47: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "patternCall"


	public static class getCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) | GetIntersect '(' ( exprList )? ')' -> ^( FUNC_CALL GetIntersect ( exprList )? ) | GetAngle '(' ( exprList )? ')' -> ^( FUNC_CALL GetAngle ( exprList )? ) | GetRadius '(' ( exprList )? ')' -> ^( FUNC_CALL GetRadius ( exprList )? ) );
	public final PogoParser.getCall_return getCall() throws RecognitionException {
		PogoParser.getCall_return retval = new PogoParser.getCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GetWidth195=null;
		Token char_literal196=null;
		Token char_literal198=null;
		Token GetHeight199=null;
		Token char_literal200=null;
		Token char_literal202=null;
		Token GetX203=null;
		Token char_literal204=null;
		Token char_literal206=null;
		Token GetY207=null;
		Token char_literal208=null;
		Token char_literal210=null;
		Token GetOrigin211=null;
		Token char_literal212=null;
		Token char_literal214=null;
		Token GetRotation215=null;
		Token char_literal216=null;
		Token char_literal218=null;
		Token GetFill219=null;
		Token char_literal220=null;
		Token char_literal222=null;
		Token GetStroke223=null;
		Token char_literal224=null;
		Token char_literal226=null;
		Token GetStart227=null;
		Token char_literal228=null;
		Token char_literal230=null;
		Token GetEnd231=null;
		Token char_literal232=null;
		Token char_literal234=null;
		Token GetDistance235=null;
		Token char_literal236=null;
		Token char_literal238=null;
		Token GetIntersect239=null;
		Token char_literal240=null;
		Token char_literal242=null;
		Token GetAngle243=null;
		Token char_literal244=null;
		Token char_literal246=null;
		Token GetRadius247=null;
		Token char_literal248=null;
		Token char_literal250=null;
		ParserRuleReturnScope expression197 =null;
		ParserRuleReturnScope expression201 =null;
		ParserRuleReturnScope expression205 =null;
		ParserRuleReturnScope expression209 =null;
		ParserRuleReturnScope expression213 =null;
		ParserRuleReturnScope expression217 =null;
		ParserRuleReturnScope expression221 =null;
		ParserRuleReturnScope expression225 =null;
		ParserRuleReturnScope expression229 =null;
		ParserRuleReturnScope expression233 =null;
		ParserRuleReturnScope exprList237 =null;
		ParserRuleReturnScope exprList241 =null;
		ParserRuleReturnScope exprList245 =null;
		ParserRuleReturnScope exprList249 =null;

		Object GetWidth195_tree=null;
		Object char_literal196_tree=null;
		Object char_literal198_tree=null;
		Object GetHeight199_tree=null;
		Object char_literal200_tree=null;
		Object char_literal202_tree=null;
		Object GetX203_tree=null;
		Object char_literal204_tree=null;
		Object char_literal206_tree=null;
		Object GetY207_tree=null;
		Object char_literal208_tree=null;
		Object char_literal210_tree=null;
		Object GetOrigin211_tree=null;
		Object char_literal212_tree=null;
		Object char_literal214_tree=null;
		Object GetRotation215_tree=null;
		Object char_literal216_tree=null;
		Object char_literal218_tree=null;
		Object GetFill219_tree=null;
		Object char_literal220_tree=null;
		Object char_literal222_tree=null;
		Object GetStroke223_tree=null;
		Object char_literal224_tree=null;
		Object char_literal226_tree=null;
		Object GetStart227_tree=null;
		Object char_literal228_tree=null;
		Object char_literal230_tree=null;
		Object GetEnd231_tree=null;
		Object char_literal232_tree=null;
		Object char_literal234_tree=null;
		Object GetDistance235_tree=null;
		Object char_literal236_tree=null;
		Object char_literal238_tree=null;
		Object GetIntersect239_tree=null;
		Object char_literal240_tree=null;
		Object char_literal242_tree=null;
		Object GetAngle243_tree=null;
		Object char_literal244_tree=null;
		Object char_literal246_tree=null;
		Object GetRadius247_tree=null;
		Object char_literal248_tree=null;
		Object char_literal250_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_GetRadius=new RewriteRuleTokenStream(adaptor,"token GetRadius");
		RewriteRuleTokenStream stream_GetFill=new RewriteRuleTokenStream(adaptor,"token GetFill");
		RewriteRuleTokenStream stream_GetEnd=new RewriteRuleTokenStream(adaptor,"token GetEnd");
		RewriteRuleTokenStream stream_GetRotation=new RewriteRuleTokenStream(adaptor,"token GetRotation");
		RewriteRuleTokenStream stream_GetIntersect=new RewriteRuleTokenStream(adaptor,"token GetIntersect");
		RewriteRuleTokenStream stream_GetStroke=new RewriteRuleTokenStream(adaptor,"token GetStroke");
		RewriteRuleTokenStream stream_GetAngle=new RewriteRuleTokenStream(adaptor,"token GetAngle");
		RewriteRuleTokenStream stream_GetWidth=new RewriteRuleTokenStream(adaptor,"token GetWidth");
		RewriteRuleTokenStream stream_GetStart=new RewriteRuleTokenStream(adaptor,"token GetStart");
		RewriteRuleTokenStream stream_GetX=new RewriteRuleTokenStream(adaptor,"token GetX");
		RewriteRuleTokenStream stream_GetDistance=new RewriteRuleTokenStream(adaptor,"token GetDistance");
		RewriteRuleTokenStream stream_GetY=new RewriteRuleTokenStream(adaptor,"token GetY");
		RewriteRuleTokenStream stream_GetOrigin=new RewriteRuleTokenStream(adaptor,"token GetOrigin");
		RewriteRuleTokenStream stream_GetHeight=new RewriteRuleTokenStream(adaptor,"token GetHeight");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) | GetIntersect '(' ( exprList )? ')' -> ^( FUNC_CALL GetIntersect ( exprList )? ) | GetAngle '(' ( exprList )? ')' -> ^( FUNC_CALL GetAngle ( exprList )? ) | GetRadius '(' ( exprList )? ')' -> ^( FUNC_CALL GetRadius ( exprList )? ) )
			int alt44=14;
			switch ( input.LA(1) ) {
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
			case GetAngle:
				{
				alt44=13;
				}
				break;
			case GetRadius:
				{
				alt44=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:5: GetWidth '(' expression ')'
					{
					GetWidth195=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1505);  
					stream_GetWidth.add(GetWidth195);

					char_literal196=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1507);  
					stream_OParen.add(char_literal196);

					pushFollow(FOLLOW_expression_in_getCall1509);
					expression197=expression();
					state._fsp--;

					stream_expression.add(expression197.getTree());
					char_literal198=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1511);  
					stream_CParen.add(char_literal198);

					// AST REWRITE
					// elements: GetWidth, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 162:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:35: ^( FUNC_CALL GetWidth expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetWidth.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:4: GetHeight '(' expression ')'
					{
					GetHeight199=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1525);  
					stream_GetHeight.add(GetHeight199);

					char_literal200=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1527);  
					stream_OParen.add(char_literal200);

					pushFollow(FOLLOW_expression_in_getCall1529);
					expression201=expression();
					state._fsp--;

					stream_expression.add(expression201.getTree());
					char_literal202=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1531);  
					stream_CParen.add(char_literal202);

					// AST REWRITE
					// elements: GetHeight, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 163:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:35: ^( FUNC_CALL GetHeight expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetHeight.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:4: GetX '(' expression ')'
					{
					GetX203=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1545);  
					stream_GetX.add(GetX203);

					char_literal204=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1547);  
					stream_OParen.add(char_literal204);

					pushFollow(FOLLOW_expression_in_getCall1549);
					expression205=expression();
					state._fsp--;

					stream_expression.add(expression205.getTree());
					char_literal206=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1551);  
					stream_CParen.add(char_literal206);

					// AST REWRITE
					// elements: GetX, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 164:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:30: ^( FUNC_CALL GetX expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetX.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:4: GetY '(' expression ')'
					{
					GetY207=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1565);  
					stream_GetY.add(GetY207);

					char_literal208=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1567);  
					stream_OParen.add(char_literal208);

					pushFollow(FOLLOW_expression_in_getCall1569);
					expression209=expression();
					state._fsp--;

					stream_expression.add(expression209.getTree());
					char_literal210=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1571);  
					stream_CParen.add(char_literal210);

					// AST REWRITE
					// elements: GetY, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 165:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:30: ^( FUNC_CALL GetY expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetY.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:4: GetOrigin '(' expression ')'
					{
					GetOrigin211=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1585);  
					stream_GetOrigin.add(GetOrigin211);

					char_literal212=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1587);  
					stream_OParen.add(char_literal212);

					pushFollow(FOLLOW_expression_in_getCall1589);
					expression213=expression();
					state._fsp--;

					stream_expression.add(expression213.getTree());
					char_literal214=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1591);  
					stream_CParen.add(char_literal214);

					// AST REWRITE
					// elements: expression, GetOrigin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 166:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:35: ^( FUNC_CALL GetOrigin expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetOrigin.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:4: GetRotation '(' expression ')'
					{
					GetRotation215=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1605);  
					stream_GetRotation.add(GetRotation215);

					char_literal216=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1607);  
					stream_OParen.add(char_literal216);

					pushFollow(FOLLOW_expression_in_getCall1609);
					expression217=expression();
					state._fsp--;

					stream_expression.add(expression217.getTree());
					char_literal218=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1611);  
					stream_CParen.add(char_literal218);

					// AST REWRITE
					// elements: GetRotation, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 167:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:37: ^( FUNC_CALL GetRotation expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetRotation.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:4: GetFill '(' expression ')'
					{
					GetFill219=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1625);  
					stream_GetFill.add(GetFill219);

					char_literal220=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1627);  
					stream_OParen.add(char_literal220);

					pushFollow(FOLLOW_expression_in_getCall1629);
					expression221=expression();
					state._fsp--;

					stream_expression.add(expression221.getTree());
					char_literal222=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1631);  
					stream_CParen.add(char_literal222);

					// AST REWRITE
					// elements: expression, GetFill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 168:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:33: ^( FUNC_CALL GetFill expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetFill.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:4: GetStroke '(' expression ')'
					{
					GetStroke223=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1645);  
					stream_GetStroke.add(GetStroke223);

					char_literal224=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1647);  
					stream_OParen.add(char_literal224);

					pushFollow(FOLLOW_expression_in_getCall1649);
					expression225=expression();
					state._fsp--;

					stream_expression.add(expression225.getTree());
					char_literal226=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1651);  
					stream_CParen.add(char_literal226);

					// AST REWRITE
					// elements: GetStroke, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 169:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:35: ^( FUNC_CALL GetStroke expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetStroke.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:4: GetStart '(' expression ')'
					{
					GetStart227=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1665);  
					stream_GetStart.add(GetStart227);

					char_literal228=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1667);  
					stream_OParen.add(char_literal228);

					pushFollow(FOLLOW_expression_in_getCall1669);
					expression229=expression();
					state._fsp--;

					stream_expression.add(expression229.getTree());
					char_literal230=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1671);  
					stream_CParen.add(char_literal230);

					// AST REWRITE
					// elements: expression, GetStart
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:34: ^( FUNC_CALL GetStart expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetStart.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:4: GetEnd '(' expression ')'
					{
					GetEnd231=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1685);  
					stream_GetEnd.add(GetEnd231);

					char_literal232=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1687);  
					stream_OParen.add(char_literal232);

					pushFollow(FOLLOW_expression_in_getCall1689);
					expression233=expression();
					state._fsp--;

					stream_expression.add(expression233.getTree());
					char_literal234=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1691);  
					stream_CParen.add(char_literal234);

					// AST REWRITE
					// elements: GetEnd, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 171:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:32: ^( FUNC_CALL GetEnd expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetEnd.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:4: GetDistance '(' ( exprList )? ')'
					{
					GetDistance235=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1706);  
					stream_GetDistance.add(GetDistance235);

					char_literal236=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1708);  
					stream_OParen.add(char_literal236);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:20: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==ATan||(LA40_0 >= Arc && LA40_0 <= Assert)||LA40_0==Bool||LA40_0==COLOR_CONSTANT||(LA40_0 >= Clip && LA40_0 <= Cm)||(LA40_0 >= Copy && LA40_0 <= Curve)||LA40_0==Difference||LA40_0==Ellipse||(LA40_0 >= Excl && LA40_0 <= Expand)||(LA40_0 >= Fill && LA40_0 <= Flatten)||(LA40_0 >= Gaussian && LA40_0 <= Hide)||LA40_0==Identifier||LA40_0==Inch||LA40_0==LAdd||(LA40_0 >= LRemove && LA40_0 <= LShape)||(LA40_0 >= Line && LA40_0 <= Mm)||(LA40_0 >= Move && LA40_0 <= MoveBy)||(LA40_0 >= NoFill && LA40_0 <= Number)||(LA40_0 >= OBracket && LA40_0 <= OParen)||(LA40_0 >= PI_CONSTANT && LA40_0 <= Println)||(LA40_0 >= Random && LA40_0 <= Rect)||(LA40_0 >= Rotate && LA40_0 <= Round)||(LA40_0 >= Scale && LA40_0 <= Slider)||(LA40_0 >= Sq && LA40_0 <= Subtract)||(LA40_0 >= Tan && LA40_0 <= Template)||(LA40_0 >= Union && LA40_0 <= Weight)||LA40_0==Xor) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:20: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1710);
							exprList237=exprList();
							state._fsp--;

							stream_exprList.add(exprList237.getTree());
							}
							break;

					}

					char_literal238=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1714);  
					stream_CParen.add(char_literal238);

					// AST REWRITE
					// elements: GetDistance, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 172:34: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:37: ^( FUNC_CALL GetDistance ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetDistance.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:61: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:4: GetIntersect '(' ( exprList )? ')'
					{
					GetIntersect239=(Token)match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1731);  
					stream_GetIntersect.add(GetIntersect239);

					char_literal240=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1732);  
					stream_OParen.add(char_literal240);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:20: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ATan||(LA41_0 >= Arc && LA41_0 <= Assert)||LA41_0==Bool||LA41_0==COLOR_CONSTANT||(LA41_0 >= Clip && LA41_0 <= Cm)||(LA41_0 >= Copy && LA41_0 <= Curve)||LA41_0==Difference||LA41_0==Ellipse||(LA41_0 >= Excl && LA41_0 <= Expand)||(LA41_0 >= Fill && LA41_0 <= Flatten)||(LA41_0 >= Gaussian && LA41_0 <= Hide)||LA41_0==Identifier||LA41_0==Inch||LA41_0==LAdd||(LA41_0 >= LRemove && LA41_0 <= LShape)||(LA41_0 >= Line && LA41_0 <= Mm)||(LA41_0 >= Move && LA41_0 <= MoveBy)||(LA41_0 >= NoFill && LA41_0 <= Number)||(LA41_0 >= OBracket && LA41_0 <= OParen)||(LA41_0 >= PI_CONSTANT && LA41_0 <= Println)||(LA41_0 >= Random && LA41_0 <= Rect)||(LA41_0 >= Rotate && LA41_0 <= Round)||(LA41_0 >= Scale && LA41_0 <= Slider)||(LA41_0 >= Sq && LA41_0 <= Subtract)||(LA41_0 >= Tan && LA41_0 <= Template)||(LA41_0 >= Union && LA41_0 <= Weight)||LA41_0==Xor) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:20: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1734);
							exprList241=exprList();
							state._fsp--;

							stream_exprList.add(exprList241.getTree());
							}
							break;

					}

					char_literal242=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1738);  
					stream_CParen.add(char_literal242);

					// AST REWRITE
					// elements: GetIntersect, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:34: -> ^( FUNC_CALL GetIntersect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:37: ^( FUNC_CALL GetIntersect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetIntersect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:62: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:4: GetAngle '(' ( exprList )? ')'
					{
					GetAngle243=(Token)match(input,GetAngle,FOLLOW_GetAngle_in_getCall1755);  
					stream_GetAngle.add(GetAngle243);

					char_literal244=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1756);  
					stream_OParen.add(char_literal244);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:16: ( exprList )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==ATan||(LA42_0 >= Arc && LA42_0 <= Assert)||LA42_0==Bool||LA42_0==COLOR_CONSTANT||(LA42_0 >= Clip && LA42_0 <= Cm)||(LA42_0 >= Copy && LA42_0 <= Curve)||LA42_0==Difference||LA42_0==Ellipse||(LA42_0 >= Excl && LA42_0 <= Expand)||(LA42_0 >= Fill && LA42_0 <= Flatten)||(LA42_0 >= Gaussian && LA42_0 <= Hide)||LA42_0==Identifier||LA42_0==Inch||LA42_0==LAdd||(LA42_0 >= LRemove && LA42_0 <= LShape)||(LA42_0 >= Line && LA42_0 <= Mm)||(LA42_0 >= Move && LA42_0 <= MoveBy)||(LA42_0 >= NoFill && LA42_0 <= Number)||(LA42_0 >= OBracket && LA42_0 <= OParen)||(LA42_0 >= PI_CONSTANT && LA42_0 <= Println)||(LA42_0 >= Random && LA42_0 <= Rect)||(LA42_0 >= Rotate && LA42_0 <= Round)||(LA42_0 >= Scale && LA42_0 <= Slider)||(LA42_0 >= Sq && LA42_0 <= Subtract)||(LA42_0 >= Tan && LA42_0 <= Template)||(LA42_0 >= Union && LA42_0 <= Weight)||LA42_0==Xor) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1758);
							exprList245=exprList();
							state._fsp--;

							stream_exprList.add(exprList245.getTree());
							}
							break;

					}

					char_literal246=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1762);  
					stream_CParen.add(char_literal246);

					// AST REWRITE
					// elements: GetAngle, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 174:30: -> ^( FUNC_CALL GetAngle ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:33: ^( FUNC_CALL GetAngle ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetAngle.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:54: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:4: GetRadius '(' ( exprList )? ')'
					{
					GetRadius247=(Token)match(input,GetRadius,FOLLOW_GetRadius_in_getCall1779);  
					stream_GetRadius.add(GetRadius247);

					char_literal248=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1780);  
					stream_OParen.add(char_literal248);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:17: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==ATan||(LA43_0 >= Arc && LA43_0 <= Assert)||LA43_0==Bool||LA43_0==COLOR_CONSTANT||(LA43_0 >= Clip && LA43_0 <= Cm)||(LA43_0 >= Copy && LA43_0 <= Curve)||LA43_0==Difference||LA43_0==Ellipse||(LA43_0 >= Excl && LA43_0 <= Expand)||(LA43_0 >= Fill && LA43_0 <= Flatten)||(LA43_0 >= Gaussian && LA43_0 <= Hide)||LA43_0==Identifier||LA43_0==Inch||LA43_0==LAdd||(LA43_0 >= LRemove && LA43_0 <= LShape)||(LA43_0 >= Line && LA43_0 <= Mm)||(LA43_0 >= Move && LA43_0 <= MoveBy)||(LA43_0 >= NoFill && LA43_0 <= Number)||(LA43_0 >= OBracket && LA43_0 <= OParen)||(LA43_0 >= PI_CONSTANT && LA43_0 <= Println)||(LA43_0 >= Random && LA43_0 <= Rect)||(LA43_0 >= Rotate && LA43_0 <= Round)||(LA43_0 >= Scale && LA43_0 <= Slider)||(LA43_0 >= Sq && LA43_0 <= Subtract)||(LA43_0 >= Tan && LA43_0 <= Template)||(LA43_0 >= Union && LA43_0 <= Weight)||LA43_0==Xor) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1782);
							exprList249=exprList();
							state._fsp--;

							stream_exprList.add(exprList249.getTree());
							}
							break;

					}

					char_literal250=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1786);  
					stream_CParen.add(char_literal250);

					// AST REWRITE
					// elements: exprList, GetRadius
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 175:31: -> ^( FUNC_CALL GetRadius ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:34: ^( FUNC_CALL GetRadius ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetRadius.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:56: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getCall"


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' ( exprList )? ')' -> ^( FUNC_CALL ATan ( exprList )? ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Pow '(' ( exprList )? ')' -> ^( FUNC_CALL Pow ( exprList )? ) | Sqrt '(' expression ')' -> ^( FUNC_CALL Sqrt expression ) | Sq '(' expression ')' -> ^( FUNC_CALL Sq expression ) | Gaussian '(' ( exprList )? ')' -> ^( FUNC_CALL Gaussian ( exprList )? ) | Noise '(' ( exprList )? ')' -> ^( FUNC_CALL Noise ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) | Inch '(' expression ')' -> ^( FUNC_CALL Inch expression ) | Mm '(' expression ')' -> ^( FUNC_CALL Mm expression ) | Cm '(' expression ')' -> ^( FUNC_CALL Cm expression ) | Units '(' expression ')' -> ^( FUNC_CALL Units expression ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine251=null;
		Token char_literal252=null;
		Token char_literal254=null;
		Token Sine255=null;
		Token char_literal256=null;
		Token char_literal258=null;
		Token Tan259=null;
		Token char_literal260=null;
		Token char_literal262=null;
		Token ATan263=null;
		Token char_literal264=null;
		Token char_literal266=null;
		Token Random267=null;
		Token char_literal268=null;
		Token char_literal270=null;
		Token Pow271=null;
		Token char_literal272=null;
		Token char_literal274=null;
		Token Sqrt275=null;
		Token char_literal276=null;
		Token char_literal278=null;
		Token Sq279=null;
		Token char_literal280=null;
		Token char_literal282=null;
		Token Gaussian283=null;
		Token char_literal284=null;
		Token char_literal286=null;
		Token Noise287=null;
		Token char_literal288=null;
		Token char_literal290=null;
		Token Round291=null;
		Token char_literal292=null;
		Token char_literal294=null;
		Token Map295=null;
		Token char_literal296=null;
		Token char_literal298=null;
		Token Inch299=null;
		Token char_literal300=null;
		Token char_literal302=null;
		Token Mm303=null;
		Token char_literal304=null;
		Token char_literal306=null;
		Token Cm307=null;
		Token char_literal308=null;
		Token char_literal310=null;
		Token Units311=null;
		Token char_literal312=null;
		Token char_literal314=null;
		ParserRuleReturnScope expression253 =null;
		ParserRuleReturnScope expression257 =null;
		ParserRuleReturnScope expression261 =null;
		ParserRuleReturnScope exprList265 =null;
		ParserRuleReturnScope exprList269 =null;
		ParserRuleReturnScope exprList273 =null;
		ParserRuleReturnScope expression277 =null;
		ParserRuleReturnScope expression281 =null;
		ParserRuleReturnScope exprList285 =null;
		ParserRuleReturnScope exprList289 =null;
		ParserRuleReturnScope expression293 =null;
		ParserRuleReturnScope exprList297 =null;
		ParserRuleReturnScope expression301 =null;
		ParserRuleReturnScope expression305 =null;
		ParserRuleReturnScope expression309 =null;
		ParserRuleReturnScope expression313 =null;

		Object Cosine251_tree=null;
		Object char_literal252_tree=null;
		Object char_literal254_tree=null;
		Object Sine255_tree=null;
		Object char_literal256_tree=null;
		Object char_literal258_tree=null;
		Object Tan259_tree=null;
		Object char_literal260_tree=null;
		Object char_literal262_tree=null;
		Object ATan263_tree=null;
		Object char_literal264_tree=null;
		Object char_literal266_tree=null;
		Object Random267_tree=null;
		Object char_literal268_tree=null;
		Object char_literal270_tree=null;
		Object Pow271_tree=null;
		Object char_literal272_tree=null;
		Object char_literal274_tree=null;
		Object Sqrt275_tree=null;
		Object char_literal276_tree=null;
		Object char_literal278_tree=null;
		Object Sq279_tree=null;
		Object char_literal280_tree=null;
		Object char_literal282_tree=null;
		Object Gaussian283_tree=null;
		Object char_literal284_tree=null;
		Object char_literal286_tree=null;
		Object Noise287_tree=null;
		Object char_literal288_tree=null;
		Object char_literal290_tree=null;
		Object Round291_tree=null;
		Object char_literal292_tree=null;
		Object char_literal294_tree=null;
		Object Map295_tree=null;
		Object char_literal296_tree=null;
		Object char_literal298_tree=null;
		Object Inch299_tree=null;
		Object char_literal300_tree=null;
		Object char_literal302_tree=null;
		Object Mm303_tree=null;
		Object char_literal304_tree=null;
		Object char_literal306_tree=null;
		Object Cm307_tree=null;
		Object char_literal308_tree=null;
		Object char_literal310_tree=null;
		Object Units311_tree=null;
		Object char_literal312_tree=null;
		Object char_literal314_tree=null;
		RewriteRuleTokenStream stream_Sqrt=new RewriteRuleTokenStream(adaptor,"token Sqrt");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Tan=new RewriteRuleTokenStream(adaptor,"token Tan");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Gaussian=new RewriteRuleTokenStream(adaptor,"token Gaussian");
		RewriteRuleTokenStream stream_Map=new RewriteRuleTokenStream(adaptor,"token Map");
		RewriteRuleTokenStream stream_Round=new RewriteRuleTokenStream(adaptor,"token Round");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleTokenStream stream_ATan=new RewriteRuleTokenStream(adaptor,"token ATan");
		RewriteRuleTokenStream stream_Sq=new RewriteRuleTokenStream(adaptor,"token Sq");
		RewriteRuleTokenStream stream_Mm=new RewriteRuleTokenStream(adaptor,"token Mm");
		RewriteRuleTokenStream stream_Cm=new RewriteRuleTokenStream(adaptor,"token Cm");
		RewriteRuleTokenStream stream_Units=new RewriteRuleTokenStream(adaptor,"token Units");
		RewriteRuleTokenStream stream_Inch=new RewriteRuleTokenStream(adaptor,"token Inch");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Noise=new RewriteRuleTokenStream(adaptor,"token Noise");
		RewriteRuleTokenStream stream_Random=new RewriteRuleTokenStream(adaptor,"token Random");
		RewriteRuleTokenStream stream_Pow=new RewriteRuleTokenStream(adaptor,"token Pow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' ( exprList )? ')' -> ^( FUNC_CALL ATan ( exprList )? ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Pow '(' ( exprList )? ')' -> ^( FUNC_CALL Pow ( exprList )? ) | Sqrt '(' expression ')' -> ^( FUNC_CALL Sqrt expression ) | Sq '(' expression ')' -> ^( FUNC_CALL Sq expression ) | Gaussian '(' ( exprList )? ')' -> ^( FUNC_CALL Gaussian ( exprList )? ) | Noise '(' ( exprList )? ')' -> ^( FUNC_CALL Noise ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) | Inch '(' expression ')' -> ^( FUNC_CALL Inch expression ) | Mm '(' expression ')' -> ^( FUNC_CALL Mm expression ) | Cm '(' expression ')' -> ^( FUNC_CALL Cm expression ) | Units '(' expression ')' -> ^( FUNC_CALL Units expression ) )
			int alt51=16;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt51=1;
				}
				break;
			case Sine:
				{
				alt51=2;
				}
				break;
			case Tan:
				{
				alt51=3;
				}
				break;
			case ATan:
				{
				alt51=4;
				}
				break;
			case Random:
				{
				alt51=5;
				}
				break;
			case Pow:
				{
				alt51=6;
				}
				break;
			case Sqrt:
				{
				alt51=7;
				}
				break;
			case Sq:
				{
				alt51=8;
				}
				break;
			case Gaussian:
				{
				alt51=9;
				}
				break;
			case Noise:
				{
				alt51=10;
				}
				break;
			case Round:
				{
				alt51=11;
				}
				break;
			case Map:
				{
				alt51=12;
				}
				break;
			case Inch:
				{
				alt51=13;
				}
				break;
			case Mm:
				{
				alt51=14;
				}
				break;
			case Cm:
				{
				alt51=15;
				}
				break;
			case Units:
				{
				alt51=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:6: Cosine '(' expression ')'
					{
					Cosine251=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1818);  
					stream_Cosine.add(Cosine251);

					char_literal252=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1820);  
					stream_OParen.add(char_literal252);

					pushFollow(FOLLOW_expression_in_mathCall1822);
					expression253=expression();
					state._fsp--;

					stream_expression.add(expression253.getTree());
					char_literal254=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1824);  
					stream_CParen.add(char_literal254);

					// AST REWRITE
					// elements: expression, Cosine
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 179:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:37: ^( FUNC_CALL Cosine expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Cosine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: Sine '(' expression ')'
					{
					Sine255=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1843);  
					stream_Sine.add(Sine255);

					char_literal256=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1845);  
					stream_OParen.add(char_literal256);

					pushFollow(FOLLOW_expression_in_mathCall1847);
					expression257=expression();
					state._fsp--;

					stream_expression.add(expression257.getTree());
					char_literal258=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1849);  
					stream_CParen.add(char_literal258);

					// AST REWRITE
					// elements: Sine, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 180:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:35: ^( FUNC_CALL Sine expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Sine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:6: Tan '(' expression ')'
					{
					Tan259=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1868);  
					stream_Tan.add(Tan259);

					char_literal260=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1870);  
					stream_OParen.add(char_literal260);

					pushFollow(FOLLOW_expression_in_mathCall1872);
					expression261=expression();
					state._fsp--;

					stream_expression.add(expression261.getTree());
					char_literal262=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1874);  
					stream_CParen.add(char_literal262);

					// AST REWRITE
					// elements: Tan, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 181:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:34: ^( FUNC_CALL Tan expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Tan.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: ATan '(' ( exprList )? ')'
					{
					ATan263=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1893);  
					stream_ATan.add(ATan263);

					char_literal264=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1895);  
					stream_OParen.add(char_literal264);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:15: ( exprList )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==ATan||(LA45_0 >= Arc && LA45_0 <= Assert)||LA45_0==Bool||LA45_0==COLOR_CONSTANT||(LA45_0 >= Clip && LA45_0 <= Cm)||(LA45_0 >= Copy && LA45_0 <= Curve)||LA45_0==Difference||LA45_0==Ellipse||(LA45_0 >= Excl && LA45_0 <= Expand)||(LA45_0 >= Fill && LA45_0 <= Flatten)||(LA45_0 >= Gaussian && LA45_0 <= Hide)||LA45_0==Identifier||LA45_0==Inch||LA45_0==LAdd||(LA45_0 >= LRemove && LA45_0 <= LShape)||(LA45_0 >= Line && LA45_0 <= Mm)||(LA45_0 >= Move && LA45_0 <= MoveBy)||(LA45_0 >= NoFill && LA45_0 <= Number)||(LA45_0 >= OBracket && LA45_0 <= OParen)||(LA45_0 >= PI_CONSTANT && LA45_0 <= Println)||(LA45_0 >= Random && LA45_0 <= Rect)||(LA45_0 >= Rotate && LA45_0 <= Round)||(LA45_0 >= Scale && LA45_0 <= Slider)||(LA45_0 >= Sq && LA45_0 <= Subtract)||(LA45_0 >= Tan && LA45_0 <= Template)||(LA45_0 >= Union && LA45_0 <= Weight)||LA45_0==Xor) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1897);
							exprList265=exprList();
							state._fsp--;

							stream_exprList.add(exprList265.getTree());
							}
							break;

					}

					char_literal266=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1900);  
					stream_CParen.add(char_literal266);

					// AST REWRITE
					// elements: ATan, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:31: -> ^( FUNC_CALL ATan ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:34: ^( FUNC_CALL ATan ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_ATan.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:6: Random '(' ( exprList )? ')'
					{
					Random267=(Token)match(input,Random,FOLLOW_Random_in_mathCall1920);  
					stream_Random.add(Random267);

					char_literal268=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1922);  
					stream_OParen.add(char_literal268);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:17: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==ATan||(LA46_0 >= Arc && LA46_0 <= Assert)||LA46_0==Bool||LA46_0==COLOR_CONSTANT||(LA46_0 >= Clip && LA46_0 <= Cm)||(LA46_0 >= Copy && LA46_0 <= Curve)||LA46_0==Difference||LA46_0==Ellipse||(LA46_0 >= Excl && LA46_0 <= Expand)||(LA46_0 >= Fill && LA46_0 <= Flatten)||(LA46_0 >= Gaussian && LA46_0 <= Hide)||LA46_0==Identifier||LA46_0==Inch||LA46_0==LAdd||(LA46_0 >= LRemove && LA46_0 <= LShape)||(LA46_0 >= Line && LA46_0 <= Mm)||(LA46_0 >= Move && LA46_0 <= MoveBy)||(LA46_0 >= NoFill && LA46_0 <= Number)||(LA46_0 >= OBracket && LA46_0 <= OParen)||(LA46_0 >= PI_CONSTANT && LA46_0 <= Println)||(LA46_0 >= Random && LA46_0 <= Rect)||(LA46_0 >= Rotate && LA46_0 <= Round)||(LA46_0 >= Scale && LA46_0 <= Slider)||(LA46_0 >= Sq && LA46_0 <= Subtract)||(LA46_0 >= Tan && LA46_0 <= Template)||(LA46_0 >= Union && LA46_0 <= Weight)||LA46_0==Xor) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1924);
							exprList269=exprList();
							state._fsp--;

							stream_exprList.add(exprList269.getTree());
							}
							break;

					}

					char_literal270=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1927);  
					stream_CParen.add(char_literal270);

					// AST REWRITE
					// elements: Random, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 183:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:36: ^( FUNC_CALL Random ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:55: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:6: Pow '(' ( exprList )? ')'
					{
					Pow271=(Token)match(input,Pow,FOLLOW_Pow_in_mathCall1947);  
					stream_Pow.add(Pow271);

					char_literal272=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1949);  
					stream_OParen.add(char_literal272);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:14: ( exprList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==ATan||(LA47_0 >= Arc && LA47_0 <= Assert)||LA47_0==Bool||LA47_0==COLOR_CONSTANT||(LA47_0 >= Clip && LA47_0 <= Cm)||(LA47_0 >= Copy && LA47_0 <= Curve)||LA47_0==Difference||LA47_0==Ellipse||(LA47_0 >= Excl && LA47_0 <= Expand)||(LA47_0 >= Fill && LA47_0 <= Flatten)||(LA47_0 >= Gaussian && LA47_0 <= Hide)||LA47_0==Identifier||LA47_0==Inch||LA47_0==LAdd||(LA47_0 >= LRemove && LA47_0 <= LShape)||(LA47_0 >= Line && LA47_0 <= Mm)||(LA47_0 >= Move && LA47_0 <= MoveBy)||(LA47_0 >= NoFill && LA47_0 <= Number)||(LA47_0 >= OBracket && LA47_0 <= OParen)||(LA47_0 >= PI_CONSTANT && LA47_0 <= Println)||(LA47_0 >= Random && LA47_0 <= Rect)||(LA47_0 >= Rotate && LA47_0 <= Round)||(LA47_0 >= Scale && LA47_0 <= Slider)||(LA47_0 >= Sq && LA47_0 <= Subtract)||(LA47_0 >= Tan && LA47_0 <= Template)||(LA47_0 >= Union && LA47_0 <= Weight)||LA47_0==Xor) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1951);
							exprList273=exprList();
							state._fsp--;

							stream_exprList.add(exprList273.getTree());
							}
							break;

					}

					char_literal274=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1954);  
					stream_CParen.add(char_literal274);

					// AST REWRITE
					// elements: Pow, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 184:30: -> ^( FUNC_CALL Pow ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:33: ^( FUNC_CALL Pow ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Pow.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:49: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:6: Sqrt '(' expression ')'
					{
					Sqrt275=(Token)match(input,Sqrt,FOLLOW_Sqrt_in_mathCall1974);  
					stream_Sqrt.add(Sqrt275);

					char_literal276=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1976);  
					stream_OParen.add(char_literal276);

					pushFollow(FOLLOW_expression_in_mathCall1978);
					expression277=expression();
					state._fsp--;

					stream_expression.add(expression277.getTree());
					char_literal278=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1980);  
					stream_CParen.add(char_literal278);

					// AST REWRITE
					// elements: Sqrt, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 185:32: -> ^( FUNC_CALL Sqrt expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:35: ^( FUNC_CALL Sqrt expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Sqrt.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:6: Sq '(' expression ')'
					{
					Sq279=(Token)match(input,Sq,FOLLOW_Sq_in_mathCall1999);  
					stream_Sq.add(Sq279);

					char_literal280=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2001);  
					stream_OParen.add(char_literal280);

					pushFollow(FOLLOW_expression_in_mathCall2003);
					expression281=expression();
					state._fsp--;

					stream_expression.add(expression281.getTree());
					char_literal282=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2005);  
					stream_CParen.add(char_literal282);

					// AST REWRITE
					// elements: expression, Sq
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 186:30: -> ^( FUNC_CALL Sq expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:33: ^( FUNC_CALL Sq expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Sq.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:6: Gaussian '(' ( exprList )? ')'
					{
					Gaussian283=(Token)match(input,Gaussian,FOLLOW_Gaussian_in_mathCall2024);  
					stream_Gaussian.add(Gaussian283);

					char_literal284=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2026);  
					stream_OParen.add(char_literal284);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:19: ( exprList )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==ATan||(LA48_0 >= Arc && LA48_0 <= Assert)||LA48_0==Bool||LA48_0==COLOR_CONSTANT||(LA48_0 >= Clip && LA48_0 <= Cm)||(LA48_0 >= Copy && LA48_0 <= Curve)||LA48_0==Difference||LA48_0==Ellipse||(LA48_0 >= Excl && LA48_0 <= Expand)||(LA48_0 >= Fill && LA48_0 <= Flatten)||(LA48_0 >= Gaussian && LA48_0 <= Hide)||LA48_0==Identifier||LA48_0==Inch||LA48_0==LAdd||(LA48_0 >= LRemove && LA48_0 <= LShape)||(LA48_0 >= Line && LA48_0 <= Mm)||(LA48_0 >= Move && LA48_0 <= MoveBy)||(LA48_0 >= NoFill && LA48_0 <= Number)||(LA48_0 >= OBracket && LA48_0 <= OParen)||(LA48_0 >= PI_CONSTANT && LA48_0 <= Println)||(LA48_0 >= Random && LA48_0 <= Rect)||(LA48_0 >= Rotate && LA48_0 <= Round)||(LA48_0 >= Scale && LA48_0 <= Slider)||(LA48_0 >= Sq && LA48_0 <= Subtract)||(LA48_0 >= Tan && LA48_0 <= Template)||(LA48_0 >= Union && LA48_0 <= Weight)||LA48_0==Xor) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall2028);
							exprList285=exprList();
							state._fsp--;

							stream_exprList.add(exprList285.getTree());
							}
							break;

					}

					char_literal286=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2031);  
					stream_CParen.add(char_literal286);

					// AST REWRITE
					// elements: Gaussian, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 187:35: -> ^( FUNC_CALL Gaussian ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:38: ^( FUNC_CALL Gaussian ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Gaussian.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:59: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:6: Noise '(' ( exprList )? ')'
					{
					Noise287=(Token)match(input,Noise,FOLLOW_Noise_in_mathCall2051);  
					stream_Noise.add(Noise287);

					char_literal288=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2053);  
					stream_OParen.add(char_literal288);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:16: ( exprList )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==ATan||(LA49_0 >= Arc && LA49_0 <= Assert)||LA49_0==Bool||LA49_0==COLOR_CONSTANT||(LA49_0 >= Clip && LA49_0 <= Cm)||(LA49_0 >= Copy && LA49_0 <= Curve)||LA49_0==Difference||LA49_0==Ellipse||(LA49_0 >= Excl && LA49_0 <= Expand)||(LA49_0 >= Fill && LA49_0 <= Flatten)||(LA49_0 >= Gaussian && LA49_0 <= Hide)||LA49_0==Identifier||LA49_0==Inch||LA49_0==LAdd||(LA49_0 >= LRemove && LA49_0 <= LShape)||(LA49_0 >= Line && LA49_0 <= Mm)||(LA49_0 >= Move && LA49_0 <= MoveBy)||(LA49_0 >= NoFill && LA49_0 <= Number)||(LA49_0 >= OBracket && LA49_0 <= OParen)||(LA49_0 >= PI_CONSTANT && LA49_0 <= Println)||(LA49_0 >= Random && LA49_0 <= Rect)||(LA49_0 >= Rotate && LA49_0 <= Round)||(LA49_0 >= Scale && LA49_0 <= Slider)||(LA49_0 >= Sq && LA49_0 <= Subtract)||(LA49_0 >= Tan && LA49_0 <= Template)||(LA49_0 >= Union && LA49_0 <= Weight)||LA49_0==Xor) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall2055);
							exprList289=exprList();
							state._fsp--;

							stream_exprList.add(exprList289.getTree());
							}
							break;

					}

					char_literal290=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2058);  
					stream_CParen.add(char_literal290);

					// AST REWRITE
					// elements: Noise, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 188:32: -> ^( FUNC_CALL Noise ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:35: ^( FUNC_CALL Noise ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Noise.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:53: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:6: Round '(' expression ')'
					{
					Round291=(Token)match(input,Round,FOLLOW_Round_in_mathCall2078);  
					stream_Round.add(Round291);

					char_literal292=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2079);  
					stream_OParen.add(char_literal292);

					pushFollow(FOLLOW_expression_in_mathCall2081);
					expression293=expression();
					state._fsp--;

					stream_expression.add(expression293.getTree());
					char_literal294=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2083);  
					stream_CParen.add(char_literal294);

					// AST REWRITE
					// elements: Round, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 189:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:35: ^( FUNC_CALL Round expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Round.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:6: Map '(' ( exprList )? ')'
					{
					Map295=(Token)match(input,Map,FOLLOW_Map_in_mathCall2102);  
					stream_Map.add(Map295);

					char_literal296=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2103);  
					stream_OParen.add(char_literal296);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:13: ( exprList )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==ATan||(LA50_0 >= Arc && LA50_0 <= Assert)||LA50_0==Bool||LA50_0==COLOR_CONSTANT||(LA50_0 >= Clip && LA50_0 <= Cm)||(LA50_0 >= Copy && LA50_0 <= Curve)||LA50_0==Difference||LA50_0==Ellipse||(LA50_0 >= Excl && LA50_0 <= Expand)||(LA50_0 >= Fill && LA50_0 <= Flatten)||(LA50_0 >= Gaussian && LA50_0 <= Hide)||LA50_0==Identifier||LA50_0==Inch||LA50_0==LAdd||(LA50_0 >= LRemove && LA50_0 <= LShape)||(LA50_0 >= Line && LA50_0 <= Mm)||(LA50_0 >= Move && LA50_0 <= MoveBy)||(LA50_0 >= NoFill && LA50_0 <= Number)||(LA50_0 >= OBracket && LA50_0 <= OParen)||(LA50_0 >= PI_CONSTANT && LA50_0 <= Println)||(LA50_0 >= Random && LA50_0 <= Rect)||(LA50_0 >= Rotate && LA50_0 <= Round)||(LA50_0 >= Scale && LA50_0 <= Slider)||(LA50_0 >= Sq && LA50_0 <= Subtract)||(LA50_0 >= Tan && LA50_0 <= Template)||(LA50_0 >= Union && LA50_0 <= Weight)||LA50_0==Xor) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall2105);
							exprList297=exprList();
							state._fsp--;

							stream_exprList.add(exprList297.getTree());
							}
							break;

					}

					char_literal298=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2108);  
					stream_CParen.add(char_literal298);

					// AST REWRITE
					// elements: Map, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 190:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:32: ^( FUNC_CALL Map ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:48: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:6: Inch '(' expression ')'
					{
					Inch299=(Token)match(input,Inch,FOLLOW_Inch_in_mathCall2128);  
					stream_Inch.add(Inch299);

					char_literal300=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2130);  
					stream_OParen.add(char_literal300);

					pushFollow(FOLLOW_expression_in_mathCall2132);
					expression301=expression();
					state._fsp--;

					stream_expression.add(expression301.getTree());
					char_literal302=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2134);  
					stream_CParen.add(char_literal302);

					// AST REWRITE
					// elements: expression, Inch
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 191:32: -> ^( FUNC_CALL Inch expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:35: ^( FUNC_CALL Inch expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Inch.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:6: Mm '(' expression ')'
					{
					Mm303=(Token)match(input,Mm,FOLLOW_Mm_in_mathCall2153);  
					stream_Mm.add(Mm303);

					char_literal304=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2155);  
					stream_OParen.add(char_literal304);

					pushFollow(FOLLOW_expression_in_mathCall2157);
					expression305=expression();
					state._fsp--;

					stream_expression.add(expression305.getTree());
					char_literal306=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2159);  
					stream_CParen.add(char_literal306);

					// AST REWRITE
					// elements: expression, Mm
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 192:30: -> ^( FUNC_CALL Mm expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:33: ^( FUNC_CALL Mm expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Mm.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:6: Cm '(' expression ')'
					{
					Cm307=(Token)match(input,Cm,FOLLOW_Cm_in_mathCall2178);  
					stream_Cm.add(Cm307);

					char_literal308=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2180);  
					stream_OParen.add(char_literal308);

					pushFollow(FOLLOW_expression_in_mathCall2182);
					expression309=expression();
					state._fsp--;

					stream_expression.add(expression309.getTree());
					char_literal310=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2184);  
					stream_CParen.add(char_literal310);

					// AST REWRITE
					// elements: Cm, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 193:30: -> ^( FUNC_CALL Cm expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:33: ^( FUNC_CALL Cm expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Cm.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:6: Units '(' expression ')'
					{
					Units311=(Token)match(input,Units,FOLLOW_Units_in_mathCall2203);  
					stream_Units.add(Units311);

					char_literal312=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2204);  
					stream_OParen.add(char_literal312);

					pushFollow(FOLLOW_expression_in_mathCall2206);
					expression313=expression();
					state._fsp--;

					stream_expression.add(expression313.getTree());
					char_literal314=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2208);  
					stream_CParen.add(char_literal314);

					// AST REWRITE
					// elements: Units, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:32: -> ^( FUNC_CALL Units expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:35: ^( FUNC_CALL Units expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Units.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mathCall"


	public static class uICall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "uICall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:3: uICall : Slider '(' ( exprList )? ')' -> ^( FUNC_CALL Slider ( exprList )? ) ;
	public final PogoParser.uICall_return uICall() throws RecognitionException {
		PogoParser.uICall_return retval = new PogoParser.uICall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Slider315=null;
		Token char_literal316=null;
		Token char_literal318=null;
		ParserRuleReturnScope exprList317 =null;

		Object Slider315_tree=null;
		Object char_literal316_tree=null;
		Object char_literal318_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Slider=new RewriteRuleTokenStream(adaptor,"token Slider");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:4: ( Slider '(' ( exprList )? ')' -> ^( FUNC_CALL Slider ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:5: Slider '(' ( exprList )? ')'
			{
			Slider315=(Token)match(input,Slider,FOLLOW_Slider_in_uICall2239);  
			stream_Slider.add(Slider315);

			char_literal316=(Token)match(input,OParen,FOLLOW_OParen_in_uICall2241);  
			stream_OParen.add(char_literal316);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:16: ( exprList )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==ATan||(LA52_0 >= Arc && LA52_0 <= Assert)||LA52_0==Bool||LA52_0==COLOR_CONSTANT||(LA52_0 >= Clip && LA52_0 <= Cm)||(LA52_0 >= Copy && LA52_0 <= Curve)||LA52_0==Difference||LA52_0==Ellipse||(LA52_0 >= Excl && LA52_0 <= Expand)||(LA52_0 >= Fill && LA52_0 <= Flatten)||(LA52_0 >= Gaussian && LA52_0 <= Hide)||LA52_0==Identifier||LA52_0==Inch||LA52_0==LAdd||(LA52_0 >= LRemove && LA52_0 <= LShape)||(LA52_0 >= Line && LA52_0 <= Mm)||(LA52_0 >= Move && LA52_0 <= MoveBy)||(LA52_0 >= NoFill && LA52_0 <= Number)||(LA52_0 >= OBracket && LA52_0 <= OParen)||(LA52_0 >= PI_CONSTANT && LA52_0 <= Println)||(LA52_0 >= Random && LA52_0 <= Rect)||(LA52_0 >= Rotate && LA52_0 <= Round)||(LA52_0 >= Scale && LA52_0 <= Slider)||(LA52_0 >= Sq && LA52_0 <= Subtract)||(LA52_0 >= Tan && LA52_0 <= Template)||(LA52_0 >= Union && LA52_0 <= Weight)||LA52_0==Xor) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:16: exprList
					{
					pushFollow(FOLLOW_exprList_in_uICall2243);
					exprList317=exprList();
					state._fsp--;

					stream_exprList.add(exprList317.getTree());
					}
					break;

			}

			char_literal318=(Token)match(input,CParen,FOLLOW_CParen_in_uICall2246);  
			stream_CParen.add(char_literal318);

			// AST REWRITE
			// elements: exprList, Slider
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 198:32: -> ^( FUNC_CALL Slider ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:35: ^( FUNC_CALL Slider ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_Slider.nextNode());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:54: ( exprList )?
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uICall"


	public static class templateCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "templateCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:3: templateCall : ( Template '(' ( exprList )? ')' -> ^( FUNC_CALL Template ( exprList )? ) | SetWidth '(' ( exprList )? ')' -> ^( FUNC_CALL SetWidth ( exprList )? ) | SetHeight '(' ( exprList )? ')' -> ^( FUNC_CALL SetHeight ( exprList )? ) | SetSeam '(' ( exprList )? ')' -> ^( FUNC_CALL SetSeam ( exprList )? ) | SetName '(' ( exprList )? ')' -> ^( FUNC_CALL SetName ( exprList )? ) );
	public final PogoParser.templateCall_return templateCall() throws RecognitionException {
		PogoParser.templateCall_return retval = new PogoParser.templateCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Template319=null;
		Token char_literal320=null;
		Token char_literal322=null;
		Token SetWidth323=null;
		Token char_literal324=null;
		Token char_literal326=null;
		Token SetHeight327=null;
		Token char_literal328=null;
		Token char_literal330=null;
		Token SetSeam331=null;
		Token char_literal332=null;
		Token char_literal334=null;
		Token SetName335=null;
		Token char_literal336=null;
		Token char_literal338=null;
		ParserRuleReturnScope exprList321 =null;
		ParserRuleReturnScope exprList325 =null;
		ParserRuleReturnScope exprList329 =null;
		ParserRuleReturnScope exprList333 =null;
		ParserRuleReturnScope exprList337 =null;

		Object Template319_tree=null;
		Object char_literal320_tree=null;
		Object char_literal322_tree=null;
		Object SetWidth323_tree=null;
		Object char_literal324_tree=null;
		Object char_literal326_tree=null;
		Object SetHeight327_tree=null;
		Object char_literal328_tree=null;
		Object char_literal330_tree=null;
		Object SetSeam331_tree=null;
		Object char_literal332_tree=null;
		Object char_literal334_tree=null;
		Object SetName335_tree=null;
		Object char_literal336_tree=null;
		Object char_literal338_tree=null;
		RewriteRuleTokenStream stream_SetWidth=new RewriteRuleTokenStream(adaptor,"token SetWidth");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Template=new RewriteRuleTokenStream(adaptor,"token Template");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_SetSeam=new RewriteRuleTokenStream(adaptor,"token SetSeam");
		RewriteRuleTokenStream stream_SetName=new RewriteRuleTokenStream(adaptor,"token SetName");
		RewriteRuleTokenStream stream_SetHeight=new RewriteRuleTokenStream(adaptor,"token SetHeight");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:4: ( Template '(' ( exprList )? ')' -> ^( FUNC_CALL Template ( exprList )? ) | SetWidth '(' ( exprList )? ')' -> ^( FUNC_CALL SetWidth ( exprList )? ) | SetHeight '(' ( exprList )? ')' -> ^( FUNC_CALL SetHeight ( exprList )? ) | SetSeam '(' ( exprList )? ')' -> ^( FUNC_CALL SetSeam ( exprList )? ) | SetName '(' ( exprList )? ')' -> ^( FUNC_CALL SetName ( exprList )? ) )
			int alt58=5;
			switch ( input.LA(1) ) {
			case Template:
				{
				alt58=1;
				}
				break;
			case SetWidth:
				{
				alt58=2;
				}
				break;
			case SetHeight:
				{
				alt58=3;
				}
				break;
			case SetSeam:
				{
				alt58=4;
				}
				break;
			case SetName:
				{
				alt58=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:5: Template '(' ( exprList )? ')'
					{
					Template319=(Token)match(input,Template,FOLLOW_Template_in_templateCall2279);  
					stream_Template.add(Template319);

					char_literal320=(Token)match(input,OParen,FOLLOW_OParen_in_templateCall2281);  
					stream_OParen.add(char_literal320);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:18: ( exprList )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==ATan||(LA53_0 >= Arc && LA53_0 <= Assert)||LA53_0==Bool||LA53_0==COLOR_CONSTANT||(LA53_0 >= Clip && LA53_0 <= Cm)||(LA53_0 >= Copy && LA53_0 <= Curve)||LA53_0==Difference||LA53_0==Ellipse||(LA53_0 >= Excl && LA53_0 <= Expand)||(LA53_0 >= Fill && LA53_0 <= Flatten)||(LA53_0 >= Gaussian && LA53_0 <= Hide)||LA53_0==Identifier||LA53_0==Inch||LA53_0==LAdd||(LA53_0 >= LRemove && LA53_0 <= LShape)||(LA53_0 >= Line && LA53_0 <= Mm)||(LA53_0 >= Move && LA53_0 <= MoveBy)||(LA53_0 >= NoFill && LA53_0 <= Number)||(LA53_0 >= OBracket && LA53_0 <= OParen)||(LA53_0 >= PI_CONSTANT && LA53_0 <= Println)||(LA53_0 >= Random && LA53_0 <= Rect)||(LA53_0 >= Rotate && LA53_0 <= Round)||(LA53_0 >= Scale && LA53_0 <= Slider)||(LA53_0 >= Sq && LA53_0 <= Subtract)||(LA53_0 >= Tan && LA53_0 <= Template)||(LA53_0 >= Union && LA53_0 <= Weight)||LA53_0==Xor) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall2283);
							exprList321=exprList();
							state._fsp--;

							stream_exprList.add(exprList321.getTree());
							}
							break;

					}

					char_literal322=(Token)match(input,CParen,FOLLOW_CParen_in_templateCall2286);  
					stream_CParen.add(char_literal322);

					// AST REWRITE
					// elements: exprList, Template
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 202:34: -> ^( FUNC_CALL Template ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:37: ^( FUNC_CALL Template ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Template.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:58: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:5: SetWidth '(' ( exprList )? ')'
					{
					SetWidth323=(Token)match(input,SetWidth,FOLLOW_SetWidth_in_templateCall2305);  
					stream_SetWidth.add(SetWidth323);

					char_literal324=(Token)match(input,OParen,FOLLOW_OParen_in_templateCall2307);  
					stream_OParen.add(char_literal324);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:18: ( exprList )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==ATan||(LA54_0 >= Arc && LA54_0 <= Assert)||LA54_0==Bool||LA54_0==COLOR_CONSTANT||(LA54_0 >= Clip && LA54_0 <= Cm)||(LA54_0 >= Copy && LA54_0 <= Curve)||LA54_0==Difference||LA54_0==Ellipse||(LA54_0 >= Excl && LA54_0 <= Expand)||(LA54_0 >= Fill && LA54_0 <= Flatten)||(LA54_0 >= Gaussian && LA54_0 <= Hide)||LA54_0==Identifier||LA54_0==Inch||LA54_0==LAdd||(LA54_0 >= LRemove && LA54_0 <= LShape)||(LA54_0 >= Line && LA54_0 <= Mm)||(LA54_0 >= Move && LA54_0 <= MoveBy)||(LA54_0 >= NoFill && LA54_0 <= Number)||(LA54_0 >= OBracket && LA54_0 <= OParen)||(LA54_0 >= PI_CONSTANT && LA54_0 <= Println)||(LA54_0 >= Random && LA54_0 <= Rect)||(LA54_0 >= Rotate && LA54_0 <= Round)||(LA54_0 >= Scale && LA54_0 <= Slider)||(LA54_0 >= Sq && LA54_0 <= Subtract)||(LA54_0 >= Tan && LA54_0 <= Template)||(LA54_0 >= Union && LA54_0 <= Weight)||LA54_0==Xor) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall2309);
							exprList325=exprList();
							state._fsp--;

							stream_exprList.add(exprList325.getTree());
							}
							break;

					}

					char_literal326=(Token)match(input,CParen,FOLLOW_CParen_in_templateCall2312);  
					stream_CParen.add(char_literal326);

					// AST REWRITE
					// elements: SetWidth, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 203:34: -> ^( FUNC_CALL SetWidth ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:37: ^( FUNC_CALL SetWidth ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SetWidth.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:58: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:5: SetHeight '(' ( exprList )? ')'
					{
					SetHeight327=(Token)match(input,SetHeight,FOLLOW_SetHeight_in_templateCall2331);  
					stream_SetHeight.add(SetHeight327);

					char_literal328=(Token)match(input,OParen,FOLLOW_OParen_in_templateCall2333);  
					stream_OParen.add(char_literal328);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:19: ( exprList )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==ATan||(LA55_0 >= Arc && LA55_0 <= Assert)||LA55_0==Bool||LA55_0==COLOR_CONSTANT||(LA55_0 >= Clip && LA55_0 <= Cm)||(LA55_0 >= Copy && LA55_0 <= Curve)||LA55_0==Difference||LA55_0==Ellipse||(LA55_0 >= Excl && LA55_0 <= Expand)||(LA55_0 >= Fill && LA55_0 <= Flatten)||(LA55_0 >= Gaussian && LA55_0 <= Hide)||LA55_0==Identifier||LA55_0==Inch||LA55_0==LAdd||(LA55_0 >= LRemove && LA55_0 <= LShape)||(LA55_0 >= Line && LA55_0 <= Mm)||(LA55_0 >= Move && LA55_0 <= MoveBy)||(LA55_0 >= NoFill && LA55_0 <= Number)||(LA55_0 >= OBracket && LA55_0 <= OParen)||(LA55_0 >= PI_CONSTANT && LA55_0 <= Println)||(LA55_0 >= Random && LA55_0 <= Rect)||(LA55_0 >= Rotate && LA55_0 <= Round)||(LA55_0 >= Scale && LA55_0 <= Slider)||(LA55_0 >= Sq && LA55_0 <= Subtract)||(LA55_0 >= Tan && LA55_0 <= Template)||(LA55_0 >= Union && LA55_0 <= Weight)||LA55_0==Xor) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall2335);
							exprList329=exprList();
							state._fsp--;

							stream_exprList.add(exprList329.getTree());
							}
							break;

					}

					char_literal330=(Token)match(input,CParen,FOLLOW_CParen_in_templateCall2338);  
					stream_CParen.add(char_literal330);

					// AST REWRITE
					// elements: SetHeight, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 204:35: -> ^( FUNC_CALL SetHeight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:38: ^( FUNC_CALL SetHeight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SetHeight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:60: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:5: SetSeam '(' ( exprList )? ')'
					{
					SetSeam331=(Token)match(input,SetSeam,FOLLOW_SetSeam_in_templateCall2357);  
					stream_SetSeam.add(SetSeam331);

					char_literal332=(Token)match(input,OParen,FOLLOW_OParen_in_templateCall2359);  
					stream_OParen.add(char_literal332);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:17: ( exprList )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==ATan||(LA56_0 >= Arc && LA56_0 <= Assert)||LA56_0==Bool||LA56_0==COLOR_CONSTANT||(LA56_0 >= Clip && LA56_0 <= Cm)||(LA56_0 >= Copy && LA56_0 <= Curve)||LA56_0==Difference||LA56_0==Ellipse||(LA56_0 >= Excl && LA56_0 <= Expand)||(LA56_0 >= Fill && LA56_0 <= Flatten)||(LA56_0 >= Gaussian && LA56_0 <= Hide)||LA56_0==Identifier||LA56_0==Inch||LA56_0==LAdd||(LA56_0 >= LRemove && LA56_0 <= LShape)||(LA56_0 >= Line && LA56_0 <= Mm)||(LA56_0 >= Move && LA56_0 <= MoveBy)||(LA56_0 >= NoFill && LA56_0 <= Number)||(LA56_0 >= OBracket && LA56_0 <= OParen)||(LA56_0 >= PI_CONSTANT && LA56_0 <= Println)||(LA56_0 >= Random && LA56_0 <= Rect)||(LA56_0 >= Rotate && LA56_0 <= Round)||(LA56_0 >= Scale && LA56_0 <= Slider)||(LA56_0 >= Sq && LA56_0 <= Subtract)||(LA56_0 >= Tan && LA56_0 <= Template)||(LA56_0 >= Union && LA56_0 <= Weight)||LA56_0==Xor) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall2361);
							exprList333=exprList();
							state._fsp--;

							stream_exprList.add(exprList333.getTree());
							}
							break;

					}

					char_literal334=(Token)match(input,CParen,FOLLOW_CParen_in_templateCall2364);  
					stream_CParen.add(char_literal334);

					// AST REWRITE
					// elements: SetSeam, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 205:33: -> ^( FUNC_CALL SetSeam ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:36: ^( FUNC_CALL SetSeam ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SetSeam.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:56: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:5: SetName '(' ( exprList )? ')'
					{
					SetName335=(Token)match(input,SetName,FOLLOW_SetName_in_templateCall2383);  
					stream_SetName.add(SetName335);

					char_literal336=(Token)match(input,OParen,FOLLOW_OParen_in_templateCall2385);  
					stream_OParen.add(char_literal336);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:17: ( exprList )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==ATan||(LA57_0 >= Arc && LA57_0 <= Assert)||LA57_0==Bool||LA57_0==COLOR_CONSTANT||(LA57_0 >= Clip && LA57_0 <= Cm)||(LA57_0 >= Copy && LA57_0 <= Curve)||LA57_0==Difference||LA57_0==Ellipse||(LA57_0 >= Excl && LA57_0 <= Expand)||(LA57_0 >= Fill && LA57_0 <= Flatten)||(LA57_0 >= Gaussian && LA57_0 <= Hide)||LA57_0==Identifier||LA57_0==Inch||LA57_0==LAdd||(LA57_0 >= LRemove && LA57_0 <= LShape)||(LA57_0 >= Line && LA57_0 <= Mm)||(LA57_0 >= Move && LA57_0 <= MoveBy)||(LA57_0 >= NoFill && LA57_0 <= Number)||(LA57_0 >= OBracket && LA57_0 <= OParen)||(LA57_0 >= PI_CONSTANT && LA57_0 <= Println)||(LA57_0 >= Random && LA57_0 <= Rect)||(LA57_0 >= Rotate && LA57_0 <= Round)||(LA57_0 >= Scale && LA57_0 <= Slider)||(LA57_0 >= Sq && LA57_0 <= Subtract)||(LA57_0 >= Tan && LA57_0 <= Template)||(LA57_0 >= Union && LA57_0 <= Weight)||LA57_0==Xor) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_templateCall2387);
							exprList337=exprList();
							state._fsp--;

							stream_exprList.add(exprList337.getTree());
							}
							break;

					}

					char_literal338=(Token)match(input,CParen,FOLLOW_CParen_in_templateCall2390);  
					stream_CParen.add(char_literal338);

					// AST REWRITE
					// elements: exprList, SetName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 206:33: -> ^( FUNC_CALL SetName ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:36: ^( FUNC_CALL SetName ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SetName.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:56: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "templateCall"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End342=null;
		ParserRuleReturnScope ifStat339 =null;
		ParserRuleReturnScope elseIfStat340 =null;
		ParserRuleReturnScope elseStat341 =null;

		Object End342_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement2425);
			ifStat339=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat339.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:13: ( elseIfStat )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==Else) ) {
					int LA59_1 = input.LA(2);
					if ( (LA59_1==If) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement2427);
					elseIfStat340=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat340.getTree());
					}
					break;

				default :
					break loop59;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:25: ( elseStat )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Else) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement2430);
					elseStat341=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat341.getTree());
					}
					break;

			}

			End342=(Token)match(input,End,FOLLOW_End_in_ifStatement2433);  
			stream_End.add(End342);

			// AST REWRITE
			// elements: ifStat, elseStat, elseIfStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 212:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:66: ( elseStat )?
				if ( stream_elseStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseStat.nextTree());
				}
				stream_elseStat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class ifStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If343=null;
		Token Do345=null;
		ParserRuleReturnScope expression344 =null;
		ParserRuleReturnScope block346 =null;

		Object If343_tree=null;
		Object Do345_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:6: If expression Do block
			{
			If343=(Token)match(input,If,FOLLOW_If_in_ifStat2462);  
			stream_If.add(If343);

			pushFollow(FOLLOW_expression_in_ifStat2464);
			expression344=expression();
			state._fsp--;

			stream_expression.add(expression344.getTree());
			Do345=(Token)match(input,Do,FOLLOW_Do_in_ifStat2466);  
			stream_Do.add(Do345);

			pushFollow(FOLLOW_block_in_ifStat2468);
			block346=block();
			state._fsp--;

			stream_block.add(block346.getTree());
			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 217:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:32: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStat"


	public static class elseIfStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseIfStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else347=null;
		Token If348=null;
		Token Do350=null;
		ParserRuleReturnScope expression349 =null;
		ParserRuleReturnScope block351 =null;

		Object Else347_tree=null;
		Object If348_tree=null;
		Object Do350_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:6: Else If expression Do block
			{
			Else347=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat2492);  
			stream_Else.add(Else347);

			If348=(Token)match(input,If,FOLLOW_If_in_elseIfStat2494);  
			stream_If.add(If348);

			pushFollow(FOLLOW_expression_in_elseIfStat2496);
			expression349=expression();
			state._fsp--;

			stream_expression.add(expression349.getTree());
			Do350=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat2498);  
			stream_Do.add(Do350);

			pushFollow(FOLLOW_block_in_elseIfStat2500);
			block351=block();
			state._fsp--;

			stream_block.add(block351.getTree());
			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 221:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:37: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseIfStat"


	public static class elseStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseStat"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else352=null;
		Token Do353=null;
		ParserRuleReturnScope block354 =null;

		Object Else352_tree=null;
		Object Do353_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:6: Else Do block
			{
			Else352=(Token)match(input,Else,FOLLOW_Else_in_elseStat2524);  
			stream_Else.add(Else352);

			Do353=(Token)match(input,Do,FOLLOW_Do_in_elseStat2526);  
			stream_Do.add(Do353);

			pushFollow(FOLLOW_block_in_elseStat2528);
			block354=block();
			state._fsp--;

			stream_block.add(block354.getTree());
			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 225:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:23: ^( EXP block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseStat"


	public static class functionDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDecl"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def355=null;
		Token Identifier356=null;
		Token char_literal357=null;
		Token char_literal359=null;
		Token Do360=null;
		Token End362=null;
		ParserRuleReturnScope idList358 =null;
		ParserRuleReturnScope block361 =null;

		Object Def355_tree=null;
		Object Identifier356_tree=null;
		Object char_literal357_tree=null;
		Object char_literal359_tree=null;
		Object Do360_tree=null;
		Object End362_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def355=(Token)match(input,Def,FOLLOW_Def_in_functionDecl2550); 
			Def355_tree = (Object)adaptor.create(Def355);
			adaptor.addChild(root_0, Def355_tree);

			Identifier356=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl2552); 
			Identifier356_tree = (Object)adaptor.create(Identifier356);
			adaptor.addChild(root_0, Identifier356_tree);

			char_literal357=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl2554); 
			char_literal357_tree = (Object)adaptor.create(char_literal357);
			adaptor.addChild(root_0, char_literal357_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:25: ( idList )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==Identifier) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl2556);
					idList358=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList358.getTree());

					}
					break;

			}

			char_literal359=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl2559); 
			char_literal359_tree = (Object)adaptor.create(char_literal359);
			adaptor.addChild(root_0, char_literal359_tree);

			Do360=(Token)match(input,Do,FOLLOW_Do_in_functionDecl2561); 
			Do360_tree = (Object)adaptor.create(Do360);
			adaptor.addChild(root_0, Do360_tree);

			pushFollow(FOLLOW_block_in_functionDecl2563);
			block361=block();
			state._fsp--;

			adaptor.addChild(root_0, block361.getTree());

			End362=(Token)match(input,End,FOLLOW_End_in_functionDecl2565); 
			End362_tree = (Object)adaptor.create(End362);
			adaptor.addChild(root_0, End362_tree);

			defineFunction((Identifier356!=null?Identifier356.getText():null), (idList358!=null?((Object)idList358.getTree()):null), (block361!=null?((Object)block361.getTree()):null));
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDecl"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For363=null;
		Token Identifier364=null;
		Token char_literal365=null;
		Token Do367=null;
		Token Do369=null;
		Token End371=null;
		ParserRuleReturnScope expression366 =null;
		ParserRuleReturnScope expression368 =null;
		ParserRuleReturnScope block370 =null;

		Object For363_tree=null;
		Object Identifier364_tree=null;
		Object char_literal365_tree=null;
		Object Do367_tree=null;
		Object Do369_tree=null;
		Object End371_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:6: For Identifier '=' expression Do expression Do block End
			{
			For363=(Token)match(input,For,FOLLOW_For_in_forStatement2587);  
			stream_For.add(For363);

			Identifier364=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement2589);  
			stream_Identifier.add(Identifier364);

			char_literal365=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement2591);  
			stream_Assign.add(char_literal365);

			pushFollow(FOLLOW_expression_in_forStatement2593);
			expression366=expression();
			state._fsp--;

			stream_expression.add(expression366.getTree());
			Do367=(Token)match(input,Do,FOLLOW_Do_in_forStatement2595);  
			stream_Do.add(Do367);

			pushFollow(FOLLOW_expression_in_forStatement2597);
			expression368=expression();
			state._fsp--;

			stream_expression.add(expression368.getTree());
			Do369=(Token)match(input,Do,FOLLOW_Do_in_forStatement2599);  
			stream_Do.add(Do369);

			pushFollow(FOLLOW_block_in_forStatement2601);
			block370=block();
			state._fsp--;

			stream_block.add(block370.getTree());
			End371=(Token)match(input,End,FOLLOW_End_in_forStatement2603);  
			stream_End.add(End371);

			// AST REWRITE
			// elements: expression, Identifier, block, expression, For
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 235:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:9: ^( For Identifier expression expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class repeatStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "repeatStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:1: repeatStatement : Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End -> ^( Repeat Identifier expression expression ( expression )? block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat372=null;
		Token Identifier373=null;
		Token char_literal374=null;
		Token Do376=null;
		Token string_literal378=null;
		Token Do380=null;
		Token End382=null;
		ParserRuleReturnScope expression375 =null;
		ParserRuleReturnScope expression377 =null;
		ParserRuleReturnScope expression379 =null;
		ParserRuleReturnScope block381 =null;

		Object Repeat372_tree=null;
		Object Identifier373_tree=null;
		Object char_literal374_tree=null;
		Object Do376_tree=null;
		Object string_literal378_tree=null;
		Object Do380_tree=null;
		Object End382_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_LAdd=new RewriteRuleTokenStream(adaptor,"token LAdd");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:3: ( Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End -> ^( Repeat Identifier expression expression ( expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:5: Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End
			{
			Repeat372=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement2636);  
			stream_Repeat.add(Repeat372);

			Identifier373=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement2638);  
			stream_Identifier.add(Identifier373);

			char_literal374=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement2640);  
			stream_Assign.add(char_literal374);

			pushFollow(FOLLOW_expression_in_repeatStatement2642);
			expression375=expression();
			state._fsp--;

			stream_expression.add(expression375.getTree());
			Do376=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement2644);  
			stream_Do.add(Do376);

			pushFollow(FOLLOW_expression_in_repeatStatement2646);
			expression377=expression();
			state._fsp--;

			stream_expression.add(expression377.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:52: ( 'add' expression )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LAdd) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:53: 'add' expression
					{
					string_literal378=(Token)match(input,LAdd,FOLLOW_LAdd_in_repeatStatement2649);  
					stream_LAdd.add(string_literal378);

					pushFollow(FOLLOW_expression_in_repeatStatement2651);
					expression379=expression();
					state._fsp--;

					stream_expression.add(expression379.getTree());
					}
					break;

				default :
					break loop62;
				}
			}

			Do380=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement2655);  
			stream_Do.add(Do380);

			pushFollow(FOLLOW_block_in_repeatStatement2657);
			block381=block();
			state._fsp--;

			stream_block.add(block381.getTree());
			End382=(Token)match(input,End,FOLLOW_End_in_repeatStatement2659);  
			stream_End.add(End382);

			// AST REWRITE
			// elements: expression, expression, Repeat, Identifier, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 239:85: -> ^( Repeat Identifier expression expression ( expression )? block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:88: ^( Repeat Identifier expression expression ( expression )? block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Repeat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:130: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While383=null;
		Token Do385=null;
		Token End387=null;
		ParserRuleReturnScope expression384 =null;
		ParserRuleReturnScope block386 =null;

		Object While383_tree=null;
		Object Do385_tree=null;
		Object End387_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:6: While expression Do block End
			{
			While383=(Token)match(input,While,FOLLOW_While_in_whileStatement2692);  
			stream_While.add(While383);

			pushFollow(FOLLOW_expression_in_whileStatement2694);
			expression384=expression();
			state._fsp--;

			stream_expression.add(expression384.getTree());
			Do385=(Token)match(input,Do,FOLLOW_Do_in_whileStatement2696);  
			stream_Do.add(Do385);

			pushFollow(FOLLOW_block_in_whileStatement2698);
			block386=block();
			state._fsp--;

			stream_block.add(block386.getTree());
			End387=(Token)match(input,End,FOLLOW_End_in_whileStatement2700);  
			stream_End.add(End387);

			// AST REWRITE
			// elements: While, expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 243:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:39: ^( While expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class idList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:246:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier388=null;
		Token char_literal389=null;
		Token Identifier390=null;

		Object Identifier388_tree=null;
		Object char_literal389_tree=null;
		Object Identifier390_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:6: Identifier ( ',' Identifier )*
			{
			Identifier388=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2724);  
			stream_Identifier.add(Identifier388);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:17: ( ',' Identifier )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==Comma) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:18: ',' Identifier
					{
					char_literal389=(Token)match(input,Comma,FOLLOW_Comma_in_idList2727);  
					stream_Comma.add(char_literal389);

					Identifier390=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2729);  
					stream_Identifier.add(Identifier390);

					}
					break;

				default :
					break loop63;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 247:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:38: ^( ID_LIST ( Identifier )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idList"


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal392=null;
		ParserRuleReturnScope expression391 =null;
		ParserRuleReturnScope expression393 =null;

		Object char_literal392_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList2754);
			expression391=expression();
			state._fsp--;

			stream_expression.add(expression391.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:17: ( ',' expression )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==Comma) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:18: ',' expression
					{
					char_literal392=(Token)match(input,Comma,FOLLOW_Comma_in_exprList2757);  
					stream_Comma.add(char_literal392);

					pushFollow(FOLLOW_expression_in_exprList2759);
					expression393=expression();
					state._fsp--;

					stream_expression.add(expression393.getTree());
					}
					break;

				default :
					break loop64;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 251:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:38: ^( EXP_LIST ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr394 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression2784);
			condExpr394=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr394.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal396=null;
		Token char_literal397=null;
		Token In398=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr395 =null;
		ParserRuleReturnScope expression399 =null;

		Object char_literal396_tree=null;
		Object char_literal397_tree=null;
		Object In398_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr2799);
			orExpr395=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr395.getTree());
			// AST REWRITE
			// elements: orExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 259:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt65=3;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==QMark) ) {
				alt65=1;
			}
			else if ( (LA65_0==In) ) {
				alt65=2;
			}
			switch (alt65) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:8: '?' a= expression ':' b= expression
					{
					char_literal396=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr2814);  
					stream_QMark.add(char_literal396);

					pushFollow(FOLLOW_expression_in_condExpr2818);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal397=(Token)match(input,Do,FOLLOW_Do_in_condExpr2820);  
					stream_Do.add(char_literal397);

					pushFollow(FOLLOW_expression_in_condExpr2824);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: a, orExpr, b
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 260:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:45: ^( TERNARY orExpr $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:8: In expression
					{
					In398=(Token)match(input,In,FOLLOW_In_in_condExpr2847);  
					stream_In.add(In398);

					pushFollow(FOLLOW_expression_in_condExpr2849);
					expression399=expression();
					state._fsp--;

					stream_expression.add(expression399.getTree());
					// AST REWRITE
					// elements: In, expression, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 261:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:45: ^( In orExpr expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal401=null;
		ParserRuleReturnScope andExpr400 =null;
		ParserRuleReturnScope andExpr402 =null;

		Object string_literal401_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr2901);
			andExpr400=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr400.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:14: ( '||' ^ andExpr )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==169) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:15: '||' ^ andExpr
					{
					string_literal401=(Token)match(input,169,FOLLOW_169_in_orExpr2904); 
					string_literal401_tree = (Object)adaptor.create(string_literal401);
					root_0 = (Object)adaptor.becomeRoot(string_literal401_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2907);
					andExpr402=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr402.getTree());

					}
					break;

				default :
					break loop66;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal404=null;
		ParserRuleReturnScope equExpr403 =null;
		ParserRuleReturnScope equExpr405 =null;

		Object string_literal404_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr2923);
			equExpr403=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr403.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:14: ( '&&' ^ equExpr )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==167) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:15: '&&' ^ equExpr
					{
					string_literal404=(Token)match(input,167,FOLLOW_167_in_andExpr2926); 
					string_literal404_tree = (Object)adaptor.create(string_literal404);
					root_0 = (Object)adaptor.becomeRoot(string_literal404_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2929);
					equExpr405=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr405.getTree());

					}
					break;

				default :
					break loop67;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set407=null;
		ParserRuleReturnScope relExpr406 =null;
		ParserRuleReturnScope relExpr408 =null;

		Object set407_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr2945);
			relExpr406=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr406.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==Equals||LA68_0==NEquals) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:15: ( '==' | '!=' ) ^ relExpr
					{
					set407=input.LT(1);
					set407=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set407), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr2957);
					relExpr408=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr408.getTree());

					}
					break;

				default :
					break loop68;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:277:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set410=null;
		ParserRuleReturnScope addExpr409 =null;
		ParserRuleReturnScope addExpr411 =null;

		Object set410_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr2973);
			addExpr409=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr409.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( ((LA69_0 >= GT && LA69_0 <= GTEquals)||(LA69_0 >= LT && LA69_0 <= LTEquals)) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set410=input.LT(1);
					set410=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set410), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr2993);
					addExpr411=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr411.getTree());

					}
					break;

				default :
					break loop69;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set413=null;
		ParserRuleReturnScope mulExpr412 =null;
		ParserRuleReturnScope mulExpr414 =null;

		Object set413_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr3009);
			mulExpr412=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr412.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==Add||LA70_0==Subtract) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:15: ( '+' | '-' ) ^ mulExpr
					{
					set413=input.LT(1);
					set413=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set413), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr3021);
					mulExpr414=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr414.getTree());

					}
					break;

				default :
					break loop70;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:285:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set416=null;
		ParserRuleReturnScope powExpr415 =null;
		ParserRuleReturnScope powExpr417 =null;

		Object set416_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr3037);
			powExpr415=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr415.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==Divide||LA71_0==Modulus||LA71_0==Multiply) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set416=input.LT(1);
					set416=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set416), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr3053);
					powExpr417=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr417.getTree());

					}
					break;

				default :
					break loop71;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:289:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal419=null;
		ParserRuleReturnScope unaryExpr418 =null;
		ParserRuleReturnScope unaryExpr420 =null;

		Object char_literal419_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr3069);
			unaryExpr418=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr418.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:16: ( '^' ^ unaryExpr )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Pw) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:17: '^' ^ unaryExpr
					{
					char_literal419=(Token)match(input,Pw,FOLLOW_Pw_in_powExpr3072); 
					char_literal419_tree = (Object)adaptor.create(char_literal419);
					root_0 = (Object)adaptor.becomeRoot(char_literal419_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr3075);
					unaryExpr420=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr420.getTree());

					}
					break;

				default :
					break loop72;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal421=null;
		Token char_literal423=null;
		ParserRuleReturnScope atom422 =null;
		ParserRuleReturnScope atom424 =null;
		ParserRuleReturnScope atom425 =null;

		Object char_literal421_tree=null;
		Object char_literal423_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt73=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt73=1;
				}
				break;
			case Excl:
				{
				alt73=2;
				}
				break;
			case ATan:
			case Arc:
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Clip:
			case Cm:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
			case Flatten:
			case Gaussian:
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
			case Grid:
			case Group:
			case HEIGHT_CONSTANT:
			case Heading:
			case Hide:
			case Identifier:
			case Inch:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Mm:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Noise:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case PI_CONSTANT:
			case Point:
			case Polygon:
			case Pow:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case SetHeight:
			case SetName:
			case SetSeam:
			case SetWidth:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Slider:
			case Sq:
			case Sqrt:
			case String:
			case Stroke:
			case Tan:
			case Template:
			case Union:
			case Units:
			case WIDTH_CONSTANT:
			case Wave:
			case Weight:
			case Xor:
				{
				alt73=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:6: '-' atom
					{
					char_literal421=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr3093);  
					stream_Subtract.add(char_literal421);

					pushFollow(FOLLOW_atom_in_unaryExpr3095);
					atom422=atom();
					state._fsp--;

					stream_atom.add(atom422.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 294:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:18: ^( UNARY_MIN atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:295:6: '!' atom
					{
					char_literal423=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr3110);  
					stream_Excl.add(char_literal423);

					pushFollow(FOLLOW_atom_in_unaryExpr3112);
					atom424=atom();
					state._fsp--;

					stream_atom.add(atom424.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 295:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:295:18: ^( NEGATE atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr3127);
					atom425=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom425.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number426=null;
		Token Bool427=null;
		Token Null428=null;
		Token COLOR_CONSTANT430=null;
		Token PI_CONSTANT431=null;
		Token WIDTH_CONSTANT432=null;
		Token HEIGHT_CONSTANT433=null;
		ParserRuleReturnScope lookup429 =null;

		Object Number426_tree=null;
		Object Bool427_tree=null;
		Object Null428_tree=null;
		Object COLOR_CONSTANT430_tree=null;
		Object PI_CONSTANT431_tree=null;
		Object WIDTH_CONSTANT432_tree=null;
		Object HEIGHT_CONSTANT433_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt74=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt74=1;
				}
				break;
			case Bool:
				{
				alt74=2;
				}
				break;
			case Null:
				{
				alt74=3;
				}
				break;
			case ATan:
			case Arc:
			case Assert:
			case Clip:
			case Cm:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
			case Flatten:
			case Gaussian:
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
			case Grid:
			case Group:
			case Heading:
			case Hide:
			case Identifier:
			case Inch:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Mm:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Noise:
			case OBracket:
			case OParen:
			case Point:
			case Polygon:
			case Pow:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case SetHeight:
			case SetName:
			case SetSeam:
			case SetWidth:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Slider:
			case Sq:
			case Sqrt:
			case String:
			case Stroke:
			case Tan:
			case Template:
			case Union:
			case Units:
			case Wave:
			case Weight:
			case Xor:
				{
				alt74=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt74=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt74=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt74=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt74=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number426=(Token)match(input,Number,FOLLOW_Number_in_atom3141); 
					Number426_tree = (Object)adaptor.create(Number426);
					adaptor.addChild(root_0, Number426_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool427=(Token)match(input,Bool,FOLLOW_Bool_in_atom3148); 
					Bool427_tree = (Object)adaptor.create(Bool427);
					adaptor.addChild(root_0, Bool427_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:302:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null428=(Token)match(input,Null,FOLLOW_Null_in_atom3155); 
					Null428_tree = (Object)adaptor.create(Null428);
					adaptor.addChild(root_0, Null428_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:303:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom3162);
					lookup429=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup429.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:304:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT430=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom3168); 
					COLOR_CONSTANT430_tree = (Object)adaptor.create(COLOR_CONSTANT430);
					adaptor.addChild(root_0, COLOR_CONSTANT430_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:305:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT431=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom3174); 
					PI_CONSTANT431_tree = (Object)adaptor.create(PI_CONSTANT431);
					adaptor.addChild(root_0, PI_CONSTANT431_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:306:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT432=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom3180); 
					WIDTH_CONSTANT432_tree = (Object)adaptor.create(WIDTH_CONSTANT432);
					adaptor.addChild(root_0, WIDTH_CONSTANT432_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:307:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT433=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom3186); 
					HEIGHT_CONSTANT433_tree = (Object)adaptor.create(HEIGHT_CONSTANT433);
					adaptor.addChild(root_0, HEIGHT_CONSTANT433_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:310:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal434=null;
		Token char_literal436=null;
		ParserRuleReturnScope exprList435 =null;

		Object char_literal434_tree=null;
		Object char_literal436_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:6: '[' ( exprList )? ']'
			{
			char_literal434=(Token)match(input,OBracket,FOLLOW_OBracket_in_list3200);  
			stream_OBracket.add(char_literal434);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:10: ( exprList )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==ATan||(LA75_0 >= Arc && LA75_0 <= Assert)||LA75_0==Bool||LA75_0==COLOR_CONSTANT||(LA75_0 >= Clip && LA75_0 <= Cm)||(LA75_0 >= Copy && LA75_0 <= Curve)||LA75_0==Difference||LA75_0==Ellipse||(LA75_0 >= Excl && LA75_0 <= Expand)||(LA75_0 >= Fill && LA75_0 <= Flatten)||(LA75_0 >= Gaussian && LA75_0 <= Hide)||LA75_0==Identifier||LA75_0==Inch||LA75_0==LAdd||(LA75_0 >= LRemove && LA75_0 <= LShape)||(LA75_0 >= Line && LA75_0 <= Mm)||(LA75_0 >= Move && LA75_0 <= MoveBy)||(LA75_0 >= NoFill && LA75_0 <= Number)||(LA75_0 >= OBracket && LA75_0 <= OParen)||(LA75_0 >= PI_CONSTANT && LA75_0 <= Println)||(LA75_0 >= Random && LA75_0 <= Rect)||(LA75_0 >= Rotate && LA75_0 <= Round)||(LA75_0 >= Scale && LA75_0 <= Slider)||(LA75_0 >= Sq && LA75_0 <= Subtract)||(LA75_0 >= Tan && LA75_0 <= Template)||(LA75_0 >= Union && LA75_0 <= Weight)||LA75_0==Xor) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list3202);
					exprList435=exprList();
					state._fsp--;

					stream_exprList.add(exprList435.getTree());
					}
					break;

			}

			char_literal436=(Token)match(input,CBracket,FOLLOW_CBracket_in_list3205);  
			stream_CBracket.add(char_literal436);

			// AST REWRITE
			// elements: exprList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 311:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:34: ( exprList )?
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class lookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:314:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier442=null;
		Token String445=null;
		Token char_literal447=null;
		Token char_literal449=null;
		ParserRuleReturnScope functionCall437 =null;
		ParserRuleReturnScope indexes438 =null;
		ParserRuleReturnScope dotProperty439 =null;
		ParserRuleReturnScope list440 =null;
		ParserRuleReturnScope indexes441 =null;
		ParserRuleReturnScope indexes443 =null;
		ParserRuleReturnScope dotProperty444 =null;
		ParserRuleReturnScope indexes446 =null;
		ParserRuleReturnScope expression448 =null;
		ParserRuleReturnScope indexes450 =null;

		Object Identifier442_tree=null;
		Object String445_tree=null;
		Object char_literal447_tree=null;
		Object char_literal449_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_dotProperty=new RewriteRuleSubtreeStream(adaptor,"rule dotProperty");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt83=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA83_1 = input.LA(2);
				if ( (LA83_1==OParen) ) {
					alt83=1;
				}
				else if ( (LA83_1==Add||LA83_1==CBracket||LA83_1==CParen||LA83_1==Comma||(LA83_1 >= Divide && LA83_1 <= Do)||(LA83_1 >= DotEnd && LA83_1 <= DotY)||LA83_1==Equals||(LA83_1 >= GT && LA83_1 <= GTEquals)||LA83_1==In||LA83_1==LAdd||(LA83_1 >= LT && LA83_1 <= LTEquals)||LA83_1==Modulus||LA83_1==Multiply||LA83_1==NEquals||LA83_1==OBracket||(LA83_1 >= Pw && LA83_1 <= QMark)||LA83_1==Subtract||(LA83_1 >= 167 && LA83_1 <= 169)) ) {
					alt83=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ATan:
			case Arc:
			case Assert:
			case Clip:
			case Cm:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
			case Flatten:
			case Gaussian:
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
			case Grid:
			case Group:
			case Heading:
			case Hide:
			case Inch:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Mm:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Noise:
			case Point:
			case Polygon:
			case Pow:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case SetHeight:
			case SetName:
			case SetSeam:
			case SetWidth:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Slider:
			case Sq:
			case Sqrt:
			case Stroke:
			case Tan:
			case Template:
			case Union:
			case Units:
			case Wave:
			case Weight:
			case Xor:
				{
				alt83=1;
				}
				break;
			case OBracket:
				{
				alt83=2;
				}
				break;
			case String:
				{
				alt83=4;
				}
				break;
			case OParen:
				{
				alt83=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup3228);
					functionCall437=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall437.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==Add||LA77_0==CBracket||LA77_0==CParen||LA77_0==Comma||(LA77_0 >= Divide && LA77_0 <= Do)||LA77_0==Equals||(LA77_0 >= GT && LA77_0 <= GTEquals)||LA77_0==In||LA77_0==LAdd||(LA77_0 >= LT && LA77_0 <= LTEquals)||LA77_0==Modulus||LA77_0==Multiply||LA77_0==NEquals||LA77_0==OBracket||(LA77_0 >= Pw && LA77_0 <= QMark)||LA77_0==Subtract||(LA77_0 >= 167 && LA77_0 <= 169)) ) {
						alt77=1;
					}
					else if ( ((LA77_0 >= DotEnd && LA77_0 <= DotY)) ) {
						alt77=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 77, 0, input);
						throw nvae;
					}

					switch (alt77) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:20: ( indexes )?
							int alt76=2;
							int LA76_0 = input.LA(1);
							if ( (LA76_0==OBracket) ) {
								alt76=1;
							}
							switch (alt76) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup3231);
									indexes438=indexes();
									state._fsp--;

									stream_indexes.add(indexes438.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: indexes, functionCall
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 315:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:55: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup3248);
							dotProperty439=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty439.getTree());
							// AST REWRITE
							// elements: functionCall, dotProperty
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 315:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:83: ^( DOTPROPERTY functionCall dotProperty )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup3273);
					list440=list();
					state._fsp--;

					stream_list.add(list440.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:11: ( indexes )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==OBracket) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3275);
							indexes441=indexes();
							state._fsp--;

							stream_indexes.add(indexes441.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 316:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:51: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier442=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup3308);  
					stream_Identifier.add(Identifier442);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==Add||LA80_0==CBracket||LA80_0==CParen||LA80_0==Comma||(LA80_0 >= Divide && LA80_0 <= Do)||LA80_0==Equals||(LA80_0 >= GT && LA80_0 <= GTEquals)||LA80_0==In||LA80_0==LAdd||(LA80_0 >= LT && LA80_0 <= LTEquals)||LA80_0==Modulus||LA80_0==Multiply||LA80_0==NEquals||LA80_0==OBracket||(LA80_0 >= Pw && LA80_0 <= QMark)||LA80_0==Subtract||(LA80_0 >= 167 && LA80_0 <= 169)) ) {
						alt80=1;
					}
					else if ( ((LA80_0 >= DotEnd && LA80_0 <= DotY)) ) {
						alt80=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 80, 0, input);
						throw nvae;
					}

					switch (alt80) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:18: ( indexes )?
							int alt79=2;
							int LA79_0 = input.LA(1);
							if ( (LA79_0==OBracket) ) {
								alt79=1;
							}
							switch (alt79) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup3311);
									indexes443=indexes();
									state._fsp--;

									stream_indexes.add(indexes443.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: Identifier, indexes
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 317:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:51: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup3328);
							dotProperty444=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty444.getTree());
							// AST REWRITE
							// elements: dotProperty, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 317:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:79: ^( DOTPROPERTY Identifier dotProperty )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:6: String ( indexes )?
					{
					String445=(Token)match(input,String,FOLLOW_String_in_lookup3348);  
					stream_String.add(String445);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:13: ( indexes )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==OBracket) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3350);
							indexes446=indexes();
							state._fsp--;

							stream_indexes.add(indexes446.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, String
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 318:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:53: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:6: '(' expression ')' ( indexes )?
					{
					char_literal447=(Token)match(input,OParen,FOLLOW_OParen_in_lookup3381);  
					stream_OParen.add(char_literal447);

					pushFollow(FOLLOW_expression_in_lookup3383);
					expression448=expression();
					state._fsp--;

					stream_expression.add(expression448.getTree());
					char_literal449=(Token)match(input,CParen,FOLLOW_CParen_in_lookup3385);  
					stream_CParen.add(char_literal449);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:25: ( indexes )?
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==OBracket) ) {
						alt82=1;
					}
					switch (alt82) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3387);
							indexes450=indexes();
							state._fsp--;

							stream_indexes.add(indexes450.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 319:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:326:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal451=null;
		Token char_literal453=null;
		ParserRuleReturnScope expression452 =null;

		Object char_literal451_tree=null;
		Object char_literal453_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:6: ( '[' expression ']' )+
			int cnt84=0;
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==OBracket) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:7: '[' expression ']'
					{
					char_literal451=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes3431);  
					stream_OBracket.add(char_literal451);

					pushFollow(FOLLOW_expression_in_indexes3433);
					expression452=expression();
					state._fsp--;

					stream_expression.add(expression452.getTree());
					char_literal453=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes3435);  
					stream_CBracket.add(char_literal453);

					}
					break;

				default :
					if ( cnt84 >= 1 ) break loop84;
					EarlyExitException eee = new EarlyExitException(84, input);
					throw eee;
				}
				cnt84++;
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 327:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:31: ^( INDEXES ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexes"


	public static class dotProperty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotProperty"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression454 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:6: ( dotExpression )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:6: ( dotExpression )+
			int cnt85=0;
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( ((LA85_0 >= DotEnd && LA85_0 <= DotY)) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3466);
					dotExpression454=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression454.getTree());
					}
					break;

				default :
					if ( cnt85 >= 1 ) break loop85;
					EarlyExitException eee = new EarlyExitException(85, input);
					throw eee;
				}
				cnt85++;
			}

			// AST REWRITE
			// elements: dotExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 331:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:26: ^( DOT ( dotExpression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOT, "DOT"), root_1);
				if ( !(stream_dotExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_dotExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_dotExpression.nextTree());
				}
				stream_dotExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotProperty"


	public static class dotExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set455=null;

		Object set455_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set455=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set455));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotExpression"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_parse188 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block208 = new BitSet(new long[]{0xE721000063980C82L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_functionDecl_in_block212 = new BitSet(new long[]{0xE721000063980C82L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_Return_in_block217 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_block219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_168_in_block221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_168_in_statement265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_168_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment327 = new BitSet(new long[]{0x0000000000001002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_assignment329 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Assign_in_assignment333 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_assignment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall371 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall373 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_functionCall375 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall396 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall398 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_functionCall400 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall422 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall424 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_functionCall426 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall449 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall451 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_functionCall453 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall475 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall477 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_functionCall479 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall503 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall505 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_functionCall507 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall531 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall533 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_functionCall535 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uICall_in_functionCall592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateCall_in_functionCall598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall618 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall620 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall622 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall645 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall647 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall649 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall672 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall674 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall676 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall699 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall701 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall703 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall724 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall726 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall728 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall749 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall751 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall753 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall774 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall776 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall778 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall800 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall802 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall804 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall827 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall829 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall831 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall865 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall867 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall869 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall890 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall892 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall894 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Heading_in_transformCall916 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall918 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall920 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall942 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall944 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall946 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall965 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall967 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall969 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall989 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall991 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall993 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall1013 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1015 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1017 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall1037 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1039 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1041 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall1059 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1061 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1063 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall1081 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1083 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1085 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall1105 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1107 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1109 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Show_in_transformCall1127 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1129 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1131 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1149 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1151 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1153 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1173 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1175 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1177 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1195 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1197 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1199 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1217 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1219 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1221 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1241 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1243 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1245 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall1263 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1265 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1267 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Union_in_transformCall1285 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1287 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1289 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Difference_in_transformCall1309 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1311 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1313 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clip_in_transformCall1333 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1335 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1337 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Xor_in_transformCall1357 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1359 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_transformCall1361 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Flatten_in_transformCall1381 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1383 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_transformCall1385 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Grid_in_patternCall1417 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1419 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_patternCall1421 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Wave_in_patternCall1442 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1444 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_patternCall1446 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Arc_in_patternCall1467 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1469 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_patternCall1471 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1505 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1507 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1509 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1525 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1527 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1529 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1545 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1547 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1549 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1565 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1567 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1569 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1585 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1587 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1589 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1605 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1607 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1609 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1625 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1627 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1629 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1645 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1647 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1649 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1665 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1667 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1669 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1685 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1687 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_getCall1689 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1706 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1708 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_getCall1710 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1731 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1732 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_getCall1734 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetAngle_in_getCall1755 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1756 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_getCall1758 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRadius_in_getCall1779 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1780 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_getCall1782 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1818 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1820 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall1822 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1843 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1845 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall1847 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1868 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1870 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall1872 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1893 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1895 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall1897 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1920 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1922 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall1924 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Pow_in_mathCall1947 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1949 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall1951 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sqrt_in_mathCall1974 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1976 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall1978 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sq_in_mathCall1999 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2001 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2003 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall2024 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2026 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall2028 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Noise_in_mathCall2051 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2053 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall2055 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall2078 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2079 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2081 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall2102 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2103 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_mathCall2105 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Inch_in_mathCall2128 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2130 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2132 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Mm_in_mathCall2153 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2155 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2157 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cm_in_mathCall2178 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2180 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2182 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Units_in_mathCall2203 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2204 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_mathCall2206 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Slider_in_uICall2239 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_uICall2241 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_uICall2243 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_uICall2246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Template_in_templateCall2279 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_templateCall2281 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_templateCall2283 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_templateCall2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SetWidth_in_templateCall2305 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_templateCall2307 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_templateCall2309 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_templateCall2312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SetHeight_in_templateCall2331 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_templateCall2333 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_templateCall2335 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_templateCall2338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SetSeam_in_templateCall2357 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_templateCall2359 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_templateCall2361 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_templateCall2364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SetName_in_templateCall2383 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_templateCall2385 = new BitSet(new long[]{0xE3310000439E4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_templateCall2387 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_templateCall2390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement2425 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement2427 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement2430 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement2433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat2462 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_ifStat2464 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_ifStat2466 = new BitSet(new long[]{0xE721000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_ifStat2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_If_in_elseIfStat2494 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_elseIfStat2496 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat2498 = new BitSet(new long[]{0xE721000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_elseIfStat2500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat2524 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_elseStat2526 = new BitSet(new long[]{0xE721000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_elseStat2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl2552 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl2554 = new BitSet(new long[]{0x0000000000040000L,0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_functionDecl2556 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl2559 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl2561 = new BitSet(new long[]{0xE725000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_functionDecl2563 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl2565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement2589 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Assign_in_forStatement2591 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_forStatement2593 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_forStatement2595 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_forStatement2597 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_forStatement2599 = new BitSet(new long[]{0xE725000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_forStatement2601 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_forStatement2603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement2638 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement2640 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2642 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement2644 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2646 = new BitSet(new long[]{0x0000000200000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LAdd_in_repeatStatement2649 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2651 = new BitSet(new long[]{0x0000000200000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement2655 = new BitSet(new long[]{0xE725000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_repeatStatement2657 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement2659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement2692 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_whileStatement2694 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement2696 = new BitSet(new long[]{0xE725000063980C80L,0x87C071BF32B1BFFFL,0x0000017B1967FF1FL});
	public static final BitSet FOLLOW_block_in_whileStatement2698 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement2700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList2724 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_idList2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_Identifier_in_idList2729 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_expression_in_exprList2754 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_exprList2757 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_exprList2759 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_condExpr_in_expression2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr2799 = new BitSet(new long[]{0x0000000000000002L,0x1000000000400000L});
	public static final BitSet FOLLOW_QMark_in_condExpr2814 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_condExpr2818 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_condExpr2820 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_condExpr2824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr2847 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_condExpr2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_169_in_orExpr2904 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_167_in_andExpr2926 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2945 = new BitSet(new long[]{0x0008000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_set_in_equExpr2948 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2957 = new BitSet(new long[]{0x0008000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2973 = new BitSet(new long[]{0x1800000000000002L,0x00000000C0000000L});
	public static final BitSet FOLLOW_set_in_relExpr2976 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2993 = new BitSet(new long[]{0x1800000000000002L,0x00000000C0000000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr3009 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_set_in_addExpr3012 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr3021 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr3037 = new BitSet(new long[]{0x0000000100000002L,0x0000024000000000L});
	public static final BitSet FOLLOW_set_in_mulExpr3040 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr3053 = new BitSet(new long[]{0x0000000100000002L,0x0000024000000000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr3069 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
	public static final BitSet FOLLOW_Pw_in_powExpr3072 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr3075 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr3093 = new BitSet(new long[]{0xE3210000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F19E7FF19L});
	public static final BitSet FOLLOW_atom_in_unaryExpr3095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr3110 = new BitSet(new long[]{0xE3210000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F19E7FF19L});
	public static final BitSet FOLLOW_atom_in_unaryExpr3112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr3127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom3141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom3155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom3162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom3168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom3186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list3200 = new BitSet(new long[]{0xE3310000439B4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_exprList_in_list3202 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CBracket_in_list3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup3228 = new BitSet(new long[]{0x00003FF800000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup3273 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup3308 = new BitSet(new long[]{0x00003FF800000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup3348 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup3381 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_lookup3383 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_lookup3385 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes3431 = new BitSet(new long[]{0xE3310000439A4C80L,0x87EDF1BF3291FFFFL,0x0000005F1BE7FF19L});
	public static final BitSet FOLLOW_expression_in_indexes3433 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CBracket_in_indexes3435 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3466 = new BitSet(new long[]{0x00003FF800000002L});
}
