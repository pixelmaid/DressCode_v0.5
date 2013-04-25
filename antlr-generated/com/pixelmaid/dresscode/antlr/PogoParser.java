// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-04-24 18:58:31

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "ATan", "Add", "And", 
		"Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", 
		"CParen", "Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", 
		"DOTPROPERTY", "Def", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", 
		"DotHeight", "DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", 
		"DotWidth", "DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", 
		"Equals", "Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", 
		"GTEquals", "GetDistance", "GetEnd", "GetFill", "GetHeight", "GetOrigin", 
		"GetRotation", "GetStart", "GetStroke", "GetWidth", "GetX", "GetY", "Group", 
		"HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", "If", 
		"In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", "LT", "LTEquals", 
		"Line", "Map", "Merge", "MirrorX", "MirrorY", "Modulus", "Move", "MoveBy", 
		"Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", "Null", "Number", 
		"OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", "Point", "Polygon", 
		"Pow", "Print", "Println", "QMark", "Quad", "RETURN", "Random", "Rect", 
		"Repeat", "Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", "Scale", 
		"Sine", "Size", "Space", "String", "Stroke", "Subtract", "TERNARY", "Tan", 
		"To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", "While", "'&&'", 
		"';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int ASSIGNMENT=4;
	public static final int ATan=5;
	public static final int Add=6;
	public static final int And=7;
	public static final int Assert=8;
	public static final int Assign=9;
	public static final int BLOCK=10;
	public static final int Bool=11;
	public static final int CBrace=12;
	public static final int CBracket=13;
	public static final int COLOR_CONSTANT=14;
	public static final int CParen=15;
	public static final int Comma=16;
	public static final int Comment=17;
	public static final int Copy=18;
	public static final int Cosine=19;
	public static final int Curve=20;
	public static final int DOT=21;
	public static final int DOTLOOKUP=22;
	public static final int DOTPROPERTY=23;
	public static final int Def=24;
	public static final int Digit=25;
	public static final int Divide=26;
	public static final int Do=27;
	public static final int Dot=28;
	public static final int DotEnd=29;
	public static final int DotFill=30;
	public static final int DotHeight=31;
	public static final int DotOrigin=32;
	public static final int DotRotation=33;
	public static final int DotStart=34;
	public static final int DotStroke=35;
	public static final int DotWeight=36;
	public static final int DotWidth=37;
	public static final int DotX=38;
	public static final int DotY=39;
	public static final int EXP=40;
	public static final int EXP_LIST=41;
	public static final int Ellipse=42;
	public static final int Else=43;
	public static final int End=44;
	public static final int Equals=45;
	public static final int Excl=46;
	public static final int Expand=47;
	public static final int FUNCTION=48;
	public static final int FUNC_CALL=49;
	public static final int Fill=50;
	public static final int For=51;
	public static final int GT=52;
	public static final int GTEquals=53;
	public static final int GetDistance=54;
	public static final int GetEnd=55;
	public static final int GetFill=56;
	public static final int GetHeight=57;
	public static final int GetOrigin=58;
	public static final int GetRotation=59;
	public static final int GetStart=60;
	public static final int GetStroke=61;
	public static final int GetWidth=62;
	public static final int GetX=63;
	public static final int GetY=64;
	public static final int Group=65;
	public static final int HEIGHT_CONSTANT=66;
	public static final int Hide=67;
	public static final int ID_LIST=68;
	public static final int IF=69;
	public static final int INDEXES=70;
	public static final int Identifier=71;
	public static final int If=72;
	public static final int In=73;
	public static final int Int=74;
	public static final int LAdd=75;
	public static final int LIST=76;
	public static final int LOOKUP=77;
	public static final int LRemove=78;
	public static final int LShape=79;
	public static final int LT=80;
	public static final int LTEquals=81;
	public static final int Line=82;
	public static final int Map=83;
	public static final int Merge=84;
	public static final int MirrorX=85;
	public static final int MirrorY=86;
	public static final int Modulus=87;
	public static final int Move=88;
	public static final int MoveBy=89;
	public static final int Multiply=90;
	public static final int NEGATE=91;
	public static final int NEquals=92;
	public static final int NoFill=93;
	public static final int NoStroke=94;
	public static final int Null=95;
	public static final int Number=96;
	public static final int OBrace=97;
	public static final int OBracket=98;
	public static final int OParen=99;
	public static final int Or=100;
	public static final int PI_CONSTANT=101;
	public static final int Point=102;
	public static final int Polygon=103;
	public static final int Pow=104;
	public static final int Print=105;
	public static final int Println=106;
	public static final int QMark=107;
	public static final int Quad=108;
	public static final int RETURN=109;
	public static final int Random=110;
	public static final int Rect=111;
	public static final int Repeat=112;
	public static final int Return=113;
	public static final int Rotate=114;
	public static final int Round=115;
	public static final int SPECIAL=116;
	public static final int STATEMENTS=117;
	public static final int Scale=118;
	public static final int Sine=119;
	public static final int Size=120;
	public static final int Space=121;
	public static final int String=122;
	public static final int Stroke=123;
	public static final int Subtract=124;
	public static final int TERNARY=125;
	public static final int Tan=126;
	public static final int To=127;
	public static final int Triangle=128;
	public static final int UNARY_MIN=129;
	public static final int WIDTH_CONSTANT=130;
	public static final int Weight=131;
	public static final int While=132;

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:72:1: parse : block EOF -> block ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:73:3: ( block EOF -> block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:73:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse172);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse174);  
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
			// 73:16: -> block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
		RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ATan||LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= GetDistance && LA1_0 <= Group)||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= MirrorX)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= Size)||LA1_0==Stroke||LA1_0==Tan||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==134) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:6: statement
					{
					pushFollow(FOLLOW_statement_in_block192);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block196);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block201);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block203);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,134,FOLLOW_134_in_block205);  
					stream_134.add(char_literal7);

					}
					break;

			}

			// AST REWRITE
			// elements: statement, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:51: ( expression )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
		RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket) ) {
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
			case 134:
				{
				alt3=1;
				}
				break;
			case ATan:
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Sine:
			case Size:
			case Stroke:
			case Tan:
			case Weight:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement247);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,134,FOLLOW_134_in_statement249);  
					stream_134.add(char_literal9);

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
					// 82:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:83:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement262);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,134,FOLLOW_134_in_statement264);  
					stream_134.add(char_literal11);

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
					// 83:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement276);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement283);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement290);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement297);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			else if ( (LA5_0==134) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: Identifier ( indexes )? '=' expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment311);  
					stream_Identifier.add(Identifier16);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment313);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment316);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment318);
					expression19=expression();
					state._fsp--;

					stream_expression.add(expression19.getTree());
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
					// 91:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:69: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:3: 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
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
		ParserRuleReturnScope mathCall50 =null;
		ParserRuleReturnScope getCall51 =null;

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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
			int alt10=11;
			switch ( input.LA(1) ) {
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
				{
				alt10=8;
				}
				break;
			case Copy:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case Merge:
			case MirrorX:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Rotate:
			case Scale:
			case Stroke:
			case Weight:
				{
				alt10=9;
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
				alt10=10;
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
				alt10=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall352);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall354);  
					stream_OParen.add(char_literal21);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ATan||LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= GetDistance && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||(LA6_0 >= Line && LA6_0 <= MirrorX)||(LA6_0 >= Move && LA6_0 <= MoveBy)||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= PI_CONSTANT && LA6_0 <= Polygon)||(LA6_0 >= Print && LA6_0 <= Println)||(LA6_0 >= Random && LA6_0 <= Rect)||(LA6_0 >= Rotate && LA6_0 <= Round)||(LA6_0 >= Scale && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==Tan||(LA6_0 >= WIDTH_CONSTANT && LA6_0 <= Weight)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall356);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall359);  
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
					// 96:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:61: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall377);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall379);  
					stream_OParen.add(char_literal25);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ATan||LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= GetDistance && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= MirrorX)||(LA7_0 >= Move && LA7_0 <= MoveBy)||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==Tan||(LA7_0 >= WIDTH_CONSTANT && LA7_0 <= Weight)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall381);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall384);  
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
					// 97:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:58: ( expression )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall403);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall405);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall407);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall409);  
					stream_CParen.add(char_literal31);

					// AST REWRITE
					// elements: expression, Print
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 98:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:38: ^( FUNC_CALL Print expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall430);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall432);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall434);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall436);  
					stream_CParen.add(char_literal35);

					// AST REWRITE
					// elements: Assert, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:38: ^( FUNC_CALL Assert expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall456);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall458);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall460);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall462);  
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
					// 100:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:38: ^( FUNC_CALL Size expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:6: LAdd '(' ( exprList )? ')'
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall484);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall486);  
					stream_OParen.add(char_literal41);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:15: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ATan||LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= GetDistance && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= MirrorX)||(LA8_0 >= Move && LA8_0 <= MoveBy)||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= Size)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==Tan||(LA8_0 >= WIDTH_CONSTANT && LA8_0 <= Weight)) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall488);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall491);  
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
					// 101:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:34: ^( FUNC_CALL LAdd ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:6: LRemove '(' ( exprList )? ')'
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall512);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall514);  
					stream_OParen.add(char_literal45);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:18: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ATan||LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= GetDistance && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= MirrorX)||(LA9_0 >= Move && LA9_0 <= MoveBy)||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||LA9_0==Tan||(LA9_0 >= WIDTH_CONSTANT && LA9_0 <= Weight)) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall516);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall519);  
					stream_CParen.add(char_literal47);

					// AST REWRITE
					// elements: LRemove, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:37: ^( FUNC_CALL LRemove ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:57: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall540);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall547);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall554);
					mathCall50=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall50.getTree());

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:5: getCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_getCall_in_functionCall560);
					getCall51=getCall();
					state._fsp--;

					adaptor.addChild(root_0, getCall51.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		Token Line56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token Rect60=null;
		Token char_literal61=null;
		Token char_literal63=null;
		Token Curve64=null;
		Token char_literal65=null;
		Token char_literal67=null;
		Token Polygon68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		Token LShape72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token Point76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		ParserRuleReturnScope exprList54 =null;
		ParserRuleReturnScope exprList58 =null;
		ParserRuleReturnScope exprList62 =null;
		ParserRuleReturnScope exprList66 =null;
		ParserRuleReturnScope exprList70 =null;
		ParserRuleReturnScope exprList74 =null;
		ParserRuleReturnScope exprList78 =null;

		Object Ellipse52_tree=null;
		Object char_literal53_tree=null;
		Object char_literal55_tree=null;
		Object Line56_tree=null;
		Object char_literal57_tree=null;
		Object char_literal59_tree=null;
		Object Rect60_tree=null;
		Object char_literal61_tree=null;
		Object char_literal63_tree=null;
		Object Curve64_tree=null;
		Object char_literal65_tree=null;
		Object char_literal67_tree=null;
		Object Polygon68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;
		Object LShape72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object Point76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_LShape=new RewriteRuleTokenStream(adaptor,"token LShape");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleTokenStream stream_Point=new RewriteRuleTokenStream(adaptor,"token Point");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
			int alt18=7;
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt18=1;
				}
				break;
			case Line:
				{
				alt18=2;
				}
				break;
			case Rect:
				{
				alt18=3;
				}
				break;
			case Curve:
				{
				alt18=4;
				}
				break;
			case Polygon:
				{
				alt18=5;
				}
				break;
			case LShape:
				{
				alt18=6;
				}
				break;
			case Point:
				{
				alt18=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse52=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall580);  
					stream_Ellipse.add(Ellipse52);

					char_literal53=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall582);  
					stream_OParen.add(char_literal53);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:17: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ATan||LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= GetDistance && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||(LA11_0 >= Line && LA11_0 <= MirrorX)||(LA11_0 >= Move && LA11_0 <= MoveBy)||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= PI_CONSTANT && LA11_0 <= Polygon)||(LA11_0 >= Print && LA11_0 <= Println)||(LA11_0 >= Random && LA11_0 <= Rect)||(LA11_0 >= Rotate && LA11_0 <= Round)||(LA11_0 >= Scale && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==Tan||(LA11_0 >= WIDTH_CONSTANT && LA11_0 <= Weight)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall584);
							exprList54=exprList();
							state._fsp--;

							stream_exprList.add(exprList54.getTree());
							}
							break;

					}

					char_literal55=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall587);  
					stream_CParen.add(char_literal55);

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
					// 111:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:56: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:5: Line '(' ( exprList )? ')'
					{
					Line56=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall607);  
					stream_Line.add(Line56);

					char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall609);  
					stream_OParen.add(char_literal57);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= GetDistance && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= MirrorX)||(LA12_0 >= Move && LA12_0 <= MoveBy)||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||LA12_0==Tan||(LA12_0 >= WIDTH_CONSTANT && LA12_0 <= Weight)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall611);
							exprList58=exprList();
							state._fsp--;

							stream_exprList.add(exprList58.getTree());
							}
							break;

					}

					char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall614);  
					stream_CParen.add(char_literal59);

					// AST REWRITE
					// elements: exprList, Line
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 112:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:5: Rect '(' ( exprList )? ')'
					{
					Rect60=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall634);  
					stream_Rect.add(Rect60);

					char_literal61=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall636);  
					stream_OParen.add(char_literal61);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= GetDistance && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= MirrorX)||(LA13_0 >= Move && LA13_0 <= MoveBy)||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||LA13_0==Tan||(LA13_0 >= WIDTH_CONSTANT && LA13_0 <= Weight)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall638);
							exprList62=exprList();
							state._fsp--;

							stream_exprList.add(exprList62.getTree());
							}
							break;

					}

					char_literal63=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall641);  
					stream_CParen.add(char_literal63);

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
					// 113:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:5: Curve '(' ( exprList )? ')'
					{
					Curve64=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall661);  
					stream_Curve.add(Curve64);

					char_literal65=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall663);  
					stream_OParen.add(char_literal65);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:15: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= GetDistance && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= MirrorX)||(LA14_0 >= Move && LA14_0 <= MoveBy)||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= Size)||(LA14_0 >= String && LA14_0 <= Subtract)||LA14_0==Tan||(LA14_0 >= WIDTH_CONSTANT && LA14_0 <= Weight)) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall665);
							exprList66=exprList();
							state._fsp--;

							stream_exprList.add(exprList66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall668);  
					stream_CParen.add(char_literal67);

					// AST REWRITE
					// elements: Curve, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:5: Polygon '(' ( exprList )? ')'
					{
					Polygon68=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall686);  
					stream_Polygon.add(Polygon68);

					char_literal69=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall688);  
					stream_OParen.add(char_literal69);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= GetDistance && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= MirrorX)||(LA15_0 >= Move && LA15_0 <= MoveBy)||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||LA15_0==Tan||(LA15_0 >= WIDTH_CONSTANT && LA15_0 <= Weight)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall690);
							exprList70=exprList();
							state._fsp--;

							stream_exprList.add(exprList70.getTree());
							}
							break;

					}

					char_literal71=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall693);  
					stream_CParen.add(char_literal71);

					// AST REWRITE
					// elements: Polygon, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:5: LShape '(' ( exprList )? ')'
					{
					LShape72=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall711);  
					stream_LShape.add(LShape72);

					char_literal73=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall713);  
					stream_OParen.add(char_literal73);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= GetDistance && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= MirrorX)||(LA16_0 >= Move && LA16_0 <= MoveBy)||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||LA16_0==Tan||(LA16_0 >= WIDTH_CONSTANT && LA16_0 <= Weight)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall715);
							exprList74=exprList();
							state._fsp--;

							stream_exprList.add(exprList74.getTree());
							}
							break;

					}

					char_literal75=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall718);  
					stream_CParen.add(char_literal75);

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
					// 116:30: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:34: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:53: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:6: Point '(' ( exprList )? ')'
					{
					Point76=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall737);  
					stream_Point.add(Point76);

					char_literal77=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall739);  
					stream_OParen.add(char_literal77);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:16: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||LA17_0==Fill||(LA17_0 >= GetDistance && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= MirrorX)||(LA17_0 >= Move && LA17_0 <= MoveBy)||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= Size)||(LA17_0 >= String && LA17_0 <= Subtract)||LA17_0==Tan||(LA17_0 >= WIDTH_CONSTANT && LA17_0 <= Weight)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall741);
							exprList78=exprList();
							state._fsp--;

							stream_exprList.add(exprList78.getTree());
							}
							break;

					}

					char_literal79=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall744);  
					stream_CParen.add(char_literal79);

					// AST REWRITE
					// elements: exprList, Point
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:30: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:34: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:52: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token MoveBy84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		Token Copy88=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token Rotate92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token Fill96=null;
		Token char_literal97=null;
		Token char_literal99=null;
		Token Stroke100=null;
		Token char_literal101=null;
		Token char_literal103=null;
		Token NoFill104=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token NoStroke108=null;
		Token char_literal109=null;
		Token char_literal111=null;
		Token Weight112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token Hide116=null;
		Token char_literal117=null;
		Token char_literal119=null;
		Token Group120=null;
		Token char_literal121=null;
		Token char_literal123=null;
		Token Expand124=null;
		Token char_literal125=null;
		Token char_literal127=null;
		Token Merge128=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token Scale132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		Token MirrorX136=null;
		Token char_literal137=null;
		Token char_literal139=null;
		ParserRuleReturnScope exprList82 =null;
		ParserRuleReturnScope exprList86 =null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope exprList94 =null;
		ParserRuleReturnScope exprList98 =null;
		ParserRuleReturnScope exprList102 =null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope expression110 =null;
		ParserRuleReturnScope exprList114 =null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope exprList122 =null;
		ParserRuleReturnScope expression126 =null;
		ParserRuleReturnScope expression130 =null;
		ParserRuleReturnScope exprList134 =null;
		ParserRuleReturnScope expression138 =null;

		Object Move80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object MoveBy84_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
		Object Copy88_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object Rotate92_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		Object Fill96_tree=null;
		Object char_literal97_tree=null;
		Object char_literal99_tree=null;
		Object Stroke100_tree=null;
		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		Object NoFill104_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		Object NoStroke108_tree=null;
		Object char_literal109_tree=null;
		Object char_literal111_tree=null;
		Object Weight112_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;
		Object Hide116_tree=null;
		Object char_literal117_tree=null;
		Object char_literal119_tree=null;
		Object Group120_tree=null;
		Object char_literal121_tree=null;
		Object char_literal123_tree=null;
		Object Expand124_tree=null;
		Object char_literal125_tree=null;
		Object char_literal127_tree=null;
		Object Merge128_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		Object Scale132_tree=null;
		Object char_literal133_tree=null;
		Object char_literal135_tree=null;
		Object MirrorX136_tree=null;
		Object char_literal137_tree=null;
		Object char_literal139_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_MoveBy=new RewriteRuleTokenStream(adaptor,"token MoveBy");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_MirrorX=new RewriteRuleTokenStream(adaptor,"token MirrorX");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Merge=new RewriteRuleTokenStream(adaptor,"token Merge");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Scale=new RewriteRuleTokenStream(adaptor,"token Scale");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) )
			int alt27=15;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt27=1;
				}
				break;
			case MoveBy:
				{
				alt27=2;
				}
				break;
			case Copy:
				{
				alt27=3;
				}
				break;
			case Rotate:
				{
				alt27=4;
				}
				break;
			case Fill:
				{
				alt27=5;
				}
				break;
			case Stroke:
				{
				alt27=6;
				}
				break;
			case NoFill:
				{
				alt27=7;
				}
				break;
			case NoStroke:
				{
				alt27=8;
				}
				break;
			case Weight:
				{
				alt27=9;
				}
				break;
			case Hide:
				{
				alt27=10;
				}
				break;
			case Group:
				{
				alt27=11;
				}
				break;
			case Expand:
				{
				alt27=12;
				}
				break;
			case Merge:
				{
				alt27=13;
				}
				break;
			case Scale:
				{
				alt27=14;
				}
				break;
			case MirrorX:
				{
				alt27=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:6: Move '(' ( exprList )? ')'
					{
					Move80=(Token)match(input,Move,FOLLOW_Move_in_transformCall775);  
					stream_Move.add(Move80);

					char_literal81=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall777);  
					stream_OParen.add(char_literal81);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= GetDistance && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= MirrorX)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= Weight)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall779);
							exprList82=exprList();
							state._fsp--;

							stream_exprList.add(exprList82.getTree());
							}
							break;

					}

					char_literal83=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall782);  
					stream_CParen.add(char_literal83);

					// AST REWRITE
					// elements: exprList, Move
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy84=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall800);  
					stream_MoveBy.add(MoveBy84);

					char_literal85=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall802);  
					stream_OParen.add(char_literal85);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ATan||LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||LA20_0==Fill||(LA20_0 >= GetDistance && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= MirrorX)||(LA20_0 >= Move && LA20_0 <= MoveBy)||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Polygon)||(LA20_0 >= Print && LA20_0 <= Println)||(LA20_0 >= Random && LA20_0 <= Rect)||(LA20_0 >= Rotate && LA20_0 <= Round)||(LA20_0 >= Scale && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||LA20_0==Tan||(LA20_0 >= WIDTH_CONSTANT && LA20_0 <= Weight)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall804);
							exprList86=exprList();
							state._fsp--;

							stream_exprList.add(exprList86.getTree());
							}
							break;

					}

					char_literal87=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall807);  
					stream_CParen.add(char_literal87);

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
					// 122:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:34: ^( FUNC_CALL MoveBy ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MoveBy.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:53: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:6: Copy '(' expression ')'
					{
					Copy88=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall831);  
					stream_Copy.add(Copy88);

					char_literal89=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall833);  
					stream_OParen.add(char_literal89);

					pushFollow(FOLLOW_expression_in_transformCall835);
					expression90=expression();
					state._fsp--;

					stream_expression.add(expression90.getTree());
					char_literal91=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall837);  
					stream_CParen.add(char_literal91);

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
					// 124:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:33: ^( FUNC_CALL Copy expression )
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
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:6: Rotate '(' ( exprList )? ')'
					{
					Rotate92=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall854);  
					stream_Rotate.add(Rotate92);

					char_literal93=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall856);  
					stream_OParen.add(char_literal93);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ATan||LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= GetDistance && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= MirrorX)||(LA21_0 >= Move && LA21_0 <= MoveBy)||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||(LA21_0 >= Random && LA21_0 <= Rect)||(LA21_0 >= Rotate && LA21_0 <= Round)||(LA21_0 >= Scale && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||LA21_0==Tan||(LA21_0 >= WIDTH_CONSTANT && LA21_0 <= Weight)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall858);
							exprList94=exprList();
							state._fsp--;

							stream_exprList.add(exprList94.getTree());
							}
							break;

					}

					char_literal95=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall861);  
					stream_CParen.add(char_literal95);

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
					// 125:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:6: Fill '(' ( exprList )? ')'
					{
					Fill96=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall878);  
					stream_Fill.add(Fill96);

					char_literal97=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall880);  
					stream_OParen.add(char_literal97);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:15: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= GetDistance && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= MirrorX)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= WIDTH_CONSTANT && LA22_0 <= Weight)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall882);
							exprList98=exprList();
							state._fsp--;

							stream_exprList.add(exprList98.getTree());
							}
							break;

					}

					char_literal99=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall885);  
					stream_CParen.add(char_literal99);

					// AST REWRITE
					// elements: Fill, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: Stroke '(' ( exprList )? ')'
					{
					Stroke100=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall902);  
					stream_Stroke.add(Stroke100);

					char_literal101=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall904);  
					stream_OParen.add(char_literal101);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= GetDistance && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= MirrorX)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= WIDTH_CONSTANT && LA23_0 <= Weight)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall906);
							exprList102=exprList();
							state._fsp--;

							stream_exprList.add(exprList102.getTree());
							}
							break;

					}

					char_literal103=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall909);  
					stream_CParen.add(char_literal103);

					// AST REWRITE
					// elements: exprList, Stroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: NoFill '(' expression ')'
					{
					NoFill104=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall926);  
					stream_NoFill.add(NoFill104);

					char_literal105=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall928);  
					stream_OParen.add(char_literal105);

					pushFollow(FOLLOW_expression_in_transformCall930);
					expression106=expression();
					state._fsp--;

					stream_expression.add(expression106.getTree());
					char_literal107=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall932);  
					stream_CParen.add(char_literal107);

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
					// 128:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:34: ^( FUNC_CALL NoFill expression )
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
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: NoStroke '(' expression ')'
					{
					NoStroke108=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall948);  
					stream_NoStroke.add(NoStroke108);

					char_literal109=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall950);  
					stream_OParen.add(char_literal109);

					pushFollow(FOLLOW_expression_in_transformCall952);
					expression110=expression();
					state._fsp--;

					stream_expression.add(expression110.getTree());
					char_literal111=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall954);  
					stream_CParen.add(char_literal111);

					// AST REWRITE
					// elements: expression, NoStroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:36: ^( FUNC_CALL NoStroke expression )
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
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Weight '(' ( exprList )? ')'
					{
					Weight112=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall970);  
					stream_Weight.add(Weight112);

					char_literal113=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall972);  
					stream_OParen.add(char_literal113);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= GetDistance && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= MirrorX)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= Size)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= WIDTH_CONSTANT && LA24_0 <= Weight)) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall974);
							exprList114=exprList();
							state._fsp--;

							stream_exprList.add(exprList114.getTree());
							}
							break;

					}

					char_literal115=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall977);  
					stream_CParen.add(char_literal115);

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
					// 130:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: Hide '(' expression ')'
					{
					Hide116=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall994);  
					stream_Hide.add(Hide116);

					char_literal117=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall996);  
					stream_OParen.add(char_literal117);

					pushFollow(FOLLOW_expression_in_transformCall998);
					expression118=expression();
					state._fsp--;

					stream_expression.add(expression118.getTree());
					char_literal119=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1000);  
					stream_CParen.add(char_literal119);

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
					// 131:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:32: ^( FUNC_CALL Hide expression )
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
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Group '(' ( exprList )? ')'
					{
					Group120=(Token)match(input,Group,FOLLOW_Group_in_transformCall1016);  
					stream_Group.add(Group120);

					char_literal121=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1018);  
					stream_OParen.add(char_literal121);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:16: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||LA25_0==Assert||LA25_0==Bool||LA25_0==COLOR_CONSTANT||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||LA25_0==Fill||(LA25_0 >= GetDistance && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= MirrorX)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= Size)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= WIDTH_CONSTANT && LA25_0 <= Weight)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1020);
							exprList122=exprList();
							state._fsp--;

							stream_exprList.add(exprList122.getTree());
							}
							break;

					}

					char_literal123=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1023);  
					stream_CParen.add(char_literal123);

					// AST REWRITE
					// elements: Group, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: Expand '(' expression ')'
					{
					Expand124=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1040);  
					stream_Expand.add(Expand124);

					char_literal125=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1042);  
					stream_OParen.add(char_literal125);

					pushFollow(FOLLOW_expression_in_transformCall1044);
					expression126=expression();
					state._fsp--;

					stream_expression.add(expression126.getTree());
					char_literal127=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1046);  
					stream_CParen.add(char_literal127);

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
					// 133:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:34: ^( FUNC_CALL Expand expression )
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
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Merge '(' expression ')'
					{
					Merge128=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1062);  
					stream_Merge.add(Merge128);

					char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1064);  
					stream_OParen.add(char_literal129);

					pushFollow(FOLLOW_expression_in_transformCall1066);
					expression130=expression();
					state._fsp--;

					stream_expression.add(expression130.getTree());
					char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1068);  
					stream_CParen.add(char_literal131);

					// AST REWRITE
					// elements: Merge, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:33: ^( FUNC_CALL Merge expression )
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
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: Scale '(' ( exprList )? ')'
					{
					Scale132=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1084);  
					stream_Scale.add(Scale132);

					char_literal133=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1086);  
					stream_OParen.add(char_literal133);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:16: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||LA26_0==Assert||LA26_0==Bool||LA26_0==COLOR_CONSTANT||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||LA26_0==Fill||(LA26_0 >= GetDistance && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= MirrorX)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Polygon)||(LA26_0 >= Print && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= Size)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==Tan||(LA26_0 >= WIDTH_CONSTANT && LA26_0 <= Weight)) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1088);
							exprList134=exprList();
							state._fsp--;

							stream_exprList.add(exprList134.getTree());
							}
							break;

					}

					char_literal135=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1091);  
					stream_CParen.add(char_literal135);

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
					// 135:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:32: ^( FUNC_CALL Scale ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:50: ( exprList )?
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
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: MirrorX '(' expression ')'
					{
					MirrorX136=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1108);  
					stream_MirrorX.add(MirrorX136);

					char_literal137=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1110);  
					stream_OParen.add(char_literal137);

					pushFollow(FOLLOW_expression_in_transformCall1112);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					char_literal139=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1114);  
					stream_CParen.add(char_literal139);

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
					// 136:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:35: ^( FUNC_CALL MirrorX expression )
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


	public static class getCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) );
	public final PogoParser.getCall_return getCall() throws RecognitionException {
		PogoParser.getCall_return retval = new PogoParser.getCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GetWidth140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token GetHeight144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		Token GetX148=null;
		Token char_literal149=null;
		Token char_literal151=null;
		Token GetY152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		Token GetOrigin156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		Token GetRotation160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token GetFill164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		Token GetStroke168=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token GetStart172=null;
		Token char_literal173=null;
		Token char_literal175=null;
		Token GetEnd176=null;
		Token char_literal177=null;
		Token char_literal179=null;
		Token GetDistance180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		ParserRuleReturnScope expression142 =null;
		ParserRuleReturnScope expression146 =null;
		ParserRuleReturnScope expression150 =null;
		ParserRuleReturnScope expression154 =null;
		ParserRuleReturnScope expression158 =null;
		ParserRuleReturnScope expression162 =null;
		ParserRuleReturnScope expression166 =null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression174 =null;
		ParserRuleReturnScope expression178 =null;
		ParserRuleReturnScope exprList182 =null;

		Object GetWidth140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object GetHeight144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
		Object GetX148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		Object GetY152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		Object GetOrigin156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		Object GetRotation160_tree=null;
		Object char_literal161_tree=null;
		Object char_literal163_tree=null;
		Object GetFill164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		Object GetStroke168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal171_tree=null;
		Object GetStart172_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;
		Object GetEnd176_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		Object GetDistance180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_GetFill=new RewriteRuleTokenStream(adaptor,"token GetFill");
		RewriteRuleTokenStream stream_GetEnd=new RewriteRuleTokenStream(adaptor,"token GetEnd");
		RewriteRuleTokenStream stream_GetRotation=new RewriteRuleTokenStream(adaptor,"token GetRotation");
		RewriteRuleTokenStream stream_GetStroke=new RewriteRuleTokenStream(adaptor,"token GetStroke");
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt29=11;
			switch ( input.LA(1) ) {
			case GetWidth:
				{
				alt29=1;
				}
				break;
			case GetHeight:
				{
				alt29=2;
				}
				break;
			case GetX:
				{
				alt29=3;
				}
				break;
			case GetY:
				{
				alt29=4;
				}
				break;
			case GetOrigin:
				{
				alt29=5;
				}
				break;
			case GetRotation:
				{
				alt29=6;
				}
				break;
			case GetFill:
				{
				alt29=7;
				}
				break;
			case GetStroke:
				{
				alt29=8;
				}
				break;
			case GetStart:
				{
				alt29=9;
				}
				break;
			case GetEnd:
				{
				alt29=10;
				}
				break;
			case GetDistance:
				{
				alt29=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:5: GetWidth '(' expression ')'
					{
					GetWidth140=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1146);  
					stream_GetWidth.add(GetWidth140);

					char_literal141=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1148);  
					stream_OParen.add(char_literal141);

					pushFollow(FOLLOW_expression_in_getCall1150);
					expression142=expression();
					state._fsp--;

					stream_expression.add(expression142.getTree());
					char_literal143=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1152);  
					stream_CParen.add(char_literal143);

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
					// 141:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:35: ^( FUNC_CALL GetWidth expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:4: GetHeight '(' expression ')'
					{
					GetHeight144=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1166);  
					stream_GetHeight.add(GetHeight144);

					char_literal145=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1168);  
					stream_OParen.add(char_literal145);

					pushFollow(FOLLOW_expression_in_getCall1170);
					expression146=expression();
					state._fsp--;

					stream_expression.add(expression146.getTree());
					char_literal147=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1172);  
					stream_CParen.add(char_literal147);

					// AST REWRITE
					// elements: expression, GetHeight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:35: ^( FUNC_CALL GetHeight expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:4: GetX '(' expression ')'
					{
					GetX148=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1186);  
					stream_GetX.add(GetX148);

					char_literal149=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1188);  
					stream_OParen.add(char_literal149);

					pushFollow(FOLLOW_expression_in_getCall1190);
					expression150=expression();
					state._fsp--;

					stream_expression.add(expression150.getTree());
					char_literal151=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1192);  
					stream_CParen.add(char_literal151);

					// AST REWRITE
					// elements: expression, GetX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:30: ^( FUNC_CALL GetX expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:4: GetY '(' expression ')'
					{
					GetY152=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1206);  
					stream_GetY.add(GetY152);

					char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1208);  
					stream_OParen.add(char_literal153);

					pushFollow(FOLLOW_expression_in_getCall1210);
					expression154=expression();
					state._fsp--;

					stream_expression.add(expression154.getTree());
					char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1212);  
					stream_CParen.add(char_literal155);

					// AST REWRITE
					// elements: expression, GetY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:30: ^( FUNC_CALL GetY expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:4: GetOrigin '(' expression ')'
					{
					GetOrigin156=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1226);  
					stream_GetOrigin.add(GetOrigin156);

					char_literal157=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1228);  
					stream_OParen.add(char_literal157);

					pushFollow(FOLLOW_expression_in_getCall1230);
					expression158=expression();
					state._fsp--;

					stream_expression.add(expression158.getTree());
					char_literal159=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1232);  
					stream_CParen.add(char_literal159);

					// AST REWRITE
					// elements: GetOrigin, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:35: ^( FUNC_CALL GetOrigin expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:4: GetRotation '(' expression ')'
					{
					GetRotation160=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1246);  
					stream_GetRotation.add(GetRotation160);

					char_literal161=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1248);  
					stream_OParen.add(char_literal161);

					pushFollow(FOLLOW_expression_in_getCall1250);
					expression162=expression();
					state._fsp--;

					stream_expression.add(expression162.getTree());
					char_literal163=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1252);  
					stream_CParen.add(char_literal163);

					// AST REWRITE
					// elements: expression, GetRotation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:37: ^( FUNC_CALL GetRotation expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:4: GetFill '(' expression ')'
					{
					GetFill164=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1266);  
					stream_GetFill.add(GetFill164);

					char_literal165=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1268);  
					stream_OParen.add(char_literal165);

					pushFollow(FOLLOW_expression_in_getCall1270);
					expression166=expression();
					state._fsp--;

					stream_expression.add(expression166.getTree());
					char_literal167=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1272);  
					stream_CParen.add(char_literal167);

					// AST REWRITE
					// elements: GetFill, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:33: ^( FUNC_CALL GetFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:4: GetStroke '(' expression ')'
					{
					GetStroke168=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1286);  
					stream_GetStroke.add(GetStroke168);

					char_literal169=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1288);  
					stream_OParen.add(char_literal169);

					pushFollow(FOLLOW_expression_in_getCall1290);
					expression170=expression();
					state._fsp--;

					stream_expression.add(expression170.getTree());
					char_literal171=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1292);  
					stream_CParen.add(char_literal171);

					// AST REWRITE
					// elements: expression, GetStroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:35: ^( FUNC_CALL GetStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:4: GetStart '(' expression ')'
					{
					GetStart172=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1306);  
					stream_GetStart.add(GetStart172);

					char_literal173=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1308);  
					stream_OParen.add(char_literal173);

					pushFollow(FOLLOW_expression_in_getCall1310);
					expression174=expression();
					state._fsp--;

					stream_expression.add(expression174.getTree());
					char_literal175=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1312);  
					stream_CParen.add(char_literal175);

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
					// 149:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:34: ^( FUNC_CALL GetStart expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:4: GetEnd '(' expression ')'
					{
					GetEnd176=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1326);  
					stream_GetEnd.add(GetEnd176);

					char_literal177=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1328);  
					stream_OParen.add(char_literal177);

					pushFollow(FOLLOW_expression_in_getCall1330);
					expression178=expression();
					state._fsp--;

					stream_expression.add(expression178.getTree());
					char_literal179=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1332);  
					stream_CParen.add(char_literal179);

					// AST REWRITE
					// elements: expression, GetEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 150:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:32: ^( FUNC_CALL GetEnd expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:5: GetDistance '(' ( exprList )? ')'
					{
					GetDistance180=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1348);  
					stream_GetDistance.add(GetDistance180);

					char_literal181=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1350);  
					stream_OParen.add(char_literal181);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:21: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||LA28_0==Assert||LA28_0==Bool||LA28_0==COLOR_CONSTANT||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||LA28_0==Fill||(LA28_0 >= GetDistance && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= MirrorX)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= Size)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= WIDTH_CONSTANT && LA28_0 <= Weight)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1352);
							exprList182=exprList();
							state._fsp--;

							stream_exprList.add(exprList182.getTree());
							}
							break;

					}

					char_literal183=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1356);  
					stream_CParen.add(char_literal183);

					// AST REWRITE
					// elements: exprList, GetDistance
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 151:35: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:38: ^( FUNC_CALL GetDistance ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetDistance.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:62: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine184=null;
		Token char_literal185=null;
		Token char_literal187=null;
		Token Sine188=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token Tan192=null;
		Token char_literal193=null;
		Token char_literal195=null;
		Token ATan196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token Random200=null;
		Token char_literal201=null;
		Token char_literal203=null;
		Token Round204=null;
		Token char_literal205=null;
		Token char_literal207=null;
		Token Map208=null;
		Token char_literal209=null;
		Token char_literal211=null;
		ParserRuleReturnScope expression186 =null;
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope expression198 =null;
		ParserRuleReturnScope exprList202 =null;
		ParserRuleReturnScope expression206 =null;
		ParserRuleReturnScope exprList210 =null;

		Object Cosine184_tree=null;
		Object char_literal185_tree=null;
		Object char_literal187_tree=null;
		Object Sine188_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object Tan192_tree=null;
		Object char_literal193_tree=null;
		Object char_literal195_tree=null;
		Object ATan196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		Object Random200_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;
		Object Round204_tree=null;
		Object char_literal205_tree=null;
		Object char_literal207_tree=null;
		Object Map208_tree=null;
		Object char_literal209_tree=null;
		Object char_literal211_tree=null;
		RewriteRuleTokenStream stream_Tan=new RewriteRuleTokenStream(adaptor,"token Tan");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Map=new RewriteRuleTokenStream(adaptor,"token Map");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Round=new RewriteRuleTokenStream(adaptor,"token Round");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleTokenStream stream_Random=new RewriteRuleTokenStream(adaptor,"token Random");
		RewriteRuleTokenStream stream_ATan=new RewriteRuleTokenStream(adaptor,"token ATan");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) )
			int alt32=7;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt32=1;
				}
				break;
			case Sine:
				{
				alt32=2;
				}
				break;
			case Tan:
				{
				alt32=3;
				}
				break;
			case ATan:
				{
				alt32=4;
				}
				break;
			case Random:
				{
				alt32=5;
				}
				break;
			case Round:
				{
				alt32=6;
				}
				break;
			case Map:
				{
				alt32=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:6: Cosine '(' expression ')'
					{
					Cosine184=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1388);  
					stream_Cosine.add(Cosine184);

					char_literal185=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1390);  
					stream_OParen.add(char_literal185);

					pushFollow(FOLLOW_expression_in_mathCall1392);
					expression186=expression();
					state._fsp--;

					stream_expression.add(expression186.getTree());
					char_literal187=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1394);  
					stream_CParen.add(char_literal187);

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
					// 155:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:6: Sine '(' expression ')'
					{
					Sine188=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1413);  
					stream_Sine.add(Sine188);

					char_literal189=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1415);  
					stream_OParen.add(char_literal189);

					pushFollow(FOLLOW_expression_in_mathCall1417);
					expression190=expression();
					state._fsp--;

					stream_expression.add(expression190.getTree());
					char_literal191=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1419);  
					stream_CParen.add(char_literal191);

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
					// 156:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:35: ^( FUNC_CALL Sine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:6: Tan '(' expression ')'
					{
					Tan192=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1438);  
					stream_Tan.add(Tan192);

					char_literal193=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1440);  
					stream_OParen.add(char_literal193);

					pushFollow(FOLLOW_expression_in_mathCall1442);
					expression194=expression();
					state._fsp--;

					stream_expression.add(expression194.getTree());
					char_literal195=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1444);  
					stream_CParen.add(char_literal195);

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
					// 157:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:34: ^( FUNC_CALL Tan expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:6: ATan '(' expression ')'
					{
					ATan196=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1463);  
					stream_ATan.add(ATan196);

					char_literal197=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1465);  
					stream_OParen.add(char_literal197);

					pushFollow(FOLLOW_expression_in_mathCall1467);
					expression198=expression();
					state._fsp--;

					stream_expression.add(expression198.getTree());
					char_literal199=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1469);  
					stream_CParen.add(char_literal199);

					// AST REWRITE
					// elements: expression, ATan
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 158:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:35: ^( FUNC_CALL ATan expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_ATan.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:6: Random '(' ( exprList )? ')'
					{
					Random200=(Token)match(input,Random,FOLLOW_Random_in_mathCall1488);  
					stream_Random.add(Random200);

					char_literal201=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1490);  
					stream_OParen.add(char_literal201);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:17: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||LA30_0==Assert||LA30_0==Bool||LA30_0==COLOR_CONSTANT||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||LA30_0==Fill||(LA30_0 >= GetDistance && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= MirrorX)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Polygon)||(LA30_0 >= Print && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= Size)||(LA30_0 >= String && LA30_0 <= Subtract)||LA30_0==Tan||(LA30_0 >= WIDTH_CONSTANT && LA30_0 <= Weight)) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1492);
							exprList202=exprList();
							state._fsp--;

							stream_exprList.add(exprList202.getTree());
							}
							break;

					}

					char_literal203=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1495);  
					stream_CParen.add(char_literal203);

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
					// 159:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:36: ^( FUNC_CALL Random ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:6: Round '(' expression ')'
					{
					Round204=(Token)match(input,Round,FOLLOW_Round_in_mathCall1515);  
					stream_Round.add(Round204);

					char_literal205=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1516);  
					stream_OParen.add(char_literal205);

					pushFollow(FOLLOW_expression_in_mathCall1518);
					expression206=expression();
					state._fsp--;

					stream_expression.add(expression206.getTree());
					char_literal207=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1520);  
					stream_CParen.add(char_literal207);

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
					// 160:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:35: ^( FUNC_CALL Round expression )
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
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:6: Map '(' ( exprList )? ')'
					{
					Map208=(Token)match(input,Map,FOLLOW_Map_in_mathCall1539);  
					stream_Map.add(Map208);

					char_literal209=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1540);  
					stream_OParen.add(char_literal209);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:13: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ATan||LA31_0==Assert||LA31_0==Bool||LA31_0==COLOR_CONSTANT||(LA31_0 >= Copy && LA31_0 <= Curve)||LA31_0==Ellipse||(LA31_0 >= Excl && LA31_0 <= Expand)||LA31_0==Fill||(LA31_0 >= GetDistance && LA31_0 <= Hide)||LA31_0==Identifier||LA31_0==LAdd||(LA31_0 >= LRemove && LA31_0 <= LShape)||(LA31_0 >= Line && LA31_0 <= MirrorX)||(LA31_0 >= Move && LA31_0 <= MoveBy)||(LA31_0 >= NoFill && LA31_0 <= Number)||(LA31_0 >= OBracket && LA31_0 <= OParen)||(LA31_0 >= PI_CONSTANT && LA31_0 <= Polygon)||(LA31_0 >= Print && LA31_0 <= Println)||(LA31_0 >= Random && LA31_0 <= Rect)||(LA31_0 >= Rotate && LA31_0 <= Round)||(LA31_0 >= Scale && LA31_0 <= Size)||(LA31_0 >= String && LA31_0 <= Subtract)||LA31_0==Tan||(LA31_0 >= WIDTH_CONSTANT && LA31_0 <= Weight)) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1542);
							exprList210=exprList();
							state._fsp--;

							stream_exprList.add(exprList210.getTree());
							}
							break;

					}

					char_literal211=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1545);  
					stream_CParen.add(char_literal211);

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
					// 161:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:32: ^( FUNC_CALL Map ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:48: ( exprList )?
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
	// $ANTLR end "mathCall"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End215=null;
		ParserRuleReturnScope ifStat212 =null;
		ParserRuleReturnScope elseIfStat213 =null;
		ParserRuleReturnScope elseStat214 =null;

		Object End215_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1580);
			ifStat212=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat212.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:13: ( elseIfStat )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Else) ) {
					int LA33_1 = input.LA(2);
					if ( (LA33_1==If) ) {
						alt33=1;
					}

				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1582);
					elseIfStat213=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat213.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:25: ( elseStat )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Else) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1585);
					elseStat214=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat214.getTree());
					}
					break;

			}

			End215=(Token)match(input,End,FOLLOW_End_in_ifStatement1588);  
			stream_End.add(End215);

			// AST REWRITE
			// elements: elseIfStat, elseStat, ifStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 167:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:66: ( elseStat )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If216=null;
		Token Do218=null;
		ParserRuleReturnScope expression217 =null;
		ParserRuleReturnScope block219 =null;

		Object If216_tree=null;
		Object Do218_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:6: If expression Do block
			{
			If216=(Token)match(input,If,FOLLOW_If_in_ifStat1617);  
			stream_If.add(If216);

			pushFollow(FOLLOW_expression_in_ifStat1619);
			expression217=expression();
			state._fsp--;

			stream_expression.add(expression217.getTree());
			Do218=(Token)match(input,Do,FOLLOW_Do_in_ifStat1621);  
			stream_Do.add(Do218);

			pushFollow(FOLLOW_block_in_ifStat1623);
			block219=block();
			state._fsp--;

			stream_block.add(block219.getTree());
			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 172:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:32: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else220=null;
		Token If221=null;
		Token Do223=null;
		ParserRuleReturnScope expression222 =null;
		ParserRuleReturnScope block224 =null;

		Object Else220_tree=null;
		Object If221_tree=null;
		Object Do223_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:6: Else If expression Do block
			{
			Else220=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1647);  
			stream_Else.add(Else220);

			If221=(Token)match(input,If,FOLLOW_If_in_elseIfStat1649);  
			stream_If.add(If221);

			pushFollow(FOLLOW_expression_in_elseIfStat1651);
			expression222=expression();
			state._fsp--;

			stream_expression.add(expression222.getTree());
			Do223=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1653);  
			stream_Do.add(Do223);

			pushFollow(FOLLOW_block_in_elseIfStat1655);
			block224=block();
			state._fsp--;

			stream_block.add(block224.getTree());
			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 176:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:37: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else225=null;
		Token Do226=null;
		ParserRuleReturnScope block227 =null;

		Object Else225_tree=null;
		Object Do226_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: Else Do block
			{
			Else225=(Token)match(input,Else,FOLLOW_Else_in_elseStat1679);  
			stream_Else.add(Else225);

			Do226=(Token)match(input,Do,FOLLOW_Do_in_elseStat1681);  
			stream_Do.add(Do226);

			pushFollow(FOLLOW_block_in_elseStat1683);
			block227=block();
			state._fsp--;

			stream_block.add(block227.getTree());
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
			// 180:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:23: ^( EXP block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def228=null;
		Token Identifier229=null;
		Token char_literal230=null;
		Token char_literal232=null;
		Token Do233=null;
		Token End235=null;
		ParserRuleReturnScope idList231 =null;
		ParserRuleReturnScope block234 =null;

		Object Def228_tree=null;
		Object Identifier229_tree=null;
		Object char_literal230_tree=null;
		Object char_literal232_tree=null;
		Object Do233_tree=null;
		Object End235_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def228=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1705); 
			Def228_tree = (Object)adaptor.create(Def228);
			adaptor.addChild(root_0, Def228_tree);

			Identifier229=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1707); 
			Identifier229_tree = (Object)adaptor.create(Identifier229);
			adaptor.addChild(root_0, Identifier229_tree);

			char_literal230=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1709); 
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:25: ( idList )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Identifier) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1711);
					idList231=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList231.getTree());

					}
					break;

			}

			char_literal232=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1714); 
			char_literal232_tree = (Object)adaptor.create(char_literal232);
			adaptor.addChild(root_0, char_literal232_tree);

			Do233=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1716); 
			Do233_tree = (Object)adaptor.create(Do233);
			adaptor.addChild(root_0, Do233_tree);

			pushFollow(FOLLOW_block_in_functionDecl1718);
			block234=block();
			state._fsp--;

			adaptor.addChild(root_0, block234.getTree());

			End235=(Token)match(input,End,FOLLOW_End_in_functionDecl1720); 
			End235_tree = (Object)adaptor.create(End235);
			adaptor.addChild(root_0, End235_tree);

			defineFunction((Identifier229!=null?Identifier229.getText():null), (idList231!=null?((Object)idList231.getTree()):null), (block234!=null?((Object)block234.getTree()):null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For236=null;
		Token Identifier237=null;
		Token char_literal238=null;
		Token Do240=null;
		Token Do242=null;
		Token End244=null;
		ParserRuleReturnScope expression239 =null;
		ParserRuleReturnScope expression241 =null;
		ParserRuleReturnScope block243 =null;

		Object For236_tree=null;
		Object Identifier237_tree=null;
		Object char_literal238_tree=null;
		Object Do240_tree=null;
		Object Do242_tree=null;
		Object End244_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:6: For Identifier '=' expression Do expression Do block End
			{
			For236=(Token)match(input,For,FOLLOW_For_in_forStatement1742);  
			stream_For.add(For236);

			Identifier237=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1744);  
			stream_Identifier.add(Identifier237);

			char_literal238=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1746);  
			stream_Assign.add(char_literal238);

			pushFollow(FOLLOW_expression_in_forStatement1748);
			expression239=expression();
			state._fsp--;

			stream_expression.add(expression239.getTree());
			Do240=(Token)match(input,Do,FOLLOW_Do_in_forStatement1750);  
			stream_Do.add(Do240);

			pushFollow(FOLLOW_expression_in_forStatement1752);
			expression241=expression();
			state._fsp--;

			stream_expression.add(expression241.getTree());
			Do242=(Token)match(input,Do,FOLLOW_Do_in_forStatement1754);  
			stream_Do.add(Do242);

			pushFollow(FOLLOW_block_in_forStatement1756);
			block243=block();
			state._fsp--;

			stream_block.add(block243.getTree());
			End244=(Token)match(input,End,FOLLOW_End_in_forStatement1758);  
			stream_End.add(End244);

			// AST REWRITE
			// elements: expression, expression, For, Identifier, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 190:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:9: ^( For Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat245=null;
		Token Identifier246=null;
		Token char_literal247=null;
		Token Do249=null;
		Token char_literal251=null;
		Token Do253=null;
		Token End255=null;
		ParserRuleReturnScope expression248 =null;
		ParserRuleReturnScope expression250 =null;
		ParserRuleReturnScope expression252 =null;
		ParserRuleReturnScope block254 =null;

		Object Repeat245_tree=null;
		Object Identifier246_tree=null;
		Object char_literal247_tree=null;
		Object Do249_tree=null;
		Object char_literal251_tree=null;
		Object Do253_tree=null;
		Object End255_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat245=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1791);  
			stream_Repeat.add(Repeat245);

			Identifier246=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1793);  
			stream_Identifier.add(Identifier246);

			char_literal247=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1795);  
			stream_Assign.add(char_literal247);

			pushFollow(FOLLOW_expression_in_repeatStatement1797);
			expression248=expression();
			state._fsp--;

			stream_expression.add(expression248.getTree());
			Do249=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1799);  
			stream_Do.add(Do249);

			pushFollow(FOLLOW_expression_in_repeatStatement1801);
			expression250=expression();
			state._fsp--;

			stream_expression.add(expression250.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:52: ( '|' expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==135) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:53: '|' expression
					{
					char_literal251=(Token)match(input,135,FOLLOW_135_in_repeatStatement1804);  
					stream_135.add(char_literal251);

					pushFollow(FOLLOW_expression_in_repeatStatement1806);
					expression252=expression();
					state._fsp--;

					stream_expression.add(expression252.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			Do253=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1810);  
			stream_Do.add(Do253);

			pushFollow(FOLLOW_block_in_repeatStatement1812);
			block254=block();
			state._fsp--;

			stream_block.add(block254.getTree());
			End255=(Token)match(input,End,FOLLOW_End_in_repeatStatement1814);  
			stream_End.add(End255);

			// AST REWRITE
			// elements: block, expression, Identifier, Repeat, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 194:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:86: ^( Repeat Identifier expression expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Repeat.nextNode(), root_1);
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
	// $ANTLR end "repeatStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While256=null;
		Token Do258=null;
		Token End260=null;
		ParserRuleReturnScope expression257 =null;
		ParserRuleReturnScope block259 =null;

		Object While256_tree=null;
		Object Do258_tree=null;
		Object End260_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:6: While expression Do block End
			{
			While256=(Token)match(input,While,FOLLOW_While_in_whileStatement1842);  
			stream_While.add(While256);

			pushFollow(FOLLOW_expression_in_whileStatement1844);
			expression257=expression();
			state._fsp--;

			stream_expression.add(expression257.getTree());
			Do258=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1846);  
			stream_Do.add(Do258);

			pushFollow(FOLLOW_block_in_whileStatement1848);
			block259=block();
			state._fsp--;

			stream_block.add(block259.getTree());
			End260=(Token)match(input,End,FOLLOW_End_in_whileStatement1850);  
			stream_End.add(End260);

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
			// 198:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:39: ^( While expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier261=null;
		Token char_literal262=null;
		Token Identifier263=null;

		Object Identifier261_tree=null;
		Object char_literal262_tree=null;
		Object Identifier263_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:6: Identifier ( ',' Identifier )*
			{
			Identifier261=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1874);  
			stream_Identifier.add(Identifier261);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:17: ( ',' Identifier )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==Comma) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:18: ',' Identifier
					{
					char_literal262=(Token)match(input,Comma,FOLLOW_Comma_in_idList1877);  
					stream_Comma.add(char_literal262);

					Identifier263=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1879);  
					stream_Identifier.add(Identifier263);

					}
					break;

				default :
					break loop37;
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
			// 202:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal265=null;
		ParserRuleReturnScope expression264 =null;
		ParserRuleReturnScope expression266 =null;

		Object char_literal265_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1904);
			expression264=expression();
			state._fsp--;

			stream_expression.add(expression264.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:17: ( ',' expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Comma) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:18: ',' expression
					{
					char_literal265=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1907);  
					stream_Comma.add(char_literal265);

					pushFollow(FOLLOW_expression_in_exprList1909);
					expression266=expression();
					state._fsp--;

					stream_expression.add(expression266.getTree());
					}
					break;

				default :
					break loop38;
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
			// 206:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr267 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression1934);
			condExpr267=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr267.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal269=null;
		Token char_literal270=null;
		Token In271=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr268 =null;
		ParserRuleReturnScope expression272 =null;

		Object char_literal269_tree=null;
		Object char_literal270_tree=null;
		Object In271_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1949);
			orExpr268=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr268.getTree());
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
			// 214:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==QMark) ) {
				alt39=1;
			}
			else if ( (LA39_0==In) ) {
				alt39=2;
			}
			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:8: '?' a= expression ':' b= expression
					{
					char_literal269=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1964);  
					stream_QMark.add(char_literal269);

					pushFollow(FOLLOW_expression_in_condExpr1968);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal270=(Token)match(input,Do,FOLLOW_Do_in_condExpr1970);  
					stream_Do.add(char_literal270);

					pushFollow(FOLLOW_expression_in_condExpr1974);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: a, b, orExpr
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
					// 215:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:45: ^( TERNARY orExpr $a $b)
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:8: In expression
					{
					In271=(Token)match(input,In,FOLLOW_In_in_condExpr1997);  
					stream_In.add(In271);

					pushFollow(FOLLOW_expression_in_condExpr1999);
					expression272=expression();
					state._fsp--;

					stream_expression.add(expression272.getTree());
					// AST REWRITE
					// elements: expression, In, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 216:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:45: ^( In orExpr expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal274=null;
		ParserRuleReturnScope andExpr273 =null;
		ParserRuleReturnScope andExpr275 =null;

		Object string_literal274_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr2051);
			andExpr273=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr273.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:14: ( '||' ^ andExpr )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==136) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:15: '||' ^ andExpr
					{
					string_literal274=(Token)match(input,136,FOLLOW_136_in_orExpr2054); 
					string_literal274_tree = (Object)adaptor.create(string_literal274);
					root_0 = (Object)adaptor.becomeRoot(string_literal274_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2057);
					andExpr275=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr275.getTree());

					}
					break;

				default :
					break loop40;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal277=null;
		ParserRuleReturnScope equExpr276 =null;
		ParserRuleReturnScope equExpr278 =null;

		Object string_literal277_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr2073);
			equExpr276=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr276.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:14: ( '&&' ^ equExpr )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==133) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:15: '&&' ^ equExpr
					{
					string_literal277=(Token)match(input,133,FOLLOW_133_in_andExpr2076); 
					string_literal277_tree = (Object)adaptor.create(string_literal277);
					root_0 = (Object)adaptor.becomeRoot(string_literal277_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2079);
					equExpr278=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr278.getTree());

					}
					break;

				default :
					break loop41;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set280=null;
		ParserRuleReturnScope relExpr279 =null;
		ParserRuleReturnScope relExpr281 =null;

		Object set280_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr2095);
			relExpr279=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr279.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==Equals||LA42_0==NEquals) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:15: ( '==' | '!=' ) ^ relExpr
					{
					set280=input.LT(1);
					set280=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set280), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr2107);
					relExpr281=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr281.getTree());

					}
					break;

				default :
					break loop42;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set283=null;
		ParserRuleReturnScope addExpr282 =null;
		ParserRuleReturnScope addExpr284 =null;

		Object set283_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr2123);
			addExpr282=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr282.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= GT && LA43_0 <= GTEquals)||(LA43_0 >= LT && LA43_0 <= LTEquals)) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set283=input.LT(1);
					set283=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set283), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr2143);
					addExpr284=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr284.getTree());

					}
					break;

				default :
					break loop43;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set286=null;
		ParserRuleReturnScope mulExpr285 =null;
		ParserRuleReturnScope mulExpr287 =null;

		Object set286_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr2159);
			mulExpr285=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr285.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==Add||LA44_0==Subtract) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:15: ( '+' | '-' ) ^ mulExpr
					{
					set286=input.LT(1);
					set286=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set286), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr2171);
					mulExpr287=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr287.getTree());

					}
					break;

				default :
					break loop44;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set289=null;
		ParserRuleReturnScope powExpr288 =null;
		ParserRuleReturnScope powExpr290 =null;

		Object set289_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr2187);
			powExpr288=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr288.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==Divide||LA45_0==Modulus||LA45_0==Multiply) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set289=input.LT(1);
					set289=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set289), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr2203);
					powExpr290=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr290.getTree());

					}
					break;

				default :
					break loop45;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:244:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal292=null;
		ParserRuleReturnScope unaryExpr291 =null;
		ParserRuleReturnScope unaryExpr293 =null;

		Object char_literal292_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr2219);
			unaryExpr291=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr291.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:16: ( '^' ^ unaryExpr )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==Pow) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:17: '^' ^ unaryExpr
					{
					char_literal292=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr2222); 
					char_literal292_tree = (Object)adaptor.create(char_literal292);
					root_0 = (Object)adaptor.becomeRoot(char_literal292_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr2225);
					unaryExpr293=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr293.getTree());

					}
					break;

				default :
					break loop46;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal294=null;
		Token char_literal296=null;
		ParserRuleReturnScope atom295 =null;
		ParserRuleReturnScope atom297 =null;
		ParserRuleReturnScope atom298 =null;

		Object char_literal294_tree=null;
		Object char_literal296_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt47=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt47=1;
				}
				break;
			case Excl:
				{
				alt47=2;
				}
				break;
			case ATan:
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case HEIGHT_CONSTANT:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case PI_CONSTANT:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Tan:
			case WIDTH_CONSTANT:
			case Weight:
				{
				alt47=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:6: '-' atom
					{
					char_literal294=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr2243);  
					stream_Subtract.add(char_literal294);

					pushFollow(FOLLOW_atom_in_unaryExpr2245);
					atom295=atom();
					state._fsp--;

					stream_atom.add(atom295.getTree());
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
					// 249:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:18: ^( UNARY_MIN atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:6: '!' atom
					{
					char_literal296=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr2260);  
					stream_Excl.add(char_literal296);

					pushFollow(FOLLOW_atom_in_unaryExpr2262);
					atom297=atom();
					state._fsp--;

					stream_atom.add(atom297.getTree());
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
					// 250:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:18: ^( NEGATE atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr2277);
					atom298=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom298.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number299=null;
		Token Bool300=null;
		Token Null301=null;
		Token COLOR_CONSTANT303=null;
		Token PI_CONSTANT304=null;
		Token WIDTH_CONSTANT305=null;
		Token HEIGHT_CONSTANT306=null;
		ParserRuleReturnScope lookup302 =null;

		Object Number299_tree=null;
		Object Bool300_tree=null;
		Object Null301_tree=null;
		Object COLOR_CONSTANT303_tree=null;
		Object PI_CONSTANT304_tree=null;
		Object WIDTH_CONSTANT305_tree=null;
		Object HEIGHT_CONSTANT306_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt48=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt48=1;
				}
				break;
			case Bool:
				{
				alt48=2;
				}
				break;
			case Null:
				{
				alt48=3;
				}
				break;
			case ATan:
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case OBracket:
			case OParen:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Tan:
			case Weight:
				{
				alt48=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt48=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt48=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt48=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt48=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number299=(Token)match(input,Number,FOLLOW_Number_in_atom2291); 
					Number299_tree = (Object)adaptor.create(Number299);
					adaptor.addChild(root_0, Number299_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool300=(Token)match(input,Bool,FOLLOW_Bool_in_atom2298); 
					Bool300_tree = (Object)adaptor.create(Bool300);
					adaptor.addChild(root_0, Bool300_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null301=(Token)match(input,Null,FOLLOW_Null_in_atom2305); 
					Null301_tree = (Object)adaptor.create(Null301);
					adaptor.addChild(root_0, Null301_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom2312);
					lookup302=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup302.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT303=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2318); 
					COLOR_CONSTANT303_tree = (Object)adaptor.create(COLOR_CONSTANT303);
					adaptor.addChild(root_0, COLOR_CONSTANT303_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT304=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2324); 
					PI_CONSTANT304_tree = (Object)adaptor.create(PI_CONSTANT304);
					adaptor.addChild(root_0, PI_CONSTANT304_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT305=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2330); 
					WIDTH_CONSTANT305_tree = (Object)adaptor.create(WIDTH_CONSTANT305);
					adaptor.addChild(root_0, WIDTH_CONSTANT305_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:262:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT306=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2336); 
					HEIGHT_CONSTANT306_tree = (Object)adaptor.create(HEIGHT_CONSTANT306);
					adaptor.addChild(root_0, HEIGHT_CONSTANT306_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal307=null;
		Token char_literal309=null;
		ParserRuleReturnScope exprList308 =null;

		Object char_literal307_tree=null;
		Object char_literal309_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:6: '[' ( exprList )? ']'
			{
			char_literal307=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2350);  
			stream_OBracket.add(char_literal307);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:10: ( exprList )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==ATan||LA49_0==Assert||LA49_0==Bool||LA49_0==COLOR_CONSTANT||(LA49_0 >= Copy && LA49_0 <= Curve)||LA49_0==Ellipse||(LA49_0 >= Excl && LA49_0 <= Expand)||LA49_0==Fill||(LA49_0 >= GetDistance && LA49_0 <= Hide)||LA49_0==Identifier||LA49_0==LAdd||(LA49_0 >= LRemove && LA49_0 <= LShape)||(LA49_0 >= Line && LA49_0 <= MirrorX)||(LA49_0 >= Move && LA49_0 <= MoveBy)||(LA49_0 >= NoFill && LA49_0 <= Number)||(LA49_0 >= OBracket && LA49_0 <= OParen)||(LA49_0 >= PI_CONSTANT && LA49_0 <= Polygon)||(LA49_0 >= Print && LA49_0 <= Println)||(LA49_0 >= Random && LA49_0 <= Rect)||(LA49_0 >= Rotate && LA49_0 <= Round)||(LA49_0 >= Scale && LA49_0 <= Size)||(LA49_0 >= String && LA49_0 <= Subtract)||LA49_0==Tan||(LA49_0 >= WIDTH_CONSTANT && LA49_0 <= Weight)) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2352);
					exprList308=exprList();
					state._fsp--;

					stream_exprList.add(exprList308.getTree());
					}
					break;

			}

			char_literal309=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2355);  
			stream_CBracket.add(char_literal309);

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
			// 266:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:34: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier315=null;
		Token String318=null;
		Token char_literal320=null;
		Token char_literal322=null;
		ParserRuleReturnScope functionCall310 =null;
		ParserRuleReturnScope indexes311 =null;
		ParserRuleReturnScope dotProperty312 =null;
		ParserRuleReturnScope list313 =null;
		ParserRuleReturnScope indexes314 =null;
		ParserRuleReturnScope indexes316 =null;
		ParserRuleReturnScope dotProperty317 =null;
		ParserRuleReturnScope indexes319 =null;
		ParserRuleReturnScope expression321 =null;
		ParserRuleReturnScope indexes323 =null;

		Object Identifier315_tree=null;
		Object String318_tree=null;
		Object char_literal320_tree=null;
		Object char_literal322_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt57=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA57_1 = input.LA(2);
				if ( (LA57_1==OParen) ) {
					alt57=1;
				}
				else if ( (LA57_1==Add||LA57_1==CBracket||(LA57_1 >= CParen && LA57_1 <= Comma)||(LA57_1 >= Divide && LA57_1 <= Do)||(LA57_1 >= DotEnd && LA57_1 <= DotY)||LA57_1==Equals||(LA57_1 >= GT && LA57_1 <= GTEquals)||LA57_1==In||(LA57_1 >= LT && LA57_1 <= LTEquals)||LA57_1==Modulus||LA57_1==Multiply||LA57_1==NEquals||LA57_1==OBracket||LA57_1==Pow||LA57_1==QMark||LA57_1==Subtract||(LA57_1 >= 133 && LA57_1 <= 136)) ) {
					alt57=3;
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
				break;
			case ATan:
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Sine:
			case Size:
			case Stroke:
			case Tan:
			case Weight:
				{
				alt57=1;
				}
				break;
			case OBracket:
				{
				alt57=2;
				}
				break;
			case String:
				{
				alt57=4;
				}
				break;
			case OParen:
				{
				alt57=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2378);
					functionCall310=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall310.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==Add||LA51_0==CBracket||(LA51_0 >= CParen && LA51_0 <= Comma)||(LA51_0 >= Divide && LA51_0 <= Do)||LA51_0==Equals||(LA51_0 >= GT && LA51_0 <= GTEquals)||LA51_0==In||(LA51_0 >= LT && LA51_0 <= LTEquals)||LA51_0==Modulus||LA51_0==Multiply||LA51_0==NEquals||LA51_0==OBracket||LA51_0==Pow||LA51_0==QMark||LA51_0==Subtract||(LA51_0 >= 133 && LA51_0 <= 136)) ) {
						alt51=1;
					}
					else if ( ((LA51_0 >= DotEnd && LA51_0 <= DotY)) ) {
						alt51=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}

					switch (alt51) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:20: ( indexes )?
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==OBracket) ) {
								alt50=1;
							}
							switch (alt50) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2381);
									indexes311=indexes();
									state._fsp--;

									stream_indexes.add(indexes311.getTree());
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
							// 270:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:55: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2398);
							dotProperty312=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty312.getTree());
							// AST REWRITE
							// elements: dotProperty, functionCall
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 270:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:83: ^( DOTPROPERTY functionCall dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2423);
					list313=list();
					state._fsp--;

					stream_list.add(list313.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:11: ( indexes )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==OBracket) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2425);
							indexes314=indexes();
							state._fsp--;

							stream_indexes.add(indexes314.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: list, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 271:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:51: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier315=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2458);  
					stream_Identifier.add(Identifier315);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==Add||LA54_0==CBracket||(LA54_0 >= CParen && LA54_0 <= Comma)||(LA54_0 >= Divide && LA54_0 <= Do)||LA54_0==Equals||(LA54_0 >= GT && LA54_0 <= GTEquals)||LA54_0==In||(LA54_0 >= LT && LA54_0 <= LTEquals)||LA54_0==Modulus||LA54_0==Multiply||LA54_0==NEquals||LA54_0==OBracket||LA54_0==Pow||LA54_0==QMark||LA54_0==Subtract||(LA54_0 >= 133 && LA54_0 <= 136)) ) {
						alt54=1;
					}
					else if ( ((LA54_0 >= DotEnd && LA54_0 <= DotY)) ) {
						alt54=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}

					switch (alt54) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:18: ( indexes )?
							int alt53=2;
							int LA53_0 = input.LA(1);
							if ( (LA53_0==OBracket) ) {
								alt53=1;
							}
							switch (alt53) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2461);
									indexes316=indexes();
									state._fsp--;

									stream_indexes.add(indexes316.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: indexes, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 272:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:51: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2478);
							dotProperty317=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty317.getTree());
							// AST REWRITE
							// elements: Identifier, dotProperty
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 272:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:79: ^( DOTPROPERTY Identifier dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:6: String ( indexes )?
					{
					String318=(Token)match(input,String,FOLLOW_String_in_lookup2498);  
					stream_String.add(String318);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:13: ( indexes )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==OBracket) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2500);
							indexes319=indexes();
							state._fsp--;

							stream_indexes.add(indexes319.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: String, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 273:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:53: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:6: '(' expression ')' ( indexes )?
					{
					char_literal320=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2531);  
					stream_OParen.add(char_literal320);

					pushFollow(FOLLOW_expression_in_lookup2533);
					expression321=expression();
					state._fsp--;

					stream_expression.add(expression321.getTree());
					char_literal322=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2535);  
					stream_CParen.add(char_literal322);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:25: ( indexes )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==OBracket) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2537);
							indexes323=indexes();
							state._fsp--;

							stream_indexes.add(indexes323.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: expression, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 274:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:57: ( indexes )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal324=null;
		Token char_literal326=null;
		ParserRuleReturnScope expression325 =null;

		Object char_literal324_tree=null;
		Object char_literal326_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: ( '[' expression ']' )+
			int cnt58=0;
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==OBracket) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:7: '[' expression ']'
					{
					char_literal324=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2581);  
					stream_OBracket.add(char_literal324);

					pushFollow(FOLLOW_expression_in_indexes2583);
					expression325=expression();
					state._fsp--;

					stream_expression.add(expression325.getTree());
					char_literal326=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2585);  
					stream_CBracket.add(char_literal326);

					}
					break;

				default :
					if ( cnt58 >= 1 ) break loop58;
					EarlyExitException eee = new EarlyExitException(58, input);
					throw eee;
				}
				cnt58++;
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
			// 282:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:31: ^( INDEXES ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:285:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression327 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:6: ( dotExpression )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:6: ( dotExpression )+
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2616);
					dotExpression327=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression327.getTree());
					}
					break;

				default :
					if ( cnt59 >= 1 ) break loop59;
					EarlyExitException eee = new EarlyExitException(59, input);
					throw eee;
				}
				cnt59++;
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
			// 286:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:26: ^( DOT ( dotExpression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set328=null;

		Object set328_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:291:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set328=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set328));
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



	public static final BitSet FOLLOW_block_in_parse172 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block192 = new BitSet(new long[]{0xFFCC8400011C0122L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_functionDecl_in_block196 = new BitSet(new long[]{0xFFCC8400011C0122L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_Return_in_block201 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_block203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_block205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment311 = new BitSet(new long[]{0x0000000000000200L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_assignment313 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_assignment316 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_assignment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall352 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall354 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_functionCall356 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall377 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall379 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_functionCall381 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall403 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall405 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_functionCall407 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall430 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall432 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_functionCall434 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall456 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall458 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_functionCall460 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall484 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall486 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_functionCall488 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall512 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall514 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_functionCall516 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall580 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall582 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall607 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall609 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall611 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall634 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall636 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall638 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall661 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall663 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall665 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall686 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall688 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall690 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall711 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall713 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall715 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall737 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall739 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall741 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall775 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall777 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall779 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall800 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall802 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall804 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall831 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall833 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall835 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall854 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall856 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall858 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall878 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall880 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall882 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall902 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall904 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall906 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall926 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall928 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall930 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall948 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall950 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall952 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall970 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall972 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall974 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall994 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall996 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall998 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1018 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall1020 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1042 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall1044 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1064 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall1066 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1086 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_transformCall1088 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1110 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_transformCall1112 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1148 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1150 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1168 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1170 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1188 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1190 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1208 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1210 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1228 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1230 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1248 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1250 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1268 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1270 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1288 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1290 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1308 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1310 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1328 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_getCall1330 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1350 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_getCall1352 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1390 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_mathCall1392 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1415 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_mathCall1417 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1440 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_mathCall1442 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1465 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_mathCall1467 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1490 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_mathCall1492 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1516 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_mathCall1518 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1540 = new BitSet(new long[]{0xFFC4C400001CC920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_mathCall1542 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1580 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1582 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1585 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1617 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_ifStat1619 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1621 = new BitSet(new long[]{0xFFCC8400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_ifStat1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_If_in_elseIfStat1649 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1651 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1653 = new BitSet(new long[]{0xFFCC8400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_elseIfStat1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1679 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1681 = new BitSet(new long[]{0xFFCC8400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_elseStat1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1709 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
	public static final BitSet FOLLOW_idList_in_functionDecl1711 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1714 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1716 = new BitSet(new long[]{0xFFCC9400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_functionDecl1718 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1744 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_forStatement1746 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_forStatement1748 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1750 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_forStatement1752 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1754 = new BitSet(new long[]{0xFFCC9400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_forStatement1756 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1793 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1795 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1797 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1799 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1801 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_135_in_repeatStatement1804 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1806 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1810 = new BitSet(new long[]{0xFFCC9400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_repeatStatement1812 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1842 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_whileStatement1844 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1846 = new BitSet(new long[]{0xFFCC9400011C0120L,0x49CFC6C0633CC98BL,0x0000000000000058L});
	public static final BitSet FOLLOW_block_in_whileStatement1848 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1874 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_idList1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_idList1879 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_expression_in_exprList1904 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_exprList1907 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_exprList1909 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_condExpr_in_expression1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1949 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000200L});
	public static final BitSet FOLLOW_QMark_in_condExpr1964 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_condExpr1968 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_condExpr1970 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_condExpr1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1997 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_condExpr1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_orExpr2054 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_andExpr_in_orExpr2057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2073 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_133_in_andExpr2076 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_equExpr_in_andExpr2079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2095 = new BitSet(new long[]{0x0000200000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_set_in_equExpr2098 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_relExpr_in_equExpr2107 = new BitSet(new long[]{0x0000200000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2123 = new BitSet(new long[]{0x0030000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_set_in_relExpr2126 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_addExpr_in_relExpr2143 = new BitSet(new long[]{0x0030000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2159 = new BitSet(new long[]{0x0000000000000042L,0x1000000000000000L});
	public static final BitSet FOLLOW_set_in_addExpr2162 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2171 = new BitSet(new long[]{0x0000000000000042L,0x1000000000000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2187 = new BitSet(new long[]{0x0000000004000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_set_in_mulExpr2190 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2203 = new BitSet(new long[]{0x0000000004000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2219 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr2222 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2225 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr2243 = new BitSet(new long[]{0xFFC48400001C4920L,0x4DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_atom_in_unaryExpr2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr2260 = new BitSet(new long[]{0xFFC48400001C4920L,0x4DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_atom_in_unaryExpr2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2350 = new BitSet(new long[]{0xFFC4C400001C6920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_exprList_in_list2352 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_list2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2378 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2423 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2458 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2498 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2531 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_lookup2533 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_lookup2535 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2581 = new BitSet(new long[]{0xFFC4C400001C4920L,0x5DCCC6EDE33CC88FL,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_indexes2583 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2585 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2616 = new BitSet(new long[]{0x000000FFE0000002L});
}
