// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g 2013-01-30 17:12:43

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JogoLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int BOOLEAN=4;
	public static final int CHARLITERAL=5;
	public static final int COMMENT=6;
	public static final int DOUBLELITERAL=7;
	public static final int DoubleSuffix=8;
	public static final int ELSEIF_STATEMENT=9;
	public static final int ELSE_STATEMENT=10;
	public static final int EscapeSequence=11;
	public static final int Exponent=12;
	public static final int FLOATLITERAL=13;
	public static final int FUNC_CALL=14;
	public static final int FUNC_DECL=15;
	public static final int FloatSuffix=16;
	public static final int HexDigit=17;
	public static final int HexPrefix=18;
	public static final int IDENT=19;
	public static final int IF_STATEMENT=20;
	public static final int INTLITERAL=21;
	public static final int IntegerNumber=22;
	public static final int LONGLITERAL=23;
	public static final int LongSuffix=24;
	public static final int MULTILINE_COMMENT=25;
	public static final int NEGATION=26;
	public static final int NonIntegerNumber=27;
	public static final int PARAM=28;
	public static final int POSTDECREMENT=29;
	public static final int POSTINCREMENT=30;
	public static final int PROGRAM=31;
	public static final int STRINGLITERAL=32;
	public static final int VAR_CALL=33;
	public static final int VAR_DECL=34;
	public static final int WS=35;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JogoLexer() {} 
	public JogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g"; }

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:11:7: ( '!=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:11:9: '!='
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:12:7: ( '%' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:12:9: '%'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:13:7: ( '(' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:13:9: '('
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:14:7: ( ')' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:14:9: ')'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:15:7: ( '*' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:15:9: '*'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:16:7: ( '+' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:16:9: '+'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:17:7: ( '++' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:17:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:18:7: ( ',' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:18:9: ','
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:19:7: ( '-' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:19:9: '-'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:20:7: ( '--' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:20:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:21:7: ( '/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:21:9: '/'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:22:7: ( ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:22:9: ';'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:23:7: ( '<' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:23:9: '<'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:24:7: ( '<=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:24:9: '<='
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:25:7: ( '=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:25:9: '='
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:26:7: ( '==' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:26:9: '=='
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:27:7: ( '>' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:27:9: '>'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:28:7: ( '>=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:28:9: '>='
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:29:7: ( '[' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:29:9: '['
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:30:7: ( ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:30:9: ']'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:31:7: ( 'and' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:31:9: 'and'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:32:7: ( 'boolean' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:32:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:33:7: ( 'char' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:33:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:34:7: ( 'constant' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:34:9: 'constant'
			{
			match("constant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:35:7: ( 'double' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:35:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:36:7: ( 'else' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:36:9: 'else'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:37:7: ( 'elseif' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:37:9: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:38:7: ( 'end' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:38:9: 'end'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:39:7: ( 'exit' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:39:9: 'exit'
			{
			match("exit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:40:7: ( 'float' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:40:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:41:7: ( 'function' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:41:9: 'function'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:42:7: ( 'if' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:42:9: 'if'
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
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:43:7: ( 'int' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:43:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:44:7: ( 'list' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:44:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:45:7: ( 'long' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:45:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:46:7: ( 'loop' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:46:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:47:7: ( 'or' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:47:9: 'or'
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:48:7: ( 'program' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:48:9: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:49:7: ( 'return' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:49:9: 'return'
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:7: ( 'string' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:51:7: ( 'then' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:51:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:52:7: ( 'var' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:52:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:7: ( 'when' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:9: 'when'
			{
			match("when"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:54:7: ( 'while' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:54:9: 'while'
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
	// $ANTLR end "T__79"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:217:2: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:217:3: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:218:4: 'false'
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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:221:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:221:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:221:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
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
	// $ANTLR end "IDENT"

	// $ANTLR start "LONGLITERAL"
	public final void mLONGLITERAL() throws RecognitionException {
		try {
			int _type = LONGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:226:5: ( IntegerNumber LongSuffix )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:226:9: IntegerNumber LongSuffix
			{
			mIntegerNumber(); 

			mLongSuffix(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONGLITERAL"

	// $ANTLR start "INTLITERAL"
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:231:5: ( IntegerNumber )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:231:9: IntegerNumber
			{
			mIntegerNumber(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLITERAL"

	// $ANTLR start "IntegerNumber"
	public final void mIntegerNumber() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:237:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
			int alt6=4;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				switch ( input.LA(2) ) {
				case 'X':
				case 'x':
					{
					alt6=4;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt6=3;
					}
					break;
				default:
					alt6=1;
				}
			}
			else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:237:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:238:9: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:238:18: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:239:9: '0' ( '0' .. '7' )+
					{
					match('0'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:239:13: ( '0' .. '7' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '7')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:240:9: HexPrefix ( HexDigit )+
					{
					mHexPrefix(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:240:19: ( HexDigit )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'F')||(LA5_0 >= 'a' && LA5_0 <= 'f')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerNumber"

	// $ANTLR start "HexPrefix"
	public final void mHexPrefix() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:245:5: ( '0x' | '0X' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='x') ) {
					alt7=1;
				}
				else if ( (LA7_1=='X') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:245:9: '0x'
					{
					match("0x"); 

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:245:16: '0X'
					{
					match("0X"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexPrefix"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:250:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HexDigit"

	// $ANTLR start "LongSuffix"
	public final void mLongSuffix() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:255:5: ( 'l' | 'L' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
	// $ANTLR end "LongSuffix"

	// $ANTLR start "NonIntegerNumber"
	public final void mNonIntegerNumber() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			int alt20=5;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:27: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							break loop9;
						}
					}

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:41: ( Exponent )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:261:41: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:262:9: '.' ( '0' .. '9' )+ ( Exponent )?
					{
					match('.'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:262:13: ( '0' .. '9' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:262:29: ( Exponent )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:262:29: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:263:9: ( '0' .. '9' )+ Exponent
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:263:9: ( '0' .. '9' )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					mExponent(); 

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:264:9: ( '0' .. '9' )+
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:264:9: ( '0' .. '9' )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:266:9: HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+
					{
					mHexPrefix(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:266:19: ( HexDigit )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'F')||(LA15_0 >= 'a' && LA15_0 <= 'f')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
							break loop15;
						}
					}

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:267:9: ( () | ( '.' ( HexDigit )* ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='P'||LA17_0=='p') ) {
						alt17=1;
					}
					else if ( (LA17_0=='.') ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:267:14: ()
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:267:14: ()
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:267:15: 
							{
							}

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:268:14: ( '.' ( HexDigit )* )
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:268:14: ( '.' ( HexDigit )* )
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:268:15: '.' ( HexDigit )*
							{
							match('.'); 
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:268:19: ( HexDigit )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( ((LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'F')||(LA16_0 >= 'a' && LA16_0 <= 'f')) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
									break loop16;
								}
							}

							}

							}
							break;

					}

					if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:271:9: ( '+' | '-' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='+'||LA18_0=='-') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:272:9: ( '0' .. '9' )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NonIntegerNumber"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:277:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:277:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:277:23: ( '+' | '-' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='+'||LA21_0=='-') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:277:38: ( '0' .. '9' )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatSuffix"
	public final void mFloatSuffix() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:282:5: ( 'f' | 'F' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
	// $ANTLR end "FloatSuffix"

	// $ANTLR start "DoubleSuffix"
	public final void mDoubleSuffix() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:287:5: ( 'd' | 'D' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
	// $ANTLR end "DoubleSuffix"

	// $ANTLR start "FLOATLITERAL"
	public final void mFLOATLITERAL() throws RecognitionException {
		try {
			int _type = FLOATLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:290:5: ( NonIntegerNumber )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:290:9: NonIntegerNumber
			{
			mNonIntegerNumber(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATLITERAL"

	// $ANTLR start "DOUBLELITERAL"
	public final void mDOUBLELITERAL() throws RecognitionException {
		try {
			int _type = DOUBLELITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:294:5: ( NonIntegerNumber ( DoubleSuffix )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:294:9: NonIntegerNumber ( DoubleSuffix )?
			{
			mNonIntegerNumber(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:294:26: ( DoubleSuffix )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='D'||LA23_0=='d') ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
					{
					if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
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
	// $ANTLR end "DOUBLELITERAL"

	// $ANTLR start "STRINGLITERAL"
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:299:5: ( '\"' (c=~ ( '\"' | '\\r' | '\\n' ) )* '\"' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:299:9: '\"' (c=~ ( '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); 
			StringBuilder b = new StringBuilder();
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:301:2: (c=~ ( '\"' | '\\r' | '\\n' ) )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\f')||(LA24_0 >= '\u000E' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '\uFFFF')) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:301:4: c=~ ( '\"' | '\\r' | '\\n' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					b.appendCodePoint(c);
					}
					break;

				default :
					break loop24;
				}
			}

			match('\"'); 
			setText(b.toString());
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "CHARLITERAL"
	public final void mCHARLITERAL() throws RecognitionException {
		try {
			int _type = CHARLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:308:2: ( '\\'' . '\\'' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:308:3: '\\'' . '\\''
			{
			match('\''); 
			matchAny(); 
			match('\''); 
			setText(getText().substring(1,2));
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARLITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:314:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:314:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
			{
			match('\\'); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:314:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
			int alt25=11;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt25=1;
				}
				break;
			case 't':
				{
				alt25=2;
				}
				break;
			case 'n':
				{
				alt25=3;
				}
				break;
			case 'f':
				{
				alt25=4;
				}
				break;
			case 'r':
				{
				alt25=5;
				}
				break;
			case '\"':
				{
				alt25=6;
				}
				break;
			case '\'':
				{
				alt25=7;
				}
				break;
			case '\\':
				{
				alt25=8;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
				{
				int LA25_9 = input.LA(2);
				if ( ((LA25_9 >= '0' && LA25_9 <= '7')) ) {
					int LA25_11 = input.LA(3);
					if ( ((LA25_11 >= '0' && LA25_11 <= '7')) ) {
						alt25=9;
					}

					else {
						alt25=10;
					}

				}

				else {
					alt25=11;
				}

				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
				{
				int LA25_10 = input.LA(2);
				if ( ((LA25_10 >= '0' && LA25_10 <= '7')) ) {
					alt25=10;
				}

				else {
					alt25=11;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:315:18: 'b'
					{
					match('b'); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:316:18: 't'
					{
					match('t'); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:317:18: 'n'
					{
					match('n'); 
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:318:18: 'f'
					{
					match('f'); 
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:319:18: 'r'
					{
					match('r'); 
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:320:18: '\\\"'
					{
					match('\"'); 
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:321:18: '\\''
					{
					match('\''); 
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:322:18: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:324:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:326:18: ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:328:18: ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:331:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:331:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:331:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||(LA26_0 >= '\f' && LA26_0 <= '\r')||LA26_0==' ') ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:
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
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
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
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:332:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:332:11: '//' ( . )* ( '\\n' | '\\r' )
			{
			match("//"); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:332:16: ( . )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0=='\n'||LA27_0=='\r') ) {
					alt27=2;
				}
				else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '\t')||(LA27_0 >= '\u000B' && LA27_0 <= '\f')||(LA27_0 >= '\u000E' && LA27_0 <= '\uFFFF')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:332:16: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop27;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:333:18: ( '/*' ( . )* '*/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:333:20: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:333:25: ( . )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='*') ) {
					int LA28_1 = input.LA(2);
					if ( (LA28_1=='/') ) {
						alt28=2;
					}
					else if ( ((LA28_1 >= '\u0000' && LA28_1 <= '.')||(LA28_1 >= '0' && LA28_1 <= '\uFFFF')) ) {
						alt28=1;
					}

				}
				else if ( ((LA28_0 >= '\u0000' && LA28_0 <= ')')||(LA28_0 >= '+' && LA28_0 <= '\uFFFF')) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:333:25: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop28;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | BOOLEAN | IDENT | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | STRINGLITERAL | CHARLITERAL | WS | COMMENT | MULTILINE_COMMENT )
		int alt29=55;
		alt29 = dfa29.predict(input);
		switch (alt29) {
			case 1 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:10: T__36
				{
				mT__36(); 

				}
				break;
			case 2 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:16: T__37
				{
				mT__37(); 

				}
				break;
			case 3 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:22: T__38
				{
				mT__38(); 

				}
				break;
			case 4 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:28: T__39
				{
				mT__39(); 

				}
				break;
			case 5 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:34: T__40
				{
				mT__40(); 

				}
				break;
			case 6 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:40: T__41
				{
				mT__41(); 

				}
				break;
			case 7 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:46: T__42
				{
				mT__42(); 

				}
				break;
			case 8 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:52: T__43
				{
				mT__43(); 

				}
				break;
			case 9 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:58: T__44
				{
				mT__44(); 

				}
				break;
			case 10 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:64: T__45
				{
				mT__45(); 

				}
				break;
			case 11 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:70: T__46
				{
				mT__46(); 

				}
				break;
			case 12 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:76: T__47
				{
				mT__47(); 

				}
				break;
			case 13 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:82: T__48
				{
				mT__48(); 

				}
				break;
			case 14 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:88: T__49
				{
				mT__49(); 

				}
				break;
			case 15 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:94: T__50
				{
				mT__50(); 

				}
				break;
			case 16 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:100: T__51
				{
				mT__51(); 

				}
				break;
			case 17 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:106: T__52
				{
				mT__52(); 

				}
				break;
			case 18 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:112: T__53
				{
				mT__53(); 

				}
				break;
			case 19 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:118: T__54
				{
				mT__54(); 

				}
				break;
			case 20 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:124: T__55
				{
				mT__55(); 

				}
				break;
			case 21 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:130: T__56
				{
				mT__56(); 

				}
				break;
			case 22 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:136: T__57
				{
				mT__57(); 

				}
				break;
			case 23 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:142: T__58
				{
				mT__58(); 

				}
				break;
			case 24 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:148: T__59
				{
				mT__59(); 

				}
				break;
			case 25 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:154: T__60
				{
				mT__60(); 

				}
				break;
			case 26 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:160: T__61
				{
				mT__61(); 

				}
				break;
			case 27 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:166: T__62
				{
				mT__62(); 

				}
				break;
			case 28 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:172: T__63
				{
				mT__63(); 

				}
				break;
			case 29 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:178: T__64
				{
				mT__64(); 

				}
				break;
			case 30 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:184: T__65
				{
				mT__65(); 

				}
				break;
			case 31 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:190: T__66
				{
				mT__66(); 

				}
				break;
			case 32 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:196: T__67
				{
				mT__67(); 

				}
				break;
			case 33 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:202: T__68
				{
				mT__68(); 

				}
				break;
			case 34 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:208: T__69
				{
				mT__69(); 

				}
				break;
			case 35 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:214: T__70
				{
				mT__70(); 

				}
				break;
			case 36 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:220: T__71
				{
				mT__71(); 

				}
				break;
			case 37 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:226: T__72
				{
				mT__72(); 

				}
				break;
			case 38 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:232: T__73
				{
				mT__73(); 

				}
				break;
			case 39 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:238: T__74
				{
				mT__74(); 

				}
				break;
			case 40 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:244: T__75
				{
				mT__75(); 

				}
				break;
			case 41 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:250: T__76
				{
				mT__76(); 

				}
				break;
			case 42 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:256: T__77
				{
				mT__77(); 

				}
				break;
			case 43 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:262: T__78
				{
				mT__78(); 

				}
				break;
			case 44 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:268: T__79
				{
				mT__79(); 

				}
				break;
			case 45 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:274: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 46 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:282: IDENT
				{
				mIDENT(); 

				}
				break;
			case 47 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:288: LONGLITERAL
				{
				mLONGLITERAL(); 

				}
				break;
			case 48 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:300: INTLITERAL
				{
				mINTLITERAL(); 

				}
				break;
			case 49 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:311: FLOATLITERAL
				{
				mFLOATLITERAL(); 

				}
				break;
			case 50 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:324: DOUBLELITERAL
				{
				mDOUBLELITERAL(); 

				}
				break;
			case 51 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:338: STRINGLITERAL
				{
				mSTRINGLITERAL(); 

				}
				break;
			case 52 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:352: CHARLITERAL
				{
				mCHARLITERAL(); 

				}
				break;
			case 53 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:364: WS
				{
				mWS(); 

				}
				break;
			case 54 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:367: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 55 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:1:375: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA20 dfa20 = new DFA20(this);
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA20_eotS =
		"\1\uffff\1\7\1\uffff\1\7\4\uffff";
	static final String DFA20_eofS =
		"\10\uffff";
	static final String DFA20_minS =
		"\2\56\1\uffff\1\56\4\uffff";
	static final String DFA20_maxS =
		"\1\71\1\170\1\uffff\1\145\4\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\1\uffff\1\5\1\1\1\3\1\4";
	static final String DFA20_specialS =
		"\10\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\2\1\uffff\1\1\11\3",
			"\1\5\1\uffff\12\3\13\uffff\1\6\22\uffff\1\4\14\uffff\1\6\22\uffff\1"+
			"\4",
			"",
			"\1\5\1\uffff\12\3\13\uffff\1\6\37\uffff\1\6",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "260:1: fragment NonIntegerNumber : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ );";
		}
	}

	static final String DFA29_eotS =
		"\6\uffff\1\47\1\uffff\1\51\1\54\1\uffff\1\56\1\60\1\62\2\uffff\17\37\1"+
		"\uffff\2\114\21\uffff\13\37\1\140\3\37\1\145\7\37\4\uffff\1\114\2\163"+
		"\2\uffff\1\114\1\163\1\167\5\37\1\175\4\37\1\uffff\1\u0082\3\37\1\uffff"+
		"\5\37\1\u008b\2\37\1\114\2\uffff\1\163\3\uffff\1\163\2\uffff\1\37\1\u0096"+
		"\2\37\1\u009a\1\uffff\1\u009b\3\37\1\uffff\1\u009f\1\u00a0\1\u00a1\3\37"+
		"\1\u00a5\1\u00a6\1\uffff\1\u00a7\1\37\1\uffff\1\163\2\uffff\1\163\1\uffff"+
		"\1\163\1\37\1\uffff\3\37\2\uffff\1\u00ad\1\37\1\u00a6\3\uffff\3\37\3\uffff"+
		"\1\u00b2\2\37\1\u00b5\1\u00b6\1\uffff\2\37\1\u00b9\1\u00ba\1\uffff\1\u00bb"+
		"\1\37\2\uffff\1\37\1\u00be\3\uffff\1\u00bf\1\u00c0\3\uffff";
	static final String DFA29_eofS =
		"\u00c1\uffff";
	static final String DFA29_minS =
		"\1\11\5\uffff\1\53\1\uffff\1\55\1\52\1\uffff\3\75\2\uffff\1\156\1\157"+
		"\1\150\1\157\1\154\1\141\1\146\1\151\2\162\1\145\1\164\1\150\1\141\1\150"+
		"\1\uffff\2\56\1\60\20\uffff\1\144\1\157\1\141\1\156\1\165\1\163\1\144"+
		"\1\151\1\157\1\156\1\154\1\60\1\164\1\163\1\156\1\60\1\157\1\164\1\162"+
		"\1\145\1\165\1\162\1\145\2\56\2\uffff\1\56\1\60\1\56\1\53\1\uffff\1\56"+
		"\2\60\1\154\1\162\1\163\1\142\1\145\1\60\1\164\1\141\1\143\1\163\1\uffff"+
		"\1\60\1\164\1\147\1\160\1\uffff\1\147\1\165\1\151\1\156\1\145\1\60\1\156"+
		"\1\154\1\56\1\53\2\60\1\53\1\uffff\2\60\1\53\1\uffff\1\145\1\60\1\164"+
		"\1\154\1\60\1\uffff\1\60\2\164\1\145\1\uffff\3\60\2\162\1\156\2\60\1\uffff"+
		"\1\60\1\145\7\60\1\141\1\uffff\1\141\1\145\1\146\2\uffff\1\60\1\151\1"+
		"\60\3\uffff\1\141\1\156\1\147\3\uffff\1\60\2\156\2\60\1\uffff\1\157\1"+
		"\155\2\60\1\uffff\1\60\1\164\2\uffff\1\156\1\60\3\uffff\2\60\3\uffff";
	static final String DFA29_maxS =
		"\1\172\5\uffff\1\53\1\uffff\1\55\1\57\1\uffff\3\75\2\uffff\1\156\3\157"+
		"\1\170\1\165\1\156\1\157\2\162\1\145\1\164\1\162\1\141\1\150\1\uffff\1"+
		"\170\1\154\1\71\20\uffff\1\144\1\157\1\141\1\156\1\165\1\163\1\144\1\151"+
		"\1\157\1\156\1\154\1\172\1\164\1\163\1\157\1\172\1\157\1\164\1\162\1\145"+
		"\1\165\1\162\1\151\2\160\2\uffff\1\154\2\145\1\71\1\uffff\1\154\1\145"+
		"\1\172\1\154\1\162\1\163\1\142\1\145\1\172\1\164\1\141\1\143\1\163\1\uffff"+
		"\1\172\1\164\1\147\1\160\1\uffff\1\147\1\165\1\151\1\156\1\145\1\172\1"+
		"\156\1\154\1\160\1\71\1\160\1\145\1\71\1\uffff\1\71\1\144\1\71\1\uffff"+
		"\1\145\1\172\1\164\1\154\1\172\1\uffff\1\172\2\164\1\145\1\uffff\3\172"+
		"\2\162\1\156\2\172\1\uffff\1\172\1\145\1\71\1\144\1\160\1\71\1\144\1\71"+
		"\1\144\1\141\1\uffff\1\141\1\145\1\146\2\uffff\1\172\1\151\1\172\3\uffff"+
		"\1\141\1\156\1\147\3\uffff\1\172\2\156\2\172\1\uffff\1\157\1\155\2\172"+
		"\1\uffff\1\172\1\164\2\uffff\1\156\1\172\3\uffff\2\172\3\uffff";
	static final String DFA29_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\2\uffff\1\14\3\uffff\1\23\1"+
		"\24\17\uffff\1\56\3\uffff\1\63\1\64\1\65\1\7\1\6\1\12\1\11\1\66\1\67\1"+
		"\13\1\16\1\15\1\20\1\17\1\22\1\21\31\uffff\1\60\1\57\4\uffff\1\62\15\uffff"+
		"\1\40\4\uffff\1\45\15\uffff\1\61\3\uffff\1\25\5\uffff\1\34\4\uffff\1\41"+
		"\10\uffff\1\52\12\uffff\1\27\3\uffff\1\32\1\35\3\uffff\1\42\1\43\1\44"+
		"\3\uffff\1\51\1\55\1\53\5\uffff\1\36\4\uffff\1\54\2\uffff\1\31\1\33\2"+
		"\uffff\1\47\1\50\1\26\2\uffff\1\46\1\30\1\37";
	static final String DFA29_specialS =
		"\u00c1\uffff}>";
	static final String[] DFA29_transitionS = {
			"\2\45\1\uffff\2\45\22\uffff\1\45\1\1\1\43\2\uffff\1\2\1\uffff\1\44\1"+
			"\3\1\4\1\5\1\6\1\7\1\10\1\42\1\11\1\40\11\41\1\uffff\1\12\1\13\1\14\1"+
			"\15\2\uffff\32\37\1\16\1\uffff\1\17\3\uffff\1\20\1\21\1\22\1\23\1\24"+
			"\1\25\2\37\1\26\2\37\1\27\2\37\1\30\1\31\1\37\1\32\1\33\1\34\1\37\1\35"+
			"\1\36\3\37",
			"",
			"",
			"",
			"",
			"",
			"\1\46",
			"",
			"\1\50",
			"\1\53\4\uffff\1\52",
			"",
			"\1\55",
			"\1\57",
			"\1\61",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65\6\uffff\1\66",
			"\1\67",
			"\1\70\1\uffff\1\71\11\uffff\1\72",
			"\1\75\12\uffff\1\73\10\uffff\1\74",
			"\1\76\7\uffff\1\77",
			"\1\100\5\uffff\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106\11\uffff\1\107",
			"\1\110",
			"\1\111",
			"",
			"\1\117\1\uffff\10\116\2\120\12\uffff\1\122\1\121\6\uffff\1\115\13\uffff"+
			"\1\113\13\uffff\1\122\1\121\6\uffff\1\115\13\uffff\1\112",
			"\1\117\1\uffff\12\123\12\uffff\1\122\1\121\6\uffff\1\115\27\uffff\1"+
			"\122\1\121\6\uffff\1\115",
			"\12\124",
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
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\141",
			"\1\142",
			"\1\143\1\144",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154\3\uffff\1\155",
			"\1\160\1\uffff\12\156\7\uffff\6\156\11\uffff\1\157\20\uffff\6\156\11"+
			"\uffff\1\157",
			"\1\160\1\uffff\12\156\7\uffff\6\156\11\uffff\1\157\20\uffff\6\156\11"+
			"\uffff\1\157",
			"",
			"",
			"\1\117\1\uffff\10\116\2\120\12\uffff\1\122\1\121\6\uffff\1\115\27\uffff"+
			"\1\122\1\121\6\uffff\1\115",
			"\12\161\12\uffff\1\122\1\162\36\uffff\1\122\1\162",
			"\1\117\1\uffff\12\120\12\uffff\1\122\1\121\36\uffff\1\122\1\121",
			"\1\164\1\uffff\1\164\2\uffff\12\165",
			"",
			"\1\117\1\uffff\12\123\12\uffff\1\122\1\121\6\uffff\1\115\27\uffff\1"+
			"\122\1\121\6\uffff\1\115",
			"\12\124\12\uffff\1\122\1\166\36\uffff\1\122\1\166",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u008c",
			"\1\u008d",
			"\1\160\1\uffff\12\156\7\uffff\6\156\5\uffff\1\115\3\uffff\1\157\20\uffff"+
			"\6\156\5\uffff\1\115\3\uffff\1\157",
			"\1\u008e\1\uffff\1\u008e\2\uffff\12\u008f",
			"\12\u0090\7\uffff\6\u0090\11\uffff\1\157\20\uffff\6\u0090\11\uffff\1"+
			"\157",
			"\12\161\12\uffff\1\122\1\162\36\uffff\1\122\1\162",
			"\1\u0091\1\uffff\1\u0091\2\uffff\12\u0092",
			"",
			"\12\165",
			"\12\165\12\uffff\1\122\37\uffff\1\122",
			"\1\u0093\1\uffff\1\u0093\2\uffff\12\u0094",
			"",
			"\1\u0095",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u0097",
			"\1\u0098",
			"\12\37\7\uffff\32\37\6\uffff\10\37\1\u0099\21\37",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u00a8",
			"\12\u008f",
			"\12\u008f\12\uffff\1\122\37\uffff\1\122",
			"\12\u0090\7\uffff\6\u0090\11\uffff\1\157\20\uffff\6\u0090\11\uffff\1"+
			"\157",
			"\12\u0092",
			"\12\u0092\12\uffff\1\122\37\uffff\1\122",
			"\12\u0094",
			"\12\u0094\12\uffff\1\122\37\uffff\1\122",
			"\1\u00a9",
			"",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u00ae",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u00b3",
			"\1\u00b4",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"\1\u00b7",
			"\1\u00b8",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\u00bc",
			"",
			"",
			"\1\u00bd",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | BOOLEAN | IDENT | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | STRINGLITERAL | CHARLITERAL | WS | COMMENT | MULTILINE_COMMENT );";
		}
	}

}
