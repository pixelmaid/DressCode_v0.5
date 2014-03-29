// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g 2014-03-28 17:52:00

  package com.pixelmaid.dresscode.antlr;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PyEsqueLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__167=167;
	public static final int T__168=168;
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
	public static final int Random=121;
	public static final int Rect=122;
	public static final int Repeat=123;
	public static final int Return=124;
	public static final int Rotate=125;
	public static final int Round=126;
	public static final int SP=127;
	public static final int SPECIAL=128;
	public static final int STATEMENTS=129;
	public static final int SUB_CALL=130;
	public static final int Scale=131;
	public static final int SemiColon=132;
	public static final int SetCorner=133;
	public static final int SetHFold=134;
	public static final int SetHeight=135;
	public static final int SetName=136;
	public static final int SetSeam=137;
	public static final int SetVFold=138;
	public static final int SetWidth=139;
	public static final int Show=140;
	public static final int Sine=141;
	public static final int Size=142;
	public static final int Skirt=143;
	public static final int SkirtBack=144;
	public static final int Slider=145;
	public static final int SpaceChars=146;
	public static final int Spiral=147;
	public static final int Sq=148;
	public static final int Sqrt=149;
	public static final int String=150;
	public static final int Stroke=151;
	public static final int Subtract=152;
	public static final int TERNARY=153;
	public static final int Tan=154;
	public static final int Template=155;
	public static final int TemplateCollection=156;
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


	  private int previousIndents = -1;
	  private int indentLevel = 0;
	  java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();

	  @Override
	  public void emit(Token t) {
	    state.token = t;
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    super.nextToken();
	    return tokens.isEmpty() ? getEOFToken() : tokens.poll();
	  }

	  private void jump(int ttype) {
	    indentLevel += (ttype == Dedent ? -1 : 1);
	    emit(new CommonToken(ttype, "level=" + indentLevel));
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PyEsqueLexer() {} 
	public PyEsqueLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PyEsqueLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g"; }

	// $ANTLR start "T__167"
	public final void mT__167() throws RecognitionException {
		try {
			int _type = T__167;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:35:8: ( '&&' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:35:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__167"

	// $ANTLR start "T__168"
	public final void mT__168() throws RecognitionException {
		try {
			int _type = T__168;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:36:8: ( '||' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:36:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__168"

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:375:9: ( 'ellipse' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:375:11: 'ellipse'
			{
			match("ellipse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Ellipse"

	// $ANTLR start "Rect"
	public final void mRect() throws RecognitionException {
		try {
			int _type = Rect;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:376:6: ( 'rect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:376:8: 'rect'
			{
			match("rect"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rect"

	// $ANTLR start "Line"
	public final void mLine() throws RecognitionException {
		try {
			int _type = Line;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:377:6: ( 'line' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:377:8: 'line'
			{
			match("line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Line"

	// $ANTLR start "Curve"
	public final void mCurve() throws RecognitionException {
		try {
			int _type = Curve;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:378:7: ( 'curve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:378:9: 'curve'
			{
			match("curve"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Curve"

	// $ANTLR start "Quad"
	public final void mQuad() throws RecognitionException {
		try {
			int _type = Quad;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:379:6: ( 'quad' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:379:8: 'quad'
			{
			match("quad"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Quad"

	// $ANTLR start "Point"
	public final void mPoint() throws RecognitionException {
		try {
			int _type = Point;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:380:7: ( 'point' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:380:9: 'point'
			{
			match("point"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Point"

	// $ANTLR start "Triangle"
	public final void mTriangle() throws RecognitionException {
		try {
			int _type = Triangle;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:381:9: ( 'triangle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:381:11: 'triangle'
			{
			match("triangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Triangle"

	// $ANTLR start "Polygon"
	public final void mPolygon() throws RecognitionException {
		try {
			int _type = Polygon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:382:9: ( 'poly' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:382:11: 'poly'
			{
			match("poly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Polygon"

	// $ANTLR start "Skirt"
	public final void mSkirt() throws RecognitionException {
		try {
			int _type = Skirt;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:383:7: ( 'skirt' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:383:9: 'skirt'
			{
			match("skirt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Skirt"

	// $ANTLR start "SkirtBack"
	public final void mSkirtBack() throws RecognitionException {
		try {
			int _type = SkirtBack;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:384:11: ( 'skirtback' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:384:13: 'skirtback'
			{
			match("skirtback"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SkirtBack"

	// $ANTLR start "LShape"
	public final void mLShape() throws RecognitionException {
		try {
			int _type = LShape;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:385:8: ( 'import' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:385:10: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LShape"

	// $ANTLR start "Cosine"
	public final void mCosine() throws RecognitionException {
		try {
			int _type = Cosine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:388:8: ( 'cos' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:388:9: 'cos'
			{
			match("cos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Cosine"

	// $ANTLR start "Sine"
	public final void mSine() throws RecognitionException {
		try {
			int _type = Sine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:389:6: ( 'sin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:389:8: 'sin'
			{
			match("sin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sine"

	// $ANTLR start "Tan"
	public final void mTan() throws RecognitionException {
		try {
			int _type = Tan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:390:6: ( 'tan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:390:8: 'tan'
			{
			match("tan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Tan"

	// $ANTLR start "ATan"
	public final void mATan() throws RecognitionException {
		try {
			int _type = ATan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:391:6: ( 'atan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:391:8: 'atan'
			{
			match("atan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATan"

	// $ANTLR start "Sqrt"
	public final void mSqrt() throws RecognitionException {
		try {
			int _type = Sqrt;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:392:6: ( 'sqrt' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:392:8: 'sqrt'
			{
			match("sqrt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sqrt"

	// $ANTLR start "Pow"
	public final void mPow() throws RecognitionException {
		try {
			int _type = Pow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:393:6: ( 'pow' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:393:8: 'pow'
			{
			match("pow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pow"

	// $ANTLR start "Sq"
	public final void mSq() throws RecognitionException {
		try {
			int _type = Sq;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:394:5: ( 'sq' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:394:7: 'sq'
			{
			match("sq"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sq"

	// $ANTLR start "Random"
	public final void mRandom() throws RecognitionException {
		try {
			int _type = Random;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:395:9: ( 'random' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:395:11: 'random'
			{
			match("random"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Random"

	// $ANTLR start "Round"
	public final void mRound() throws RecognitionException {
		try {
			int _type = Round;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:396:7: ( 'round' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:396:9: 'round'
			{
			match("round"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Round"

	// $ANTLR start "Gaussian"
	public final void mGaussian() throws RecognitionException {
		try {
			int _type = Gaussian;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:397:9: ( 'gaussianNoise' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:397:11: 'gaussianNoise'
			{
			match("gaussianNoise"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Gaussian"

	// $ANTLR start "Noise"
	public final void mNoise() throws RecognitionException {
		try {
			int _type = Noise;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:398:7: ( 'noise' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:398:9: 'noise'
			{
			match("noise"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Noise"

	// $ANTLR start "Map"
	public final void mMap() throws RecognitionException {
		try {
			int _type = Map;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:399:6: ( 'map' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:399:8: 'map'
			{
			match("map"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Map"

	// $ANTLR start "Inch"
	public final void mInch() throws RecognitionException {
		try {
			int _type = Inch;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:400:11: ( 'inch' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:400:13: 'inch'
			{
			match("inch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Inch"

	// $ANTLR start "Mm"
	public final void mMm() throws RecognitionException {
		try {
			int _type = Mm;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:401:8: ( 'mm' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:401:10: 'mm'
			{
			match("mm"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Mm"

	// $ANTLR start "Cm"
	public final void mCm() throws RecognitionException {
		try {
			int _type = Cm;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:402:8: ( 'cm' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:402:10: 'cm'
			{
			match("cm"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Cm"

	// $ANTLR start "Units"
	public final void mUnits() throws RecognitionException {
		try {
			int _type = Units;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:403:7: ( 'units' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:403:9: 'units'
			{
			match("units"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Units"

	// $ANTLR start "Move"
	public final void mMove() throws RecognitionException {
		try {
			int _type = Move;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:407:6: ( 'moveTo' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:407:8: 'moveTo'
			{
			match("moveTo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Move"

	// $ANTLR start "MoveBy"
	public final void mMoveBy() throws RecognitionException {
		try {
			int _type = MoveBy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:408:8: ( 'moveBy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:408:10: 'moveBy'
			{
			match("moveBy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MoveBy"

	// $ANTLR start "Heading"
	public final void mHeading() throws RecognitionException {
		try {
			int _type = Heading;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:409:9: ( 'headingBy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:409:11: 'headingBy'
			{
			match("headingBy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Heading"

	// $ANTLR start "Copy"
	public final void mCopy() throws RecognitionException {
		try {
			int _type = Copy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:410:6: ( 'copy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:410:8: 'copy'
			{
			match("copy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Copy"

	// $ANTLR start "Rotate"
	public final void mRotate() throws RecognitionException {
		try {
			int _type = Rotate;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:411:8: ( 'rotate' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:411:10: 'rotate'
			{
			match("rotate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rotate"

	// $ANTLR start "Scale"
	public final void mScale() throws RecognitionException {
		try {
			int _type = Scale;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:412:7: ( 'scale' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:412:9: 'scale'
			{
			match("scale"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Scale"

	// $ANTLR start "Fill"
	public final void mFill() throws RecognitionException {
		try {
			int _type = Fill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:413:6: ( 'fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:413:8: 'fill'
			{
			match("fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Fill"

	// $ANTLR start "Stroke"
	public final void mStroke() throws RecognitionException {
		try {
			int _type = Stroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:414:8: ( 'stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:414:10: 'stroke'
			{
			match("stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Stroke"

	// $ANTLR start "NoFill"
	public final void mNoFill() throws RecognitionException {
		try {
			int _type = NoFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:415:8: ( 'noFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:415:10: 'noFill'
			{
			match("noFill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoFill"

	// $ANTLR start "NoStroke"
	public final void mNoStroke() throws RecognitionException {
		try {
			int _type = NoStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:416:10: ( 'noStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:416:12: 'noStroke'
			{
			match("noStroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoStroke"

	// $ANTLR start "Weight"
	public final void mWeight() throws RecognitionException {
		try {
			int _type = Weight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:417:8: ( 'weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:417:10: 'weight'
			{
			match("weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Weight"

	// $ANTLR start "Hide"
	public final void mHide() throws RecognitionException {
		try {
			int _type = Hide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:418:6: ( 'hide' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:418:8: 'hide'
			{
			match("hide"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hide"

	// $ANTLR start "Show"
	public final void mShow() throws RecognitionException {
		try {
			int _type = Show;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:419:6: ( 'show' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:419:8: 'show'
			{
			match("show"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Show"

	// $ANTLR start "Group"
	public final void mGroup() throws RecognitionException {
		try {
			int _type = Group;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:420:7: ( 'group' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:420:9: 'group'
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Group"

	// $ANTLR start "Expand"
	public final void mExpand() throws RecognitionException {
		try {
			int _type = Expand;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:421:9: ( 'expand' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:421:11: 'expand'
			{
			match("expand"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Expand"

	// $ANTLR start "Merge"
	public final void mMerge() throws RecognitionException {
		try {
			int _type = Merge;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:422:7: ( 'merge' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:422:9: 'merge'
			{
			match("merge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Merge"

	// $ANTLR start "MirrorX"
	public final void mMirrorX() throws RecognitionException {
		try {
			int _type = MirrorX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:423:9: ( 'mirrorX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:423:11: 'mirrorX'
			{
			match("mirrorX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MirrorX"

	// $ANTLR start "MirrorY"
	public final void mMirrorY() throws RecognitionException {
		try {
			int _type = MirrorY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:424:8: ( 'mirrorY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:424:10: 'mirrorY'
			{
			match("mirrorY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MirrorY"

	// $ANTLR start "Union"
	public final void mUnion() throws RecognitionException {
		try {
			int _type = Union;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:425:6: ( 'union' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:425:8: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Union"

	// $ANTLR start "Difference"
	public final void mDifference() throws RecognitionException {
		try {
			int _type = Difference;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:426:11: ( 'diff' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:426:13: 'diff'
			{
			match("diff"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Difference"

	// $ANTLR start "Clip"
	public final void mClip() throws RecognitionException {
		try {
			int _type = Clip;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:427:6: ( 'clip' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:427:8: 'clip'
			{
			match("clip"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Clip"

	// $ANTLR start "Xor"
	public final void mXor() throws RecognitionException {
		try {
			int _type = Xor;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:428:5: ( 'xor' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:428:6: 'xor'
			{
			match("xor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Xor"

	// $ANTLR start "Flatten"
	public final void mFlatten() throws RecognitionException {
		try {
			int _type = Flatten;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:429:9: ( 'flatten' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:429:11: 'flatten'
			{
			match("flatten"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Flatten"

	// $ANTLR start "Grid"
	public final void mGrid() throws RecognitionException {
		try {
			int _type = Grid;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:432:6: ( 'grid' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:432:8: 'grid'
			{
			match("grid"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Grid"

	// $ANTLR start "Wave"
	public final void mWave() throws RecognitionException {
		try {
			int _type = Wave;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:433:6: ( 'wave' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:433:8: 'wave'
			{
			match("wave"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Wave"

	// $ANTLR start "Spiral"
	public final void mSpiral() throws RecognitionException {
		try {
			int _type = Spiral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:434:8: ( 'spiral' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:434:10: 'spiral'
			{
			match("spiral"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Spiral"

	// $ANTLR start "Arc"
	public final void mArc() throws RecognitionException {
		try {
			int _type = Arc;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:435:5: ( 'arc' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:435:7: 'arc'
			{
			match("arc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Arc"

	// $ANTLR start "FollowCurve"
	public final void mFollowCurve() throws RecognitionException {
		try {
			int _type = FollowCurve;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:436:12: ( 'followCurve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:436:14: 'followCurve'
			{
			match("followCurve"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FollowCurve"

	// $ANTLR start "Slider"
	public final void mSlider() throws RecognitionException {
		try {
			int _type = Slider;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:439:8: ( 'slider' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:439:10: 'slider'
			{
			match("slider"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Slider"

	// $ANTLR start "Template"
	public final void mTemplate() throws RecognitionException {
		try {
			int _type = Template;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:442:10: ( 'template' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:442:12: 'template'
			{
			match("template"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Template"

	// $ANTLR start "SetWidth"
	public final void mSetWidth() throws RecognitionException {
		try {
			int _type = SetWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:443:10: ( 'setWidth' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:443:12: 'setWidth'
			{
			match("setWidth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetWidth"

	// $ANTLR start "SetHeight"
	public final void mSetHeight() throws RecognitionException {
		try {
			int _type = SetHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:444:11: ( 'setHeight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:444:13: 'setHeight'
			{
			match("setHeight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetHeight"

	// $ANTLR start "SetSeam"
	public final void mSetSeam() throws RecognitionException {
		try {
			int _type = SetSeam;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:445:10: ( 'setSeam' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:445:12: 'setSeam'
			{
			match("setSeam"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetSeam"

	// $ANTLR start "SetCorner"
	public final void mSetCorner() throws RecognitionException {
		try {
			int _type = SetCorner;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:446:11: ( 'setCorner' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:446:13: 'setCorner'
			{
			match("setCorner"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetCorner"

	// $ANTLR start "SetName"
	public final void mSetName() throws RecognitionException {
		try {
			int _type = SetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:447:10: ( 'setName' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:447:12: 'setName'
			{
			match("setName"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetName"

	// $ANTLR start "SetVFold"
	public final void mSetVFold() throws RecognitionException {
		try {
			int _type = SetVFold;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:448:10: ( 'setVFold' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:448:12: 'setVFold'
			{
			match("setVFold"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetVFold"

	// $ANTLR start "SetHFold"
	public final void mSetHFold() throws RecognitionException {
		try {
			int _type = SetHFold;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:449:10: ( 'setHFold' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:449:12: 'setHFold'
			{
			match("setHFold"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SetHFold"

	// $ANTLR start "AddDesign"
	public final void mAddDesign() throws RecognitionException {
		try {
			int _type = AddDesign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:450:11: ( 'addDesign' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:450:13: 'addDesign'
			{
			match("addDesign"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AddDesign"

	// $ANTLR start "TemplateCollection"
	public final void mTemplateCollection() throws RecognitionException {
		try {
			int _type = TemplateCollection;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:451:20: ( 'templateCollection' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:451:22: 'templateCollection'
			{
			match("templateCollection"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TemplateCollection"

	// $ANTLR start "GetWidth"
	public final void mGetWidth() throws RecognitionException {
		try {
			int _type = GetWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:454:9: ( 'getWidth' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:454:11: 'getWidth'
			{
			match("getWidth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetWidth"

	// $ANTLR start "GetHeight"
	public final void mGetHeight() throws RecognitionException {
		try {
			int _type = GetHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:455:10: ( 'getHeight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:455:12: 'getHeight'
			{
			match("getHeight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetHeight"

	// $ANTLR start "GetX"
	public final void mGetX() throws RecognitionException {
		try {
			int _type = GetX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:456:5: ( 'getX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:456:7: 'getX'
			{
			match("getX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetX"

	// $ANTLR start "GetY"
	public final void mGetY() throws RecognitionException {
		try {
			int _type = GetY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:457:5: ( 'getY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:457:7: 'getY'
			{
			match("getY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetY"

	// $ANTLR start "GetOrigin"
	public final void mGetOrigin() throws RecognitionException {
		try {
			int _type = GetOrigin;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:458:10: ( 'getOrigin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:458:12: 'getOrigin'
			{
			match("getOrigin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetOrigin"

	// $ANTLR start "GetRotation"
	public final void mGetRotation() throws RecognitionException {
		try {
			int _type = GetRotation;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:459:12: ( 'getRotation' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:459:14: 'getRotation'
			{
			match("getRotation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetRotation"

	// $ANTLR start "GetAngle"
	public final void mGetAngle() throws RecognitionException {
		try {
			int _type = GetAngle;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:460:10: ( 'getAngle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:460:12: 'getAngle'
			{
			match("getAngle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetAngle"

	// $ANTLR start "GetRadius"
	public final void mGetRadius() throws RecognitionException {
		try {
			int _type = GetRadius;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:461:11: ( 'getRadius' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:461:13: 'getRadius'
			{
			match("getRadius"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetRadius"

	// $ANTLR start "GetFill"
	public final void mGetFill() throws RecognitionException {
		try {
			int _type = GetFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:462:8: ( 'getFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:462:10: 'getFill'
			{
			match("getFill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetFill"

	// $ANTLR start "GetStroke"
	public final void mGetStroke() throws RecognitionException {
		try {
			int _type = GetStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:463:10: ( 'getStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:463:12: 'getStroke'
			{
			match("getStroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetStroke"

	// $ANTLR start "GetStart"
	public final void mGetStart() throws RecognitionException {
		try {
			int _type = GetStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:464:9: ( 'getStart' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:464:11: 'getStart'
			{
			match("getStart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetStart"

	// $ANTLR start "GetEnd"
	public final void mGetEnd() throws RecognitionException {
		try {
			int _type = GetEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:465:7: ( 'getEnd' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:465:9: 'getEnd'
			{
			match("getEnd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetEnd"

	// $ANTLR start "GetDistance"
	public final void mGetDistance() throws RecognitionException {
		try {
			int _type = GetDistance;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:466:12: ( 'getDist' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:466:14: 'getDist'
			{
			match("getDist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetDistance"

	// $ANTLR start "GetIntersect"
	public final void mGetIntersect() throws RecognitionException {
		try {
			int _type = GetIntersect;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:467:13: ( 'getIntersect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:467:15: 'getIntersect'
			{
			match("getIntersect"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetIntersect"

	// $ANTLR start "COLOR_CONSTANT"
	public final void mCOLOR_CONSTANT() throws RecognitionException {
		try {
			int _type = COLOR_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
			int alt1=10;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt1=1;
				}
				break;
			case 'B':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='L') ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8=='U') ) {
						alt1=2;
					}
					else if ( (LA1_8=='A') ) {
						alt1=8;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
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
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'G':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='R') ) {
					int LA1_9 = input.LA(3);
					if ( (LA1_9=='E') ) {
						int LA1_14 = input.LA(4);
						if ( (LA1_14=='E') ) {
							alt1=3;
						}
						else if ( (LA1_14=='Y') ) {
							alt1=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 14, input);
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
								new NoViableAltException("", 1, 9, input);
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
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'P':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='U') ) {
					alt1=4;
				}
				else if ( (LA1_4=='I') ) {
					alt1=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'Y':
				{
				alt1=5;
				}
				break;
			case 'O':
				{
				alt1=6;
				}
				break;
			case 'W':
				{
				alt1=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:17: 'RED'
					{
					match("RED"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:23: 'BLUE'
					{
					match("BLUE"); 

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:30: 'GREEN'
					{
					match("GREEN"); 

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:38: 'PURPLE'
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:47: 'YELLOW'
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:56: 'ORANGE'
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:65: 'PINK'
					{
					match("PINK"); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:72: 'BLACK'
					{
					match("BLACK"); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:80: 'WHITE'
					{
					match("WHITE"); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:88: 'GREY'
					{
					match("GREY"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLOR_CONSTANT"

	// $ANTLR start "WIDTH_CONSTANT"
	public final void mWIDTH_CONSTANT() throws RecognitionException {
		try {
			int _type = WIDTH_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:471:15: ( 'WIDTH' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:471:17: 'WIDTH'
			{
			match("WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WIDTH_CONSTANT"

	// $ANTLR start "HEIGHT_CONSTANT"
	public final void mHEIGHT_CONSTANT() throws RecognitionException {
		try {
			int _type = HEIGHT_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:472:16: ( 'HEIGHT' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:472:18: 'HEIGHT'
			{
			match("HEIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEIGHT_CONSTANT"

	// $ANTLR start "PI_CONSTANT"
	public final void mPI_CONSTANT() throws RecognitionException {
		try {
			int _type = PI_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:474:12: ( 'PI' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:474:14: 'PI'
			{
			match("PI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PI_CONSTANT"

	// $ANTLR start "LAdd"
	public final void mLAdd() throws RecognitionException {
		try {
			int _type = LAdd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:477:6: ( 'add' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:477:8: 'add'
			{
			match("add"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAdd"

	// $ANTLR start "LRemove"
	public final void mLRemove() throws RecognitionException {
		try {
			int _type = LRemove;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:478:9: ( 'remove' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:478:11: 'remove'
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LRemove"

	// $ANTLR start "Println"
	public final void mPrintln() throws RecognitionException {
		try {
			int _type = Println;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:480:10: ( 'println' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:480:12: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Println"

	// $ANTLR start "Print"
	public final void mPrint() throws RecognitionException {
		try {
			int _type = Print;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:481:10: ( 'print' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:481:12: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Print"

	// $ANTLR start "Assert"
	public final void mAssert() throws RecognitionException {
		try {
			int _type = Assert;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:482:10: ( 'assert' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:482:12: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assert"

	// $ANTLR start "Size"
	public final void mSize() throws RecognitionException {
		try {
			int _type = Size;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:483:10: ( 'size' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:483:12: 'size'
			{
			match("size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Size"

	// $ANTLR start "Def"
	public final void mDef() throws RecognitionException {
		try {
			int _type = Def;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:484:10: ( 'function' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:484:12: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Def"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:485:10: ( 'if' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:485:12: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "If"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:486:10: ( 'else' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:486:12: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Else"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:487:10: ( 'return' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:487:12: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Return"

	// $ANTLR start "Repeat"
	public final void mRepeat() throws RecognitionException {
		try {
			int _type = Repeat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:488:9: ( 'repeat' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:488:11: 'repeat'
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Repeat"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:489:10: ( 'while' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:489:12: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "While"

	// $ANTLR start "To"
	public final void mTo() throws RecognitionException {
		try {
			int _type = To;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:490:10: ( 'to' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:490:12: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "To"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:491:10: ( ':' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:491:12: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "In"
	public final void mIn() throws RecognitionException {
		try {
			int _type = In;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:492:10: ( 'in' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:492:12: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "In"

	// $ANTLR start "Null"
	public final void mNull() throws RecognitionException {
		try {
			int _type = Null;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:493:10: ( 'null' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:493:12: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Null"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:496:10: ( 'or' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:496:12: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:497:10: ( 'and' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:497:12: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "Equals"
	public final void mEquals() throws RecognitionException {
		try {
			int _type = Equals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:498:10: ( '==' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:498:12: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equals"

	// $ANTLR start "NEquals"
	public final void mNEquals() throws RecognitionException {
		try {
			int _type = NEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:499:10: ( '!=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:499:12: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEquals"

	// $ANTLR start "GTEquals"
	public final void mGTEquals() throws RecognitionException {
		try {
			int _type = GTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:500:10: ( '>=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:500:12: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEquals"

	// $ANTLR start "LTEquals"
	public final void mLTEquals() throws RecognitionException {
		try {
			int _type = LTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:501:10: ( '<=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:501:12: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEquals"

	// $ANTLR start "Pw"
	public final void mPw() throws RecognitionException {
		try {
			int _type = Pw;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:502:10: ( '^' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:502:12: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pw"

	// $ANTLR start "Excl"
	public final void mExcl() throws RecognitionException {
		try {
			int _type = Excl;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:503:10: ( '!' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:503:12: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Excl"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:504:10: ( '>' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:504:12: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:505:10: ( '<' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:505:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "Add"
	public final void mAdd() throws RecognitionException {
		try {
			int _type = Add;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:506:10: ( '+' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:506:12: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Add"

	// $ANTLR start "Subtract"
	public final void mSubtract() throws RecognitionException {
		try {
			int _type = Subtract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:507:10: ( '-' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:507:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Subtract"

	// $ANTLR start "Multiply"
	public final void mMultiply() throws RecognitionException {
		try {
			int _type = Multiply;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:508:10: ( '*' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:508:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Multiply"

	// $ANTLR start "Divide"
	public final void mDivide() throws RecognitionException {
		try {
			int _type = Divide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:509:10: ( '/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:509:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Divide"

	// $ANTLR start "Modulus"
	public final void mModulus() throws RecognitionException {
		try {
			int _type = Modulus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:510:10: ( '%' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:510:12: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Modulus"

	// $ANTLR start "OBrace"
	public final void mOBrace() throws RecognitionException {
		try {
			int _type = OBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:511:10: ( '{' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:511:12: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBrace"

	// $ANTLR start "CBrace"
	public final void mCBrace() throws RecognitionException {
		try {
			int _type = CBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:512:10: ( '}' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:512:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBrace"

	// $ANTLR start "OBracket"
	public final void mOBracket() throws RecognitionException {
		try {
			int _type = OBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:513:10: ( '[' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:513:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBracket"

	// $ANTLR start "CBracket"
	public final void mCBracket() throws RecognitionException {
		try {
			int _type = CBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:514:10: ( ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:514:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBracket"

	// $ANTLR start "OParen"
	public final void mOParen() throws RecognitionException {
		try {
			int _type = OParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:515:10: ( '(' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:515:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OParen"

	// $ANTLR start "CParen"
	public final void mCParen() throws RecognitionException {
		try {
			int _type = CParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:516:10: ( ')' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:516:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CParen"

	// $ANTLR start "Assign"
	public final void mAssign() throws RecognitionException {
		try {
			int _type = Assign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:518:10: ( '=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:518:12: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assign"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:519:10: ( ',' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:519:12: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "QMark"
	public final void mQMark() throws RecognitionException {
		try {
			int _type = QMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:520:10: ( '?' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:520:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMark"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:522:5: ( '.' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:522:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "Bool"
	public final void mBool() throws RecognitionException {
		try {
			int _type = Bool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:525:3: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:525:6: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:526:6: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Bool"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:3: ( Int ( Dot ( Digit )* )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:10: ( Dot ( Digit )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:15: ( Digit )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:534:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:534:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:534:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\'') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:12: ~ ( '\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:29: '\\\\' ( '\\\\' | '\"' )
							{
							match('\\'); 
							if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:12: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:29: '\\\\' ( '\\\\' | '\\'' )
							{
							match('\\'); 
							if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;

			  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:547:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='/') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='/') ) {
					alt11=1;
				}
				else if ( (LA11_1=='*') ) {
					alt11=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:547:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:547:11: (~ ( '\\n' | '\\r' ) )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					skip();
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:548:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:548:11: ( . )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='*') ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1=='/') ) {
								alt10=2;
							}
							else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
								alt10=1;
							}

						}
						else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:548:11: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop10;
						}
					}

					match("*/"); 

					skip();
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "NewLine"
	public final void mNewLine() throws RecognitionException {
		try {
			int _type = NewLine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken SP1=null;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:2: ( NL ( SP )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:4: NL ( SP )?
			{
			mNL(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:7: ( SP )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\t'||LA12_0==' ') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:7: SP
					{
					int SP1Start1274 = getCharIndex();
					int SP1StartLine1274 = getLine();
					int SP1StartCharPos1274 = getCharPositionInLine();
					mSP(); 
					SP1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, SP1Start1274, getCharIndex()-1);
					SP1.setLine(SP1StartLine1274);
					SP1.setCharPositionInLine(SP1StartCharPos1274);

					}
					break;

			}



			     int n = (SP1!=null?SP1.getText():null) == null ? 0 : (SP1!=null?SP1.getText():null).length();
			     if(n > previousIndents) {
			       jump(Indent);
			       previousIndents = n;
			     }
			     else if(n < previousIndents) {
			       jump(Dedent);
			       previousIndents = n;
			     }
			     else if(input.LA(1) == EOF) {
			       while(indentLevel > 0) {
			         jump(Dedent);
			       }
			     }
			     else {
			       skip();
			     }
			   
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NewLine"

	// $ANTLR start "SemiColon"
	public final void mSemiColon() throws RecognitionException {
		try {
			int _type = SemiColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:577:2: ( ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:577:3: ';'
			{
			match(';'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SemiColon"

	// $ANTLR start "SpaceChars"
	public final void mSpaceChars() throws RecognitionException {
		try {
			int _type = SpaceChars;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:582:2: ( SP )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:582:4: SP
			{
			mSP(); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SpaceChars"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:586:3: ( '1' .. '9' ( Digit )* | '0' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= '1' && LA14_0 <= '9')) ) {
				alt14=1;
			}
			else if ( (LA14_0=='0') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:586:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:586:15: ( Digit )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:587:6: '0'
					{
					match('0'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:591:3: ( '0' .. '9' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:17: ( ( '\\r' )? '\\n' | '\\r' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\r') ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='\n') ) {
					alt16=1;
				}

				else {
					alt16=2;
				}

			}
			else if ( (LA16_0=='\n') ) {
				alt16=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:19: ( '\\r' )? '\\n'
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:19: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:19: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:32: '\\r'
					{
					match('\r'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "SP"
	public final void mSP() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:594:17: ( ( ' ' | '\\t' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:594:19: ( ' ' | '\\t' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:594:19: ( ' ' | '\\t' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\t'||LA17_0==' ') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SP"

	// $ANTLR start "Indent"
	public final void mIndent() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:595:17: ()
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:595:19: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Indent"

	// $ANTLR start "Dedent"
	public final void mDedent() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:596:17: ()
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:596:19: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dedent"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:8: ( T__167 | T__168 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Sqrt | Pow | Sq | Random | Round | Gaussian | Noise | Map | Inch | Mm | Cm | Units | Move | MoveBy | Heading | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Show | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | Flatten | Grid | Wave | Spiral | Arc | FollowCurve | Slider | Template | SetWidth | SetHeight | SetSeam | SetCorner | SetName | SetVFold | SetHFold | AddDesign | TemplateCollection | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetAngle | GetRadius | GetFill | GetStroke | GetStart | GetEnd | GetDistance | GetIntersect | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | Repeat | While | To | Do | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pw | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | NewLine | SemiColon | SpaceChars )
		int alt18=135;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:10: T__167
				{
				mT__167(); 

				}
				break;
			case 2 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:17: T__168
				{
				mT__168(); 

				}
				break;
			case 3 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:24: Ellipse
				{
				mEllipse(); 

				}
				break;
			case 4 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:32: Rect
				{
				mRect(); 

				}
				break;
			case 5 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:37: Line
				{
				mLine(); 

				}
				break;
			case 6 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:42: Curve
				{
				mCurve(); 

				}
				break;
			case 7 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:48: Quad
				{
				mQuad(); 

				}
				break;
			case 8 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:53: Point
				{
				mPoint(); 

				}
				break;
			case 9 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:59: Triangle
				{
				mTriangle(); 

				}
				break;
			case 10 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:68: Polygon
				{
				mPolygon(); 

				}
				break;
			case 11 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:76: Skirt
				{
				mSkirt(); 

				}
				break;
			case 12 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:82: SkirtBack
				{
				mSkirtBack(); 

				}
				break;
			case 13 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:92: LShape
				{
				mLShape(); 

				}
				break;
			case 14 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:99: Cosine
				{
				mCosine(); 

				}
				break;
			case 15 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:106: Sine
				{
				mSine(); 

				}
				break;
			case 16 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:111: Tan
				{
				mTan(); 

				}
				break;
			case 17 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:115: ATan
				{
				mATan(); 

				}
				break;
			case 18 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:120: Sqrt
				{
				mSqrt(); 

				}
				break;
			case 19 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:125: Pow
				{
				mPow(); 

				}
				break;
			case 20 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:129: Sq
				{
				mSq(); 

				}
				break;
			case 21 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:132: Random
				{
				mRandom(); 

				}
				break;
			case 22 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:139: Round
				{
				mRound(); 

				}
				break;
			case 23 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:145: Gaussian
				{
				mGaussian(); 

				}
				break;
			case 24 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:154: Noise
				{
				mNoise(); 

				}
				break;
			case 25 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:160: Map
				{
				mMap(); 

				}
				break;
			case 26 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:164: Inch
				{
				mInch(); 

				}
				break;
			case 27 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:169: Mm
				{
				mMm(); 

				}
				break;
			case 28 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:172: Cm
				{
				mCm(); 

				}
				break;
			case 29 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:175: Units
				{
				mUnits(); 

				}
				break;
			case 30 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:181: Move
				{
				mMove(); 

				}
				break;
			case 31 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:186: MoveBy
				{
				mMoveBy(); 

				}
				break;
			case 32 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:193: Heading
				{
				mHeading(); 

				}
				break;
			case 33 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:201: Copy
				{
				mCopy(); 

				}
				break;
			case 34 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:206: Rotate
				{
				mRotate(); 

				}
				break;
			case 35 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:213: Scale
				{
				mScale(); 

				}
				break;
			case 36 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:219: Fill
				{
				mFill(); 

				}
				break;
			case 37 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:224: Stroke
				{
				mStroke(); 

				}
				break;
			case 38 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:231: NoFill
				{
				mNoFill(); 

				}
				break;
			case 39 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:238: NoStroke
				{
				mNoStroke(); 

				}
				break;
			case 40 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:247: Weight
				{
				mWeight(); 

				}
				break;
			case 41 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:254: Hide
				{
				mHide(); 

				}
				break;
			case 42 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:259: Show
				{
				mShow(); 

				}
				break;
			case 43 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:264: Group
				{
				mGroup(); 

				}
				break;
			case 44 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:270: Expand
				{
				mExpand(); 

				}
				break;
			case 45 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:277: Merge
				{
				mMerge(); 

				}
				break;
			case 46 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:283: MirrorX
				{
				mMirrorX(); 

				}
				break;
			case 47 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:291: MirrorY
				{
				mMirrorY(); 

				}
				break;
			case 48 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:299: Union
				{
				mUnion(); 

				}
				break;
			case 49 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:305: Difference
				{
				mDifference(); 

				}
				break;
			case 50 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:316: Clip
				{
				mClip(); 

				}
				break;
			case 51 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:321: Xor
				{
				mXor(); 

				}
				break;
			case 52 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:325: Flatten
				{
				mFlatten(); 

				}
				break;
			case 53 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:333: Grid
				{
				mGrid(); 

				}
				break;
			case 54 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:338: Wave
				{
				mWave(); 

				}
				break;
			case 55 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:343: Spiral
				{
				mSpiral(); 

				}
				break;
			case 56 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:350: Arc
				{
				mArc(); 

				}
				break;
			case 57 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:354: FollowCurve
				{
				mFollowCurve(); 

				}
				break;
			case 58 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:366: Slider
				{
				mSlider(); 

				}
				break;
			case 59 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:373: Template
				{
				mTemplate(); 

				}
				break;
			case 60 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:382: SetWidth
				{
				mSetWidth(); 

				}
				break;
			case 61 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:391: SetHeight
				{
				mSetHeight(); 

				}
				break;
			case 62 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:401: SetSeam
				{
				mSetSeam(); 

				}
				break;
			case 63 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:409: SetCorner
				{
				mSetCorner(); 

				}
				break;
			case 64 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:419: SetName
				{
				mSetName(); 

				}
				break;
			case 65 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:427: SetVFold
				{
				mSetVFold(); 

				}
				break;
			case 66 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:436: SetHFold
				{
				mSetHFold(); 

				}
				break;
			case 67 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:445: AddDesign
				{
				mAddDesign(); 

				}
				break;
			case 68 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:455: TemplateCollection
				{
				mTemplateCollection(); 

				}
				break;
			case 69 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:474: GetWidth
				{
				mGetWidth(); 

				}
				break;
			case 70 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:483: GetHeight
				{
				mGetHeight(); 

				}
				break;
			case 71 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:493: GetX
				{
				mGetX(); 

				}
				break;
			case 72 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:498: GetY
				{
				mGetY(); 

				}
				break;
			case 73 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:503: GetOrigin
				{
				mGetOrigin(); 

				}
				break;
			case 74 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:513: GetRotation
				{
				mGetRotation(); 

				}
				break;
			case 75 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:525: GetAngle
				{
				mGetAngle(); 

				}
				break;
			case 76 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:534: GetRadius
				{
				mGetRadius(); 

				}
				break;
			case 77 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:544: GetFill
				{
				mGetFill(); 

				}
				break;
			case 78 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:552: GetStroke
				{
				mGetStroke(); 

				}
				break;
			case 79 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:562: GetStart
				{
				mGetStart(); 

				}
				break;
			case 80 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:571: GetEnd
				{
				mGetEnd(); 

				}
				break;
			case 81 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:578: GetDistance
				{
				mGetDistance(); 

				}
				break;
			case 82 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:590: GetIntersect
				{
				mGetIntersect(); 

				}
				break;
			case 83 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:603: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 

				}
				break;
			case 84 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:618: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 

				}
				break;
			case 85 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:633: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 

				}
				break;
			case 86 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:649: PI_CONSTANT
				{
				mPI_CONSTANT(); 

				}
				break;
			case 87 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:661: LAdd
				{
				mLAdd(); 

				}
				break;
			case 88 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:666: LRemove
				{
				mLRemove(); 

				}
				break;
			case 89 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:674: Println
				{
				mPrintln(); 

				}
				break;
			case 90 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:682: Print
				{
				mPrint(); 

				}
				break;
			case 91 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:688: Assert
				{
				mAssert(); 

				}
				break;
			case 92 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:695: Size
				{
				mSize(); 

				}
				break;
			case 93 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:700: Def
				{
				mDef(); 

				}
				break;
			case 94 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:704: If
				{
				mIf(); 

				}
				break;
			case 95 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:707: Else
				{
				mElse(); 

				}
				break;
			case 96 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:712: Return
				{
				mReturn(); 

				}
				break;
			case 97 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:719: Repeat
				{
				mRepeat(); 

				}
				break;
			case 98 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:726: While
				{
				mWhile(); 

				}
				break;
			case 99 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:732: To
				{
				mTo(); 

				}
				break;
			case 100 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:735: Do
				{
				mDo(); 

				}
				break;
			case 101 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:738: In
				{
				mIn(); 

				}
				break;
			case 102 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:741: Null
				{
				mNull(); 

				}
				break;
			case 103 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:746: Or
				{
				mOr(); 

				}
				break;
			case 104 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:749: And
				{
				mAnd(); 

				}
				break;
			case 105 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:753: Equals
				{
				mEquals(); 

				}
				break;
			case 106 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:760: NEquals
				{
				mNEquals(); 

				}
				break;
			case 107 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:768: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 108 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:777: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 109 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:786: Pw
				{
				mPw(); 

				}
				break;
			case 110 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:789: Excl
				{
				mExcl(); 

				}
				break;
			case 111 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:794: GT
				{
				mGT(); 

				}
				break;
			case 112 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:797: LT
				{
				mLT(); 

				}
				break;
			case 113 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:800: Add
				{
				mAdd(); 

				}
				break;
			case 114 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:804: Subtract
				{
				mSubtract(); 

				}
				break;
			case 115 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:813: Multiply
				{
				mMultiply(); 

				}
				break;
			case 116 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:822: Divide
				{
				mDivide(); 

				}
				break;
			case 117 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:829: Modulus
				{
				mModulus(); 

				}
				break;
			case 118 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:837: OBrace
				{
				mOBrace(); 

				}
				break;
			case 119 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:844: CBrace
				{
				mCBrace(); 

				}
				break;
			case 120 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:851: OBracket
				{
				mOBracket(); 

				}
				break;
			case 121 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:860: CBracket
				{
				mCBracket(); 

				}
				break;
			case 122 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:869: OParen
				{
				mOParen(); 

				}
				break;
			case 123 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:876: CParen
				{
				mCParen(); 

				}
				break;
			case 124 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:883: Assign
				{
				mAssign(); 

				}
				break;
			case 125 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:890: Comma
				{
				mComma(); 

				}
				break;
			case 126 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:896: QMark
				{
				mQMark(); 

				}
				break;
			case 127 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:902: Dot
				{
				mDot(); 

				}
				break;
			case 128 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:906: Bool
				{
				mBool(); 

				}
				break;
			case 129 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:911: Number
				{
				mNumber(); 

				}
				break;
			case 130 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:918: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 131 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:929: String
				{
				mString(); 

				}
				break;
			case 132 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:936: Comment
				{
				mComment(); 

				}
				break;
			case 133 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:944: NewLine
				{
				mNewLine(); 

				}
				break;
			case 134 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:952: SemiColon
				{
				mSemiColon(); 

				}
				break;
			case 135 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:962: SpaceChars
				{
				mSpaceChars(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\3\uffff\33\64\1\uffff\1\64\1\176\1\u0080\1\u0082\1\u0084\4\uffff\1\u0086"+
		"\20\uffff\10\64\1\u0095\7\64\1\u00a0\2\64\1\u00a5\7\64\1\u00ae\1\u00af"+
		"\13\64\1\u00be\24\64\1\u00d5\5\64\1\u00db\12\uffff\14\64\1\u00e8\1\64"+
		"\1\uffff\4\64\1\u00ee\3\64\1\u00f2\1\64\1\uffff\1\64\1\u00f5\2\64\1\uffff"+
		"\10\64\2\uffff\1\64\1\u0106\1\u0108\1\64\1\u010a\10\64\1\u011e\1\uffff"+
		"\17\64\1\u012f\1\u0130\5\64\1\uffff\5\64\1\uffff\1\64\1\u013d\1\64\1\u013f"+
		"\6\64\1\u0146\1\64\1\uffff\1\u0148\1\u0149\1\u014a\1\64\1\u014c\1\uffff"+
		"\2\64\1\u014f\1\uffff\2\64\1\uffff\1\u0152\1\u0153\2\64\1\u0156\11\64"+
		"\1\u0161\1\u0162\1\uffff\1\64\1\uffff\1\64\1\uffff\2\64\1\u0167\2\64\1"+
		"\u016a\1\u016b\13\64\1\u0178\1\uffff\6\64\1\u0180\1\u0181\5\64\1\u0187"+
		"\1\64\1\u0189\2\uffff\1\u0130\2\64\1\u0130\1\64\1\u0130\6\64\1\uffff\1"+
		"\64\1\uffff\4\64\1\u0198\1\64\1\uffff\1\u019a\3\uffff\1\u019b\1\uffff"+
		"\1\u019d\1\64\1\uffff\1\64\1\u01a1\2\uffff\1\u01a2\1\64\1\uffff\12\64"+
		"\2\uffff\3\64\1\u01b1\1\uffff\2\64\2\uffff\11\64\1\u01be\2\64\1\uffff"+
		"\2\64\1\u01c3\1\64\1\u01c5\1\u01c6\1\64\2\uffff\3\64\1\u014f\1\64\1\uffff"+
		"\1\u01cc\1\uffff\2\u0130\3\64\1\u0130\1\u01d0\2\64\1\u01d3\1\u01d4\1\u01d5"+
		"\1\u01d6\1\u01d7\1\uffff\1\u01d8\2\uffff\1\64\1\uffff\3\64\2\uffff\1\u01dd"+
		"\1\u01de\1\u01df\7\64\1\u01e7\1\64\1\u01e9\1\64\1\uffff\11\64\1\u01f4"+
		"\2\64\1\uffff\1\u01f7\1\64\1\u01f9\1\u01fa\1\uffff\1\64\2\uffff\4\64\1"+
		"\u0201\1\uffff\3\u0130\1\uffff\1\u0202\1\u0203\6\uffff\1\u0204\3\64\3"+
		"\uffff\3\64\1\u020b\1\64\1\u020d\1\64\1\uffff\1\64\1\uffff\7\64\1\u0217"+
		"\2\64\1\uffff\1\u021a\1\64\1\uffff\1\64\2\uffff\1\u021d\1\u021e\1\64\1"+
		"\u0220\2\64\4\uffff\1\u0223\1\u0225\1\64\1\u0227\1\64\1\u0229\1\uffff"+
		"\1\64\1\uffff\1\u022b\2\64\1\u022e\4\64\1\u0233\1\uffff\1\64\1\u0235\1"+
		"\uffff\1\64\1\u0237\2\uffff\1\64\1\uffff\1\64\1\u023a\1\uffff\1\64\1\uffff"+
		"\1\u023c\1\uffff\1\u023d\1\uffff\1\u023e\1\uffff\1\u023f\1\64\1\uffff"+
		"\1\u0241\1\u0242\1\64\1\u0244\1\uffff\1\u0245\1\uffff\1\64\1\uffff\1\u0247"+
		"\1\64\1\uffff\1\64\4\uffff\1\64\2\uffff\1\64\2\uffff\1\64\1\uffff\3\64"+
		"\1\u0250\1\64\1\u0252\2\64\1\uffff\1\u0255\1\uffff\1\64\1\u0257\1\uffff"+
		"\1\64\1\uffff\3\64\1\u025c\1\uffff";
	static final String DFA18_eofS =
		"\u025d\uffff";
	static final String DFA18_minS =
		"\1\11\2\uffff\1\154\1\141\1\151\1\154\1\165\1\157\1\141\1\143\1\146\1"+
		"\144\1\141\1\157\1\141\1\156\1\145\2\141\1\151\1\157\1\105\1\114\1\122"+
		"\1\111\1\105\1\122\1\110\1\105\1\uffff\1\162\4\75\4\uffff\1\52\20\uffff"+
		"\1\154\1\160\1\143\1\156\1\164\1\156\1\162\1\160\1\60\1\151\1\141\3\151"+
		"\1\156\1\155\1\60\1\151\1\156\1\60\1\141\1\162\1\157\2\151\1\164\1\160"+
		"\2\60\1\141\1\143\1\144\1\163\1\144\1\165\1\151\1\164\1\106\1\154\1\160"+
		"\1\60\1\166\2\162\1\151\1\141\1\144\1\154\1\141\1\154\1\156\1\154\1\151"+
		"\1\166\1\151\1\146\1\162\1\104\1\101\1\105\1\122\1\60\1\114\1\101\1\111"+
		"\1\104\1\111\1\60\12\uffff\1\151\1\145\1\141\1\164\1\157\1\165\1\145\1"+
		"\144\1\156\1\141\1\145\1\166\1\60\1\171\1\uffff\1\160\1\144\1\156\1\171"+
		"\1\60\1\156\1\141\1\145\1\60\1\160\1\uffff\1\162\1\60\1\145\1\164\1\uffff"+
		"\1\154\1\157\1\167\1\162\1\144\1\103\1\157\1\150\2\uffff\1\156\2\60\1"+
		"\145\1\60\1\163\1\165\1\144\1\101\1\163\1\151\1\164\1\154\1\60\1\uffff"+
		"\1\145\1\147\1\162\1\157\1\144\1\145\1\154\1\164\1\154\1\143\1\163\1\147"+
		"\1\145\1\154\1\146\2\60\1\105\1\103\1\105\1\120\1\113\1\uffff\1\114\1"+
		"\116\2\124\1\107\1\uffff\1\160\1\60\1\156\1\60\1\166\1\162\1\141\1\157"+
		"\1\144\1\164\1\60\1\145\1\uffff\3\60\1\164\1\60\1\uffff\1\164\1\156\1"+
		"\60\1\uffff\1\154\1\164\1\uffff\2\60\1\145\1\153\1\60\1\141\1\145\1\151"+
		"\1\106\1\145\1\157\1\141\1\106\1\162\2\60\1\uffff\1\145\1\uffff\1\162"+
		"\1\uffff\1\163\1\160\1\60\1\151\1\145\2\60\1\162\1\141\1\156\1\151\1\164"+
		"\1\156\1\151\1\156\1\145\1\154\1\162\1\60\1\uffff\1\102\1\145\1\157\1"+
		"\163\1\156\1\151\2\60\1\164\1\157\1\164\1\145\1\150\1\60\1\145\1\60\2"+
		"\uffff\1\60\1\113\1\116\1\60\1\114\1\60\1\117\1\107\1\105\2\110\1\163"+
		"\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\60\1\145\1\uffff\1\60"+
		"\3\uffff\1\60\1\uffff\1\60\1\147\1\uffff\1\141\1\60\2\uffff\1\60\1\145"+
		"\1\uffff\1\154\1\162\1\144\1\151\1\157\1\141\1\162\1\155\1\157\1\164\2"+
		"\uffff\1\163\1\164\1\151\1\60\1\uffff\1\144\1\151\2\uffff\1\151\1\164"+
		"\1\144\1\147\1\154\1\141\1\144\1\163\1\164\1\60\1\154\1\157\1\uffff\1"+
		"\157\1\171\1\60\1\162\2\60\1\156\2\uffff\1\145\1\167\1\151\1\60\1\164"+
		"\1\uffff\1\60\1\uffff\2\60\1\105\1\127\1\105\2\60\1\124\1\145\5\60\1\uffff"+
		"\1\60\2\uffff\1\156\1\uffff\1\154\1\164\1\141\2\uffff\3\60\1\164\1\147"+
		"\1\154\1\155\1\156\1\145\1\154\1\60\1\151\1\60\1\141\1\uffff\1\164\2\147"+
		"\1\141\1\151\2\154\1\157\1\162\1\60\1\164\1\145\1\uffff\1\60\1\153\2\60"+
		"\1\uffff\1\130\2\uffff\1\147\1\156\1\103\1\157\1\60\1\uffff\3\60\1\uffff"+
		"\2\60\6\uffff\1\60\2\145\1\143\3\uffff\2\150\1\144\1\60\1\145\1\60\1\144"+
		"\1\uffff\1\147\1\uffff\1\156\2\150\1\151\1\164\1\165\1\145\1\60\1\153"+
		"\1\164\1\uffff\1\60\1\162\1\uffff\1\145\2\uffff\2\60\1\102\1\60\1\165"+
		"\1\156\4\uffff\2\60\1\153\1\60\1\164\1\60\1\uffff\1\162\1\uffff\1\60\1"+
		"\156\1\116\1\60\1\164\1\156\1\151\1\163\1\60\1\uffff\1\145\1\60\1\uffff"+
		"\1\163\1\60\2\uffff\1\171\1\uffff\1\162\1\60\1\uffff\1\157\1\uffff\1\60"+
		"\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\157\1\uffff\2\60\1\157\1\60"+
		"\1\uffff\1\60\1\uffff\1\145\1\uffff\1\60\1\166\1\uffff\1\154\4\uffff\1"+
		"\151\2\uffff\1\156\2\uffff\1\143\1\uffff\1\145\1\154\1\163\1\60\1\164"+
		"\1\60\2\145\1\uffff\1\60\1\uffff\1\143\1\60\1\uffff\1\164\1\uffff\1\151"+
		"\1\157\1\156\1\60\1\uffff";
	static final String DFA18_maxS =
		"\1\175\2\uffff\1\170\1\157\1\151\2\165\2\162\1\164\1\156\1\164\1\162\1"+
		"\165\1\157\1\156\1\151\1\165\1\150\1\151\1\157\1\105\1\114\1\122\1\125"+
		"\1\105\1\122\1\111\1\105\1\uffff\1\162\4\75\4\uffff\1\57\20\uffff\1\163"+
		"\1\160\1\164\1\156\1\165\1\156\1\162\1\163\1\172\1\151\1\141\1\167\1\151"+
		"\1\165\1\156\1\155\1\172\1\151\2\172\1\141\1\162\1\157\2\151\1\164\1\160"+
		"\2\172\1\141\1\143\1\144\1\163\1\144\1\165\1\157\1\164\1\151\1\154\1\160"+
		"\1\172\1\166\2\162\1\151\1\141\1\144\1\154\1\141\1\154\1\156\1\154\1\151"+
		"\1\166\1\151\1\146\1\162\1\104\1\125\1\105\1\122\1\172\1\114\1\101\1\111"+
		"\1\104\1\111\1\172\12\uffff\1\151\1\145\1\141\1\164\1\157\1\165\1\145"+
		"\1\144\1\156\1\141\1\145\1\166\1\172\1\171\1\uffff\1\160\1\144\1\156\1"+
		"\171\1\172\1\156\1\141\1\145\1\172\1\160\1\uffff\1\162\1\172\1\145\1\164"+
		"\1\uffff\1\154\1\157\1\167\1\162\1\144\1\127\1\157\1\150\2\uffff\1\156"+
		"\2\172\1\145\1\172\1\163\1\165\1\144\1\131\1\163\1\151\1\164\1\154\1\172"+
		"\1\uffff\1\145\1\147\1\162\1\164\1\144\1\145\1\154\1\164\1\154\1\143\1"+
		"\163\1\147\1\145\1\154\1\146\2\172\1\105\1\103\1\131\1\120\1\113\1\uffff"+
		"\1\114\1\116\2\124\1\107\1\uffff\1\160\1\172\1\156\1\172\1\166\1\162\1"+
		"\141\1\157\1\144\1\164\1\172\1\145\1\uffff\3\172\1\164\1\172\1\uffff\1"+
		"\164\1\156\1\172\1\uffff\1\154\1\164\1\uffff\2\172\1\145\1\153\1\172\1"+
		"\141\1\145\1\151\2\145\1\157\1\141\1\106\1\162\2\172\1\uffff\1\145\1\uffff"+
		"\1\162\1\uffff\1\163\1\160\1\172\1\151\1\145\2\172\1\162\1\157\1\156\1"+
		"\151\1\164\1\156\1\151\1\156\1\145\1\154\1\162\1\172\1\uffff\1\124\1\145"+
		"\1\157\1\163\1\156\1\151\2\172\1\164\1\157\1\164\1\145\1\150\1\172\1\145"+
		"\1\172\2\uffff\1\172\1\113\1\116\1\172\1\114\1\172\1\117\1\107\1\105\2"+
		"\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\172\1\145\1"+
		"\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\147\1\uffff\1\141\1\172\2\uffff"+
		"\1\172\1\145\1\uffff\1\154\1\162\1\144\1\151\1\157\1\141\1\162\1\155\1"+
		"\157\1\164\2\uffff\1\163\1\164\1\151\1\172\1\uffff\1\144\1\151\2\uffff"+
		"\1\151\1\164\1\144\1\147\1\154\1\162\1\144\1\163\1\164\1\172\1\154\1\157"+
		"\1\uffff\1\157\1\171\1\172\1\162\2\172\1\156\2\uffff\1\145\1\167\1\151"+
		"\1\172\1\164\1\uffff\1\172\1\uffff\2\172\1\105\1\127\1\105\2\172\1\124"+
		"\1\145\5\172\1\uffff\1\172\2\uffff\1\156\1\uffff\1\154\1\164\1\141\2\uffff"+
		"\3\172\1\164\1\147\1\154\1\155\1\156\1\145\1\154\1\172\1\151\1\172\1\141"+
		"\1\uffff\1\164\2\147\1\141\1\151\2\154\1\157\1\162\1\172\1\164\1\145\1"+
		"\uffff\1\172\1\153\2\172\1\uffff\1\131\2\uffff\1\147\1\156\1\103\1\157"+
		"\1\172\1\uffff\3\172\1\uffff\2\172\6\uffff\1\172\2\145\1\143\3\uffff\2"+
		"\150\1\144\1\172\1\145\1\172\1\144\1\uffff\1\147\1\uffff\1\156\2\150\1"+
		"\151\1\164\1\165\1\145\1\172\1\153\1\164\1\uffff\1\172\1\162\1\uffff\1"+
		"\145\2\uffff\2\172\1\102\1\172\1\165\1\156\4\uffff\2\172\1\153\1\172\1"+
		"\164\1\172\1\uffff\1\162\1\uffff\1\172\1\156\1\116\1\172\1\164\1\156\1"+
		"\151\1\163\1\172\1\uffff\1\145\1\172\1\uffff\1\163\1\172\2\uffff\1\171"+
		"\1\uffff\1\162\1\172\1\uffff\1\157\1\uffff\1\172\1\uffff\1\172\1\uffff"+
		"\1\172\1\uffff\1\172\1\157\1\uffff\2\172\1\157\1\172\1\uffff\1\172\1\uffff"+
		"\1\145\1\uffff\1\172\1\166\1\uffff\1\154\4\uffff\1\151\2\uffff\1\156\2"+
		"\uffff\1\143\1\uffff\1\145\1\154\1\163\1\172\1\164\1\172\2\145\1\uffff"+
		"\1\172\1\uffff\1\143\1\172\1\uffff\1\164\1\uffff\1\151\1\157\1\156\1\172"+
		"\1\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\33\uffff\1\144\5\uffff\1\155\1\161\1\162\1\163\1\uffff"+
		"\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\u0081\1"+
		"\u0082\1\u0083\1\u0085\1\u0086\1\u0087\104\uffff\1\151\1\174\1\152\1\156"+
		"\1\153\1\157\1\154\1\160\1\u0084\1\164\16\uffff\1\34\12\uffff\1\143\4"+
		"\uffff\1\24\10\uffff\1\145\1\136\16\uffff\1\33\26\uffff\1\126\5\uffff"+
		"\1\147\14\uffff\1\16\5\uffff\1\23\3\uffff\1\20\2\uffff\1\17\20\uffff\1"+
		"\70\1\uffff\1\127\1\uffff\1\150\23\uffff\1\31\20\uffff\1\63\1\123\14\uffff"+
		"\1\137\1\uffff\1\4\6\uffff\1\5\1\uffff\1\41\1\62\1\7\1\uffff\1\12\2\uffff"+
		"\1\u0080\2\uffff\1\134\1\22\2\uffff\1\52\12\uffff\1\32\1\21\4\uffff\1"+
		"\65\2\uffff\1\107\1\110\14\uffff\1\146\7\uffff\1\51\1\44\5\uffff\1\66"+
		"\1\uffff\1\61\16\uffff\1\26\1\uffff\1\6\1\10\1\uffff\1\132\3\uffff\1\13"+
		"\1\43\16\uffff\1\53\14\uffff\1\30\4\uffff\1\55\1\uffff\1\35\1\60\5\uffff"+
		"\1\142\3\uffff\1\124\2\uffff\1\54\1\130\1\140\1\141\1\25\1\42\4\uffff"+
		"\1\45\1\67\1\72\7\uffff\1\15\1\uffff\1\133\12\uffff\1\120\2\uffff\1\46"+
		"\1\uffff\1\36\1\37\6\uffff\1\50\1\125\1\3\1\131\6\uffff\1\76\1\uffff\1"+
		"\100\11\uffff\1\115\2\uffff\1\121\2\uffff\1\56\1\57\1\uffff\1\64\2\uffff"+
		"\1\11\1\uffff\1\73\1\uffff\1\74\1\uffff\1\102\1\uffff\1\101\2\uffff\1"+
		"\105\4\uffff\1\113\1\uffff\1\117\1\uffff\1\47\2\uffff\1\135\1\uffff\1"+
		"\14\1\75\1\77\1\103\1\uffff\1\106\1\111\1\uffff\1\114\1\116\1\uffff\1"+
		"\40\10\uffff\1\112\1\uffff\1\71\2\uffff\1\122\1\uffff\1\27\4\uffff\1\104";
	static final String DFA18_specialS =
		"\u025d\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\70\1\66\2\uffff\1\66\22\uffff\1\70\1\41\1\65\2\uffff\1\51\1\1\1\65"+
			"\1\56\1\57\1\47\1\45\1\60\1\46\1\62\1\50\12\63\1\36\1\67\1\43\1\40\1"+
			"\42\1\61\1\uffff\1\64\1\27\4\64\1\30\1\35\6\64\1\33\1\31\1\64\1\26\4"+
			"\64\1\34\1\64\1\32\1\64\1\54\1\uffff\1\55\1\44\1\64\1\uffff\1\14\1\64"+
			"\1\6\1\24\1\3\1\22\1\15\1\21\1\13\2\64\1\5\1\17\1\16\1\37\1\10\1\7\1"+
			"\4\1\12\1\11\1\20\1\64\1\23\1\25\2\64\1\52\1\2\1\53",
			"",
			"",
			"\1\71\13\uffff\1\72",
			"\1\74\3\uffff\1\73\11\uffff\1\75",
			"\1\76",
			"\1\102\1\101\1\uffff\1\100\5\uffff\1\77",
			"\1\103",
			"\1\104\2\uffff\1\105",
			"\1\107\3\uffff\1\110\11\uffff\1\111\2\uffff\1\106",
			"\1\115\1\uffff\1\122\2\uffff\1\117\1\113\1\uffff\1\112\1\121\3\uffff"+
			"\1\120\1\114\2\uffff\1\116",
			"\1\125\6\uffff\1\123\1\124",
			"\1\130\11\uffff\1\132\3\uffff\1\127\1\131\1\126",
			"\1\133\3\uffff\1\135\14\uffff\1\134",
			"\1\136\5\uffff\1\137",
			"\1\140\3\uffff\1\143\3\uffff\1\144\3\uffff\1\141\1\uffff\1\142",
			"\1\145",
			"\1\146\3\uffff\1\147",
			"\1\154\7\uffff\1\150\2\uffff\1\151\2\uffff\1\152\5\uffff\1\153",
			"\1\156\3\uffff\1\155\2\uffff\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\166\13\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\171\1\172",
			"\1\173",
			"",
			"\1\174",
			"\1\175",
			"\1\177",
			"\1\u0081",
			"\1\u0083",
			"",
			"",
			"",
			"",
			"\1\u0085\4\uffff\1\u0085",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0087\6\uffff\1\u0088",
			"\1\u0089",
			"\1\u008a\11\uffff\1\u008b\2\uffff\1\u008d\3\uffff\1\u008c",
			"\1\u008e",
			"\1\u0090\1\u008f",
			"\1\u0091",
			"\1\u0092",
			"\1\u0094\2\uffff\1\u0093",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098\2\uffff\1\u0099\12\uffff\1\u009a",
			"\1\u009b",
			"\1\u009c\13\uffff\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00a1",
			"\1\u00a2\13\uffff\1\u00a3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a4\10\64",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00ad\27\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b7\5\uffff\1\u00b6",
			"\1\u00b8",
			"\1\u00ba\14\uffff\1\u00bb\25\uffff\1\u00b9",
			"\1\u00bc",
			"\1\u00bd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d1\23\uffff\1\u00d0",
			"\1\u00d2",
			"\1\u00d3",
			"\12\64\7\uffff\15\64\1\u00d4\14\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00e9",
			"",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f3",
			"",
			"\1\u00f4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f6",
			"\1\u00f7",
			"",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u0100\4\uffff\1\u00fe\5\uffff\1\u0101\4\uffff\1\u00ff\2\uffff\1\u0102"+
			"\1\u00fd",
			"\1\u0103",
			"\1\u0104",
			"",
			"",
			"\1\u0105",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\3\64\1\u0107\26\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0109",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u0114\2\uffff\1\u0118\1\u0117\1\u0115\1\uffff\1\u010f\1\u0119\5\uffff"+
			"\1\u0112\2\uffff\1\u0113\1\u0116\3\uffff\1\u010e\1\u0110\1\u0111",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0123\4\uffff\1\u0122",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133\23\uffff\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"",
			"\1\u013c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u013e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0147",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u014b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u014d",
			"\1\u014e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0150",
			"\1\u0151",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0154",
			"\1\u0155",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015b\36\uffff\1\u015a",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0163",
			"",
			"\1\u0164",
			"",
			"\1\u0165",
			"\1\u0166",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0168",
			"\1\u0169",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u016c",
			"\1\u016e\15\uffff\1\u016d",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u017a\21\uffff\1\u0179",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0188",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018a",
			"\1\u018b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"",
			"\1\u0193",
			"",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0199",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u019c\16\64",
			"\1\u019e",
			"",
			"\1\u019f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u01a0\30\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01a3",
			"",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"",
			"",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u01b2",
			"\1\u01b3",
			"",
			"",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01ba\20\uffff\1\u01b9",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01bf",
			"\1\u01c0",
			"",
			"\1\u01c1",
			"\1\u01c2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01c4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01c7",
			"",
			"",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01cb",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01d1",
			"\1\u01d2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u01d9",
			"",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ea",
			"",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01f5",
			"\1\u01f6",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01f8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u01fb\1\u01fc",
			"",
			"",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"",
			"",
			"",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u020c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u020e",
			"",
			"\1\u020f",
			"",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0218",
			"\1\u0219",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021b",
			"",
			"\1\u021c",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0221",
			"\1\u0222",
			"",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\2\64\1\u0224\27\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0226",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0228",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u022a",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022c",
			"\1\u022d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0234",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0236",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0238",
			"",
			"\1\u0239",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u023b",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0240",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0243",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0246",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0248",
			"",
			"\1\u0249",
			"",
			"",
			"",
			"",
			"\1\u024a",
			"",
			"",
			"\1\u024b",
			"",
			"",
			"\1\u024c",
			"",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0251",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0253",
			"\1\u0254",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0256",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0258",
			"",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__167 | T__168 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Sqrt | Pow | Sq | Random | Round | Gaussian | Noise | Map | Inch | Mm | Cm | Units | Move | MoveBy | Heading | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Show | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | Flatten | Grid | Wave | Spiral | Arc | FollowCurve | Slider | Template | SetWidth | SetHeight | SetSeam | SetCorner | SetName | SetVFold | SetHFold | AddDesign | TemplateCollection | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetAngle | GetRadius | GetFill | GetStroke | GetStart | GetEnd | GetDistance | GetIntersect | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | Repeat | While | To | Do | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pw | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | NewLine | SemiColon | SpaceChars );";
		}
	}

}
