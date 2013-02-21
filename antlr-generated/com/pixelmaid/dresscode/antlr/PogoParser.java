// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-02-21 15:08:05

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
		"Comma", "Comment", "Copy", "Cosine", "Curve", "Def", "Digit", "Divide", 
		"Do", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", "FUNCTION", 
		"FUNC_CALL", "Fill", "For", "GT", "GTEquals", "Group", "HEIGHT_CONSTANT", 
		"Hide", "ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LIST", 
		"LOOKUP", "LT", "LTEquals", "Line", "Modulus", "Move", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Rect", "Repeat", "Return", "Rotate", "SPECIAL", 
		"STATEMENTS", "Scale", "Sine", "Size", "Space", "String", "Stroke", "Subtract", 
		"TERNARY", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", 
		"While", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
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
	public static final int Def=20;
	public static final int Digit=21;
	public static final int Divide=22;
	public static final int Do=23;
	public static final int EXP=24;
	public static final int EXP_LIST=25;
	public static final int Ellipse=26;
	public static final int Else=27;
	public static final int End=28;
	public static final int Equals=29;
	public static final int Excl=30;
	public static final int FUNCTION=31;
	public static final int FUNC_CALL=32;
	public static final int Fill=33;
	public static final int For=34;
	public static final int GT=35;
	public static final int GTEquals=36;
	public static final int Group=37;
	public static final int HEIGHT_CONSTANT=38;
	public static final int Hide=39;
	public static final int ID_LIST=40;
	public static final int IF=41;
	public static final int INDEXES=42;
	public static final int Identifier=43;
	public static final int If=44;
	public static final int In=45;
	public static final int Int=46;
	public static final int LIST=47;
	public static final int LOOKUP=48;
	public static final int LT=49;
	public static final int LTEquals=50;
	public static final int Line=51;
	public static final int Modulus=52;
	public static final int Move=53;
	public static final int Multiply=54;
	public static final int NEGATE=55;
	public static final int NEquals=56;
	public static final int NoFill=57;
	public static final int NoStroke=58;
	public static final int Null=59;
	public static final int Number=60;
	public static final int OBrace=61;
	public static final int OBracket=62;
	public static final int OParen=63;
	public static final int Or=64;
	public static final int PI_CONSTANT=65;
	public static final int Point=66;
	public static final int Polygon=67;
	public static final int Pow=68;
	public static final int Print=69;
	public static final int Println=70;
	public static final int QMark=71;
	public static final int Quad=72;
	public static final int RETURN=73;
	public static final int Rect=74;
	public static final int Repeat=75;
	public static final int Return=76;
	public static final int Rotate=77;
	public static final int SPECIAL=78;
	public static final int STATEMENTS=79;
	public static final int Scale=80;
	public static final int Sine=81;
	public static final int Size=82;
	public static final int Space=83;
	public static final int String=84;
	public static final int Stroke=85;
	public static final int Subtract=86;
	public static final int TERNARY=87;
	public static final int To=88;
	public static final int Triangle=89;
	public static final int UNARY_MIN=90;
	public static final int WIDTH_CONSTANT=91;
	public static final int Weight=92;
	public static final int While=93;

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:61:1: parse : block EOF -> block ;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:62:3: ( block EOF -> block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:62:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse151);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse153);  
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
			// 62:16: -> block
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:65:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||(LA1_0 >= Fill && LA1_0 <= For)||LA1_0==Group||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==Line||LA1_0==Move||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||LA1_0==Polygon||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Rect && LA1_0 <= Repeat)||LA1_0==Rotate||(LA1_0 >= Sine && LA1_0 <= Size)||LA1_0==Stroke||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==95) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:6: statement
					{
					pushFollow(FOLLOW_statement_in_block171);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block175);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block180);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block182);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,95,FOLLOW_95_in_block184);  
					stream_95.add(char_literal7);

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
			// 67:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:67:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:67:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:67:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:67:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:67:51: ( expression )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
			case 95:
				{
				alt3=1;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Fill:
			case Group:
			case Hide:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement226);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,95,FOLLOW_95_in_statement228);  
					stream_95.add(char_literal9);

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
					// 71:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:72:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement241);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,95,FOLLOW_95_in_statement243);  
					stream_95.add(char_literal11);

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
					// 72:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:73:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement255);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:74:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement262);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement269);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement276);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:79:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			else if ( (LA5_0==95) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:6: Identifier ( indexes )? '=' expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment290);  
					stream_Identifier.add(Identifier16);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment292);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment295);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment297);
					expression19=expression();
					state._fsp--;

					stream_expression.add(expression19.getTree());
					// AST REWRITE
					// elements: Identifier, indexes, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 80:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:69: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:3: 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | primitiveCall | transformCall | mathCall );
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
		ParserRuleReturnScope exprList22 =null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope primitiveCall40 =null;
		ParserRuleReturnScope transformCall41 =null;
		ParserRuleReturnScope mathCall42 =null;

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
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | primitiveCall | transformCall | mathCall )
			int alt8=8;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt8=1;
				}
				break;
			case Println:
				{
				alt8=2;
				}
				break;
			case Print:
				{
				alt8=3;
				}
				break;
			case Assert:
				{
				alt8=4;
				}
				break;
			case Size:
				{
				alt8=5;
				}
				break;
			case Curve:
			case Ellipse:
			case Line:
			case Polygon:
			case Rect:
				{
				alt8=6;
				}
				break;
			case Copy:
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
				alt8=7;
				}
				break;
			case Cosine:
			case Sine:
				{
				alt8=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall331);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall333);  
					stream_OParen.add(char_literal21);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Ellipse||LA6_0==Excl||(LA6_0 >= Fill && LA6_0 <= For)||(LA6_0 >= Group && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==Line||LA6_0==Move||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||LA6_0==PI_CONSTANT||LA6_0==Polygon||(LA6_0 >= Print && LA6_0 <= Println)||(LA6_0 >= Rect && LA6_0 <= Repeat)||LA6_0==Rotate||(LA6_0 >= Sine && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||(LA6_0 >= WIDTH_CONSTANT && LA6_0 <= While)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall335);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall338);  
					stream_CParen.add(char_literal23);

					// AST REWRITE
					// elements: exprList, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:61: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall356);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall358);  
					stream_OParen.add(char_literal25);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Ellipse||LA7_0==Excl||(LA7_0 >= Fill && LA7_0 <= For)||(LA7_0 >= Group && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==Line||LA7_0==Move||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||LA7_0==PI_CONSTANT||LA7_0==Polygon||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Rect && LA7_0 <= Repeat)||LA7_0==Rotate||(LA7_0 >= Sine && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||(LA7_0 >= WIDTH_CONSTANT && LA7_0 <= While)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall360);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall363);  
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
					// 86:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:58: ( expression )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall382);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall384);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall386);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall388);  
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
					// 87:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:38: ^( FUNC_CALL Print expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall409);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall411);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall413);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall415);  
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
					// 88:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:38: ^( FUNC_CALL Assert expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall435);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall437);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall439);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall441);  
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
					// 89:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:38: ^( FUNC_CALL Size expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall463);
					primitiveCall40=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall40.getTree());

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall470);
					transformCall41=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall41.getTree());

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:92:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall477);
					mathCall42=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall42.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		Token Line47=null;
		Token char_literal48=null;
		Token char_literal50=null;
		Token Rect51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token Curve55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token Polygon59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope exprList45 =null;
		ParserRuleReturnScope exprList49 =null;
		ParserRuleReturnScope exprList53 =null;
		ParserRuleReturnScope exprList57 =null;
		ParserRuleReturnScope exprList61 =null;

		Object Ellipse43_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		Object Line47_tree=null;
		Object char_literal48_tree=null;
		Object char_literal50_tree=null;
		Object Rect51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object Curve55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object Polygon59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) )
			int alt14=5;
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt14=1;
				}
				break;
			case Line:
				{
				alt14=2;
				}
				break;
			case Rect:
				{
				alt14=3;
				}
				break;
			case Curve:
				{
				alt14=4;
				}
				break;
			case Polygon:
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse43=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall497);  
					stream_Ellipse.add(Ellipse43);

					char_literal44=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall499);  
					stream_OParen.add(char_literal44);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:17: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Ellipse||LA9_0==Excl||(LA9_0 >= Fill && LA9_0 <= For)||(LA9_0 >= Group && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==Line||LA9_0==Move||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||LA9_0==PI_CONSTANT||LA9_0==Polygon||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Rect && LA9_0 <= Repeat)||LA9_0==Rotate||(LA9_0 >= Sine && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||(LA9_0 >= WIDTH_CONSTANT && LA9_0 <= While)) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall501);
							exprList45=exprList();
							state._fsp--;

							stream_exprList.add(exprList45.getTree());
							}
							break;

					}

					char_literal46=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall504);  
					stream_CParen.add(char_literal46);

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
					// 97:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:56: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:5: Line '(' ( exprList )? ')'
					{
					Line47=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall524);  
					stream_Line.add(Line47);

					char_literal48=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall526);  
					stream_OParen.add(char_literal48);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:14: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Assert||LA10_0==Bool||LA10_0==COLOR_CONSTANT||(LA10_0 >= Copy && LA10_0 <= Curve)||LA10_0==Ellipse||LA10_0==Excl||(LA10_0 >= Fill && LA10_0 <= For)||(LA10_0 >= Group && LA10_0 <= Hide)||LA10_0==Identifier||LA10_0==Line||LA10_0==Move||(LA10_0 >= NoFill && LA10_0 <= Number)||(LA10_0 >= OBracket && LA10_0 <= OParen)||LA10_0==PI_CONSTANT||LA10_0==Polygon||(LA10_0 >= Print && LA10_0 <= Println)||(LA10_0 >= Rect && LA10_0 <= Repeat)||LA10_0==Rotate||(LA10_0 >= Sine && LA10_0 <= Size)||(LA10_0 >= String && LA10_0 <= Subtract)||(LA10_0 >= WIDTH_CONSTANT && LA10_0 <= While)) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall528);
							exprList49=exprList();
							state._fsp--;

							stream_exprList.add(exprList49.getTree());
							}
							break;

					}

					char_literal50=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall531);  
					stream_CParen.add(char_literal50);

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
					// 98:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:5: Rect '(' ( exprList )? ')'
					{
					Rect51=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall551);  
					stream_Rect.add(Rect51);

					char_literal52=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall553);  
					stream_OParen.add(char_literal52);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:14: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Ellipse||LA11_0==Excl||(LA11_0 >= Fill && LA11_0 <= For)||(LA11_0 >= Group && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==Line||LA11_0==Move||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||LA11_0==PI_CONSTANT||LA11_0==Polygon||(LA11_0 >= Print && LA11_0 <= Println)||(LA11_0 >= Rect && LA11_0 <= Repeat)||LA11_0==Rotate||(LA11_0 >= Sine && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||(LA11_0 >= WIDTH_CONSTANT && LA11_0 <= While)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall555);
							exprList53=exprList();
							state._fsp--;

							stream_exprList.add(exprList53.getTree());
							}
							break;

					}

					char_literal54=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall558);  
					stream_CParen.add(char_literal54);

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
					// 99:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:5: Curve '(' ( exprList )? ')'
					{
					Curve55=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall578);  
					stream_Curve.add(Curve55);

					char_literal56=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall580);  
					stream_OParen.add(char_literal56);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:15: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Ellipse||LA12_0==Excl||(LA12_0 >= Fill && LA12_0 <= For)||(LA12_0 >= Group && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==Line||LA12_0==Move||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||LA12_0==PI_CONSTANT||LA12_0==Polygon||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Rect && LA12_0 <= Repeat)||LA12_0==Rotate||(LA12_0 >= Sine && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||(LA12_0 >= WIDTH_CONSTANT && LA12_0 <= While)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall582);
							exprList57=exprList();
							state._fsp--;

							stream_exprList.add(exprList57.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall585);  
					stream_CParen.add(char_literal58);

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
					// 100:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:5: Polygon '(' ( exprList )? ')'
					{
					Polygon59=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall603);  
					stream_Polygon.add(Polygon59);

					char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall605);  
					stream_OParen.add(char_literal60);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:17: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Ellipse||LA13_0==Excl||(LA13_0 >= Fill && LA13_0 <= For)||(LA13_0 >= Group && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==Line||LA13_0==Move||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||LA13_0==PI_CONSTANT||LA13_0==Polygon||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Rect && LA13_0 <= Repeat)||LA13_0==Rotate||(LA13_0 >= Sine && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||(LA13_0 >= WIDTH_CONSTANT && LA13_0 <= While)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall607);
							exprList61=exprList();
							state._fsp--;

							stream_exprList.add(exprList61.getTree());
							}
							break;

					}

					char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall610);  
					stream_CParen.add(char_literal62);

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
					// 101:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:55: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token Copy67=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token Rotate71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token Fill75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token Stroke79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token NoFill83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token NoStroke87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		Token Weight91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token Hide95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token Group99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope exprList65 =null;
		ParserRuleReturnScope expression69 =null;
		ParserRuleReturnScope exprList73 =null;
		ParserRuleReturnScope exprList77 =null;
		ParserRuleReturnScope exprList81 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope expression89 =null;
		ParserRuleReturnScope exprList93 =null;
		ParserRuleReturnScope expression97 =null;
		ParserRuleReturnScope exprList101 =null;

		Object Move63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object Copy67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object Rotate71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object Fill75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object Stroke79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object NoFill83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object NoStroke87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object Weight91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object Hide95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object Group99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) )
			int alt21=10;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt21=1;
				}
				break;
			case Copy:
				{
				alt21=2;
				}
				break;
			case Rotate:
				{
				alt21=3;
				}
				break;
			case Fill:
				{
				alt21=4;
				}
				break;
			case Stroke:
				{
				alt21=5;
				}
				break;
			case NoFill:
				{
				alt21=6;
				}
				break;
			case NoStroke:
				{
				alt21=7;
				}
				break;
			case Weight:
				{
				alt21=8;
				}
				break;
			case Hide:
				{
				alt21=9;
				}
				break;
			case Group:
				{
				alt21=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: Move '(' ( exprList )? ')'
					{
					Move63=(Token)match(input,Move,FOLLOW_Move_in_transformCall641);  
					stream_Move.add(Move63);

					char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall643);  
					stream_OParen.add(char_literal64);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:15: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Ellipse||LA15_0==Excl||(LA15_0 >= Fill && LA15_0 <= For)||(LA15_0 >= Group && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==Line||LA15_0==Move||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||LA15_0==PI_CONSTANT||LA15_0==Polygon||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Rect && LA15_0 <= Repeat)||LA15_0==Rotate||(LA15_0 >= Sine && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||(LA15_0 >= WIDTH_CONSTANT && LA15_0 <= While)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall645);
							exprList65=exprList();
							state._fsp--;

							stream_exprList.add(exprList65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall648);  
					stream_CParen.add(char_literal66);

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
					// 105:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:6: Copy '(' expression ')'
					{
					Copy67=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall667);  
					stream_Copy.add(Copy67);

					char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall669);  
					stream_OParen.add(char_literal68);

					pushFollow(FOLLOW_expression_in_transformCall671);
					expression69=expression();
					state._fsp--;

					stream_expression.add(expression69.getTree());
					char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall673);  
					stream_CParen.add(char_literal70);

					// AST REWRITE
					// elements: Copy, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:33: ^( FUNC_CALL Copy expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:6: Rotate '(' ( exprList )? ')'
					{
					Rotate71=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall690);  
					stream_Rotate.add(Rotate71);

					char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall692);  
					stream_OParen.add(char_literal72);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Ellipse||LA16_0==Excl||(LA16_0 >= Fill && LA16_0 <= For)||(LA16_0 >= Group && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==Line||LA16_0==Move||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||LA16_0==PI_CONSTANT||LA16_0==Polygon||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Rect && LA16_0 <= Repeat)||LA16_0==Rotate||(LA16_0 >= Sine && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||(LA16_0 >= WIDTH_CONSTANT && LA16_0 <= While)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall694);
							exprList73=exprList();
							state._fsp--;

							stream_exprList.add(exprList73.getTree());
							}
							break;

					}

					char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall697);  
					stream_CParen.add(char_literal74);

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
					// 107:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:6: Fill '(' ( exprList )? ')'
					{
					Fill75=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall714);  
					stream_Fill.add(Fill75);

					char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall716);  
					stream_OParen.add(char_literal76);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:15: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Ellipse||LA17_0==Excl||(LA17_0 >= Fill && LA17_0 <= For)||(LA17_0 >= Group && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==Line||LA17_0==Move||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||LA17_0==PI_CONSTANT||LA17_0==Polygon||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Rect && LA17_0 <= Repeat)||LA17_0==Rotate||(LA17_0 >= Sine && LA17_0 <= Size)||(LA17_0 >= String && LA17_0 <= Subtract)||(LA17_0 >= WIDTH_CONSTANT && LA17_0 <= While)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall718);
							exprList77=exprList();
							state._fsp--;

							stream_exprList.add(exprList77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall721);  
					stream_CParen.add(char_literal78);

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
					// 108:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:6: Stroke '(' ( exprList )? ')'
					{
					Stroke79=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall738);  
					stream_Stroke.add(Stroke79);

					char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall740);  
					stream_OParen.add(char_literal80);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:17: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==Assert||LA18_0==Bool||LA18_0==COLOR_CONSTANT||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Ellipse||LA18_0==Excl||(LA18_0 >= Fill && LA18_0 <= For)||(LA18_0 >= Group && LA18_0 <= Hide)||LA18_0==Identifier||LA18_0==Line||LA18_0==Move||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||LA18_0==PI_CONSTANT||LA18_0==Polygon||(LA18_0 >= Print && LA18_0 <= Println)||(LA18_0 >= Rect && LA18_0 <= Repeat)||LA18_0==Rotate||(LA18_0 >= Sine && LA18_0 <= Size)||(LA18_0 >= String && LA18_0 <= Subtract)||(LA18_0 >= WIDTH_CONSTANT && LA18_0 <= While)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall742);
							exprList81=exprList();
							state._fsp--;

							stream_exprList.add(exprList81.getTree());
							}
							break;

					}

					char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall745);  
					stream_CParen.add(char_literal82);

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
					// 109:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:6: NoFill '(' expression ')'
					{
					NoFill83=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall762);  
					stream_NoFill.add(NoFill83);

					char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall764);  
					stream_OParen.add(char_literal84);

					pushFollow(FOLLOW_expression_in_transformCall766);
					expression85=expression();
					state._fsp--;

					stream_expression.add(expression85.getTree());
					char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall768);  
					stream_CParen.add(char_literal86);

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
					// 110:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:34: ^( FUNC_CALL NoFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:6: NoStroke '(' expression ')'
					{
					NoStroke87=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall784);  
					stream_NoStroke.add(NoStroke87);

					char_literal88=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall786);  
					stream_OParen.add(char_literal88);

					pushFollow(FOLLOW_expression_in_transformCall788);
					expression89=expression();
					state._fsp--;

					stream_expression.add(expression89.getTree());
					char_literal90=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall790);  
					stream_CParen.add(char_literal90);

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
					// 111:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:36: ^( FUNC_CALL NoStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:6: Weight '(' ( exprList )? ')'
					{
					Weight91=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall806);  
					stream_Weight.add(Weight91);

					char_literal92=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall808);  
					stream_OParen.add(char_literal92);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:17: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||LA19_0==Excl||(LA19_0 >= Fill && LA19_0 <= For)||(LA19_0 >= Group && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==Line||LA19_0==Move||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||LA19_0==PI_CONSTANT||LA19_0==Polygon||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Rect && LA19_0 <= Repeat)||LA19_0==Rotate||(LA19_0 >= Sine && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= While)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall810);
							exprList93=exprList();
							state._fsp--;

							stream_exprList.add(exprList93.getTree());
							}
							break;

					}

					char_literal94=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall813);  
					stream_CParen.add(char_literal94);

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
					// 112:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:6: Hide '(' expression ')'
					{
					Hide95=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall830);  
					stream_Hide.add(Hide95);

					char_literal96=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall832);  
					stream_OParen.add(char_literal96);

					pushFollow(FOLLOW_expression_in_transformCall834);
					expression97=expression();
					state._fsp--;

					stream_expression.add(expression97.getTree());
					char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall836);  
					stream_CParen.add(char_literal98);

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
					// 113:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:32: ^( FUNC_CALL Hide expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:6: Group '(' ( exprList )? ')'
					{
					Group99=(Token)match(input,Group,FOLLOW_Group_in_transformCall852);  
					stream_Group.add(Group99);

					char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall854);  
					stream_OParen.add(char_literal100);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:16: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Ellipse||LA20_0==Excl||(LA20_0 >= Fill && LA20_0 <= For)||(LA20_0 >= Group && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==Line||LA20_0==Move||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||LA20_0==PI_CONSTANT||LA20_0==Polygon||(LA20_0 >= Print && LA20_0 <= Println)||(LA20_0 >= Rect && LA20_0 <= Repeat)||LA20_0==Rotate||(LA20_0 >= Sine && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||(LA20_0 >= WIDTH_CONSTANT && LA20_0 <= While)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall856);
							exprList101=exprList();
							state._fsp--;

							stream_exprList.add(exprList101.getTree());
							}
							break;

					}

					char_literal102=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall859);  
					stream_CParen.add(char_literal102);

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
					// 114:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:50: ( exprList )?
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
	// $ANTLR end "transformCall"


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token Sine107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope expression109 =null;

		Object Cosine103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object Sine107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Cosine) ) {
				alt22=1;
			}
			else if ( (LA22_0==Sine) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:6: Cosine '(' expression ')'
					{
					Cosine103=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall890);  
					stream_Cosine.add(Cosine103);

					char_literal104=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall892);  
					stream_OParen.add(char_literal104);

					pushFollow(FOLLOW_expression_in_mathCall894);
					expression105=expression();
					state._fsp--;

					stream_expression.add(expression105.getTree());
					char_literal106=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall896);  
					stream_CParen.add(char_literal106);

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
					// 118:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:6: Sine '(' expression ')'
					{
					Sine107=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall915);  
					stream_Sine.add(Sine107);

					char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall917);  
					stream_OParen.add(char_literal108);

					pushFollow(FOLLOW_expression_in_mathCall919);
					expression109=expression();
					state._fsp--;

					stream_expression.add(expression109.getTree());
					char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall921);  
					stream_CParen.add(char_literal110);

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
					// 119:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:35: ^( FUNC_CALL Sine expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End114=null;
		ParserRuleReturnScope ifStat111 =null;
		ParserRuleReturnScope elseIfStat112 =null;
		ParserRuleReturnScope elseStat113 =null;

		Object End114_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement955);
			ifStat111=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat111.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:13: ( elseIfStat )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Else) ) {
					int LA23_1 = input.LA(2);
					if ( (LA23_1==If) ) {
						alt23=1;
					}

				}

				switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement957);
					elseIfStat112=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat112.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:25: ( elseStat )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Else) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement960);
					elseStat113=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat113.getTree());
					}
					break;

			}

			End114=(Token)match(input,End,FOLLOW_End_in_ifStatement963);  
			stream_End.add(End114);

			// AST REWRITE
			// elements: elseStat, ifStat, elseIfStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:66: ( elseStat )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If115=null;
		Token Do117=null;
		ParserRuleReturnScope expression116 =null;
		ParserRuleReturnScope block118 =null;

		Object If115_tree=null;
		Object Do117_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: If expression Do block
			{
			If115=(Token)match(input,If,FOLLOW_If_in_ifStat992);  
			stream_If.add(If115);

			pushFollow(FOLLOW_expression_in_ifStat994);
			expression116=expression();
			state._fsp--;

			stream_expression.add(expression116.getTree());
			Do117=(Token)match(input,Do,FOLLOW_Do_in_ifStat996);  
			stream_Do.add(Do117);

			pushFollow(FOLLOW_block_in_ifStat998);
			block118=block();
			state._fsp--;

			stream_block.add(block118.getTree());
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
			// 130:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:32: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else119=null;
		Token If120=null;
		Token Do122=null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope block123 =null;

		Object Else119_tree=null;
		Object If120_tree=null;
		Object Do122_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Else If expression Do block
			{
			Else119=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1022);  
			stream_Else.add(Else119);

			If120=(Token)match(input,If,FOLLOW_If_in_elseIfStat1024);  
			stream_If.add(If120);

			pushFollow(FOLLOW_expression_in_elseIfStat1026);
			expression121=expression();
			state._fsp--;

			stream_expression.add(expression121.getTree());
			Do122=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1028);  
			stream_Do.add(Do122);

			pushFollow(FOLLOW_block_in_elseIfStat1030);
			block123=block();
			state._fsp--;

			stream_block.add(block123.getTree());
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
			// 134:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:37: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else124=null;
		Token Do125=null;
		ParserRuleReturnScope block126 =null;

		Object Else124_tree=null;
		Object Do125_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: Else Do block
			{
			Else124=(Token)match(input,Else,FOLLOW_Else_in_elseStat1054);  
			stream_Else.add(Else124);

			Do125=(Token)match(input,Do,FOLLOW_Do_in_elseStat1056);  
			stream_Do.add(Do125);

			pushFollow(FOLLOW_block_in_elseStat1058);
			block126=block();
			state._fsp--;

			stream_block.add(block126.getTree());
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
			// 138:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:23: ^( EXP block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def127=null;
		Token Identifier128=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token Do132=null;
		Token End134=null;
		ParserRuleReturnScope idList130 =null;
		ParserRuleReturnScope block133 =null;

		Object Def127_tree=null;
		Object Identifier128_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		Object Do132_tree=null;
		Object End134_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def127=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1080); 
			Def127_tree = (Object)adaptor.create(Def127);
			adaptor.addChild(root_0, Def127_tree);

			Identifier128=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1082); 
			Identifier128_tree = (Object)adaptor.create(Identifier128);
			adaptor.addChild(root_0, Identifier128_tree);

			char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1084); 
			char_literal129_tree = (Object)adaptor.create(char_literal129);
			adaptor.addChild(root_0, char_literal129_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:25: ( idList )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Identifier) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1086);
					idList130=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList130.getTree());

					}
					break;

			}

			char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1089); 
			char_literal131_tree = (Object)adaptor.create(char_literal131);
			adaptor.addChild(root_0, char_literal131_tree);

			Do132=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1091); 
			Do132_tree = (Object)adaptor.create(Do132);
			adaptor.addChild(root_0, Do132_tree);

			pushFollow(FOLLOW_block_in_functionDecl1093);
			block133=block();
			state._fsp--;

			adaptor.addChild(root_0, block133.getTree());

			End134=(Token)match(input,End,FOLLOW_End_in_functionDecl1095); 
			End134_tree = (Object)adaptor.create(End134);
			adaptor.addChild(root_0, End134_tree);

			defineFunction((Identifier128!=null?Identifier128.getText():null), (idList130!=null?((Object)idList130.getTree()):null), (block133!=null?((Object)block133.getTree()):null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For135=null;
		Token Identifier136=null;
		Token char_literal137=null;
		Token Do139=null;
		Token Do141=null;
		Token End143=null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope expression140 =null;
		ParserRuleReturnScope block142 =null;

		Object For135_tree=null;
		Object Identifier136_tree=null;
		Object char_literal137_tree=null;
		Object Do139_tree=null;
		Object Do141_tree=null;
		Object End143_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:6: For Identifier '=' expression Do expression Do block End
			{
			For135=(Token)match(input,For,FOLLOW_For_in_forStatement1117);  
			stream_For.add(For135);

			Identifier136=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1119);  
			stream_Identifier.add(Identifier136);

			char_literal137=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1121);  
			stream_Assign.add(char_literal137);

			pushFollow(FOLLOW_expression_in_forStatement1123);
			expression138=expression();
			state._fsp--;

			stream_expression.add(expression138.getTree());
			Do139=(Token)match(input,Do,FOLLOW_Do_in_forStatement1125);  
			stream_Do.add(Do139);

			pushFollow(FOLLOW_expression_in_forStatement1127);
			expression140=expression();
			state._fsp--;

			stream_expression.add(expression140.getTree());
			Do141=(Token)match(input,Do,FOLLOW_Do_in_forStatement1129);  
			stream_Do.add(Do141);

			pushFollow(FOLLOW_block_in_forStatement1131);
			block142=block();
			state._fsp--;

			stream_block.add(block142.getTree());
			End143=(Token)match(input,End,FOLLOW_End_in_forStatement1133);  
			stream_End.add(End143);

			// AST REWRITE
			// elements: For, block, expression, Identifier, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:9: ^( For Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat144=null;
		Token Identifier145=null;
		Token char_literal146=null;
		Token Do148=null;
		Token char_literal150=null;
		Token Do152=null;
		Token End154=null;
		ParserRuleReturnScope expression147 =null;
		ParserRuleReturnScope expression149 =null;
		ParserRuleReturnScope expression151 =null;
		ParserRuleReturnScope block153 =null;

		Object Repeat144_tree=null;
		Object Identifier145_tree=null;
		Object char_literal146_tree=null;
		Object Do148_tree=null;
		Object char_literal150_tree=null;
		Object Do152_tree=null;
		Object End154_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat144=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1166);  
			stream_Repeat.add(Repeat144);

			Identifier145=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1168);  
			stream_Identifier.add(Identifier145);

			char_literal146=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1170);  
			stream_Assign.add(char_literal146);

			pushFollow(FOLLOW_expression_in_repeatStatement1172);
			expression147=expression();
			state._fsp--;

			stream_expression.add(expression147.getTree());
			Do148=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1174);  
			stream_Do.add(Do148);

			pushFollow(FOLLOW_expression_in_repeatStatement1176);
			expression149=expression();
			state._fsp--;

			stream_expression.add(expression149.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:52: ( '|' expression )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==96) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:53: '|' expression
					{
					char_literal150=(Token)match(input,96,FOLLOW_96_in_repeatStatement1179);  
					stream_96.add(char_literal150);

					pushFollow(FOLLOW_expression_in_repeatStatement1181);
					expression151=expression();
					state._fsp--;

					stream_expression.add(expression151.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			Do152=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1185);  
			stream_Do.add(Do152);

			pushFollow(FOLLOW_block_in_repeatStatement1187);
			block153=block();
			state._fsp--;

			stream_block.add(block153.getTree());
			End154=(Token)match(input,End,FOLLOW_End_in_repeatStatement1189);  
			stream_End.add(End154);

			// AST REWRITE
			// elements: Identifier, Repeat, expression, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 152:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:86: ^( Repeat Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While155=null;
		Token Do157=null;
		Token End159=null;
		ParserRuleReturnScope expression156 =null;
		ParserRuleReturnScope block158 =null;

		Object While155_tree=null;
		Object Do157_tree=null;
		Object End159_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:6: While expression Do block End
			{
			While155=(Token)match(input,While,FOLLOW_While_in_whileStatement1217);  
			stream_While.add(While155);

			pushFollow(FOLLOW_expression_in_whileStatement1219);
			expression156=expression();
			state._fsp--;

			stream_expression.add(expression156.getTree());
			Do157=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1221);  
			stream_Do.add(Do157);

			pushFollow(FOLLOW_block_in_whileStatement1223);
			block158=block();
			state._fsp--;

			stream_block.add(block158.getTree());
			End159=(Token)match(input,End,FOLLOW_End_in_whileStatement1225);  
			stream_End.add(End159);

			// AST REWRITE
			// elements: expression, block, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 156:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:39: ^( While expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier160=null;
		Token char_literal161=null;
		Token Identifier162=null;

		Object Identifier160_tree=null;
		Object char_literal161_tree=null;
		Object Identifier162_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:6: Identifier ( ',' Identifier )*
			{
			Identifier160=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1249);  
			stream_Identifier.add(Identifier160);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:17: ( ',' Identifier )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Comma) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:18: ',' Identifier
					{
					char_literal161=(Token)match(input,Comma,FOLLOW_Comma_in_idList1252);  
					stream_Comma.add(char_literal161);

					Identifier162=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1254);  
					stream_Identifier.add(Identifier162);

					}
					break;

				default :
					break loop27;
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
			// 160:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal164=null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expression165 =null;

		Object char_literal164_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1279);
			expression163=expression();
			state._fsp--;

			stream_expression.add(expression163.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:17: ( ',' expression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==Comma) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:18: ',' expression
					{
					char_literal164=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1282);  
					stream_Comma.add(char_literal164);

					pushFollow(FOLLOW_expression_in_exprList1284);
					expression165=expression();
					state._fsp--;

					stream_expression.add(expression165.getTree());
					}
					break;

				default :
					break loop28;
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
			// 164:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr166 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression1309);
			condExpr166=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr166.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal168=null;
		Token char_literal169=null;
		Token In170=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr167 =null;
		ParserRuleReturnScope expression171 =null;

		Object char_literal168_tree=null;
		Object char_literal169_tree=null;
		Object In170_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1324);
			orExpr167=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr167.getTree());
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
			// 172:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==QMark) ) {
				alt29=1;
			}
			else if ( (LA29_0==In) ) {
				alt29=2;
			}
			switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:8: '?' a= expression ':' b= expression
					{
					char_literal168=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1339);  
					stream_QMark.add(char_literal168);

					pushFollow(FOLLOW_expression_in_condExpr1343);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal169=(Token)match(input,Do,FOLLOW_Do_in_condExpr1345);  
					stream_Do.add(char_literal169);

					pushFollow(FOLLOW_expression_in_condExpr1349);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, a, orExpr
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
					// 173:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:45: ^( TERNARY orExpr $a $b)
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:8: In expression
					{
					In170=(Token)match(input,In,FOLLOW_In_in_condExpr1372);  
					stream_In.add(In170);

					pushFollow(FOLLOW_expression_in_condExpr1374);
					expression171=expression();
					state._fsp--;

					stream_expression.add(expression171.getTree());
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
					// 174:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:45: ^( In orExpr expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal173=null;
		ParserRuleReturnScope andExpr172 =null;
		ParserRuleReturnScope andExpr174 =null;

		Object string_literal173_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1426);
			andExpr172=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr172.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:14: ( '||' ^ andExpr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==97) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:15: '||' ^ andExpr
					{
					string_literal173=(Token)match(input,97,FOLLOW_97_in_orExpr1429); 
					string_literal173_tree = (Object)adaptor.create(string_literal173);
					root_0 = (Object)adaptor.becomeRoot(string_literal173_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1432);
					andExpr174=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr174.getTree());

					}
					break;

				default :
					break loop30;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal176=null;
		ParserRuleReturnScope equExpr175 =null;
		ParserRuleReturnScope equExpr177 =null;

		Object string_literal176_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1448);
			equExpr175=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr175.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:14: ( '&&' ^ equExpr )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==94) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:15: '&&' ^ equExpr
					{
					string_literal176=(Token)match(input,94,FOLLOW_94_in_andExpr1451); 
					string_literal176_tree = (Object)adaptor.create(string_literal176);
					root_0 = (Object)adaptor.becomeRoot(string_literal176_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1454);
					equExpr177=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr177.getTree());

					}
					break;

				default :
					break loop31;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set179=null;
		ParserRuleReturnScope relExpr178 =null;
		ParserRuleReturnScope relExpr180 =null;

		Object set179_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1470);
			relExpr178=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr178.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Equals||LA32_0==NEquals) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:15: ( '==' | '!=' ) ^ relExpr
					{
					set179=input.LT(1);
					set179=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set179), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1482);
					relExpr180=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr180.getTree());

					}
					break;

				default :
					break loop32;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set182=null;
		ParserRuleReturnScope addExpr181 =null;
		ParserRuleReturnScope addExpr183 =null;

		Object set182_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1498);
			addExpr181=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr181.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( ((LA33_0 >= GT && LA33_0 <= GTEquals)||(LA33_0 >= LT && LA33_0 <= LTEquals)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set182=input.LT(1);
					set182=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set182), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1518);
					addExpr183=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr183.getTree());

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
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set185=null;
		ParserRuleReturnScope mulExpr184 =null;
		ParserRuleReturnScope mulExpr186 =null;

		Object set185_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1534);
			mulExpr184=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr184.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==Add||LA34_0==Subtract) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:15: ( '+' | '-' ) ^ mulExpr
					{
					set185=input.LT(1);
					set185=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set185), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1546);
					mulExpr186=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr186.getTree());

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
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set188=null;
		ParserRuleReturnScope powExpr187 =null;
		ParserRuleReturnScope powExpr189 =null;

		Object set188_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1562);
			powExpr187=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr187.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Divide||LA35_0==Modulus||LA35_0==Multiply) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set188=input.LT(1);
					set188=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set188), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1578);
					powExpr189=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr189.getTree());

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
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal191=null;
		ParserRuleReturnScope unaryExpr190 =null;
		ParserRuleReturnScope unaryExpr192 =null;

		Object char_literal191_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1594);
			unaryExpr190=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr190.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:16: ( '^' ^ unaryExpr )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Pow) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:17: '^' ^ unaryExpr
					{
					char_literal191=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1597); 
					char_literal191_tree = (Object)adaptor.create(char_literal191);
					root_0 = (Object)adaptor.becomeRoot(char_literal191_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1600);
					unaryExpr192=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr192.getTree());

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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal193=null;
		Token char_literal195=null;
		ParserRuleReturnScope atom194 =null;
		ParserRuleReturnScope atom196 =null;
		ParserRuleReturnScope atom197 =null;

		Object char_literal193_tree=null;
		Object char_literal195_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt37=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt37=1;
				}
				break;
			case Excl:
				{
				alt37=2;
				}
				break;
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Fill:
			case For:
			case Group:
			case HEIGHT_CONSTANT:
			case Hide:
			case Identifier:
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
			case Repeat:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case WIDTH_CONSTANT:
			case Weight:
			case While:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:6: '-' atom
					{
					char_literal193=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1618);  
					stream_Subtract.add(char_literal193);

					pushFollow(FOLLOW_atom_in_unaryExpr1620);
					atom194=atom();
					state._fsp--;

					stream_atom.add(atom194.getTree());
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
					// 207:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:18: ^( UNARY_MIN atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:6: '!' atom
					{
					char_literal195=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1635);  
					stream_Excl.add(char_literal195);

					pushFollow(FOLLOW_atom_in_unaryExpr1637);
					atom196=atom();
					state._fsp--;

					stream_atom.add(atom196.getTree());
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
					// 208:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:18: ^( NEGATE atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1652);
					atom197=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom197.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number198=null;
		Token Bool199=null;
		Token Null200=null;
		Token COLOR_CONSTANT202=null;
		Token PI_CONSTANT203=null;
		Token WIDTH_CONSTANT204=null;
		Token HEIGHT_CONSTANT205=null;
		ParserRuleReturnScope lookup201 =null;

		Object Number198_tree=null;
		Object Bool199_tree=null;
		Object Null200_tree=null;
		Object COLOR_CONSTANT202_tree=null;
		Object PI_CONSTANT203_tree=null;
		Object WIDTH_CONSTANT204_tree=null;
		Object HEIGHT_CONSTANT205_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt38=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt38=1;
				}
				break;
			case Bool:
				{
				alt38=2;
				}
				break;
			case Null:
				{
				alt38=3;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Fill:
			case For:
			case Group:
			case Hide:
			case Identifier:
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
			case Repeat:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Weight:
			case While:
				{
				alt38=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt38=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt38=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt38=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt38=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number198=(Token)match(input,Number,FOLLOW_Number_in_atom1666); 
					Number198_tree = (Object)adaptor.create(Number198);
					adaptor.addChild(root_0, Number198_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool199=(Token)match(input,Bool,FOLLOW_Bool_in_atom1673); 
					Bool199_tree = (Object)adaptor.create(Bool199);
					adaptor.addChild(root_0, Bool199_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null200=(Token)match(input,Null,FOLLOW_Null_in_atom1680); 
					Null200_tree = (Object)adaptor.create(Null200);
					adaptor.addChild(root_0, Null200_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1687);
					lookup201=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup201.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT202=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom1693); 
					COLOR_CONSTANT202_tree = (Object)adaptor.create(COLOR_CONSTANT202);
					adaptor.addChild(root_0, COLOR_CONSTANT202_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT203=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom1699); 
					PI_CONSTANT203_tree = (Object)adaptor.create(PI_CONSTANT203);
					adaptor.addChild(root_0, PI_CONSTANT203_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:219:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT204=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom1705); 
					WIDTH_CONSTANT204_tree = (Object)adaptor.create(WIDTH_CONSTANT204);
					adaptor.addChild(root_0, WIDTH_CONSTANT204_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT205=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom1711); 
					HEIGHT_CONSTANT205_tree = (Object)adaptor.create(HEIGHT_CONSTANT205);
					adaptor.addChild(root_0, HEIGHT_CONSTANT205_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal206=null;
		Token char_literal208=null;
		ParserRuleReturnScope exprList207 =null;

		Object char_literal206_tree=null;
		Object char_literal208_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: '[' ( exprList )? ']'
			{
			char_literal206=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1725);  
			stream_OBracket.add(char_literal206);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:10: ( exprList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Assert||LA39_0==Bool||LA39_0==COLOR_CONSTANT||(LA39_0 >= Copy && LA39_0 <= Curve)||LA39_0==Ellipse||LA39_0==Excl||(LA39_0 >= Fill && LA39_0 <= For)||(LA39_0 >= Group && LA39_0 <= Hide)||LA39_0==Identifier||LA39_0==Line||LA39_0==Move||(LA39_0 >= NoFill && LA39_0 <= Number)||(LA39_0 >= OBracket && LA39_0 <= OParen)||LA39_0==PI_CONSTANT||LA39_0==Polygon||(LA39_0 >= Print && LA39_0 <= Println)||(LA39_0 >= Rect && LA39_0 <= Repeat)||LA39_0==Rotate||(LA39_0 >= Sine && LA39_0 <= Size)||(LA39_0 >= String && LA39_0 <= Subtract)||(LA39_0 >= WIDTH_CONSTANT && LA39_0 <= While)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1727);
					exprList207=exprList();
					state._fsp--;

					stream_exprList.add(exprList207.getTree());
					}
					break;

			}

			char_literal208=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1730);  
			stream_CBracket.add(char_literal208);

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
			// 224:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:34: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | forStatement ( indexes )? -> ^( LOOKUP forStatement ( indexes )? ) | repeatStatement ( indexes )? -> ^( LOOKUP repeatStatement ( indexes )? ) | whileStatement ( indexes )? -> ^( LOOKUP whileStatement ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier213=null;
		Token String215=null;
		Token char_literal217=null;
		Token char_literal219=null;
		ParserRuleReturnScope functionCall209 =null;
		ParserRuleReturnScope indexes210 =null;
		ParserRuleReturnScope list211 =null;
		ParserRuleReturnScope indexes212 =null;
		ParserRuleReturnScope indexes214 =null;
		ParserRuleReturnScope indexes216 =null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope indexes220 =null;
		ParserRuleReturnScope forStatement221 =null;
		ParserRuleReturnScope indexes222 =null;
		ParserRuleReturnScope repeatStatement223 =null;
		ParserRuleReturnScope indexes224 =null;
		ParserRuleReturnScope whileStatement225 =null;
		ParserRuleReturnScope indexes226 =null;

		Object Identifier213_tree=null;
		Object String215_tree=null;
		Object char_literal217_tree=null;
		Object char_literal219_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_repeatStatement=new RewriteRuleSubtreeStream(adaptor,"rule repeatStatement");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_forStatement=new RewriteRuleSubtreeStream(adaptor,"rule forStatement");
		RewriteRuleSubtreeStream stream_whileStatement=new RewriteRuleSubtreeStream(adaptor,"rule whileStatement");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | forStatement ( indexes )? -> ^( LOOKUP forStatement ( indexes )? ) | repeatStatement ( indexes )? -> ^( LOOKUP repeatStatement ( indexes )? ) | whileStatement ( indexes )? -> ^( LOOKUP whileStatement ( indexes )? ) )
			int alt48=8;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA48_1 = input.LA(2);
				if ( (LA48_1==OParen) ) {
					alt48=1;
				}
				else if ( (LA48_1==Add||LA48_1==CBracket||(LA48_1 >= CParen && LA48_1 <= Comma)||(LA48_1 >= Divide && LA48_1 <= Do)||LA48_1==Equals||(LA48_1 >= GT && LA48_1 <= GTEquals)||LA48_1==In||(LA48_1 >= LT && LA48_1 <= LTEquals)||LA48_1==Modulus||LA48_1==Multiply||LA48_1==NEquals||LA48_1==OBracket||LA48_1==Pow||LA48_1==QMark||LA48_1==Subtract||(LA48_1 >= 94 && LA48_1 <= 97)) ) {
					alt48=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
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
			case Fill:
			case Group:
			case Hide:
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
				alt48=1;
				}
				break;
			case OBracket:
				{
				alt48=2;
				}
				break;
			case String:
				{
				alt48=4;
				}
				break;
			case OParen:
				{
				alt48=5;
				}
				break;
			case For:
				{
				alt48=6;
				}
				break;
			case Repeat:
				{
				alt48=7;
				}
				break;
			case While:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:6: functionCall ( indexes )?
					{
					pushFollow(FOLLOW_functionCall_in_lookup1753);
					functionCall209=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall209.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:19: ( indexes )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==OBracket) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:19: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1755);
							indexes210=indexes();
							state._fsp--;

							stream_indexes.add(indexes210.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: functionCall, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 228:34: -> ^( LOOKUP functionCall ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:37: ^( LOOKUP functionCall ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_functionCall.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:59: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1780);
					list211=list();
					state._fsp--;

					stream_list.add(list211.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:11: ( indexes )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==OBracket) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1782);
							indexes212=indexes();
							state._fsp--;

							stream_indexes.add(indexes212.getTree());
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
					// 229:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:51: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:6: Identifier ( indexes )?
					{
					Identifier213=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1815);  
					stream_Identifier.add(Identifier213);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:17: ( indexes )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==OBracket) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1817);
							indexes214=indexes();
							state._fsp--;

							stream_indexes.add(indexes214.getTree());
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
					// 230:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:57: ( indexes )?
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
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:6: String ( indexes )?
					{
					String215=(Token)match(input,String,FOLLOW_String_in_lookup1844);  
					stream_String.add(String215);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:13: ( indexes )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==OBracket) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1846);
							indexes216=indexes();
							state._fsp--;

							stream_indexes.add(indexes216.getTree());
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
					// 231:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:53: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:6: '(' expression ')' ( indexes )?
					{
					char_literal217=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1877);  
					stream_OParen.add(char_literal217);

					pushFollow(FOLLOW_expression_in_lookup1879);
					expression218=expression();
					state._fsp--;

					stream_expression.add(expression218.getTree());
					char_literal219=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1881);  
					stream_CParen.add(char_literal219);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:25: ( indexes )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==OBracket) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1883);
							indexes220=indexes();
							state._fsp--;

							stream_indexes.add(indexes220.getTree());
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
					// 232:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:57: ( indexes )?
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
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:6: forStatement ( indexes )?
					{
					pushFollow(FOLLOW_forStatement_in_lookup1902);
					forStatement221=forStatement();
					state._fsp--;

					stream_forStatement.add(forStatement221.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:19: ( indexes )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==OBracket) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:19: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1904);
							indexes222=indexes();
							state._fsp--;

							stream_indexes.add(indexes222.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, forStatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 233:30: -> ^( LOOKUP forStatement ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:33: ^( LOOKUP forStatement ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_forStatement.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:55: ( indexes )?
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
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:6: repeatStatement ( indexes )?
					{
					pushFollow(FOLLOW_repeatStatement_in_lookup1925);
					repeatStatement223=repeatStatement();
					state._fsp--;

					stream_repeatStatement.add(repeatStatement223.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:22: ( indexes )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==OBracket) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1927);
							indexes224=indexes();
							state._fsp--;

							stream_indexes.add(indexes224.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, repeatStatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 234:32: -> ^( LOOKUP repeatStatement ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:35: ^( LOOKUP repeatStatement ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_repeatStatement.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:60: ( indexes )?
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
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:6: whileStatement ( indexes )?
					{
					pushFollow(FOLLOW_whileStatement_in_lookup1947);
					whileStatement225=whileStatement();
					state._fsp--;

					stream_whileStatement.add(whileStatement225.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:21: ( indexes )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==OBracket) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:21: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1949);
							indexes226=indexes();
							state._fsp--;

							stream_indexes.add(indexes226.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, whileStatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 235:31: -> ^( LOOKUP whileStatement ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:34: ^( LOOKUP whileStatement ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_whileStatement.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:58: ( indexes )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal227=null;
		Token char_literal229=null;
		ParserRuleReturnScope expression228 =null;

		Object char_literal227_tree=null;
		Object char_literal229_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: ( '[' expression ']' )+
			int cnt49=0;
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==OBracket) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:7: '[' expression ']'
					{
					char_literal227=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1977);  
					stream_OBracket.add(char_literal227);

					pushFollow(FOLLOW_expression_in_indexes1979);
					expression228=expression();
					state._fsp--;

					stream_expression.add(expression228.getTree());
					char_literal229=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1981);  
					stream_CBracket.add(char_literal229);

					}
					break;

				default :
					if ( cnt49 >= 1 ) break loop49;
					EarlyExitException eee = new EarlyExitException(49, input);
					throw eee;
				}
				cnt49++;
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
			// 239:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:31: ^( INDEXES ( expression )+ )
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



	public static final BitSet FOLLOW_block_in_parse151 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block171 = new BitSet(new long[]{0x062818A6041E0082L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_functionDecl_in_block175 = new BitSet(new long[]{0x062818A6041E0082L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_Return_in_block180 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_block182 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_block184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement226 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_statement228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement241 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment290 = new BitSet(new long[]{0x4000000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment292 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment295 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_assignment297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall331 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall333 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_functionCall335 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall356 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall358 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_functionCall360 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall382 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall384 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_functionCall386 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall409 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall411 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_functionCall413 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall435 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall437 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_functionCall439 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall497 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall499 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall501 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall524 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall526 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall528 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall551 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall553 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall555 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall578 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall580 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall582 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall603 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall605 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall607 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall641 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall643 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall645 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall667 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall669 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_transformCall671 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall690 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall692 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall694 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall714 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall716 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall718 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall738 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall740 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall742 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall762 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall764 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_transformCall766 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall784 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall786 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_transformCall788 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall806 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall808 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall810 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall830 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall832 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_transformCall834 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall852 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall854 = new BitSet(new long[]{0xDE2808E6440E6480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_transformCall856 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall890 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall892 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_mathCall894 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall915 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall917 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_mathCall919 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement955 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement957 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement960 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_End_in_ifStatement963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat992 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_ifStat994 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_ifStat996 = new BitSet(new long[]{0x062818A6041E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_ifStat998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1022 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1024 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1026 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1028 = new BitSet(new long[]{0x062818A6041E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_elseIfStat1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1054 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_elseStat1056 = new BitSet(new long[]{0x062818A6041E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_elseStat1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1080 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1082 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1084 = new BitSet(new long[]{0x0000080000004000L});
	public static final BitSet FOLLOW_idList_in_functionDecl1086 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1089 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1091 = new BitSet(new long[]{0x062818A6141E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_functionDecl1093 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1117 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1119 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement1121 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_forStatement1123 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_forStatement1125 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_forStatement1127 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_forStatement1129 = new BitSet(new long[]{0x062818A6141E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_forStatement1131 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_End_in_forStatement1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1166 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1168 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1170 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1172 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1174 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1176 = new BitSet(new long[]{0x0000000000800000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_repeatStatement1179 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1181 = new BitSet(new long[]{0x0000000000800000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1185 = new BitSet(new long[]{0x062818A6141E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_repeatStatement1187 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1217 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_whileStatement1219 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1221 = new BitSet(new long[]{0x062818A6141E0080L,0x00000000B0263C68L});
	public static final BitSet FOLLOW_block_in_whileStatement1223 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1249 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList1252 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList1254 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList1279 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList1282 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_exprList1284 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1324 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_QMark_in_condExpr1339 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_condExpr1343 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_condExpr1345 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_condExpr1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1372 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_condExpr1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1426 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_orExpr1429 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_andExpr_in_orExpr1432 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1448 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_andExpr1451 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_equExpr_in_andExpr1454 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1470 = new BitSet(new long[]{0x0100000020000002L});
	public static final BitSet FOLLOW_set_in_equExpr1473 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_relExpr_in_equExpr1482 = new BitSet(new long[]{0x0100000020000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1498 = new BitSet(new long[]{0x0006001800000002L});
	public static final BitSet FOLLOW_set_in_relExpr1501 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_addExpr_in_relExpr1518 = new BitSet(new long[]{0x0006001800000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1534 = new BitSet(new long[]{0x0000000000000022L,0x0000000000400000L});
	public static final BitSet FOLLOW_set_in_addExpr1537 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1546 = new BitSet(new long[]{0x0000000000000022L,0x0000000000400000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1562 = new BitSet(new long[]{0x0050000000400002L});
	public static final BitSet FOLLOW_set_in_mulExpr1565 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1578 = new BitSet(new long[]{0x0050000000400002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_Pow_in_powExpr1597 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1618 = new BitSet(new long[]{0xDE2808E6040E2480L,0x0000000038362C6AL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1635 = new BitSet(new long[]{0xDE2808E6040E2480L,0x0000000038362C6AL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1725 = new BitSet(new long[]{0xDE2808E6440E3480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_exprList_in_list1727 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup1753 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1780 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1815 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1844 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1877 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_lookup1879 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_lookup1881 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_lookup1902 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_lookup1925 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_lookup1947 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1977 = new BitSet(new long[]{0xDE2808E6440E2480L,0x0000000038762C6AL});
	public static final BitSet FOLLOW_expression_in_indexes1979 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1981 = new BitSet(new long[]{0x4000000000000002L});
}
