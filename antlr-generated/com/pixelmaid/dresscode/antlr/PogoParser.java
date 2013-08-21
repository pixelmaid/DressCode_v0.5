// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-08-21 18:14:40

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
		"Gaussian", "GetDistance", "GetEnd", "GetFill", "GetHeight", "GetIntersect", 
		"GetOrigin", "GetRotation", "GetStart", "GetStroke", "GetWidth", "GetX", 
		"GetY", "Grid", "Group", "HEIGHT_CONSTANT", "Heading", "Hide", "ID_LIST", 
		"IF", "INDEXES", "Identifier", "If", "In", "Inch", "Int", "LAdd", "LIST", 
		"LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Map", "Merge", 
		"MirrorX", "MirrorY", "Mm", "Modulus", "Move", "MoveBy", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Noise", "Null", "Number", "OBrace", 
		"OBracket", "OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", 
		"Print", "Println", "QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", 
		"Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", 
		"Show", "Sine", "Size", "Skirt", "SkirtBack", "Space", "Spiral", "String", 
		"Stroke", "Subtract", "TERNARY", "Tan", "To", "Triangle", "UNARY_MIN", 
		"Union", "Units", "WIDTH_CONSTANT", "Wave", "Weight", "While", "Xor", 
		"'&&'", "';'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
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
	public static final int GetDistance=62;
	public static final int GetEnd=63;
	public static final int GetFill=64;
	public static final int GetHeight=65;
	public static final int GetIntersect=66;
	public static final int GetOrigin=67;
	public static final int GetRotation=68;
	public static final int GetStart=69;
	public static final int GetStroke=70;
	public static final int GetWidth=71;
	public static final int GetX=72;
	public static final int GetY=73;
	public static final int Grid=74;
	public static final int Group=75;
	public static final int HEIGHT_CONSTANT=76;
	public static final int Heading=77;
	public static final int Hide=78;
	public static final int ID_LIST=79;
	public static final int IF=80;
	public static final int INDEXES=81;
	public static final int Identifier=82;
	public static final int If=83;
	public static final int In=84;
	public static final int Inch=85;
	public static final int Int=86;
	public static final int LAdd=87;
	public static final int LIST=88;
	public static final int LOOKUP=89;
	public static final int LRemove=90;
	public static final int LShape=91;
	public static final int LT=92;
	public static final int LTEquals=93;
	public static final int Line=94;
	public static final int Map=95;
	public static final int Merge=96;
	public static final int MirrorX=97;
	public static final int MirrorY=98;
	public static final int Mm=99;
	public static final int Modulus=100;
	public static final int Move=101;
	public static final int MoveBy=102;
	public static final int Multiply=103;
	public static final int NEGATE=104;
	public static final int NEquals=105;
	public static final int NoFill=106;
	public static final int NoStroke=107;
	public static final int Noise=108;
	public static final int Null=109;
	public static final int Number=110;
	public static final int OBrace=111;
	public static final int OBracket=112;
	public static final int OParen=113;
	public static final int Or=114;
	public static final int PI_CONSTANT=115;
	public static final int Point=116;
	public static final int Polygon=117;
	public static final int Pow=118;
	public static final int Print=119;
	public static final int Println=120;
	public static final int QMark=121;
	public static final int Quad=122;
	public static final int RETURN=123;
	public static final int Random=124;
	public static final int Rect=125;
	public static final int Repeat=126;
	public static final int Return=127;
	public static final int Rotate=128;
	public static final int Round=129;
	public static final int SPECIAL=130;
	public static final int STATEMENTS=131;
	public static final int SUB_CALL=132;
	public static final int Scale=133;
	public static final int Show=134;
	public static final int Sine=135;
	public static final int Size=136;
	public static final int Skirt=137;
	public static final int SkirtBack=138;
	public static final int Space=139;
	public static final int Spiral=140;
	public static final int String=141;
	public static final int Stroke=142;
	public static final int Subtract=143;
	public static final int TERNARY=144;
	public static final int Tan=145;
	public static final int To=146;
	public static final int Triangle=147;
	public static final int UNARY_MIN=148;
	public static final int Union=149;
	public static final int Units=150;
	public static final int WIDTH_CONSTANT=151;
	public static final int Wave=152;
	public static final int Weight=153;
	public static final int While=154;
	public static final int Xor=155;

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
		RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
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
				if ( (LA1_0==ATan||(LA1_0 >= Arc && LA1_0 <= Assert)||(LA1_0 >= Clip && LA1_0 <= Cm)||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Difference||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= Gaussian && LA1_0 <= Group)||(LA1_0 >= Heading && LA1_0 <= Hide)||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==Inch||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= Mm)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= Noise)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= SkirtBack)||LA1_0==Stroke||LA1_0==Tan||(LA1_0 >= Union && LA1_0 <= Units)||(LA1_0 >= Wave && LA1_0 <= Xor)||LA1_0==157) ) {
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
					char_literal7=(Token)match(input,157,FOLLOW_157_in_block221);  
					stream_157.add(char_literal7);

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
		RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
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
				else if ( (LA3_1==Assign||LA3_1==OBracket||LA3_1==157) ) {
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
			case 157:
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
			case GetDistance:
			case GetEnd:
			case GetFill:
			case GetHeight:
			case GetIntersect:
			case GetOrigin:
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
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Stroke:
			case Tan:
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
					char_literal9=(Token)match(input,157,FOLLOW_157_in_statement265);  
					stream_157.add(char_literal9);

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
					char_literal11=(Token)match(input,157,FOLLOW_157_in_statement280);  
					stream_157.add(char_literal11);

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
			else if ( (LA6_0==157) ) {
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
					// elements: Identifier, indexes, expression
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall );
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | patternCall | mathCall | getCall )
			int alt11=12;
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
			case Random:
			case Round:
			case Sine:
			case Tan:
			case Units:
				{
				alt11=11;
				}
				break;
			case GetDistance:
			case GetEnd:
			case GetFill:
			case GetHeight:
			case GetIntersect:
			case GetOrigin:
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
					if ( (LA7_0==ATan||(LA7_0 >= Arc && LA7_0 <= Assert)||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Clip && LA7_0 <= Cm)||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Difference||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||(LA7_0 >= Fill && LA7_0 <= Flatten)||(LA7_0 >= Gaussian && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==Inch||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= Mm)||(LA7_0 >= Move && LA7_0 <= MoveBy)||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= SkirtBack)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==Tan||(LA7_0 >= Union && LA7_0 <= Weight)||LA7_0==Xor) ) {
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
					if ( (LA8_0==ATan||(LA8_0 >= Arc && LA8_0 <= Assert)||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Clip && LA8_0 <= Cm)||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Difference||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||(LA8_0 >= Fill && LA8_0 <= Flatten)||(LA8_0 >= Gaussian && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==Inch||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= Mm)||(LA8_0 >= Move && LA8_0 <= MoveBy)||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= SkirtBack)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==Tan||(LA8_0 >= Union && LA8_0 <= Weight)||LA8_0==Xor) ) {
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
					// elements: Println, expression
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
					if ( (LA9_0==ATan||(LA9_0 >= Arc && LA9_0 <= Assert)||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Clip && LA9_0 <= Cm)||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Difference||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||(LA9_0 >= Fill && LA9_0 <= Flatten)||(LA9_0 >= Gaussian && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==Inch||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= Mm)||(LA9_0 >= Move && LA9_0 <= MoveBy)||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= SkirtBack)||(LA9_0 >= String && LA9_0 <= Subtract)||LA9_0==Tan||(LA9_0 >= Union && LA9_0 <= Weight)||LA9_0==Xor) ) {
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
					if ( (LA10_0==ATan||(LA10_0 >= Arc && LA10_0 <= Assert)||LA10_0==Bool||LA10_0==COLOR_CONSTANT||(LA10_0 >= Clip && LA10_0 <= Cm)||(LA10_0 >= Copy && LA10_0 <= Curve)||LA10_0==Difference||LA10_0==Ellipse||(LA10_0 >= Excl && LA10_0 <= Expand)||(LA10_0 >= Fill && LA10_0 <= Flatten)||(LA10_0 >= Gaussian && LA10_0 <= Hide)||LA10_0==Identifier||LA10_0==Inch||LA10_0==LAdd||(LA10_0 >= LRemove && LA10_0 <= LShape)||(LA10_0 >= Line && LA10_0 <= Mm)||(LA10_0 >= Move && LA10_0 <= MoveBy)||(LA10_0 >= NoFill && LA10_0 <= Number)||(LA10_0 >= OBracket && LA10_0 <= OParen)||(LA10_0 >= PI_CONSTANT && LA10_0 <= Polygon)||(LA10_0 >= Print && LA10_0 <= Println)||(LA10_0 >= Random && LA10_0 <= Rect)||(LA10_0 >= Rotate && LA10_0 <= Round)||(LA10_0 >= Scale && LA10_0 <= SkirtBack)||(LA10_0 >= String && LA10_0 <= Subtract)||LA10_0==Tan||(LA10_0 >= Union && LA10_0 <= Weight)||LA10_0==Xor) ) {
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse53=null;
		Token char_literal54=null;
		Token char_literal56=null;
		Token Line57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		Token Rect61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		Token Curve65=null;
		Token char_literal66=null;
		Token char_literal68=null;
		Token Polygon69=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token Skirt73=null;
		Token char_literal74=null;
		Token char_literal76=null;
		Token SkirtBack77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token LShape81=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token Point85=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope exprList55 =null;
		ParserRuleReturnScope exprList59 =null;
		ParserRuleReturnScope exprList63 =null;
		ParserRuleReturnScope exprList67 =null;
		ParserRuleReturnScope exprList71 =null;
		ParserRuleReturnScope exprList75 =null;
		ParserRuleReturnScope exprList79 =null;
		ParserRuleReturnScope exprList83 =null;
		ParserRuleReturnScope exprList87 =null;

		Object Ellipse53_tree=null;
		Object char_literal54_tree=null;
		Object char_literal56_tree=null;
		Object Line57_tree=null;
		Object char_literal58_tree=null;
		Object char_literal60_tree=null;
		Object Rect61_tree=null;
		Object char_literal62_tree=null;
		Object char_literal64_tree=null;
		Object Curve65_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		Object Polygon69_tree=null;
		Object char_literal70_tree=null;
		Object char_literal72_tree=null;
		Object Skirt73_tree=null;
		Object char_literal74_tree=null;
		Object char_literal76_tree=null;
		Object SkirtBack77_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		Object LShape81_tree=null;
		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		Object Point85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | Skirt '(' ( exprList )? ')' -> ^( FUNC_CALL Skirt ( exprList )? ) | SkirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL SkirtBack ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse53=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall606);  
					stream_Ellipse.add(Ellipse53);

					char_literal54=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall608);  
					stream_OParen.add(char_literal54);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:17: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||(LA12_0 >= Arc && LA12_0 <= Assert)||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Clip && LA12_0 <= Cm)||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Difference||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||(LA12_0 >= Fill && LA12_0 <= Flatten)||(LA12_0 >= Gaussian && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==Inch||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= Mm)||(LA12_0 >= Move && LA12_0 <= MoveBy)||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= SkirtBack)||(LA12_0 >= String && LA12_0 <= Subtract)||LA12_0==Tan||(LA12_0 >= Union && LA12_0 <= Weight)||LA12_0==Xor) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall610);
							exprList55=exprList();
							state._fsp--;

							stream_exprList.add(exprList55.getTree());
							}
							break;

					}

					char_literal56=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall613);  
					stream_CParen.add(char_literal56);

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
					// 116:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:56: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:5: Line '(' ( exprList )? ')'
					{
					Line57=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall633);  
					stream_Line.add(Line57);

					char_literal58=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall635);  
					stream_OParen.add(char_literal58);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||(LA13_0 >= Arc && LA13_0 <= Assert)||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Clip && LA13_0 <= Cm)||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Difference||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||(LA13_0 >= Fill && LA13_0 <= Flatten)||(LA13_0 >= Gaussian && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==Inch||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= Mm)||(LA13_0 >= Move && LA13_0 <= MoveBy)||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= SkirtBack)||(LA13_0 >= String && LA13_0 <= Subtract)||LA13_0==Tan||(LA13_0 >= Union && LA13_0 <= Weight)||LA13_0==Xor) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall637);
							exprList59=exprList();
							state._fsp--;

							stream_exprList.add(exprList59.getTree());
							}
							break;

					}

					char_literal60=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall640);  
					stream_CParen.add(char_literal60);

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
					// 117:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: Rect '(' ( exprList )? ')'
					{
					Rect61=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall660);  
					stream_Rect.add(Rect61);

					char_literal62=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall662);  
					stream_OParen.add(char_literal62);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:14: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||(LA14_0 >= Arc && LA14_0 <= Assert)||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Clip && LA14_0 <= Cm)||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Difference||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||(LA14_0 >= Fill && LA14_0 <= Flatten)||(LA14_0 >= Gaussian && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==Inch||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= Mm)||(LA14_0 >= Move && LA14_0 <= MoveBy)||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= SkirtBack)||(LA14_0 >= String && LA14_0 <= Subtract)||LA14_0==Tan||(LA14_0 >= Union && LA14_0 <= Weight)||LA14_0==Xor) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall664);
							exprList63=exprList();
							state._fsp--;

							stream_exprList.add(exprList63.getTree());
							}
							break;

					}

					char_literal64=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall667);  
					stream_CParen.add(char_literal64);

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
					// 118:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:5: Curve '(' ( exprList )? ')'
					{
					Curve65=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall687);  
					stream_Curve.add(Curve65);

					char_literal66=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall689);  
					stream_OParen.add(char_literal66);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:15: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||(LA15_0 >= Arc && LA15_0 <= Assert)||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Clip && LA15_0 <= Cm)||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Difference||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||(LA15_0 >= Fill && LA15_0 <= Flatten)||(LA15_0 >= Gaussian && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==Inch||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= Mm)||(LA15_0 >= Move && LA15_0 <= MoveBy)||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= SkirtBack)||(LA15_0 >= String && LA15_0 <= Subtract)||LA15_0==Tan||(LA15_0 >= Union && LA15_0 <= Weight)||LA15_0==Xor) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall691);
							exprList67=exprList();
							state._fsp--;

							stream_exprList.add(exprList67.getTree());
							}
							break;

					}

					char_literal68=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall694);  
					stream_CParen.add(char_literal68);

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
					// 119:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:51: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:5: Polygon '(' ( exprList )? ')'
					{
					Polygon69=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall712);  
					stream_Polygon.add(Polygon69);

					char_literal70=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall714);  
					stream_OParen.add(char_literal70);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:17: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||(LA16_0 >= Arc && LA16_0 <= Assert)||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Clip && LA16_0 <= Cm)||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Difference||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||(LA16_0 >= Fill && LA16_0 <= Flatten)||(LA16_0 >= Gaussian && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==Inch||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= Mm)||(LA16_0 >= Move && LA16_0 <= MoveBy)||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= SkirtBack)||(LA16_0 >= String && LA16_0 <= Subtract)||LA16_0==Tan||(LA16_0 >= Union && LA16_0 <= Weight)||LA16_0==Xor) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall716);
							exprList71=exprList();
							state._fsp--;

							stream_exprList.add(exprList71.getTree());
							}
							break;

					}

					char_literal72=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall719);  
					stream_CParen.add(char_literal72);

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
					// 120:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:5: Skirt '(' ( exprList )? ')'
					{
					Skirt73=(Token)match(input,Skirt,FOLLOW_Skirt_in_primitiveCall737);  
					stream_Skirt.add(Skirt73);

					char_literal74=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall739);  
					stream_OParen.add(char_literal74);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||(LA17_0 >= Arc && LA17_0 <= Assert)||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Clip && LA17_0 <= Cm)||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Difference||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||(LA17_0 >= Fill && LA17_0 <= Flatten)||(LA17_0 >= Gaussian && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==Inch||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= Mm)||(LA17_0 >= Move && LA17_0 <= MoveBy)||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= SkirtBack)||(LA17_0 >= String && LA17_0 <= Subtract)||LA17_0==Tan||(LA17_0 >= Union && LA17_0 <= Weight)||LA17_0==Xor) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall741);
							exprList75=exprList();
							state._fsp--;

							stream_exprList.add(exprList75.getTree());
							}
							break;

					}

					char_literal76=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall744);  
					stream_CParen.add(char_literal76);

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
					// 121:29: -> ^( FUNC_CALL Skirt ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:33: ^( FUNC_CALL Skirt ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Skirt.nextNode());
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
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:5: SkirtBack '(' ( exprList )? ')'
					{
					SkirtBack77=(Token)match(input,SkirtBack,FOLLOW_SkirtBack_in_primitiveCall762);  
					stream_SkirtBack.add(SkirtBack77);

					char_literal78=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall764);  
					stream_OParen.add(char_literal78);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:19: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ATan||(LA18_0 >= Arc && LA18_0 <= Assert)||LA18_0==Bool||LA18_0==COLOR_CONSTANT||(LA18_0 >= Clip && LA18_0 <= Cm)||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Difference||LA18_0==Ellipse||(LA18_0 >= Excl && LA18_0 <= Expand)||(LA18_0 >= Fill && LA18_0 <= Flatten)||(LA18_0 >= Gaussian && LA18_0 <= Hide)||LA18_0==Identifier||LA18_0==Inch||LA18_0==LAdd||(LA18_0 >= LRemove && LA18_0 <= LShape)||(LA18_0 >= Line && LA18_0 <= Mm)||(LA18_0 >= Move && LA18_0 <= MoveBy)||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||(LA18_0 >= PI_CONSTANT && LA18_0 <= Polygon)||(LA18_0 >= Print && LA18_0 <= Println)||(LA18_0 >= Random && LA18_0 <= Rect)||(LA18_0 >= Rotate && LA18_0 <= Round)||(LA18_0 >= Scale && LA18_0 <= SkirtBack)||(LA18_0 >= String && LA18_0 <= Subtract)||LA18_0==Tan||(LA18_0 >= Union && LA18_0 <= Weight)||LA18_0==Xor) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall766);
							exprList79=exprList();
							state._fsp--;

							stream_exprList.add(exprList79.getTree());
							}
							break;

					}

					char_literal80=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall769);  
					stream_CParen.add(char_literal80);

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
					// 122:33: -> ^( FUNC_CALL SkirtBack ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:37: ^( FUNC_CALL SkirtBack ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_SkirtBack.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:59: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:6: LShape '(' ( exprList )? ')'
					{
					LShape81=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall788);  
					stream_LShape.add(LShape81);

					char_literal82=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall790);  
					stream_OParen.add(char_literal82);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:17: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||(LA19_0 >= Arc && LA19_0 <= Assert)||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Clip && LA19_0 <= Cm)||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Difference||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||(LA19_0 >= Fill && LA19_0 <= Flatten)||(LA19_0 >= Gaussian && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==Inch||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= Mm)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= SkirtBack)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= Union && LA19_0 <= Weight)||LA19_0==Xor) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall792);
							exprList83=exprList();
							state._fsp--;

							stream_exprList.add(exprList83.getTree());
							}
							break;

					}

					char_literal84=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall795);  
					stream_CParen.add(char_literal84);

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
					// 123:31: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:35: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:54: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:7: Point '(' ( exprList )? ')'
					{
					Point85=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall815);  
					stream_Point.add(Point85);

					char_literal86=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall817);  
					stream_OParen.add(char_literal86);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ATan||(LA20_0 >= Arc && LA20_0 <= Assert)||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Clip && LA20_0 <= Cm)||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Difference||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||(LA20_0 >= Fill && LA20_0 <= Flatten)||(LA20_0 >= Gaussian && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==Inch||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= Mm)||(LA20_0 >= Move && LA20_0 <= MoveBy)||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Polygon)||(LA20_0 >= Print && LA20_0 <= Println)||(LA20_0 >= Random && LA20_0 <= Rect)||(LA20_0 >= Rotate && LA20_0 <= Round)||(LA20_0 >= Scale && LA20_0 <= SkirtBack)||(LA20_0 >= String && LA20_0 <= Subtract)||LA20_0==Tan||(LA20_0 >= Union && LA20_0 <= Weight)||LA20_0==Xor) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall819);
							exprList87=exprList();
							state._fsp--;

							stream_exprList.add(exprList87.getTree());
							}
							break;

					}

					char_literal88=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall822);  
					stream_CParen.add(char_literal88);

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
					// 124:31: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:35: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:53: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Heading '(' ( exprList )? ')' -> ^( FUNC_CALL Heading ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Show '(' expression ')' -> ^( FUNC_CALL Show expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) | Flatten '(' expression ')' -> ^( FUNC_CALL Flatten expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move89=null;
		Token char_literal90=null;
		Token char_literal92=null;
		Token MoveBy93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		Token Heading97=null;
		Token char_literal98=null;
		Token char_literal100=null;
		Token Copy101=null;
		Token char_literal102=null;
		Token char_literal104=null;
		Token Rotate105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		Token Fill109=null;
		Token char_literal110=null;
		Token char_literal112=null;
		Token Stroke113=null;
		Token char_literal114=null;
		Token char_literal116=null;
		Token NoFill117=null;
		Token char_literal118=null;
		Token char_literal120=null;
		Token NoStroke121=null;
		Token char_literal122=null;
		Token char_literal124=null;
		Token Weight125=null;
		Token char_literal126=null;
		Token char_literal128=null;
		Token Hide129=null;
		Token char_literal130=null;
		Token char_literal132=null;
		Token Show133=null;
		Token char_literal134=null;
		Token char_literal136=null;
		Token Group137=null;
		Token char_literal138=null;
		Token char_literal140=null;
		Token Expand141=null;
		Token char_literal142=null;
		Token char_literal144=null;
		Token Merge145=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token Scale149=null;
		Token char_literal150=null;
		Token char_literal152=null;
		Token MirrorX153=null;
		Token char_literal154=null;
		Token char_literal156=null;
		Token MirrorY157=null;
		Token char_literal158=null;
		Token char_literal160=null;
		Token Union161=null;
		Token char_literal162=null;
		Token char_literal164=null;
		Token Difference165=null;
		Token char_literal166=null;
		Token char_literal168=null;
		Token Clip169=null;
		Token char_literal170=null;
		Token char_literal172=null;
		Token Xor173=null;
		Token char_literal174=null;
		Token char_literal176=null;
		Token Flatten177=null;
		Token char_literal178=null;
		Token char_literal180=null;
		ParserRuleReturnScope exprList91 =null;
		ParserRuleReturnScope exprList95 =null;
		ParserRuleReturnScope exprList99 =null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope exprList107 =null;
		ParserRuleReturnScope exprList111 =null;
		ParserRuleReturnScope exprList115 =null;
		ParserRuleReturnScope expression119 =null;
		ParserRuleReturnScope expression123 =null;
		ParserRuleReturnScope exprList127 =null;
		ParserRuleReturnScope expression131 =null;
		ParserRuleReturnScope expression135 =null;
		ParserRuleReturnScope exprList139 =null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope expression147 =null;
		ParserRuleReturnScope exprList151 =null;
		ParserRuleReturnScope expression155 =null;
		ParserRuleReturnScope expression159 =null;
		ParserRuleReturnScope exprList163 =null;
		ParserRuleReturnScope exprList167 =null;
		ParserRuleReturnScope exprList171 =null;
		ParserRuleReturnScope exprList175 =null;
		ParserRuleReturnScope expression179 =null;

		Object Move89_tree=null;
		Object char_literal90_tree=null;
		Object char_literal92_tree=null;
		Object MoveBy93_tree=null;
		Object char_literal94_tree=null;
		Object char_literal96_tree=null;
		Object Heading97_tree=null;
		Object char_literal98_tree=null;
		Object char_literal100_tree=null;
		Object Copy101_tree=null;
		Object char_literal102_tree=null;
		Object char_literal104_tree=null;
		Object Rotate105_tree=null;
		Object char_literal106_tree=null;
		Object char_literal108_tree=null;
		Object Fill109_tree=null;
		Object char_literal110_tree=null;
		Object char_literal112_tree=null;
		Object Stroke113_tree=null;
		Object char_literal114_tree=null;
		Object char_literal116_tree=null;
		Object NoFill117_tree=null;
		Object char_literal118_tree=null;
		Object char_literal120_tree=null;
		Object NoStroke121_tree=null;
		Object char_literal122_tree=null;
		Object char_literal124_tree=null;
		Object Weight125_tree=null;
		Object char_literal126_tree=null;
		Object char_literal128_tree=null;
		Object Hide129_tree=null;
		Object char_literal130_tree=null;
		Object char_literal132_tree=null;
		Object Show133_tree=null;
		Object char_literal134_tree=null;
		Object char_literal136_tree=null;
		Object Group137_tree=null;
		Object char_literal138_tree=null;
		Object char_literal140_tree=null;
		Object Expand141_tree=null;
		Object char_literal142_tree=null;
		Object char_literal144_tree=null;
		Object Merge145_tree=null;
		Object char_literal146_tree=null;
		Object char_literal148_tree=null;
		Object Scale149_tree=null;
		Object char_literal150_tree=null;
		Object char_literal152_tree=null;
		Object MirrorX153_tree=null;
		Object char_literal154_tree=null;
		Object char_literal156_tree=null;
		Object MirrorY157_tree=null;
		Object char_literal158_tree=null;
		Object char_literal160_tree=null;
		Object Union161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal164_tree=null;
		Object Difference165_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		Object Clip169_tree=null;
		Object char_literal170_tree=null;
		Object char_literal172_tree=null;
		Object Xor173_tree=null;
		Object char_literal174_tree=null;
		Object char_literal176_tree=null;
		Object Flatten177_tree=null;
		Object char_literal178_tree=null;
		Object char_literal180_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Heading '(' ( exprList )? ')' -> ^( FUNC_CALL Heading ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Show '(' expression ')' -> ^( FUNC_CALL Show expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) | Flatten '(' expression ')' -> ^( FUNC_CALL Flatten expression ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: Move '(' ( exprList )? ')'
					{
					Move89=(Token)match(input,Move,FOLLOW_Move_in_transformCall853);  
					stream_Move.add(Move89);

					char_literal90=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall855);  
					stream_OParen.add(char_literal90);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:15: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||(LA22_0 >= Arc && LA22_0 <= Assert)||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Clip && LA22_0 <= Cm)||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Difference||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||(LA22_0 >= Fill && LA22_0 <= Flatten)||(LA22_0 >= Gaussian && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==Inch||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= Mm)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= SkirtBack)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= Union && LA22_0 <= Weight)||LA22_0==Xor) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall857);
							exprList91=exprList();
							state._fsp--;

							stream_exprList.add(exprList91.getTree());
							}
							break;

					}

					char_literal92=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall860);  
					stream_CParen.add(char_literal92);

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
					// 128:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy93=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall878);  
					stream_MoveBy.add(MoveBy93);

					char_literal94=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall880);  
					stream_OParen.add(char_literal94);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||(LA23_0 >= Arc && LA23_0 <= Assert)||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Clip && LA23_0 <= Cm)||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Difference||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||(LA23_0 >= Fill && LA23_0 <= Flatten)||(LA23_0 >= Gaussian && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==Inch||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= Mm)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= SkirtBack)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= Union && LA23_0 <= Weight)||LA23_0==Xor) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall882);
							exprList95=exprList();
							state._fsp--;

							stream_exprList.add(exprList95.getTree());
							}
							break;

					}

					char_literal96=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall885);  
					stream_CParen.add(char_literal96);

					// AST REWRITE
					// elements: MoveBy, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:34: ^( FUNC_CALL MoveBy ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MoveBy.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:53: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Heading '(' ( exprList )? ')'
					{
					Heading97=(Token)match(input,Heading,FOLLOW_Heading_in_transformCall904);  
					stream_Heading.add(Heading97);

					char_literal98=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall906);  
					stream_OParen.add(char_literal98);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:18: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||(LA24_0 >= Arc && LA24_0 <= Assert)||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Clip && LA24_0 <= Cm)||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Difference||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||(LA24_0 >= Fill && LA24_0 <= Flatten)||(LA24_0 >= Gaussian && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==Inch||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= Mm)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= SkirtBack)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= Union && LA24_0 <= Weight)||LA24_0==Xor) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall908);
							exprList99=exprList();
							state._fsp--;

							stream_exprList.add(exprList99.getTree());
							}
							break;

					}

					char_literal100=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall911);  
					stream_CParen.add(char_literal100);

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
					// 130:32: -> ^( FUNC_CALL Heading ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:35: ^( FUNC_CALL Heading ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Heading.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: Copy '(' expression ')'
					{
					Copy101=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall930);  
					stream_Copy.add(Copy101);

					char_literal102=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall932);  
					stream_OParen.add(char_literal102);

					pushFollow(FOLLOW_expression_in_transformCall934);
					expression103=expression();
					state._fsp--;

					stream_expression.add(expression103.getTree());
					char_literal104=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall936);  
					stream_CParen.add(char_literal104);

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
					// 131:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:33: ^( FUNC_CALL Copy expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Rotate '(' ( exprList )? ')'
					{
					Rotate105=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall953);  
					stream_Rotate.add(Rotate105);

					char_literal106=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall955);  
					stream_OParen.add(char_literal106);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||(LA25_0 >= Arc && LA25_0 <= Assert)||LA25_0==Bool||LA25_0==COLOR_CONSTANT||(LA25_0 >= Clip && LA25_0 <= Cm)||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Difference||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||(LA25_0 >= Fill && LA25_0 <= Flatten)||(LA25_0 >= Gaussian && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==Inch||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= Mm)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= SkirtBack)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= Union && LA25_0 <= Weight)||LA25_0==Xor) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall957);
							exprList107=exprList();
							state._fsp--;

							stream_exprList.add(exprList107.getTree());
							}
							break;

					}

					char_literal108=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall960);  
					stream_CParen.add(char_literal108);

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
					// 132:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: Fill '(' ( exprList )? ')'
					{
					Fill109=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall977);  
					stream_Fill.add(Fill109);

					char_literal110=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall979);  
					stream_OParen.add(char_literal110);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:15: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||(LA26_0 >= Arc && LA26_0 <= Assert)||LA26_0==Bool||LA26_0==COLOR_CONSTANT||(LA26_0 >= Clip && LA26_0 <= Cm)||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Difference||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||(LA26_0 >= Fill && LA26_0 <= Flatten)||(LA26_0 >= Gaussian && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==Inch||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= Mm)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Polygon)||(LA26_0 >= Print && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= SkirtBack)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==Tan||(LA26_0 >= Union && LA26_0 <= Weight)||LA26_0==Xor) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall981);
							exprList111=exprList();
							state._fsp--;

							stream_exprList.add(exprList111.getTree());
							}
							break;

					}

					char_literal112=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall984);  
					stream_CParen.add(char_literal112);

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
					// 133:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Stroke '(' ( exprList )? ')'
					{
					Stroke113=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall1001);  
					stream_Stroke.add(Stroke113);

					char_literal114=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1003);  
					stream_OParen.add(char_literal114);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:17: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||(LA27_0 >= Arc && LA27_0 <= Assert)||LA27_0==Bool||LA27_0==COLOR_CONSTANT||(LA27_0 >= Clip && LA27_0 <= Cm)||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Difference||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||(LA27_0 >= Fill && LA27_0 <= Flatten)||(LA27_0 >= Gaussian && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==Inch||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= Mm)||(LA27_0 >= Move && LA27_0 <= MoveBy)||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Polygon)||(LA27_0 >= Print && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= SkirtBack)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==Tan||(LA27_0 >= Union && LA27_0 <= Weight)||LA27_0==Xor) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1005);
							exprList115=exprList();
							state._fsp--;

							stream_exprList.add(exprList115.getTree());
							}
							break;

					}

					char_literal116=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1008);  
					stream_CParen.add(char_literal116);

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
					// 134:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
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
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: NoFill '(' expression ')'
					{
					NoFill117=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall1025);  
					stream_NoFill.add(NoFill117);

					char_literal118=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1027);  
					stream_OParen.add(char_literal118);

					pushFollow(FOLLOW_expression_in_transformCall1029);
					expression119=expression();
					state._fsp--;

					stream_expression.add(expression119.getTree());
					char_literal120=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1031);  
					stream_CParen.add(char_literal120);

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
					// 135:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:34: ^( FUNC_CALL NoFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: NoStroke '(' expression ')'
					{
					NoStroke121=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall1047);  
					stream_NoStroke.add(NoStroke121);

					char_literal122=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1049);  
					stream_OParen.add(char_literal122);

					pushFollow(FOLLOW_expression_in_transformCall1051);
					expression123=expression();
					state._fsp--;

					stream_expression.add(expression123.getTree());
					char_literal124=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1053);  
					stream_CParen.add(char_literal124);

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
					// 136:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:36: ^( FUNC_CALL NoStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:6: Weight '(' ( exprList )? ')'
					{
					Weight125=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall1069);  
					stream_Weight.add(Weight125);

					char_literal126=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1071);  
					stream_OParen.add(char_literal126);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:17: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||(LA28_0 >= Arc && LA28_0 <= Assert)||LA28_0==Bool||LA28_0==COLOR_CONSTANT||(LA28_0 >= Clip && LA28_0 <= Cm)||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Difference||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||(LA28_0 >= Fill && LA28_0 <= Flatten)||(LA28_0 >= Gaussian && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==Inch||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= Mm)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= SkirtBack)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= Union && LA28_0 <= Weight)||LA28_0==Xor) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1073);
							exprList127=exprList();
							state._fsp--;

							stream_exprList.add(exprList127.getTree());
							}
							break;

					}

					char_literal128=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1076);  
					stream_CParen.add(char_literal128);

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
					// 137:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:52: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: Hide '(' expression ')'
					{
					Hide129=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall1093);  
					stream_Hide.add(Hide129);

					char_literal130=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1095);  
					stream_OParen.add(char_literal130);

					pushFollow(FOLLOW_expression_in_transformCall1097);
					expression131=expression();
					state._fsp--;

					stream_expression.add(expression131.getTree());
					char_literal132=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1099);  
					stream_CParen.add(char_literal132);

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
					// 138:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:32: ^( FUNC_CALL Hide expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:6: Show '(' expression ')'
					{
					Show133=(Token)match(input,Show,FOLLOW_Show_in_transformCall1115);  
					stream_Show.add(Show133);

					char_literal134=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1117);  
					stream_OParen.add(char_literal134);

					pushFollow(FOLLOW_expression_in_transformCall1119);
					expression135=expression();
					state._fsp--;

					stream_expression.add(expression135.getTree());
					char_literal136=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1121);  
					stream_CParen.add(char_literal136);

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
					// 139:29: -> ^( FUNC_CALL Show expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:32: ^( FUNC_CALL Show expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: Group '(' ( exprList )? ')'
					{
					Group137=(Token)match(input,Group,FOLLOW_Group_in_transformCall1137);  
					stream_Group.add(Group137);

					char_literal138=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1139);  
					stream_OParen.add(char_literal138);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:16: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ATan||(LA29_0 >= Arc && LA29_0 <= Assert)||LA29_0==Bool||LA29_0==COLOR_CONSTANT||(LA29_0 >= Clip && LA29_0 <= Cm)||(LA29_0 >= Copy && LA29_0 <= Curve)||LA29_0==Difference||LA29_0==Ellipse||(LA29_0 >= Excl && LA29_0 <= Expand)||(LA29_0 >= Fill && LA29_0 <= Flatten)||(LA29_0 >= Gaussian && LA29_0 <= Hide)||LA29_0==Identifier||LA29_0==Inch||LA29_0==LAdd||(LA29_0 >= LRemove && LA29_0 <= LShape)||(LA29_0 >= Line && LA29_0 <= Mm)||(LA29_0 >= Move && LA29_0 <= MoveBy)||(LA29_0 >= NoFill && LA29_0 <= Number)||(LA29_0 >= OBracket && LA29_0 <= OParen)||(LA29_0 >= PI_CONSTANT && LA29_0 <= Polygon)||(LA29_0 >= Print && LA29_0 <= Println)||(LA29_0 >= Random && LA29_0 <= Rect)||(LA29_0 >= Rotate && LA29_0 <= Round)||(LA29_0 >= Scale && LA29_0 <= SkirtBack)||(LA29_0 >= String && LA29_0 <= Subtract)||LA29_0==Tan||(LA29_0 >= Union && LA29_0 <= Weight)||LA29_0==Xor) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1141);
							exprList139=exprList();
							state._fsp--;

							stream_exprList.add(exprList139.getTree());
							}
							break;

					}

					char_literal140=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1144);  
					stream_CParen.add(char_literal140);

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
					// 140:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:6: Expand '(' expression ')'
					{
					Expand141=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1161);  
					stream_Expand.add(Expand141);

					char_literal142=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1163);  
					stream_OParen.add(char_literal142);

					pushFollow(FOLLOW_expression_in_transformCall1165);
					expression143=expression();
					state._fsp--;

					stream_expression.add(expression143.getTree());
					char_literal144=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1167);  
					stream_CParen.add(char_literal144);

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
					// 141:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:34: ^( FUNC_CALL Expand expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Merge '(' expression ')'
					{
					Merge145=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1183);  
					stream_Merge.add(Merge145);

					char_literal146=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1185);  
					stream_OParen.add(char_literal146);

					pushFollow(FOLLOW_expression_in_transformCall1187);
					expression147=expression();
					state._fsp--;

					stream_expression.add(expression147.getTree());
					char_literal148=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1189);  
					stream_CParen.add(char_literal148);

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
					// 142:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:33: ^( FUNC_CALL Merge expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:6: Scale '(' ( exprList )? ')'
					{
					Scale149=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1205);  
					stream_Scale.add(Scale149);

					char_literal150=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1207);  
					stream_OParen.add(char_literal150);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:16: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||(LA30_0 >= Arc && LA30_0 <= Assert)||LA30_0==Bool||LA30_0==COLOR_CONSTANT||(LA30_0 >= Clip && LA30_0 <= Cm)||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Difference||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||(LA30_0 >= Fill && LA30_0 <= Flatten)||(LA30_0 >= Gaussian && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==Inch||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= Mm)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Polygon)||(LA30_0 >= Print && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= SkirtBack)||(LA30_0 >= String && LA30_0 <= Subtract)||LA30_0==Tan||(LA30_0 >= Union && LA30_0 <= Weight)||LA30_0==Xor) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1209);
							exprList151=exprList();
							state._fsp--;

							stream_exprList.add(exprList151.getTree());
							}
							break;

					}

					char_literal152=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1212);  
					stream_CParen.add(char_literal152);

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
					// 143:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:32: ^( FUNC_CALL Scale ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: MirrorX '(' expression ')'
					{
					MirrorX153=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1229);  
					stream_MirrorX.add(MirrorX153);

					char_literal154=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1231);  
					stream_OParen.add(char_literal154);

					pushFollow(FOLLOW_expression_in_transformCall1233);
					expression155=expression();
					state._fsp--;

					stream_expression.add(expression155.getTree());
					char_literal156=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1235);  
					stream_CParen.add(char_literal156);

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
					// 144:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:35: ^( FUNC_CALL MirrorX expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:6: MirrorY '(' expression ')'
					{
					MirrorY157=(Token)match(input,MirrorY,FOLLOW_MirrorY_in_transformCall1251);  
					stream_MirrorY.add(MirrorY157);

					char_literal158=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1253);  
					stream_OParen.add(char_literal158);

					pushFollow(FOLLOW_expression_in_transformCall1255);
					expression159=expression();
					state._fsp--;

					stream_expression.add(expression159.getTree());
					char_literal160=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1257);  
					stream_CParen.add(char_literal160);

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
					// 145:32: -> ^( FUNC_CALL MirrorY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:35: ^( FUNC_CALL MirrorY expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:6: Union '(' ( exprList )? ')'
					{
					Union161=(Token)match(input,Union,FOLLOW_Union_in_transformCall1273);  
					stream_Union.add(Union161);

					char_literal162=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1275);  
					stream_OParen.add(char_literal162);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:16: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ATan||(LA31_0 >= Arc && LA31_0 <= Assert)||LA31_0==Bool||LA31_0==COLOR_CONSTANT||(LA31_0 >= Clip && LA31_0 <= Cm)||(LA31_0 >= Copy && LA31_0 <= Curve)||LA31_0==Difference||LA31_0==Ellipse||(LA31_0 >= Excl && LA31_0 <= Expand)||(LA31_0 >= Fill && LA31_0 <= Flatten)||(LA31_0 >= Gaussian && LA31_0 <= Hide)||LA31_0==Identifier||LA31_0==Inch||LA31_0==LAdd||(LA31_0 >= LRemove && LA31_0 <= LShape)||(LA31_0 >= Line && LA31_0 <= Mm)||(LA31_0 >= Move && LA31_0 <= MoveBy)||(LA31_0 >= NoFill && LA31_0 <= Number)||(LA31_0 >= OBracket && LA31_0 <= OParen)||(LA31_0 >= PI_CONSTANT && LA31_0 <= Polygon)||(LA31_0 >= Print && LA31_0 <= Println)||(LA31_0 >= Random && LA31_0 <= Rect)||(LA31_0 >= Rotate && LA31_0 <= Round)||(LA31_0 >= Scale && LA31_0 <= SkirtBack)||(LA31_0 >= String && LA31_0 <= Subtract)||LA31_0==Tan||(LA31_0 >= Union && LA31_0 <= Weight)||LA31_0==Xor) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1277);
							exprList163=exprList();
							state._fsp--;

							stream_exprList.add(exprList163.getTree());
							}
							break;

					}

					char_literal164=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1280);  
					stream_CParen.add(char_literal164);

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
					// 146:29: -> ^( FUNC_CALL Union ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:32: ^( FUNC_CALL Union ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Union.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:50: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:6: Difference '(' ( exprList )? ')'
					{
					Difference165=(Token)match(input,Difference,FOLLOW_Difference_in_transformCall1297);  
					stream_Difference.add(Difference165);

					char_literal166=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1299);  
					stream_OParen.add(char_literal166);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:21: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ATan||(LA32_0 >= Arc && LA32_0 <= Assert)||LA32_0==Bool||LA32_0==COLOR_CONSTANT||(LA32_0 >= Clip && LA32_0 <= Cm)||(LA32_0 >= Copy && LA32_0 <= Curve)||LA32_0==Difference||LA32_0==Ellipse||(LA32_0 >= Excl && LA32_0 <= Expand)||(LA32_0 >= Fill && LA32_0 <= Flatten)||(LA32_0 >= Gaussian && LA32_0 <= Hide)||LA32_0==Identifier||LA32_0==Inch||LA32_0==LAdd||(LA32_0 >= LRemove && LA32_0 <= LShape)||(LA32_0 >= Line && LA32_0 <= Mm)||(LA32_0 >= Move && LA32_0 <= MoveBy)||(LA32_0 >= NoFill && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= PI_CONSTANT && LA32_0 <= Polygon)||(LA32_0 >= Print && LA32_0 <= Println)||(LA32_0 >= Random && LA32_0 <= Rect)||(LA32_0 >= Rotate && LA32_0 <= Round)||(LA32_0 >= Scale && LA32_0 <= SkirtBack)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==Tan||(LA32_0 >= Union && LA32_0 <= Weight)||LA32_0==Xor) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1301);
							exprList167=exprList();
							state._fsp--;

							stream_exprList.add(exprList167.getTree());
							}
							break;

					}

					char_literal168=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1304);  
					stream_CParen.add(char_literal168);

					// AST REWRITE
					// elements: Difference, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:34: -> ^( FUNC_CALL Difference ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:37: ^( FUNC_CALL Difference ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Difference.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:60: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:6: Clip '(' ( exprList )? ')'
					{
					Clip169=(Token)match(input,Clip,FOLLOW_Clip_in_transformCall1321);  
					stream_Clip.add(Clip169);

					char_literal170=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1323);  
					stream_OParen.add(char_literal170);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:15: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ATan||(LA33_0 >= Arc && LA33_0 <= Assert)||LA33_0==Bool||LA33_0==COLOR_CONSTANT||(LA33_0 >= Clip && LA33_0 <= Cm)||(LA33_0 >= Copy && LA33_0 <= Curve)||LA33_0==Difference||LA33_0==Ellipse||(LA33_0 >= Excl && LA33_0 <= Expand)||(LA33_0 >= Fill && LA33_0 <= Flatten)||(LA33_0 >= Gaussian && LA33_0 <= Hide)||LA33_0==Identifier||LA33_0==Inch||LA33_0==LAdd||(LA33_0 >= LRemove && LA33_0 <= LShape)||(LA33_0 >= Line && LA33_0 <= Mm)||(LA33_0 >= Move && LA33_0 <= MoveBy)||(LA33_0 >= NoFill && LA33_0 <= Number)||(LA33_0 >= OBracket && LA33_0 <= OParen)||(LA33_0 >= PI_CONSTANT && LA33_0 <= Polygon)||(LA33_0 >= Print && LA33_0 <= Println)||(LA33_0 >= Random && LA33_0 <= Rect)||(LA33_0 >= Rotate && LA33_0 <= Round)||(LA33_0 >= Scale && LA33_0 <= SkirtBack)||(LA33_0 >= String && LA33_0 <= Subtract)||LA33_0==Tan||(LA33_0 >= Union && LA33_0 <= Weight)||LA33_0==Xor) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1325);
							exprList171=exprList();
							state._fsp--;

							stream_exprList.add(exprList171.getTree());
							}
							break;

					}

					char_literal172=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1328);  
					stream_CParen.add(char_literal172);

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
					// 148:28: -> ^( FUNC_CALL Clip ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:31: ^( FUNC_CALL Clip ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Clip.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:6: Xor '(' ( exprList )? ')'
					{
					Xor173=(Token)match(input,Xor,FOLLOW_Xor_in_transformCall1345);  
					stream_Xor.add(Xor173);

					char_literal174=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1347);  
					stream_OParen.add(char_literal174);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:14: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ATan||(LA34_0 >= Arc && LA34_0 <= Assert)||LA34_0==Bool||LA34_0==COLOR_CONSTANT||(LA34_0 >= Clip && LA34_0 <= Cm)||(LA34_0 >= Copy && LA34_0 <= Curve)||LA34_0==Difference||LA34_0==Ellipse||(LA34_0 >= Excl && LA34_0 <= Expand)||(LA34_0 >= Fill && LA34_0 <= Flatten)||(LA34_0 >= Gaussian && LA34_0 <= Hide)||LA34_0==Identifier||LA34_0==Inch||LA34_0==LAdd||(LA34_0 >= LRemove && LA34_0 <= LShape)||(LA34_0 >= Line && LA34_0 <= Mm)||(LA34_0 >= Move && LA34_0 <= MoveBy)||(LA34_0 >= NoFill && LA34_0 <= Number)||(LA34_0 >= OBracket && LA34_0 <= OParen)||(LA34_0 >= PI_CONSTANT && LA34_0 <= Polygon)||(LA34_0 >= Print && LA34_0 <= Println)||(LA34_0 >= Random && LA34_0 <= Rect)||(LA34_0 >= Rotate && LA34_0 <= Round)||(LA34_0 >= Scale && LA34_0 <= SkirtBack)||(LA34_0 >= String && LA34_0 <= Subtract)||LA34_0==Tan||(LA34_0 >= Union && LA34_0 <= Weight)||LA34_0==Xor) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1349);
							exprList175=exprList();
							state._fsp--;

							stream_exprList.add(exprList175.getTree());
							}
							break;

					}

					char_literal176=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1352);  
					stream_CParen.add(char_literal176);

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
					// 149:27: -> ^( FUNC_CALL Xor ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:30: ^( FUNC_CALL Xor ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Xor.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:46: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:6: Flatten '(' expression ')'
					{
					Flatten177=(Token)match(input,Flatten,FOLLOW_Flatten_in_transformCall1369);  
					stream_Flatten.add(Flatten177);

					char_literal178=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1371);  
					stream_OParen.add(char_literal178);

					pushFollow(FOLLOW_expression_in_transformCall1373);
					expression179=expression();
					state._fsp--;

					stream_expression.add(expression179.getTree());
					char_literal180=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1375);  
					stream_CParen.add(char_literal180);

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
					// 150:32: -> ^( FUNC_CALL Flatten expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:35: ^( FUNC_CALL Flatten expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:4: patternCall : ( Grid '(' ( exprList )? ')' -> ^( FUNC_CALL Grid ( exprList )? ) | Wave '(' ( exprList )? ')' -> ^( FUNC_CALL Wave ( exprList )? ) | Arc '(' ( exprList )? ')' -> ^( FUNC_CALL Arc ( exprList )? ) );
	public final PogoParser.patternCall_return patternCall() throws RecognitionException {
		PogoParser.patternCall_return retval = new PogoParser.patternCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Grid181=null;
		Token char_literal182=null;
		Token char_literal184=null;
		Token Wave185=null;
		Token char_literal186=null;
		Token char_literal188=null;
		Token Arc189=null;
		Token char_literal190=null;
		Token char_literal192=null;
		ParserRuleReturnScope exprList183 =null;
		ParserRuleReturnScope exprList187 =null;
		ParserRuleReturnScope exprList191 =null;

		Object Grid181_tree=null;
		Object char_literal182_tree=null;
		Object char_literal184_tree=null;
		Object Wave185_tree=null;
		Object char_literal186_tree=null;
		Object char_literal188_tree=null;
		Object Arc189_tree=null;
		Object char_literal190_tree=null;
		Object char_literal192_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Arc=new RewriteRuleTokenStream(adaptor,"token Arc");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Grid=new RewriteRuleTokenStream(adaptor,"token Grid");
		RewriteRuleTokenStream stream_Wave=new RewriteRuleTokenStream(adaptor,"token Wave");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:4: ( Grid '(' ( exprList )? ')' -> ^( FUNC_CALL Grid ( exprList )? ) | Wave '(' ( exprList )? ')' -> ^( FUNC_CALL Wave ( exprList )? ) | Arc '(' ( exprList )? ')' -> ^( FUNC_CALL Arc ( exprList )? ) )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:6: Grid '(' ( exprList )? ')'
					{
					Grid181=(Token)match(input,Grid,FOLLOW_Grid_in_patternCall1405);  
					stream_Grid.add(Grid181);

					char_literal182=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1407);  
					stream_OParen.add(char_literal182);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:15: ( exprList )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==ATan||(LA36_0 >= Arc && LA36_0 <= Assert)||LA36_0==Bool||LA36_0==COLOR_CONSTANT||(LA36_0 >= Clip && LA36_0 <= Cm)||(LA36_0 >= Copy && LA36_0 <= Curve)||LA36_0==Difference||LA36_0==Ellipse||(LA36_0 >= Excl && LA36_0 <= Expand)||(LA36_0 >= Fill && LA36_0 <= Flatten)||(LA36_0 >= Gaussian && LA36_0 <= Hide)||LA36_0==Identifier||LA36_0==Inch||LA36_0==LAdd||(LA36_0 >= LRemove && LA36_0 <= LShape)||(LA36_0 >= Line && LA36_0 <= Mm)||(LA36_0 >= Move && LA36_0 <= MoveBy)||(LA36_0 >= NoFill && LA36_0 <= Number)||(LA36_0 >= OBracket && LA36_0 <= OParen)||(LA36_0 >= PI_CONSTANT && LA36_0 <= Polygon)||(LA36_0 >= Print && LA36_0 <= Println)||(LA36_0 >= Random && LA36_0 <= Rect)||(LA36_0 >= Rotate && LA36_0 <= Round)||(LA36_0 >= Scale && LA36_0 <= SkirtBack)||(LA36_0 >= String && LA36_0 <= Subtract)||LA36_0==Tan||(LA36_0 >= Union && LA36_0 <= Weight)||LA36_0==Xor) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1409);
							exprList183=exprList();
							state._fsp--;

							stream_exprList.add(exprList183.getTree());
							}
							break;

					}

					char_literal184=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1412);  
					stream_CParen.add(char_literal184);

					// AST REWRITE
					// elements: exprList, Grid
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:29: -> ^( FUNC_CALL Grid ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:32: ^( FUNC_CALL Grid ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Grid.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:6: Wave '(' ( exprList )? ')'
					{
					Wave185=(Token)match(input,Wave,FOLLOW_Wave_in_patternCall1430);  
					stream_Wave.add(Wave185);

					char_literal186=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1432);  
					stream_OParen.add(char_literal186);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:15: ( exprList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==ATan||(LA37_0 >= Arc && LA37_0 <= Assert)||LA37_0==Bool||LA37_0==COLOR_CONSTANT||(LA37_0 >= Clip && LA37_0 <= Cm)||(LA37_0 >= Copy && LA37_0 <= Curve)||LA37_0==Difference||LA37_0==Ellipse||(LA37_0 >= Excl && LA37_0 <= Expand)||(LA37_0 >= Fill && LA37_0 <= Flatten)||(LA37_0 >= Gaussian && LA37_0 <= Hide)||LA37_0==Identifier||LA37_0==Inch||LA37_0==LAdd||(LA37_0 >= LRemove && LA37_0 <= LShape)||(LA37_0 >= Line && LA37_0 <= Mm)||(LA37_0 >= Move && LA37_0 <= MoveBy)||(LA37_0 >= NoFill && LA37_0 <= Number)||(LA37_0 >= OBracket && LA37_0 <= OParen)||(LA37_0 >= PI_CONSTANT && LA37_0 <= Polygon)||(LA37_0 >= Print && LA37_0 <= Println)||(LA37_0 >= Random && LA37_0 <= Rect)||(LA37_0 >= Rotate && LA37_0 <= Round)||(LA37_0 >= Scale && LA37_0 <= SkirtBack)||(LA37_0 >= String && LA37_0 <= Subtract)||LA37_0==Tan||(LA37_0 >= Union && LA37_0 <= Weight)||LA37_0==Xor) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1434);
							exprList187=exprList();
							state._fsp--;

							stream_exprList.add(exprList187.getTree());
							}
							break;

					}

					char_literal188=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1437);  
					stream_CParen.add(char_literal188);

					// AST REWRITE
					// elements: exprList, Wave
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 155:29: -> ^( FUNC_CALL Wave ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:32: ^( FUNC_CALL Wave ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Wave.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:49: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:6: Arc '(' ( exprList )? ')'
					{
					Arc189=(Token)match(input,Arc,FOLLOW_Arc_in_patternCall1455);  
					stream_Arc.add(Arc189);

					char_literal190=(Token)match(input,OParen,FOLLOW_OParen_in_patternCall1457);  
					stream_OParen.add(char_literal190);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:14: ( exprList )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==ATan||(LA38_0 >= Arc && LA38_0 <= Assert)||LA38_0==Bool||LA38_0==COLOR_CONSTANT||(LA38_0 >= Clip && LA38_0 <= Cm)||(LA38_0 >= Copy && LA38_0 <= Curve)||LA38_0==Difference||LA38_0==Ellipse||(LA38_0 >= Excl && LA38_0 <= Expand)||(LA38_0 >= Fill && LA38_0 <= Flatten)||(LA38_0 >= Gaussian && LA38_0 <= Hide)||LA38_0==Identifier||LA38_0==Inch||LA38_0==LAdd||(LA38_0 >= LRemove && LA38_0 <= LShape)||(LA38_0 >= Line && LA38_0 <= Mm)||(LA38_0 >= Move && LA38_0 <= MoveBy)||(LA38_0 >= NoFill && LA38_0 <= Number)||(LA38_0 >= OBracket && LA38_0 <= OParen)||(LA38_0 >= PI_CONSTANT && LA38_0 <= Polygon)||(LA38_0 >= Print && LA38_0 <= Println)||(LA38_0 >= Random && LA38_0 <= Rect)||(LA38_0 >= Rotate && LA38_0 <= Round)||(LA38_0 >= Scale && LA38_0 <= SkirtBack)||(LA38_0 >= String && LA38_0 <= Subtract)||LA38_0==Tan||(LA38_0 >= Union && LA38_0 <= Weight)||LA38_0==Xor) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_patternCall1459);
							exprList191=exprList();
							state._fsp--;

							stream_exprList.add(exprList191.getTree());
							}
							break;

					}

					char_literal192=(Token)match(input,CParen,FOLLOW_CParen_in_patternCall1462);  
					stream_CParen.add(char_literal192);

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
					// 156:28: -> ^( FUNC_CALL Arc ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:31: ^( FUNC_CALL Arc ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Arc.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:47: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) | GetIntersect '(' ( exprList )? ')' -> ^( FUNC_CALL GetIntersect ( exprList )? ) );
	public final PogoParser.getCall_return getCall() throws RecognitionException {
		PogoParser.getCall_return retval = new PogoParser.getCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GetWidth193=null;
		Token char_literal194=null;
		Token char_literal196=null;
		Token GetHeight197=null;
		Token char_literal198=null;
		Token char_literal200=null;
		Token GetX201=null;
		Token char_literal202=null;
		Token char_literal204=null;
		Token GetY205=null;
		Token char_literal206=null;
		Token char_literal208=null;
		Token GetOrigin209=null;
		Token char_literal210=null;
		Token char_literal212=null;
		Token GetRotation213=null;
		Token char_literal214=null;
		Token char_literal216=null;
		Token GetFill217=null;
		Token char_literal218=null;
		Token char_literal220=null;
		Token GetStroke221=null;
		Token char_literal222=null;
		Token char_literal224=null;
		Token GetStart225=null;
		Token char_literal226=null;
		Token char_literal228=null;
		Token GetEnd229=null;
		Token char_literal230=null;
		Token char_literal232=null;
		Token GetDistance233=null;
		Token char_literal234=null;
		Token char_literal236=null;
		Token GetIntersect237=null;
		Token char_literal238=null;
		Token char_literal240=null;
		ParserRuleReturnScope expression195 =null;
		ParserRuleReturnScope expression199 =null;
		ParserRuleReturnScope expression203 =null;
		ParserRuleReturnScope expression207 =null;
		ParserRuleReturnScope expression211 =null;
		ParserRuleReturnScope expression215 =null;
		ParserRuleReturnScope expression219 =null;
		ParserRuleReturnScope expression223 =null;
		ParserRuleReturnScope expression227 =null;
		ParserRuleReturnScope expression231 =null;
		ParserRuleReturnScope exprList235 =null;
		ParserRuleReturnScope exprList239 =null;

		Object GetWidth193_tree=null;
		Object char_literal194_tree=null;
		Object char_literal196_tree=null;
		Object GetHeight197_tree=null;
		Object char_literal198_tree=null;
		Object char_literal200_tree=null;
		Object GetX201_tree=null;
		Object char_literal202_tree=null;
		Object char_literal204_tree=null;
		Object GetY205_tree=null;
		Object char_literal206_tree=null;
		Object char_literal208_tree=null;
		Object GetOrigin209_tree=null;
		Object char_literal210_tree=null;
		Object char_literal212_tree=null;
		Object GetRotation213_tree=null;
		Object char_literal214_tree=null;
		Object char_literal216_tree=null;
		Object GetFill217_tree=null;
		Object char_literal218_tree=null;
		Object char_literal220_tree=null;
		Object GetStroke221_tree=null;
		Object char_literal222_tree=null;
		Object char_literal224_tree=null;
		Object GetStart225_tree=null;
		Object char_literal226_tree=null;
		Object char_literal228_tree=null;
		Object GetEnd229_tree=null;
		Object char_literal230_tree=null;
		Object char_literal232_tree=null;
		Object GetDistance233_tree=null;
		Object char_literal234_tree=null;
		Object char_literal236_tree=null;
		Object GetIntersect237_tree=null;
		Object char_literal238_tree=null;
		Object char_literal240_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_GetFill=new RewriteRuleTokenStream(adaptor,"token GetFill");
		RewriteRuleTokenStream stream_GetEnd=new RewriteRuleTokenStream(adaptor,"token GetEnd");
		RewriteRuleTokenStream stream_GetRotation=new RewriteRuleTokenStream(adaptor,"token GetRotation");
		RewriteRuleTokenStream stream_GetIntersect=new RewriteRuleTokenStream(adaptor,"token GetIntersect");
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) | GetIntersect '(' ( exprList )? ')' -> ^( FUNC_CALL GetIntersect ( exprList )? ) )
			int alt42=12;
			switch ( input.LA(1) ) {
			case GetWidth:
				{
				alt42=1;
				}
				break;
			case GetHeight:
				{
				alt42=2;
				}
				break;
			case GetX:
				{
				alt42=3;
				}
				break;
			case GetY:
				{
				alt42=4;
				}
				break;
			case GetOrigin:
				{
				alt42=5;
				}
				break;
			case GetRotation:
				{
				alt42=6;
				}
				break;
			case GetFill:
				{
				alt42=7;
				}
				break;
			case GetStroke:
				{
				alt42=8;
				}
				break;
			case GetStart:
				{
				alt42=9;
				}
				break;
			case GetEnd:
				{
				alt42=10;
				}
				break;
			case GetDistance:
				{
				alt42=11;
				}
				break;
			case GetIntersect:
				{
				alt42=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:5: GetWidth '(' expression ')'
					{
					GetWidth193=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1493);  
					stream_GetWidth.add(GetWidth193);

					char_literal194=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1495);  
					stream_OParen.add(char_literal194);

					pushFollow(FOLLOW_expression_in_getCall1497);
					expression195=expression();
					state._fsp--;

					stream_expression.add(expression195.getTree());
					char_literal196=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1499);  
					stream_CParen.add(char_literal196);

					// AST REWRITE
					// elements: expression, GetWidth
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 160:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:35: ^( FUNC_CALL GetWidth expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:4: GetHeight '(' expression ')'
					{
					GetHeight197=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1513);  
					stream_GetHeight.add(GetHeight197);

					char_literal198=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1515);  
					stream_OParen.add(char_literal198);

					pushFollow(FOLLOW_expression_in_getCall1517);
					expression199=expression();
					state._fsp--;

					stream_expression.add(expression199.getTree());
					char_literal200=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1519);  
					stream_CParen.add(char_literal200);

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
					// 161:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:35: ^( FUNC_CALL GetHeight expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:4: GetX '(' expression ')'
					{
					GetX201=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1533);  
					stream_GetX.add(GetX201);

					char_literal202=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1535);  
					stream_OParen.add(char_literal202);

					pushFollow(FOLLOW_expression_in_getCall1537);
					expression203=expression();
					state._fsp--;

					stream_expression.add(expression203.getTree());
					char_literal204=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1539);  
					stream_CParen.add(char_literal204);

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
					// 162:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:30: ^( FUNC_CALL GetX expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:4: GetY '(' expression ')'
					{
					GetY205=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1553);  
					stream_GetY.add(GetY205);

					char_literal206=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1555);  
					stream_OParen.add(char_literal206);

					pushFollow(FOLLOW_expression_in_getCall1557);
					expression207=expression();
					state._fsp--;

					stream_expression.add(expression207.getTree());
					char_literal208=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1559);  
					stream_CParen.add(char_literal208);

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
					// 163:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:30: ^( FUNC_CALL GetY expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:4: GetOrigin '(' expression ')'
					{
					GetOrigin209=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1573);  
					stream_GetOrigin.add(GetOrigin209);

					char_literal210=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1575);  
					stream_OParen.add(char_literal210);

					pushFollow(FOLLOW_expression_in_getCall1577);
					expression211=expression();
					state._fsp--;

					stream_expression.add(expression211.getTree());
					char_literal212=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1579);  
					stream_CParen.add(char_literal212);

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
					// 164:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:35: ^( FUNC_CALL GetOrigin expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:4: GetRotation '(' expression ')'
					{
					GetRotation213=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1593);  
					stream_GetRotation.add(GetRotation213);

					char_literal214=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1595);  
					stream_OParen.add(char_literal214);

					pushFollow(FOLLOW_expression_in_getCall1597);
					expression215=expression();
					state._fsp--;

					stream_expression.add(expression215.getTree());
					char_literal216=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1599);  
					stream_CParen.add(char_literal216);

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
					// 165:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:37: ^( FUNC_CALL GetRotation expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:4: GetFill '(' expression ')'
					{
					GetFill217=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1613);  
					stream_GetFill.add(GetFill217);

					char_literal218=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1615);  
					stream_OParen.add(char_literal218);

					pushFollow(FOLLOW_expression_in_getCall1617);
					expression219=expression();
					state._fsp--;

					stream_expression.add(expression219.getTree());
					char_literal220=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1619);  
					stream_CParen.add(char_literal220);

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
					// 166:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:33: ^( FUNC_CALL GetFill expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:4: GetStroke '(' expression ')'
					{
					GetStroke221=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1633);  
					stream_GetStroke.add(GetStroke221);

					char_literal222=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1635);  
					stream_OParen.add(char_literal222);

					pushFollow(FOLLOW_expression_in_getCall1637);
					expression223=expression();
					state._fsp--;

					stream_expression.add(expression223.getTree());
					char_literal224=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1639);  
					stream_CParen.add(char_literal224);

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
					// 167:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:35: ^( FUNC_CALL GetStroke expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:4: GetStart '(' expression ')'
					{
					GetStart225=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1653);  
					stream_GetStart.add(GetStart225);

					char_literal226=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1655);  
					stream_OParen.add(char_literal226);

					pushFollow(FOLLOW_expression_in_getCall1657);
					expression227=expression();
					state._fsp--;

					stream_expression.add(expression227.getTree());
					char_literal228=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1659);  
					stream_CParen.add(char_literal228);

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
					// 168:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:34: ^( FUNC_CALL GetStart expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:4: GetEnd '(' expression ')'
					{
					GetEnd229=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1673);  
					stream_GetEnd.add(GetEnd229);

					char_literal230=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1675);  
					stream_OParen.add(char_literal230);

					pushFollow(FOLLOW_expression_in_getCall1677);
					expression231=expression();
					state._fsp--;

					stream_expression.add(expression231.getTree());
					char_literal232=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1679);  
					stream_CParen.add(char_literal232);

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
					// 169:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:32: ^( FUNC_CALL GetEnd expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:4: GetDistance '(' ( exprList )? ')'
					{
					GetDistance233=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1694);  
					stream_GetDistance.add(GetDistance233);

					char_literal234=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1696);  
					stream_OParen.add(char_literal234);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:20: ( exprList )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==ATan||(LA40_0 >= Arc && LA40_0 <= Assert)||LA40_0==Bool||LA40_0==COLOR_CONSTANT||(LA40_0 >= Clip && LA40_0 <= Cm)||(LA40_0 >= Copy && LA40_0 <= Curve)||LA40_0==Difference||LA40_0==Ellipse||(LA40_0 >= Excl && LA40_0 <= Expand)||(LA40_0 >= Fill && LA40_0 <= Flatten)||(LA40_0 >= Gaussian && LA40_0 <= Hide)||LA40_0==Identifier||LA40_0==Inch||LA40_0==LAdd||(LA40_0 >= LRemove && LA40_0 <= LShape)||(LA40_0 >= Line && LA40_0 <= Mm)||(LA40_0 >= Move && LA40_0 <= MoveBy)||(LA40_0 >= NoFill && LA40_0 <= Number)||(LA40_0 >= OBracket && LA40_0 <= OParen)||(LA40_0 >= PI_CONSTANT && LA40_0 <= Polygon)||(LA40_0 >= Print && LA40_0 <= Println)||(LA40_0 >= Random && LA40_0 <= Rect)||(LA40_0 >= Rotate && LA40_0 <= Round)||(LA40_0 >= Scale && LA40_0 <= SkirtBack)||(LA40_0 >= String && LA40_0 <= Subtract)||LA40_0==Tan||(LA40_0 >= Union && LA40_0 <= Weight)||LA40_0==Xor) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:20: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1698);
							exprList235=exprList();
							state._fsp--;

							stream_exprList.add(exprList235.getTree());
							}
							break;

					}

					char_literal236=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1702);  
					stream_CParen.add(char_literal236);

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
					// 170:34: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:37: ^( FUNC_CALL GetDistance ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetDistance.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:61: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:4: GetIntersect '(' ( exprList )? ')'
					{
					GetIntersect237=(Token)match(input,GetIntersect,FOLLOW_GetIntersect_in_getCall1719);  
					stream_GetIntersect.add(GetIntersect237);

					char_literal238=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1720);  
					stream_OParen.add(char_literal238);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:20: ( exprList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ATan||(LA41_0 >= Arc && LA41_0 <= Assert)||LA41_0==Bool||LA41_0==COLOR_CONSTANT||(LA41_0 >= Clip && LA41_0 <= Cm)||(LA41_0 >= Copy && LA41_0 <= Curve)||LA41_0==Difference||LA41_0==Ellipse||(LA41_0 >= Excl && LA41_0 <= Expand)||(LA41_0 >= Fill && LA41_0 <= Flatten)||(LA41_0 >= Gaussian && LA41_0 <= Hide)||LA41_0==Identifier||LA41_0==Inch||LA41_0==LAdd||(LA41_0 >= LRemove && LA41_0 <= LShape)||(LA41_0 >= Line && LA41_0 <= Mm)||(LA41_0 >= Move && LA41_0 <= MoveBy)||(LA41_0 >= NoFill && LA41_0 <= Number)||(LA41_0 >= OBracket && LA41_0 <= OParen)||(LA41_0 >= PI_CONSTANT && LA41_0 <= Polygon)||(LA41_0 >= Print && LA41_0 <= Println)||(LA41_0 >= Random && LA41_0 <= Rect)||(LA41_0 >= Rotate && LA41_0 <= Round)||(LA41_0 >= Scale && LA41_0 <= SkirtBack)||(LA41_0 >= String && LA41_0 <= Subtract)||LA41_0==Tan||(LA41_0 >= Union && LA41_0 <= Weight)||LA41_0==Xor) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:20: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1722);
							exprList239=exprList();
							state._fsp--;

							stream_exprList.add(exprList239.getTree());
							}
							break;

					}

					char_literal240=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1726);  
					stream_CParen.add(char_literal240);

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
					// 171:34: -> ^( FUNC_CALL GetIntersect ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:37: ^( FUNC_CALL GetIntersect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetIntersect.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:171:62: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Gaussian '(' ( exprList )? ')' -> ^( FUNC_CALL Gaussian ( exprList )? ) | Noise '(' ( exprList )? ')' -> ^( FUNC_CALL Noise ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) | Inch '(' expression ')' -> ^( FUNC_CALL Inch expression ) | Mm '(' expression ')' -> ^( FUNC_CALL Mm expression ) | Cm '(' expression ')' -> ^( FUNC_CALL Cm expression ) | Units '(' expression ')' -> ^( FUNC_CALL Units expression ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine241=null;
		Token char_literal242=null;
		Token char_literal244=null;
		Token Sine245=null;
		Token char_literal246=null;
		Token char_literal248=null;
		Token Tan249=null;
		Token char_literal250=null;
		Token char_literal252=null;
		Token ATan253=null;
		Token char_literal254=null;
		Token char_literal256=null;
		Token Random257=null;
		Token char_literal258=null;
		Token char_literal260=null;
		Token Gaussian261=null;
		Token char_literal262=null;
		Token char_literal264=null;
		Token Noise265=null;
		Token char_literal266=null;
		Token char_literal268=null;
		Token Round269=null;
		Token char_literal270=null;
		Token char_literal272=null;
		Token Map273=null;
		Token char_literal274=null;
		Token char_literal276=null;
		Token Inch277=null;
		Token char_literal278=null;
		Token char_literal280=null;
		Token Mm281=null;
		Token char_literal282=null;
		Token char_literal284=null;
		Token Cm285=null;
		Token char_literal286=null;
		Token char_literal288=null;
		Token Units289=null;
		Token char_literal290=null;
		Token char_literal292=null;
		ParserRuleReturnScope expression243 =null;
		ParserRuleReturnScope expression247 =null;
		ParserRuleReturnScope expression251 =null;
		ParserRuleReturnScope expression255 =null;
		ParserRuleReturnScope exprList259 =null;
		ParserRuleReturnScope exprList263 =null;
		ParserRuleReturnScope exprList267 =null;
		ParserRuleReturnScope expression271 =null;
		ParserRuleReturnScope exprList275 =null;
		ParserRuleReturnScope expression279 =null;
		ParserRuleReturnScope expression283 =null;
		ParserRuleReturnScope expression287 =null;
		ParserRuleReturnScope expression291 =null;

		Object Cosine241_tree=null;
		Object char_literal242_tree=null;
		Object char_literal244_tree=null;
		Object Sine245_tree=null;
		Object char_literal246_tree=null;
		Object char_literal248_tree=null;
		Object Tan249_tree=null;
		Object char_literal250_tree=null;
		Object char_literal252_tree=null;
		Object ATan253_tree=null;
		Object char_literal254_tree=null;
		Object char_literal256_tree=null;
		Object Random257_tree=null;
		Object char_literal258_tree=null;
		Object char_literal260_tree=null;
		Object Gaussian261_tree=null;
		Object char_literal262_tree=null;
		Object char_literal264_tree=null;
		Object Noise265_tree=null;
		Object char_literal266_tree=null;
		Object char_literal268_tree=null;
		Object Round269_tree=null;
		Object char_literal270_tree=null;
		Object char_literal272_tree=null;
		Object Map273_tree=null;
		Object char_literal274_tree=null;
		Object char_literal276_tree=null;
		Object Inch277_tree=null;
		Object char_literal278_tree=null;
		Object char_literal280_tree=null;
		Object Mm281_tree=null;
		Object char_literal282_tree=null;
		Object char_literal284_tree=null;
		Object Cm285_tree=null;
		Object char_literal286_tree=null;
		Object char_literal288_tree=null;
		Object Units289_tree=null;
		Object char_literal290_tree=null;
		Object char_literal292_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Tan=new RewriteRuleTokenStream(adaptor,"token Tan");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Gaussian=new RewriteRuleTokenStream(adaptor,"token Gaussian");
		RewriteRuleTokenStream stream_Map=new RewriteRuleTokenStream(adaptor,"token Map");
		RewriteRuleTokenStream stream_Round=new RewriteRuleTokenStream(adaptor,"token Round");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleTokenStream stream_ATan=new RewriteRuleTokenStream(adaptor,"token ATan");
		RewriteRuleTokenStream stream_Mm=new RewriteRuleTokenStream(adaptor,"token Mm");
		RewriteRuleTokenStream stream_Cm=new RewriteRuleTokenStream(adaptor,"token Cm");
		RewriteRuleTokenStream stream_Units=new RewriteRuleTokenStream(adaptor,"token Units");
		RewriteRuleTokenStream stream_Inch=new RewriteRuleTokenStream(adaptor,"token Inch");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Noise=new RewriteRuleTokenStream(adaptor,"token Noise");
		RewriteRuleTokenStream stream_Random=new RewriteRuleTokenStream(adaptor,"token Random");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Gaussian '(' ( exprList )? ')' -> ^( FUNC_CALL Gaussian ( exprList )? ) | Noise '(' ( exprList )? ')' -> ^( FUNC_CALL Noise ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) | Inch '(' expression ')' -> ^( FUNC_CALL Inch expression ) | Mm '(' expression ')' -> ^( FUNC_CALL Mm expression ) | Cm '(' expression ')' -> ^( FUNC_CALL Cm expression ) | Units '(' expression ')' -> ^( FUNC_CALL Units expression ) )
			int alt47=13;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt47=1;
				}
				break;
			case Sine:
				{
				alt47=2;
				}
				break;
			case Tan:
				{
				alt47=3;
				}
				break;
			case ATan:
				{
				alt47=4;
				}
				break;
			case Random:
				{
				alt47=5;
				}
				break;
			case Gaussian:
				{
				alt47=6;
				}
				break;
			case Noise:
				{
				alt47=7;
				}
				break;
			case Round:
				{
				alt47=8;
				}
				break;
			case Map:
				{
				alt47=9;
				}
				break;
			case Inch:
				{
				alt47=10;
				}
				break;
			case Mm:
				{
				alt47=11;
				}
				break;
			case Cm:
				{
				alt47=12;
				}
				break;
			case Units:
				{
				alt47=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:6: Cosine '(' expression ')'
					{
					Cosine241=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1758);  
					stream_Cosine.add(Cosine241);

					char_literal242=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1760);  
					stream_OParen.add(char_literal242);

					pushFollow(FOLLOW_expression_in_mathCall1762);
					expression243=expression();
					state._fsp--;

					stream_expression.add(expression243.getTree());
					char_literal244=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1764);  
					stream_CParen.add(char_literal244);

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
					// 175:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:37: ^( FUNC_CALL Cosine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:6: Sine '(' expression ')'
					{
					Sine245=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1783);  
					stream_Sine.add(Sine245);

					char_literal246=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1785);  
					stream_OParen.add(char_literal246);

					pushFollow(FOLLOW_expression_in_mathCall1787);
					expression247=expression();
					state._fsp--;

					stream_expression.add(expression247.getTree());
					char_literal248=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1789);  
					stream_CParen.add(char_literal248);

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
					// 176:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:176:35: ^( FUNC_CALL Sine expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:6: Tan '(' expression ')'
					{
					Tan249=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1808);  
					stream_Tan.add(Tan249);

					char_literal250=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1810);  
					stream_OParen.add(char_literal250);

					pushFollow(FOLLOW_expression_in_mathCall1812);
					expression251=expression();
					state._fsp--;

					stream_expression.add(expression251.getTree());
					char_literal252=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1814);  
					stream_CParen.add(char_literal252);

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
					// 177:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:34: ^( FUNC_CALL Tan expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:6: ATan '(' expression ')'
					{
					ATan253=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1833);  
					stream_ATan.add(ATan253);

					char_literal254=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1835);  
					stream_OParen.add(char_literal254);

					pushFollow(FOLLOW_expression_in_mathCall1837);
					expression255=expression();
					state._fsp--;

					stream_expression.add(expression255.getTree());
					char_literal256=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1839);  
					stream_CParen.add(char_literal256);

					// AST REWRITE
					// elements: ATan, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 178:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:35: ^( FUNC_CALL ATan expression )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:6: Random '(' ( exprList )? ')'
					{
					Random257=(Token)match(input,Random,FOLLOW_Random_in_mathCall1858);  
					stream_Random.add(Random257);

					char_literal258=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1860);  
					stream_OParen.add(char_literal258);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:17: ( exprList )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==ATan||(LA43_0 >= Arc && LA43_0 <= Assert)||LA43_0==Bool||LA43_0==COLOR_CONSTANT||(LA43_0 >= Clip && LA43_0 <= Cm)||(LA43_0 >= Copy && LA43_0 <= Curve)||LA43_0==Difference||LA43_0==Ellipse||(LA43_0 >= Excl && LA43_0 <= Expand)||(LA43_0 >= Fill && LA43_0 <= Flatten)||(LA43_0 >= Gaussian && LA43_0 <= Hide)||LA43_0==Identifier||LA43_0==Inch||LA43_0==LAdd||(LA43_0 >= LRemove && LA43_0 <= LShape)||(LA43_0 >= Line && LA43_0 <= Mm)||(LA43_0 >= Move && LA43_0 <= MoveBy)||(LA43_0 >= NoFill && LA43_0 <= Number)||(LA43_0 >= OBracket && LA43_0 <= OParen)||(LA43_0 >= PI_CONSTANT && LA43_0 <= Polygon)||(LA43_0 >= Print && LA43_0 <= Println)||(LA43_0 >= Random && LA43_0 <= Rect)||(LA43_0 >= Rotate && LA43_0 <= Round)||(LA43_0 >= Scale && LA43_0 <= SkirtBack)||(LA43_0 >= String && LA43_0 <= Subtract)||LA43_0==Tan||(LA43_0 >= Union && LA43_0 <= Weight)||LA43_0==Xor) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1862);
							exprList259=exprList();
							state._fsp--;

							stream_exprList.add(exprList259.getTree());
							}
							break;

					}

					char_literal260=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1865);  
					stream_CParen.add(char_literal260);

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
					// 179:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:36: ^( FUNC_CALL Random ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:55: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: Gaussian '(' ( exprList )? ')'
					{
					Gaussian261=(Token)match(input,Gaussian,FOLLOW_Gaussian_in_mathCall1885);  
					stream_Gaussian.add(Gaussian261);

					char_literal262=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1887);  
					stream_OParen.add(char_literal262);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:19: ( exprList )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==ATan||(LA44_0 >= Arc && LA44_0 <= Assert)||LA44_0==Bool||LA44_0==COLOR_CONSTANT||(LA44_0 >= Clip && LA44_0 <= Cm)||(LA44_0 >= Copy && LA44_0 <= Curve)||LA44_0==Difference||LA44_0==Ellipse||(LA44_0 >= Excl && LA44_0 <= Expand)||(LA44_0 >= Fill && LA44_0 <= Flatten)||(LA44_0 >= Gaussian && LA44_0 <= Hide)||LA44_0==Identifier||LA44_0==Inch||LA44_0==LAdd||(LA44_0 >= LRemove && LA44_0 <= LShape)||(LA44_0 >= Line && LA44_0 <= Mm)||(LA44_0 >= Move && LA44_0 <= MoveBy)||(LA44_0 >= NoFill && LA44_0 <= Number)||(LA44_0 >= OBracket && LA44_0 <= OParen)||(LA44_0 >= PI_CONSTANT && LA44_0 <= Polygon)||(LA44_0 >= Print && LA44_0 <= Println)||(LA44_0 >= Random && LA44_0 <= Rect)||(LA44_0 >= Rotate && LA44_0 <= Round)||(LA44_0 >= Scale && LA44_0 <= SkirtBack)||(LA44_0 >= String && LA44_0 <= Subtract)||LA44_0==Tan||(LA44_0 >= Union && LA44_0 <= Weight)||LA44_0==Xor) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1889);
							exprList263=exprList();
							state._fsp--;

							stream_exprList.add(exprList263.getTree());
							}
							break;

					}

					char_literal264=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1892);  
					stream_CParen.add(char_literal264);

					// AST REWRITE
					// elements: exprList, Gaussian
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 180:35: -> ^( FUNC_CALL Gaussian ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:38: ^( FUNC_CALL Gaussian ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Gaussian.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:59: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:6: Noise '(' ( exprList )? ')'
					{
					Noise265=(Token)match(input,Noise,FOLLOW_Noise_in_mathCall1912);  
					stream_Noise.add(Noise265);

					char_literal266=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1914);  
					stream_OParen.add(char_literal266);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:16: ( exprList )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==ATan||(LA45_0 >= Arc && LA45_0 <= Assert)||LA45_0==Bool||LA45_0==COLOR_CONSTANT||(LA45_0 >= Clip && LA45_0 <= Cm)||(LA45_0 >= Copy && LA45_0 <= Curve)||LA45_0==Difference||LA45_0==Ellipse||(LA45_0 >= Excl && LA45_0 <= Expand)||(LA45_0 >= Fill && LA45_0 <= Flatten)||(LA45_0 >= Gaussian && LA45_0 <= Hide)||LA45_0==Identifier||LA45_0==Inch||LA45_0==LAdd||(LA45_0 >= LRemove && LA45_0 <= LShape)||(LA45_0 >= Line && LA45_0 <= Mm)||(LA45_0 >= Move && LA45_0 <= MoveBy)||(LA45_0 >= NoFill && LA45_0 <= Number)||(LA45_0 >= OBracket && LA45_0 <= OParen)||(LA45_0 >= PI_CONSTANT && LA45_0 <= Polygon)||(LA45_0 >= Print && LA45_0 <= Println)||(LA45_0 >= Random && LA45_0 <= Rect)||(LA45_0 >= Rotate && LA45_0 <= Round)||(LA45_0 >= Scale && LA45_0 <= SkirtBack)||(LA45_0 >= String && LA45_0 <= Subtract)||LA45_0==Tan||(LA45_0 >= Union && LA45_0 <= Weight)||LA45_0==Xor) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1916);
							exprList267=exprList();
							state._fsp--;

							stream_exprList.add(exprList267.getTree());
							}
							break;

					}

					char_literal268=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1919);  
					stream_CParen.add(char_literal268);

					// AST REWRITE
					// elements: exprList, Noise
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 181:32: -> ^( FUNC_CALL Noise ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:35: ^( FUNC_CALL Noise ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Noise.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:53: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: Round '(' expression ')'
					{
					Round269=(Token)match(input,Round,FOLLOW_Round_in_mathCall1939);  
					stream_Round.add(Round269);

					char_literal270=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1940);  
					stream_OParen.add(char_literal270);

					pushFollow(FOLLOW_expression_in_mathCall1942);
					expression271=expression();
					state._fsp--;

					stream_expression.add(expression271.getTree());
					char_literal272=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1944);  
					stream_CParen.add(char_literal272);

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
					// 182:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:35: ^( FUNC_CALL Round expression )
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
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:6: Map '(' ( exprList )? ')'
					{
					Map273=(Token)match(input,Map,FOLLOW_Map_in_mathCall1963);  
					stream_Map.add(Map273);

					char_literal274=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1964);  
					stream_OParen.add(char_literal274);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:13: ( exprList )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==ATan||(LA46_0 >= Arc && LA46_0 <= Assert)||LA46_0==Bool||LA46_0==COLOR_CONSTANT||(LA46_0 >= Clip && LA46_0 <= Cm)||(LA46_0 >= Copy && LA46_0 <= Curve)||LA46_0==Difference||LA46_0==Ellipse||(LA46_0 >= Excl && LA46_0 <= Expand)||(LA46_0 >= Fill && LA46_0 <= Flatten)||(LA46_0 >= Gaussian && LA46_0 <= Hide)||LA46_0==Identifier||LA46_0==Inch||LA46_0==LAdd||(LA46_0 >= LRemove && LA46_0 <= LShape)||(LA46_0 >= Line && LA46_0 <= Mm)||(LA46_0 >= Move && LA46_0 <= MoveBy)||(LA46_0 >= NoFill && LA46_0 <= Number)||(LA46_0 >= OBracket && LA46_0 <= OParen)||(LA46_0 >= PI_CONSTANT && LA46_0 <= Polygon)||(LA46_0 >= Print && LA46_0 <= Println)||(LA46_0 >= Random && LA46_0 <= Rect)||(LA46_0 >= Rotate && LA46_0 <= Round)||(LA46_0 >= Scale && LA46_0 <= SkirtBack)||(LA46_0 >= String && LA46_0 <= Subtract)||LA46_0==Tan||(LA46_0 >= Union && LA46_0 <= Weight)||LA46_0==Xor) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1966);
							exprList275=exprList();
							state._fsp--;

							stream_exprList.add(exprList275.getTree());
							}
							break;

					}

					char_literal276=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1969);  
					stream_CParen.add(char_literal276);

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
					// 183:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:32: ^( FUNC_CALL Map ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:48: ( exprList )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:6: Inch '(' expression ')'
					{
					Inch277=(Token)match(input,Inch,FOLLOW_Inch_in_mathCall1989);  
					stream_Inch.add(Inch277);

					char_literal278=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1991);  
					stream_OParen.add(char_literal278);

					pushFollow(FOLLOW_expression_in_mathCall1993);
					expression279=expression();
					state._fsp--;

					stream_expression.add(expression279.getTree());
					char_literal280=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1995);  
					stream_CParen.add(char_literal280);

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
					// 184:32: -> ^( FUNC_CALL Inch expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:35: ^( FUNC_CALL Inch expression )
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
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:6: Mm '(' expression ')'
					{
					Mm281=(Token)match(input,Mm,FOLLOW_Mm_in_mathCall2014);  
					stream_Mm.add(Mm281);

					char_literal282=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2016);  
					stream_OParen.add(char_literal282);

					pushFollow(FOLLOW_expression_in_mathCall2018);
					expression283=expression();
					state._fsp--;

					stream_expression.add(expression283.getTree());
					char_literal284=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2020);  
					stream_CParen.add(char_literal284);

					// AST REWRITE
					// elements: Mm, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 185:30: -> ^( FUNC_CALL Mm expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:33: ^( FUNC_CALL Mm expression )
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
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:6: Cm '(' expression ')'
					{
					Cm285=(Token)match(input,Cm,FOLLOW_Cm_in_mathCall2039);  
					stream_Cm.add(Cm285);

					char_literal286=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2041);  
					stream_OParen.add(char_literal286);

					pushFollow(FOLLOW_expression_in_mathCall2043);
					expression287=expression();
					state._fsp--;

					stream_expression.add(expression287.getTree());
					char_literal288=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2045);  
					stream_CParen.add(char_literal288);

					// AST REWRITE
					// elements: expression, Cm
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 186:30: -> ^( FUNC_CALL Cm expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:33: ^( FUNC_CALL Cm expression )
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
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:6: Units '(' expression ')'
					{
					Units289=(Token)match(input,Units,FOLLOW_Units_in_mathCall2064);  
					stream_Units.add(Units289);

					char_literal290=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall2065);  
					stream_OParen.add(char_literal290);

					pushFollow(FOLLOW_expression_in_mathCall2067);
					expression291=expression();
					state._fsp--;

					stream_expression.add(expression291.getTree());
					char_literal292=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall2069);  
					stream_CParen.add(char_literal292);

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
					// 187:32: -> ^( FUNC_CALL Units expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:35: ^( FUNC_CALL Units expression )
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


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End296=null;
		ParserRuleReturnScope ifStat293 =null;
		ParserRuleReturnScope elseIfStat294 =null;
		ParserRuleReturnScope elseStat295 =null;

		Object End296_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement2106);
			ifStat293=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat293.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:13: ( elseIfStat )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==Else) ) {
					int LA48_1 = input.LA(2);
					if ( (LA48_1==If) ) {
						alt48=1;
					}

				}

				switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement2108);
					elseIfStat294=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat294.getTree());
					}
					break;

				default :
					break loop48;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:25: ( elseStat )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Else) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement2111);
					elseStat295=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat295.getTree());
					}
					break;

			}

			End296=(Token)match(input,End,FOLLOW_End_in_ifStatement2114);  
			stream_End.add(End296);

			// AST REWRITE
			// elements: elseStat, elseIfStat, ifStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 194:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:194:66: ( elseStat )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If297=null;
		Token Do299=null;
		ParserRuleReturnScope expression298 =null;
		ParserRuleReturnScope block300 =null;

		Object If297_tree=null;
		Object Do299_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:6: If expression Do block
			{
			If297=(Token)match(input,If,FOLLOW_If_in_ifStat2143);  
			stream_If.add(If297);

			pushFollow(FOLLOW_expression_in_ifStat2145);
			expression298=expression();
			state._fsp--;

			stream_expression.add(expression298.getTree());
			Do299=(Token)match(input,Do,FOLLOW_Do_in_ifStat2147);  
			stream_Do.add(Do299);

			pushFollow(FOLLOW_block_in_ifStat2149);
			block300=block();
			state._fsp--;

			stream_block.add(block300.getTree());
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
			// 199:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:32: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else301=null;
		Token If302=null;
		Token Do304=null;
		ParserRuleReturnScope expression303 =null;
		ParserRuleReturnScope block305 =null;

		Object Else301_tree=null;
		Object If302_tree=null;
		Object Do304_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:6: Else If expression Do block
			{
			Else301=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat2173);  
			stream_Else.add(Else301);

			If302=(Token)match(input,If,FOLLOW_If_in_elseIfStat2175);  
			stream_If.add(If302);

			pushFollow(FOLLOW_expression_in_elseIfStat2177);
			expression303=expression();
			state._fsp--;

			stream_expression.add(expression303.getTree());
			Do304=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat2179);  
			stream_Do.add(Do304);

			pushFollow(FOLLOW_block_in_elseIfStat2181);
			block305=block();
			state._fsp--;

			stream_block.add(block305.getTree());
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
			// 203:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:37: ^( EXP expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else306=null;
		Token Do307=null;
		ParserRuleReturnScope block308 =null;

		Object Else306_tree=null;
		Object Do307_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:6: Else Do block
			{
			Else306=(Token)match(input,Else,FOLLOW_Else_in_elseStat2205);  
			stream_Else.add(Else306);

			Do307=(Token)match(input,Do,FOLLOW_Do_in_elseStat2207);  
			stream_Do.add(Do307);

			pushFollow(FOLLOW_block_in_elseStat2209);
			block308=block();
			state._fsp--;

			stream_block.add(block308.getTree());
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
			// 207:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:23: ^( EXP block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def309=null;
		Token Identifier310=null;
		Token char_literal311=null;
		Token char_literal313=null;
		Token Do314=null;
		Token End316=null;
		ParserRuleReturnScope idList312 =null;
		ParserRuleReturnScope block315 =null;

		Object Def309_tree=null;
		Object Identifier310_tree=null;
		Object char_literal311_tree=null;
		Object char_literal313_tree=null;
		Object Do314_tree=null;
		Object End316_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def309=(Token)match(input,Def,FOLLOW_Def_in_functionDecl2231); 
			Def309_tree = (Object)adaptor.create(Def309);
			adaptor.addChild(root_0, Def309_tree);

			Identifier310=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl2233); 
			Identifier310_tree = (Object)adaptor.create(Identifier310);
			adaptor.addChild(root_0, Identifier310_tree);

			char_literal311=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl2235); 
			char_literal311_tree = (Object)adaptor.create(char_literal311);
			adaptor.addChild(root_0, char_literal311_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:25: ( idList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==Identifier) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl2237);
					idList312=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList312.getTree());

					}
					break;

			}

			char_literal313=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl2240); 
			char_literal313_tree = (Object)adaptor.create(char_literal313);
			adaptor.addChild(root_0, char_literal313_tree);

			Do314=(Token)match(input,Do,FOLLOW_Do_in_functionDecl2242); 
			Do314_tree = (Object)adaptor.create(Do314);
			adaptor.addChild(root_0, Do314_tree);

			pushFollow(FOLLOW_block_in_functionDecl2244);
			block315=block();
			state._fsp--;

			adaptor.addChild(root_0, block315.getTree());

			End316=(Token)match(input,End,FOLLOW_End_in_functionDecl2246); 
			End316_tree = (Object)adaptor.create(End316);
			adaptor.addChild(root_0, End316_tree);

			defineFunction((Identifier310!=null?Identifier310.getText():null), (idList312!=null?((Object)idList312.getTree()):null), (block315!=null?((Object)block315.getTree()):null));
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For317=null;
		Token Identifier318=null;
		Token char_literal319=null;
		Token Do321=null;
		Token Do323=null;
		Token End325=null;
		ParserRuleReturnScope expression320 =null;
		ParserRuleReturnScope expression322 =null;
		ParserRuleReturnScope block324 =null;

		Object For317_tree=null;
		Object Identifier318_tree=null;
		Object char_literal319_tree=null;
		Object Do321_tree=null;
		Object Do323_tree=null;
		Object End325_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: For Identifier '=' expression Do expression Do block End
			{
			For317=(Token)match(input,For,FOLLOW_For_in_forStatement2268);  
			stream_For.add(For317);

			Identifier318=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement2270);  
			stream_Identifier.add(Identifier318);

			char_literal319=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement2272);  
			stream_Assign.add(char_literal319);

			pushFollow(FOLLOW_expression_in_forStatement2274);
			expression320=expression();
			state._fsp--;

			stream_expression.add(expression320.getTree());
			Do321=(Token)match(input,Do,FOLLOW_Do_in_forStatement2276);  
			stream_Do.add(Do321);

			pushFollow(FOLLOW_expression_in_forStatement2278);
			expression322=expression();
			state._fsp--;

			stream_expression.add(expression322.getTree());
			Do323=(Token)match(input,Do,FOLLOW_Do_in_forStatement2280);  
			stream_Do.add(Do323);

			pushFollow(FOLLOW_block_in_forStatement2282);
			block324=block();
			state._fsp--;

			stream_block.add(block324.getTree());
			End325=(Token)match(input,End,FOLLOW_End_in_forStatement2284);  
			stream_End.add(End325);

			// AST REWRITE
			// elements: For, block, Identifier, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 217:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:9: ^( For Identifier expression expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:220:1: repeatStatement : Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End -> ^( Repeat Identifier expression expression ( expression )? block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat326=null;
		Token Identifier327=null;
		Token char_literal328=null;
		Token Do330=null;
		Token string_literal332=null;
		Token Do334=null;
		Token End336=null;
		ParserRuleReturnScope expression329 =null;
		ParserRuleReturnScope expression331 =null;
		ParserRuleReturnScope expression333 =null;
		ParserRuleReturnScope block335 =null;

		Object Repeat326_tree=null;
		Object Identifier327_tree=null;
		Object char_literal328_tree=null;
		Object Do330_tree=null;
		Object string_literal332_tree=null;
		Object Do334_tree=null;
		Object End336_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_LAdd=new RewriteRuleTokenStream(adaptor,"token LAdd");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:3: ( Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End -> ^( Repeat Identifier expression expression ( expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:5: Repeat Identifier '=' expression Do expression ( 'add' expression )* Do block End
			{
			Repeat326=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement2317);  
			stream_Repeat.add(Repeat326);

			Identifier327=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement2319);  
			stream_Identifier.add(Identifier327);

			char_literal328=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement2321);  
			stream_Assign.add(char_literal328);

			pushFollow(FOLLOW_expression_in_repeatStatement2323);
			expression329=expression();
			state._fsp--;

			stream_expression.add(expression329.getTree());
			Do330=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement2325);  
			stream_Do.add(Do330);

			pushFollow(FOLLOW_expression_in_repeatStatement2327);
			expression331=expression();
			state._fsp--;

			stream_expression.add(expression331.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:52: ( 'add' expression )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==LAdd) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:53: 'add' expression
					{
					string_literal332=(Token)match(input,LAdd,FOLLOW_LAdd_in_repeatStatement2330);  
					stream_LAdd.add(string_literal332);

					pushFollow(FOLLOW_expression_in_repeatStatement2332);
					expression333=expression();
					state._fsp--;

					stream_expression.add(expression333.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			Do334=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement2336);  
			stream_Do.add(Do334);

			pushFollow(FOLLOW_block_in_repeatStatement2338);
			block335=block();
			state._fsp--;

			stream_block.add(block335.getTree());
			End336=(Token)match(input,End,FOLLOW_End_in_repeatStatement2340);  
			stream_End.add(End336);

			// AST REWRITE
			// elements: Repeat, expression, block, expression, expression, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 221:85: -> ^( Repeat Identifier expression expression ( expression )? block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:88: ^( Repeat Identifier expression expression ( expression )? block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Repeat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:130: ( expression )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While337=null;
		Token Do339=null;
		Token End341=null;
		ParserRuleReturnScope expression338 =null;
		ParserRuleReturnScope block340 =null;

		Object While337_tree=null;
		Object Do339_tree=null;
		Object End341_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:6: While expression Do block End
			{
			While337=(Token)match(input,While,FOLLOW_While_in_whileStatement2373);  
			stream_While.add(While337);

			pushFollow(FOLLOW_expression_in_whileStatement2375);
			expression338=expression();
			state._fsp--;

			stream_expression.add(expression338.getTree());
			Do339=(Token)match(input,Do,FOLLOW_Do_in_whileStatement2377);  
			stream_Do.add(Do339);

			pushFollow(FOLLOW_block_in_whileStatement2379);
			block340=block();
			state._fsp--;

			stream_block.add(block340.getTree());
			End341=(Token)match(input,End,FOLLOW_End_in_whileStatement2381);  
			stream_End.add(End341);

			// AST REWRITE
			// elements: While, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 225:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:39: ^( While expression block )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier342=null;
		Token char_literal343=null;
		Token Identifier344=null;

		Object Identifier342_tree=null;
		Object char_literal343_tree=null;
		Object Identifier344_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:6: Identifier ( ',' Identifier )*
			{
			Identifier342=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2405);  
			stream_Identifier.add(Identifier342);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:17: ( ',' Identifier )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==Comma) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:18: ',' Identifier
					{
					char_literal343=(Token)match(input,Comma,FOLLOW_Comma_in_idList2408);  
					stream_Comma.add(char_literal343);

					Identifier344=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2410);  
					stream_Identifier.add(Identifier344);

					}
					break;

				default :
					break loop52;
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
			// 229:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:38: ^( ID_LIST ( Identifier )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal346=null;
		ParserRuleReturnScope expression345 =null;
		ParserRuleReturnScope expression347 =null;

		Object char_literal346_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList2435);
			expression345=expression();
			state._fsp--;

			stream_expression.add(expression345.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:17: ( ',' expression )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==Comma) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:18: ',' expression
					{
					char_literal346=(Token)match(input,Comma,FOLLOW_Comma_in_exprList2438);  
					stream_Comma.add(char_literal346);

					pushFollow(FOLLOW_expression_in_exprList2440);
					expression347=expression();
					state._fsp--;

					stream_expression.add(expression347.getTree());
					}
					break;

				default :
					break loop53;
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
			// 233:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:38: ^( EXP_LIST ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr348 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression2465);
			condExpr348=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr348.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal350=null;
		Token char_literal351=null;
		Token In352=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr349 =null;
		ParserRuleReturnScope expression353 =null;

		Object char_literal350_tree=null;
		Object char_literal351_tree=null;
		Object In352_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr2480);
			orExpr349=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr349.getTree());
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
			// 241:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt54=3;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==QMark) ) {
				alt54=1;
			}
			else if ( (LA54_0==In) ) {
				alt54=2;
			}
			switch (alt54) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:8: '?' a= expression ':' b= expression
					{
					char_literal350=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr2495);  
					stream_QMark.add(char_literal350);

					pushFollow(FOLLOW_expression_in_condExpr2499);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal351=(Token)match(input,Do,FOLLOW_Do_in_condExpr2501);  
					stream_Do.add(char_literal351);

					pushFollow(FOLLOW_expression_in_condExpr2505);
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
					// 242:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:45: ^( TERNARY orExpr $a $b)
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:8: In expression
					{
					In352=(Token)match(input,In,FOLLOW_In_in_condExpr2528);  
					stream_In.add(In352);

					pushFollow(FOLLOW_expression_in_condExpr2530);
					expression353=expression();
					state._fsp--;

					stream_expression.add(expression353.getTree());
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
					// 243:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:45: ^( In orExpr expression )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal355=null;
		ParserRuleReturnScope andExpr354 =null;
		ParserRuleReturnScope andExpr356 =null;

		Object string_literal355_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr2582);
			andExpr354=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr354.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:14: ( '||' ^ andExpr )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==158) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:15: '||' ^ andExpr
					{
					string_literal355=(Token)match(input,158,FOLLOW_158_in_orExpr2585); 
					string_literal355_tree = (Object)adaptor.create(string_literal355);
					root_0 = (Object)adaptor.becomeRoot(string_literal355_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2588);
					andExpr356=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr356.getTree());

					}
					break;

				default :
					break loop55;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal358=null;
		ParserRuleReturnScope equExpr357 =null;
		ParserRuleReturnScope equExpr359 =null;

		Object string_literal358_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr2604);
			equExpr357=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr357.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:14: ( '&&' ^ equExpr )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==156) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:15: '&&' ^ equExpr
					{
					string_literal358=(Token)match(input,156,FOLLOW_156_in_andExpr2607); 
					string_literal358_tree = (Object)adaptor.create(string_literal358);
					root_0 = (Object)adaptor.becomeRoot(string_literal358_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2610);
					equExpr359=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr359.getTree());

					}
					break;

				default :
					break loop56;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:255:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set361=null;
		ParserRuleReturnScope relExpr360 =null;
		ParserRuleReturnScope relExpr362 =null;

		Object set361_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr2626);
			relExpr360=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr360.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==Equals||LA57_0==NEquals) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:15: ( '==' | '!=' ) ^ relExpr
					{
					set361=input.LT(1);
					set361=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set361), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr2638);
					relExpr362=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr362.getTree());

					}
					break;

				default :
					break loop57;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set364=null;
		ParserRuleReturnScope addExpr363 =null;
		ParserRuleReturnScope addExpr365 =null;

		Object set364_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr2654);
			addExpr363=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr363.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= GT && LA58_0 <= GTEquals)||(LA58_0 >= LT && LA58_0 <= LTEquals)) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set364=input.LT(1);
					set364=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set364), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr2674);
					addExpr365=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr365.getTree());

					}
					break;

				default :
					break loop58;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:263:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set367=null;
		ParserRuleReturnScope mulExpr366 =null;
		ParserRuleReturnScope mulExpr368 =null;

		Object set367_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr2690);
			mulExpr366=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr366.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==Add||LA59_0==Subtract) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:15: ( '+' | '-' ) ^ mulExpr
					{
					set367=input.LT(1);
					set367=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set367), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr2702);
					mulExpr368=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr368.getTree());

					}
					break;

				default :
					break loop59;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:267:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set370=null;
		ParserRuleReturnScope powExpr369 =null;
		ParserRuleReturnScope powExpr371 =null;

		Object set370_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr2718);
			powExpr369=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr369.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==Divide||LA60_0==Modulus||LA60_0==Multiply) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set370=input.LT(1);
					set370=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set370), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr2734);
					powExpr371=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr371.getTree());

					}
					break;

				default :
					break loop60;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal373=null;
		ParserRuleReturnScope unaryExpr372 =null;
		ParserRuleReturnScope unaryExpr374 =null;

		Object char_literal373_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr2750);
			unaryExpr372=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr372.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:16: ( '^' ^ unaryExpr )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==Pow) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:17: '^' ^ unaryExpr
					{
					char_literal373=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr2753); 
					char_literal373_tree = (Object)adaptor.create(char_literal373);
					root_0 = (Object)adaptor.becomeRoot(char_literal373_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr2756);
					unaryExpr374=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr374.getTree());

					}
					break;

				default :
					break loop61;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal375=null;
		Token char_literal377=null;
		ParserRuleReturnScope atom376 =null;
		ParserRuleReturnScope atom378 =null;
		ParserRuleReturnScope atom379 =null;

		Object char_literal375_tree=null;
		Object char_literal377_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt62=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt62=1;
				}
				break;
			case Excl:
				{
				alt62=2;
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
			case GetDistance:
			case GetEnd:
			case GetFill:
			case GetHeight:
			case GetIntersect:
			case GetOrigin:
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
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case Units:
			case WIDTH_CONSTANT:
			case Wave:
			case Weight:
			case Xor:
				{
				alt62=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:6: '-' atom
					{
					char_literal375=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr2774);  
					stream_Subtract.add(char_literal375);

					pushFollow(FOLLOW_atom_in_unaryExpr2776);
					atom376=atom();
					state._fsp--;

					stream_atom.add(atom376.getTree());
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
					// 276:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:18: ^( UNARY_MIN atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:277:6: '!' atom
					{
					char_literal377=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr2791);  
					stream_Excl.add(char_literal377);

					pushFollow(FOLLOW_atom_in_unaryExpr2793);
					atom378=atom();
					state._fsp--;

					stream_atom.add(atom378.getTree());
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
					// 277:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:277:18: ^( NEGATE atom )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr2808);
					atom379=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom379.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number380=null;
		Token Bool381=null;
		Token Null382=null;
		Token COLOR_CONSTANT384=null;
		Token PI_CONSTANT385=null;
		Token WIDTH_CONSTANT386=null;
		Token HEIGHT_CONSTANT387=null;
		ParserRuleReturnScope lookup383 =null;

		Object Number380_tree=null;
		Object Bool381_tree=null;
		Object Null382_tree=null;
		Object COLOR_CONSTANT384_tree=null;
		Object PI_CONSTANT385_tree=null;
		Object WIDTH_CONSTANT386_tree=null;
		Object HEIGHT_CONSTANT387_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt63=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt63=1;
				}
				break;
			case Bool:
				{
				alt63=2;
				}
				break;
			case Null:
				{
				alt63=3;
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
			case GetDistance:
			case GetEnd:
			case GetFill:
			case GetHeight:
			case GetIntersect:
			case GetOrigin:
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
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case Units:
			case Wave:
			case Weight:
			case Xor:
				{
				alt63=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt63=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt63=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt63=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt63=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number380=(Token)match(input,Number,FOLLOW_Number_in_atom2822); 
					Number380_tree = (Object)adaptor.create(Number380);
					adaptor.addChild(root_0, Number380_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool381=(Token)match(input,Bool,FOLLOW_Bool_in_atom2829); 
					Bool381_tree = (Object)adaptor.create(Bool381);
					adaptor.addChild(root_0, Bool381_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null382=(Token)match(input,Null,FOLLOW_Null_in_atom2836); 
					Null382_tree = (Object)adaptor.create(Null382);
					adaptor.addChild(root_0, Null382_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:285:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom2843);
					lookup383=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup383.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:286:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT384=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2849); 
					COLOR_CONSTANT384_tree = (Object)adaptor.create(COLOR_CONSTANT384);
					adaptor.addChild(root_0, COLOR_CONSTANT384_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:287:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT385=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2855); 
					PI_CONSTANT385_tree = (Object)adaptor.create(PI_CONSTANT385);
					adaptor.addChild(root_0, PI_CONSTANT385_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT386=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2861); 
					WIDTH_CONSTANT386_tree = (Object)adaptor.create(WIDTH_CONSTANT386);
					adaptor.addChild(root_0, WIDTH_CONSTANT386_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:289:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT387=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2867); 
					HEIGHT_CONSTANT387_tree = (Object)adaptor.create(HEIGHT_CONSTANT387);
					adaptor.addChild(root_0, HEIGHT_CONSTANT387_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal388=null;
		Token char_literal390=null;
		ParserRuleReturnScope exprList389 =null;

		Object char_literal388_tree=null;
		Object char_literal390_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:6: '[' ( exprList )? ']'
			{
			char_literal388=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2881);  
			stream_OBracket.add(char_literal388);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:10: ( exprList )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==ATan||(LA64_0 >= Arc && LA64_0 <= Assert)||LA64_0==Bool||LA64_0==COLOR_CONSTANT||(LA64_0 >= Clip && LA64_0 <= Cm)||(LA64_0 >= Copy && LA64_0 <= Curve)||LA64_0==Difference||LA64_0==Ellipse||(LA64_0 >= Excl && LA64_0 <= Expand)||(LA64_0 >= Fill && LA64_0 <= Flatten)||(LA64_0 >= Gaussian && LA64_0 <= Hide)||LA64_0==Identifier||LA64_0==Inch||LA64_0==LAdd||(LA64_0 >= LRemove && LA64_0 <= LShape)||(LA64_0 >= Line && LA64_0 <= Mm)||(LA64_0 >= Move && LA64_0 <= MoveBy)||(LA64_0 >= NoFill && LA64_0 <= Number)||(LA64_0 >= OBracket && LA64_0 <= OParen)||(LA64_0 >= PI_CONSTANT && LA64_0 <= Polygon)||(LA64_0 >= Print && LA64_0 <= Println)||(LA64_0 >= Random && LA64_0 <= Rect)||(LA64_0 >= Rotate && LA64_0 <= Round)||(LA64_0 >= Scale && LA64_0 <= SkirtBack)||(LA64_0 >= String && LA64_0 <= Subtract)||LA64_0==Tan||(LA64_0 >= Union && LA64_0 <= Weight)||LA64_0==Xor) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2883);
					exprList389=exprList();
					state._fsp--;

					stream_exprList.add(exprList389.getTree());
					}
					break;

			}

			char_literal390=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2886);  
			stream_CBracket.add(char_literal390);

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
			// 293:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:34: ( exprList )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier396=null;
		Token String399=null;
		Token char_literal401=null;
		Token char_literal403=null;
		ParserRuleReturnScope functionCall391 =null;
		ParserRuleReturnScope indexes392 =null;
		ParserRuleReturnScope dotProperty393 =null;
		ParserRuleReturnScope list394 =null;
		ParserRuleReturnScope indexes395 =null;
		ParserRuleReturnScope indexes397 =null;
		ParserRuleReturnScope dotProperty398 =null;
		ParserRuleReturnScope indexes400 =null;
		ParserRuleReturnScope expression402 =null;
		ParserRuleReturnScope indexes404 =null;

		Object Identifier396_tree=null;
		Object String399_tree=null;
		Object char_literal401_tree=null;
		Object char_literal403_tree=null;
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt72=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA72_1 = input.LA(2);
				if ( (LA72_1==OParen) ) {
					alt72=1;
				}
				else if ( (LA72_1==Add||LA72_1==CBracket||LA72_1==CParen||LA72_1==Comma||(LA72_1 >= Divide && LA72_1 <= Do)||(LA72_1 >= DotEnd && LA72_1 <= DotY)||LA72_1==Equals||(LA72_1 >= GT && LA72_1 <= GTEquals)||LA72_1==In||LA72_1==LAdd||(LA72_1 >= LT && LA72_1 <= LTEquals)||LA72_1==Modulus||LA72_1==Multiply||LA72_1==NEquals||LA72_1==OBracket||LA72_1==Pow||LA72_1==QMark||LA72_1==Subtract||(LA72_1 >= 156 && LA72_1 <= 158)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 1, input);
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
			case GetDistance:
			case GetEnd:
			case GetFill:
			case GetHeight:
			case GetIntersect:
			case GetOrigin:
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
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Show:
			case Sine:
			case Size:
			case Skirt:
			case SkirtBack:
			case Stroke:
			case Tan:
			case Union:
			case Units:
			case Wave:
			case Weight:
			case Xor:
				{
				alt72=1;
				}
				break;
			case OBracket:
				{
				alt72=2;
				}
				break;
			case String:
				{
				alt72=4;
				}
				break;
			case OParen:
				{
				alt72=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2909);
					functionCall391=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall391.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==Add||LA66_0==CBracket||LA66_0==CParen||LA66_0==Comma||(LA66_0 >= Divide && LA66_0 <= Do)||LA66_0==Equals||(LA66_0 >= GT && LA66_0 <= GTEquals)||LA66_0==In||LA66_0==LAdd||(LA66_0 >= LT && LA66_0 <= LTEquals)||LA66_0==Modulus||LA66_0==Multiply||LA66_0==NEquals||LA66_0==OBracket||LA66_0==Pow||LA66_0==QMark||LA66_0==Subtract||(LA66_0 >= 156 && LA66_0 <= 158)) ) {
						alt66=1;
					}
					else if ( ((LA66_0 >= DotEnd && LA66_0 <= DotY)) ) {
						alt66=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:20: ( indexes )?
							int alt65=2;
							int LA65_0 = input.LA(1);
							if ( (LA65_0==OBracket) ) {
								alt65=1;
							}
							switch (alt65) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2912);
									indexes392=indexes();
									state._fsp--;

									stream_indexes.add(indexes392.getTree());
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
							// 297:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:55: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2929);
							dotProperty393=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty393.getTree());
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
							// 297:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:83: ^( DOTPROPERTY functionCall dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2954);
					list394=list();
					state._fsp--;

					stream_list.add(list394.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:11: ( indexes )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==OBracket) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2956);
							indexes395=indexes();
							state._fsp--;

							stream_indexes.add(indexes395.getTree());
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
					// 298:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:51: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier396=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2989);  
					stream_Identifier.add(Identifier396);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==Add||LA69_0==CBracket||LA69_0==CParen||LA69_0==Comma||(LA69_0 >= Divide && LA69_0 <= Do)||LA69_0==Equals||(LA69_0 >= GT && LA69_0 <= GTEquals)||LA69_0==In||LA69_0==LAdd||(LA69_0 >= LT && LA69_0 <= LTEquals)||LA69_0==Modulus||LA69_0==Multiply||LA69_0==NEquals||LA69_0==OBracket||LA69_0==Pow||LA69_0==QMark||LA69_0==Subtract||(LA69_0 >= 156 && LA69_0 <= 158)) ) {
						alt69=1;
					}
					else if ( ((LA69_0 >= DotEnd && LA69_0 <= DotY)) ) {
						alt69=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 69, 0, input);
						throw nvae;
					}

					switch (alt69) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:18: ( indexes )?
							int alt68=2;
							int LA68_0 = input.LA(1);
							if ( (LA68_0==OBracket) ) {
								alt68=1;
							}
							switch (alt68) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2992);
									indexes397=indexes();
									state._fsp--;

									stream_indexes.add(indexes397.getTree());
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
							// 299:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:51: ( indexes )?
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup3009);
							dotProperty398=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty398.getTree());
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
							// 299:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:79: ^( DOTPROPERTY Identifier dotProperty )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:6: String ( indexes )?
					{
					String399=(Token)match(input,String,FOLLOW_String_in_lookup3029);  
					stream_String.add(String399);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:13: ( indexes )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==OBracket) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3031);
							indexes400=indexes();
							state._fsp--;

							stream_indexes.add(indexes400.getTree());
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
					// 300:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:53: ( indexes )?
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:6: '(' expression ')' ( indexes )?
					{
					char_literal401=(Token)match(input,OParen,FOLLOW_OParen_in_lookup3062);  
					stream_OParen.add(char_literal401);

					pushFollow(FOLLOW_expression_in_lookup3064);
					expression402=expression();
					state._fsp--;

					stream_expression.add(expression402.getTree());
					char_literal403=(Token)match(input,CParen,FOLLOW_CParen_in_lookup3066);  
					stream_CParen.add(char_literal403);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:25: ( indexes )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==OBracket) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup3068);
							indexes404=indexes();
							state._fsp--;

							stream_indexes.add(indexes404.getTree());
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
					// 301:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:57: ( indexes )?
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:308:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal405=null;
		Token char_literal407=null;
		ParserRuleReturnScope expression406 =null;

		Object char_literal405_tree=null;
		Object char_literal407_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:6: ( '[' expression ']' )+
			int cnt73=0;
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==OBracket) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:7: '[' expression ']'
					{
					char_literal405=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes3112);  
					stream_OBracket.add(char_literal405);

					pushFollow(FOLLOW_expression_in_indexes3114);
					expression406=expression();
					state._fsp--;

					stream_expression.add(expression406.getTree());
					char_literal407=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes3116);  
					stream_CBracket.add(char_literal407);

					}
					break;

				default :
					if ( cnt73 >= 1 ) break loop73;
					EarlyExitException eee = new EarlyExitException(73, input);
					throw eee;
				}
				cnt73++;
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
			// 309:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:31: ^( INDEXES ( expression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:312:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression408 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:6: ( dotExpression )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:6: ( dotExpression )+
			int cnt74=0;
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( ((LA74_0 >= DotEnd && LA74_0 <= DotY)) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty3147);
					dotExpression408=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression408.getTree());
					}
					break;

				default :
					if ( cnt74 >= 1 ) break loop74;
					EarlyExitException eee = new EarlyExitException(74, input);
					throw eee;
				}
				cnt74++;
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
			// 313:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:26: ^( DOT ( dotExpression )+ )
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set409=null;

		Object set409_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set409=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set409));
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
	public static final BitSet FOLLOW_statement_in_block208 = new BitSet(new long[]{0xE721000063980C82L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_functionDecl_in_block212 = new BitSet(new long[]{0xE721000063980C82L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_Return_in_block217 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_block219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_157_in_block221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_157_in_statement265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_157_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment327 = new BitSet(new long[]{0x0000000000001002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_assignment329 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Assign_in_assignment333 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_assignment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall371 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall373 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_functionCall375 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall396 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall398 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_functionCall400 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall422 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall424 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_functionCall426 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall449 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall451 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_functionCall453 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall475 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall477 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_functionCall479 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall503 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall505 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_functionCall507 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall531 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall533 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_functionCall535 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionCall538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternCall_in_functionCall573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall606 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall608 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall610 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall633 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall635 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall637 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall660 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall662 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall664 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall687 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall689 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall691 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall712 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall714 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall716 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Skirt_in_primitiveCall737 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall739 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall741 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SkirtBack_in_primitiveCall762 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall764 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall766 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall788 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall790 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall792 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall815 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall817 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall819 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall853 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall855 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall857 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall878 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall880 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall882 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Heading_in_transformCall904 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall906 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall908 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall930 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall932 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall934 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall953 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall955 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall957 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall977 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall979 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall981 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall1001 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1003 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1005 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall1025 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1027 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1029 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall1047 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1049 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1051 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall1069 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1071 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1073 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall1093 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1095 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1097 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Show_in_transformCall1115 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1117 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1119 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1137 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1139 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1141 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1161 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1163 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1165 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1183 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1185 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1187 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1205 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1207 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1209 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1229 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1231 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1233 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall1251 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1253 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1255 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Union_in_transformCall1273 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1275 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1277 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Difference_in_transformCall1297 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1299 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1301 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clip_in_transformCall1321 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1323 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1325 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Xor_in_transformCall1345 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1347 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_transformCall1349 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Flatten_in_transformCall1369 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1371 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_transformCall1373 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Grid_in_patternCall1405 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1407 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_patternCall1409 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Wave_in_patternCall1430 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1432 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_patternCall1434 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Arc_in_patternCall1455 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_patternCall1457 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_patternCall1459 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_patternCall1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1493 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1495 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1497 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1513 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1515 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1517 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1533 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1535 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1537 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1553 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1555 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1557 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1573 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1575 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1577 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1593 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1595 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1597 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1613 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1615 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1617 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1633 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1635 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1637 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1653 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1655 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1657 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1673 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1675 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_getCall1677 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1694 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1696 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_getCall1698 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetIntersect_in_getCall1719 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1720 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_getCall1722 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_getCall1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1758 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1760 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1762 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1783 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1785 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1787 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1808 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1810 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1812 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1833 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1835 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1837 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1858 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1860 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_mathCall1862 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Gaussian_in_mathCall1885 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1887 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_mathCall1889 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Noise_in_mathCall1912 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1914 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_mathCall1916 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1939 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1940 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1942 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1963 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1964 = new BitSet(new long[]{0xE3310000439E4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_mathCall1966 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Inch_in_mathCall1989 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1991 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall1993 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Mm_in_mathCall2014 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2016 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall2018 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cm_in_mathCall2039 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2041 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall2043 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Units_in_mathCall2064 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall2065 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_mathCall2067 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_mathCall2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement2106 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement2108 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement2111 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat2143 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_ifStat2145 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_ifStat2147 = new BitSet(new long[]{0xE721000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_ifStat2149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_If_in_elseIfStat2175 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_elseIfStat2177 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat2179 = new BitSet(new long[]{0xE721000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_elseIfStat2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat2205 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_elseStat2207 = new BitSet(new long[]{0xE721000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_elseStat2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl2233 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl2235 = new BitSet(new long[]{0x0000000000040000L,0x0000000000040000L});
	public static final BitSet FOLLOW_idList_in_functionDecl2237 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl2240 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl2242 = new BitSet(new long[]{0xE725000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_functionDecl2244 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl2246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement2270 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Assign_in_forStatement2272 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_forStatement2274 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_forStatement2276 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_forStatement2278 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_forStatement2280 = new BitSet(new long[]{0xE725000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_forStatement2282 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_forStatement2284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement2317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement2319 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement2321 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2323 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement2325 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2327 = new BitSet(new long[]{0x0000000200000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LAdd_in_repeatStatement2330 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2332 = new BitSet(new long[]{0x0000000200000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement2336 = new BitSet(new long[]{0xE725000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_repeatStatement2338 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement2340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement2373 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_whileStatement2375 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement2377 = new BitSet(new long[]{0xE725000063980C80L,0xF1B01C6FCCAC6FFFL,0x000000002F6247E3L});
	public static final BitSet FOLLOW_block_in_whileStatement2379 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList2405 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_idList2408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_idList2410 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_expression_in_exprList2435 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_exprList2438 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_exprList2440 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_condExpr_in_expression2465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr2480 = new BitSet(new long[]{0x0000000000000002L,0x0200000000100000L});
	public static final BitSet FOLLOW_QMark_in_condExpr2495 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_condExpr2499 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Do_in_condExpr2501 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_condExpr2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr2528 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_condExpr2530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2582 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_orExpr2585 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_andExpr2607 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2626 = new BitSet(new long[]{0x0008000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_set_in_equExpr2629 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2638 = new BitSet(new long[]{0x0008000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2654 = new BitSet(new long[]{0x1800000000000002L,0x0000000030000000L});
	public static final BitSet FOLLOW_set_in_relExpr2657 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2674 = new BitSet(new long[]{0x1800000000000002L,0x0000000030000000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2690 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_set_in_addExpr2693 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2702 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2718 = new BitSet(new long[]{0x0000000100000002L,0x0000009000000000L});
	public static final BitSet FOLLOW_set_in_mulExpr2721 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2734 = new BitSet(new long[]{0x0000000100000002L,0x0000009000000000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2750 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr2753 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2756 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr2774 = new BitSet(new long[]{0xE3210000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE267E3L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr2791 = new BitSet(new long[]{0xE3210000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE267E3L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2881 = new BitSet(new long[]{0xE3310000439B4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_exprList_in_list2883 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CBracket_in_list2886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2909 = new BitSet(new long[]{0x00003FF800000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2954 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2989 = new BitSet(new long[]{0x00003FF800000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup3009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup3029 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup3062 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_lookup3064 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CParen_in_lookup3066 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup3068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes3112 = new BitSet(new long[]{0xE3310000439A4C80L,0x31BB7C6FCCA47FFFL,0x000000000BE2E7E3L});
	public static final BitSet FOLLOW_expression_in_indexes3114 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CBracket_in_indexes3116 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty3147 = new BitSet(new long[]{0x00003FF800000002L});
}
