// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-05-13 16:06:29

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
		"ATan", "Add", "And", "Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", 
		"COLOR_CONSTANT", "CParen", "Clip", "Comma", "Comment", "Copy", "Cosine", 
		"Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", "Def", "Difference", "Digit", 
		"Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", "DotOrigin", 
		"DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", "DotX", 
		"DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", 
		"Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", "GetDistance", 
		"GetEnd", "GetFill", "GetHeight", "GetOrigin", "GetRotation", "GetStart", 
		"GetStroke", "GetWidth", "GetX", "GetY", "Group", "HEIGHT_CONSTANT", "Hide", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LAdd", "LIST", 
		"LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Map", "Merge", 
		"MirrorX", "MirrorY", "Modulus", "Move", "MoveBy", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", 
		"Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "Sine", "Size", 
		"Skirt", "SkirtBack", "Space", "String", "Stroke", "Subtract", "TERNARY", 
		"Tan", "To", "Triangle", "UNARY_MIN", "Union", "WIDTH_CONSTANT", "Weight", 
		"While", "Xor", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int ADD_CALL=4;
	public static final int AND_CALL=5;
	public static final int ASSIGNMENT=6;
	public static final int ATan=7;
	public static final int Add=8;
	public static final int And=9;
	public static final int Assert=10;
	public static final int Assign=11;
	public static final int BLOCK=12;
	public static final int Bool=13;
	public static final int CBrace=14;
	public static final int CBracket=15;
	public static final int COLOR_CONSTANT=16;
	public static final int CParen=17;
	public static final int Clip=18;
	public static final int Comma=19;
	public static final int Comment=20;
	public static final int Copy=21;
	public static final int Cosine=22;
	public static final int Curve=23;
	public static final int DOT=24;
	public static final int DOTLOOKUP=25;
	public static final int DOTPROPERTY=26;
	public static final int Def=27;
	public static final int Difference=28;
	public static final int Digit=29;
	public static final int Divide=30;
	public static final int Do=31;
	public static final int Dot=32;
	public static final int DotEnd=33;
	public static final int DotFill=34;
	public static final int DotHeight=35;
	public static final int DotOrigin=36;
	public static final int DotRotation=37;
	public static final int DotStart=38;
	public static final int DotStroke=39;
	public static final int DotWeight=40;
	public static final int DotWidth=41;
	public static final int DotX=42;
	public static final int DotY=43;
	public static final int EXP=44;
	public static final int EXP_LIST=45;
	public static final int Ellipse=46;
	public static final int Else=47;
	public static final int End=48;
	public static final int Equals=49;
	public static final int Excl=50;
	public static final int Expand=51;
	public static final int FUNCTION=52;
	public static final int FUNC_CALL=53;
	public static final int Fill=54;
	public static final int For=55;
	public static final int GT=56;
	public static final int GTEquals=57;
	public static final int GetDistance=58;
	public static final int GetEnd=59;
	public static final int GetFill=60;
	public static final int GetHeight=61;
	public static final int GetOrigin=62;
	public static final int GetRotation=63;
	public static final int GetStart=64;
	public static final int GetStroke=65;
	public static final int GetWidth=66;
	public static final int GetX=67;
	public static final int GetY=68;
	public static final int Group=69;
	public static final int HEIGHT_CONSTANT=70;
	public static final int Hide=71;
	public static final int ID_LIST=72;
	public static final int IF=73;
	public static final int INDEXES=74;
	public static final int Identifier=75;
	public static final int If=76;
	public static final int In=77;
	public static final int Int=78;
	public static final int LAdd=79;
	public static final int LIST=80;
	public static final int LOOKUP=81;
	public static final int LRemove=82;
	public static final int LShape=83;
	public static final int LT=84;
	public static final int LTEquals=85;
	public static final int Line=86;
	public static final int Map=87;
	public static final int Merge=88;
	public static final int MirrorX=89;
	public static final int MirrorY=90;
	public static final int Modulus=91;
	public static final int Move=92;
	public static final int MoveBy=93;
	public static final int Multiply=94;
	public static final int NEGATE=95;
	public static final int NEquals=96;
	public static final int NoFill=97;
	public static final int NoStroke=98;
	public static final int Null=99;
	public static final int Number=100;
	public static final int OBrace=101;
	public static final int OBracket=102;
	public static final int OParen=103;
	public static final int Or=104;
	public static final int PI_CONSTANT=105;
	public static final int Point=106;
	public static final int Polygon=107;
	public static final int Pow=108;
	public static final int Print=109;
	public static final int Println=110;
	public static final int QMark=111;
	public static final int Quad=112;
	public static final int RETURN=113;
	public static final int Random=114;
	public static final int Rect=115;
	public static final int Repeat=116;
	public static final int Return=117;
	public static final int Rotate=118;
	public static final int Round=119;
	public static final int SPECIAL=120;
	public static final int STATEMENTS=121;
	public static final int SUB_CALL=122;
	public static final int Scale=123;
	public static final int Sine=124;
	public static final int Size=125;
	public static final int Skirt=126;
	public static final int SkirtBack=127;
	public static final int Space=128;
	public static final int String=129;
	public static final int Stroke=130;
	public static final int Subtract=131;
	public static final int TERNARY=132;
	public static final int Tan=133;
	public static final int To=134;
	public static final int Triangle=135;
	public static final int UNARY_MIN=136;
	public static final int Union=137;
	public static final int WIDTH_CONSTANT=138;
	public static final int Weight=139;
	public static final int While=140;
	public static final int Xor=141;

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
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }


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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:1: parse : block EOF -> block ;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:3: ( block EOF -> block )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse187);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse189);  
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
			// 76:16: -> block
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:79:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
		RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ATan||LA1_0==Assert||LA1_0==Clip||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Difference||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= GetDistance && LA1_0 <= Group)||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= MirrorY)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= SkirtBack)||LA1_0==Stroke||LA1_0==Tan||LA1_0==Union||(LA1_0 >= Weight && LA1_0 <= Xor)||LA1_0==143) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:6: statement
					{
					pushFollow(FOLLOW_statement_in_block207);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block211);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block216);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block218);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,143,FOLLOW_143_in_block220);  
					stream_143.add(char_literal7);

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
			// 81:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:51: ( expression )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
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
		RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
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
			case 143:
				{
				alt3=1;
				}
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
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
			case MirrorY:
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
			case Skirt:
			case SkirtBack:
			case Stroke:
			case Tan:
			case Union:
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement262);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,143,FOLLOW_143_in_statement264);  
					stream_143.add(char_literal9);

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
					// 85:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement277);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,143,FOLLOW_143_in_statement279);  
					stream_143.add(char_literal11);

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
					// 86:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement291);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement298);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement305);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement312);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			else if ( (LA5_0==143) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:6: Identifier ( indexes )? '=' expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment326);  
					stream_Identifier.add(Identifier16);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment328);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment331);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment333);
					expression19=expression();
					state._fsp--;

					stream_expression.add(expression19.getTree());
					// AST REWRITE
					// elements: Identifier, expression, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:69: ( indexes )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: 
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
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
			case Group:
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
			case Stroke:
			case Union:
			case Weight:
			case Xor:
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall367);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall369);  
					stream_OParen.add(char_literal21);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ATan||LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==Clip||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Difference||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= GetDistance && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||(LA6_0 >= Line && LA6_0 <= MirrorY)||(LA6_0 >= Move && LA6_0 <= MoveBy)||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= PI_CONSTANT && LA6_0 <= Polygon)||(LA6_0 >= Print && LA6_0 <= Println)||(LA6_0 >= Random && LA6_0 <= Rect)||(LA6_0 >= Rotate && LA6_0 <= Round)||(LA6_0 >= Scale && LA6_0 <= SkirtBack)||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==Tan||(LA6_0 >= Union && LA6_0 <= Weight)||LA6_0==Xor) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall371);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall374);  
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
					// 99:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:61: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall392);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall394);  
					stream_OParen.add(char_literal25);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ATan||LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==Clip||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Difference||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= GetDistance && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= MirrorY)||(LA7_0 >= Move && LA7_0 <= MoveBy)||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= SkirtBack)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==Tan||(LA7_0 >= Union && LA7_0 <= Weight)||LA7_0==Xor) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall396);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall399);  
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
					// 100:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:58: ( expression )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall418);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall420);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall422);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall424);  
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
					// 101:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:38: ^( FUNC_CALL Print expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall445);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall447);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall449);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall451);  
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
					// 102:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:38: ^( FUNC_CALL Assert expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall471);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall473);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall475);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall477);  
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
					// 103:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:38: ^( FUNC_CALL Size expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:6: LAdd '(' ( exprList )? ')'
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall499);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall501);  
					stream_OParen.add(char_literal41);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:15: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ATan||LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||LA8_0==Clip||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Difference||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= GetDistance && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= MirrorY)||(LA8_0 >= Move && LA8_0 <= MoveBy)||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= SkirtBack)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==Tan||(LA8_0 >= Union && LA8_0 <= Weight)||LA8_0==Xor) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall503);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall506);  
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
					// 104:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:34: ^( FUNC_CALL LAdd ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:51: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: LRemove '(' ( exprList )? ')'
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall527);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall529);  
					stream_OParen.add(char_literal45);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:18: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ATan||LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||LA9_0==Clip||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Difference||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= GetDistance && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= MirrorY)||(LA9_0 >= Move && LA9_0 <= MoveBy)||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= SkirtBack)||(LA9_0 >= String && LA9_0 <= Subtract)||LA9_0==Tan||(LA9_0 >= Union && LA9_0 <= Weight)||LA9_0==Xor) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall531);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall534);  
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
					// 105:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:37: ^( FUNC_CALL LRemove ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:57: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall555);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall562);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall569);
					mathCall50=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall50.getTree());

					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:5: getCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_getCall_in_functionCall575);
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
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
		Token Skirt72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token SkirtBack76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token LShape80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token Point84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope exprList54 =null;
		ParserRuleReturnScope exprList58 =null;
		ParserRuleReturnScope exprList62 =null;
		ParserRuleReturnScope exprList66 =null;
		ParserRuleReturnScope exprList70 =null;
		ParserRuleReturnScope exprList74 =null;
		ParserRuleReturnScope exprList78 =null;
		ParserRuleReturnScope exprList82 =null;
		ParserRuleReturnScope exprList86 =null;

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
		Object Skirt72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object SkirtBack76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		Object LShape80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object Point84_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
			int alt20=9;
			switch ( input.LA(1) ) {
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
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse52=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall595);  
					stream_Ellipse.add(Ellipse52);

					char_literal53=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall597);  
					stream_OParen.add(char_literal53);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ATan||LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||LA11_0==Clip||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Difference||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= GetDistance && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||(LA11_0 >= Line && LA11_0 <= MirrorY)||(LA11_0 >= Move && LA11_0 <= MoveBy)||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= PI_CONSTANT && LA11_0 <= Polygon)||(LA11_0 >= Print && LA11_0 <= Println)||(LA11_0 >= Random && LA11_0 <= Rect)||(LA11_0 >= Rotate && LA11_0 <= Round)||(LA11_0 >= Scale && LA11_0 <= SkirtBack)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==Tan||(LA11_0 >= Union && LA11_0 <= Weight)||LA11_0==Xor) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall599);
							exprList54=exprList();
							state._fsp--;

							stream_exprList.add(exprList54.getTree());
							}
							break;

					}

					char_literal55=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall602);  
					stream_CParen.add(char_literal55);

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
					// 114:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:56: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:5: Line '(' ( exprList )? ')'
					{
					Line56=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall622);  
					stream_Line.add(Line56);

					char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall624);  
					stream_OParen.add(char_literal57);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:14: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||LA12_0==Clip||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Difference||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= GetDistance && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= MirrorY)||(LA12_0 >= Move && LA12_0 <= MoveBy)||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= SkirtBack)||(LA12_0 >= String && LA12_0 <= Subtract)||LA12_0==Tan||(LA12_0 >= Union && LA12_0 <= Weight)||LA12_0==Xor) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall626);
							exprList58=exprList();
							state._fsp--;

							stream_exprList.add(exprList58.getTree());
							}
							break;

					}

					char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall629);  
					stream_CParen.add(char_literal59);

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
					// 115:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:50: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:5: Rect '(' ( exprList )? ')'
					{
					Rect60=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall649);  
					stream_Rect.add(Rect60);

					char_literal61=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall651);  
					stream_OParen.add(char_literal61);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||LA13_0==Clip||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Difference||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= GetDistance && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= MirrorY)||(LA13_0 >= Move && LA13_0 <= MoveBy)||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= SkirtBack)||(LA13_0 >= String && LA13_0 <= Subtract)||LA13_0==Tan||(LA13_0 >= Union && LA13_0 <= Weight)||LA13_0==Xor) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall653);
							exprList62=exprList();
							state._fsp--;

							stream_exprList.add(exprList62.getTree());
							}
							break;

					}

					char_literal63=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall656);  
					stream_CParen.add(char_literal63);

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
					// 116:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:50: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:5: Curve '(' ( exprList )? ')'
					{
					Curve64=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall676);  
					stream_Curve.add(Curve64);

					char_literal65=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall678);  
					stream_OParen.add(char_literal65);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:15: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||LA14_0==Clip||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Difference||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= GetDistance && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= MirrorY)||(LA14_0 >= Move && LA14_0 <= MoveBy)||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= SkirtBack)||(LA14_0 >= String && LA14_0 <= Subtract)||LA14_0==Tan||(LA14_0 >= Union && LA14_0 <= Weight)||LA14_0==Xor) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall680);
							exprList66=exprList();
							state._fsp--;

							stream_exprList.add(exprList66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall683);  
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
					// 117:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:51: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: Polygon '(' ( exprList )? ')'
					{
					Polygon68=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall701);  
					stream_Polygon.add(Polygon68);

					char_literal69=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall703);  
					stream_OParen.add(char_literal69);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||LA15_0==Clip||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Difference||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= GetDistance && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= MirrorY)||(LA15_0 >= Move && LA15_0 <= MoveBy)||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= SkirtBack)||(LA15_0 >= String && LA15_0 <= Subtract)||LA15_0==Tan||(LA15_0 >= Union && LA15_0 <= Weight)||LA15_0==Xor) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall705);
							exprList70=exprList();
							state._fsp--;

							stream_exprList.add(exprList70.getTree());
							}
							break;

					}

					char_literal71=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall708);  
					stream_CParen.add(char_literal71);

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
					// 118:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:55: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:5: Skirt '(' ( exprList )? ')'
					{
					Skirt72=(Token)match(input,Skirt,FOLLOW_Skirt_in_primitiveCall726);  
					stream_Skirt.add(Skirt72);

					char_literal73=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall728);  
					stream_OParen.add(char_literal73);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:15: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||LA16_0==Clip||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Difference||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= GetDistance && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= MirrorY)||(LA16_0 >= Move && LA16_0 <= MoveBy)||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= SkirtBack)||(LA16_0 >= String && LA16_0 <= Subtract)||LA16_0==Tan||(LA16_0 >= Union && LA16_0 <= Weight)||LA16_0==Xor) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall730);
							exprList74=exprList();
							state._fsp--;

							stream_exprList.add(exprList74.getTree());
							}
							break;

					}

					char_literal75=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall733);  
					stream_CParen.add(char_literal75);

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
					// 119:29: -> ^( FUNC_CALL Skirt ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:33: ^( FUNC_CALL Skirt ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Skirt.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:51: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:5: SkirtBack '(' ( exprList )? ')'
					{
					SkirtBack76=(Token)match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall751);  
					stream_SkirtBack.add(SkirtBack76);

					char_literal77=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall753);  
					stream_OParen.add(char_literal77);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:19: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||LA17_0==Clip||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Difference||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||LA17_0==Fill||(LA17_0 >= GetDistance && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= MirrorY)||(LA17_0 >= Move && LA17_0 <= MoveBy)||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= SkirtBack)||(LA17_0 >= String && LA17_0 <= Subtract)||LA17_0==Tan||(LA17_0 >= Union && LA17_0 <= Weight)||LA17_0==Xor) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall755);
							exprList78=exprList();
							state._fsp--;

							stream_exprList.add(exprList78.getTree());
							}
							break;

					}

					char_literal79=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall758);  
					stream_CParen.add(char_literal79);

					// AST REWRITE
					// elements: SkirtBack, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:33: -> ^( FUNC_CALL SkirtBack ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:37: ^( FUNC_CALL SkirtBack ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SkirtBack.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:59: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:6: LShape '(' ( exprList )? ')'
					{
					LShape80=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall777);  
					stream_LShape.add(LShape80);

					char_literal81=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall779);  
					stream_OParen.add(char_literal81);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:17: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ATan||LA18_0==Assert||LA18_0==Bool||LA18_0==COLOR_CONSTANT||LA18_0==Clip||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Difference||LA18_0==Ellipse||(LA18_0 >= Excl && LA18_0 <= Expand)||LA18_0==Fill||(LA18_0 >= GetDistance && LA18_0 <= Hide)||LA18_0==Identifier||LA18_0==LAdd||(LA18_0 >= LRemove && LA18_0 <= LShape)||(LA18_0 >= Line && LA18_0 <= MirrorY)||(LA18_0 >= Move && LA18_0 <= MoveBy)||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||(LA18_0 >= PI_CONSTANT && LA18_0 <= Polygon)||(LA18_0 >= Print && LA18_0 <= Println)||(LA18_0 >= Random && LA18_0 <= Rect)||(LA18_0 >= Rotate && LA18_0 <= Round)||(LA18_0 >= Scale && LA18_0 <= SkirtBack)||(LA18_0 >= String && LA18_0 <= Subtract)||LA18_0==Tan||(LA18_0 >= Union && LA18_0 <= Weight)||LA18_0==Xor) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall781);
							exprList82=exprList();
							state._fsp--;

							stream_exprList.add(exprList82.getTree());
							}
							break;

					}

					char_literal83=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall784);  
					stream_CParen.add(char_literal83);

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
					// 121:31: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:35: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:54: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:7: Point '(' ( exprList )? ')'
					{
					Point84=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall804);  
					stream_Point.add(Point84);

					char_literal85=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall806);  
					stream_OParen.add(char_literal85);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||LA19_0==Clip||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Difference||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= GetDistance && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= MirrorY)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= SkirtBack)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= Union && LA19_0 <= Weight)||LA19_0==Xor) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall808);
							exprList86=exprList();
							state._fsp--;

							stream_exprList.add(exprList86.getTree());
							}
							break;

					}

					char_literal87=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall811);  
					stream_CParen.add(char_literal87);

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
					// 122:31: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:35: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:53: ( exprList )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move88=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token MoveBy92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token Copy96=null;
		Token char_literal97=null;
		Token char_literal99=null;
		Token Rotate100=null;
		Token char_literal101=null;
		Token char_literal103=null;
		Token Fill104=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token Stroke108=null;
		Token char_literal109=null;
		Token char_literal111=null;
		Token NoFill112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token NoStroke116=null;
		Token char_literal117=null;
		Token char_literal119=null;
		Token Weight120=null;
		Token char_literal121=null;
		Token char_literal123=null;
		Token Hide124=null;
		Token char_literal125=null;
		Token char_literal127=null;
		Token Group128=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token Expand132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		Token Merge136=null;
		Token char_literal137=null;
		Token char_literal139=null;
		Token Scale140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token MirrorX144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		Token MirrorY148=null;
		Token char_literal149=null;
		Token char_literal151=null;
		Token Union152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		Token Difference156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		Token Clip160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token Xor164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		ParserRuleReturnScope exprList90 =null;
		ParserRuleReturnScope exprList94 =null;
		ParserRuleReturnScope expression98 =null;
		ParserRuleReturnScope exprList102 =null;
		ParserRuleReturnScope exprList106 =null;
		ParserRuleReturnScope exprList110 =null;
		ParserRuleReturnScope expression114 =null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope exprList122 =null;
		ParserRuleReturnScope expression126 =null;
		ParserRuleReturnScope exprList130 =null;
		ParserRuleReturnScope expression134 =null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope exprList142 =null;
		ParserRuleReturnScope expression146 =null;
		ParserRuleReturnScope expression150 =null;
		ParserRuleReturnScope exprList154 =null;
		ParserRuleReturnScope exprList158 =null;
		ParserRuleReturnScope exprList162 =null;
		ParserRuleReturnScope exprList166 =null;

		Object Move88_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object MoveBy92_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		Object Copy96_tree=null;
		Object char_literal97_tree=null;
		Object char_literal99_tree=null;
		Object Rotate100_tree=null;
		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		Object Fill104_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		Object Stroke108_tree=null;
		Object char_literal109_tree=null;
		Object char_literal111_tree=null;
		Object NoFill112_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;
		Object NoStroke116_tree=null;
		Object char_literal117_tree=null;
		Object char_literal119_tree=null;
		Object Weight120_tree=null;
		Object char_literal121_tree=null;
		Object char_literal123_tree=null;
		Object Hide124_tree=null;
		Object char_literal125_tree=null;
		Object char_literal127_tree=null;
		Object Group128_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		Object Expand132_tree=null;
		Object char_literal133_tree=null;
		Object char_literal135_tree=null;
		Object Merge136_tree=null;
		Object char_literal137_tree=null;
		Object char_literal139_tree=null;
		Object Scale140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object MirrorX144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
		Object MirrorY148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		Object Union152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		Object Difference156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		Object Clip160_tree=null;
		Object char_literal161_tree=null;
		Object char_literal163_tree=null;
		Object Xor164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_Union=new RewriteRuleTokenStream(adaptor,"token Union");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_Clip=new RewriteRuleTokenStream(adaptor,"token Clip");
		RewriteRuleTokenStream stream_MoveBy=new RewriteRuleTokenStream(adaptor,"token MoveBy");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_MirrorY=new RewriteRuleTokenStream(adaptor,"token MirrorY");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_MirrorX=new RewriteRuleTokenStream(adaptor,"token MirrorX");
		RewriteRuleTokenStream stream_Difference=new RewriteRuleTokenStream(adaptor,"token Difference");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Merge=new RewriteRuleTokenStream(adaptor,"token Merge");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Scale=new RewriteRuleTokenStream(adaptor,"token Scale");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Xor=new RewriteRuleTokenStream(adaptor,"token Xor");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) )
			int alt33=20;
			switch ( input.LA(1) ) {
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
			case Copy:
				{
				alt33=3;
				}
				break;
			case Rotate:
				{
				alt33=4;
				}
				break;
			case Fill:
				{
				alt33=5;
				}
				break;
			case Stroke:
				{
				alt33=6;
				}
				break;
			case NoFill:
				{
				alt33=7;
				}
				break;
			case NoStroke:
				{
				alt33=8;
				}
				break;
			case Weight:
				{
				alt33=9;
				}
				break;
			case Hide:
				{
				alt33=10;
				}
				break;
			case Group:
				{
				alt33=11;
				}
				break;
			case Expand:
				{
				alt33=12;
				}
				break;
			case Merge:
				{
				alt33=13;
				}
				break;
			case Scale:
				{
				alt33=14;
				}
				break;
			case MirrorX:
				{
				alt33=15;
				}
				break;
			case MirrorY:
				{
				alt33=16;
				}
				break;
			case Union:
				{
				alt33=17;
				}
				break;
			case Difference:
				{
				alt33=18;
				}
				break;
			case Clip:
				{
				alt33=19;
				}
				break;
			case Xor:
				{
				alt33=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:6: Move '(' ( exprList )? ')'
					{
					Move88=(Token)match(input,Move,FOLLOW_Move_in_transformCall842);  
					stream_Move.add(Move88);

					char_literal89=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall844);  
					stream_OParen.add(char_literal89);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:15: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ATan||LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||LA21_0==Clip||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Difference||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= GetDistance && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= MirrorY)||(LA21_0 >= Move && LA21_0 <= MoveBy)||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||(LA21_0 >= Random && LA21_0 <= Rect)||(LA21_0 >= Rotate && LA21_0 <= Round)||(LA21_0 >= Scale && LA21_0 <= SkirtBack)||(LA21_0 >= String && LA21_0 <= Subtract)||LA21_0==Tan||(LA21_0 >= Union && LA21_0 <= Weight)||LA21_0==Xor) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall846);
							exprList90=exprList();
							state._fsp--;

							stream_exprList.add(exprList90.getTree());
							}
							break;

					}

					char_literal91=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall849);  
					stream_CParen.add(char_literal91);

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
					// 126:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:49: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy92=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall867);  
					stream_MoveBy.add(MoveBy92);

					char_literal93=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall869);  
					stream_OParen.add(char_literal93);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||LA22_0==Clip||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Difference||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= GetDistance && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= MirrorY)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= SkirtBack)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= Union && LA22_0 <= Weight)||LA22_0==Xor) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall871);
							exprList94=exprList();
							state._fsp--;

							stream_exprList.add(exprList94.getTree());
							}
							break;

					}

					char_literal95=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall874);  
					stream_CParen.add(char_literal95);

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
					// 127:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:34: ^( FUNC_CALL MoveBy ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MoveBy.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:53: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: Copy '(' expression ')'
					{
					Copy96=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall898);  
					stream_Copy.add(Copy96);

					char_literal97=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall900);  
					stream_OParen.add(char_literal97);

					pushFollow(FOLLOW_expression_in_transformCall902);
					expression98=expression();
					state._fsp--;

					stream_expression.add(expression98.getTree());
					char_literal99=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall904);  
					stream_CParen.add(char_literal99);

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
					// 129:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:33: ^( FUNC_CALL Copy expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Rotate '(' ( exprList )? ')'
					{
					Rotate100=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall921);  
					stream_Rotate.add(Rotate100);

					char_literal101=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall923);  
					stream_OParen.add(char_literal101);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||LA23_0==Clip||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Difference||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= GetDistance && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= MirrorY)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= SkirtBack)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= Union && LA23_0 <= Weight)||LA23_0==Xor) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall925);
							exprList102=exprList();
							state._fsp--;

							stream_exprList.add(exprList102.getTree());
							}
							break;

					}

					char_literal103=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall928);  
					stream_CParen.add(char_literal103);

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
					// 130:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:52: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: Fill '(' ( exprList )? ')'
					{
					Fill104=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall945);  
					stream_Fill.add(Fill104);

					char_literal105=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall947);  
					stream_OParen.add(char_literal105);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:15: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||LA24_0==Clip||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Difference||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= GetDistance && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= MirrorY)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= SkirtBack)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= Union && LA24_0 <= Weight)||LA24_0==Xor) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall949);
							exprList106=exprList();
							state._fsp--;

							stream_exprList.add(exprList106.getTree());
							}
							break;

					}

					char_literal107=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall952);  
					stream_CParen.add(char_literal107);

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
					// 131:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:48: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Stroke '(' ( exprList )? ')'
					{
					Stroke108=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall969);  
					stream_Stroke.add(Stroke108);

					char_literal109=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall971);  
					stream_OParen.add(char_literal109);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||LA25_0==Assert||LA25_0==Bool||LA25_0==COLOR_CONSTANT||LA25_0==Clip||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Difference||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||LA25_0==Fill||(LA25_0 >= GetDistance && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= MirrorY)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= SkirtBack)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= Union && LA25_0 <= Weight)||LA25_0==Xor) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall973);
							exprList110=exprList();
							state._fsp--;

							stream_exprList.add(exprList110.getTree());
							}
							break;

					}

					char_literal111=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall976);  
					stream_CParen.add(char_literal111);

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
					// 132:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:52: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: NoFill '(' expression ')'
					{
					NoFill112=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall993);  
					stream_NoFill.add(NoFill112);

					char_literal113=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall995);  
					stream_OParen.add(char_literal113);

					pushFollow(FOLLOW_expression_in_transformCall997);
					expression114=expression();
					state._fsp--;

					stream_expression.add(expression114.getTree());
					char_literal115=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall999);  
					stream_CParen.add(char_literal115);

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
					// 133:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:34: ^( FUNC_CALL NoFill expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: NoStroke '(' expression ')'
					{
					NoStroke116=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall1015);  
					stream_NoStroke.add(NoStroke116);

					char_literal117=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1017);  
					stream_OParen.add(char_literal117);

					pushFollow(FOLLOW_expression_in_transformCall1019);
					expression118=expression();
					state._fsp--;

					stream_expression.add(expression118.getTree());
					char_literal119=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1021);  
					stream_CParen.add(char_literal119);

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
					// 134:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:36: ^( FUNC_CALL NoStroke expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: Weight '(' ( exprList )? ')'
					{
					Weight120=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall1037);  
					stream_Weight.add(Weight120);

					char_literal121=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1039);  
					stream_OParen.add(char_literal121);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:17: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||LA26_0==Assert||LA26_0==Bool||LA26_0==COLOR_CONSTANT||LA26_0==Clip||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Difference||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||LA26_0==Fill||(LA26_0 >= GetDistance && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= MirrorY)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Polygon)||(LA26_0 >= Print && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= SkirtBack)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==Tan||(LA26_0 >= Union && LA26_0 <= Weight)||LA26_0==Xor) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1041);
							exprList122=exprList();
							state._fsp--;

							stream_exprList.add(exprList122.getTree());
							}
							break;

					}

					char_literal123=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1044);  
					stream_CParen.add(char_literal123);

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
					// 135:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:52: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: Hide '(' expression ')'
					{
					Hide124=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall1061);  
					stream_Hide.add(Hide124);

					char_literal125=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1063);  
					stream_OParen.add(char_literal125);

					pushFollow(FOLLOW_expression_in_transformCall1065);
					expression126=expression();
					state._fsp--;

					stream_expression.add(expression126.getTree());
					char_literal127=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1067);  
					stream_CParen.add(char_literal127);

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
					// 136:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:32: ^( FUNC_CALL Hide expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:6: Group '(' ( exprList )? ')'
					{
					Group128=(Token)match(input,Group,FOLLOW_Group_in_transformCall1083);  
					stream_Group.add(Group128);

					char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1085);  
					stream_OParen.add(char_literal129);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:16: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||LA27_0==Assert||LA27_0==Bool||LA27_0==COLOR_CONSTANT||LA27_0==Clip||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Difference||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||LA27_0==Fill||(LA27_0 >= GetDistance && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= MirrorY)||(LA27_0 >= Move && LA27_0 <= MoveBy)||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Polygon)||(LA27_0 >= Print && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= SkirtBack)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==Tan||(LA27_0 >= Union && LA27_0 <= Weight)||LA27_0==Xor) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1087);
							exprList130=exprList();
							state._fsp--;

							stream_exprList.add(exprList130.getTree());
							}
							break;

					}

					char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1090);  
					stream_CParen.add(char_literal131);

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
					// 137:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:50: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: Expand '(' expression ')'
					{
					Expand132=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1107);  
					stream_Expand.add(Expand132);

					char_literal133=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1109);  
					stream_OParen.add(char_literal133);

					pushFollow(FOLLOW_expression_in_transformCall1111);
					expression134=expression();
					state._fsp--;

					stream_expression.add(expression134.getTree());
					char_literal135=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1113);  
					stream_CParen.add(char_literal135);

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
					// 138:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:34: ^( FUNC_CALL Expand expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:6: Merge '(' expression ')'
					{
					Merge136=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1129);  
					stream_Merge.add(Merge136);

					char_literal137=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1131);  
					stream_OParen.add(char_literal137);

					pushFollow(FOLLOW_expression_in_transformCall1133);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					char_literal139=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1135);  
					stream_CParen.add(char_literal139);

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
					// 139:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:33: ^( FUNC_CALL Merge expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: Scale '(' ( exprList )? ')'
					{
					Scale140=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1151);  
					stream_Scale.add(Scale140);

					char_literal141=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1153);  
					stream_OParen.add(char_literal141);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:16: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||LA28_0==Assert||LA28_0==Bool||LA28_0==COLOR_CONSTANT||LA28_0==Clip||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Difference||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||LA28_0==Fill||(LA28_0 >= GetDistance && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= MirrorY)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= SkirtBack)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= Union && LA28_0 <= Weight)||LA28_0==Xor) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1155);
							exprList142=exprList();
							state._fsp--;

							stream_exprList.add(exprList142.getTree());
							}
							break;

					}

					char_literal143=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1158);  
					stream_CParen.add(char_literal143);

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
					// 140:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:32: ^( FUNC_CALL Scale ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:50: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:6: MirrorX '(' expression ')'
					{
					MirrorX144=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1175);  
					stream_MirrorX.add(MirrorX144);

					char_literal145=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1177);  
					stream_OParen.add(char_literal145);

					pushFollow(FOLLOW_expression_in_transformCall1179);
					expression146=expression();
					state._fsp--;

					stream_expression.add(expression146.getTree());
					char_literal147=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1181);  
					stream_CParen.add(char_literal147);

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
					// 141:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:35: ^( FUNC_CALL MirrorX expression )
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
				case 16 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: MirrorY '(' expression ')'
					{
					MirrorY148=(Token)match(input,MirrorY,FOLLOW_MirrorY_in_transformCall1197);  
					stream_MirrorY.add(MirrorY148);

					char_literal149=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1199);  
					stream_OParen.add(char_literal149);

					pushFollow(FOLLOW_expression_in_transformCall1201);
					expression150=expression();
					state._fsp--;

					stream_expression.add(expression150.getTree());
					char_literal151=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1203);  
					stream_CParen.add(char_literal151);

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
					// 142:32: -> ^( FUNC_CALL MirrorY expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:35: ^( FUNC_CALL MirrorY expression )
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
				case 17 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:6: Union '(' ( exprList )? ')'
					{
					Union152=(Token)match(input,Union,FOLLOW_Union_in_transformCall1219);  
					stream_Union.add(Union152);

					char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1221);  
					stream_OParen.add(char_literal153);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:16: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ATan||LA29_0==Assert||LA29_0==Bool||LA29_0==COLOR_CONSTANT||LA29_0==Clip||(LA29_0 >= Copy && LA29_0 <= Curve)||LA29_0==Difference||LA29_0==Ellipse||(LA29_0 >= Excl && LA29_0 <= Expand)||LA29_0==Fill||(LA29_0 >= GetDistance && LA29_0 <= Hide)||LA29_0==Identifier||LA29_0==LAdd||(LA29_0 >= LRemove && LA29_0 <= LShape)||(LA29_0 >= Line && LA29_0 <= MirrorY)||(LA29_0 >= Move && LA29_0 <= MoveBy)||(LA29_0 >= NoFill && LA29_0 <= Number)||(LA29_0 >= OBracket && LA29_0 <= OParen)||(LA29_0 >= PI_CONSTANT && LA29_0 <= Polygon)||(LA29_0 >= Print && LA29_0 <= Println)||(LA29_0 >= Random && LA29_0 <= Rect)||(LA29_0 >= Rotate && LA29_0 <= Round)||(LA29_0 >= Scale && LA29_0 <= SkirtBack)||(LA29_0 >= String && LA29_0 <= Subtract)||LA29_0==Tan||(LA29_0 >= Union && LA29_0 <= Weight)||LA29_0==Xor) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1223);
							exprList154=exprList();
							state._fsp--;

							stream_exprList.add(exprList154.getTree());
							}
							break;

					}

					char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1226);  
					stream_CParen.add(char_literal155);

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
					// 143:29: -> ^( FUNC_CALL Union ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:32: ^( FUNC_CALL Union ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Union.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:50: ( exprList )?
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
				case 18 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: Difference '(' ( exprList )? ')'
					{
					Difference156=(Token)match(input,Difference,FOLLOW_Difference_in_transformCall1243);  
					stream_Difference.add(Difference156);

					char_literal157=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1245);  
					stream_OParen.add(char_literal157);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:21: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||LA30_0==Assert||LA30_0==Bool||LA30_0==COLOR_CONSTANT||LA30_0==Clip||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Difference||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||LA30_0==Fill||(LA30_0 >= GetDistance && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= MirrorY)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Polygon)||(LA30_0 >= Print && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= SkirtBack)||(LA30_0 >= String && LA30_0 <= Subtract)||LA30_0==Tan||(LA30_0 >= Union && LA30_0 <= Weight)||LA30_0==Xor) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1247);
							exprList158=exprList();
							state._fsp--;

							stream_exprList.add(exprList158.getTree());
							}
							break;

					}

					char_literal159=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1250);  
					stream_CParen.add(char_literal159);

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
					// 144:34: -> ^( FUNC_CALL Difference ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:37: ^( FUNC_CALL Difference ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Difference.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:60: ( exprList )?
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
				case 19 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:6: Clip '(' ( exprList )? ')'
					{
					Clip160=(Token)match(input,Clip,FOLLOW_Clip_in_transformCall1267);  
					stream_Clip.add(Clip160);

					char_literal161=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1269);  
					stream_OParen.add(char_literal161);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:15: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ATan||LA31_0==Assert||LA31_0==Bool||LA31_0==COLOR_CONSTANT||LA31_0==Clip||(LA31_0 >= Copy && LA31_0 <= Curve)||LA31_0==Difference||LA31_0==Ellipse||(LA31_0 >= Excl && LA31_0 <= Expand)||LA31_0==Fill||(LA31_0 >= GetDistance && LA31_0 <= Hide)||LA31_0==Identifier||LA31_0==LAdd||(LA31_0 >= LRemove && LA31_0 <= LShape)||(LA31_0 >= Line && LA31_0 <= MirrorY)||(LA31_0 >= Move && LA31_0 <= MoveBy)||(LA31_0 >= NoFill && LA31_0 <= Number)||(LA31_0 >= OBracket && LA31_0 <= OParen)||(LA31_0 >= PI_CONSTANT && LA31_0 <= Polygon)||(LA31_0 >= Print && LA31_0 <= Println)||(LA31_0 >= Random && LA31_0 <= Rect)||(LA31_0 >= Rotate && LA31_0 <= Round)||(LA31_0 >= Scale && LA31_0 <= SkirtBack)||(LA31_0 >= String && LA31_0 <= Subtract)||LA31_0==Tan||(LA31_0 >= Union && LA31_0 <= Weight)||LA31_0==Xor) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1271);
							exprList162=exprList();
							state._fsp--;

							stream_exprList.add(exprList162.getTree());
							}
							break;

					}

					char_literal163=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1274);  
					stream_CParen.add(char_literal163);

					// AST REWRITE
					// elements: Clip, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:28: -> ^( FUNC_CALL Clip ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:31: ^( FUNC_CALL Clip ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Clip.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:48: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:6: Xor '(' ( exprList )? ')'
					{
					Xor164=(Token)match(input,Xor,FOLLOW_Xor_in_transformCall1291);  
					stream_Xor.add(Xor164);

					char_literal165=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1293);  
					stream_OParen.add(char_literal165);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:14: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ATan||LA32_0==Assert||LA32_0==Bool||LA32_0==COLOR_CONSTANT||LA32_0==Clip||(LA32_0 >= Copy && LA32_0 <= Curve)||LA32_0==Difference||LA32_0==Ellipse||(LA32_0 >= Excl && LA32_0 <= Expand)||LA32_0==Fill||(LA32_0 >= GetDistance && LA32_0 <= Hide)||LA32_0==Identifier||LA32_0==LAdd||(LA32_0 >= LRemove && LA32_0 <= LShape)||(LA32_0 >= Line && LA32_0 <= MirrorY)||(LA32_0 >= Move && LA32_0 <= MoveBy)||(LA32_0 >= NoFill && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= PI_CONSTANT && LA32_0 <= Polygon)||(LA32_0 >= Print && LA32_0 <= Println)||(LA32_0 >= Random && LA32_0 <= Rect)||(LA32_0 >= Rotate && LA32_0 <= Round)||(LA32_0 >= Scale && LA32_0 <= SkirtBack)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==Tan||(LA32_0 >= Union && LA32_0 <= Weight)||LA32_0==Xor) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1295);
							exprList166=exprList();
							state._fsp--;

							stream_exprList.add(exprList166.getTree());
							}
							break;

					}

					char_literal167=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1298);  
					stream_CParen.add(char_literal167);

					// AST REWRITE
					// elements: Xor, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:27: -> ^( FUNC_CALL Xor ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:30: ^( FUNC_CALL Xor ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Xor.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:46: ( exprList )?
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


	public static class getCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) );
	public final PogoParser.getCall_return getCall() throws RecognitionException {
		PogoParser.getCall_return retval = new PogoParser.getCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GetWidth168=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token GetHeight172=null;
		Token char_literal173=null;
		Token char_literal175=null;
		Token GetX176=null;
		Token char_literal177=null;
		Token char_literal179=null;
		Token GetY180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token GetOrigin184=null;
		Token char_literal185=null;
		Token char_literal187=null;
		Token GetRotation188=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token GetFill192=null;
		Token char_literal193=null;
		Token char_literal195=null;
		Token GetStroke196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token GetStart200=null;
		Token char_literal201=null;
		Token char_literal203=null;
		Token GetEnd204=null;
		Token char_literal205=null;
		Token char_literal207=null;
		Token GetDistance208=null;
		Token char_literal209=null;
		Token char_literal211=null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression174 =null;
		ParserRuleReturnScope expression178 =null;
		ParserRuleReturnScope expression182 =null;
		ParserRuleReturnScope expression186 =null;
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope expression198 =null;
		ParserRuleReturnScope expression202 =null;
		ParserRuleReturnScope expression206 =null;
		ParserRuleReturnScope exprList210 =null;

		Object GetWidth168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal171_tree=null;
		Object GetHeight172_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;
		Object GetX176_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		Object GetY180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		Object GetOrigin184_tree=null;
		Object char_literal185_tree=null;
		Object char_literal187_tree=null;
		Object GetRotation188_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object GetFill192_tree=null;
		Object char_literal193_tree=null;
		Object char_literal195_tree=null;
		Object GetStroke196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		Object GetStart200_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;
		Object GetEnd204_tree=null;
		Object char_literal205_tree=null;
		Object char_literal207_tree=null;
		Object GetDistance208_tree=null;
		Object char_literal209_tree=null;
		Object char_literal211_tree=null;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt35=11;
			switch ( input.LA(1) ) {
			case GetWidth:
				{
				alt35=1;
				}
				break;
			case GetHeight:
				{
				alt35=2;
				}
				break;
			case GetX:
				{
				alt35=3;
				}
				break;
			case GetY:
				{
				alt35=4;
				}
				break;
			case GetOrigin:
				{
				alt35=5;
				}
				break;
			case GetRotation:
				{
				alt35=6;
				}
				break;
			case GetFill:
				{
				alt35=7;
				}
				break;
			case GetStroke:
				{
				alt35=8;
				}
				break;
			case GetStart:
				{
				alt35=9;
				}
				break;
			case GetEnd:
				{
				alt35=10;
				}
				break;
			case GetDistance:
				{
				alt35=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:5: GetWidth '(' expression ')'
					{
					GetWidth168=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1332);  
					stream_GetWidth.add(GetWidth168);

					char_literal169=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1334);  
					stream_OParen.add(char_literal169);

					pushFollow(FOLLOW_expression_in_getCall1336);
					expression170=expression();
					state._fsp--;

					stream_expression.add(expression170.getTree());
					char_literal171=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1338);  
					stream_CParen.add(char_literal171);

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
					// 151:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:35: ^( FUNC_CALL GetWidth expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:4: GetHeight '(' expression ')'
					{
					GetHeight172=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1352);  
					stream_GetHeight.add(GetHeight172);

					char_literal173=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1354);  
					stream_OParen.add(char_literal173);

					pushFollow(FOLLOW_expression_in_getCall1356);
					expression174=expression();
					state._fsp--;

					stream_expression.add(expression174.getTree());
					char_literal175=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1358);  
					stream_CParen.add(char_literal175);

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
					// 152:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:35: ^( FUNC_CALL GetHeight expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:4: GetX '(' expression ')'
					{
					GetX176=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1372);  
					stream_GetX.add(GetX176);

					char_literal177=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1374);  
					stream_OParen.add(char_literal177);

					pushFollow(FOLLOW_expression_in_getCall1376);
					expression178=expression();
					state._fsp--;

					stream_expression.add(expression178.getTree());
					char_literal179=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1378);  
					stream_CParen.add(char_literal179);

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
					// 153:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:30: ^( FUNC_CALL GetX expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:4: GetY '(' expression ')'
					{
					GetY180=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1392);  
					stream_GetY.add(GetY180);

					char_literal181=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1394);  
					stream_OParen.add(char_literal181);

					pushFollow(FOLLOW_expression_in_getCall1396);
					expression182=expression();
					state._fsp--;

					stream_expression.add(expression182.getTree());
					char_literal183=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1398);  
					stream_CParen.add(char_literal183);

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
					// 154:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:30: ^( FUNC_CALL GetY expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:4: GetOrigin '(' expression ')'
					{
					GetOrigin184=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1412);  
					stream_GetOrigin.add(GetOrigin184);

					char_literal185=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1414);  
					stream_OParen.add(char_literal185);

					pushFollow(FOLLOW_expression_in_getCall1416);
					expression186=expression();
					state._fsp--;

					stream_expression.add(expression186.getTree());
					char_literal187=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1418);  
					stream_CParen.add(char_literal187);

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
					// 155:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:35: ^( FUNC_CALL GetOrigin expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:4: GetRotation '(' expression ')'
					{
					GetRotation188=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1432);  
					stream_GetRotation.add(GetRotation188);

					char_literal189=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1434);  
					stream_OParen.add(char_literal189);

					pushFollow(FOLLOW_expression_in_getCall1436);
					expression190=expression();
					state._fsp--;

					stream_expression.add(expression190.getTree());
					char_literal191=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1438);  
					stream_CParen.add(char_literal191);

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
					// 156:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:37: ^( FUNC_CALL GetRotation expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:4: GetFill '(' expression ')'
					{
					GetFill192=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1452);  
					stream_GetFill.add(GetFill192);

					char_literal193=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1454);  
					stream_OParen.add(char_literal193);

					pushFollow(FOLLOW_expression_in_getCall1456);
					expression194=expression();
					state._fsp--;

					stream_expression.add(expression194.getTree());
					char_literal195=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1458);  
					stream_CParen.add(char_literal195);

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
					// 157:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:33: ^( FUNC_CALL GetFill expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:4: GetStroke '(' expression ')'
					{
					GetStroke196=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1472);  
					stream_GetStroke.add(GetStroke196);

					char_literal197=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1474);  
					stream_OParen.add(char_literal197);

					pushFollow(FOLLOW_expression_in_getCall1476);
					expression198=expression();
					state._fsp--;

					stream_expression.add(expression198.getTree());
					char_literal199=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1478);  
					stream_CParen.add(char_literal199);

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
					// 158:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:35: ^( FUNC_CALL GetStroke expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:4: GetStart '(' expression ')'
					{
					GetStart200=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1492);  
					stream_GetStart.add(GetStart200);

					char_literal201=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1494);  
					stream_OParen.add(char_literal201);

					pushFollow(FOLLOW_expression_in_getCall1496);
					expression202=expression();
					state._fsp--;

					stream_expression.add(expression202.getTree());
					char_literal203=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1498);  
					stream_CParen.add(char_literal203);

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
					// 159:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:34: ^( FUNC_CALL GetStart expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:4: GetEnd '(' expression ')'
					{
					GetEnd204=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1512);  
					stream_GetEnd.add(GetEnd204);

					char_literal205=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1514);  
					stream_OParen.add(char_literal205);

					pushFollow(FOLLOW_expression_in_getCall1516);
					expression206=expression();
					state._fsp--;

					stream_expression.add(expression206.getTree());
					char_literal207=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1518);  
					stream_CParen.add(char_literal207);

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
					// 160:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:32: ^( FUNC_CALL GetEnd expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:5: GetDistance '(' ( exprList )? ')'
					{
					GetDistance208=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1534);  
					stream_GetDistance.add(GetDistance208);

					char_literal209=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1536);  
					stream_OParen.add(char_literal209);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:21: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ATan||LA34_0==Assert||LA34_0==Bool||LA34_0==COLOR_CONSTANT||LA34_0==Clip||(LA34_0 >= Copy && LA34_0 <= Curve)||LA34_0==Difference||LA34_0==Ellipse||(LA34_0 >= Excl && LA34_0 <= Expand)||LA34_0==Fill||(LA34_0 >= GetDistance && LA34_0 <= Hide)||LA34_0==Identifier||LA34_0==LAdd||(LA34_0 >= LRemove && LA34_0 <= LShape)||(LA34_0 >= Line && LA34_0 <= MirrorY)||(LA34_0 >= Move && LA34_0 <= MoveBy)||(LA34_0 >= NoFill && LA34_0 <= Number)||(LA34_0 >= OBracket && LA34_0 <= OParen)||(LA34_0 >= PI_CONSTANT && LA34_0 <= Polygon)||(LA34_0 >= Print && LA34_0 <= Println)||(LA34_0 >= Random && LA34_0 <= Rect)||(LA34_0 >= Rotate && LA34_0 <= Round)||(LA34_0 >= Scale && LA34_0 <= SkirtBack)||(LA34_0 >= String && LA34_0 <= Subtract)||LA34_0==Tan||(LA34_0 >= Union && LA34_0 <= Weight)||LA34_0==Xor) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1538);
							exprList210=exprList();
							state._fsp--;

							stream_exprList.add(exprList210.getTree());
							}
							break;

					}

					char_literal211=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1542);  
					stream_CParen.add(char_literal211);

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
					// 161:35: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:38: ^( FUNC_CALL GetDistance ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetDistance.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:62: ( exprList )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine212=null;
		Token char_literal213=null;
		Token char_literal215=null;
		Token Sine216=null;
		Token char_literal217=null;
		Token char_literal219=null;
		Token Tan220=null;
		Token char_literal221=null;
		Token char_literal223=null;
		Token ATan224=null;
		Token char_literal225=null;
		Token char_literal227=null;
		Token Random228=null;
		Token char_literal229=null;
		Token char_literal231=null;
		Token Round232=null;
		Token char_literal233=null;
		Token char_literal235=null;
		Token Map236=null;
		Token char_literal237=null;
		Token char_literal239=null;
		ParserRuleReturnScope expression214 =null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope expression222 =null;
		ParserRuleReturnScope expression226 =null;
		ParserRuleReturnScope exprList230 =null;
		ParserRuleReturnScope expression234 =null;
		ParserRuleReturnScope exprList238 =null;

		Object Cosine212_tree=null;
		Object char_literal213_tree=null;
		Object char_literal215_tree=null;
		Object Sine216_tree=null;
		Object char_literal217_tree=null;
		Object char_literal219_tree=null;
		Object Tan220_tree=null;
		Object char_literal221_tree=null;
		Object char_literal223_tree=null;
		Object ATan224_tree=null;
		Object char_literal225_tree=null;
		Object char_literal227_tree=null;
		Object Random228_tree=null;
		Object char_literal229_tree=null;
		Object char_literal231_tree=null;
		Object Round232_tree=null;
		Object char_literal233_tree=null;
		Object char_literal235_tree=null;
		Object Map236_tree=null;
		Object char_literal237_tree=null;
		Object char_literal239_tree=null;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) )
			int alt38=7;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt38=1;
				}
				break;
			case Sine:
				{
				alt38=2;
				}
				break;
			case Tan:
				{
				alt38=3;
				}
				break;
			case ATan:
				{
				alt38=4;
				}
				break;
			case Random:
				{
				alt38=5;
				}
				break;
			case Round:
				{
				alt38=6;
				}
				break;
			case Map:
				{
				alt38=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:6: Cosine '(' expression ')'
					{
					Cosine212=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1574);  
					stream_Cosine.add(Cosine212);

					char_literal213=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1576);  
					stream_OParen.add(char_literal213);

					pushFollow(FOLLOW_expression_in_mathCall1578);
					expression214=expression();
					state._fsp--;

					stream_expression.add(expression214.getTree());
					char_literal215=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1580);  
					stream_CParen.add(char_literal215);

					// AST REWRITE
					// elements: Cosine, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 165:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:6: Sine '(' expression ')'
					{
					Sine216=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1599);  
					stream_Sine.add(Sine216);

					char_literal217=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1601);  
					stream_OParen.add(char_literal217);

					pushFollow(FOLLOW_expression_in_mathCall1603);
					expression218=expression();
					state._fsp--;

					stream_expression.add(expression218.getTree());
					char_literal219=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1605);  
					stream_CParen.add(char_literal219);

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
					// 166:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:35: ^( FUNC_CALL Sine expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:6: Tan '(' expression ')'
					{
					Tan220=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1624);  
					stream_Tan.add(Tan220);

					char_literal221=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1626);  
					stream_OParen.add(char_literal221);

					pushFollow(FOLLOW_expression_in_mathCall1628);
					expression222=expression();
					state._fsp--;

					stream_expression.add(expression222.getTree());
					char_literal223=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1630);  
					stream_CParen.add(char_literal223);

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
					// 167:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:34: ^( FUNC_CALL Tan expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:6: ATan '(' expression ')'
					{
					ATan224=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1649);  
					stream_ATan.add(ATan224);

					char_literal225=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1651);  
					stream_OParen.add(char_literal225);

					pushFollow(FOLLOW_expression_in_mathCall1653);
					expression226=expression();
					state._fsp--;

					stream_expression.add(expression226.getTree());
					char_literal227=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1655);  
					stream_CParen.add(char_literal227);

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
					// 168:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:35: ^( FUNC_CALL ATan expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:6: Random '(' ( exprList )? ')'
					{
					Random228=(Token)match(input,Random,FOLLOW_Random_in_mathCall1674);  
					stream_Random.add(Random228);

					char_literal229=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1676);  
					stream_OParen.add(char_literal229);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:17: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==ATan||LA36_0==Assert||LA36_0==Bool||LA36_0==COLOR_CONSTANT||LA36_0==Clip||(LA36_0 >= Copy && LA36_0 <= Curve)||LA36_0==Difference||LA36_0==Ellipse||(LA36_0 >= Excl && LA36_0 <= Expand)||LA36_0==Fill||(LA36_0 >= GetDistance && LA36_0 <= Hide)||LA36_0==Identifier||LA36_0==LAdd||(LA36_0 >= LRemove && LA36_0 <= LShape)||(LA36_0 >= Line && LA36_0 <= MirrorY)||(LA36_0 >= Move && LA36_0 <= MoveBy)||(LA36_0 >= NoFill && LA36_0 <= Number)||(LA36_0 >= OBracket && LA36_0 <= OParen)||(LA36_0 >= PI_CONSTANT && LA36_0 <= Polygon)||(LA36_0 >= Print && LA36_0 <= Println)||(LA36_0 >= Random && LA36_0 <= Rect)||(LA36_0 >= Rotate && LA36_0 <= Round)||(LA36_0 >= Scale && LA36_0 <= SkirtBack)||(LA36_0 >= String && LA36_0 <= Subtract)||LA36_0==Tan||(LA36_0 >= Union && LA36_0 <= Weight)||LA36_0==Xor) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1678);
							exprList230=exprList();
							state._fsp--;

							stream_exprList.add(exprList230.getTree());
							}
							break;

					}

					char_literal231=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1681);  
					stream_CParen.add(char_literal231);

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
					// 169:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:36: ^( FUNC_CALL Random ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:55: ( exprList )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:6: Round '(' expression ')'
					{
					Round232=(Token)match(input,Round,FOLLOW_Round_in_mathCall1701);  
					stream_Round.add(Round232);

					char_literal233=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1702);  
					stream_OParen.add(char_literal233);

					pushFollow(FOLLOW_expression_in_mathCall1704);
					expression234=expression();
					state._fsp--;

					stream_expression.add(expression234.getTree());
					char_literal235=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1706);  
					stream_CParen.add(char_literal235);

					// AST REWRITE
					// elements: expression, Round
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:35: ^( FUNC_CALL Round expression )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:6: Map '(' ( exprList )? ')'
					{
					Map236=(Token)match(input,Map,FOLLOW_Map_in_mathCall1725);  
					stream_Map.add(Map236);

					char_literal237=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1726);  
					stream_OParen.add(char_literal237);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:13: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==ATan||LA37_0==Assert||LA37_0==Bool||LA37_0==COLOR_CONSTANT||LA37_0==Clip||(LA37_0 >= Copy && LA37_0 <= Curve)||LA37_0==Difference||LA37_0==Ellipse||(LA37_0 >= Excl && LA37_0 <= Expand)||LA37_0==Fill||(LA37_0 >= GetDistance && LA37_0 <= Hide)||LA37_0==Identifier||LA37_0==LAdd||(LA37_0 >= LRemove && LA37_0 <= LShape)||(LA37_0 >= Line && LA37_0 <= MirrorY)||(LA37_0 >= Move && LA37_0 <= MoveBy)||(LA37_0 >= NoFill && LA37_0 <= Number)||(LA37_0 >= OBracket && LA37_0 <= OParen)||(LA37_0 >= PI_CONSTANT && LA37_0 <= Polygon)||(LA37_0 >= Print && LA37_0 <= Println)||(LA37_0 >= Random && LA37_0 <= Rect)||(LA37_0 >= Rotate && LA37_0 <= Round)||(LA37_0 >= Scale && LA37_0 <= SkirtBack)||(LA37_0 >= String && LA37_0 <= Subtract)||LA37_0==Tan||(LA37_0 >= Union && LA37_0 <= Weight)||LA37_0==Xor) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1728);
							exprList238=exprList();
							state._fsp--;

							stream_exprList.add(exprList238.getTree());
							}
							break;

					}

					char_literal239=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1731);  
					stream_CParen.add(char_literal239);

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
					// 171:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:32: ^( FUNC_CALL Map ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:48: ( exprList )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End243=null;
		ParserRuleReturnScope ifStat240 =null;
		ParserRuleReturnScope elseIfStat241 =null;
		ParserRuleReturnScope elseStat242 =null;

		Object End243_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1766);
			ifStat240=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat240.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:13: ( elseIfStat )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Else) ) {
					int LA39_1 = input.LA(2);
					if ( (LA39_1==If) ) {
						alt39=1;
					}

				}

				switch (alt39) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1768);
					elseIfStat241=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat241.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:25: ( elseStat )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Else) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1771);
					elseStat242=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat242.getTree());
					}
					break;

			}

			End243=(Token)match(input,End,FOLLOW_End_in_ifStatement1774);  
			stream_End.add(End243);

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
			// 177:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:66: ( elseStat )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If244=null;
		Token Do246=null;
		ParserRuleReturnScope expression245 =null;
		ParserRuleReturnScope block247 =null;

		Object If244_tree=null;
		Object Do246_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: If expression Do block
			{
			If244=(Token)match(input,If,FOLLOW_If_in_ifStat1803);  
			stream_If.add(If244);

			pushFollow(FOLLOW_expression_in_ifStat1805);
			expression245=expression();
			state._fsp--;

			stream_expression.add(expression245.getTree());
			Do246=(Token)match(input,Do,FOLLOW_Do_in_ifStat1807);  
			stream_Do.add(Do246);

			pushFollow(FOLLOW_block_in_ifStat1809);
			block247=block();
			state._fsp--;

			stream_block.add(block247.getTree());
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
			// 182:29: -> ^( EXP expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:32: ^( EXP expression block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else248=null;
		Token If249=null;
		Token Do251=null;
		ParserRuleReturnScope expression250 =null;
		ParserRuleReturnScope block252 =null;

		Object Else248_tree=null;
		Object If249_tree=null;
		Object Do251_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:6: Else If expression Do block
			{
			Else248=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1833);  
			stream_Else.add(Else248);

			If249=(Token)match(input,If,FOLLOW_If_in_elseIfStat1835);  
			stream_If.add(If249);

			pushFollow(FOLLOW_expression_in_elseIfStat1837);
			expression250=expression();
			state._fsp--;

			stream_expression.add(expression250.getTree());
			Do251=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1839);  
			stream_Do.add(Do251);

			pushFollow(FOLLOW_block_in_elseIfStat1841);
			block252=block();
			state._fsp--;

			stream_block.add(block252.getTree());
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
			// 186:34: -> ^( EXP expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:37: ^( EXP expression block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else253=null;
		Token Do254=null;
		ParserRuleReturnScope block255 =null;

		Object Else253_tree=null;
		Object Do254_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:3: ( Else Do block -> ^( EXP block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:6: Else Do block
			{
			Else253=(Token)match(input,Else,FOLLOW_Else_in_elseStat1865);  
			stream_Else.add(Else253);

			Do254=(Token)match(input,Do,FOLLOW_Do_in_elseStat1867);  
			stream_Do.add(Do254);

			pushFollow(FOLLOW_block_in_elseStat1869);
			block255=block();
			state._fsp--;

			stream_block.add(block255.getTree());
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
			// 190:20: -> ^( EXP block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:23: ^( EXP block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def256=null;
		Token Identifier257=null;
		Token char_literal258=null;
		Token char_literal260=null;
		Token Do261=null;
		Token End263=null;
		ParserRuleReturnScope idList259 =null;
		ParserRuleReturnScope block262 =null;

		Object Def256_tree=null;
		Object Identifier257_tree=null;
		Object char_literal258_tree=null;
		Object char_literal260_tree=null;
		Object Do261_tree=null;
		Object End263_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def256=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1891); 
			Def256_tree = (Object)adaptor.create(Def256);
			adaptor.addChild(root_0, Def256_tree);

			Identifier257=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1893); 
			Identifier257_tree = (Object)adaptor.create(Identifier257);
			adaptor.addChild(root_0, Identifier257_tree);

			char_literal258=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1895); 
			char_literal258_tree = (Object)adaptor.create(char_literal258);
			adaptor.addChild(root_0, char_literal258_tree);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:25: ( idList )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Identifier) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1897);
					idList259=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList259.getTree());

					}
					break;

			}

			char_literal260=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1900); 
			char_literal260_tree = (Object)adaptor.create(char_literal260);
			adaptor.addChild(root_0, char_literal260_tree);

			Do261=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1902); 
			Do261_tree = (Object)adaptor.create(Do261);
			adaptor.addChild(root_0, Do261_tree);

			pushFollow(FOLLOW_block_in_functionDecl1904);
			block262=block();
			state._fsp--;

			adaptor.addChild(root_0, block262.getTree());

			End263=(Token)match(input,End,FOLLOW_End_in_functionDecl1906); 
			End263_tree = (Object)adaptor.create(End263);
			adaptor.addChild(root_0, End263_tree);

			defineFunction((Identifier257!=null?Identifier257.getText():null), (idList259!=null?((Object)idList259.getTree()):null), (block262!=null?((Object)block262.getTree()):null));
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For264=null;
		Token Identifier265=null;
		Token char_literal266=null;
		Token Do268=null;
		Token Do270=null;
		Token End272=null;
		ParserRuleReturnScope expression267 =null;
		ParserRuleReturnScope expression269 =null;
		ParserRuleReturnScope block271 =null;

		Object For264_tree=null;
		Object Identifier265_tree=null;
		Object char_literal266_tree=null;
		Object Do268_tree=null;
		Object Do270_tree=null;
		Object End272_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:6: For Identifier '=' expression Do expression Do block End
			{
			For264=(Token)match(input,For,FOLLOW_For_in_forStatement1928);  
			stream_For.add(For264);

			Identifier265=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1930);  
			stream_Identifier.add(Identifier265);

			char_literal266=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1932);  
			stream_Assign.add(char_literal266);

			pushFollow(FOLLOW_expression_in_forStatement1934);
			expression267=expression();
			state._fsp--;

			stream_expression.add(expression267.getTree());
			Do268=(Token)match(input,Do,FOLLOW_Do_in_forStatement1936);  
			stream_Do.add(Do268);

			pushFollow(FOLLOW_expression_in_forStatement1938);
			expression269=expression();
			state._fsp--;

			stream_expression.add(expression269.getTree());
			Do270=(Token)match(input,Do,FOLLOW_Do_in_forStatement1940);  
			stream_Do.add(Do270);

			pushFollow(FOLLOW_block_in_forStatement1942);
			block271=block();
			state._fsp--;

			stream_block.add(block271.getTree());
			End272=(Token)match(input,End,FOLLOW_End_in_forStatement1944);  
			stream_End.add(End272);

			// AST REWRITE
			// elements: expression, For, Identifier, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 200:6: -> ^( For Identifier expression expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:200:9: ^( For Identifier expression expression block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat273=null;
		Token Identifier274=null;
		Token char_literal275=null;
		Token Do277=null;
		Token char_literal279=null;
		Token Do281=null;
		Token End283=null;
		ParserRuleReturnScope expression276 =null;
		ParserRuleReturnScope expression278 =null;
		ParserRuleReturnScope expression280 =null;
		ParserRuleReturnScope block282 =null;

		Object Repeat273_tree=null;
		Object Identifier274_tree=null;
		Object char_literal275_tree=null;
		Object Do277_tree=null;
		Object char_literal279_tree=null;
		Object Do281_tree=null;
		Object End283_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat273=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1977);  
			stream_Repeat.add(Repeat273);

			Identifier274=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1979);  
			stream_Identifier.add(Identifier274);

			char_literal275=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1981);  
			stream_Assign.add(char_literal275);

			pushFollow(FOLLOW_expression_in_repeatStatement1983);
			expression276=expression();
			state._fsp--;

			stream_expression.add(expression276.getTree());
			Do277=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1985);  
			stream_Do.add(Do277);

			pushFollow(FOLLOW_expression_in_repeatStatement1987);
			expression278=expression();
			state._fsp--;

			stream_expression.add(expression278.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:52: ( '|' expression )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==144) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:53: '|' expression
					{
					char_literal279=(Token)match(input,144,FOLLOW_144_in_repeatStatement1990);  
					stream_144.add(char_literal279);

					pushFollow(FOLLOW_expression_in_repeatStatement1992);
					expression280=expression();
					state._fsp--;

					stream_expression.add(expression280.getTree());
					}
					break;

				default :
					break loop42;
				}
			}

			Do281=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1996);  
			stream_Do.add(Do281);

			pushFollow(FOLLOW_block_in_repeatStatement1998);
			block282=block();
			state._fsp--;

			stream_block.add(block282.getTree());
			End283=(Token)match(input,End,FOLLOW_End_in_repeatStatement2000);  
			stream_End.add(End283);

			// AST REWRITE
			// elements: Repeat, Identifier, block, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 204:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:86: ^( Repeat Identifier expression expression block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While284=null;
		Token Do286=null;
		Token End288=null;
		ParserRuleReturnScope expression285 =null;
		ParserRuleReturnScope block287 =null;

		Object While284_tree=null;
		Object Do286_tree=null;
		Object End288_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:6: While expression Do block End
			{
			While284=(Token)match(input,While,FOLLOW_While_in_whileStatement2028);  
			stream_While.add(While284);

			pushFollow(FOLLOW_expression_in_whileStatement2030);
			expression285=expression();
			state._fsp--;

			stream_expression.add(expression285.getTree());
			Do286=(Token)match(input,Do,FOLLOW_Do_in_whileStatement2032);  
			stream_Do.add(Do286);

			pushFollow(FOLLOW_block_in_whileStatement2034);
			block287=block();
			state._fsp--;

			stream_block.add(block287.getTree());
			End288=(Token)match(input,End,FOLLOW_End_in_whileStatement2036);  
			stream_End.add(End288);

			// AST REWRITE
			// elements: block, While, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 208:36: -> ^( While expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:39: ^( While expression block )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier289=null;
		Token char_literal290=null;
		Token Identifier291=null;

		Object Identifier289_tree=null;
		Object char_literal290_tree=null;
		Object Identifier291_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:6: Identifier ( ',' Identifier )*
			{
			Identifier289=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2060);  
			stream_Identifier.add(Identifier289);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:17: ( ',' Identifier )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==Comma) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:18: ',' Identifier
					{
					char_literal290=(Token)match(input,Comma,FOLLOW_Comma_in_idList2063);  
					stream_Comma.add(char_literal290);

					Identifier291=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2065);  
					stream_Identifier.add(Identifier291);

					}
					break;

				default :
					break loop43;
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
			// 212:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal293=null;
		ParserRuleReturnScope expression292 =null;
		ParserRuleReturnScope expression294 =null;

		Object char_literal293_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList2090);
			expression292=expression();
			state._fsp--;

			stream_expression.add(expression292.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:17: ( ',' expression )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==Comma) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:18: ',' expression
					{
					char_literal293=(Token)match(input,Comma,FOLLOW_Comma_in_exprList2093);  
					stream_Comma.add(char_literal293);

					pushFollow(FOLLOW_expression_in_exprList2095);
					expression294=expression();
					state._fsp--;

					stream_expression.add(expression294.getTree());
					}
					break;

				default :
					break loop44;
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
			// 216:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:219:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr295 =null;


		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:3: ( condExpr )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression2120);
			condExpr295=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr295.getTree());

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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal297=null;
		Token char_literal298=null;
		Token In299=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr296 =null;
		ParserRuleReturnScope expression300 =null;

		Object char_literal297_tree=null;
		Object char_literal298_tree=null;
		Object In299_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: ( orExpr -> orExpr )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr2135);
			orExpr296=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr296.getTree());
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
			// 224:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt45=3;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==QMark) ) {
				alt45=1;
			}
			else if ( (LA45_0==In) ) {
				alt45=2;
			}
			switch (alt45) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:8: '?' a= expression ':' b= expression
					{
					char_literal297=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr2150);  
					stream_QMark.add(char_literal297);

					pushFollow(FOLLOW_expression_in_condExpr2154);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal298=(Token)match(input,Do,FOLLOW_Do_in_condExpr2156);  
					stream_Do.add(char_literal298);

					pushFollow(FOLLOW_expression_in_condExpr2160);
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
					// 225:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:45: ^( TERNARY orExpr $a $b)
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:226:8: In expression
					{
					In299=(Token)match(input,In,FOLLOW_In_in_condExpr2183);  
					stream_In.add(In299);

					pushFollow(FOLLOW_expression_in_condExpr2185);
					expression300=expression();
					state._fsp--;

					stream_expression.add(expression300.getTree());
					// AST REWRITE
					// elements: expression, orExpr, In
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:42: -> ^( In orExpr expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:226:45: ^( In orExpr expression )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal302=null;
		ParserRuleReturnScope andExpr301 =null;
		ParserRuleReturnScope andExpr303 =null;

		Object string_literal302_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr2237);
			andExpr301=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr301.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:14: ( '||' ^ andExpr )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==145) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:15: '||' ^ andExpr
					{
					string_literal302=(Token)match(input,145,FOLLOW_145_in_orExpr2240); 
					string_literal302_tree = (Object)adaptor.create(string_literal302);
					root_0 = (Object)adaptor.becomeRoot(string_literal302_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2243);
					andExpr303=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr303.getTree());

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
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal305=null;
		ParserRuleReturnScope equExpr304 =null;
		ParserRuleReturnScope equExpr306 =null;

		Object string_literal305_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr2259);
			equExpr304=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr304.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:14: ( '&&' ^ equExpr )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==142) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:15: '&&' ^ equExpr
					{
					string_literal305=(Token)match(input,142,FOLLOW_142_in_andExpr2262); 
					string_literal305_tree = (Object)adaptor.create(string_literal305);
					root_0 = (Object)adaptor.becomeRoot(string_literal305_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2265);
					equExpr306=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr306.getTree());

					}
					break;

				default :
					break loop47;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set308=null;
		ParserRuleReturnScope relExpr307 =null;
		ParserRuleReturnScope relExpr309 =null;

		Object set308_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr2281);
			relExpr307=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr307.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==Equals||LA48_0==NEquals) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:15: ( '==' | '!=' ) ^ relExpr
					{
					set308=input.LT(1);
					set308=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set308), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr2293);
					relExpr309=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr309.getTree());

					}
					break;

				default :
					break loop48;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set311=null;
		ParserRuleReturnScope addExpr310 =null;
		ParserRuleReturnScope addExpr312 =null;

		Object set311_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr2309);
			addExpr310=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr310.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( ((LA49_0 >= GT && LA49_0 <= GTEquals)||(LA49_0 >= LT && LA49_0 <= LTEquals)) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set311=input.LT(1);
					set311=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set311), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr2329);
					addExpr312=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr312.getTree());

					}
					break;

				default :
					break loop49;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:246:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set314=null;
		ParserRuleReturnScope mulExpr313 =null;
		ParserRuleReturnScope mulExpr315 =null;

		Object set314_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr2345);
			mulExpr313=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr313.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==Add||LA50_0==Subtract) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:15: ( '+' | '-' ) ^ mulExpr
					{
					set314=input.LT(1);
					set314=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set314), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr2357);
					mulExpr315=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr315.getTree());

					}
					break;

				default :
					break loop50;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set317=null;
		ParserRuleReturnScope powExpr316 =null;
		ParserRuleReturnScope powExpr318 =null;

		Object set317_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr2373);
			powExpr316=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr316.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Divide||LA51_0==Modulus||LA51_0==Multiply) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set317=input.LT(1);
					set317=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set317), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr2389);
					powExpr318=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr318.getTree());

					}
					break;

				default :
					break loop51;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal320=null;
		ParserRuleReturnScope unaryExpr319 =null;
		ParserRuleReturnScope unaryExpr321 =null;

		Object char_literal320_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr2405);
			unaryExpr319=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr319.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:16: ( '^' ^ unaryExpr )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==Pow) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:17: '^' ^ unaryExpr
					{
					char_literal320=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr2408); 
					char_literal320_tree = (Object)adaptor.create(char_literal320);
					root_0 = (Object)adaptor.becomeRoot(char_literal320_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr2411);
					unaryExpr321=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr321.getTree());

					}
					break;

				default :
					break loop52;
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal322=null;
		Token char_literal324=null;
		ParserRuleReturnScope atom323 =null;
		ParserRuleReturnScope atom325 =null;
		ParserRuleReturnScope atom326 =null;

		Object char_literal322_tree=null;
		Object char_literal324_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt53=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt53=1;
				}
				break;
			case Excl:
				{
				alt53=2;
				}
				break;
			case ATan:
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
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
			case MirrorY:
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
			case Skirt:
			case SkirtBack:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case WIDTH_CONSTANT:
			case Weight:
			case Xor:
				{
				alt53=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:6: '-' atom
					{
					char_literal322=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr2429);  
					stream_Subtract.add(char_literal322);

					pushFollow(FOLLOW_atom_in_unaryExpr2431);
					atom323=atom();
					state._fsp--;

					stream_atom.add(atom323.getTree());
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
					// 259:15: -> ^( UNARY_MIN atom )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:18: ^( UNARY_MIN atom )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:6: '!' atom
					{
					char_literal324=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr2446);  
					stream_Excl.add(char_literal324);

					pushFollow(FOLLOW_atom_in_unaryExpr2448);
					atom325=atom();
					state._fsp--;

					stream_atom.add(atom325.getTree());
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
					// 260:15: -> ^( NEGATE atom )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:18: ^( NEGATE atom )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr2463);
					atom326=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom326.getTree());

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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number327=null;
		Token Bool328=null;
		Token Null329=null;
		Token COLOR_CONSTANT331=null;
		Token PI_CONSTANT332=null;
		Token WIDTH_CONSTANT333=null;
		Token HEIGHT_CONSTANT334=null;
		ParserRuleReturnScope lookup330 =null;

		Object Number327_tree=null;
		Object Bool328_tree=null;
		Object Null329_tree=null;
		Object COLOR_CONSTANT331_tree=null;
		Object PI_CONSTANT332_tree=null;
		Object WIDTH_CONSTANT333_tree=null;
		Object HEIGHT_CONSTANT334_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt54=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt54=1;
				}
				break;
			case Bool:
				{
				alt54=2;
				}
				break;
			case Null:
				{
				alt54=3;
				}
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
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
			case MirrorY:
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
			case Skirt:
			case SkirtBack:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case Weight:
			case Xor:
				{
				alt54=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt54=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt54=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt54=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt54=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number327=(Token)match(input,Number,FOLLOW_Number_in_atom2477); 
					Number327_tree = (Object)adaptor.create(Number327);
					adaptor.addChild(root_0, Number327_tree);

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool328=(Token)match(input,Bool,FOLLOW_Bool_in_atom2484); 
					Bool328_tree = (Object)adaptor.create(Bool328);
					adaptor.addChild(root_0, Bool328_tree);

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:267:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null329=(Token)match(input,Null,FOLLOW_Null_in_atom2491); 
					Null329_tree = (Object)adaptor.create(Null329);
					adaptor.addChild(root_0, Null329_tree);

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom2498);
					lookup330=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup330.getTree());

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT331=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2504); 
					COLOR_CONSTANT331_tree = (Object)adaptor.create(COLOR_CONSTANT331);
					adaptor.addChild(root_0, COLOR_CONSTANT331_tree);

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT332=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2510); 
					PI_CONSTANT332_tree = (Object)adaptor.create(PI_CONSTANT332);
					adaptor.addChild(root_0, PI_CONSTANT332_tree);

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT333=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2516); 
					WIDTH_CONSTANT333_tree = (Object)adaptor.create(WIDTH_CONSTANT333);
					adaptor.addChild(root_0, WIDTH_CONSTANT333_tree);

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT334=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2522); 
					HEIGHT_CONSTANT334_tree = (Object)adaptor.create(HEIGHT_CONSTANT334);
					adaptor.addChild(root_0, HEIGHT_CONSTANT334_tree);

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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal335=null;
		Token char_literal337=null;
		ParserRuleReturnScope exprList336 =null;

		Object char_literal335_tree=null;
		Object char_literal337_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:6: '[' ( exprList )? ']'
			{
			char_literal335=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2536);  
			stream_OBracket.add(char_literal335);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:10: ( exprList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==ATan||LA55_0==Assert||LA55_0==Bool||LA55_0==COLOR_CONSTANT||LA55_0==Clip||(LA55_0 >= Copy && LA55_0 <= Curve)||LA55_0==Difference||LA55_0==Ellipse||(LA55_0 >= Excl && LA55_0 <= Expand)||LA55_0==Fill||(LA55_0 >= GetDistance && LA55_0 <= Hide)||LA55_0==Identifier||LA55_0==LAdd||(LA55_0 >= LRemove && LA55_0 <= LShape)||(LA55_0 >= Line && LA55_0 <= MirrorY)||(LA55_0 >= Move && LA55_0 <= MoveBy)||(LA55_0 >= NoFill && LA55_0 <= Number)||(LA55_0 >= OBracket && LA55_0 <= OParen)||(LA55_0 >= PI_CONSTANT && LA55_0 <= Polygon)||(LA55_0 >= Print && LA55_0 <= Println)||(LA55_0 >= Random && LA55_0 <= Rect)||(LA55_0 >= Rotate && LA55_0 <= Round)||(LA55_0 >= Scale && LA55_0 <= SkirtBack)||(LA55_0 >= String && LA55_0 <= Subtract)||LA55_0==Tan||(LA55_0 >= Union && LA55_0 <= Weight)||LA55_0==Xor) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2538);
					exprList336=exprList();
					state._fsp--;

					stream_exprList.add(exprList336.getTree());
					}
					break;

			}

			char_literal337=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2541);  
			stream_CBracket.add(char_literal337);

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
			// 276:24: -> ^( LIST ( exprList )? )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:34: ( exprList )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier343=null;
		Token String346=null;
		Token char_literal348=null;
		Token char_literal350=null;
		ParserRuleReturnScope functionCall338 =null;
		ParserRuleReturnScope indexes339 =null;
		ParserRuleReturnScope dotProperty340 =null;
		ParserRuleReturnScope list341 =null;
		ParserRuleReturnScope indexes342 =null;
		ParserRuleReturnScope indexes344 =null;
		ParserRuleReturnScope dotProperty345 =null;
		ParserRuleReturnScope indexes347 =null;
		ParserRuleReturnScope expression349 =null;
		ParserRuleReturnScope indexes351 =null;

		Object Identifier343_tree=null;
		Object String346_tree=null;
		Object char_literal348_tree=null;
		Object char_literal350_tree=null;
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt63=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA63_1 = input.LA(2);
				if ( (LA63_1==OParen) ) {
					alt63=1;
				}
				else if ( (LA63_1==Add||LA63_1==CBracket||LA63_1==CParen||LA63_1==Comma||(LA63_1 >= Divide && LA63_1 <= Do)||(LA63_1 >= DotEnd && LA63_1 <= DotY)||LA63_1==Equals||(LA63_1 >= GT && LA63_1 <= GTEquals)||LA63_1==In||(LA63_1 >= LT && LA63_1 <= LTEquals)||LA63_1==Modulus||LA63_1==Multiply||LA63_1==NEquals||LA63_1==OBracket||LA63_1==Pow||LA63_1==QMark||LA63_1==Subtract||(LA63_1 >= 142 && LA63_1 <= 145)) ) {
					alt63=3;
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
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
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
			case MirrorY:
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
			case Skirt:
			case SkirtBack:
			case Stroke:
			case Tan:
			case Union:
			case Weight:
			case Xor:
				{
				alt63=1;
				}
				break;
			case OBracket:
				{
				alt63=2;
				}
				break;
			case String:
				{
				alt63=4;
				}
				break;
			case OParen:
				{
				alt63=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2564);
					functionCall338=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall338.getTree());
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==Add||LA57_0==CBracket||LA57_0==CParen||LA57_0==Comma||(LA57_0 >= Divide && LA57_0 <= Do)||LA57_0==Equals||(LA57_0 >= GT && LA57_0 <= GTEquals)||LA57_0==In||(LA57_0 >= LT && LA57_0 <= LTEquals)||LA57_0==Modulus||LA57_0==Multiply||LA57_0==NEquals||LA57_0==OBracket||LA57_0==Pow||LA57_0==QMark||LA57_0==Subtract||(LA57_0 >= 142 && LA57_0 <= 145)) ) {
						alt57=1;
					}
					else if ( ((LA57_0 >= DotEnd && LA57_0 <= DotY)) ) {
						alt57=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}

					switch (alt57) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:20: ( indexes )?
							{
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:20: ( indexes )?
							int alt56=2;
							int LA56_0 = input.LA(1);
							if ( (LA56_0==OBracket) ) {
								alt56=1;
							}
							switch (alt56) {
								case 1 :
									// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2567);
									indexes339=indexes();
									state._fsp--;

									stream_indexes.add(indexes339.getTree());
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
							// 280:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:55: ( indexes )?
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2584);
							dotProperty340=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty340.getTree());
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
							// 280:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:83: ^( DOTPROPERTY functionCall dotProperty )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2609);
					list341=list();
					state._fsp--;

					stream_list.add(list341.getTree());
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:11: ( indexes )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==OBracket) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2611);
							indexes342=indexes();
							state._fsp--;

							stream_indexes.add(indexes342.getTree());
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
					// 281:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:51: ( indexes )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier343=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2644);  
					stream_Identifier.add(Identifier343);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==Add||LA60_0==CBracket||LA60_0==CParen||LA60_0==Comma||(LA60_0 >= Divide && LA60_0 <= Do)||LA60_0==Equals||(LA60_0 >= GT && LA60_0 <= GTEquals)||LA60_0==In||(LA60_0 >= LT && LA60_0 <= LTEquals)||LA60_0==Modulus||LA60_0==Multiply||LA60_0==NEquals||LA60_0==OBracket||LA60_0==Pow||LA60_0==QMark||LA60_0==Subtract||(LA60_0 >= 142 && LA60_0 <= 145)) ) {
						alt60=1;
					}
					else if ( ((LA60_0 >= DotEnd && LA60_0 <= DotY)) ) {
						alt60=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 60, 0, input);
						throw nvae;
					}

					switch (alt60) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:18: ( indexes )?
							{
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:18: ( indexes )?
							int alt59=2;
							int LA59_0 = input.LA(1);
							if ( (LA59_0==OBracket) ) {
								alt59=1;
							}
							switch (alt59) {
								case 1 :
									// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2647);
									indexes344=indexes();
									state._fsp--;

									stream_indexes.add(indexes344.getTree());
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
							// 282:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:51: ( indexes )?
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2664);
							dotProperty345=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty345.getTree());
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
							// 282:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:79: ^( DOTPROPERTY Identifier dotProperty )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:6: String ( indexes )?
					{
					String346=(Token)match(input,String,FOLLOW_String_in_lookup2684);  
					stream_String.add(String346);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:13: ( indexes )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==OBracket) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2686);
							indexes347=indexes();
							state._fsp--;

							stream_indexes.add(indexes347.getTree());
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
					// 283:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:53: ( indexes )?
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:6: '(' expression ')' ( indexes )?
					{
					char_literal348=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2717);  
					stream_OParen.add(char_literal348);

					pushFollow(FOLLOW_expression_in_lookup2719);
					expression349=expression();
					state._fsp--;

					stream_expression.add(expression349.getTree());
					char_literal350=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2721);  
					stream_CParen.add(char_literal350);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:25: ( indexes )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==OBracket) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2723);
							indexes351=indexes();
							state._fsp--;

							stream_indexes.add(indexes351.getTree());
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
					// 284:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:57: ( indexes )?
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:291:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal352=null;
		Token char_literal354=null;
		ParserRuleReturnScope expression353 =null;

		Object char_literal352_tree=null;
		Object char_literal354_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:6: ( '[' expression ']' )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:6: ( '[' expression ']' )+
			int cnt64=0;
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==OBracket) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:7: '[' expression ']'
					{
					char_literal352=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2767);  
					stream_OBracket.add(char_literal352);

					pushFollow(FOLLOW_expression_in_indexes2769);
					expression353=expression();
					state._fsp--;

					stream_expression.add(expression353.getTree());
					char_literal354=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2771);  
					stream_CBracket.add(char_literal354);

					}
					break;

				default :
					if ( cnt64 >= 1 ) break loop64;
					EarlyExitException eee = new EarlyExitException(64, input);
					throw eee;
				}
				cnt64++;
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
			// 292:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:31: ^( INDEXES ( expression )+ )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:295:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression355 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:6: ( dotExpression )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:6: ( dotExpression )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( ((LA65_0 >= DotEnd && LA65_0 <= DotY)) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2802);
					dotExpression355=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression355.getTree());
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
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
			// 296:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:26: ^( DOT ( dotExpression )+ )
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
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set356=null;

		Object set356_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set356=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set356));
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



	public static final BitSet FOLLOW_block_in_parse187 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block207 = new BitSet(new long[]{0xFCC8400018E40482L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_functionDecl_in_block211 = new BitSet(new long[]{0xFCC8400018E40482L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_Return_in_block216 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_block218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_143_in_block220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_143_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_143_in_statement279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment326 = new BitSet(new long[]{0x0000000000000800L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_assignment328 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_assignment331 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_assignment333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall367 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall369 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_functionCall371 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall392 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall394 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_functionCall396 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall418 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall420 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_functionCall422 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall445 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall447 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_functionCall449 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall471 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall473 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_functionCall475 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall499 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall501 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_functionCall503 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall527 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall529 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_functionCall531 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall595 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall597 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall599 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall622 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall624 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall626 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall651 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall653 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall676 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall678 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall680 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall701 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall703 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall705 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall726 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall728 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall730 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall751 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall753 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall755 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall777 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall779 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall781 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall804 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall806 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall808 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall842 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall844 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall846 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall867 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall869 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall871 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall898 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall900 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall902 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall921 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall923 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall925 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall945 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall947 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall949 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall969 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall971 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall973 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall993 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall995 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall997 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall1015 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1017 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1019 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall1037 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1039 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1041 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall1061 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1063 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1065 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1083 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1085 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1087 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1107 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1109 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1129 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1131 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1133 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1151 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1153 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1155 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1175 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1177 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1179 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall1197 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1199 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_transformCall1201 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Union_in_transformCall1219 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1221 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1223 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Difference_in_transformCall1243 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1245 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1247 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clip_in_transformCall1267 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1269 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1271 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Xor_in_transformCall1291 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1293 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_transformCall1295 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1332 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1334 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1336 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1352 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1354 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1356 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1372 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1374 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1376 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1392 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1394 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1396 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1412 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1414 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1416 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1432 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1434 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1436 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1452 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1454 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1456 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1472 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1474 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1476 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1492 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1494 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1496 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1512 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1514 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_getCall1516 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1534 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1536 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_getCall1538 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1574 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1576 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_mathCall1578 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1599 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1601 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_mathCall1603 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1624 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1626 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_mathCall1628 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1651 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_mathCall1653 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1674 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1676 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_mathCall1678 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1701 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1702 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_mathCall1704 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1725 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1726 = new BitSet(new long[]{0xFC4C400010E72480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_mathCall1728 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1766 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1768 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1771 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1803 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_ifStat1805 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1807 = new BitSet(new long[]{0xFCC8400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_ifStat1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1835 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1837 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1839 = new BitSet(new long[]{0xFCC8400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_elseIfStat1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1865 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1867 = new BitSet(new long[]{0xFCC8400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_elseStat1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1893 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1895 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_idList_in_functionDecl1897 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1900 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1902 = new BitSet(new long[]{0xFCC9400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_functionDecl1904 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1930 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_forStatement1932 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_forStatement1934 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1936 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_forStatement1938 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1940 = new BitSet(new long[]{0xFCC9400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_forStatement1942 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1979 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1981 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1983 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1985 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1987 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_144_in_repeatStatement1990 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1992 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1996 = new BitSet(new long[]{0xFCC9400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_repeatStatement1998 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement2028 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_whileStatement2030 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement2032 = new BitSet(new long[]{0xFCC9400018E40480L,0xF8FC6C0637CC98BFL,0x000000000000BA24L});
	public static final BitSet FOLLOW_block_in_whileStatement2034 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement2036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList2060 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_Comma_in_idList2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_idList2065 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_expression_in_exprList2090 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_Comma_in_exprList2093 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_exprList2095 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_condExpr_in_expression2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr2135 = new BitSet(new long[]{0x0000000000000002L,0x0000800000002000L});
	public static final BitSet FOLLOW_QMark_in_condExpr2150 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_condExpr2154 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_condExpr2156 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_condExpr2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr2183 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_condExpr2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_145_in_orExpr2240 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_andExpr_in_orExpr2243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_142_in_andExpr2262 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_equExpr_in_andExpr2265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2281 = new BitSet(new long[]{0x0002000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_set_in_equExpr2284 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_relExpr_in_equExpr2293 = new BitSet(new long[]{0x0002000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2309 = new BitSet(new long[]{0x0300000000000002L,0x0000000000300000L});
	public static final BitSet FOLLOW_set_in_relExpr2312 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_addExpr_in_relExpr2329 = new BitSet(new long[]{0x0300000000000002L,0x0000000000300000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2345 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_addExpr2348 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2357 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2373 = new BitSet(new long[]{0x0000000040000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_set_in_mulExpr2376 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2389 = new BitSet(new long[]{0x0000000040000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2405 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr2408 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2411 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr2429 = new BitSet(new long[]{0xFC48400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E26L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr2446 = new BitSet(new long[]{0xFC48400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E26L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2536 = new BitSet(new long[]{0xFC4C400010E5A480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_exprList_in_list2538 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CBracket_in_list2541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2564 = new BitSet(new long[]{0x00000FFE00000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2609 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2644 = new BitSet(new long[]{0x00000FFE00000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2684 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2717 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_lookup2719 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_lookup2721 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2767 = new BitSet(new long[]{0xFC4C400010E52480L,0xF8CC6EDE37CC88FFL,0x0000000000002E2EL});
	public static final BitSet FOLLOW_expression_in_indexes2769 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2771 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2802 = new BitSet(new long[]{0x00000FFE00000002L});
}
