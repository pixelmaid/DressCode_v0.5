// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-04-11 14:52:29

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
		"GTEquals", "Group", "HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", 
		"Identifier", "If", "In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", 
		"LShape", "LT", "LTEquals", "Line", "Map", "Merge", "MirrorX", "MirrorY", 
		"Modulus", "Move", "Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", 
		"Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", 
		"Point", "Polygon", "Pow", "Print", "Println", "QMark", "Quad", "RETURN", 
		"Random", "Rect", "Repeat", "Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", 
		"Scale", "Sine", "Size", "Space", "String", "Stroke", "Subtract", "TERNARY", 
		"Tan", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", "While", 
		"'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
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
	public static final int Group=54;
	public static final int HEIGHT_CONSTANT=55;
	public static final int Hide=56;
	public static final int ID_LIST=57;
	public static final int IF=58;
	public static final int INDEXES=59;
	public static final int Identifier=60;
	public static final int If=61;
	public static final int In=62;
	public static final int Int=63;
	public static final int LAdd=64;
	public static final int LIST=65;
	public static final int LOOKUP=66;
	public static final int LRemove=67;
	public static final int LShape=68;
	public static final int LT=69;
	public static final int LTEquals=70;
	public static final int Line=71;
	public static final int Map=72;
	public static final int Merge=73;
	public static final int MirrorX=74;
	public static final int MirrorY=75;
	public static final int Modulus=76;
	public static final int Move=77;
	public static final int Multiply=78;
	public static final int NEGATE=79;
	public static final int NEquals=80;
	public static final int NoFill=81;
	public static final int NoStroke=82;
	public static final int Null=83;
	public static final int Number=84;
	public static final int OBrace=85;
	public static final int OBracket=86;
	public static final int OParen=87;
	public static final int Or=88;
	public static final int PI_CONSTANT=89;
	public static final int Point=90;
	public static final int Polygon=91;
	public static final int Pow=92;
	public static final int Print=93;
	public static final int Println=94;
	public static final int QMark=95;
	public static final int Quad=96;
	public static final int RETURN=97;
	public static final int Random=98;
	public static final int Rect=99;
	public static final int Repeat=100;
	public static final int Return=101;
	public static final int Rotate=102;
	public static final int Round=103;
	public static final int SPECIAL=104;
	public static final int STATEMENTS=105;
	public static final int Scale=106;
	public static final int Sine=107;
	public static final int Size=108;
	public static final int Space=109;
	public static final int String=110;
	public static final int Stroke=111;
	public static final int Subtract=112;
	public static final int TERNARY=113;
	public static final int Tan=114;
	public static final int To=115;
	public static final int Triangle=116;
	public static final int UNARY_MIN=117;
	public static final int WIDTH_CONSTANT=118;
	public static final int Weight=119;
	public static final int While=120;

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
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
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
				if ( (LA1_0==ATan||LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||LA1_0==Group||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= MirrorX)||LA1_0==Move||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= Size)||LA1_0==Stroke||LA1_0==Tan||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==122) ) {
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
					char_literal7=(Token)match(input,122,FOLLOW_122_in_block205);  
					stream_122.add(char_literal7);

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
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
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
			case 122:
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
					char_literal9=(Token)match(input,122,FOLLOW_122_in_statement249);  
					stream_122.add(char_literal9);

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
					char_literal11=(Token)match(input,122,FOLLOW_122_in_statement264);  
					stream_122.add(char_literal11);

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
			else if ( (LA5_0==122) ) {
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
					// elements: expression, Identifier, indexes
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
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
					if ( (LA6_0==ATan||LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= Group && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||(LA6_0 >= Line && LA6_0 <= MirrorX)||LA6_0==Move||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= PI_CONSTANT && LA6_0 <= Polygon)||(LA6_0 >= Print && LA6_0 <= Println)||(LA6_0 >= Random && LA6_0 <= Rect)||(LA6_0 >= Rotate && LA6_0 <= Round)||(LA6_0 >= Scale && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==Tan||(LA6_0 >= WIDTH_CONSTANT && LA6_0 <= Weight)) ) {
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
					if ( (LA7_0==ATan||LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= Group && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= MirrorX)||LA7_0==Move||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==Tan||(LA7_0 >= WIDTH_CONSTANT && LA7_0 <= Weight)) ) {
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
					// elements: Print, expression
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
					// elements: expression, Assert
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
					if ( (LA8_0==ATan||LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= Group && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= MirrorX)||LA8_0==Move||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= Size)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==Tan||(LA8_0 >= WIDTH_CONSTANT && LA8_0 <= Weight)) ) {
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
					if ( (LA9_0==ATan||LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= Group && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= MirrorX)||LA9_0==Move||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||LA9_0==Tan||(LA9_0 >= WIDTH_CONSTANT && LA9_0 <= Weight)) ) {
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
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
		Token Point75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		ParserRuleReturnScope exprList53 =null;
		ParserRuleReturnScope exprList57 =null;
		ParserRuleReturnScope exprList61 =null;
		ParserRuleReturnScope exprList65 =null;
		ParserRuleReturnScope exprList69 =null;
		ParserRuleReturnScope exprList73 =null;
		ParserRuleReturnScope exprList77 =null;

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
		Object Point75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse51=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall574);  
					stream_Ellipse.add(Ellipse51);

					char_literal52=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall576);  
					stream_OParen.add(char_literal52);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:17: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ATan||LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= Group && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||(LA11_0 >= Line && LA11_0 <= MirrorX)||LA11_0==Move||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= PI_CONSTANT && LA11_0 <= Polygon)||(LA11_0 >= Print && LA11_0 <= Println)||(LA11_0 >= Random && LA11_0 <= Rect)||(LA11_0 >= Rotate && LA11_0 <= Round)||(LA11_0 >= Scale && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==Tan||(LA11_0 >= WIDTH_CONSTANT && LA11_0 <= Weight)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall578);
							exprList53=exprList();
							state._fsp--;

							stream_exprList.add(exprList53.getTree());
							}
							break;

					}

					char_literal54=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall581);  
					stream_CParen.add(char_literal54);

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
					// 110:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:56: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:5: Line '(' ( exprList )? ')'
					{
					Line55=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall601);  
					stream_Line.add(Line55);

					char_literal56=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall603);  
					stream_OParen.add(char_literal56);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:14: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= Group && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= MirrorX)||LA12_0==Move||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||LA12_0==Tan||(LA12_0 >= WIDTH_CONSTANT && LA12_0 <= Weight)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall605);
							exprList57=exprList();
							state._fsp--;

							stream_exprList.add(exprList57.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall608);  
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
					// 111:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:5: Rect '(' ( exprList )? ')'
					{
					Rect59=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall628);  
					stream_Rect.add(Rect59);

					char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall630);  
					stream_OParen.add(char_literal60);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= Group && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= MirrorX)||LA13_0==Move||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||LA13_0==Tan||(LA13_0 >= WIDTH_CONSTANT && LA13_0 <= Weight)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall632);
							exprList61=exprList();
							state._fsp--;

							stream_exprList.add(exprList61.getTree());
							}
							break;

					}

					char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall635);  
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
					// 112:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
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
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:5: Curve '(' ( exprList )? ')'
					{
					Curve63=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall655);  
					stream_Curve.add(Curve63);

					char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall657);  
					stream_OParen.add(char_literal64);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:15: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= Group && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= MirrorX)||LA14_0==Move||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= Size)||(LA14_0 >= String && LA14_0 <= Subtract)||LA14_0==Tan||(LA14_0 >= WIDTH_CONSTANT && LA14_0 <= Weight)) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall659);
							exprList65=exprList();
							state._fsp--;

							stream_exprList.add(exprList65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall662);  
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
					// 113:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:5: Polygon '(' ( exprList )? ')'
					{
					Polygon67=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall680);  
					stream_Polygon.add(Polygon67);

					char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall682);  
					stream_OParen.add(char_literal68);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= Group && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= MirrorX)||LA15_0==Move||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||LA15_0==Tan||(LA15_0 >= WIDTH_CONSTANT && LA15_0 <= Weight)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall684);
							exprList69=exprList();
							state._fsp--;

							stream_exprList.add(exprList69.getTree());
							}
							break;

					}

					char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall687);  
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
					// 114:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:5: LShape '(' ( exprList )? ')'
					{
					LShape71=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall705);  
					stream_LShape.add(LShape71);

					char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall707);  
					stream_OParen.add(char_literal72);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:16: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= Group && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= MirrorX)||LA16_0==Move||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||LA16_0==Tan||(LA16_0 >= WIDTH_CONSTANT && LA16_0 <= Weight)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall709);
							exprList73=exprList();
							state._fsp--;

							stream_exprList.add(exprList73.getTree());
							}
							break;

					}

					char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall712);  
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
					// 115:30: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:34: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:53: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:6: Point '(' ( exprList )? ')'
					{
					Point75=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall731);  
					stream_Point.add(Point75);

					char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall733);  
					stream_OParen.add(char_literal76);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||LA17_0==Fill||(LA17_0 >= Group && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= MirrorX)||LA17_0==Move||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= Size)||(LA17_0 >= String && LA17_0 <= Subtract)||LA17_0==Tan||(LA17_0 >= WIDTH_CONSTANT && LA17_0 <= Weight)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall735);
							exprList77=exprList();
							state._fsp--;

							stream_exprList.add(exprList77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall738);  
					stream_CParen.add(char_literal78);

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
					// 116:30: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:34: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token Copy83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token Rotate87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		Token Fill91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token Stroke95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token NoFill99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token NoStroke103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token Weight107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		Token Hide111=null;
		Token char_literal112=null;
		Token char_literal114=null;
		Token Group115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		Token Expand119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token Merge123=null;
		Token char_literal124=null;
		Token char_literal126=null;
		Token Scale127=null;
		Token char_literal128=null;
		Token char_literal130=null;
		Token MirrorX131=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope exprList81 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope exprList89 =null;
		ParserRuleReturnScope exprList93 =null;
		ParserRuleReturnScope exprList97 =null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope exprList109 =null;
		ParserRuleReturnScope expression113 =null;
		ParserRuleReturnScope exprList117 =null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope exprList129 =null;
		ParserRuleReturnScope expression133 =null;

		Object Move79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object Copy83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object Rotate87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object Fill91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object Stroke95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object NoFill99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object NoStroke103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object Weight107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		Object Hide111_tree=null;
		Object char_literal112_tree=null;
		Object char_literal114_tree=null;
		Object Group115_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		Object Expand119_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object Merge123_tree=null;
		Object char_literal124_tree=null;
		Object char_literal126_tree=null;
		Object Scale127_tree=null;
		Object char_literal128_tree=null;
		Object char_literal130_tree=null;
		Object MirrorX131_tree=null;
		Object char_literal132_tree=null;
		Object char_literal134_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) )
			int alt26=14;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt26=1;
				}
				break;
			case Copy:
				{
				alt26=2;
				}
				break;
			case Rotate:
				{
				alt26=3;
				}
				break;
			case Fill:
				{
				alt26=4;
				}
				break;
			case Stroke:
				{
				alt26=5;
				}
				break;
			case NoFill:
				{
				alt26=6;
				}
				break;
			case NoStroke:
				{
				alt26=7;
				}
				break;
			case Weight:
				{
				alt26=8;
				}
				break;
			case Hide:
				{
				alt26=9;
				}
				break;
			case Group:
				{
				alt26=10;
				}
				break;
			case Expand:
				{
				alt26=11;
				}
				break;
			case Merge:
				{
				alt26=12;
				}
				break;
			case Scale:
				{
				alt26=13;
				}
				break;
			case MirrorX:
				{
				alt26=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:6: Move '(' ( exprList )? ')'
					{
					Move79=(Token)match(input,Move,FOLLOW_Move_in_transformCall769);  
					stream_Move.add(Move79);

					char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall771);  
					stream_OParen.add(char_literal80);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:15: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= Group && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= MirrorX)||LA19_0==Move||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= Weight)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall773);
							exprList81=exprList();
							state._fsp--;

							stream_exprList.add(exprList81.getTree());
							}
							break;

					}

					char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall776);  
					stream_CParen.add(char_literal82);

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
					// 120:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:6: Copy '(' expression ')'
					{
					Copy83=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall795);  
					stream_Copy.add(Copy83);

					char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall797);  
					stream_OParen.add(char_literal84);

					pushFollow(FOLLOW_expression_in_transformCall799);
					expression85=expression();
					state._fsp--;

					stream_expression.add(expression85.getTree());
					char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall801);  
					stream_CParen.add(char_literal86);

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
					// 121:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:33: ^( FUNC_CALL Copy expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:6: Rotate '(' ( exprList )? ')'
					{
					Rotate87=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall818);  
					stream_Rotate.add(Rotate87);

					char_literal88=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall820);  
					stream_OParen.add(char_literal88);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ATan||LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||LA20_0==Fill||(LA20_0 >= Group && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= MirrorX)||LA20_0==Move||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Polygon)||(LA20_0 >= Print && LA20_0 <= Println)||(LA20_0 >= Random && LA20_0 <= Rect)||(LA20_0 >= Rotate && LA20_0 <= Round)||(LA20_0 >= Scale && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||LA20_0==Tan||(LA20_0 >= WIDTH_CONSTANT && LA20_0 <= Weight)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall822);
							exprList89=exprList();
							state._fsp--;

							stream_exprList.add(exprList89.getTree());
							}
							break;

					}

					char_literal90=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall825);  
					stream_CParen.add(char_literal90);

					// AST REWRITE
					// elements: exprList, Rotate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:6: Fill '(' ( exprList )? ')'
					{
					Fill91=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall842);  
					stream_Fill.add(Fill91);

					char_literal92=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall844);  
					stream_OParen.add(char_literal92);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ATan||LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= Group && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= MirrorX)||LA21_0==Move||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||(LA21_0 >= Random && LA21_0 <= Rect)||(LA21_0 >= Rotate && LA21_0 <= Round)||(LA21_0 >= Scale && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||LA21_0==Tan||(LA21_0 >= WIDTH_CONSTANT && LA21_0 <= Weight)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall846);
							exprList93=exprList();
							state._fsp--;

							stream_exprList.add(exprList93.getTree());
							}
							break;

					}

					char_literal94=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall849);  
					stream_CParen.add(char_literal94);

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
					// 123:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:6: Stroke '(' ( exprList )? ')'
					{
					Stroke95=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall866);  
					stream_Stroke.add(Stroke95);

					char_literal96=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall868);  
					stream_OParen.add(char_literal96);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= Group && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= MirrorX)||LA22_0==Move||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= WIDTH_CONSTANT && LA22_0 <= Weight)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall870);
							exprList97=exprList();
							state._fsp--;

							stream_exprList.add(exprList97.getTree());
							}
							break;

					}

					char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall873);  
					stream_CParen.add(char_literal98);

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
					// 124:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:6: NoFill '(' expression ')'
					{
					NoFill99=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall890);  
					stream_NoFill.add(NoFill99);

					char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall892);  
					stream_OParen.add(char_literal100);

					pushFollow(FOLLOW_expression_in_transformCall894);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());
					char_literal102=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall896);  
					stream_CParen.add(char_literal102);

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
					// 125:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:34: ^( FUNC_CALL NoFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:6: NoStroke '(' expression ')'
					{
					NoStroke103=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall912);  
					stream_NoStroke.add(NoStroke103);

					char_literal104=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall914);  
					stream_OParen.add(char_literal104);

					pushFollow(FOLLOW_expression_in_transformCall916);
					expression105=expression();
					state._fsp--;

					stream_expression.add(expression105.getTree());
					char_literal106=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall918);  
					stream_CParen.add(char_literal106);

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
					// 126:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:36: ^( FUNC_CALL NoStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: Weight '(' ( exprList )? ')'
					{
					Weight107=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall934);  
					stream_Weight.add(Weight107);

					char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall936);  
					stream_OParen.add(char_literal108);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= Group && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= MirrorX)||LA23_0==Move||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= WIDTH_CONSTANT && LA23_0 <= Weight)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall938);
							exprList109=exprList();
							state._fsp--;

							stream_exprList.add(exprList109.getTree());
							}
							break;

					}

					char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall941);  
					stream_CParen.add(char_literal110);

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
					// 127:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
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
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: Hide '(' expression ')'
					{
					Hide111=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall958);  
					stream_Hide.add(Hide111);

					char_literal112=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall960);  
					stream_OParen.add(char_literal112);

					pushFollow(FOLLOW_expression_in_transformCall962);
					expression113=expression();
					state._fsp--;

					stream_expression.add(expression113.getTree());
					char_literal114=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall964);  
					stream_CParen.add(char_literal114);

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
					// 128:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:32: ^( FUNC_CALL Hide expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: Group '(' ( exprList )? ')'
					{
					Group115=(Token)match(input,Group,FOLLOW_Group_in_transformCall980);  
					stream_Group.add(Group115);

					char_literal116=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall982);  
					stream_OParen.add(char_literal116);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:16: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= Group && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= MirrorX)||LA24_0==Move||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= Size)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= WIDTH_CONSTANT && LA24_0 <= Weight)) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall984);
							exprList117=exprList();
							state._fsp--;

							stream_exprList.add(exprList117.getTree());
							}
							break;

					}

					char_literal118=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall987);  
					stream_CParen.add(char_literal118);

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
					// 129:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Expand '(' expression ')'
					{
					Expand119=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1004);  
					stream_Expand.add(Expand119);

					char_literal120=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1006);  
					stream_OParen.add(char_literal120);

					pushFollow(FOLLOW_expression_in_transformCall1008);
					expression121=expression();
					state._fsp--;

					stream_expression.add(expression121.getTree());
					char_literal122=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1010);  
					stream_CParen.add(char_literal122);

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
					// 130:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:34: ^( FUNC_CALL Expand expression )
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
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: Merge '(' expression ')'
					{
					Merge123=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1026);  
					stream_Merge.add(Merge123);

					char_literal124=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1028);  
					stream_OParen.add(char_literal124);

					pushFollow(FOLLOW_expression_in_transformCall1030);
					expression125=expression();
					state._fsp--;

					stream_expression.add(expression125.getTree());
					char_literal126=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1032);  
					stream_CParen.add(char_literal126);

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
					// 131:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:33: ^( FUNC_CALL Merge expression )
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
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Scale '(' ( exprList )? ')'
					{
					Scale127=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1048);  
					stream_Scale.add(Scale127);

					char_literal128=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1050);  
					stream_OParen.add(char_literal128);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:16: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||LA25_0==Assert||LA25_0==Bool||LA25_0==COLOR_CONSTANT||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||LA25_0==Fill||(LA25_0 >= Group && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= MirrorX)||LA25_0==Move||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= Size)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= WIDTH_CONSTANT && LA25_0 <= Weight)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1052);
							exprList129=exprList();
							state._fsp--;

							stream_exprList.add(exprList129.getTree());
							}
							break;

					}

					char_literal130=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1055);  
					stream_CParen.add(char_literal130);

					// AST REWRITE
					// elements: exprList, Scale
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:32: ^( FUNC_CALL Scale ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
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
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: MirrorX '(' expression ')'
					{
					MirrorX131=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1072);  
					stream_MirrorX.add(MirrorX131);

					char_literal132=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1074);  
					stream_OParen.add(char_literal132);

					pushFollow(FOLLOW_expression_in_transformCall1076);
					expression133=expression();
					state._fsp--;

					stream_expression.add(expression133.getTree());
					char_literal134=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1078);  
					stream_CParen.add(char_literal134);

					// AST REWRITE
					// elements: MirrorX, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:35: ^( FUNC_CALL MirrorX expression )
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


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		Token Sine139=null;
		Token char_literal140=null;
		Token char_literal142=null;
		Token Tan143=null;
		Token char_literal144=null;
		Token char_literal146=null;
		Token ATan147=null;
		Token char_literal148=null;
		Token char_literal150=null;
		Token Random151=null;
		Token char_literal152=null;
		Token char_literal154=null;
		Token Round155=null;
		Token char_literal156=null;
		Token char_literal158=null;
		Token Map159=null;
		Token char_literal160=null;
		Token char_literal162=null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression141 =null;
		ParserRuleReturnScope expression145 =null;
		ParserRuleReturnScope expression149 =null;
		ParserRuleReturnScope exprList153 =null;
		ParserRuleReturnScope expression157 =null;
		ParserRuleReturnScope exprList161 =null;

		Object Cosine135_tree=null;
		Object char_literal136_tree=null;
		Object char_literal138_tree=null;
		Object Sine139_tree=null;
		Object char_literal140_tree=null;
		Object char_literal142_tree=null;
		Object Tan143_tree=null;
		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		Object ATan147_tree=null;
		Object char_literal148_tree=null;
		Object char_literal150_tree=null;
		Object Random151_tree=null;
		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		Object Round155_tree=null;
		Object char_literal156_tree=null;
		Object char_literal158_tree=null;
		Object Map159_tree=null;
		Object char_literal160_tree=null;
		Object char_literal162_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) )
			int alt29=7;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt29=1;
				}
				break;
			case Sine:
				{
				alt29=2;
				}
				break;
			case Tan:
				{
				alt29=3;
				}
				break;
			case ATan:
				{
				alt29=4;
				}
				break;
			case Random:
				{
				alt29=5;
				}
				break;
			case Round:
				{
				alt29=6;
				}
				break;
			case Map:
				{
				alt29=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: Cosine '(' expression ')'
					{
					Cosine135=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1112);  
					stream_Cosine.add(Cosine135);

					char_literal136=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1114);  
					stream_OParen.add(char_literal136);

					pushFollow(FOLLOW_expression_in_mathCall1116);
					expression137=expression();
					state._fsp--;

					stream_expression.add(expression137.getTree());
					char_literal138=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1118);  
					stream_CParen.add(char_literal138);

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
					// 138:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:6: Sine '(' expression ')'
					{
					Sine139=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1137);  
					stream_Sine.add(Sine139);

					char_literal140=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1139);  
					stream_OParen.add(char_literal140);

					pushFollow(FOLLOW_expression_in_mathCall1141);
					expression141=expression();
					state._fsp--;

					stream_expression.add(expression141.getTree());
					char_literal142=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1143);  
					stream_CParen.add(char_literal142);

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
					// 139:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:35: ^( FUNC_CALL Sine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: Tan '(' expression ')'
					{
					Tan143=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1162);  
					stream_Tan.add(Tan143);

					char_literal144=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1164);  
					stream_OParen.add(char_literal144);

					pushFollow(FOLLOW_expression_in_mathCall1166);
					expression145=expression();
					state._fsp--;

					stream_expression.add(expression145.getTree());
					char_literal146=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1168);  
					stream_CParen.add(char_literal146);

					// AST REWRITE
					// elements: expression, Tan
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:34: ^( FUNC_CALL Tan expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:6: ATan '(' expression ')'
					{
					ATan147=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1187);  
					stream_ATan.add(ATan147);

					char_literal148=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1189);  
					stream_OParen.add(char_literal148);

					pushFollow(FOLLOW_expression_in_mathCall1191);
					expression149=expression();
					state._fsp--;

					stream_expression.add(expression149.getTree());
					char_literal150=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1193);  
					stream_CParen.add(char_literal150);

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
					// 141:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:35: ^( FUNC_CALL ATan expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Random '(' ( exprList )? ')'
					{
					Random151=(Token)match(input,Random,FOLLOW_Random_in_mathCall1212);  
					stream_Random.add(Random151);

					char_literal152=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1214);  
					stream_OParen.add(char_literal152);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:17: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||LA27_0==Assert||LA27_0==Bool||LA27_0==COLOR_CONSTANT||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||LA27_0==Fill||(LA27_0 >= Group && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= MirrorX)||LA27_0==Move||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Polygon)||(LA27_0 >= Print && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= Size)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==Tan||(LA27_0 >= WIDTH_CONSTANT && LA27_0 <= Weight)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1216);
							exprList153=exprList();
							state._fsp--;

							stream_exprList.add(exprList153.getTree());
							}
							break;

					}

					char_literal154=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1219);  
					stream_CParen.add(char_literal154);

					// AST REWRITE
					// elements: exprList, Random
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:36: ^( FUNC_CALL Random ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:6: Round '(' expression ')'
					{
					Round155=(Token)match(input,Round,FOLLOW_Round_in_mathCall1239);  
					stream_Round.add(Round155);

					char_literal156=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1240);  
					stream_OParen.add(char_literal156);

					pushFollow(FOLLOW_expression_in_mathCall1242);
					expression157=expression();
					state._fsp--;

					stream_expression.add(expression157.getTree());
					char_literal158=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1244);  
					stream_CParen.add(char_literal158);

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
					// 143:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:35: ^( FUNC_CALL Round expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: Map '(' ( exprList )? ')'
					{
					Map159=(Token)match(input,Map,FOLLOW_Map_in_mathCall1263);  
					stream_Map.add(Map159);

					char_literal160=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1264);  
					stream_OParen.add(char_literal160);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:13: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||LA28_0==Assert||LA28_0==Bool||LA28_0==COLOR_CONSTANT||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||LA28_0==Fill||(LA28_0 >= Group && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= MirrorX)||LA28_0==Move||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= Size)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= WIDTH_CONSTANT && LA28_0 <= Weight)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1266);
							exprList161=exprList();
							state._fsp--;

							stream_exprList.add(exprList161.getTree());
							}
							break;

					}

					char_literal162=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1269);  
					stream_CParen.add(char_literal162);

					// AST REWRITE
					// elements: exprList, Map
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:32: ^( FUNC_CALL Map ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:48: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End166=null;
		ParserRuleReturnScope ifStat163 =null;
		ParserRuleReturnScope elseIfStat164 =null;
		ParserRuleReturnScope elseStat165 =null;

		Object End166_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1304);
			ifStat163=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat163.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:13: ( elseIfStat )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Else) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==If) ) {
						alt30=1;
					}

				}

				switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1306);
					elseIfStat164=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat164.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:25: ( elseStat )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Else) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1309);
					elseStat165=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat165.getTree());
					}
					break;

			}

			End166=(Token)match(input,End,FOLLOW_End_in_ifStatement1312);  
			stream_End.add(End166);

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
			// 150:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:66: ( elseStat )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If167=null;
		Token Do169=null;
		ParserRuleReturnScope expression168 =null;
		ParserRuleReturnScope block170 =null;

		Object If167_tree=null;
		Object Do169_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:6: If expression Do block
			{
			If167=(Token)match(input,If,FOLLOW_If_in_ifStat1341);  
			stream_If.add(If167);

			pushFollow(FOLLOW_expression_in_ifStat1343);
			expression168=expression();
			state._fsp--;

			stream_expression.add(expression168.getTree());
			Do169=(Token)match(input,Do,FOLLOW_Do_in_ifStat1345);  
			stream_Do.add(Do169);

			pushFollow(FOLLOW_block_in_ifStat1347);
			block170=block();
			state._fsp--;

			stream_block.add(block170.getTree());
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
			// 155:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:32: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else171=null;
		Token If172=null;
		Token Do174=null;
		ParserRuleReturnScope expression173 =null;
		ParserRuleReturnScope block175 =null;

		Object Else171_tree=null;
		Object If172_tree=null;
		Object Do174_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:6: Else If expression Do block
			{
			Else171=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1371);  
			stream_Else.add(Else171);

			If172=(Token)match(input,If,FOLLOW_If_in_elseIfStat1373);  
			stream_If.add(If172);

			pushFollow(FOLLOW_expression_in_elseIfStat1375);
			expression173=expression();
			state._fsp--;

			stream_expression.add(expression173.getTree());
			Do174=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1377);  
			stream_Do.add(Do174);

			pushFollow(FOLLOW_block_in_elseIfStat1379);
			block175=block();
			state._fsp--;

			stream_block.add(block175.getTree());
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
			// 159:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:37: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else176=null;
		Token Do177=null;
		ParserRuleReturnScope block178 =null;

		Object Else176_tree=null;
		Object Do177_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:6: Else Do block
			{
			Else176=(Token)match(input,Else,FOLLOW_Else_in_elseStat1403);  
			stream_Else.add(Else176);

			Do177=(Token)match(input,Do,FOLLOW_Do_in_elseStat1405);  
			stream_Do.add(Do177);

			pushFollow(FOLLOW_block_in_elseStat1407);
			block178=block();
			state._fsp--;

			stream_block.add(block178.getTree());
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
			// 163:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:23: ^( EXP block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def179=null;
		Token Identifier180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token Do184=null;
		Token End186=null;
		ParserRuleReturnScope idList182 =null;
		ParserRuleReturnScope block185 =null;

		Object Def179_tree=null;
		Object Identifier180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		Object Do184_tree=null;
		Object End186_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def179=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1429); 
			Def179_tree = (Object)adaptor.create(Def179);
			adaptor.addChild(root_0, Def179_tree);

			Identifier180=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1431); 
			Identifier180_tree = (Object)adaptor.create(Identifier180);
			adaptor.addChild(root_0, Identifier180_tree);

			char_literal181=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1433); 
			char_literal181_tree = (Object)adaptor.create(char_literal181);
			adaptor.addChild(root_0, char_literal181_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:25: ( idList )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Identifier) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1435);
					idList182=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList182.getTree());

					}
					break;

			}

			char_literal183=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1438); 
			char_literal183_tree = (Object)adaptor.create(char_literal183);
			adaptor.addChild(root_0, char_literal183_tree);

			Do184=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1440); 
			Do184_tree = (Object)adaptor.create(Do184);
			adaptor.addChild(root_0, Do184_tree);

			pushFollow(FOLLOW_block_in_functionDecl1442);
			block185=block();
			state._fsp--;

			adaptor.addChild(root_0, block185.getTree());

			End186=(Token)match(input,End,FOLLOW_End_in_functionDecl1444); 
			End186_tree = (Object)adaptor.create(End186);
			adaptor.addChild(root_0, End186_tree);

			defineFunction((Identifier180!=null?Identifier180.getText():null), (idList182!=null?((Object)idList182.getTree()):null), (block185!=null?((Object)block185.getTree()):null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For187=null;
		Token Identifier188=null;
		Token char_literal189=null;
		Token Do191=null;
		Token Do193=null;
		Token End195=null;
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope expression192 =null;
		ParserRuleReturnScope block194 =null;

		Object For187_tree=null;
		Object Identifier188_tree=null;
		Object char_literal189_tree=null;
		Object Do191_tree=null;
		Object Do193_tree=null;
		Object End195_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:172:6: For Identifier '=' expression Do expression Do block End
			{
			For187=(Token)match(input,For,FOLLOW_For_in_forStatement1466);  
			stream_For.add(For187);

			Identifier188=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1468);  
			stream_Identifier.add(Identifier188);

			char_literal189=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1470);  
			stream_Assign.add(char_literal189);

			pushFollow(FOLLOW_expression_in_forStatement1472);
			expression190=expression();
			state._fsp--;

			stream_expression.add(expression190.getTree());
			Do191=(Token)match(input,Do,FOLLOW_Do_in_forStatement1474);  
			stream_Do.add(Do191);

			pushFollow(FOLLOW_expression_in_forStatement1476);
			expression192=expression();
			state._fsp--;

			stream_expression.add(expression192.getTree());
			Do193=(Token)match(input,Do,FOLLOW_Do_in_forStatement1478);  
			stream_Do.add(Do193);

			pushFollow(FOLLOW_block_in_forStatement1480);
			block194=block();
			state._fsp--;

			stream_block.add(block194.getTree());
			End195=(Token)match(input,End,FOLLOW_End_in_forStatement1482);  
			stream_End.add(End195);

			// AST REWRITE
			// elements: For, Identifier, expression, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:9: ^( For Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat196=null;
		Token Identifier197=null;
		Token char_literal198=null;
		Token Do200=null;
		Token char_literal202=null;
		Token Do204=null;
		Token End206=null;
		ParserRuleReturnScope expression199 =null;
		ParserRuleReturnScope expression201 =null;
		ParserRuleReturnScope expression203 =null;
		ParserRuleReturnScope block205 =null;

		Object Repeat196_tree=null;
		Object Identifier197_tree=null;
		Object char_literal198_tree=null;
		Object Do200_tree=null;
		Object char_literal202_tree=null;
		Object Do204_tree=null;
		Object End206_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat196=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1515);  
			stream_Repeat.add(Repeat196);

			Identifier197=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1517);  
			stream_Identifier.add(Identifier197);

			char_literal198=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1519);  
			stream_Assign.add(char_literal198);

			pushFollow(FOLLOW_expression_in_repeatStatement1521);
			expression199=expression();
			state._fsp--;

			stream_expression.add(expression199.getTree());
			Do200=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1523);  
			stream_Do.add(Do200);

			pushFollow(FOLLOW_expression_in_repeatStatement1525);
			expression201=expression();
			state._fsp--;

			stream_expression.add(expression201.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:52: ( '|' expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==123) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:53: '|' expression
					{
					char_literal202=(Token)match(input,123,FOLLOW_123_in_repeatStatement1528);  
					stream_123.add(char_literal202);

					pushFollow(FOLLOW_expression_in_repeatStatement1530);
					expression203=expression();
					state._fsp--;

					stream_expression.add(expression203.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			Do204=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1534);  
			stream_Do.add(Do204);

			pushFollow(FOLLOW_block_in_repeatStatement1536);
			block205=block();
			state._fsp--;

			stream_block.add(block205.getTree());
			End206=(Token)match(input,End,FOLLOW_End_in_repeatStatement1538);  
			stream_End.add(End206);

			// AST REWRITE
			// elements: expression, block, expression, Repeat, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 177:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:86: ^( Repeat Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While207=null;
		Token Do209=null;
		Token End211=null;
		ParserRuleReturnScope expression208 =null;
		ParserRuleReturnScope block210 =null;

		Object While207_tree=null;
		Object Do209_tree=null;
		Object End211_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:6: While expression Do block End
			{
			While207=(Token)match(input,While,FOLLOW_While_in_whileStatement1566);  
			stream_While.add(While207);

			pushFollow(FOLLOW_expression_in_whileStatement1568);
			expression208=expression();
			state._fsp--;

			stream_expression.add(expression208.getTree());
			Do209=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1570);  
			stream_Do.add(Do209);

			pushFollow(FOLLOW_block_in_whileStatement1572);
			block210=block();
			state._fsp--;

			stream_block.add(block210.getTree());
			End211=(Token)match(input,End,FOLLOW_End_in_whileStatement1574);  
			stream_End.add(End211);

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
			// 181:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:39: ^( While expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier212=null;
		Token char_literal213=null;
		Token Identifier214=null;

		Object Identifier212_tree=null;
		Object char_literal213_tree=null;
		Object Identifier214_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:6: Identifier ( ',' Identifier )*
			{
			Identifier212=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1598);  
			stream_Identifier.add(Identifier212);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:17: ( ',' Identifier )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==Comma) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:18: ',' Identifier
					{
					char_literal213=(Token)match(input,Comma,FOLLOW_Comma_in_idList1601);  
					stream_Comma.add(char_literal213);

					Identifier214=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1603);  
					stream_Identifier.add(Identifier214);

					}
					break;

				default :
					break loop34;
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
			// 185:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal216=null;
		ParserRuleReturnScope expression215 =null;
		ParserRuleReturnScope expression217 =null;

		Object char_literal216_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1628);
			expression215=expression();
			state._fsp--;

			stream_expression.add(expression215.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:17: ( ',' expression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Comma) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:18: ',' expression
					{
					char_literal216=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1631);  
					stream_Comma.add(char_literal216);

					pushFollow(FOLLOW_expression_in_exprList1633);
					expression217=expression();
					state._fsp--;

					stream_expression.add(expression217.getTree());
					}
					break;

				default :
					break loop35;
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
			// 189:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr218 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression1658);
			condExpr218=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr218.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal220=null;
		Token char_literal221=null;
		Token In222=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr219 =null;
		ParserRuleReturnScope expression223 =null;

		Object char_literal220_tree=null;
		Object char_literal221_tree=null;
		Object In222_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1673);
			orExpr219=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr219.getTree());
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
			// 197:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==QMark) ) {
				alt36=1;
			}
			else if ( (LA36_0==In) ) {
				alt36=2;
			}
			switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:8: '?' a= expression ':' b= expression
					{
					char_literal220=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1688);  
					stream_QMark.add(char_literal220);

					pushFollow(FOLLOW_expression_in_condExpr1692);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal221=(Token)match(input,Do,FOLLOW_Do_in_condExpr1694);  
					stream_Do.add(char_literal221);

					pushFollow(FOLLOW_expression_in_condExpr1698);
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
					// 198:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:45: ^( TERNARY orExpr $a $b)
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:8: In expression
					{
					In222=(Token)match(input,In,FOLLOW_In_in_condExpr1721);  
					stream_In.add(In222);

					pushFollow(FOLLOW_expression_in_condExpr1723);
					expression223=expression();
					state._fsp--;

					stream_expression.add(expression223.getTree());
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
					// 199:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:45: ^( In orExpr expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal225=null;
		ParserRuleReturnScope andExpr224 =null;
		ParserRuleReturnScope andExpr226 =null;

		Object string_literal225_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1775);
			andExpr224=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr224.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:14: ( '||' ^ andExpr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==124) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:15: '||' ^ andExpr
					{
					string_literal225=(Token)match(input,124,FOLLOW_124_in_orExpr1778); 
					string_literal225_tree = (Object)adaptor.create(string_literal225);
					root_0 = (Object)adaptor.becomeRoot(string_literal225_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1781);
					andExpr226=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr226.getTree());

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
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal228=null;
		ParserRuleReturnScope equExpr227 =null;
		ParserRuleReturnScope equExpr229 =null;

		Object string_literal228_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1797);
			equExpr227=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr227.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:14: ( '&&' ^ equExpr )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==121) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:15: '&&' ^ equExpr
					{
					string_literal228=(Token)match(input,121,FOLLOW_121_in_andExpr1800); 
					string_literal228_tree = (Object)adaptor.create(string_literal228);
					root_0 = (Object)adaptor.becomeRoot(string_literal228_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1803);
					equExpr229=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr229.getTree());

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
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set231=null;
		ParserRuleReturnScope relExpr230 =null;
		ParserRuleReturnScope relExpr232 =null;

		Object set231_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1819);
			relExpr230=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr230.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Equals||LA39_0==NEquals) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:15: ( '==' | '!=' ) ^ relExpr
					{
					set231=input.LT(1);
					set231=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set231), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1831);
					relExpr232=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr232.getTree());

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
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set234=null;
		ParserRuleReturnScope addExpr233 =null;
		ParserRuleReturnScope addExpr235 =null;

		Object set234_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1847);
			addExpr233=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr233.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= GT && LA40_0 <= GTEquals)||(LA40_0 >= LT && LA40_0 <= LTEquals)) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set234=input.LT(1);
					set234=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set234), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1867);
					addExpr235=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr235.getTree());

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
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:219:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set237=null;
		ParserRuleReturnScope mulExpr236 =null;
		ParserRuleReturnScope mulExpr238 =null;

		Object set237_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1883);
			mulExpr236=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr236.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==Add||LA41_0==Subtract) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:15: ( '+' | '-' ) ^ mulExpr
					{
					set237=input.LT(1);
					set237=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set237), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1895);
					mulExpr238=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr238.getTree());

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
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set240=null;
		ParserRuleReturnScope powExpr239 =null;
		ParserRuleReturnScope powExpr241 =null;

		Object set240_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1911);
			powExpr239=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr239.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==Divide||LA42_0==Modulus||LA42_0==Multiply) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set240=input.LT(1);
					set240=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set240), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1927);
					powExpr241=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr241.getTree());

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
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal243=null;
		ParserRuleReturnScope unaryExpr242 =null;
		ParserRuleReturnScope unaryExpr244 =null;

		Object char_literal243_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1943);
			unaryExpr242=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr242.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:16: ( '^' ^ unaryExpr )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==Pow) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:17: '^' ^ unaryExpr
					{
					char_literal243=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1946); 
					char_literal243_tree = (Object)adaptor.create(char_literal243);
					root_0 = (Object)adaptor.becomeRoot(char_literal243_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1949);
					unaryExpr244=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr244.getTree());

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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal245=null;
		Token char_literal247=null;
		ParserRuleReturnScope atom246 =null;
		ParserRuleReturnScope atom248 =null;
		ParserRuleReturnScope atom249 =null;

		Object char_literal245_tree=null;
		Object char_literal247_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt44=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt44=1;
				}
				break;
			case Excl:
				{
				alt44=2;
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
				alt44=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:6: '-' atom
					{
					char_literal245=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1967);  
					stream_Subtract.add(char_literal245);

					pushFollow(FOLLOW_atom_in_unaryExpr1969);
					atom246=atom();
					state._fsp--;

					stream_atom.add(atom246.getTree());
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
					// 232:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:18: ^( UNARY_MIN atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:6: '!' atom
					{
					char_literal247=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1984);  
					stream_Excl.add(char_literal247);

					pushFollow(FOLLOW_atom_in_unaryExpr1986);
					atom248=atom();
					state._fsp--;

					stream_atom.add(atom248.getTree());
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
					// 233:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:18: ^( NEGATE atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr2001);
					atom249=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom249.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number250=null;
		Token Bool251=null;
		Token Null252=null;
		Token COLOR_CONSTANT254=null;
		Token PI_CONSTANT255=null;
		Token WIDTH_CONSTANT256=null;
		Token HEIGHT_CONSTANT257=null;
		ParserRuleReturnScope lookup253 =null;

		Object Number250_tree=null;
		Object Bool251_tree=null;
		Object Null252_tree=null;
		Object COLOR_CONSTANT254_tree=null;
		Object PI_CONSTANT255_tree=null;
		Object WIDTH_CONSTANT256_tree=null;
		Object HEIGHT_CONSTANT257_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt45=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt45=1;
				}
				break;
			case Bool:
				{
				alt45=2;
				}
				break;
			case Null:
				{
				alt45=3;
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
				alt45=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt45=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt45=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt45=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt45=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number250=(Token)match(input,Number,FOLLOW_Number_in_atom2015); 
					Number250_tree = (Object)adaptor.create(Number250);
					adaptor.addChild(root_0, Number250_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool251=(Token)match(input,Bool,FOLLOW_Bool_in_atom2022); 
					Bool251_tree = (Object)adaptor.create(Bool251);
					adaptor.addChild(root_0, Bool251_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null252=(Token)match(input,Null,FOLLOW_Null_in_atom2029); 
					Null252_tree = (Object)adaptor.create(Null252);
					adaptor.addChild(root_0, Null252_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom2036);
					lookup253=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup253.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT254=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2042); 
					COLOR_CONSTANT254_tree = (Object)adaptor.create(COLOR_CONSTANT254);
					adaptor.addChild(root_0, COLOR_CONSTANT254_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT255=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2048); 
					PI_CONSTANT255_tree = (Object)adaptor.create(PI_CONSTANT255);
					adaptor.addChild(root_0, PI_CONSTANT255_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:244:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT256=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2054); 
					WIDTH_CONSTANT256_tree = (Object)adaptor.create(WIDTH_CONSTANT256);
					adaptor.addChild(root_0, WIDTH_CONSTANT256_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT257=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2060); 
					HEIGHT_CONSTANT257_tree = (Object)adaptor.create(HEIGHT_CONSTANT257);
					adaptor.addChild(root_0, HEIGHT_CONSTANT257_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal258=null;
		Token char_literal260=null;
		ParserRuleReturnScope exprList259 =null;

		Object char_literal258_tree=null;
		Object char_literal260_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:6: '[' ( exprList )? ']'
			{
			char_literal258=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2074);  
			stream_OBracket.add(char_literal258);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:10: ( exprList )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ATan||LA46_0==Assert||LA46_0==Bool||LA46_0==COLOR_CONSTANT||(LA46_0 >= Copy && LA46_0 <= Curve)||LA46_0==Ellipse||(LA46_0 >= Excl && LA46_0 <= Expand)||LA46_0==Fill||(LA46_0 >= Group && LA46_0 <= Hide)||LA46_0==Identifier||LA46_0==LAdd||(LA46_0 >= LRemove && LA46_0 <= LShape)||(LA46_0 >= Line && LA46_0 <= MirrorX)||LA46_0==Move||(LA46_0 >= NoFill && LA46_0 <= Number)||(LA46_0 >= OBracket && LA46_0 <= OParen)||(LA46_0 >= PI_CONSTANT && LA46_0 <= Polygon)||(LA46_0 >= Print && LA46_0 <= Println)||(LA46_0 >= Random && LA46_0 <= Rect)||(LA46_0 >= Rotate && LA46_0 <= Round)||(LA46_0 >= Scale && LA46_0 <= Size)||(LA46_0 >= String && LA46_0 <= Subtract)||LA46_0==Tan||(LA46_0 >= WIDTH_CONSTANT && LA46_0 <= Weight)) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2076);
					exprList259=exprList();
					state._fsp--;

					stream_exprList.add(exprList259.getTree());
					}
					break;

			}

			char_literal260=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2079);  
			stream_CBracket.add(char_literal260);

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
			// 249:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:34: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier266=null;
		Token String269=null;
		Token char_literal271=null;
		Token char_literal273=null;
		ParserRuleReturnScope functionCall261 =null;
		ParserRuleReturnScope indexes262 =null;
		ParserRuleReturnScope dotProperty263 =null;
		ParserRuleReturnScope list264 =null;
		ParserRuleReturnScope indexes265 =null;
		ParserRuleReturnScope indexes267 =null;
		ParserRuleReturnScope dotProperty268 =null;
		ParserRuleReturnScope indexes270 =null;
		ParserRuleReturnScope expression272 =null;
		ParserRuleReturnScope indexes274 =null;

		Object Identifier266_tree=null;
		Object String269_tree=null;
		Object char_literal271_tree=null;
		Object char_literal273_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt54=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA54_1 = input.LA(2);
				if ( (LA54_1==OParen) ) {
					alt54=1;
				}
				else if ( (LA54_1==Add||LA54_1==CBracket||(LA54_1 >= CParen && LA54_1 <= Comma)||(LA54_1 >= Divide && LA54_1 <= Do)||(LA54_1 >= DotEnd && LA54_1 <= DotY)||LA54_1==Equals||(LA54_1 >= GT && LA54_1 <= GTEquals)||LA54_1==In||(LA54_1 >= LT && LA54_1 <= LTEquals)||LA54_1==Modulus||LA54_1==Multiply||LA54_1==NEquals||LA54_1==OBracket||LA54_1==Pow||LA54_1==QMark||LA54_1==Subtract||(LA54_1 >= 121 && LA54_1 <= 124)) ) {
					alt54=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
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
				alt54=1;
				}
				break;
			case OBracket:
				{
				alt54=2;
				}
				break;
			case String:
				{
				alt54=4;
				}
				break;
			case OParen:
				{
				alt54=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2102);
					functionCall261=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall261.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==Add||LA48_0==CBracket||(LA48_0 >= CParen && LA48_0 <= Comma)||(LA48_0 >= Divide && LA48_0 <= Do)||LA48_0==Equals||(LA48_0 >= GT && LA48_0 <= GTEquals)||LA48_0==In||(LA48_0 >= LT && LA48_0 <= LTEquals)||LA48_0==Modulus||LA48_0==Multiply||LA48_0==NEquals||LA48_0==OBracket||LA48_0==Pow||LA48_0==QMark||LA48_0==Subtract||(LA48_0 >= 121 && LA48_0 <= 124)) ) {
						alt48=1;
					}
					else if ( ((LA48_0 >= DotEnd && LA48_0 <= DotY)) ) {
						alt48=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:20: ( indexes )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==OBracket) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2105);
									indexes262=indexes();
									state._fsp--;

									stream_indexes.add(indexes262.getTree());
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
							// 253:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:55: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2122);
							dotProperty263=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty263.getTree());
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
							// 253:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:83: ^( DOTPROPERTY functionCall dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2147);
					list264=list();
					state._fsp--;

					stream_list.add(list264.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:11: ( indexes )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==OBracket) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2149);
							indexes265=indexes();
							state._fsp--;

							stream_indexes.add(indexes265.getTree());
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
					// 254:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:51: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier266=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2182);  
					stream_Identifier.add(Identifier266);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==Add||LA51_0==CBracket||(LA51_0 >= CParen && LA51_0 <= Comma)||(LA51_0 >= Divide && LA51_0 <= Do)||LA51_0==Equals||(LA51_0 >= GT && LA51_0 <= GTEquals)||LA51_0==In||(LA51_0 >= LT && LA51_0 <= LTEquals)||LA51_0==Modulus||LA51_0==Multiply||LA51_0==NEquals||LA51_0==OBracket||LA51_0==Pow||LA51_0==QMark||LA51_0==Subtract||(LA51_0 >= 121 && LA51_0 <= 124)) ) {
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:18: ( indexes )?
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==OBracket) ) {
								alt50=1;
							}
							switch (alt50) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2185);
									indexes267=indexes();
									state._fsp--;

									stream_indexes.add(indexes267.getTree());
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
							// 255:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:51: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2202);
							dotProperty268=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty268.getTree());
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
							// 255:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:79: ^( DOTPROPERTY Identifier dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:6: String ( indexes )?
					{
					String269=(Token)match(input,String,FOLLOW_String_in_lookup2222);  
					stream_String.add(String269);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:13: ( indexes )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==OBracket) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2224);
							indexes270=indexes();
							state._fsp--;

							stream_indexes.add(indexes270.getTree());
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
					// 256:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:53: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:6: '(' expression ')' ( indexes )?
					{
					char_literal271=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2255);  
					stream_OParen.add(char_literal271);

					pushFollow(FOLLOW_expression_in_lookup2257);
					expression272=expression();
					state._fsp--;

					stream_expression.add(expression272.getTree());
					char_literal273=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2259);  
					stream_CParen.add(char_literal273);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:25: ( indexes )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==OBracket) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2261);
							indexes274=indexes();
							state._fsp--;

							stream_indexes.add(indexes274.getTree());
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
					// 257:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:57: ( indexes )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal275=null;
		Token char_literal277=null;
		ParserRuleReturnScope expression276 =null;

		Object char_literal275_tree=null;
		Object char_literal277_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:6: ( '[' expression ']' )+
			int cnt55=0;
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==OBracket) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:7: '[' expression ']'
					{
					char_literal275=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2305);  
					stream_OBracket.add(char_literal275);

					pushFollow(FOLLOW_expression_in_indexes2307);
					expression276=expression();
					state._fsp--;

					stream_expression.add(expression276.getTree());
					char_literal277=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2309);  
					stream_CBracket.add(char_literal277);

					}
					break;

				default :
					if ( cnt55 >= 1 ) break loop55;
					EarlyExitException eee = new EarlyExitException(55, input);
					throw eee;
				}
				cnt55++;
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
			// 265:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:31: ^( INDEXES ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression278 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:6: ( dotExpression )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:6: ( dotExpression )+
			int cnt56=0;
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( ((LA56_0 >= DotEnd && LA56_0 <= DotY)) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2340);
					dotExpression278=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression278.getTree());
					}
					break;

				default :
					if ( cnt56 >= 1 ) break loop56;
					EarlyExitException eee = new EarlyExitException(56, input);
					throw eee;
				}
				cnt56++;
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
			// 269:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:26: ^( DOT ( dotExpression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set279=null;

		Object set279_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set279=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set279));
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
	public static final BitSet FOLLOW_statement_in_block192 = new BitSet(new long[]{0x314C8400011C0122L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_functionDecl_in_block196 = new BitSet(new long[]{0x314C8400011C0122L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_Return_in_block201 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_block203 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_block205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement247 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment311 = new BitSet(new long[]{0x0000000000000200L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_assignment313 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_assignment316 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_assignment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall354 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_functionCall356 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall379 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_functionCall381 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall405 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_functionCall407 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall432 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_functionCall434 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall458 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_functionCall460 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall486 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_functionCall488 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionCall514 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_functionCall516 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall576 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall578 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall603 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall605 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall630 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall632 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall657 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall659 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall682 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall684 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall707 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall709 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall733 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall735 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall771 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall773 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall797 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall799 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall820 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall822 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall844 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall846 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall868 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall870 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall892 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall894 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall914 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall916 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall936 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall938 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall960 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall962 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall982 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall984 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1006 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall1008 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1028 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall1030 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1050 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_transformCall1052 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1074 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_transformCall1076 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1114 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_mathCall1116 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1139 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_mathCall1141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1164 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_mathCall1166 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1189 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_mathCall1191 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1214 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_mathCall1216 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1240 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_mathCall1242 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1264 = new BitSet(new long[]{0x11C4C400001CC920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_mathCall1266 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1304 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1306 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1309 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1341 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_ifStat1343 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1345 = new BitSet(new long[]{0x314C8400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_ifStat1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1371 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1373 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1375 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1377 = new BitSet(new long[]{0x314C8400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_elseIfStat1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1403 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1405 = new BitSet(new long[]{0x314C8400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_elseStat1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1429 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1433 = new BitSet(new long[]{0x1000000000008000L});
	public static final BitSet FOLLOW_idList_in_functionDecl1435 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1438 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1440 = new BitSet(new long[]{0x314C9400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_functionDecl1442 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1466 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1468 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_forStatement1470 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_forStatement1472 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1474 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_forStatement1476 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1478 = new BitSet(new long[]{0x314C9400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_forStatement1480 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1515 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1517 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1519 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1521 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1523 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1525 = new BitSet(new long[]{0x0000000008000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_123_in_repeatStatement1528 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1530 = new BitSet(new long[]{0x0000000008000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1534 = new BitSet(new long[]{0x314C9400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_repeatStatement1536 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1566 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_whileStatement1568 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1570 = new BitSet(new long[]{0x314C9400011C0120L,0x05849CFC6C062799L});
	public static final BitSet FOLLOW_block_in_whileStatement1572 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1598 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_idList1601 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList1603 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_expression_in_exprList1628 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_exprList1631 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_exprList1633 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_condExpr_in_expression1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1673 = new BitSet(new long[]{0x4000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_QMark_in_condExpr1688 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_condExpr1692 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_condExpr1694 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_condExpr1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1721 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_condExpr1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1775 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_124_in_orExpr1778 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1781 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1797 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_121_in_andExpr1800 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1803 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1819 = new BitSet(new long[]{0x0000200000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_set_in_equExpr1822 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1831 = new BitSet(new long[]{0x0000200000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1847 = new BitSet(new long[]{0x0030000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_relExpr1850 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1867 = new BitSet(new long[]{0x0030000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1883 = new BitSet(new long[]{0x0000000000000042L,0x0001000000000000L});
	public static final BitSet FOLLOW_set_in_addExpr1886 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1895 = new BitSet(new long[]{0x0000000000000042L,0x0001000000000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1911 = new BitSet(new long[]{0x0000000004000002L,0x0000000000005000L});
	public static final BitSet FOLLOW_set_in_mulExpr1914 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1927 = new BitSet(new long[]{0x0000000004000002L,0x0000000000005000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1943 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr1946 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1949 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1967 = new BitSet(new long[]{0x11C48400001C4920L,0x00C4DCCC6EDE2799L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1984 = new BitSet(new long[]{0x11C48400001C4920L,0x00C4DCCC6EDE2799L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2074 = new BitSet(new long[]{0x11C4C400001C6920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_exprList_in_list2076 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_list2079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2102 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_lookup2105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_lookup2149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2182 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_lookup2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2222 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_lookup2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2255 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_lookup2257 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_lookup2259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_indexes_in_lookup2261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2305 = new BitSet(new long[]{0x11C4C400001C4920L,0x00C5DCCC6EDE2799L});
	public static final BitSet FOLLOW_expression_in_indexes2307 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2340 = new BitSet(new long[]{0x000000FFE0000002L});
}
