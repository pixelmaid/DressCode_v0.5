// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-05-13 16:06:30

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoLexer extends Lexer {
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

	int implicitLineJoiningLevel = 0;
	int startPos=-1;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PogoLexer() {} 
	public PogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }

	// $ANTLR start "T__142"
	public final void mT__142() throws RecognitionException {
		try {
			int _type = T__142;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:8: ( '&&' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:10: '&&'
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
	// $ANTLR end "T__142"

	// $ANTLR start "T__143"
	public final void mT__143() throws RecognitionException {
		try {
			int _type = T__143;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:8: ( ';' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__143"

	// $ANTLR start "T__144"
	public final void mT__144() throws RecognitionException {
		try {
			int _type = T__144;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:8: ( '|' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__144"

	// $ANTLR start "T__145"
	public final void mT__145() throws RecognitionException {
		try {
			int _type = T__145;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:8: ( '||' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:10: '||'
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
	// $ANTLR end "T__145"

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:9: ( 'ellipse' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:11: 'ellipse'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:6: ( 'rect' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:8: 'rect'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:6: ( 'line' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:8: 'line'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:7: ( 'curve' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:9: 'curve'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:6: ( 'quad' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:8: 'quad'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:7: ( 'point' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:9: 'point'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:9: ( 'triangle' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:11: 'triangle'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:9: ( 'poly' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:11: 'poly'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:7: ( 'skirt' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:9: 'skirt'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:11: ( 'skirtback' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:13: 'skirtback'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:8: ( 'import' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:10: 'import'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:8: ( 'cos' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:9: 'cos'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:6: ( 'sin' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:8: 'sin'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:6: ( 'tan' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:8: 'tan'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:6: ( 'atan' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:8: 'atan'
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

	// $ANTLR start "Random"
	public final void mRandom() throws RecognitionException {
		try {
			int _type = Random;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:9: ( 'random' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:11: 'random'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:7: ( 'round' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:9: 'round'
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

	// $ANTLR start "Map"
	public final void mMap() throws RecognitionException {
		try {
			int _type = Map;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:6: ( 'map' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:8: 'map'
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

	// $ANTLR start "Move"
	public final void mMove() throws RecognitionException {
		try {
			int _type = Move;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:6: ( 'move' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:8: 'move'
			{
			match("move"); 

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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:8: ( 'moveBy' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:10: 'moveBy'
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

	// $ANTLR start "Copy"
	public final void mCopy() throws RecognitionException {
		try {
			int _type = Copy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:6: ( 'copy' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:8: 'copy'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:8: ( 'rotate' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:10: 'rotate'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:7: ( 'scale' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:9: 'scale'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:6: ( 'fill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:8: 'fill'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:8: ( 'stroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:10: 'stroke'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:8: ( 'noFill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:10: 'noFill'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:10: ( 'noStroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:12: 'noStroke'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:8: ( 'weight' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:10: 'weight'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:6: ( 'hide' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:8: 'hide'
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

	// $ANTLR start "Group"
	public final void mGroup() throws RecognitionException {
		try {
			int _type = Group;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:7: ( 'group' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:9: 'group'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:9: ( 'expand' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:11: 'expand'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:7: ( 'merge' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:9: 'merge'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:9: ( 'mirrorX' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:11: 'mirrorX'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:8: ( 'mirrorY' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:10: 'mirrorY'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:6: ( 'union' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:8: 'union'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:11: ( 'diff' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:13: 'diff'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:6: ( 'clip' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:8: 'clip'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:5: ( 'xor' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:6: 'xor'
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

	// $ANTLR start "GetWidth"
	public final void mGetWidth() throws RecognitionException {
		try {
			int _type = GetWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:9: ( 'getWidth' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:11: 'getWidth'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:10: ( 'getHeight' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:12: 'getHeight'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:5: ( 'getX' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:7: 'getX'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:5: ( 'getY' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:7: 'getY'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:10: ( 'getOrigin' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:12: 'getOrigin'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:12: ( 'getRotation' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:14: 'getRotation'
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

	// $ANTLR start "GetFill"
	public final void mGetFill() throws RecognitionException {
		try {
			int _type = GetFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:8: ( 'getFill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:10: 'getFill'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:10: ( 'getStroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:12: 'getStroke'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:9: ( 'getStart' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:11: 'getStart'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:7: ( 'getEnd' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:9: 'getEnd'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:12: ( 'dist' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:14: 'dist'
			{
			match("dist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetDistance"

	// $ANTLR start "DotX"
	public final void mDotX() throws RecognitionException {
		try {
			int _type = DotX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:6: ( '.x' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:8: '.x'
			{
			match(".x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotX"

	// $ANTLR start "DotY"
	public final void mDotY() throws RecognitionException {
		try {
			int _type = DotY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:7: ( '.y' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:9: '.y'
			{
			match(".y"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotY"

	// $ANTLR start "DotStart"
	public final void mDotStart() throws RecognitionException {
		try {
			int _type = DotStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:10: ( '.start' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:12: '.start'
			{
			match(".start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStart"

	// $ANTLR start "DotEnd"
	public final void mDotEnd() throws RecognitionException {
		try {
			int _type = DotEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:8: ( '.end' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:10: '.end'
			{
			match(".end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotEnd"

	// $ANTLR start "DotOrigin"
	public final void mDotOrigin() throws RecognitionException {
		try {
			int _type = DotOrigin;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:402:11: ( '.origin' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:402:13: '.origin'
			{
			match(".origin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotOrigin"

	// $ANTLR start "DotRotation"
	public final void mDotRotation() throws RecognitionException {
		try {
			int _type = DotRotation;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:13: ( '.rotation' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:15: '.rotation'
			{
			match(".rotation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotRotation"

	// $ANTLR start "DotWidth"
	public final void mDotWidth() throws RecognitionException {
		try {
			int _type = DotWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:10: ( '.width' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:12: '.width'
			{
			match(".width"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWidth"

	// $ANTLR start "DotHeight"
	public final void mDotHeight() throws RecognitionException {
		try {
			int _type = DotHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:405:11: ( '.height' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:405:13: '.height'
			{
			match(".height"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotHeight"

	// $ANTLR start "DotStroke"
	public final void mDotStroke() throws RecognitionException {
		try {
			int _type = DotStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:11: ( '.stroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:13: '.stroke'
			{
			match(".stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStroke"

	// $ANTLR start "DotFill"
	public final void mDotFill() throws RecognitionException {
		try {
			int _type = DotFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:9: ( '.fill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:11: '.fill'
			{
			match(".fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotFill"

	// $ANTLR start "DotWeight"
	public final void mDotWeight() throws RecognitionException {
		try {
			int _type = DotWeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:408:11: ( '.weight' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:408:13: '.weight'
			{
			match(".weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWeight"

	// $ANTLR start "COLOR_CONSTANT"
	public final void mCOLOR_CONSTANT() throws RecognitionException {
		try {
			int _type = COLOR_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:17: 'RED'
					{
					match("RED"); 

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:23: 'BLUE'
					{
					match("BLUE"); 

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:30: 'GREEN'
					{
					match("GREEN"); 

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:38: 'PURPLE'
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:47: 'YELLOW'
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:56: 'ORANGE'
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:65: 'PINK'
					{
					match("PINK"); 

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:72: 'BLACK'
					{
					match("BLACK"); 

					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:80: 'WHITE'
					{
					match("WHITE"); 

					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:88: 'GREY'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:15: ( 'WIDTH' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:17: 'WIDTH'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:16: ( 'HEIGHT' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:18: 'HEIGHT'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:12: ( 'PI' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:14: 'PI'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:6: ( 'add' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:8: 'add'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:9: ( 'remove' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:11: 'remove'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:10: ( 'println' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:12: 'println'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:10: ( 'print' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:12: 'print'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:10: ( 'assert' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:12: 'assert'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:10: ( 'size' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:12: 'size'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:10: ( 'def' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:12: 'def'
			{
			match("def"); 

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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:10: ( 'if' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:12: 'if'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:10: ( 'else' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:12: 'else'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:10: ( 'return' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:12: 'return'
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

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:10: ( 'for' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:12: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "For"

	// $ANTLR start "Repeat"
	public final void mRepeat() throws RecognitionException {
		try {
			int _type = Repeat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:9: ( 'repeat' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:11: 'repeat'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:10: ( 'while' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:12: 'while'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:10: ( 'to' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:12: 'to'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:10: ( ':' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:12: ':'
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

	// $ANTLR start "End"
	public final void mEnd() throws RecognitionException {
		try {
			int _type = End;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:6: ( 'end' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "End"

	// $ANTLR start "In"
	public final void mIn() throws RecognitionException {
		try {
			int _type = In;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:10: ( 'in' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:12: 'in'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:10: ( 'null' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:12: 'null'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:10: ( 'or' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:12: 'or'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:10: ( 'and' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:12: 'and'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:10: ( '==' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:12: '=='
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:10: ( '!=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:12: '!='
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:10: ( '>=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:12: '>='
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:10: ( '<=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:12: '<='
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

	// $ANTLR start "Pow"
	public final void mPow() throws RecognitionException {
		try {
			int _type = Pow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:10: ( '^' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:12: '^'
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
	// $ANTLR end "Pow"

	// $ANTLR start "Excl"
	public final void mExcl() throws RecognitionException {
		try {
			int _type = Excl;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:10: ( '!' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:12: '!'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:447:10: ( '>' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:447:12: '>'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:10: ( '<' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:12: '<'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:10: ( '+' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:12: '+'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:10: ( '-' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:12: '-'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:451:10: ( '*' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:451:12: '*'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:10: ( '/' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:12: '/'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:453:10: ( '%' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:453:12: '%'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:454:10: ( '{' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:454:12: '{'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:10: ( '}' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:12: '}'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:10: ( '[' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:12: '['
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:457:10: ( ']' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:457:12: ']'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:458:10: ( '(' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:458:12: '('
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:459:10: ( ')' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:459:12: ')'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:461:10: ( '=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:461:12: '='
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:462:10: ( ',' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:462:12: ','
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:463:10: ( '?' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:463:12: '?'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:465:5: ( '.' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:465:7: '.'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:3: ( 'true' | 'false' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:6: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:469:6: 'false'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:3: ( Int ( Dot ( Digit )* )? )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:10: ( Dot ( Digit )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:15: ( Digit )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:12: ~ ( '\"' | '\\\\' )
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:29: '\\\\' ( '\\\\' | '\"' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:12: ~ ( '\\'' | '\\\\' )
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:29: '\\\\' ( '\\\\' | '\\'' )
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:11: (~ ( '\\n' | '\\r' ) )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:490:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:490:11: ( . )*
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
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:490:11: .
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

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:494:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:494:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:494:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:541:3: ( '1' .. '9' ( Digit )* | '0' )
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:541:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:541:15: ( Digit )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:542:6: '0'
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
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:546:3: ( '0' .. '9' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:8: ( T__142 | T__143 | T__144 | T__145 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space )
		int alt15=117;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:10: T__142
				{
				mT__142(); 

				}
				break;
			case 2 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:17: T__143
				{
				mT__143(); 

				}
				break;
			case 3 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:24: T__144
				{
				mT__144(); 

				}
				break;
			case 4 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:31: T__145
				{
				mT__145(); 

				}
				break;
			case 5 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:38: Ellipse
				{
				mEllipse(); 

				}
				break;
			case 6 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:46: Rect
				{
				mRect(); 

				}
				break;
			case 7 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:51: Line
				{
				mLine(); 

				}
				break;
			case 8 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:56: Curve
				{
				mCurve(); 

				}
				break;
			case 9 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:62: Quad
				{
				mQuad(); 

				}
				break;
			case 10 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:67: Point
				{
				mPoint(); 

				}
				break;
			case 11 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:73: Triangle
				{
				mTriangle(); 

				}
				break;
			case 12 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:82: Polygon
				{
				mPolygon(); 

				}
				break;
			case 13 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:90: Skirt
				{
				mSkirt(); 

				}
				break;
			case 14 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:96: SkirtBack
				{
				mSkirtBack(); 

				}
				break;
			case 15 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:106: LShape
				{
				mLShape(); 

				}
				break;
			case 16 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:113: Cosine
				{
				mCosine(); 

				}
				break;
			case 17 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:120: Sine
				{
				mSine(); 

				}
				break;
			case 18 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:125: Tan
				{
				mTan(); 

				}
				break;
			case 19 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:129: ATan
				{
				mATan(); 

				}
				break;
			case 20 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:134: Random
				{
				mRandom(); 

				}
				break;
			case 21 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:141: Round
				{
				mRound(); 

				}
				break;
			case 22 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:147: Map
				{
				mMap(); 

				}
				break;
			case 23 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:151: Move
				{
				mMove(); 

				}
				break;
			case 24 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:156: MoveBy
				{
				mMoveBy(); 

				}
				break;
			case 25 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:163: Copy
				{
				mCopy(); 

				}
				break;
			case 26 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:168: Rotate
				{
				mRotate(); 

				}
				break;
			case 27 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:175: Scale
				{
				mScale(); 

				}
				break;
			case 28 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:181: Fill
				{
				mFill(); 

				}
				break;
			case 29 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:186: Stroke
				{
				mStroke(); 

				}
				break;
			case 30 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:193: NoFill
				{
				mNoFill(); 

				}
				break;
			case 31 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:200: NoStroke
				{
				mNoStroke(); 

				}
				break;
			case 32 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:209: Weight
				{
				mWeight(); 

				}
				break;
			case 33 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:216: Hide
				{
				mHide(); 

				}
				break;
			case 34 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:221: Group
				{
				mGroup(); 

				}
				break;
			case 35 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:227: Expand
				{
				mExpand(); 

				}
				break;
			case 36 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:234: Merge
				{
				mMerge(); 

				}
				break;
			case 37 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:240: MirrorX
				{
				mMirrorX(); 

				}
				break;
			case 38 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:248: MirrorY
				{
				mMirrorY(); 

				}
				break;
			case 39 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:256: Union
				{
				mUnion(); 

				}
				break;
			case 40 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:262: Difference
				{
				mDifference(); 

				}
				break;
			case 41 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:273: Clip
				{
				mClip(); 

				}
				break;
			case 42 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:278: Xor
				{
				mXor(); 

				}
				break;
			case 43 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:282: GetWidth
				{
				mGetWidth(); 

				}
				break;
			case 44 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:291: GetHeight
				{
				mGetHeight(); 

				}
				break;
			case 45 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:301: GetX
				{
				mGetX(); 

				}
				break;
			case 46 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:306: GetY
				{
				mGetY(); 

				}
				break;
			case 47 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:311: GetOrigin
				{
				mGetOrigin(); 

				}
				break;
			case 48 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:321: GetRotation
				{
				mGetRotation(); 

				}
				break;
			case 49 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:333: GetFill
				{
				mGetFill(); 

				}
				break;
			case 50 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:341: GetStroke
				{
				mGetStroke(); 

				}
				break;
			case 51 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:351: GetStart
				{
				mGetStart(); 

				}
				break;
			case 52 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:360: GetEnd
				{
				mGetEnd(); 

				}
				break;
			case 53 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:367: GetDistance
				{
				mGetDistance(); 

				}
				break;
			case 54 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:379: DotX
				{
				mDotX(); 

				}
				break;
			case 55 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:384: DotY
				{
				mDotY(); 

				}
				break;
			case 56 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:389: DotStart
				{
				mDotStart(); 

				}
				break;
			case 57 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:398: DotEnd
				{
				mDotEnd(); 

				}
				break;
			case 58 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:405: DotOrigin
				{
				mDotOrigin(); 

				}
				break;
			case 59 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:415: DotRotation
				{
				mDotRotation(); 

				}
				break;
			case 60 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:427: DotWidth
				{
				mDotWidth(); 

				}
				break;
			case 61 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:436: DotHeight
				{
				mDotHeight(); 

				}
				break;
			case 62 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:446: DotStroke
				{
				mDotStroke(); 

				}
				break;
			case 63 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:456: DotFill
				{
				mDotFill(); 

				}
				break;
			case 64 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:464: DotWeight
				{
				mDotWeight(); 

				}
				break;
			case 65 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:474: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 

				}
				break;
			case 66 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:489: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 

				}
				break;
			case 67 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:504: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 

				}
				break;
			case 68 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:520: PI_CONSTANT
				{
				mPI_CONSTANT(); 

				}
				break;
			case 69 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:532: LAdd
				{
				mLAdd(); 

				}
				break;
			case 70 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:537: LRemove
				{
				mLRemove(); 

				}
				break;
			case 71 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:545: Println
				{
				mPrintln(); 

				}
				break;
			case 72 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:553: Print
				{
				mPrint(); 

				}
				break;
			case 73 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:559: Assert
				{
				mAssert(); 

				}
				break;
			case 74 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:566: Size
				{
				mSize(); 

				}
				break;
			case 75 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:571: Def
				{
				mDef(); 

				}
				break;
			case 76 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:575: If
				{
				mIf(); 

				}
				break;
			case 77 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:578: Else
				{
				mElse(); 

				}
				break;
			case 78 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:583: Return
				{
				mReturn(); 

				}
				break;
			case 79 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:590: For
				{
				mFor(); 

				}
				break;
			case 80 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:594: Repeat
				{
				mRepeat(); 

				}
				break;
			case 81 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:601: While
				{
				mWhile(); 

				}
				break;
			case 82 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:607: To
				{
				mTo(); 

				}
				break;
			case 83 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:610: Do
				{
				mDo(); 

				}
				break;
			case 84 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:613: End
				{
				mEnd(); 

				}
				break;
			case 85 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:617: In
				{
				mIn(); 

				}
				break;
			case 86 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:620: Null
				{
				mNull(); 

				}
				break;
			case 87 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:625: Or
				{
				mOr(); 

				}
				break;
			case 88 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:628: And
				{
				mAnd(); 

				}
				break;
			case 89 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:632: Equals
				{
				mEquals(); 

				}
				break;
			case 90 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:639: NEquals
				{
				mNEquals(); 

				}
				break;
			case 91 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:647: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 92 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:656: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 93 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:665: Pow
				{
				mPow(); 

				}
				break;
			case 94 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:669: Excl
				{
				mExcl(); 

				}
				break;
			case 95 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:674: GT
				{
				mGT(); 

				}
				break;
			case 96 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:677: LT
				{
				mLT(); 

				}
				break;
			case 97 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:680: Add
				{
				mAdd(); 

				}
				break;
			case 98 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:684: Subtract
				{
				mSubtract(); 

				}
				break;
			case 99 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:693: Multiply
				{
				mMultiply(); 

				}
				break;
			case 100 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:702: Divide
				{
				mDivide(); 

				}
				break;
			case 101 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:709: Modulus
				{
				mModulus(); 

				}
				break;
			case 102 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:717: OBrace
				{
				mOBrace(); 

				}
				break;
			case 103 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:724: CBrace
				{
				mCBrace(); 

				}
				break;
			case 104 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:731: OBracket
				{
				mOBracket(); 

				}
				break;
			case 105 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:740: CBracket
				{
				mCBracket(); 

				}
				break;
			case 106 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:749: OParen
				{
				mOParen(); 

				}
				break;
			case 107 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:756: CParen
				{
				mCParen(); 

				}
				break;
			case 108 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:763: Assign
				{
				mAssign(); 

				}
				break;
			case 109 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:770: Comma
				{
				mComma(); 

				}
				break;
			case 110 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:776: QMark
				{
				mQMark(); 

				}
				break;
			case 111 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:782: Dot
				{
				mDot(); 

				}
				break;
			case 112 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:786: Bool
				{
				mBool(); 

				}
				break;
			case 113 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:791: Number
				{
				mNumber(); 

				}
				break;
			case 114 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:798: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 115 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:809: String
				{
				mString(); 

				}
				break;
			case 116 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:816: Comment
				{
				mComment(); 

				}
				break;
			case 117 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:824: Space
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\3\uffff\1\71\23\65\1\160\10\65\1\uffff\1\65\1\175\1\177\1\u0081\1\u0083"+
		"\4\uffff\1\u0085\17\uffff\17\65\1\u009d\5\65\1\u00a4\1\u00a5\26\65\12"+
		"\uffff\4\65\1\u00c7\5\65\1\u00cd\12\uffff\3\65\1\u00d1\11\65\1\u00db\10"+
		"\65\1\u00e4\1\uffff\1\65\1\u00e6\4\65\2\uffff\1\65\1\u00ec\1\65\1\u00ee"+
		"\1\u00ef\4\65\1\u00f4\14\65\1\u0109\1\u010a\3\uffff\1\u010d\5\65\1\uffff"+
		"\5\65\1\uffff\1\65\1\u011a\1\65\1\uffff\1\u011c\6\65\1\u0123\1\65\1\uffff"+
		"\1\u0125\1\u0126\1\u0127\1\65\1\u0129\2\65\1\u012c\1\uffff\1\65\1\uffff"+
		"\1\u012e\3\65\1\u0132\1\uffff\1\65\2\uffff\1\u0135\2\65\1\u0138\1\uffff"+
		"\3\65\1\u013c\2\65\1\u013f\3\65\1\u0143\1\u0144\6\65\1\u014b\1\u014c\5"+
		"\uffff\1\u010d\2\65\1\u010d\1\65\1\u010d\6\65\1\uffff\1\65\1\uffff\4\65"+
		"\1\u015b\1\65\1\uffff\1\u015d\3\uffff\1\u015e\1\uffff\1\u0160\1\65\1\uffff"+
		"\1\u0163\1\uffff\1\u0164\2\65\1\uffff\2\65\1\uffff\1\u0169\1\65\1\uffff"+
		"\1\u012c\2\65\1\uffff\1\65\1\u016e\1\uffff\1\u016f\2\65\2\uffff\5\65\1"+
		"\u0178\2\uffff\2\u010d\3\65\1\u010d\1\u017c\2\65\1\u017f\1\u0180\1\u0181"+
		"\1\u0182\1\u0183\1\uffff\1\u0184\2\uffff\1\65\1\uffff\2\65\2\uffff\1\u0188"+
		"\1\u0189\1\u018a\1\u018b\1\uffff\1\65\1\u018e\1\65\1\u0190\2\uffff\7\65"+
		"\1\u0198\1\uffff\3\u010d\1\uffff\1\u0199\1\u019a\6\uffff\1\u019b\2\65"+
		"\4\uffff\1\u019e\1\u019f\1\uffff\1\65\1\uffff\4\65\1\u01a5\2\65\4\uffff"+
		"\1\u01a8\1\65\2\uffff\1\u01aa\1\u01ab\3\65\1\uffff\1\65\1\u01b0\1\uffff"+
		"\1\u01b1\2\uffff\1\u01b2\1\u01b3\1\65\1\u01b5\4\uffff\1\65\1\uffff\1\u01b7"+
		"\1\uffff";
	static final String DFA15_eofS =
		"\u01b8\uffff";
	static final String DFA15_minS =
		"\1\11\2\uffff\1\174\1\154\1\141\1\151\1\154\1\165\1\157\1\141\1\143\1"+
		"\146\1\144\2\141\1\157\1\145\1\151\1\145\1\156\1\145\1\157\1\145\1\105"+
		"\1\114\1\122\1\111\1\105\1\122\1\110\1\105\1\uffff\1\162\4\75\4\uffff"+
		"\1\52\17\uffff\1\154\1\160\1\144\1\143\1\156\1\164\1\156\1\162\1\160\1"+
		"\151\1\141\3\151\1\156\1\60\1\151\1\156\1\141\1\162\1\160\2\60\1\141\1"+
		"\144\1\163\1\144\1\160\1\166\2\162\1\154\1\162\1\154\1\106\1\154\2\151"+
		"\1\144\1\157\1\164\1\151\2\146\1\162\2\uffff\1\164\3\uffff\1\145\3\uffff"+
		"\1\104\1\101\1\105\1\122\1\60\1\114\1\101\1\111\1\104\1\111\1\60\12\uffff"+
		"\1\151\1\145\1\141\1\60\1\164\1\157\1\165\1\145\1\144\1\156\1\141\1\145"+
		"\1\166\1\60\1\171\1\160\1\144\1\156\1\171\1\156\1\141\1\145\1\60\1\uffff"+
		"\1\162\1\60\1\145\1\154\2\157\2\uffff\1\156\1\60\1\145\2\60\1\145\1\147"+
		"\1\162\1\154\1\60\1\163\1\151\1\164\1\154\1\147\1\154\1\145\1\165\1\105"+
		"\1\157\1\146\1\164\2\60\1\141\2\uffff\1\60\1\105\1\103\1\105\1\120\1\113"+
		"\1\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\60\1\156\1\uffff\1\60"+
		"\1\166\1\162\1\141\1\157\1\144\1\164\1\60\1\145\1\uffff\3\60\1\164\1\60"+
		"\1\164\1\156\1\60\1\uffff\1\164\1\uffff\1\60\1\145\1\153\1\162\1\60\1"+
		"\uffff\1\162\2\uffff\1\60\1\145\1\157\1\60\1\uffff\1\145\1\154\1\162\1"+
		"\60\1\150\1\145\1\60\1\160\1\151\1\145\2\60\1\162\1\157\1\151\1\164\2"+
		"\156\2\60\5\uffff\1\60\1\113\1\116\1\60\1\114\1\60\1\117\1\107\1\105\2"+
		"\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\60\1\145\1"+
		"\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\147\1\uffff\1\60\1\uffff\1\60"+
		"\1\145\1\164\1\uffff\1\164\1\171\1\uffff\1\60\1\162\1\uffff\1\60\1\154"+
		"\1\157\1\uffff\1\164\1\60\1\uffff\1\60\1\144\1\151\2\uffff\1\151\1\164"+
		"\1\154\1\141\1\144\1\60\2\uffff\2\60\1\105\1\127\1\105\2\60\1\124\1\145"+
		"\5\60\1\uffff\1\60\2\uffff\1\156\1\uffff\1\154\1\141\2\uffff\4\60\1\uffff"+
		"\1\130\1\60\1\153\1\60\2\uffff\1\164\2\147\1\141\1\154\1\157\1\162\1\60"+
		"\1\uffff\3\60\1\uffff\2\60\6\uffff\1\60\1\145\1\143\4\uffff\2\60\1\uffff"+
		"\1\145\1\uffff\2\150\1\151\1\164\1\60\1\153\1\164\4\uffff\1\60\1\153\2"+
		"\uffff\2\60\1\164\1\156\1\151\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff"+
		"\2\60\1\157\1\60\4\uffff\1\156\1\uffff\1\60\1\uffff";
	static final String DFA15_maxS =
		"\1\175\2\uffff\1\174\1\170\1\157\1\151\2\165\2\162\1\164\1\156\1\164\2"+
		"\157\1\165\1\150\1\151\1\162\1\156\1\151\1\157\1\171\1\105\1\114\1\122"+
		"\1\125\1\105\1\122\1\111\1\105\1\uffff\1\162\4\75\4\uffff\1\57\17\uffff"+
		"\1\163\1\160\1\144\1\164\1\156\1\165\1\156\1\162\1\163\1\151\1\141\1\154"+
		"\1\151\1\165\1\156\1\172\1\151\1\172\1\141\1\162\1\160\2\172\1\141\1\144"+
		"\1\163\1\144\1\160\1\166\2\162\1\154\1\162\1\154\1\123\1\154\2\151\1\144"+
		"\1\157\1\164\1\151\1\163\1\146\1\162\2\uffff\1\164\3\uffff\1\151\3\uffff"+
		"\1\104\1\125\1\105\1\122\1\172\1\114\1\101\1\111\1\104\1\111\1\172\12"+
		"\uffff\1\151\1\145\1\141\1\172\1\164\1\157\1\165\1\145\1\144\1\156\1\141"+
		"\1\145\1\166\1\172\1\171\1\160\1\144\1\156\1\171\1\156\1\141\1\145\1\172"+
		"\1\uffff\1\162\1\172\1\145\1\154\2\157\2\uffff\1\156\1\172\1\145\2\172"+
		"\1\145\1\147\1\162\1\154\1\172\1\163\1\151\1\164\1\154\1\147\1\154\1\145"+
		"\1\165\1\131\1\157\1\146\1\164\2\172\1\162\2\uffff\1\172\1\105\1\103\1"+
		"\131\1\120\1\113\1\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\172\1"+
		"\156\1\uffff\1\172\1\166\1\162\1\141\1\157\1\144\1\164\1\172\1\145\1\uffff"+
		"\3\172\1\164\1\172\1\164\1\156\1\172\1\uffff\1\164\1\uffff\1\172\1\145"+
		"\1\153\1\162\1\172\1\uffff\1\162\2\uffff\1\172\1\145\1\157\1\172\1\uffff"+
		"\1\145\1\154\1\162\1\172\1\150\1\145\1\172\1\160\1\151\1\145\2\172\1\162"+
		"\1\157\1\151\1\164\2\156\2\172\5\uffff\1\172\1\113\1\116\1\172\1\114\1"+
		"\172\1\117\1\107\1\105\2\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1"+
		"\164\1\155\1\172\1\145\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\147"+
		"\1\uffff\1\172\1\uffff\1\172\1\145\1\164\1\uffff\1\164\1\171\1\uffff\1"+
		"\172\1\162\1\uffff\1\172\1\154\1\157\1\uffff\1\164\1\172\1\uffff\1\172"+
		"\1\144\1\151\2\uffff\1\151\1\164\1\154\1\162\1\144\1\172\2\uffff\2\172"+
		"\1\105\1\127\1\105\2\172\1\124\1\145\5\172\1\uffff\1\172\2\uffff\1\156"+
		"\1\uffff\1\154\1\141\2\uffff\4\172\1\uffff\1\131\1\172\1\153\1\172\2\uffff"+
		"\1\164\2\147\1\141\1\154\1\157\1\162\1\172\1\uffff\3\172\1\uffff\2\172"+
		"\6\uffff\1\172\1\145\1\143\4\uffff\2\172\1\uffff\1\145\1\uffff\2\150\1"+
		"\151\1\164\1\172\1\153\1\164\4\uffff\1\172\1\153\2\uffff\2\172\1\164\1"+
		"\156\1\151\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff\2\172\1\157\1\172"+
		"\4\uffff\1\156\1\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\35\uffff\1\123\5\uffff\1\135\1\141\1\142\1\143\1\uffff"+
		"\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\155\1\156\1\161\1\162\1\163"+
		"\1\165\1\4\1\3\55\uffff\1\66\1\67\1\uffff\1\71\1\72\1\73\1\uffff\1\75"+
		"\1\77\1\157\13\uffff\1\131\1\154\1\132\1\136\1\133\1\137\1\134\1\140\1"+
		"\164\1\144\27\uffff\1\122\6\uffff\1\114\1\125\31\uffff\1\74\1\100\6\uffff"+
		"\1\104\5\uffff\1\127\3\uffff\1\124\11\uffff\1\20\10\uffff\1\22\1\uffff"+
		"\1\21\5\uffff\1\105\1\uffff\1\130\1\26\4\uffff\1\117\24\uffff\1\113\1"+
		"\52\1\70\1\76\1\101\14\uffff\1\115\1\uffff\1\6\6\uffff\1\7\1\uffff\1\31"+
		"\1\51\1\11\1\uffff\1\14\2\uffff\1\160\1\uffff\1\112\3\uffff\1\23\2\uffff"+
		"\1\27\2\uffff\1\34\3\uffff\1\126\2\uffff\1\41\3\uffff\1\55\1\56\6\uffff"+
		"\1\50\1\65\16\uffff\1\25\1\uffff\1\10\1\12\1\uffff\1\110\2\uffff\1\15"+
		"\1\33\4\uffff\1\44\4\uffff\1\121\1\42\10\uffff\1\47\3\uffff\1\102\2\uffff"+
		"\1\43\1\106\1\116\1\120\1\24\1\32\3\uffff\1\35\1\17\1\111\1\30\2\uffff"+
		"\1\36\1\uffff\1\40\7\uffff\1\64\1\103\1\5\1\107\2\uffff\1\45\1\46\5\uffff"+
		"\1\61\2\uffff\1\13\1\uffff\1\37\1\53\4\uffff\1\63\1\16\1\54\1\57\1\uffff"+
		"\1\62\1\uffff\1\60";
	static final String DFA15_specialS =
		"\u01b8\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\67\1\uffff\2\67\22\uffff\1\67\1\43\1\66\2\uffff\1\53\1\1\1\66\1\60"+
			"\1\61\1\51\1\47\1\62\1\50\1\27\1\52\12\64\1\40\1\2\1\45\1\42\1\44\1\63"+
			"\1\uffff\1\65\1\31\4\65\1\32\1\37\6\65\1\35\1\33\1\65\1\30\4\65\1\36"+
			"\1\65\1\34\1\65\1\56\1\uffff\1\57\1\46\1\65\1\uffff\1\15\1\65\1\7\1\25"+
			"\1\4\1\17\1\23\1\22\1\14\2\65\1\6\1\16\1\20\1\41\1\11\1\10\1\5\1\13\1"+
			"\12\1\24\1\65\1\21\1\26\2\65\1\54\1\3\1\55",
			"",
			"",
			"\1\70",
			"\1\72\1\uffff\1\74\11\uffff\1\73",
			"\1\76\3\uffff\1\75\11\uffff\1\77",
			"\1\100",
			"\1\103\2\uffff\1\102\5\uffff\1\101",
			"\1\104",
			"\1\105\2\uffff\1\106",
			"\1\110\15\uffff\1\111\2\uffff\1\107",
			"\1\114\5\uffff\1\113\1\uffff\1\112\10\uffff\1\115",
			"\1\117\6\uffff\1\116\1\120",
			"\1\122\11\uffff\1\124\4\uffff\1\123\1\121",
			"\1\125\3\uffff\1\127\3\uffff\1\130\5\uffff\1\126",
			"\1\133\7\uffff\1\131\5\uffff\1\132",
			"\1\134\5\uffff\1\135",
			"\1\136\2\uffff\1\137",
			"\1\140",
			"\1\142\14\uffff\1\141",
			"\1\143",
			"\1\145\3\uffff\1\144",
			"\1\146",
			"\1\152\1\157\1\uffff\1\156\6\uffff\1\153\2\uffff\1\154\1\151\3\uffff"+
			"\1\155\1\147\1\150",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\165\13\uffff\1\164",
			"\1\166",
			"\1\167",
			"\1\170\1\171",
			"\1\172",
			"",
			"\1\173",
			"\1\174",
			"\1\176",
			"\1\u0080",
			"\1\u0082",
			"",
			"",
			"",
			"",
			"\1\u0084\4\uffff\1\u0084",
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
			"\1\u0086\6\uffff\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a\11\uffff\1\u008b\2\uffff\1\u008d\3\uffff\1\u008c",
			"\1\u008e",
			"\1\u0090\1\u008f",
			"\1\u0091",
			"\1\u0092",
			"\1\u0094\2\uffff\1\u0093",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097\2\uffff\1\u0098",
			"\1\u0099",
			"\1\u009a\13\uffff\1\u009b",
			"\1\u009c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u009e",
			"\1\u009f\13\uffff\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1\14\uffff\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba\14\uffff\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"",
			"",
			"\1\u00be",
			"",
			"",
			"",
			"\1\u00c0\3\uffff\1\u00bf",
			"",
			"",
			"",
			"\1\u00c1",
			"\1\u00c3\23\uffff\1\u00c2",
			"\1\u00c4",
			"\1\u00c5",
			"\12\65\7\uffff\15\65\1\u00c6\14\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
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
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u00e5",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"",
			"",
			"\1\u00eb",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ed",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u0105\1\u0103\1\uffff\1\u00fe\6\uffff\1\u0101\2\uffff\1\u0102\1\u0104"+
			"\3\uffff\1\u00fd\1\u00ff\1\u0100",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u010b\20\uffff\1\u010c",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110\23\uffff\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"",
			"\1\u0119",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u011b",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0124",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0128",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u012a",
			"\1\u012b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u012d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0133",
			"",
			"",
			"\12\65\7\uffff\1\65\1\u0134\30\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0136",
			"\1\u0137",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u013d",
			"\1\u013e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014d",
			"\1\u014e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014f",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u015c",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u015f\16\65",
			"\1\u0161",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\65\1\u0162\30\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0165",
			"\1\u0166",
			"",
			"\1\u0167",
			"\1\u0168",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u016a",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u016b",
			"\1\u016c",
			"",
			"\1\u016d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0170",
			"\1\u0171",
			"",
			"",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0176\20\uffff\1\u0175",
			"\1\u0177",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u017d",
			"\1\u017e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0185",
			"",
			"\1\u0186",
			"\1\u0187",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u018c\1\u018d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u018f",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u019c",
			"\1\u019d",
			"",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01a0",
			"",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a6",
			"\1\u01a7",
			"",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a9",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"",
			"\1\u01af",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"\1\u01b6",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__142 | T__143 | T__144 | T__145 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | Skirt | SkirtBack | LShape | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space );";
		}
	}

}
