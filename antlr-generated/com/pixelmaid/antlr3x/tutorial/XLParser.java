// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g 2013-02-01 14:43:52

  package com.pixelmaid.antlr3x.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "COMMENT", "CONSTANT_TYPE", 
		"DOUBLELITERAL", "DoubleSuffix", "ELSE", "ELSE_IF", "END", "EXIT", "EscapeSequence", 
		"Exponent", "FLOATLITERAL", "FUNCTION", "FloatSuffix", "HexDigit", "HexPrefix", 
		"IDENT", "IF", "INTLITERAL", "IdentifierPart", "IdentifierStart", "IntegerNumber", 
		"LEFTPAREN", "LONGLITERAL", "LOOP", "LongSuffix", "MULTILINE_COMMENT", 
		"NonIntegerNumber", "OR", "RIGHTPAREN", "SEMI", "STRINGLITERAL", "THEN", 
		"VAR_TYPE", "WHEN", "WHILE", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", 
		"'&'", "'&='", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", 
		"'-='", "'/'", "'/='", "':'", "'<'", "'='", "'=='", "'>'", "'?'", "'['", 
		"']'", "'^'", "'^='", "'double'", "'float'", "'instanceof'", "'int'", 
		"'long'", "'|'", "'|='", "'||'", "'~'"
	};
	public static final int EOF=-1;
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
	public static final int AND=4;
	public static final int COMMENT=5;
	public static final int CONSTANT_TYPE=6;
	public static final int DOUBLELITERAL=7;
	public static final int DoubleSuffix=8;
	public static final int ELSE=9;
	public static final int ELSE_IF=10;
	public static final int END=11;
	public static final int EXIT=12;
	public static final int EscapeSequence=13;
	public static final int Exponent=14;
	public static final int FLOATLITERAL=15;
	public static final int FUNCTION=16;
	public static final int FloatSuffix=17;
	public static final int HexDigit=18;
	public static final int HexPrefix=19;
	public static final int IDENT=20;
	public static final int IF=21;
	public static final int INTLITERAL=22;
	public static final int IdentifierPart=23;
	public static final int IdentifierStart=24;
	public static final int IntegerNumber=25;
	public static final int LEFTPAREN=26;
	public static final int LONGLITERAL=27;
	public static final int LOOP=28;
	public static final int LongSuffix=29;
	public static final int MULTILINE_COMMENT=30;
	public static final int NonIntegerNumber=31;
	public static final int OR=32;
	public static final int RIGHTPAREN=33;
	public static final int SEMI=34;
	public static final int STRINGLITERAL=35;
	public static final int THEN=36;
	public static final int VAR_TYPE=37;
	public static final int WHEN=38;
	public static final int WHILE=39;
	public static final int WS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return XLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g"; }



	// $ANTLR start "program"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:16:1: program : variable ;
	public final void program() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:17:2: ( variable )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:17:3: variable
			{
			pushFollow(FOLLOW_variable_in_program41);
			variable();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "constant"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:20:1: constant : CONSTANT_TYPE type IDENT ( ',' IDENT )* ( '=' expression )* SEMI ;
	public final void constant() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:2: ( CONSTANT_TYPE type IDENT ( ',' IDENT )* ( '=' expression )* SEMI )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:3: CONSTANT_TYPE type IDENT ( ',' IDENT )* ( '=' expression )* SEMI
			{
			match(input,CONSTANT_TYPE,FOLLOW_CONSTANT_TYPE_in_constant51); 
			pushFollow(FOLLOW_type_in_constant53);
			type();
			state._fsp--;

			match(input,IDENT,FOLLOW_IDENT_in_constant55); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:28: ( ',' IDENT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==53) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:29: ',' IDENT
					{
					match(input,53,FOLLOW_53_in_constant58); 
					match(input,IDENT,FOLLOW_IDENT_in_constant60); 
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:41: ( '=' expression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==61) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:21:42: '=' expression
					{
					match(input,61,FOLLOW_61_in_constant65); 
					pushFollow(FOLLOW_expression_in_constant67);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_constant71); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constant"



	// $ANTLR start "variable"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:26:1: variable : VAR_TYPE type variableDeclarator ( ',' variableDeclarator )* ';' ;
	public final void variable() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:27:2: ( VAR_TYPE type variableDeclarator ( ',' variableDeclarator )* ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:27:3: VAR_TYPE type variableDeclarator ( ',' variableDeclarator )* ';'
			{
			match(input,VAR_TYPE,FOLLOW_VAR_TYPE_in_variable84); 
			pushFollow(FOLLOW_type_in_variable88);
			type();
			state._fsp--;

			pushFollow(FOLLOW_variableDeclarator_in_variable98);
			variableDeclarator();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:30:9: ( ',' variableDeclarator )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==53) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:30:10: ',' variableDeclarator
					{
					match(input,53,FOLLOW_53_in_variable109); 
					pushFollow(FOLLOW_variableDeclarator_in_variable111);
					variableDeclarator();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_variable123); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable"



	// $ANTLR start "variableDeclarator"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:34:1: variableDeclarator : IDENT ( '[' ']' )* ( '=' variableInitializer )? ;
	public final void variableDeclarator() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:35:5: ( IDENT ( '[' ']' )* ( '=' variableInitializer )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:35:9: IDENT ( '[' ']' )* ( '=' variableInitializer )?
			{
			match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator141); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:36:9: ( '[' ']' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==65) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:36:10: '[' ']'
					{
					match(input,65,FOLLOW_65_in_variableDeclarator152); 
					match(input,66,FOLLOW_66_in_variableDeclarator154); 
					}
					break;

				default :
					break loop4;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:38:9: ( '=' variableInitializer )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==61) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:38:10: '=' variableInitializer
					{
					match(input,61,FOLLOW_61_in_variableDeclarator176); 
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator178);
					variableInitializer();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "variableInitializer"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:41:1: variableInitializer : expression ;
	public final void variableInitializer() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:42:5: ( expression )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:42:8: expression
			{
			pushFollow(FOLLOW_expression_in_variableInitializer207);
			expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variableInitializer"



	// $ANTLR start "type"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:45:1: type : (| 'int' | 'long' | 'float' | 'double' );
	public final void type() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:46:5: (| 'int' | 'long' | 'float' | 'double' )
			int alt6=5;
			switch ( input.LA(1) ) {
			case IDENT:
			case 42:
			case 45:
			case 46:
			case 62:
			case 64:
			case 67:
			case 74:
			case 76:
				{
				alt6=1;
				}
				break;
			case 72:
				{
				alt6=2;
				}
				break;
			case 73:
				{
				alt6=3;
				}
				break;
			case 70:
				{
				alt6=4;
				}
				break;
			case 69:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:47:5: 
					{
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:47:9: 'int'
					{
					match(input,72,FOLLOW_72_in_type239); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:48:9: 'long'
					{
					match(input,73,FOLLOW_73_in_type249); 
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:49:9: 'float'
					{
					match(input,70,FOLLOW_70_in_type259); 
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:50:9: 'double'
					{
					match(input,69,FOLLOW_69_in_type269); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:53:1: statement : ( assignmentStatement | ifStatement | loopStatement | whileStatement );
	public final void statement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:54:2: ( assignmentStatement | ifStatement | loopStatement | whileStatement )
			int alt7=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt7=1;
				}
				break;
			case IF:
				{
				alt7=2;
				}
				break;
			case LOOP:
				{
				alt7=3;
				}
				break;
			case WHILE:
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:54:4: assignmentStatement
					{
					pushFollow(FOLLOW_assignmentStatement_in_statement283);
					assignmentStatement();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:55:4: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement288);
					ifStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:56:4: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement293);
					loopStatement();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:57:4: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement298);
					whileStatement();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:61:1: ifStatement : IF expression THEN ( statement )+ ( ELSE_IF expression THEN ( statement )+ )* ( ELSE ( statement )+ )? END IF ;
	public final void ifStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:62:2: ( IF expression THEN ( statement )+ ( ELSE_IF expression THEN ( statement )+ )* ( ELSE ( statement )+ )? END IF )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:62:4: IF expression THEN ( statement )+ ( ELSE_IF expression THEN ( statement )+ )* ( ELSE ( statement )+ )? END IF
			{
			match(input,IF,FOLLOW_IF_in_ifStatement312); 
			pushFollow(FOLLOW_expression_in_ifStatement314);
			expression();
			state._fsp--;

			match(input,THEN,FOLLOW_THEN_in_ifStatement316); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:62:23: ( statement )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= IDENT && LA8_0 <= IF)||LA8_0==LOOP||LA8_0==WHILE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:62:23: statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement318);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:63:3: ( ELSE_IF expression THEN ( statement )+ )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ELSE_IF) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:63:4: ELSE_IF expression THEN ( statement )+
					{
					match(input,ELSE_IF,FOLLOW_ELSE_IF_in_ifStatement324); 
					pushFollow(FOLLOW_expression_in_ifStatement326);
					expression();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_ifStatement328); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:63:28: ( statement )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= IDENT && LA9_0 <= IF)||LA9_0==LOOP||LA9_0==WHILE) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:63:28: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement330);
							statement();
							state._fsp--;

							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}
					break;

				default :
					break loop10;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:64:3: ( ELSE ( statement )+ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:64:4: ELSE ( statement )+
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatement338); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:64:9: ( statement )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= IDENT && LA11_0 <= IF)||LA11_0==LOOP||LA11_0==WHILE) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:64:9: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement340);
							statement();
							state._fsp--;

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					}
					break;

			}

			match(input,END,FOLLOW_END_in_ifStatement347); 
			match(input,IF,FOLLOW_IF_in_ifStatement349); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:68:1: whileStatement : WHILE expression loopStatement ;
	public final void whileStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:69:2: ( WHILE expression loopStatement )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:69:3: WHILE expression loopStatement
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStatement360); 
			pushFollow(FOLLOW_expression_in_whileStatement362);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_loopStatement_in_whileStatement364);
			loopStatement();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "loopStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:72:1: loopStatement : LOOP ( statement | exitStatement )* END LOOP ;
	public final void loopStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:73:2: ( LOOP ( statement | exitStatement )* END LOOP )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:73:4: LOOP ( statement | exitStatement )* END LOOP
			{
			match(input,LOOP,FOLLOW_LOOP_in_loopStatement376); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:73:9: ( statement | exitStatement )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= IDENT && LA13_0 <= IF)||LA13_0==LOOP||LA13_0==WHILE) ) {
					alt13=1;
				}
				else if ( (LA13_0==EXIT) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:73:10: statement
					{
					pushFollow(FOLLOW_statement_in_loopStatement379);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:73:20: exitStatement
					{
					pushFollow(FOLLOW_exitStatement_in_loopStatement381);
					exitStatement();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,END,FOLLOW_END_in_loopStatement385); 
			match(input,LOOP,FOLLOW_LOOP_in_loopStatement387); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "loopStatement"



	// $ANTLR start "exitStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:76:1: exitStatement : EXIT WHEN expression SEMI ;
	public final void exitStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:77:2: ( EXIT WHEN expression SEMI )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:77:4: EXIT WHEN expression SEMI
			{
			match(input,EXIT,FOLLOW_EXIT_in_exitStatement399); 
			match(input,WHEN,FOLLOW_WHEN_in_exitStatement401); 
			pushFollow(FOLLOW_expression_in_exitStatement403);
			expression();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_exitStatement405); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exitStatement"



	// $ANTLR start "assignmentStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:80:1: assignmentStatement : IDENT '=' expression ';' ;
	public final void assignmentStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:81:2: ( IDENT '=' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:81:4: IDENT '=' expression ';'
			{
			match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement417); 
			match(input,61,FOLLOW_61_in_assignmentStatement419); 
			pushFollow(FOLLOW_expression_in_assignmentStatement421);
			expression();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_assignmentStatement423); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignmentStatement"



	// $ANTLR start "function"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:85:1: function : FUNCTION IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* END IDENT ;
	public final void function() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:86:2: ( FUNCTION IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* END IDENT )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:86:4: FUNCTION IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* END IDENT
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_function437); 
			match(input,IDENT,FOLLOW_IDENT_in_function439); 
			match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_function441); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:86:22: ( parameters )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==IDENT||LA14_0==42||(LA14_0 >= 45 && LA14_0 <= 46)||LA14_0==62||LA14_0==64||LA14_0==67||(LA14_0 >= 69 && LA14_0 <= 70)||(LA14_0 >= 72 && LA14_0 <= 74)||LA14_0==76) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:86:22: parameters
					{
					pushFollow(FOLLOW_parameters_in_function442);
					parameters();
					state._fsp--;

					}
					break;

			}

			match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_function445); 
			match(input,61,FOLLOW_61_in_function447); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:87:3: ( variable )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==VAR_TYPE) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:87:4: variable
					{
					pushFollow(FOLLOW_variable_in_function452);
					variable();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:88:3: ( statement )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= IDENT && LA16_0 <= IF)||LA16_0==LOOP||LA16_0==WHILE) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:88:3: statement
					{
					pushFollow(FOLLOW_statement_in_function459);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,END,FOLLOW_END_in_function464); 
			match(input,IDENT,FOLLOW_IDENT_in_function466); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "parameters"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:92:1: parameters : parameter ( ',' parameter )* ;
	public final void parameters() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:93:2: ( parameter ( ',' parameter )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:93:4: parameter ( ',' parameter )*
			{
			pushFollow(FOLLOW_parameter_in_parameters480);
			parameter();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:93:14: ( ',' parameter )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==53) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:93:15: ',' parameter
					{
					match(input,53,FOLLOW_53_in_parameters483); 
					pushFollow(FOLLOW_parameter_in_parameters485);
					parameter();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameters"



	// $ANTLR start "parameter"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:96:1: parameter : type IDENT ( '=' expression )? ;
	public final void parameter() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:97:2: ( type IDENT ( '=' expression )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:97:4: type IDENT ( '=' expression )?
			{
			pushFollow(FOLLOW_type_in_parameter499);
			type();
			state._fsp--;

			match(input,IDENT,FOLLOW_IDENT_in_parameter501); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:97:16: ( '=' expression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==61) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:97:17: '=' expression
					{
					match(input,61,FOLLOW_61_in_parameter505); 
					pushFollow(FOLLOW_expression_in_parameter507);
					expression();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter"



	// $ANTLR start "term"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:102:1: term : ( IDENT | '(' expression ')' | INTLITERAL | FLOATLITERAL );
	public final void term() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:103:2: ( IDENT | '(' expression ')' | INTLITERAL | FLOATLITERAL )
			int alt19=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt19=1;
				}
				break;
			case LEFTPAREN:
				{
				alt19=2;
				}
				break;
			case INTLITERAL:
				{
				alt19=3;
				}
				break;
			case FLOATLITERAL:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:103:4: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_term524); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:104:4: '(' expression ')'
					{
					match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_term529); 
					pushFollow(FOLLOW_expression_in_term531);
					expression();
					state._fsp--;

					match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_term533); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:105:4: INTLITERAL
					{
					match(input,INTLITERAL,FOLLOW_INTLITERAL_in_term538); 
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:106:4: FLOATLITERAL
					{
					match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_term543); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "negation"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:109:1: negation : ( '!' )* term ;
	public final void negation() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:110:2: ( ( '!' )* term )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:110:4: ( '!' )* term
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:110:4: ( '!' )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==41) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:110:4: '!'
					{
					match(input,41,FOLLOW_41_in_negation555); 
					}
					break;

				default :
					break loop20;
				}
			}

			pushFollow(FOLLOW_term_in_negation558);
			term();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "negation"



	// $ANTLR start "unaryExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:113:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final void unaryExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:114:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt21=5;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt21=1;
				}
				break;
			case 54:
				{
				alt21=2;
				}
				break;
			case 51:
				{
				alt21=3;
				}
				break;
			case 55:
				{
				alt21=4;
				}
				break;
			case 41:
			case 77:
				{
				alt21=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:114:9: '+' unaryExpression
					{
					match(input,50,FOLLOW_50_in_unaryExpression576); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression579);
					unaryExpression();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:115:9: '-' unaryExpression
					{
					match(input,54,FOLLOW_54_in_unaryExpression589); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression591);
					unaryExpression();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:116:9: '++' unaryExpression
					{
					match(input,51,FOLLOW_51_in_unaryExpression601); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression603);
					unaryExpression();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:117:9: '--' unaryExpression
					{
					match(input,55,FOLLOW_55_in_unaryExpression613); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression615);
					unaryExpression();
					state._fsp--;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:118:9: unaryExpressionNotPlusMinus
					{
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression625);
					unaryExpressionNotPlusMinus();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "unaryExpressionNotPlusMinus"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:121:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression );
	public final void unaryExpressionNotPlusMinus() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:122:5: ( '~' unaryExpression | '!' unaryExpression )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==77) ) {
				alt22=1;
			}
			else if ( (LA22_0==41) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:122:9: '~' unaryExpression
					{
					match(input,77,FOLLOW_77_in_unaryExpressionNotPlusMinus645); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus647);
					unaryExpression();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:123:9: '!' unaryExpression
					{
					match(input,41,FOLLOW_41_in_unaryExpressionNotPlusMinus657); 
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus659);
					unaryExpression();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"



	// $ANTLR start "relationalExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:126:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:127:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:127:9: shiftExpression ( relationalOp shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression679);
			shiftExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:128:9: ( relationalOp shiftExpression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==60||LA23_0==63) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:128:10: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression690);
					relationalOp();
					state._fsp--;

					pushFollow(FOLLOW_shiftExpression_in_relationalExpression692);
					shiftExpression();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "relationalOp"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:132:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
	public final void relationalOp() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:133:5: ( '<' '=' | '>' '=' | '<' | '>' )
			int alt24=4;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==60) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==61) ) {
					alt24=1;
				}
				else if ( (LA24_1==41||(LA24_1 >= 50 && LA24_1 <= 51)||(LA24_1 >= 54 && LA24_1 <= 55)||LA24_1==77) ) {
					alt24=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA24_0==63) ) {
				int LA24_2 = input.LA(2);
				if ( (LA24_2==61) ) {
					alt24=2;
				}
				else if ( (LA24_2==41||(LA24_2 >= 50 && LA24_2 <= 51)||(LA24_2 >= 54 && LA24_2 <= 55)||LA24_2==77) ) {
					alt24=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:133:10: '<' '='
					{
					match(input,60,FOLLOW_60_in_relationalOp724); 
					match(input,61,FOLLOW_61_in_relationalOp726); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:134:10: '>' '='
					{
					match(input,63,FOLLOW_63_in_relationalOp737); 
					match(input,61,FOLLOW_61_in_relationalOp739); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:135:9: '<'
					{
					match(input,60,FOLLOW_60_in_relationalOp749); 
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:136:9: '>'
					{
					match(input,63,FOLLOW_63_in_relationalOp759); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationalOp"



	// $ANTLR start "shiftExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:139:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final void shiftExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:140:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:140:9: additiveExpression ( shiftOp additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression779);
			additiveExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:141:9: ( shiftOp additiveExpression )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==60) ) {
					int LA25_1 = input.LA(2);
					if ( (LA25_1==60) ) {
						alt25=1;
					}

				}
				else if ( (LA25_0==63) ) {
					int LA25_2 = input.LA(2);
					if ( (LA25_2==63) ) {
						alt25=1;
					}

				}

				switch (alt25) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:141:10: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression790);
					shiftOp();
					state._fsp--;

					pushFollow(FOLLOW_additiveExpression_in_shiftExpression792);
					additiveExpression();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shiftExpression"



	// $ANTLR start "shiftOp"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:146:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
	public final void shiftOp() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:147:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==60) ) {
				alt26=1;
			}
			else if ( (LA26_0==63) ) {
				int LA26_2 = input.LA(2);
				if ( (LA26_2==63) ) {
					int LA26_3 = input.LA(3);
					if ( (LA26_3==63) ) {
						alt26=2;
					}
					else if ( (LA26_3==41||(LA26_3 >= 50 && LA26_3 <= 51)||(LA26_3 >= 54 && LA26_3 <= 55)||LA26_3==77) ) {
						alt26=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 3, input);
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
							new NoViableAltException("", 26, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:147:10: '<' '<'
					{
					match(input,60,FOLLOW_60_in_shiftOp825); 
					match(input,60,FOLLOW_60_in_shiftOp827); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:148:10: '>' '>' '>'
					{
					match(input,63,FOLLOW_63_in_shiftOp838); 
					match(input,63,FOLLOW_63_in_shiftOp840); 
					match(input,63,FOLLOW_63_in_shiftOp842); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:149:10: '>' '>'
					{
					match(input,63,FOLLOW_63_in_shiftOp853); 
					match(input,63,FOLLOW_63_in_shiftOp855); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shiftOp"



	// $ANTLR start "additiveExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:153:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:154:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:154:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression876);
			multiplicativeExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:155:9: ( ( '+' | '-' ) multiplicativeExpression )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==50||LA27_0==54) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:156:13: ( '+' | '-' ) multiplicativeExpression
					{
					if ( input.LA(1)==50||input.LA(1)==54 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression953);
					multiplicativeExpression();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:163:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:164:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:165:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression991);
			unaryExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:166:9: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==43||LA28_0==48||LA28_0==57) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:167:13: ( '*' | '/' | '%' ) unaryExpression
					{
					if ( input.LA(1)==43||input.LA(1)==48||input.LA(1)==57 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1086);
					unaryExpression();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:175:1: expression :;
	public final void expression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:176:5: ()
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:177:5: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignmentOperator"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:180:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:181:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' )
			int alt29=12;
			switch ( input.LA(1) ) {
			case 61:
				{
				alt29=1;
				}
				break;
			case 52:
				{
				alt29=2;
				}
				break;
			case 56:
				{
				alt29=3;
				}
				break;
			case 49:
				{
				alt29=4;
				}
				break;
			case 58:
				{
				alt29=5;
				}
				break;
			case 47:
				{
				alt29=6;
				}
				break;
			case 75:
				{
				alt29=7;
				}
				break;
			case 68:
				{
				alt29=8;
				}
				break;
			case 44:
				{
				alt29=9;
				}
				break;
			case 60:
				{
				alt29=10;
				}
				break;
			case 63:
				{
				int LA29_11 = input.LA(2);
				if ( (LA29_11==63) ) {
					int LA29_12 = input.LA(3);
					if ( (LA29_12==63) ) {
						alt29=11;
					}
					else if ( (LA29_12==61) ) {
						alt29=12;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 12, input);
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
							new NoViableAltException("", 29, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:181:9: '='
					{
					match(input,61,FOLLOW_61_in_assignmentOperator1138); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:182:9: '+='
					{
					match(input,52,FOLLOW_52_in_assignmentOperator1148); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:183:9: '-='
					{
					match(input,56,FOLLOW_56_in_assignmentOperator1158); 
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:184:9: '*='
					{
					match(input,49,FOLLOW_49_in_assignmentOperator1168); 
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:185:9: '/='
					{
					match(input,58,FOLLOW_58_in_assignmentOperator1178); 
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:186:9: '&='
					{
					match(input,47,FOLLOW_47_in_assignmentOperator1188); 
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:187:9: '|='
					{
					match(input,75,FOLLOW_75_in_assignmentOperator1198); 
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:188:9: '^='
					{
					match(input,68,FOLLOW_68_in_assignmentOperator1208); 
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:189:9: '%='
					{
					match(input,44,FOLLOW_44_in_assignmentOperator1218); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:190:10: '<' '<' '='
					{
					match(input,60,FOLLOW_60_in_assignmentOperator1229); 
					match(input,60,FOLLOW_60_in_assignmentOperator1231); 
					match(input,61,FOLLOW_61_in_assignmentOperator1233); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:191:10: '>' '>' '>' '='
					{
					match(input,63,FOLLOW_63_in_assignmentOperator1244); 
					match(input,63,FOLLOW_63_in_assignmentOperator1246); 
					match(input,63,FOLLOW_63_in_assignmentOperator1248); 
					match(input,61,FOLLOW_61_in_assignmentOperator1250); 
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:192:10: '>' '>' '='
					{
					match(input,63,FOLLOW_63_in_assignmentOperator1261); 
					match(input,63,FOLLOW_63_in_assignmentOperator1263); 
					match(input,61,FOLLOW_61_in_assignmentOperator1265); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignmentOperator"



	// $ANTLR start "conditionalExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:196:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' conditionalExpression )? ;
	public final void conditionalExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:197:5: ( conditionalOrExpression ( '?' expression ':' conditionalExpression )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:197:9: conditionalOrExpression ( '?' expression ':' conditionalExpression )?
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression1286);
			conditionalOrExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:198:9: ( '?' expression ':' conditionalExpression )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==64) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:198:10: '?' expression ':' conditionalExpression
					{
					match(input,64,FOLLOW_64_in_conditionalExpression1297); 
					pushFollow(FOLLOW_expression_in_conditionalExpression1299);
					expression();
					state._fsp--;

					match(input,59,FOLLOW_59_in_conditionalExpression1301); 
					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression1303);
					conditionalExpression();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "conditionalOrExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:202:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final void conditionalOrExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:203:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:203:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1334);
			conditionalAndExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:204:9: ( '||' conditionalAndExpression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==76) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:204:10: '||' conditionalAndExpression
					{
					match(input,76,FOLLOW_76_in_conditionalOrExpression1345); 
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1347);
					conditionalAndExpression();
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:208:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final void conditionalAndExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:209:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:209:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression1378);
			inclusiveOrExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:210:9: ( '&&' inclusiveOrExpression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==45) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:210:10: '&&' inclusiveOrExpression
					{
					match(input,45,FOLLOW_45_in_conditionalAndExpression1389); 
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression1391);
					inclusiveOrExpression();
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:214:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final void inclusiveOrExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:215:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:215:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1422);
			exclusiveOrExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:216:9: ( '|' exclusiveOrExpression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==74) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:216:10: '|' exclusiveOrExpression
					{
					match(input,74,FOLLOW_74_in_inclusiveOrExpression1433); 
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1435);
					exclusiveOrExpression();
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:220:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final void exclusiveOrExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:221:5: ( andExpression ( '^' andExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:221:9: andExpression ( '^' andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression1466);
			andExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:222:9: ( '^' andExpression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==67) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:222:10: '^' andExpression
					{
					match(input,67,FOLLOW_67_in_exclusiveOrExpression1477); 
					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression1479);
					andExpression();
					state._fsp--;

					}
					break;

				default :
					break loop34;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:226:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final void andExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:227:5: ( equalityExpression ( '&' equalityExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:227:9: equalityExpression ( '&' equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_andExpression1510);
			equalityExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:228:9: ( '&' equalityExpression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==46) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:228:10: '&' equalityExpression
					{
					match(input,46,FOLLOW_46_in_andExpression1521); 
					pushFollow(FOLLOW_equalityExpression_in_andExpression1523);
					equalityExpression();
					state._fsp--;

					}
					break;

				default :
					break loop35;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:232:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:233:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:233:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression1554);
			instanceOfExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:234:9: ( ( '==' | '!=' ) instanceOfExpression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==42||LA36_0==62) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:235:13: ( '==' | '!=' ) instanceOfExpression
					{
					if ( input.LA(1)==42||input.LA(1)==62 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression1631);
					instanceOfExpression();
					state._fsp--;

					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "instanceOfExpression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:242:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final void instanceOfExpression() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:243:5: ( relationalExpression ( 'instanceof' type )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:243:9: relationalExpression ( 'instanceof' type )?
			{
			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression1662);
			relationalExpression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:244:9: ( 'instanceof' type )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==71) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/XL.g:244:10: 'instanceof' type
					{
					match(input,71,FOLLOW_71_in_instanceOfExpression1673); 
					pushFollow(FOLLOW_type_in_instanceOfExpression1675);
					type();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instanceOfExpression"

	// Delegated rules



	public static final BitSet FOLLOW_variable_in_program41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_TYPE_in_constant51 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000360L});
	public static final BitSet FOLLOW_type_in_constant53 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_constant55 = new BitSet(new long[]{0x2020000400000000L});
	public static final BitSet FOLLOW_53_in_constant58 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_constant60 = new BitSet(new long[]{0x2020000400000000L});
	public static final BitSet FOLLOW_61_in_constant65 = new BitSet(new long[]{0x2000000400000000L});
	public static final BitSet FOLLOW_expression_in_constant67 = new BitSet(new long[]{0x2000000400000000L});
	public static final BitSet FOLLOW_SEMI_in_constant71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_TYPE_in_variable84 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000360L});
	public static final BitSet FOLLOW_type_in_variable88 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable98 = new BitSet(new long[]{0x0020000400000000L});
	public static final BitSet FOLLOW_53_in_variable109 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable111 = new BitSet(new long[]{0x0020000400000000L});
	public static final BitSet FOLLOW_SEMI_in_variable123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclarator141 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_variableDeclarator152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_variableDeclarator154 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_variableDeclarator176 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_type239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_type249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_type259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_type269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement312 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_expression_in_ifStatement314 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_THEN_in_ifStatement316 = new BitSet(new long[]{0x0000008010300000L});
	public static final BitSet FOLLOW_statement_in_ifStatement318 = new BitSet(new long[]{0x0000008010300E00L});
	public static final BitSet FOLLOW_ELSE_IF_in_ifStatement324 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_expression_in_ifStatement326 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_THEN_in_ifStatement328 = new BitSet(new long[]{0x0000008010300000L});
	public static final BitSet FOLLOW_statement_in_ifStatement330 = new BitSet(new long[]{0x0000008010300E00L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement338 = new BitSet(new long[]{0x0000008010300000L});
	public static final BitSet FOLLOW_statement_in_ifStatement340 = new BitSet(new long[]{0x0000008010300800L});
	public static final BitSet FOLLOW_END_in_ifStatement347 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IF_in_ifStatement349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement360 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_expression_in_whileStatement362 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_loopStatement_in_whileStatement364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOP_in_loopStatement376 = new BitSet(new long[]{0x0000008010301800L});
	public static final BitSet FOLLOW_statement_in_loopStatement379 = new BitSet(new long[]{0x0000008010301800L});
	public static final BitSet FOLLOW_exitStatement_in_loopStatement381 = new BitSet(new long[]{0x0000008010301800L});
	public static final BitSet FOLLOW_END_in_loopStatement385 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LOOP_in_loopStatement387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXIT_in_exitStatement399 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WHEN_in_exitStatement401 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_expression_in_exitStatement403 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SEMI_in_exitStatement405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStatement417 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_assignmentStatement419 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement421 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SEMI_in_assignmentStatement423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function437 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_function439 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LEFTPAREN_in_function441 = new BitSet(new long[]{0x0000000200100000L,0x0000000000000360L});
	public static final BitSet FOLLOW_parameters_in_function442 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RIGHTPAREN_in_function445 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_function447 = new BitSet(new long[]{0x000000A010300800L});
	public static final BitSet FOLLOW_variable_in_function452 = new BitSet(new long[]{0x000000A010300800L});
	public static final BitSet FOLLOW_statement_in_function459 = new BitSet(new long[]{0x0000008010300800L});
	public static final BitSet FOLLOW_END_in_function464 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_function466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameters480 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_parameters483 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000360L});
	public static final BitSet FOLLOW_parameter_in_parameters485 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_in_parameter499 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_parameter501 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_parameter505 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_expression_in_parameter507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTPAREN_in_term529 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_term531 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RIGHTPAREN_in_term533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_term538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_term543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_negation555 = new BitSet(new long[]{0x0000020004508000L});
	public static final BitSet FOLLOW_term_in_negation558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_unaryExpression576 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unaryExpression589 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unaryExpression601 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unaryExpression613 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_unaryExpressionNotPlusMinus645 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpressionNotPlusMinus657 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression679 = new BitSet(new long[]{0x9000000000000002L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression690 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression692 = new BitSet(new long[]{0x9000000000000002L});
	public static final BitSet FOLLOW_60_in_relationalOp724 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_relationalOp726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_relationalOp737 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_relationalOp739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_relationalOp749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_relationalOp759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression779 = new BitSet(new long[]{0x9000000000000002L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression790 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression792 = new BitSet(new long[]{0x9000000000000002L});
	public static final BitSet FOLLOW_60_in_shiftOp825 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_shiftOp827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_shiftOp838 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_shiftOp840 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_shiftOp842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_shiftOp853 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_shiftOp855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression876 = new BitSet(new long[]{0x0044000000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression903 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression953 = new BitSet(new long[]{0x0044000000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression991 = new BitSet(new long[]{0x0201080000000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression1018 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1086 = new BitSet(new long[]{0x0201080000000002L});
	public static final BitSet FOLLOW_61_in_assignmentOperator1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_assignmentOperator1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_assignmentOperator1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_assignmentOperator1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_assignmentOperator1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_assignmentOperator1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_assignmentOperator1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_assignmentOperator1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_assignmentOperator1229 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_assignmentOperator1231 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_assignmentOperator1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_assignmentOperator1244 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_assignmentOperator1246 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_assignmentOperator1248 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_assignmentOperator1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_assignmentOperator1261 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_assignmentOperator1263 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_assignmentOperator1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression1286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_conditionalExpression1297 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression1299 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_conditionalExpression1301 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_conditionalOrExpression1345 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression1378 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_conditionalAndExpression1389 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression1391 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_inclusiveOrExpression1433 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_exclusiveOrExpression1477 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression1479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression1510 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_andExpression1521 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression1523 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression1554 = new BitSet(new long[]{0x4000040000000002L});
	public static final BitSet FOLLOW_set_in_equalityExpression1581 = new BitSet(new long[]{0x00CC020000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression1631 = new BitSet(new long[]{0x4000040000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression1662 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_instanceOfExpression1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000360L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression1675 = new BitSet(new long[]{0x0000000000000002L});
}
