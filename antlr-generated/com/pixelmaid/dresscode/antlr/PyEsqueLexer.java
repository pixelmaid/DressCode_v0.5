// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g 2014-08-02 14:38:56

  package com.pixelmaid.dresscode.antlr;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PyEsqueLexer extends Lexer {
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

	// $ANTLR start "T__168"
	public final void mT__168() throws RecognitionException {
		try {
			int _type = T__168;
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
	// $ANTLR end "T__168"

	// $ANTLR start "T__169"
	public final void mT__169() throws RecognitionException {
		try {
			int _type = T__169;
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
	// $ANTLR end "T__169"

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:461:9: ( 'ellipse' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:461:11: 'ellipse'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:462:6: ( 'rect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:462:8: 'rect'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:463:6: ( 'line' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:463:8: 'line'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:464:7: ( 'curve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:464:9: 'curve'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:465:6: ( 'quad' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:465:8: 'quad'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:466:7: ( 'point' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:466:9: 'point'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:467:9: ( 'triangle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:467:11: 'triangle'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:468:9: ( 'poly' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:468:11: 'poly'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:7: ( 'skirt' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:469:9: 'skirt'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:470:11: ( 'skirtback' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:470:13: 'skirtback'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:471:8: ( 'import' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:471:10: 'import'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:474:8: ( 'cos' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:474:9: 'cos'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:475:6: ( 'sin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:475:8: 'sin'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:476:6: ( 'tan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:476:8: 'tan'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:477:6: ( 'atan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:477:8: 'atan'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:478:6: ( 'sqrt' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:478:8: 'sqrt'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:479:6: ( 'pow' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:479:8: 'pow'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:480:5: ( 'sq' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:480:7: 'sq'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:481:9: ( 'random' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:481:11: 'random'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:482:7: ( 'round' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:482:9: 'round'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:483:9: ( 'gaussianNoise' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:483:11: 'gaussianNoise'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:484:7: ( 'noise' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:484:9: 'noise'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:485:6: ( 'map' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:485:8: 'map'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:486:11: ( 'inch' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:486:13: 'inch'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:487:8: ( 'mm' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:487:10: 'mm'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:488:8: ( 'cm' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:488:10: 'cm'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:489:7: ( 'units' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:489:9: 'units'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:493:6: ( 'moveTo' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:493:8: 'moveTo'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:494:8: ( 'moveBy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:494:10: 'moveBy'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:495:9: ( 'headingBy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:495:11: 'headingBy'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:496:6: ( 'copy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:496:8: 'copy'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:497:8: ( 'rotate' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:497:10: 'rotate'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:498:7: ( 'scale' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:498:9: 'scale'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:499:6: ( 'fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:499:8: 'fill'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:500:8: ( 'stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:500:10: 'stroke'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:501:8: ( 'noFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:501:10: 'noFill'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:502:10: ( 'noStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:502:12: 'noStroke'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:503:8: ( 'weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:503:10: 'weight'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:504:6: ( 'hide' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:504:8: 'hide'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:505:6: ( 'show' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:505:8: 'show'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:506:7: ( 'group' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:506:9: 'group'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:507:9: ( 'expand' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:507:11: 'expand'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:508:7: ( 'merge' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:508:9: 'merge'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:509:9: ( 'mirrorX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:509:11: 'mirrorX'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:510:8: ( 'mirrorY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:510:10: 'mirrorY'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:511:6: ( 'union' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:511:8: 'union'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:512:11: ( 'diff' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:512:13: 'diff'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:513:6: ( 'clip' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:513:8: 'clip'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:514:5: ( 'xor' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:514:6: 'xor'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:515:9: ( 'flatten' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:515:11: 'flatten'
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

	// $ANTLR start "Wave"
	public final void mWave() throws RecognitionException {
		try {
			int _type = Wave;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:519:6: ( 'wave' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:519:8: 'wave'
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

	// $ANTLR start "FollowCurve"
	public final void mFollowCurve() throws RecognitionException {
		try {
			int _type = FollowCurve;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:522:12: ( 'followCurve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:522:14: 'followCurve'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:525:8: ( 'slider' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:525:10: 'slider'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:528:10: ( 'template' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:528:12: 'template'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:529:10: ( 'setWidth' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:529:12: 'setWidth'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:11: ( 'setHeight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:530:13: 'setHeight'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:531:10: ( 'setSeam' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:531:12: 'setSeam'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:532:11: ( 'setCorner' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:532:13: 'setCorner'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:533:10: ( 'setName' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:533:12: 'setName'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:534:10: ( 'setVFold' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:534:12: 'setVFold'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:535:10: ( 'setHFold' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:535:12: 'setHFold'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:536:11: ( 'addDesign' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:536:13: 'addDesign'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:537:20: ( 'templateCollection' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:537:22: 'templateCollection'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:540:9: ( 'getWidth' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:540:11: 'getWidth'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:541:10: ( 'getHeight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:541:12: 'getHeight'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:5: ( 'getX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:542:7: 'getX'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:5: ( 'getY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:543:7: 'getY'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:544:10: ( 'getOrigin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:544:12: 'getOrigin'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:545:12: ( 'getRotation' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:545:14: 'getRotation'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:546:10: ( 'getAngle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:546:12: 'getAngle'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:547:11: ( 'getRadius' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:547:13: 'getRadius'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:548:8: ( 'getFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:548:10: 'getFill'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:549:10: ( 'getStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:549:12: 'getStroke'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:550:9: ( 'getStart' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:550:11: 'getStart'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:551:7: ( 'getEnd' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:551:9: 'getEnd'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:552:12: ( 'getDist' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:552:14: 'getDist'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:13: ( 'getIntersect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:553:15: 'getIntersect'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:17: 'RED'
					{
					match("RED"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:23: 'BLUE'
					{
					match("BLUE"); 

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:30: 'GREEN'
					{
					match("GREEN"); 

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:38: 'PURPLE'
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:47: 'YELLOW'
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:56: 'ORANGE'
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:65: 'PINK'
					{
					match("PINK"); 

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:72: 'BLACK'
					{
					match("BLACK"); 

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:80: 'WHITE'
					{
					match("WHITE"); 

					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:555:88: 'GREY'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:557:15: ( 'WIDTH' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:557:17: 'WIDTH'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:558:16: ( 'HEIGHT' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:558:18: 'HEIGHT'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:560:12: ( 'PI' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:560:14: 'PI'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:563:6: ( 'add' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:563:8: 'add'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:564:9: ( 'remove' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:564:11: 'remove'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:566:10: ( 'println' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:566:12: 'println'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:567:10: ( 'print' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:567:12: 'print'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:568:10: ( 'assert' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:568:12: 'assert'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:569:10: ( 'size' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:569:12: 'size'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:572:10: ( 'function' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:572:13: 'function'
			{
			match("function"); 


			System.out.println("entered function");

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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:576:10: ( 'if' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:576:12: 'if'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:577:10: ( 'else' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:577:12: 'else'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:578:10: ( 'return' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:578:12: 'return'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:579:9: ( 'repeat' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:579:11: 'repeat'
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

	// $ANTLR start "Radial"
	public final void mRadial() throws RecognitionException {
		try {
			int _type = Radial;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:580:9: ( 'radial' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:580:11: 'radial'
			{
			match("radial"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Radial"

	// $ANTLR start "Spiral"
	public final void mSpiral() throws RecognitionException {
		try {
			int _type = Spiral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:581:9: ( 'spiral' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:581:11: 'spiral'
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

	// $ANTLR start "Row"
	public final void mRow() throws RecognitionException {
		try {
			int _type = Row;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:582:7: ( 'row' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:582:9: 'row'
			{
			match("row"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Row"

	// $ANTLR start "Arc"
	public final void mArc() throws RecognitionException {
		try {
			int _type = Arc;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:583:6: ( 'arc' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:583:8: 'arc'
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

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:584:10: ( 'while' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:584:12: 'while'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:585:10: ( 'to' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:585:12: 'to'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:586:10: ( ':' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:586:12: ':'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:587:10: ( 'in' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:587:12: 'in'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:588:10: ( 'null' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:588:12: 'null'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:591:10: ( 'or' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:591:12: 'or'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:592:10: ( 'and' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:592:12: 'and'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:10: ( '==' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:593:12: '=='
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:594:10: ( '!=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:594:12: '!='
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:595:10: ( '>=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:595:12: '>='
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:596:10: ( '<=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:596:12: '<='
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:597:10: ( '^' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:597:12: '^'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:598:10: ( '!' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:598:12: '!'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:599:10: ( '>' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:599:12: '>'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:600:10: ( '<' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:600:12: '<'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:601:10: ( '+' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:601:12: '+'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:602:10: ( '-' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:602:12: '-'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:603:10: ( '*' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:603:12: '*'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:604:10: ( '/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:604:12: '/'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:605:10: ( '%' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:605:12: '%'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:606:10: ( '{' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:606:12: '{'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:607:10: ( '}' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:607:12: '}'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:608:10: ( '[' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:608:12: '['
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:609:10: ( ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:609:12: ']'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:610:10: ( '(' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:610:12: '('
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:611:10: ( ')' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:611:12: ')'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:613:10: ( '=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:613:12: '='
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:614:10: ( ',' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:614:12: ','
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:615:10: ( '?' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:615:12: '?'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:617:5: ( '.' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:617:7: '.'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:620:3: ( 'true' | 'false' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:620:6: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:621:6: 'false'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:625:3: ( Int ( Dot ( Digit )* )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:625:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:625:10: ( Dot ( Digit )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:625:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:625:15: ( Digit )*
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:629:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:629:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:629:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:637:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:637:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:637:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:637:12: ~ ( '\"' | '\\\\' )
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:637:29: '\\\\' ( '\\\\' | '\"' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:638:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:638:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:638:12: ~ ( '\\'' | '\\\\' )
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:638:29: '\\\\' ( '\\\\' | '\\'' )
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:642:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:642:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:642:11: (~ ( '\\n' | '\\r' ) )*
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:643:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:643:11: ( . )*
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
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:643:11: .
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

	// $ANTLR start "SemiColon"
	public final void mSemiColon() throws RecognitionException {
		try {
			int _type = SemiColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:650:2: ( ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:650:3: ';'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:655:2: ( SP )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:655:4: SP
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

	// $ANTLR start "NewLine"
	public final void mNewLine() throws RecognitionException {
		try {
			int _type = NewLine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken SP1=null;


			  //System.out.println("Newline new text= "+input.LA(2));

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:663:2: ( NL ( SP )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:663:4: NL ( SP )?
			{
			mNL(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:663:7: ( SP )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\t'||LA12_0==' ') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:663:7: SP
					{
					int SP1Start1321 = getCharIndex();
					int SP1StartLine1321 = getLine();
					int SP1StartCharPos1321 = getCharPositionInLine();
					mSP(); 
					SP1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, SP1Start1321, getCharIndex()-1);
					SP1.setLine(SP1StartLine1321);
					SP1.setCharPositionInLine(SP1StartCharPos1321);

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

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:688:3: ( '1' .. '9' ( Digit )* | '0' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:688:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:688:15: ( Digit )*
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:689:6: '0'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:693:3: ( '0' .. '9' )
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:695:17: ( ( '\\r' )? '\\n' | '\\r' )
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:695:19: ( '\\r' )? '\\n'
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:695:19: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:695:19: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:695:32: '\\r'
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:696:17: ( ( ' ' | '\\t' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:696:19: ( ' ' | '\\t' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:696:19: ( ' ' | '\\t' )+
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:697:17: ()
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:697:19: 
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
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:698:17: ()
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:698:19: 
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
		// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:8: ( T__168 | T__169 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Sqrt | Pow | Sq | Random | Round | Gaussian | Noise | Map | Inch | Mm | Cm | Units | Move | MoveBy | Heading | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Show | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | Flatten | Wave | FollowCurve | Slider | Template | SetWidth | SetHeight | SetSeam | SetCorner | SetName | SetVFold | SetHFold | AddDesign | TemplateCollection | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetAngle | GetRadius | GetFill | GetStroke | GetStart | GetEnd | GetDistance | GetIntersect | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | Repeat | Radial | Spiral | Row | Arc | While | To | Do | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pw | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | SemiColon | SpaceChars | NewLine )
		int alt18=136;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:10: T__168
				{
				mT__168(); 

				}
				break;
			case 2 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:17: T__169
				{
				mT__169(); 

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
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:333: Wave
				{
				mWave(); 

				}
				break;
			case 54 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:338: FollowCurve
				{
				mFollowCurve(); 

				}
				break;
			case 55 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:350: Slider
				{
				mSlider(); 

				}
				break;
			case 56 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:357: Template
				{
				mTemplate(); 

				}
				break;
			case 57 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:366: SetWidth
				{
				mSetWidth(); 

				}
				break;
			case 58 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:375: SetHeight
				{
				mSetHeight(); 

				}
				break;
			case 59 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:385: SetSeam
				{
				mSetSeam(); 

				}
				break;
			case 60 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:393: SetCorner
				{
				mSetCorner(); 

				}
				break;
			case 61 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:403: SetName
				{
				mSetName(); 

				}
				break;
			case 62 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:411: SetVFold
				{
				mSetVFold(); 

				}
				break;
			case 63 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:420: SetHFold
				{
				mSetHFold(); 

				}
				break;
			case 64 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:429: AddDesign
				{
				mAddDesign(); 

				}
				break;
			case 65 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:439: TemplateCollection
				{
				mTemplateCollection(); 

				}
				break;
			case 66 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:458: GetWidth
				{
				mGetWidth(); 

				}
				break;
			case 67 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:467: GetHeight
				{
				mGetHeight(); 

				}
				break;
			case 68 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:477: GetX
				{
				mGetX(); 

				}
				break;
			case 69 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:482: GetY
				{
				mGetY(); 

				}
				break;
			case 70 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:487: GetOrigin
				{
				mGetOrigin(); 

				}
				break;
			case 71 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:497: GetRotation
				{
				mGetRotation(); 

				}
				break;
			case 72 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:509: GetAngle
				{
				mGetAngle(); 

				}
				break;
			case 73 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:518: GetRadius
				{
				mGetRadius(); 

				}
				break;
			case 74 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:528: GetFill
				{
				mGetFill(); 

				}
				break;
			case 75 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:536: GetStroke
				{
				mGetStroke(); 

				}
				break;
			case 76 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:546: GetStart
				{
				mGetStart(); 

				}
				break;
			case 77 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:555: GetEnd
				{
				mGetEnd(); 

				}
				break;
			case 78 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:562: GetDistance
				{
				mGetDistance(); 

				}
				break;
			case 79 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:574: GetIntersect
				{
				mGetIntersect(); 

				}
				break;
			case 80 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:587: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 

				}
				break;
			case 81 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:602: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 

				}
				break;
			case 82 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:617: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 

				}
				break;
			case 83 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:633: PI_CONSTANT
				{
				mPI_CONSTANT(); 

				}
				break;
			case 84 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:645: LAdd
				{
				mLAdd(); 

				}
				break;
			case 85 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:650: LRemove
				{
				mLRemove(); 

				}
				break;
			case 86 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:658: Println
				{
				mPrintln(); 

				}
				break;
			case 87 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:666: Print
				{
				mPrint(); 

				}
				break;
			case 88 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:672: Assert
				{
				mAssert(); 

				}
				break;
			case 89 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:679: Size
				{
				mSize(); 

				}
				break;
			case 90 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:684: Def
				{
				mDef(); 

				}
				break;
			case 91 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:688: If
				{
				mIf(); 

				}
				break;
			case 92 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:691: Else
				{
				mElse(); 

				}
				break;
			case 93 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:696: Return
				{
				mReturn(); 

				}
				break;
			case 94 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:703: Repeat
				{
				mRepeat(); 

				}
				break;
			case 95 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:710: Radial
				{
				mRadial(); 

				}
				break;
			case 96 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:717: Spiral
				{
				mSpiral(); 

				}
				break;
			case 97 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:724: Row
				{
				mRow(); 

				}
				break;
			case 98 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:728: Arc
				{
				mArc(); 

				}
				break;
			case 99 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:732: While
				{
				mWhile(); 

				}
				break;
			case 100 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:738: To
				{
				mTo(); 

				}
				break;
			case 101 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:741: Do
				{
				mDo(); 

				}
				break;
			case 102 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:744: In
				{
				mIn(); 

				}
				break;
			case 103 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:747: Null
				{
				mNull(); 

				}
				break;
			case 104 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:752: Or
				{
				mOr(); 

				}
				break;
			case 105 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:755: And
				{
				mAnd(); 

				}
				break;
			case 106 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:759: Equals
				{
				mEquals(); 

				}
				break;
			case 107 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:766: NEquals
				{
				mNEquals(); 

				}
				break;
			case 108 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:774: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 109 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:783: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 110 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:792: Pw
				{
				mPw(); 

				}
				break;
			case 111 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:795: Excl
				{
				mExcl(); 

				}
				break;
			case 112 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:800: GT
				{
				mGT(); 

				}
				break;
			case 113 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:803: LT
				{
				mLT(); 

				}
				break;
			case 114 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:806: Add
				{
				mAdd(); 

				}
				break;
			case 115 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:810: Subtract
				{
				mSubtract(); 

				}
				break;
			case 116 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:819: Multiply
				{
				mMultiply(); 

				}
				break;
			case 117 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:828: Divide
				{
				mDivide(); 

				}
				break;
			case 118 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:835: Modulus
				{
				mModulus(); 

				}
				break;
			case 119 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:843: OBrace
				{
				mOBrace(); 

				}
				break;
			case 120 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:850: CBrace
				{
				mCBrace(); 

				}
				break;
			case 121 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:857: OBracket
				{
				mOBracket(); 

				}
				break;
			case 122 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:866: CBracket
				{
				mCBracket(); 

				}
				break;
			case 123 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:875: OParen
				{
				mOParen(); 

				}
				break;
			case 124 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:882: CParen
				{
				mCParen(); 

				}
				break;
			case 125 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:889: Assign
				{
				mAssign(); 

				}
				break;
			case 126 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:896: Comma
				{
				mComma(); 

				}
				break;
			case 127 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:902: QMark
				{
				mQMark(); 

				}
				break;
			case 128 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:908: Dot
				{
				mDot(); 

				}
				break;
			case 129 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:912: Bool
				{
				mBool(); 

				}
				break;
			case 130 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:917: Number
				{
				mNumber(); 

				}
				break;
			case 131 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:924: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 132 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:935: String
				{
				mString(); 

				}
				break;
			case 133 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:942: Comment
				{
				mComment(); 

				}
				break;
			case 134 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:950: SemiColon
				{
				mSemiColon(); 

				}
				break;
			case 135 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:960: SpaceChars
				{
				mSpaceChars(); 

				}
				break;
			case 136 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PyEsque.g:1:971: NewLine
				{
				mNewLine(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\3\uffff\33\64\1\uffff\1\64\1\176\1\u0080\1\u0082\1\u0084\4\uffff\1\u0086"+
		"\20\uffff\10\64\1\u0097\7\64\1\u00a2\2\64\1\u00a7\7\64\1\u00b0\1\u00b1"+
		"\13\64\1\u00bf\24\64\1\u00d6\5\64\1\u00dc\12\uffff\13\64\1\u00e8\2\64"+
		"\1\u00eb\1\64\1\uffff\4\64\1\u00f1\3\64\1\u00f5\1\64\1\uffff\1\64\1\u00f8"+
		"\2\64\1\uffff\10\64\2\uffff\1\64\1\u010a\1\64\1\u010c\1\u010d\7\64\1\u0120"+
		"\1\uffff\17\64\1\u0131\1\u0132\5\64\1\uffff\5\64\1\uffff\1\64\1\u013f"+
		"\1\64\1\u0141\7\64\1\uffff\1\u0149\1\64\1\uffff\1\u014b\1\u014c\1\u014d"+
		"\1\64\1\u014f\1\uffff\2\64\1\u0152\1\uffff\2\64\1\uffff\1\u0155\1\u0156"+
		"\2\64\1\u0159\11\64\1\u0164\1\u0165\1\64\1\uffff\1\64\2\uffff\4\64\1\u016c"+
		"\1\u016d\13\64\1\u017a\1\uffff\6\64\1\u0182\1\u0183\5\64\1\u0189\1\64"+
		"\1\u018b\2\uffff\1\u0132\2\64\1\u0132\1\64\1\u0132\6\64\1\uffff\1\64\1"+
		"\uffff\5\64\1\u019b\1\64\1\uffff\1\u019d\3\uffff\1\u019e\1\uffff\1\u01a0"+
		"\1\64\1\uffff\1\64\1\u01a4\2\uffff\1\u01a5\1\64\1\uffff\12\64\2\uffff"+
		"\3\64\1\u01b4\2\64\2\uffff\11\64\1\u01c1\2\64\1\uffff\2\64\1\u01c6\1\64"+
		"\1\u01c8\1\u01c9\1\64\2\uffff\3\64\1\u0152\1\64\1\uffff\1\u01cf\1\uffff"+
		"\2\u0132\3\64\1\u0132\1\u01d3\2\64\1\u01d6\1\u01d7\1\u01d8\1\u01d9\1\u01da"+
		"\1\u01db\1\uffff\1\u01dc\2\uffff\1\64\1\uffff\3\64\2\uffff\1\u01e1\1\u01e2"+
		"\7\64\1\u01ea\1\u01eb\1\64\1\u01ed\1\64\1\uffff\11\64\1\u01f8\2\64\1\uffff"+
		"\1\u01fb\1\64\1\u01fd\1\u01fe\1\uffff\1\64\2\uffff\4\64\1\u0205\1\uffff"+
		"\3\u0132\1\uffff\1\u0206\1\u0207\7\uffff\1\u0208\3\64\2\uffff\3\64\1\u020f"+
		"\1\64\1\u0211\1\64\2\uffff\1\64\1\uffff\7\64\1\u021b\2\64\1\uffff\1\u021e"+
		"\1\64\1\uffff\1\64\2\uffff\1\u0221\1\u0222\1\64\1\u0224\2\64\4\uffff\1"+
		"\u0227\1\u0229\1\64\1\u022b\1\64\1\u022d\1\uffff\1\64\1\uffff\1\u022f"+
		"\2\64\1\u0232\4\64\1\u0237\1\uffff\1\64\1\u0239\1\uffff\1\64\1\u023b\2"+
		"\uffff\1\64\1\uffff\1\64\1\u023e\1\uffff\1\64\1\uffff\1\u0240\1\uffff"+
		"\1\u0241\1\uffff\1\u0242\1\uffff\1\u0243\1\64\1\uffff\1\u0245\1\u0246"+
		"\1\64\1\u0248\1\uffff\1\u0249\1\uffff\1\64\1\uffff\1\u024b\1\64\1\uffff"+
		"\1\64\4\uffff\1\64\2\uffff\1\64\2\uffff\1\64\1\uffff\3\64\1\u0254\1\64"+
		"\1\u0256\2\64\1\uffff\1\u0259\1\uffff\1\64\1\u025b\1\uffff\1\64\1\uffff"+
		"\3\64\1\u0260\1\uffff";
	static final String DFA18_eofS =
		"\u0261\uffff";
	static final String DFA18_minS =
		"\1\11\2\uffff\1\154\1\141\1\151\1\154\1\165\1\157\1\141\1\143\1\146\1"+
		"\144\1\141\1\157\1\141\1\156\1\145\2\141\1\151\1\157\1\105\1\114\1\122"+
		"\1\111\1\105\1\122\1\110\1\105\1\uffff\1\162\4\75\4\uffff\1\52\20\uffff"+
		"\1\154\1\160\1\143\1\144\1\164\1\156\1\162\1\160\1\60\1\151\1\141\3\151"+
		"\1\156\1\155\1\60\1\151\1\156\1\60\1\141\1\162\1\157\1\151\1\164\1\151"+
		"\1\160\2\60\1\141\1\144\1\163\1\143\1\144\1\165\1\157\1\164\1\106\1\154"+
		"\1\160\1\60\1\166\2\162\1\151\1\141\1\144\1\154\1\141\1\154\1\156\1\154"+
		"\1\151\1\166\1\151\1\146\1\162\1\104\1\101\1\105\1\122\1\60\1\114\1\101"+
		"\1\111\1\104\1\111\1\60\12\uffff\1\151\1\145\1\141\1\164\1\157\1\165\1"+
		"\145\1\144\1\151\1\156\1\141\1\60\1\145\1\166\1\60\1\171\1\uffff\1\160"+
		"\1\144\1\156\1\171\1\60\1\156\1\141\1\145\1\60\1\160\1\uffff\1\162\1\60"+
		"\1\145\1\164\1\uffff\1\154\1\157\1\167\1\144\1\103\1\162\1\157\1\150\2"+
		"\uffff\1\156\1\60\1\145\2\60\1\163\1\165\1\101\1\163\1\151\1\164\1\154"+
		"\1\60\1\uffff\1\145\1\147\1\162\1\157\1\144\1\145\1\154\1\164\1\154\1"+
		"\143\1\163\1\147\1\145\1\154\1\146\2\60\1\105\1\103\1\105\1\120\1\113"+
		"\1\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\60\1\156\1\60\1\166\1"+
		"\162\1\141\1\157\1\141\1\144\1\164\1\uffff\1\60\1\145\1\uffff\3\60\1\164"+
		"\1\60\1\uffff\1\164\1\156\1\60\1\uffff\1\154\1\164\1\uffff\2\60\1\145"+
		"\1\153\1\60\1\145\1\151\1\106\1\145\1\157\1\141\1\106\1\141\1\162\2\60"+
		"\1\145\1\uffff\1\162\2\uffff\1\163\1\160\1\151\1\145\2\60\1\162\1\141"+
		"\1\156\1\151\1\164\1\156\1\151\1\156\1\145\1\154\1\162\1\60\1\uffff\1"+
		"\102\1\145\1\157\1\163\1\156\1\151\2\60\1\164\1\157\1\164\1\145\1\150"+
		"\1\60\1\145\1\60\2\uffff\1\60\1\113\1\116\1\60\1\114\1\60\1\117\1\107"+
		"\1\105\2\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\154"+
		"\1\60\1\145\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\147\1\uffff\1\141"+
		"\1\60\2\uffff\1\60\1\145\1\uffff\1\162\1\144\1\151\1\157\1\141\1\162\1"+
		"\155\1\157\1\154\1\164\2\uffff\1\163\1\164\1\151\1\60\1\144\1\151\2\uffff"+
		"\1\151\1\164\1\144\1\147\1\154\1\141\1\144\1\163\1\164\1\60\1\154\1\157"+
		"\1\uffff\1\157\1\171\1\60\1\162\2\60\1\156\2\uffff\1\145\1\167\1\151\1"+
		"\60\1\164\1\uffff\1\60\1\uffff\2\60\1\105\1\127\1\105\2\60\1\124\1\145"+
		"\6\60\1\uffff\1\60\2\uffff\1\156\1\uffff\1\154\1\164\1\141\2\uffff\2\60"+
		"\1\164\1\147\1\154\1\155\1\156\1\145\1\154\2\60\1\151\1\60\1\141\1\uffff"+
		"\1\164\2\147\1\141\1\151\2\154\1\157\1\162\1\60\1\164\1\145\1\uffff\1"+
		"\60\1\153\2\60\1\uffff\1\130\2\uffff\1\147\1\156\1\103\1\157\1\60\1\uffff"+
		"\3\60\1\uffff\2\60\7\uffff\1\60\2\145\1\143\2\uffff\2\150\1\144\1\60\1"+
		"\145\1\60\1\144\2\uffff\1\147\1\uffff\1\156\2\150\1\151\1\164\1\165\1"+
		"\145\1\60\1\153\1\164\1\uffff\1\60\1\162\1\uffff\1\145\2\uffff\2\60\1"+
		"\102\1\60\1\165\1\156\4\uffff\2\60\1\153\1\60\1\164\1\60\1\uffff\1\162"+
		"\1\uffff\1\60\1\156\1\116\1\60\1\164\1\156\1\151\1\163\1\60\1\uffff\1"+
		"\145\1\60\1\uffff\1\163\1\60\2\uffff\1\171\1\uffff\1\162\1\60\1\uffff"+
		"\1\157\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\157\1\uffff"+
		"\2\60\1\157\1\60\1\uffff\1\60\1\uffff\1\145\1\uffff\1\60\1\166\1\uffff"+
		"\1\154\4\uffff\1\151\2\uffff\1\156\2\uffff\1\143\1\uffff\1\145\1\154\1"+
		"\163\1\60\1\164\1\60\2\145\1\uffff\1\60\1\uffff\1\143\1\60\1\uffff\1\164"+
		"\1\uffff\1\151\1\157\1\156\1\60\1\uffff";
	static final String DFA18_maxS =
		"\1\175\2\uffff\1\170\1\157\1\151\2\165\2\162\1\164\1\156\1\164\1\162\1"+
		"\165\1\157\1\156\1\151\1\165\1\150\1\151\1\157\1\105\1\114\1\122\1\125"+
		"\1\105\1\122\1\111\1\105\1\uffff\1\162\4\75\4\uffff\1\57\20\uffff\1\163"+
		"\1\160\1\164\1\156\1\167\1\156\1\162\1\163\1\172\1\151\1\141\1\167\1\151"+
		"\1\165\1\156\1\155\1\172\1\151\2\172\1\141\1\162\1\157\1\151\1\164\1\151"+
		"\1\160\2\172\1\141\1\144\1\163\1\143\1\144\1\165\1\157\1\164\1\151\1\154"+
		"\1\160\1\172\1\166\2\162\1\151\1\141\1\144\1\154\1\141\1\154\1\156\1\154"+
		"\1\151\1\166\1\151\1\146\1\162\1\104\1\125\1\105\1\122\1\172\1\114\1\101"+
		"\1\111\1\104\1\111\1\172\12\uffff\1\151\1\145\1\141\1\164\1\157\1\165"+
		"\1\145\1\144\1\151\1\156\1\141\1\172\1\145\1\166\1\172\1\171\1\uffff\1"+
		"\160\1\144\1\156\1\171\1\172\1\156\1\141\1\145\1\172\1\160\1\uffff\1\162"+
		"\1\172\1\145\1\164\1\uffff\1\154\1\157\1\167\1\144\1\127\1\162\1\157\1"+
		"\150\2\uffff\1\156\1\172\1\145\2\172\1\163\1\165\1\131\1\163\1\151\1\164"+
		"\1\154\1\172\1\uffff\1\145\1\147\1\162\1\164\1\144\1\145\1\154\1\164\1"+
		"\154\1\143\1\163\1\147\1\145\1\154\1\146\2\172\1\105\1\103\1\131\1\120"+
		"\1\113\1\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\172\1\156\1\172"+
		"\1\166\1\162\1\141\1\157\1\141\1\144\1\164\1\uffff\1\172\1\145\1\uffff"+
		"\3\172\1\164\1\172\1\uffff\1\164\1\156\1\172\1\uffff\1\154\1\164\1\uffff"+
		"\2\172\1\145\1\153\1\172\1\145\1\151\2\145\1\157\1\141\1\106\1\141\1\162"+
		"\2\172\1\145\1\uffff\1\162\2\uffff\1\163\1\160\1\151\1\145\2\172\1\162"+
		"\1\157\1\156\1\151\1\164\1\156\1\151\1\156\1\145\1\154\1\162\1\172\1\uffff"+
		"\1\124\1\145\1\157\1\163\1\156\1\151\2\172\1\164\1\157\1\164\1\145\1\150"+
		"\1\172\1\145\1\172\2\uffff\1\172\1\113\1\116\1\172\1\114\1\172\1\117\1"+
		"\107\1\105\2\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1"+
		"\154\1\172\1\145\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\147\1\uffff"+
		"\1\141\1\172\2\uffff\1\172\1\145\1\uffff\1\162\1\144\1\151\1\157\1\141"+
		"\1\162\1\155\1\157\1\154\1\164\2\uffff\1\163\1\164\1\151\1\172\1\144\1"+
		"\151\2\uffff\1\151\1\164\1\144\1\147\1\154\1\162\1\144\1\163\1\164\1\172"+
		"\1\154\1\157\1\uffff\1\157\1\171\1\172\1\162\2\172\1\156\2\uffff\1\145"+
		"\1\167\1\151\1\172\1\164\1\uffff\1\172\1\uffff\2\172\1\105\1\127\1\105"+
		"\2\172\1\124\1\145\6\172\1\uffff\1\172\2\uffff\1\156\1\uffff\1\154\1\164"+
		"\1\141\2\uffff\2\172\1\164\1\147\1\154\1\155\1\156\1\145\1\154\2\172\1"+
		"\151\1\172\1\141\1\uffff\1\164\2\147\1\141\1\151\2\154\1\157\1\162\1\172"+
		"\1\164\1\145\1\uffff\1\172\1\153\2\172\1\uffff\1\131\2\uffff\1\147\1\156"+
		"\1\103\1\157\1\172\1\uffff\3\172\1\uffff\2\172\7\uffff\1\172\2\145\1\143"+
		"\2\uffff\2\150\1\144\1\172\1\145\1\172\1\144\2\uffff\1\147\1\uffff\1\156"+
		"\2\150\1\151\1\164\1\165\1\145\1\172\1\153\1\164\1\uffff\1\172\1\162\1"+
		"\uffff\1\145\2\uffff\2\172\1\102\1\172\1\165\1\156\4\uffff\2\172\1\153"+
		"\1\172\1\164\1\172\1\uffff\1\162\1\uffff\1\172\1\156\1\116\1\172\1\164"+
		"\1\156\1\151\1\163\1\172\1\uffff\1\145\1\172\1\uffff\1\163\1\172\2\uffff"+
		"\1\171\1\uffff\1\162\1\172\1\uffff\1\157\1\uffff\1\172\1\uffff\1\172\1"+
		"\uffff\1\172\1\uffff\1\172\1\157\1\uffff\2\172\1\157\1\172\1\uffff\1\172"+
		"\1\uffff\1\145\1\uffff\1\172\1\166\1\uffff\1\154\4\uffff\1\151\2\uffff"+
		"\1\156\2\uffff\1\143\1\uffff\1\145\1\154\1\163\1\172\1\164\1\172\2\145"+
		"\1\uffff\1\172\1\uffff\1\143\1\172\1\uffff\1\164\1\uffff\1\151\1\157\1"+
		"\156\1\172\1\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\33\uffff\1\145\5\uffff\1\156\1\162\1\163\1\164\1\uffff"+
		"\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\176\1\177\1\u0080\1\u0082"+
		"\1\u0083\1\u0084\1\u0086\1\u0087\1\u0088\104\uffff\1\152\1\175\1\153\1"+
		"\157\1\154\1\160\1\155\1\161\1\u0085\1\165\20\uffff\1\34\12\uffff\1\144"+
		"\4\uffff\1\24\10\uffff\1\146\1\133\15\uffff\1\33\26\uffff\1\123\5\uffff"+
		"\1\150\13\uffff\1\141\2\uffff\1\16\5\uffff\1\23\3\uffff\1\20\2\uffff\1"+
		"\17\21\uffff\1\124\1\uffff\1\142\1\151\22\uffff\1\31\20\uffff\1\63\1\120"+
		"\14\uffff\1\134\1\uffff\1\4\7\uffff\1\5\1\uffff\1\41\1\62\1\7\1\uffff"+
		"\1\12\2\uffff\1\u0081\2\uffff\1\131\1\22\2\uffff\1\52\12\uffff\1\32\1"+
		"\21\6\uffff\1\104\1\105\14\uffff\1\147\7\uffff\1\51\1\44\5\uffff\1\65"+
		"\1\uffff\1\61\17\uffff\1\26\1\uffff\1\6\1\10\1\uffff\1\127\3\uffff\1\13"+
		"\1\43\16\uffff\1\53\14\uffff\1\30\4\uffff\1\55\1\uffff\1\35\1\60\5\uffff"+
		"\1\143\3\uffff\1\121\2\uffff\1\54\1\125\1\135\1\136\1\25\1\137\1\42\4"+
		"\uffff\1\45\1\67\7\uffff\1\140\1\15\1\uffff\1\130\12\uffff\1\115\2\uffff"+
		"\1\46\1\uffff\1\36\1\37\6\uffff\1\50\1\122\1\3\1\126\6\uffff\1\73\1\uffff"+
		"\1\75\11\uffff\1\112\2\uffff\1\116\2\uffff\1\56\1\57\1\uffff\1\64\2\uffff"+
		"\1\11\1\uffff\1\70\1\uffff\1\71\1\uffff\1\77\1\uffff\1\76\2\uffff\1\102"+
		"\4\uffff\1\110\1\uffff\1\114\1\uffff\1\47\2\uffff\1\132\1\uffff\1\14\1"+
		"\72\1\74\1\100\1\uffff\1\103\1\106\1\uffff\1\111\1\113\1\uffff\1\40\10"+
		"\uffff\1\107\1\uffff\1\66\2\uffff\1\117\1\uffff\1\27\4\uffff\1\101";
	static final String DFA18_specialS =
		"\u0261\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\67\1\70\2\uffff\1\70\22\uffff\1\67\1\41\1\65\2\uffff\1\51\1\1\1\65"+
			"\1\56\1\57\1\47\1\45\1\60\1\46\1\62\1\50\12\63\1\36\1\66\1\43\1\40\1"+
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
			"\1\115\1\uffff\1\121\2\uffff\1\117\1\113\1\uffff\1\112\1\120\3\uffff"+
			"\1\122\1\114\2\uffff\1\116",
			"\1\125\6\uffff\1\123\1\124",
			"\1\127\11\uffff\1\132\3\uffff\1\131\1\130\1\126",
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
			"\1\u008f\11\uffff\1\u008e",
			"\1\u0091\1\u0090\1\uffff\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0096\2\uffff\1\u0095",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\2\uffff\1\u009b\12\uffff\1\u009c",
			"\1\u009d",
			"\1\u009e\13\uffff\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00a3",
			"\1\u00a4\13\uffff\1\u00a5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a6\10\64",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00af\27\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00bb\14\uffff\1\u00bc\25\uffff\1\u00ba",
			"\1\u00bd",
			"\1\u00be",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
			"\1\u00d0",
			"\1\u00d2\23\uffff\1\u00d1",
			"\1\u00d3",
			"\1\u00d4",
			"\12\64\7\uffff\15\64\1\u00d5\14\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
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
			"\1\u00ea",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ec",
			"",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f6",
			"",
			"\1\u00f7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f9",
			"\1\u00fa",
			"",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u0102\4\uffff\1\u0100\5\uffff\1\u0103\4\uffff\1\u0101\2\uffff\1\u0104"+
			"\1\u00ff",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"",
			"",
			"\1\u0108",
			"\12\64\7\uffff\3\64\1\u0109\26\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u010b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u010e",
			"\1\u010f",
			"\1\u0116\2\uffff\1\u011a\1\u0119\1\u0117\1\uffff\1\u0111\1\u011b\5\uffff"+
			"\1\u0114\2\uffff\1\u0115\1\u0118\3\uffff\1\u0110\1\u0112\1\u0113",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0125\4\uffff\1\u0124",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135\23\uffff\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"",
			"\1\u013e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0140",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u014a",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u014e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0150",
			"\1\u0151",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0153",
			"\1\u0154",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0157",
			"\1\u0158",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u015a",
			"\1\u015b",
			"\1\u015d\36\uffff\1\u015c",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0166",
			"",
			"\1\u0167",
			"",
			"",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u016e",
			"\1\u0170\15\uffff\1\u016f",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u017c\21\uffff\1\u017b",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018c",
			"\1\u018d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"",
			"\1\u0195",
			"",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u019c",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u019f\16\64",
			"\1\u01a1",
			"",
			"\1\u01a2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u01a3\30\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01a6",
			"",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"",
			"",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01b5",
			"\1\u01b6",
			"",
			"",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bd\20\uffff\1\u01bc",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01c2",
			"\1\u01c3",
			"",
			"\1\u01c4",
			"\1\u01c5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01c7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ca",
			"",
			"",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ce",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01d4",
			"\1\u01d5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u01dd",
			"",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ec",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ee",
			"",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01f9",
			"\1\u01fa",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01fc",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u01ff\1\u0200",
			"",
			"",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
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
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"",
			"",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0210",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0212",
			"",
			"",
			"\1\u0213",
			"",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021c",
			"\1\u021d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021f",
			"",
			"\1\u0220",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0223",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0225",
			"\1\u0226",
			"",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\2\64\1\u0228\27\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u022e",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0230",
			"\1\u0231",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0238",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u023a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u023c",
			"",
			"\1\u023d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u023f",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0244",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0247",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u024a",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u024c",
			"",
			"\1\u024d",
			"",
			"",
			"",
			"",
			"\1\u024e",
			"",
			"",
			"\1\u024f",
			"",
			"",
			"\1\u0250",
			"",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0255",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0257",
			"\1\u0258",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u025a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u025c",
			"",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
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
			return "1:1: Tokens : ( T__168 | T__169 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Sqrt | Pow | Sq | Random | Round | Gaussian | Noise | Map | Inch | Mm | Cm | Units | Move | MoveBy | Heading | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Show | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | Flatten | Wave | FollowCurve | Slider | Template | SetWidth | SetHeight | SetSeam | SetCorner | SetName | SetVFold | SetHFold | AddDesign | TemplateCollection | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetAngle | GetRadius | GetFill | GetStroke | GetStart | GetEnd | GetDistance | GetIntersect | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | Repeat | Radial | Spiral | Row | Arc | While | To | Do | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pw | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | SemiColon | SpaceChars | NewLine );";
		}
	}

}
