// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-03-06 19:32:52

  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PogoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", 
		"Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Def", "Digit", "Divide", "Do", "Dot", "EXP", "EXP_LIST", "Ellipse", "Else", 
		"End", "Equals", "Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", 
		"GT", "GTEquals", "Group", "HEIGHT_CONSTANT", "Height", "Hide", "ID_LIST", 
		"IF", "INDEXES", "Identifier", "If", "In", "Int", "LAdd", "LIST", "LOOKUP", 
		"LRemove", "LShape", "LT", "LTEquals", "Line", "Modulus", "Move", "Multiply", 
		"NEGATE", "NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", 
		"OBracket", "OParen", "Or", "Origin", "PI_CONSTANT", "Point", "Polygon", 
		"Pow", "Print", "Println", "QMark", "Quad", "RETURN", "Rect", "Repeat", 
		"Return", "Rotate", "Rotation", "SPECIAL", "STATEMENTS", "Scale", "Sine", 
		"Size", "Space", "Start", "String", "Stroke", "Subtract", "TERNARY", "To", 
		"Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", "While", "Width", 
		"X", "Y", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int COLOR_CONSTANT=13;
	public static final int CParen=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Copy=17;
	public static final int Cosine=18;
	public static final int Curve=19;
	public static final int DOT=20;
	public static final int DOTLOOKUP=21;
	public static final int DOTPROPERTY=22;
	public static final int Def=23;
	public static final int Digit=24;
	public static final int Divide=25;
	public static final int Do=26;
	public static final int Dot=27;
	public static final int EXP=28;
	public static final int EXP_LIST=29;
	public static final int Ellipse=30;
	public static final int Else=31;
	public static final int End=32;
	public static final int Equals=33;
	public static final int Excl=34;
	public static final int Expand=35;
	public static final int FUNCTION=36;
	public static final int FUNC_CALL=37;
	public static final int Fill=38;
	public static final int For=39;
	public static final int GT=40;
	public static final int GTEquals=41;
	public static final int Group=42;
	public static final int HEIGHT_CONSTANT=43;
	public static final int Height=44;
	public static final int Hide=45;
	public static final int ID_LIST=46;
	public static final int IF=47;
	public static final int INDEXES=48;
	public static final int Identifier=49;
	public static final int If=50;
	public static final int In=51;
	public static final int Int=52;
	public static final int LAdd=53;
	public static final int LIST=54;
	public static final int LOOKUP=55;
	public static final int LRemove=56;
	public static final int LShape=57;
	public static final int LT=58;
	public static final int LTEquals=59;
	public static final int Line=60;
	public static final int Modulus=61;
	public static final int Move=62;
	public static final int Multiply=63;
	public static final int NEGATE=64;
	public static final int NEquals=65;
	public static final int NoFill=66;
	public static final int NoStroke=67;
	public static final int Null=68;
	public static final int Number=69;
	public static final int OBrace=70;
	public static final int OBracket=71;
	public static final int OParen=72;
	public static final int Or=73;
	public static final int Origin=74;
	public static final int PI_CONSTANT=75;
	public static final int Point=76;
	public static final int Polygon=77;
	public static final int Pow=78;
	public static final int Print=79;
	public static final int Println=80;
	public static final int QMark=81;
	public static final int Quad=82;
	public static final int RETURN=83;
	public static final int Rect=84;
	public static final int Repeat=85;
	public static final int Return=86;
	public static final int Rotate=87;
	public static final int Rotation=88;
	public static final int SPECIAL=89;
	public static final int STATEMENTS=90;
	public static final int Scale=91;
	public static final int Sine=92;
	public static final int Size=93;
	public static final int Space=94;
	public static final int Start=95;
	public static final int String=96;
	public static final int Stroke=97;
	public static final int Subtract=98;
	public static final int TERNARY=99;
	public static final int To=100;
	public static final int Triangle=101;
	public static final int UNARY_MIN=102;
	public static final int WIDTH_CONSTANT=103;
	public static final int Weight=104;
	public static final int While=105;
	public static final int Width=106;
	public static final int X=107;
	public static final int Y=108;

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:65:1: parse : block EOF -> block ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:3: ( block EOF -> block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse167);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse169);  
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
			// 66:16: -> block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:69:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||LA1_0==Group||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||LA1_0==Line||LA1_0==Move||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||LA1_0==Polygon||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Rect && LA1_0 <= Repeat)||LA1_0==Rotate||(LA1_0 >= Sine && LA1_0 <= Size)||LA1_0==Stroke||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==110) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:6: statement
					{
					pushFollow(FOLLOW_statement_in_block187);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block191);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block196);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block198);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,110,FOLLOW_110_in_block200);  
					stream_110.add(char_literal7);

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
			// 71:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:51: ( expression )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:74:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
			case 110:
				{
				alt3=1;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Move:
			case NoFill:
			case NoStroke:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case Stroke:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement242);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,110,FOLLOW_110_in_statement244);  
					stream_110.add(char_literal9);

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
					// 75:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement257);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,110,FOLLOW_110_in_statement259);  
					stream_110.add(char_literal11);

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
					// 76:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement271);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement278);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:79:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement285);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement292);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:83:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			else if ( (LA5_0==110) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:6: Identifier ( indexes )? '=' expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment306);  
					stream_Identifier.add(Identifier16);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment308);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment311);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment313);
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
					// 84:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:69: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:3: 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
			int alt10=10;
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
			case Move:
			case NoFill:
			case NoStroke:
			case Rotate:
			case Stroke:
			case Weight:
				{
				alt10=9;
				}
				break;
			case Cosine:
			case Sine:
				{
				alt10=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall347);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall349);  
					stream_OParen.add(char_literal21);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= Group && LA6_0 <= HEIGHT_CONSTANT)||LA6_0==Hide||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||LA6_0==Line||LA6_0==Move||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||LA6_0==PI_CONSTANT||LA6_0==Polygon||(LA6_0 >= Print && LA6_0 <= Println)||LA6_0==Rect||LA6_0==Rotate||(LA6_0 >= Sine && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||(LA6_0 >= WIDTH_CONSTANT && LA6_0 <= Weight)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall351);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall354);  
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
					// 89:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:61: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall372);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall374);  
					stream_OParen.add(char_literal25);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= Group && LA7_0 <= HEIGHT_CONSTANT)||LA7_0==Hide||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||LA7_0==Line||LA7_0==Move||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||LA7_0==PI_CONSTANT||LA7_0==Polygon||(LA7_0 >= Print && LA7_0 <= Println)||LA7_0==Rect||LA7_0==Rotate||(LA7_0 >= Sine && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||(LA7_0 >= WIDTH_CONSTANT && LA7_0 <= Weight)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall376);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall379);  
					stream_CParen.add(char_literal27);

					// AST REWRITE
					// elements: Println, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:58: ( expression )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall398);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall400);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall402);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall404);  
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
					// 91:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:38: ^( FUNC_CALL Print expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:92:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall425);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall427);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall429);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall431);  
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
					// 92:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:92:38: ^( FUNC_CALL Assert expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall451);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall453);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall455);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall457);  
					stream_CParen.add(char_literal39);

					// AST REWRITE
					// elements: expression, Size
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:38: ^( FUNC_CALL Size expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:6: LAdd '(' ( exprList )? ')'
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall479);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall481);  
					stream_OParen.add(char_literal41);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:15: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= Group && LA8_0 <= HEIGHT_CONSTANT)||LA8_0==Hide||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||LA8_0==Line||LA8_0==Move||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||LA8_0==PI_CONSTANT||LA8_0==Polygon||(LA8_0 >= Print && LA8_0 <= Println)||LA8_0==Rect||LA8_0==Rotate||(LA8_0 >= Sine && LA8_0 <= Size)||(LA8_0 >= String && LA8_0 <= Subtract)||(LA8_0 >= WIDTH_CONSTANT && LA8_0 <= Weight)) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall483);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall486);  
					stream_CParen.add(char_literal43);

					// AST REWRITE
					// elements: LAdd, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:34: ^( FUNC_CALL LAdd ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:6: LRemove '(' ( exprList )? ')'
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall507);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall509);  
					stream_OParen.add(char_literal45);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:18: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= Group && LA9_0 <= HEIGHT_CONSTANT)||LA9_0==Hide||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||LA9_0==Line||LA9_0==Move||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||LA9_0==PI_CONSTANT||LA9_0==Polygon||(LA9_0 >= Print && LA9_0 <= Println)||LA9_0==Rect||LA9_0==Rotate||(LA9_0 >= Sine && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||(LA9_0 >= WIDTH_CONSTANT && LA9_0 <= Weight)) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall511);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall514);  
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
					// 95:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:37: ^( FUNC_CALL LRemove ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:57: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall535);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall542);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall549);
					mathCall50=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall50.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token Line55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token Rect59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token Curve63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token Polygon67=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token LShape71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		ParserRuleReturnScope exprList53 =null;
		ParserRuleReturnScope exprList57 =null;
		ParserRuleReturnScope exprList61 =null;
		ParserRuleReturnScope exprList65 =null;
		ParserRuleReturnScope exprList69 =null;
		ParserRuleReturnScope exprList73 =null;

		Object Ellipse51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object Line55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object Rect59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object Curve63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object Polygon67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object LShape71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_LShape=new RewriteRuleTokenStream(adaptor,"token LShape");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) )
			int alt17=6;
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt17=1;
				}
				break;
			case Line:
				{
				alt17=2;
				}
				break;
			case Rect:
				{
				alt17=3;
				}
				break;
			case Curve:
				{
				alt17=4;
				}
				break;
			case Polygon:
				{
				alt17=5;
				}
				break;
			case LShape:
				{
				alt17=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse51=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall569);  
					stream_Ellipse.add(Ellipse51);

					char_literal52=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall571);  
					stream_OParen.add(char_literal52);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:17: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= Group && LA11_0 <= HEIGHT_CONSTANT)||LA11_0==Hide||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||LA11_0==Line||LA11_0==Move||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||LA11_0==PI_CONSTANT||LA11_0==Polygon||(LA11_0 >= Print && LA11_0 <= Println)||LA11_0==Rect||LA11_0==Rotate||(LA11_0 >= Sine && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||(LA11_0 >= WIDTH_CONSTANT && LA11_0 <= Weight)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall573);
							exprList53=exprList();
							state._fsp--;

							stream_exprList.add(exprList53.getTree());
							}
							break;

					}

					char_literal54=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall576);  
					stream_CParen.add(char_literal54);

					// AST REWRITE
					// elements: exprList, Ellipse
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:56: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:5: Line '(' ( exprList )? ')'
					{
					Line55=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall596);  
					stream_Line.add(Line55);

					char_literal56=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall598);  
					stream_OParen.add(char_literal56);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:14: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= Group && LA12_0 <= HEIGHT_CONSTANT)||LA12_0==Hide||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||LA12_0==Line||LA12_0==Move||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||LA12_0==PI_CONSTANT||LA12_0==Polygon||(LA12_0 >= Print && LA12_0 <= Println)||LA12_0==Rect||LA12_0==Rotate||(LA12_0 >= Sine && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||(LA12_0 >= WIDTH_CONSTANT && LA12_0 <= Weight)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall600);
							exprList57=exprList();
							state._fsp--;

							stream_exprList.add(exprList57.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall603);  
					stream_CParen.add(char_literal58);

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
					// 104:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:5: Rect '(' ( exprList )? ')'
					{
					Rect59=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall623);  
					stream_Rect.add(Rect59);

					char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall625);  
					stream_OParen.add(char_literal60);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= Group && LA13_0 <= HEIGHT_CONSTANT)||LA13_0==Hide||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||LA13_0==Line||LA13_0==Move||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||LA13_0==PI_CONSTANT||LA13_0==Polygon||(LA13_0 >= Print && LA13_0 <= Println)||LA13_0==Rect||LA13_0==Rotate||(LA13_0 >= Sine && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||(LA13_0 >= WIDTH_CONSTANT && LA13_0 <= Weight)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall627);
							exprList61=exprList();
							state._fsp--;

							stream_exprList.add(exprList61.getTree());
							}
							break;

					}

					char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall630);  
					stream_CParen.add(char_literal62);

					// AST REWRITE
					// elements: exprList, Rect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:5: Curve '(' ( exprList )? ')'
					{
					Curve63=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall650);  
					stream_Curve.add(Curve63);

					char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall652);  
					stream_OParen.add(char_literal64);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:15: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= Group && LA14_0 <= HEIGHT_CONSTANT)||LA14_0==Hide||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||LA14_0==Line||LA14_0==Move||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||LA14_0==PI_CONSTANT||LA14_0==Polygon||(LA14_0 >= Print && LA14_0 <= Println)||LA14_0==Rect||LA14_0==Rotate||(LA14_0 >= Sine && LA14_0 <= Size)||(LA14_0 >= String && LA14_0 <= Subtract)||(LA14_0 >= WIDTH_CONSTANT && LA14_0 <= Weight)) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall654);
							exprList65=exprList();
							state._fsp--;

							stream_exprList.add(exprList65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall657);  
					stream_CParen.add(char_literal66);

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
					// 106:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:5: Polygon '(' ( exprList )? ')'
					{
					Polygon67=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall675);  
					stream_Polygon.add(Polygon67);

					char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall677);  
					stream_OParen.add(char_literal68);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= Group && LA15_0 <= HEIGHT_CONSTANT)||LA15_0==Hide||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||LA15_0==Line||LA15_0==Move||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||LA15_0==PI_CONSTANT||LA15_0==Polygon||(LA15_0 >= Print && LA15_0 <= Println)||LA15_0==Rect||LA15_0==Rotate||(LA15_0 >= Sine && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||(LA15_0 >= WIDTH_CONSTANT && LA15_0 <= Weight)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall679);
							exprList69=exprList();
							state._fsp--;

							stream_exprList.add(exprList69.getTree());
							}
							break;

					}

					char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall682);  
					stream_CParen.add(char_literal70);

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
					// 107:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:5: LShape '(' ( exprList )? ')'
					{
					LShape71=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall700);  
					stream_LShape.add(LShape71);

					char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall702);  
					stream_OParen.add(char_literal72);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:16: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= Group && LA16_0 <= HEIGHT_CONSTANT)||LA16_0==Hide||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||LA16_0==Line||LA16_0==Move||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||LA16_0==PI_CONSTANT||LA16_0==Polygon||(LA16_0 >= Print && LA16_0 <= Println)||LA16_0==Rect||LA16_0==Rotate||(LA16_0 >= Sine && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||(LA16_0 >= WIDTH_CONSTANT && LA16_0 <= Weight)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall704);
							exprList73=exprList();
							state._fsp--;

							stream_exprList.add(exprList73.getTree());
							}
							break;

					}

					char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall707);  
					stream_CParen.add(char_literal74);

					// AST REWRITE
					// elements: LShape, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 108:30: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:34: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:53: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token Copy79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token Rotate83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token Fill87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		Token Stroke91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token NoFill95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token NoStroke99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token Weight103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token Hide107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		Token Group111=null;
		Token char_literal112=null;
		Token char_literal114=null;
		Token Expand115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope exprList77 =null;
		ParserRuleReturnScope expression81 =null;
		ParserRuleReturnScope exprList85 =null;
		ParserRuleReturnScope exprList89 =null;
		ParserRuleReturnScope exprList93 =null;
		ParserRuleReturnScope expression97 =null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope exprList105 =null;
		ParserRuleReturnScope expression109 =null;
		ParserRuleReturnScope exprList113 =null;
		ParserRuleReturnScope expression117 =null;

		Object Move75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object Copy79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object Rotate83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object Fill87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object Stroke91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object NoFill95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object NoStroke99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object Weight103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object Hide107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		Object Group111_tree=null;
		Object char_literal112_tree=null;
		Object char_literal114_tree=null;
		Object Expand115_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) )
			int alt24=11;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt24=1;
				}
				break;
			case Copy:
				{
				alt24=2;
				}
				break;
			case Rotate:
				{
				alt24=3;
				}
				break;
			case Fill:
				{
				alt24=4;
				}
				break;
			case Stroke:
				{
				alt24=5;
				}
				break;
			case NoFill:
				{
				alt24=6;
				}
				break;
			case NoStroke:
				{
				alt24=7;
				}
				break;
			case Weight:
				{
				alt24=8;
				}
				break;
			case Hide:
				{
				alt24=9;
				}
				break;
			case Group:
				{
				alt24=10;
				}
				break;
			case Expand:
				{
				alt24=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:6: Move '(' ( exprList )? ')'
					{
					Move75=(Token)match(input,Move,FOLLOW_Move_in_transformCall738);  
					stream_Move.add(Move75);

					char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall740);  
					stream_OParen.add(char_literal76);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:15: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==Assert||LA18_0==Bool||LA18_0==COLOR_CONSTANT||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Ellipse||(LA18_0 >= Excl && LA18_0 <= Expand)||LA18_0==Fill||(LA18_0 >= Group && LA18_0 <= HEIGHT_CONSTANT)||LA18_0==Hide||LA18_0==Identifier||LA18_0==LAdd||(LA18_0 >= LRemove && LA18_0 <= LShape)||LA18_0==Line||LA18_0==Move||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||LA18_0==PI_CONSTANT||LA18_0==Polygon||(LA18_0 >= Print && LA18_0 <= Println)||LA18_0==Rect||LA18_0==Rotate||(LA18_0 >= Sine && LA18_0 <= Size)||(LA18_0 >= String && LA18_0 <= Subtract)||(LA18_0 >= WIDTH_CONSTANT && LA18_0 <= Weight)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall742);
							exprList77=exprList();
							state._fsp--;

							stream_exprList.add(exprList77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall745);  
					stream_CParen.add(char_literal78);

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
					// 112:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:6: Copy '(' expression ')'
					{
					Copy79=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall764);  
					stream_Copy.add(Copy79);

					char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall766);  
					stream_OParen.add(char_literal80);

					pushFollow(FOLLOW_expression_in_transformCall768);
					expression81=expression();
					state._fsp--;

					stream_expression.add(expression81.getTree());
					char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall770);  
					stream_CParen.add(char_literal82);

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
					// 113:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:33: ^( FUNC_CALL Copy expression )
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
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:6: Rotate '(' ( exprList )? ')'
					{
					Rotate83=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall787);  
					stream_Rotate.add(Rotate83);

					char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall789);  
					stream_OParen.add(char_literal84);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= Group && LA19_0 <= HEIGHT_CONSTANT)||LA19_0==Hide||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||LA19_0==Line||LA19_0==Move||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||LA19_0==PI_CONSTANT||LA19_0==Polygon||(LA19_0 >= Print && LA19_0 <= Println)||LA19_0==Rect||LA19_0==Rotate||(LA19_0 >= Sine && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= Weight)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall791);
							exprList85=exprList();
							state._fsp--;

							stream_exprList.add(exprList85.getTree());
							}
							break;

					}

					char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall794);  
					stream_CParen.add(char_literal86);

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
					// 114:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:6: Fill '(' ( exprList )? ')'
					{
					Fill87=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall811);  
					stream_Fill.add(Fill87);

					char_literal88=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall813);  
					stream_OParen.add(char_literal88);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:15: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||LA20_0==Fill||(LA20_0 >= Group && LA20_0 <= HEIGHT_CONSTANT)||LA20_0==Hide||LA20_0==Identifier||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||LA20_0==Line||LA20_0==Move||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||LA20_0==PI_CONSTANT||LA20_0==Polygon||(LA20_0 >= Print && LA20_0 <= Println)||LA20_0==Rect||LA20_0==Rotate||(LA20_0 >= Sine && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||(LA20_0 >= WIDTH_CONSTANT && LA20_0 <= Weight)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall815);
							exprList89=exprList();
							state._fsp--;

							stream_exprList.add(exprList89.getTree());
							}
							break;

					}

					char_literal90=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall818);  
					stream_CParen.add(char_literal90);

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
					// 115:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:6: Stroke '(' ( exprList )? ')'
					{
					Stroke91=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall835);  
					stream_Stroke.add(Stroke91);

					char_literal92=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall837);  
					stream_OParen.add(char_literal92);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:17: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= Group && LA21_0 <= HEIGHT_CONSTANT)||LA21_0==Hide||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||LA21_0==Line||LA21_0==Move||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||LA21_0==PI_CONSTANT||LA21_0==Polygon||(LA21_0 >= Print && LA21_0 <= Println)||LA21_0==Rect||LA21_0==Rotate||(LA21_0 >= Sine && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||(LA21_0 >= WIDTH_CONSTANT && LA21_0 <= Weight)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall839);
							exprList93=exprList();
							state._fsp--;

							stream_exprList.add(exprList93.getTree());
							}
							break;

					}

					char_literal94=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall842);  
					stream_CParen.add(char_literal94);

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
					// 116:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:6: NoFill '(' expression ')'
					{
					NoFill95=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall859);  
					stream_NoFill.add(NoFill95);

					char_literal96=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall861);  
					stream_OParen.add(char_literal96);

					pushFollow(FOLLOW_expression_in_transformCall863);
					expression97=expression();
					state._fsp--;

					stream_expression.add(expression97.getTree());
					char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall865);  
					stream_CParen.add(char_literal98);

					// AST REWRITE
					// elements: NoFill, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:34: ^( FUNC_CALL NoFill expression )
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
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:6: NoStroke '(' expression ')'
					{
					NoStroke99=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall881);  
					stream_NoStroke.add(NoStroke99);

					char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall883);  
					stream_OParen.add(char_literal100);

					pushFollow(FOLLOW_expression_in_transformCall885);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());
					char_literal102=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall887);  
					stream_CParen.add(char_literal102);

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
					// 118:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:36: ^( FUNC_CALL NoStroke expression )
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
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:6: Weight '(' ( exprList )? ')'
					{
					Weight103=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall903);  
					stream_Weight.add(Weight103);

					char_literal104=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall905);  
					stream_OParen.add(char_literal104);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:17: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= Group && LA22_0 <= HEIGHT_CONSTANT)||LA22_0==Hide||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||LA22_0==Line||LA22_0==Move||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||LA22_0==PI_CONSTANT||LA22_0==Polygon||(LA22_0 >= Print && LA22_0 <= Println)||LA22_0==Rect||LA22_0==Rotate||(LA22_0 >= Sine && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||(LA22_0 >= WIDTH_CONSTANT && LA22_0 <= Weight)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall907);
							exprList105=exprList();
							state._fsp--;

							stream_exprList.add(exprList105.getTree());
							}
							break;

					}

					char_literal106=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall910);  
					stream_CParen.add(char_literal106);

					// AST REWRITE
					// elements: exprList, Weight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:6: Hide '(' expression ')'
					{
					Hide107=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall927);  
					stream_Hide.add(Hide107);

					char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall929);  
					stream_OParen.add(char_literal108);

					pushFollow(FOLLOW_expression_in_transformCall931);
					expression109=expression();
					state._fsp--;

					stream_expression.add(expression109.getTree());
					char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall933);  
					stream_CParen.add(char_literal110);

					// AST REWRITE
					// elements: Hide, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:32: ^( FUNC_CALL Hide expression )
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
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:6: Group '(' ( exprList )? ')'
					{
					Group111=(Token)match(input,Group,FOLLOW_Group_in_transformCall949);  
					stream_Group.add(Group111);

					char_literal112=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall951);  
					stream_OParen.add(char_literal112);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:16: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= Group && LA23_0 <= HEIGHT_CONSTANT)||LA23_0==Hide||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||LA23_0==Line||LA23_0==Move||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||LA23_0==PI_CONSTANT||LA23_0==Polygon||(LA23_0 >= Print && LA23_0 <= Println)||LA23_0==Rect||LA23_0==Rotate||(LA23_0 >= Sine && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||(LA23_0 >= WIDTH_CONSTANT && LA23_0 <= Weight)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall953);
							exprList113=exprList();
							state._fsp--;

							stream_exprList.add(exprList113.getTree());
							}
							break;

					}

					char_literal114=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall956);  
					stream_CParen.add(char_literal114);

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
					// 121:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:6: Expand '(' expression ')'
					{
					Expand115=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall973);  
					stream_Expand.add(Expand115);

					char_literal116=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall975);  
					stream_OParen.add(char_literal116);

					pushFollow(FOLLOW_expression_in_transformCall977);
					expression117=expression();
					state._fsp--;

					stream_expression.add(expression117.getTree());
					char_literal118=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall979);  
					stream_CParen.add(char_literal118);

					// AST REWRITE
					// elements: Expand, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:34: ^( FUNC_CALL Expand expression )
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


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token Sine123=null;
		Token char_literal124=null;
		Token char_literal126=null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope expression125 =null;

		Object Cosine119_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object Sine123_tree=null;
		Object char_literal124_tree=null;
		Object char_literal126_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Cosine) ) {
				alt25=1;
			}
			else if ( (LA25_0==Sine) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:6: Cosine '(' expression ')'
					{
					Cosine119=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1009);  
					stream_Cosine.add(Cosine119);

					char_literal120=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1011);  
					stream_OParen.add(char_literal120);

					pushFollow(FOLLOW_expression_in_mathCall1013);
					expression121=expression();
					state._fsp--;

					stream_expression.add(expression121.getTree());
					char_literal122=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1015);  
					stream_CParen.add(char_literal122);

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
					// 126:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: Sine '(' expression ')'
					{
					Sine123=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1034);  
					stream_Sine.add(Sine123);

					char_literal124=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1036);  
					stream_OParen.add(char_literal124);

					pushFollow(FOLLOW_expression_in_mathCall1038);
					expression125=expression();
					state._fsp--;

					stream_expression.add(expression125.getTree());
					char_literal126=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1040);  
					stream_CParen.add(char_literal126);

					// AST REWRITE
					// elements: expression, Sine
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:35: ^( FUNC_CALL Sine expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End130=null;
		ParserRuleReturnScope ifStat127 =null;
		ParserRuleReturnScope elseIfStat128 =null;
		ParserRuleReturnScope elseStat129 =null;

		Object End130_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1074);
			ifStat127=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat127.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:13: ( elseIfStat )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==Else) ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1==If) ) {
						alt26=1;
					}

				}

				switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1076);
					elseIfStat128=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat128.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:25: ( elseStat )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Else) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1079);
					elseStat129=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat129.getTree());
					}
					break;

			}

			End130=(Token)match(input,End,FOLLOW_End_in_ifStatement1082);  
			stream_End.add(End130);

			// AST REWRITE
			// elements: ifStat, elseIfStat, elseStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 133:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:66: ( elseStat )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If131=null;
		Token Do133=null;
		ParserRuleReturnScope expression132 =null;
		ParserRuleReturnScope block134 =null;

		Object If131_tree=null;
		Object Do133_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: If expression Do block
			{
			If131=(Token)match(input,If,FOLLOW_If_in_ifStat1111);  
			stream_If.add(If131);

			pushFollow(FOLLOW_expression_in_ifStat1113);
			expression132=expression();
			state._fsp--;

			stream_expression.add(expression132.getTree());
			Do133=(Token)match(input,Do,FOLLOW_Do_in_ifStat1115);  
			stream_Do.add(Do133);

			pushFollow(FOLLOW_block_in_ifStat1117);
			block134=block();
			state._fsp--;

			stream_block.add(block134.getTree());
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
			// 138:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:32: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else135=null;
		Token If136=null;
		Token Do138=null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope block139 =null;

		Object Else135_tree=null;
		Object If136_tree=null;
		Object Do138_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Else If expression Do block
			{
			Else135=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1141);  
			stream_Else.add(Else135);

			If136=(Token)match(input,If,FOLLOW_If_in_elseIfStat1143);  
			stream_If.add(If136);

			pushFollow(FOLLOW_expression_in_elseIfStat1145);
			expression137=expression();
			state._fsp--;

			stream_expression.add(expression137.getTree());
			Do138=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1147);  
			stream_Do.add(Do138);

			pushFollow(FOLLOW_block_in_elseIfStat1149);
			block139=block();
			state._fsp--;

			stream_block.add(block139.getTree());
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
			// 142:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:37: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else140=null;
		Token Do141=null;
		ParserRuleReturnScope block142 =null;

		Object Else140_tree=null;
		Object Do141_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:6: Else Do block
			{
			Else140=(Token)match(input,Else,FOLLOW_Else_in_elseStat1173);  
			stream_Else.add(Else140);

			Do141=(Token)match(input,Do,FOLLOW_Do_in_elseStat1175);  
			stream_Do.add(Do141);

			pushFollow(FOLLOW_block_in_elseStat1177);
			block142=block();
			state._fsp--;

			stream_block.add(block142.getTree());
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
			// 146:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:23: ^( EXP block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def143=null;
		Token Identifier144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		Token Do148=null;
		Token End150=null;
		ParserRuleReturnScope idList146 =null;
		ParserRuleReturnScope block149 =null;

		Object Def143_tree=null;
		Object Identifier144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
		Object Do148_tree=null;
		Object End150_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def143=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1199); 
			Def143_tree = (Object)adaptor.create(Def143);
			adaptor.addChild(root_0, Def143_tree);

			Identifier144=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1201); 
			Identifier144_tree = (Object)adaptor.create(Identifier144);
			adaptor.addChild(root_0, Identifier144_tree);

			char_literal145=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1203); 
			char_literal145_tree = (Object)adaptor.create(char_literal145);
			adaptor.addChild(root_0, char_literal145_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:25: ( idList )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Identifier) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1205);
					idList146=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList146.getTree());

					}
					break;

			}

			char_literal147=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1208); 
			char_literal147_tree = (Object)adaptor.create(char_literal147);
			adaptor.addChild(root_0, char_literal147_tree);

			Do148=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1210); 
			Do148_tree = (Object)adaptor.create(Do148);
			adaptor.addChild(root_0, Do148_tree);

			pushFollow(FOLLOW_block_in_functionDecl1212);
			block149=block();
			state._fsp--;

			adaptor.addChild(root_0, block149.getTree());

			End150=(Token)match(input,End,FOLLOW_End_in_functionDecl1214); 
			End150_tree = (Object)adaptor.create(End150);
			adaptor.addChild(root_0, End150_tree);

			defineFunction((Identifier144!=null?Identifier144.getText():null), (idList146!=null?((Object)idList146.getTree()):null), (block149!=null?((Object)block149.getTree()):null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For151=null;
		Token Identifier152=null;
		Token char_literal153=null;
		Token Do155=null;
		Token Do157=null;
		Token End159=null;
		ParserRuleReturnScope expression154 =null;
		ParserRuleReturnScope expression156 =null;
		ParserRuleReturnScope block158 =null;

		Object For151_tree=null;
		Object Identifier152_tree=null;
		Object char_literal153_tree=null;
		Object Do155_tree=null;
		Object Do157_tree=null;
		Object End159_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:6: For Identifier '=' expression Do expression Do block End
			{
			For151=(Token)match(input,For,FOLLOW_For_in_forStatement1236);  
			stream_For.add(For151);

			Identifier152=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1238);  
			stream_Identifier.add(Identifier152);

			char_literal153=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1240);  
			stream_Assign.add(char_literal153);

			pushFollow(FOLLOW_expression_in_forStatement1242);
			expression154=expression();
			state._fsp--;

			stream_expression.add(expression154.getTree());
			Do155=(Token)match(input,Do,FOLLOW_Do_in_forStatement1244);  
			stream_Do.add(Do155);

			pushFollow(FOLLOW_expression_in_forStatement1246);
			expression156=expression();
			state._fsp--;

			stream_expression.add(expression156.getTree());
			Do157=(Token)match(input,Do,FOLLOW_Do_in_forStatement1248);  
			stream_Do.add(Do157);

			pushFollow(FOLLOW_block_in_forStatement1250);
			block158=block();
			state._fsp--;

			stream_block.add(block158.getTree());
			End159=(Token)match(input,End,FOLLOW_End_in_forStatement1252);  
			stream_End.add(End159);

			// AST REWRITE
			// elements: expression, Identifier, For, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 156:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:9: ^( For Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat160=null;
		Token Identifier161=null;
		Token char_literal162=null;
		Token Do164=null;
		Token char_literal166=null;
		Token Do168=null;
		Token End170=null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expression165 =null;
		ParserRuleReturnScope expression167 =null;
		ParserRuleReturnScope block169 =null;

		Object Repeat160_tree=null;
		Object Identifier161_tree=null;
		Object char_literal162_tree=null;
		Object Do164_tree=null;
		Object char_literal166_tree=null;
		Object Do168_tree=null;
		Object End170_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat160=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1285);  
			stream_Repeat.add(Repeat160);

			Identifier161=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1287);  
			stream_Identifier.add(Identifier161);

			char_literal162=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1289);  
			stream_Assign.add(char_literal162);

			pushFollow(FOLLOW_expression_in_repeatStatement1291);
			expression163=expression();
			state._fsp--;

			stream_expression.add(expression163.getTree());
			Do164=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1293);  
			stream_Do.add(Do164);

			pushFollow(FOLLOW_expression_in_repeatStatement1295);
			expression165=expression();
			state._fsp--;

			stream_expression.add(expression165.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:52: ( '|' expression )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==111) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:53: '|' expression
					{
					char_literal166=(Token)match(input,111,FOLLOW_111_in_repeatStatement1298);  
					stream_111.add(char_literal166);

					pushFollow(FOLLOW_expression_in_repeatStatement1300);
					expression167=expression();
					state._fsp--;

					stream_expression.add(expression167.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			Do168=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1304);  
			stream_Do.add(Do168);

			pushFollow(FOLLOW_block_in_repeatStatement1306);
			block169=block();
			state._fsp--;

			stream_block.add(block169.getTree());
			End170=(Token)match(input,End,FOLLOW_End_in_repeatStatement1308);  
			stream_End.add(End170);

			// AST REWRITE
			// elements: Identifier, Repeat, block, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 160:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:86: ^( Repeat Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While171=null;
		Token Do173=null;
		Token End175=null;
		ParserRuleReturnScope expression172 =null;
		ParserRuleReturnScope block174 =null;

		Object While171_tree=null;
		Object Do173_tree=null;
		Object End175_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:6: While expression Do block End
			{
			While171=(Token)match(input,While,FOLLOW_While_in_whileStatement1336);  
			stream_While.add(While171);

			pushFollow(FOLLOW_expression_in_whileStatement1338);
			expression172=expression();
			state._fsp--;

			stream_expression.add(expression172.getTree());
			Do173=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1340);  
			stream_Do.add(Do173);

			pushFollow(FOLLOW_block_in_whileStatement1342);
			block174=block();
			state._fsp--;

			stream_block.add(block174.getTree());
			End175=(Token)match(input,End,FOLLOW_End_in_whileStatement1344);  
			stream_End.add(End175);

			// AST REWRITE
			// elements: block, expression, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 164:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:39: ^( While expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier176=null;
		Token char_literal177=null;
		Token Identifier178=null;

		Object Identifier176_tree=null;
		Object char_literal177_tree=null;
		Object Identifier178_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:6: Identifier ( ',' Identifier )*
			{
			Identifier176=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1368);  
			stream_Identifier.add(Identifier176);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:17: ( ',' Identifier )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Comma) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:18: ',' Identifier
					{
					char_literal177=(Token)match(input,Comma,FOLLOW_Comma_in_idList1371);  
					stream_Comma.add(char_literal177);

					Identifier178=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1373);  
					stream_Identifier.add(Identifier178);

					}
					break;

				default :
					break loop30;
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
			// 168:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal180=null;
		ParserRuleReturnScope expression179 =null;
		ParserRuleReturnScope expression181 =null;

		Object char_literal180_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1398);
			expression179=expression();
			state._fsp--;

			stream_expression.add(expression179.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:17: ( ',' expression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==Comma) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:18: ',' expression
					{
					char_literal180=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1401);  
					stream_Comma.add(char_literal180);

					pushFollow(FOLLOW_expression_in_exprList1403);
					expression181=expression();
					state._fsp--;

					stream_expression.add(expression181.getTree());
					}
					break;

				default :
					break loop31;
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
			// 172:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr182 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression1428);
			condExpr182=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr182.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal184=null;
		Token char_literal185=null;
		Token In186=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr183 =null;
		ParserRuleReturnScope expression187 =null;

		Object char_literal184_tree=null;
		Object char_literal185_tree=null;
		Object In186_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1443);
			orExpr183=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr183.getTree());
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
			// 180:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==QMark) ) {
				alt32=1;
			}
			else if ( (LA32_0==In) ) {
				alt32=2;
			}
			switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:8: '?' a= expression ':' b= expression
					{
					char_literal184=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1458);  
					stream_QMark.add(char_literal184);

					pushFollow(FOLLOW_expression_in_condExpr1462);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal185=(Token)match(input,Do,FOLLOW_Do_in_condExpr1464);  
					stream_Do.add(char_literal185);

					pushFollow(FOLLOW_expression_in_condExpr1468);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, orExpr, a
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
					// 181:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:45: ^( TERNARY orExpr $a $b)
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:8: In expression
					{
					In186=(Token)match(input,In,FOLLOW_In_in_condExpr1491);  
					stream_In.add(In186);

					pushFollow(FOLLOW_expression_in_condExpr1493);
					expression187=expression();
					state._fsp--;

					stream_expression.add(expression187.getTree());
					// AST REWRITE
					// elements: orExpr, expression, In
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:45: ^( In orExpr expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal189=null;
		ParserRuleReturnScope andExpr188 =null;
		ParserRuleReturnScope andExpr190 =null;

		Object string_literal189_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1545);
			andExpr188=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr188.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:14: ( '||' ^ andExpr )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==112) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:15: '||' ^ andExpr
					{
					string_literal189=(Token)match(input,112,FOLLOW_112_in_orExpr1548); 
					string_literal189_tree = (Object)adaptor.create(string_literal189);
					root_0 = (Object)adaptor.becomeRoot(string_literal189_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1551);
					andExpr190=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr190.getTree());

					}
					break;

				default :
					break loop33;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal192=null;
		ParserRuleReturnScope equExpr191 =null;
		ParserRuleReturnScope equExpr193 =null;

		Object string_literal192_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1567);
			equExpr191=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr191.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:14: ( '&&' ^ equExpr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==109) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:15: '&&' ^ equExpr
					{
					string_literal192=(Token)match(input,109,FOLLOW_109_in_andExpr1570); 
					string_literal192_tree = (Object)adaptor.create(string_literal192);
					root_0 = (Object)adaptor.becomeRoot(string_literal192_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1573);
					equExpr193=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr193.getTree());

					}
					break;

				default :
					break loop34;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set195=null;
		ParserRuleReturnScope relExpr194 =null;
		ParserRuleReturnScope relExpr196 =null;

		Object set195_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1589);
			relExpr194=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr194.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Equals||LA35_0==NEquals) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:15: ( '==' | '!=' ) ^ relExpr
					{
					set195=input.LT(1);
					set195=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set195), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1601);
					relExpr196=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr196.getTree());

					}
					break;

				default :
					break loop35;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set198=null;
		ParserRuleReturnScope addExpr197 =null;
		ParserRuleReturnScope addExpr199 =null;

		Object set198_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1617);
			addExpr197=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr197.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= GT && LA36_0 <= GTEquals)||(LA36_0 >= LT && LA36_0 <= LTEquals)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set198=input.LT(1);
					set198=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set198), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1637);
					addExpr199=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr199.getTree());

					}
					break;

				default :
					break loop36;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set201=null;
		ParserRuleReturnScope mulExpr200 =null;
		ParserRuleReturnScope mulExpr202 =null;

		Object set201_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1653);
			mulExpr200=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr200.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==Add||LA37_0==Subtract) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:15: ( '+' | '-' ) ^ mulExpr
					{
					set201=input.LT(1);
					set201=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set201), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1665);
					mulExpr202=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr202.getTree());

					}
					break;

				default :
					break loop37;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set204=null;
		ParserRuleReturnScope powExpr203 =null;
		ParserRuleReturnScope powExpr205 =null;

		Object set204_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1681);
			powExpr203=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr203.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Divide||LA38_0==Modulus||LA38_0==Multiply) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set204=input.LT(1);
					set204=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set204), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1697);
					powExpr205=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr205.getTree());

					}
					break;

				default :
					break loop38;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal207=null;
		ParserRuleReturnScope unaryExpr206 =null;
		ParserRuleReturnScope unaryExpr208 =null;

		Object char_literal207_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1713);
			unaryExpr206=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr206.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:16: ( '^' ^ unaryExpr )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Pow) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:17: '^' ^ unaryExpr
					{
					char_literal207=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1716); 
					char_literal207_tree = (Object)adaptor.create(char_literal207);
					root_0 = (Object)adaptor.becomeRoot(char_literal207_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1719);
					unaryExpr208=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr208.getTree());

					}
					break;

				default :
					break loop39;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal209=null;
		Token char_literal211=null;
		ParserRuleReturnScope atom210 =null;
		ParserRuleReturnScope atom212 =null;
		ParserRuleReturnScope atom213 =null;

		Object char_literal209_tree=null;
		Object char_literal211_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt40=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt40=1;
				}
				break;
			case Excl:
				{
				alt40=2;
				}
				break;
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case HEIGHT_CONSTANT:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Move:
			case NoFill:
			case NoStroke:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case PI_CONSTANT:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case WIDTH_CONSTANT:
			case Weight:
				{
				alt40=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:6: '-' atom
					{
					char_literal209=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1737);  
					stream_Subtract.add(char_literal209);

					pushFollow(FOLLOW_atom_in_unaryExpr1739);
					atom210=atom();
					state._fsp--;

					stream_atom.add(atom210.getTree());
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
					// 215:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:18: ^( UNARY_MIN atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: '!' atom
					{
					char_literal211=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1754);  
					stream_Excl.add(char_literal211);

					pushFollow(FOLLOW_atom_in_unaryExpr1756);
					atom212=atom();
					state._fsp--;

					stream_atom.add(atom212.getTree());
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
					// 216:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:18: ^( NEGATE atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1771);
					atom213=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom213.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number214=null;
		Token Bool215=null;
		Token Null216=null;
		Token COLOR_CONSTANT218=null;
		Token PI_CONSTANT219=null;
		Token WIDTH_CONSTANT220=null;
		Token HEIGHT_CONSTANT221=null;
		ParserRuleReturnScope lookup217 =null;

		Object Number214_tree=null;
		Object Bool215_tree=null;
		Object Null216_tree=null;
		Object COLOR_CONSTANT218_tree=null;
		Object PI_CONSTANT219_tree=null;
		Object WIDTH_CONSTANT220_tree=null;
		Object HEIGHT_CONSTANT221_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt41=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt41=1;
				}
				break;
			case Bool:
				{
				alt41=2;
				}
				break;
			case Null:
				{
				alt41=3;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Move:
			case NoFill:
			case NoStroke:
			case OBracket:
			case OParen:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Weight:
				{
				alt41=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt41=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt41=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt41=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt41=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number214=(Token)match(input,Number,FOLLOW_Number_in_atom1785); 
					Number214_tree = (Object)adaptor.create(Number214);
					adaptor.addChild(root_0, Number214_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool215=(Token)match(input,Bool,FOLLOW_Bool_in_atom1792); 
					Bool215_tree = (Object)adaptor.create(Bool215);
					adaptor.addChild(root_0, Bool215_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null216=(Token)match(input,Null,FOLLOW_Null_in_atom1799); 
					Null216_tree = (Object)adaptor.create(Null216);
					adaptor.addChild(root_0, Null216_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1806);
					lookup217=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup217.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT218=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom1812); 
					COLOR_CONSTANT218_tree = (Object)adaptor.create(COLOR_CONSTANT218);
					adaptor.addChild(root_0, COLOR_CONSTANT218_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:226:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT219=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom1818); 
					PI_CONSTANT219_tree = (Object)adaptor.create(PI_CONSTANT219);
					adaptor.addChild(root_0, PI_CONSTANT219_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT220=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom1824); 
					WIDTH_CONSTANT220_tree = (Object)adaptor.create(WIDTH_CONSTANT220);
					adaptor.addChild(root_0, WIDTH_CONSTANT220_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT221=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom1830); 
					HEIGHT_CONSTANT221_tree = (Object)adaptor.create(HEIGHT_CONSTANT221);
					adaptor.addChild(root_0, HEIGHT_CONSTANT221_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal222=null;
		Token char_literal224=null;
		ParserRuleReturnScope exprList223 =null;

		Object char_literal222_tree=null;
		Object char_literal224_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:6: '[' ( exprList )? ']'
			{
			char_literal222=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1844);  
			stream_OBracket.add(char_literal222);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:10: ( exprList )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Assert||LA42_0==Bool||LA42_0==COLOR_CONSTANT||(LA42_0 >= Copy && LA42_0 <= Curve)||LA42_0==Ellipse||(LA42_0 >= Excl && LA42_0 <= Expand)||LA42_0==Fill||(LA42_0 >= Group && LA42_0 <= HEIGHT_CONSTANT)||LA42_0==Hide||LA42_0==Identifier||LA42_0==LAdd||(LA42_0 >= LRemove && LA42_0 <= LShape)||LA42_0==Line||LA42_0==Move||(LA42_0 >= NoFill && LA42_0 <= Number)||(LA42_0 >= OBracket && LA42_0 <= OParen)||LA42_0==PI_CONSTANT||LA42_0==Polygon||(LA42_0 >= Print && LA42_0 <= Println)||LA42_0==Rect||LA42_0==Rotate||(LA42_0 >= Sine && LA42_0 <= Size)||(LA42_0 >= String && LA42_0 <= Subtract)||(LA42_0 >= WIDTH_CONSTANT && LA42_0 <= Weight)) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1846);
					exprList223=exprList();
					state._fsp--;

					stream_exprList.add(exprList223.getTree());
					}
					break;

			}

			char_literal224=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1849);  
			stream_CBracket.add(char_literal224);

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
			// 232:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:34: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotLookup -> ^( DOTPROPERTY functionCall dotLookup ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotLookup -> ^( DOTPROPERTY Identifier dotLookup ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier230=null;
		Token String233=null;
		Token char_literal235=null;
		Token char_literal237=null;
		ParserRuleReturnScope functionCall225 =null;
		ParserRuleReturnScope indexes226 =null;
		ParserRuleReturnScope dotLookup227 =null;
		ParserRuleReturnScope list228 =null;
		ParserRuleReturnScope indexes229 =null;
		ParserRuleReturnScope indexes231 =null;
		ParserRuleReturnScope dotLookup232 =null;
		ParserRuleReturnScope indexes234 =null;
		ParserRuleReturnScope expression236 =null;
		ParserRuleReturnScope indexes238 =null;

		Object Identifier230_tree=null;
		Object String233_tree=null;
		Object char_literal235_tree=null;
		Object char_literal237_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_dotLookup=new RewriteRuleSubtreeStream(adaptor,"rule dotLookup");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotLookup -> ^( DOTPROPERTY functionCall dotLookup ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotLookup -> ^( DOTPROPERTY Identifier dotLookup ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt50=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA50_1 = input.LA(2);
				if ( (LA50_1==OParen) ) {
					alt50=1;
				}
				else if ( (LA50_1==Add||LA50_1==CBracket||(LA50_1 >= CParen && LA50_1 <= Comma)||(LA50_1 >= Divide && LA50_1 <= Do)||LA50_1==Equals||(LA50_1 >= GT && LA50_1 <= GTEquals)||LA50_1==In||(LA50_1 >= LT && LA50_1 <= LTEquals)||LA50_1==Modulus||LA50_1==Multiply||LA50_1==NEquals||LA50_1==OBracket||LA50_1==Pow||LA50_1==QMark||LA50_1==Subtract||(LA50_1 >= 109 && LA50_1 <= 112)) ) {
					alt50=3;
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
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Move:
			case NoFill:
			case NoStroke:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case Stroke:
			case Weight:
				{
				alt50=1;
				}
				break;
			case OBracket:
				{
				alt50=2;
				}
				break;
			case String:
				{
				alt50=4;
				}
				break;
			case OParen:
				{
				alt50=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotLookup -> ^( DOTPROPERTY functionCall dotLookup ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup1872);
					functionCall225=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall225.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotLookup -> ^( DOTPROPERTY functionCall dotLookup ) )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==OBracket) ) {
						int LA44_1 = input.LA(2);
						if ( (LA44_1==Assert||LA44_1==Bool||LA44_1==COLOR_CONSTANT||(LA44_1 >= Copy && LA44_1 <= Curve)||LA44_1==Ellipse||(LA44_1 >= Excl && LA44_1 <= Expand)||LA44_1==Fill||(LA44_1 >= Group && LA44_1 <= HEIGHT_CONSTANT)||LA44_1==Hide||LA44_1==Identifier||LA44_1==LAdd||(LA44_1 >= LRemove && LA44_1 <= LShape)||LA44_1==Line||LA44_1==Move||(LA44_1 >= NoFill && LA44_1 <= Number)||(LA44_1 >= OBracket && LA44_1 <= OParen)||LA44_1==PI_CONSTANT||LA44_1==Polygon||(LA44_1 >= Print && LA44_1 <= Println)||LA44_1==Rect||LA44_1==Rotate||(LA44_1 >= Sine && LA44_1 <= Size)||(LA44_1 >= String && LA44_1 <= Subtract)||(LA44_1 >= WIDTH_CONSTANT && LA44_1 <= Weight)) ) {
							alt44=1;
						}
						else if ( (LA44_1==Dot) ) {
							alt44=2;
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
					else if ( (LA44_0==Add||LA44_0==CBracket||(LA44_0 >= CParen && LA44_0 <= Comma)||(LA44_0 >= Divide && LA44_0 <= Do)||LA44_0==Equals||(LA44_0 >= GT && LA44_0 <= GTEquals)||LA44_0==In||(LA44_0 >= LT && LA44_0 <= LTEquals)||LA44_0==Modulus||LA44_0==Multiply||LA44_0==NEquals||LA44_0==Pow||LA44_0==QMark||LA44_0==Subtract||(LA44_0 >= 109 && LA44_0 <= 112)) ) {
						alt44=1;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:20: ( indexes )?
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==OBracket) ) {
								alt43=1;
							}
							switch (alt43) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup1875);
									indexes226=indexes();
									state._fsp--;

									stream_indexes.add(indexes226.getTree());
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
							// 236:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:55: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:67: dotLookup
							{
							pushFollow(FOLLOW_dotLookup_in_lookup1892);
							dotLookup227=dotLookup();
							state._fsp--;

							stream_dotLookup.add(dotLookup227.getTree());
							// AST REWRITE
							// elements: functionCall, dotLookup
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 236:78: -> ^( DOTPROPERTY functionCall dotLookup )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:81: ^( DOTPROPERTY functionCall dotLookup )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_1, stream_dotLookup.nextTree());
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1917);
					list228=list();
					state._fsp--;

					stream_list.add(list228.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:11: ( indexes )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==OBracket) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1919);
							indexes229=indexes();
							state._fsp--;

							stream_indexes.add(indexes229.getTree());
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
					// 237:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:51: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotLookup -> ^( DOTPROPERTY Identifier dotLookup ) )
					{
					Identifier230=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1952);  
					stream_Identifier.add(Identifier230);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotLookup -> ^( DOTPROPERTY Identifier dotLookup ) )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==OBracket) ) {
						int LA47_1 = input.LA(2);
						if ( (LA47_1==Assert||LA47_1==Bool||LA47_1==COLOR_CONSTANT||(LA47_1 >= Copy && LA47_1 <= Curve)||LA47_1==Ellipse||(LA47_1 >= Excl && LA47_1 <= Expand)||LA47_1==Fill||(LA47_1 >= Group && LA47_1 <= HEIGHT_CONSTANT)||LA47_1==Hide||LA47_1==Identifier||LA47_1==LAdd||(LA47_1 >= LRemove && LA47_1 <= LShape)||LA47_1==Line||LA47_1==Move||(LA47_1 >= NoFill && LA47_1 <= Number)||(LA47_1 >= OBracket && LA47_1 <= OParen)||LA47_1==PI_CONSTANT||LA47_1==Polygon||(LA47_1 >= Print && LA47_1 <= Println)||LA47_1==Rect||LA47_1==Rotate||(LA47_1 >= Sine && LA47_1 <= Size)||(LA47_1 >= String && LA47_1 <= Subtract)||(LA47_1 >= WIDTH_CONSTANT && LA47_1 <= Weight)) ) {
							alt47=1;
						}
						else if ( (LA47_1==Dot) ) {
							alt47=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 47, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA47_0==Add||LA47_0==CBracket||(LA47_0 >= CParen && LA47_0 <= Comma)||(LA47_0 >= Divide && LA47_0 <= Do)||LA47_0==Equals||(LA47_0 >= GT && LA47_0 <= GTEquals)||LA47_0==In||(LA47_0 >= LT && LA47_0 <= LTEquals)||LA47_0==Modulus||LA47_0==Multiply||LA47_0==NEquals||LA47_0==Pow||LA47_0==QMark||LA47_0==Subtract||(LA47_0 >= 109 && LA47_0 <= 112)) ) {
						alt47=1;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:18: ( indexes )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==OBracket) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup1955);
									indexes231=indexes();
									state._fsp--;

									stream_indexes.add(indexes231.getTree());
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
							// 238:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:51: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:63: dotLookup
							{
							pushFollow(FOLLOW_dotLookup_in_lookup1972);
							dotLookup232=dotLookup();
							state._fsp--;

							stream_dotLookup.add(dotLookup232.getTree());
							// AST REWRITE
							// elements: Identifier, dotLookup
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 238:74: -> ^( DOTPROPERTY Identifier dotLookup )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:77: ^( DOTPROPERTY Identifier dotLookup )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								adaptor.addChild(root_1, stream_dotLookup.nextTree());
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: String ( indexes )?
					{
					String233=(Token)match(input,String,FOLLOW_String_in_lookup1992);  
					stream_String.add(String233);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:13: ( indexes )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==OBracket) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1994);
							indexes234=indexes();
							state._fsp--;

							stream_indexes.add(indexes234.getTree());
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
					// 239:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:53: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:6: '(' expression ')' ( indexes )?
					{
					char_literal235=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2025);  
					stream_OParen.add(char_literal235);

					pushFollow(FOLLOW_expression_in_lookup2027);
					expression236=expression();
					state._fsp--;

					stream_expression.add(expression236.getTree());
					char_literal237=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2029);  
					stream_CParen.add(char_literal237);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:25: ( indexes )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==OBracket) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2031);
							indexes238=indexes();
							state._fsp--;

							stream_indexes.add(indexes238.getTree());
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
					// 240:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:57: ( indexes )?
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


	public static class dotLookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotLookup"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:2: dotLookup : ( '[' dotExpression ']' )+ -> ^( DOTLOOKUP ( dotExpression )+ ) ;
	public final PogoParser.dotLookup_return dotLookup() throws RecognitionException {
		PogoParser.dotLookup_return retval = new PogoParser.dotLookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal239=null;
		Token char_literal241=null;
		ParserRuleReturnScope dotExpression240 =null;

		Object char_literal239_tree=null;
		Object char_literal241_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:3: ( ( '[' dotExpression ']' )+ -> ^( DOTLOOKUP ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:5: ( '[' dotExpression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:5: ( '[' dotExpression ']' )+
			int cnt51=0;
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==OBracket) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:6: '[' dotExpression ']'
					{
					char_literal239=(Token)match(input,OBracket,FOLLOW_OBracket_in_dotLookup2072);  
					stream_OBracket.add(char_literal239);

					pushFollow(FOLLOW_dotExpression_in_dotLookup2075);
					dotExpression240=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression240.getTree());
					char_literal241=(Token)match(input,CBracket,FOLLOW_CBracket_in_dotLookup2077);  
					stream_CBracket.add(char_literal241);

					}
					break;

				default :
					if ( cnt51 >= 1 ) break loop51;
					EarlyExitException eee = new EarlyExitException(51, input);
					throw eee;
				}
				cnt51++;
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
			// 248:31: -> ^( DOTLOOKUP ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:34: ^( DOTLOOKUP ( dotExpression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTLOOKUP, "DOTLOOKUP"), root_1);
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
	// $ANTLR end "dotLookup"


	public static class dotExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:3: dotExpression : ( Dot X -> DOT X | Dot Y -> DOT Y | Dot Start -> DOT Start | Dot End -> DOT End | Dot Origin -> DOT Origin | Dot Rotation -> DOT Rotation | Dot Width -> DOT Width | Dot Height -> DOT Height | Dot Fill -> DOT Fill | Dot Stroke -> DOT Stroke | Dot Weight -> DOT Weight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Dot242=null;
		Token X243=null;
		Token Dot244=null;
		Token Y245=null;
		Token Dot246=null;
		Token Start247=null;
		Token Dot248=null;
		Token End249=null;
		Token Dot250=null;
		Token Origin251=null;
		Token Dot252=null;
		Token Rotation253=null;
		Token Dot254=null;
		Token Width255=null;
		Token Dot256=null;
		Token Height257=null;
		Token Dot258=null;
		Token Fill259=null;
		Token Dot260=null;
		Token Stroke261=null;
		Token Dot262=null;
		Token Weight263=null;

		Object Dot242_tree=null;
		Object X243_tree=null;
		Object Dot244_tree=null;
		Object Y245_tree=null;
		Object Dot246_tree=null;
		Object Start247_tree=null;
		Object Dot248_tree=null;
		Object End249_tree=null;
		Object Dot250_tree=null;
		Object Origin251_tree=null;
		Object Dot252_tree=null;
		Object Rotation253_tree=null;
		Object Dot254_tree=null;
		Object Width255_tree=null;
		Object Dot256_tree=null;
		Object Height257_tree=null;
		Object Dot258_tree=null;
		Object Fill259_tree=null;
		Object Dot260_tree=null;
		Object Stroke261_tree=null;
		Object Dot262_tree=null;
		Object Weight263_tree=null;
		RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Start=new RewriteRuleTokenStream(adaptor,"token Start");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_Height=new RewriteRuleTokenStream(adaptor,"token Height");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Width=new RewriteRuleTokenStream(adaptor,"token Width");
		RewriteRuleTokenStream stream_Origin=new RewriteRuleTokenStream(adaptor,"token Origin");
		RewriteRuleTokenStream stream_Rotation=new RewriteRuleTokenStream(adaptor,"token Rotation");
		RewriteRuleTokenStream stream_Y=new RewriteRuleTokenStream(adaptor,"token Y");
		RewriteRuleTokenStream stream_X=new RewriteRuleTokenStream(adaptor,"token X");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:3: ( Dot X -> DOT X | Dot Y -> DOT Y | Dot Start -> DOT Start | Dot End -> DOT End | Dot Origin -> DOT Origin | Dot Rotation -> DOT Rotation | Dot Width -> DOT Width | Dot Height -> DOT Height | Dot Fill -> DOT Fill | Dot Stroke -> DOT Stroke | Dot Weight -> DOT Weight )
			int alt52=11;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Dot) ) {
				switch ( input.LA(2) ) {
				case X:
					{
					alt52=1;
					}
					break;
				case Y:
					{
					alt52=2;
					}
					break;
				case Start:
					{
					alt52=3;
					}
					break;
				case End:
					{
					alt52=4;
					}
					break;
				case Origin:
					{
					alt52=5;
					}
					break;
				case Rotation:
					{
					alt52=6;
					}
					break;
				case Width:
					{
					alt52=7;
					}
					break;
				case Height:
					{
					alt52=8;
					}
					break;
				case Fill:
					{
					alt52=9;
					}
					break;
				case Stroke:
					{
					alt52=10;
					}
					break;
				case Weight:
					{
					alt52=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:5: Dot X
					{
					Dot242=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2106);  
					stream_Dot.add(Dot242);

					X243=(Token)match(input,X,FOLLOW_X_in_dotExpression2108);  
					stream_X.add(X243);

					// AST REWRITE
					// elements: X
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 252:11: -> DOT X
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_X.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:6: Dot Y
					{
					Dot244=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2121);  
					stream_Dot.add(Dot244);

					Y245=(Token)match(input,Y,FOLLOW_Y_in_dotExpression2123);  
					stream_Y.add(Y245);

					// AST REWRITE
					// elements: Y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 253:12: -> DOT Y
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Y.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:5: Dot Start
					{
					Dot246=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2135);  
					stream_Dot.add(Dot246);

					Start247=(Token)match(input,Start,FOLLOW_Start_in_dotExpression2137);  
					stream_Start.add(Start247);

					// AST REWRITE
					// elements: Start
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 254:15: -> DOT Start
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Start.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:5: Dot End
					{
					Dot248=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2149);  
					stream_Dot.add(Dot248);

					End249=(Token)match(input,End,FOLLOW_End_in_dotExpression2151);  
					stream_End.add(End249);

					// AST REWRITE
					// elements: End
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 255:13: -> DOT End
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_End.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:5: Dot Origin
					{
					Dot250=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2164);  
					stream_Dot.add(Dot250);

					Origin251=(Token)match(input,Origin,FOLLOW_Origin_in_dotExpression2166);  
					stream_Origin.add(Origin251);

					// AST REWRITE
					// elements: Origin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 256:16: -> DOT Origin
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Origin.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:5: Dot Rotation
					{
					Dot252=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2178);  
					stream_Dot.add(Dot252);

					Rotation253=(Token)match(input,Rotation,FOLLOW_Rotation_in_dotExpression2180);  
					stream_Rotation.add(Rotation253);

					// AST REWRITE
					// elements: Rotation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 257:18: -> DOT Rotation
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Rotation.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:5: Dot Width
					{
					Dot254=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2192);  
					stream_Dot.add(Dot254);

					Width255=(Token)match(input,Width,FOLLOW_Width_in_dotExpression2194);  
					stream_Width.add(Width255);

					// AST REWRITE
					// elements: Width
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 258:15: -> DOT Width
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Width.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:5: Dot Height
					{
					Dot256=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2206);  
					stream_Dot.add(Dot256);

					Height257=(Token)match(input,Height,FOLLOW_Height_in_dotExpression2208);  
					stream_Height.add(Height257);

					// AST REWRITE
					// elements: Height
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 259:16: -> DOT Height
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Height.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:5: Dot Fill
					{
					Dot258=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2220);  
					stream_Dot.add(Dot258);

					Fill259=(Token)match(input,Fill,FOLLOW_Fill_in_dotExpression2222);  
					stream_Fill.add(Fill259);

					// AST REWRITE
					// elements: Fill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 260:14: -> DOT Fill
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Fill.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:5: Dot Stroke
					{
					Dot260=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2234);  
					stream_Dot.add(Dot260);

					Stroke261=(Token)match(input,Stroke,FOLLOW_Stroke_in_dotExpression2236);  
					stream_Stroke.add(Stroke261);

					// AST REWRITE
					// elements: Stroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 261:16: -> DOT Stroke
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Stroke.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:262:5: Dot Weight
					{
					Dot262=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression2248);  
					stream_Dot.add(Dot262);

					Weight263=(Token)match(input,Weight,FOLLOW_Weight_in_dotExpression2250);  
					stream_Weight.add(Weight263);

					// AST REWRITE
					// elements: Weight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 262:16: -> DOT Weight
					{
						adaptor.addChild(root_0, (Object)adaptor.create(DOT, "DOT"));
						adaptor.addChild(root_0, stream_Weight.nextNode());
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
	// $ANTLR end "dotExpression"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:267:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal264=null;
		Token char_literal266=null;
		ParserRuleReturnScope expression265 =null;

		Object char_literal264_tree=null;
		Object char_literal266_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:6: ( '[' expression ']' )+
			int cnt53=0;
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==OBracket) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:7: '[' expression ']'
					{
					char_literal264=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2274);  
					stream_OBracket.add(char_literal264);

					pushFollow(FOLLOW_expression_in_indexes2276);
					expression265=expression();
					state._fsp--;

					stream_expression.add(expression265.getTree());
					char_literal266=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2278);  
					stream_CBracket.add(char_literal266);

					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					EarlyExitException eee = new EarlyExitException(53, input);
					throw eee;
				}
				cnt53++;
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
			// 268:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:31: ^( INDEXES ( expression )+ )
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

	// Delegated rules



	public static final BitSet FOLLOW_block_in_parse167 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block187 = new BitSet(new long[]{0x532624C8408E0082L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_functionDecl_in_block191 = new BitSet(new long[]{0x532624C8408E0082L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_Return_in_block196 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_block198 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_block200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement242 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement257 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_statement259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment306 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_assignment308 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment311 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_assignment313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall349 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_functionCall351 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall374 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_functionCall376 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall400 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_functionCall402 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall427 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_functionCall429 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall453 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_functionCall455 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall481 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_functionCall483 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionCall509 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_functionCall511 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall571 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall573 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall598 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall600 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall625 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall627 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall652 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall654 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall677 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall679 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall702 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall704 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall740 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall742 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall766 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_transformCall768 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall789 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall791 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall813 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall815 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall837 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall839 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall861 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_transformCall863 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall883 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_transformCall885 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall905 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall907 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall929 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_transformCall931 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall951 = new BitSet(new long[]{0x53222C4C400E6480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_transformCall953 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_transformCall975 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_transformCall977 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_mathCall1011 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_mathCall1013 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_mathCall1036 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_mathCall1038 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1074 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1076 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1079 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1111 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_ifStat1113 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1115 = new BitSet(new long[]{0x532624C8408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_ifStat1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1141 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1143 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1145 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1147 = new BitSet(new long[]{0x532624C8408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_elseIfStat1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1173 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1175 = new BitSet(new long[]{0x532624C8408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_elseStat1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1199 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1203 = new BitSet(new long[]{0x0002000000004000L});
	public static final BitSet FOLLOW_idList_in_functionDecl1205 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1208 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1210 = new BitSet(new long[]{0x532624C9408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_functionDecl1212 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1236 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1238 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement1240 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_forStatement1242 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1244 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_forStatement1246 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1248 = new BitSet(new long[]{0x532624C9408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_forStatement1250 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_forStatement1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1285 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1287 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1289 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1291 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1293 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1295 = new BitSet(new long[]{0x0000000004000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_repeatStatement1298 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1300 = new BitSet(new long[]{0x0000000004000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1304 = new BitSet(new long[]{0x532624C9408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_repeatStatement1306 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1336 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_whileStatement1338 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1340 = new BitSet(new long[]{0x532624C9408E0080L,0x0000430230F1A00CL});
	public static final BitSet FOLLOW_block_in_whileStatement1342 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1368 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList1371 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList1373 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList1398 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList1401 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_exprList1403 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1443 = new BitSet(new long[]{0x0008000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_QMark_in_condExpr1458 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_condExpr1462 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_condExpr1464 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_condExpr1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1491 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_condExpr1493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1545 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_orExpr1548 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_andExpr_in_orExpr1551 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1567 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_andExpr1570 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_equExpr_in_andExpr1573 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1589 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_equExpr1592 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_relExpr_in_equExpr1601 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1617 = new BitSet(new long[]{0x0C00030000000002L});
	public static final BitSet FOLLOW_set_in_relExpr1620 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_addExpr_in_relExpr1637 = new BitSet(new long[]{0x0C00030000000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1653 = new BitSet(new long[]{0x0000000000000022L,0x0000000400000000L});
	public static final BitSet FOLLOW_set_in_addExpr1656 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1665 = new BitSet(new long[]{0x0000000000000022L,0x0000000400000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1681 = new BitSet(new long[]{0xA000000002000002L});
	public static final BitSet FOLLOW_set_in_mulExpr1684 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1697 = new BitSet(new long[]{0xA000000002000002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_Pow_in_powExpr1716 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1737 = new BitSet(new long[]{0x53222C48400E2480L,0x000001833091A9BCL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1754 = new BitSet(new long[]{0x53222C48400E2480L,0x000001833091A9BCL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1844 = new BitSet(new long[]{0x53222C4C400E3480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_exprList_in_list1846 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup1872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_lookup1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotLookup_in_lookup1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_lookup1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_lookup1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotLookup_in_lookup1972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1992 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_lookup1994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2025 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_lookup2027 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_lookup2029 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexes_in_lookup2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_dotLookup2072 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotLookup2075 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_dotLookup2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2106 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_X_in_dotExpression2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2121 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_Y_in_dotExpression2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Start_in_dotExpression2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2149 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_End_in_dotExpression2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Origin_in_dotExpression2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Rotation_in_dotExpression2180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2192 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Width_in_dotExpression2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2206 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_Height_in_dotExpression2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2220 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_Fill_in_dotExpression2222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2234 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Stroke_in_dotExpression2236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dot_in_dotExpression2248 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Weight_in_dotExpression2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2274 = new BitSet(new long[]{0x53222C4C400E2480L,0x000001873091A9BCL});
	public static final BitSet FOLLOW_expression_in_indexes2276 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
}
