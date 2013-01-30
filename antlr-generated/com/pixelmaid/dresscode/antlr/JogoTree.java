// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g 2013-01-30 17:12:45

  package com.pixelmaid.dresscode.antlr;
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.antlr.types.*;
  


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JogoTree extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "CHARLITERAL", "COMMENT", 
		"DOUBLELITERAL", "DoubleSuffix", "ELSEIF_STATEMENT", "ELSE_STATEMENT", 
		"EscapeSequence", "Exponent", "FLOATLITERAL", "FUNC_CALL", "FUNC_DECL", 
		"FloatSuffix", "HexDigit", "HexPrefix", "IDENT", "IF_STATEMENT", "INTLITERAL", 
		"IntegerNumber", "LONGLITERAL", "LongSuffix", "MULTILINE_COMMENT", "NEGATION", 
		"NonIntegerNumber", "PARAM", "POSTDECREMENT", "POSTINCREMENT", "PROGRAM", 
		"STRINGLITERAL", "VAR_CALL", "VAR_DECL", "WS", "'!='", "'%'", "'('", "')'", 
		"'*'", "'+'", "'++'", "','", "'-'", "'--'", "'/'", "';'", "'<'", "'<='", 
		"'='", "'=='", "'>'", "'>='", "'['", "']'", "'and'", "'boolean'", "'char'", 
		"'constant'", "'double'", "'else'", "'elseif'", "'end'", "'exit'", "'float'", 
		"'function'", "'if'", "'int'", "'list'", "'long'", "'loop'", "'or'", "'program'", 
		"'return'", "'string'", "'then'", "'var'", "'when'", "'while'"
	};
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public JogoTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public JogoTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JogoTree.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g"; }






	// $ANTLR start "program"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:21:1: program returns [int result] : ^( PROGRAM ( atom )* ( function )* ) ;
	public final int program() throws RecognitionException {
		int result = 0;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:2: ( ^( PROGRAM ( atom )* ( function )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:4: ^( PROGRAM ( atom )* ( function )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program63); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:14: ( atom )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==FUNC_CALL||LA1_0==IF_STATEMENT||LA1_0==VAR_DECL||LA1_0==50||LA1_0==69||LA1_0==71||LA1_0==79) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:14: atom
						{
						pushFollow(FOLLOW_atom_in_program65);
						atom();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:20: ( function )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==FUNC_DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:22:20: function
						{
						pushFollow(FOLLOW_function_in_program68);
						function();
						state._fsp--;

						}
						break;

					default :
						break loop2;
					}
				}

				match(input, Token.UP, null); 
			}

			 result = 1; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "program"



	// $ANTLR start "atom"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:25:1: atom : ( variable | statement | typeDecl ) ;
	public final void atom() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:26:2: ( ( variable | statement | typeDecl ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:26:4: ( variable | statement | typeDecl )
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:26:4: ( variable | statement | typeDecl )
			int alt3=3;
			switch ( input.LA(1) ) {
			case VAR_DECL:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
			case IF_STATEMENT:
			case 50:
			case 71:
			case 79:
				{
				alt3=2;
				}
				break;
			case 69:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:26:5: variable
					{
					pushFollow(FOLLOW_variable_in_atom84);
					variable();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:27:4: statement
					{
					pushFollow(FOLLOW_statement_in_atom90);
					statement();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:28:4: typeDecl
					{
					pushFollow(FOLLOW_typeDecl_in_atom96);
					typeDecl();
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
	// $ANTLR end "atom"



	// $ANTLR start "function"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:31:1: function : ^( FUNC_DECL IDENT ( atom )* ( parameters[$IDENT.text] )? ( returnStatement )* ) ;
	public final void function() throws RecognitionException {
		CommonTree IDENT1=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:2: ( ^( FUNC_DECL IDENT ( atom )* ( parameters[$IDENT.text] )? ( returnStatement )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:5: ^( FUNC_DECL IDENT ( atom )* ( parameters[$IDENT.text] )? ( returnStatement )* )
			{
			match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_function111); 
			match(input, Token.DOWN, null); 
			IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function113); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:23: ( atom )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==69) ) {
					int LA4_2 = input.LA(2);
					if ( (LA4_2==IDENT||LA4_2==57||LA4_2==65||(LA4_2 >= 68 && LA4_2 <= 69)||LA4_2==75) ) {
						alt4=1;
					}

				}
				else if ( (LA4_0==FUNC_CALL||LA4_0==IF_STATEMENT||LA4_0==VAR_DECL||LA4_0==50||LA4_0==71||LA4_0==79) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:24: atom
					{
					pushFollow(FOLLOW_atom_in_function116);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:31: ( parameters[$IDENT.text] )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENT||LA5_0==57||LA5_0==65||(LA5_0 >= 68 && LA5_0 <= 69)||LA5_0==75) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:31: parameters[$IDENT.text]
					{
					pushFollow(FOLLOW_parameters_in_function120);
					parameters((IDENT1!=null?IDENT1.getText():null));
					state._fsp--;

					}
					break;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:56: ( returnStatement )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==74) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:32:57: returnStatement
					{
					pushFollow(FOLLOW_returnStatement_in_function125);
					returnStatement();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 

			 
					 
				SemanticManager.functions.put((IDENT1!=null?IDENT1.getText():null), new FunctionType((IDENT1!=null?IDENT1.getText():null)));
				System.out.println("declared function "+ (IDENT1!=null?IDENT1.getText():null));
				
				
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:41:1: parameters[String funcName] : parameter[funcName] ( ',' parameter[funcName] )* ;
	public final void parameters(String funcName) throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:42:2: ( parameter[funcName] ( ',' parameter[funcName] )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:42:4: parameter[funcName] ( ',' parameter[funcName] )*
			{
			pushFollow(FOLLOW_parameter_in_parameters144);
			parameter(funcName);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:42:24: ( ',' parameter[funcName] )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==43) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:42:25: ',' parameter[funcName]
					{
					match(input,43,FOLLOW_43_in_parameters148); 
					pushFollow(FOLLOW_parameter_in_parameters150);
					parameter(funcName);
					state._fsp--;

					}
					break;

				default :
					break loop7;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:45:1: parameter[String funcName] : ^( type IDENT ) ;
	public final void parameter(String funcName) throws RecognitionException {
		CommonTree IDENT2=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:46:2: ( ^( type IDENT ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:46:4: ^( type IDENT )
			{
			pushFollow(FOLLOW_type_in_parameter167);
			type();
			state._fsp--;

			match(input, Token.DOWN, null); 
			IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameter169); 
			match(input, Token.UP, null); 


				System.out.println("declared parameter "+ (IDENT2!=null?IDENT2.getText():null)+  "for function "+funcName);
				
				
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



	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:52:1: statement returns [boolean result] : ( assignmentStatement | ifStatement | loopStatement | whileStatement | functionCallStatement );
	public final boolean statement() throws RecognitionException {
		boolean result = false;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:53:2: ( assignmentStatement | ifStatement | loopStatement | whileStatement | functionCallStatement )
			int alt8=5;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt8=1;
				}
				break;
			case IF_STATEMENT:
				{
				alt8=2;
				}
				break;
			case 71:
				{
				alt8=3;
				}
				break;
			case 79:
				{
				alt8=4;
				}
				break;
			case FUNC_CALL:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:53:4: assignmentStatement
					{
					pushFollow(FOLLOW_assignmentStatement_in_statement188);
					assignmentStatement();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:54:4: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement193);
					ifStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:55:4: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement198);
					loopStatement();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:56:4: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement203);
					whileStatement();
					state._fsp--;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:57:4: functionCallStatement
					{
					pushFollow(FOLLOW_functionCallStatement_in_statement208);
					functionCallStatement();
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
		return result;
	}
	// $ANTLR end "statement"



	// $ANTLR start "functionCallStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:61:1: functionCallStatement : ^( FUNC_CALL IDENT ( actualParameters )? ) ;
	public final void functionCallStatement() throws RecognitionException {

			//scopes.add(scopes.size()-1,FUNC_

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:65:2: ( ^( FUNC_CALL IDENT ( actualParameters )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:65:4: ^( FUNC_CALL IDENT ( actualParameters )? )
			{
			match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCallStatement226); 
			match(input, Token.DOWN, null); 
			match(input,IDENT,FOLLOW_IDENT_in_functionCallStatement228); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:65:22: ( actualParameters )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BOOLEAN||(LA9_0 >= FLOATLITERAL && LA9_0 <= FUNC_CALL)||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==NEGATION||(LA9_0 >= POSTDECREMENT && LA9_0 <= POSTINCREMENT)||LA9_0==STRINGLITERAL||(LA9_0 >= 36 && LA9_0 <= 37)||(LA9_0 >= 40 && LA9_0 <= 41)||LA9_0==44||LA9_0==46||(LA9_0 >= 48 && LA9_0 <= 49)||(LA9_0 >= 51 && LA9_0 <= 53)||LA9_0==56||LA9_0==72) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:65:22: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_functionCallStatement230);
					actualParameters();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "functionCallStatement"



	// $ANTLR start "actualParameters"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:73:1: actualParameters : actualParameter ( ',' actualParameter )* ;
	public final void actualParameters() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:74:2: ( actualParameter ( ',' actualParameter )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:74:5: actualParameter ( ',' actualParameter )*
			{
			pushFollow(FOLLOW_actualParameter_in_actualParameters253);
			actualParameter();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:74:21: ( ',' actualParameter )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==43) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:74:22: ',' actualParameter
					{
					match(input,43,FOLLOW_43_in_actualParameters256); 
					pushFollow(FOLLOW_actualParameter_in_actualParameters258);
					actualParameter();
					state._fsp--;

					}
					break;

				default :
					break loop10;
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
	// $ANTLR end "actualParameters"



	// $ANTLR start "actualParameter"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:77:1: actualParameter : ( expression ) ;
	public final void actualParameter() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:78:2: ( ( expression ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:78:4: ( expression )
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:78:4: ( expression )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:78:5: expression
			{
			pushFollow(FOLLOW_expression_in_actualParameter273);
			expression();
			state._fsp--;

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
	// $ANTLR end "actualParameter"



	// $ANTLR start "returnStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:81:1: returnStatement : 'return' expression ';' ;
	public final void returnStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:82:2: ( 'return' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:82:3: 'return' expression ';'
			{
			match(input,74,FOLLOW_74_in_returnStatement285); 
			pushFollow(FOLLOW_expression_in_returnStatement287);
			expression();
			state._fsp--;

			match(input,47,FOLLOW_47_in_returnStatement289); 
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
	// $ANTLR end "returnStatement"



	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:85:1: ifStatement returns [boolean result] : ^( IF_STATEMENT e1= expression {...}? => (s1= statement )* ( ELSEIF_STATEMENT e2= expression (s2= statement )* )* ( ELSE_STATEMENT (e3= statement )* )? ) ;
	public final boolean ifStatement() throws RecognitionException {
		boolean result = false;


		PrimObject e1 =null;
		boolean s1 =false;
		PrimObject e2 =null;
		boolean s2 =false;
		boolean e3 =false;


		System.out.println("found if statement");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:2: ( ^( IF_STATEMENT e1= expression {...}? => (s1= statement )* ( ELSEIF_STATEMENT e2= expression (s2= statement )* )* ( ELSE_STATEMENT (e3= statement )* )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:4: ^( IF_STATEMENT e1= expression {...}? => (s1= statement )* ( ELSEIF_STATEMENT e2= expression (s2= statement )* )* ( ELSE_STATEMENT (e3= statement )* )? )
			{
			match(input,IF_STATEMENT,FOLLOW_IF_STATEMENT_in_ifStatement310); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStatement314);
			e1=expression();
			state._fsp--;

			if ( !(((Boolean)e1.result)) ) {
				throw new FailedPredicateException(input, "ifStatement", "(Boolean)e1.result");
			}
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:59: (s1= statement )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==FUNC_CALL||LA11_0==IF_STATEMENT||LA11_0==50||LA11_0==71||LA11_0==79) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:59: s1= statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement321);
					s1=statement();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:71: ( ELSEIF_STATEMENT e2= expression (s2= statement )* )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ELSEIF_STATEMENT) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:72: ELSEIF_STATEMENT e2= expression (s2= statement )*
					{
					match(input,ELSEIF_STATEMENT,FOLLOW_ELSEIF_STATEMENT_in_ifStatement325); 
					pushFollow(FOLLOW_expression_in_ifStatement329);
					e2=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:105: (s2= statement )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==FUNC_CALL||LA12_0==IF_STATEMENT||LA12_0==50||LA12_0==71||LA12_0==79) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:105: s2= statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement333);
							s2=statement();
							state._fsp--;

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

				default :
					break loop13;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:119: ( ELSE_STATEMENT (e3= statement )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ELSE_STATEMENT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:120: ELSE_STATEMENT (e3= statement )*
					{
					match(input,ELSE_STATEMENT,FOLLOW_ELSE_STATEMENT_in_ifStatement339); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:137: (e3= statement )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==FUNC_CALL||LA14_0==IF_STATEMENT||LA14_0==50||LA14_0==71||LA14_0==79) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:89:137: e3= statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement343);
							e3=statement();
							state._fsp--;

							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			match(input, Token.UP, null); 

			if ((Boolean)e1.result){
					System.out.println("if Statement is true");
					}
					else{
					System.out.println("if Statement is false");
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
		return result;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:101:1: whileStatement : 'while' expression loopStatement ;
	public final void whileStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:102:2: ( 'while' expression loopStatement )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:102:3: 'while' expression loopStatement
			{
			match(input,79,FOLLOW_79_in_whileStatement363); 
			pushFollow(FOLLOW_expression_in_whileStatement365);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_loopStatement_in_whileStatement367);
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:105:1: loopStatement : 'loop' ( statement | exitStatement )* 'end' 'loop' ;
	public final void loopStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:106:2: ( 'loop' ( statement | exitStatement )* 'end' 'loop' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:106:4: 'loop' ( statement | exitStatement )* 'end' 'loop'
			{
			match(input,71,FOLLOW_71_in_loopStatement379); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:106:11: ( statement | exitStatement )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==FUNC_CALL||LA16_0==IF_STATEMENT||LA16_0==50||LA16_0==71||LA16_0==79) ) {
					alt16=1;
				}
				else if ( (LA16_0==64) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:106:12: statement
					{
					pushFollow(FOLLOW_statement_in_loopStatement382);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:106:22: exitStatement
					{
					pushFollow(FOLLOW_exitStatement_in_loopStatement384);
					exitStatement();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,63,FOLLOW_63_in_loopStatement388); 
			match(input,71,FOLLOW_71_in_loopStatement390); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:109:1: exitStatement : 'exit' 'when' expression ';' ;
	public final void exitStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:110:2: ( 'exit' 'when' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:110:4: 'exit' 'when' expression ';'
			{
			match(input,64,FOLLOW_64_in_exitStatement402); 
			match(input,78,FOLLOW_78_in_exitStatement404); 
			pushFollow(FOLLOW_expression_in_exitStatement406);
			expression();
			state._fsp--;

			match(input,47,FOLLOW_47_in_exitStatement408); 
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:113:1: assignmentStatement returns [boolean result] : ^( '=' IDENT expression ) ;
	public final boolean assignmentStatement() throws RecognitionException {
		boolean result = false;


		CommonTree IDENT3=null;
		PrimObject expression4 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:114:2: ( ^( '=' IDENT expression ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:114:4: ^( '=' IDENT expression )
			{
			match(input,50,FOLLOW_50_in_assignmentStatement425); 
			match(input, Token.DOWN, null); 
			IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement427); 
			pushFollow(FOLLOW_expression_in_assignmentStatement429);
			expression4=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			result = SemanticManager.setPrimVar((IDENT3!=null?IDENT3.getText():null),expression4);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "assignmentStatement"



	// $ANTLR start "variable"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:119:1: variable : ^( VAR_DECL type variableDeclarator[$type.text] ( variableDeclarator[$type.text] )* ) ;
	public final void variable() throws RecognitionException {
		int type5 =0;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:121:2: ( ^( VAR_DECL type variableDeclarator[$type.text] ( variableDeclarator[$type.text] )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:121:3: ^( VAR_DECL type variableDeclarator[$type.text] ( variableDeclarator[$type.text] )* )
			{
			match(input,VAR_DECL,FOLLOW_VAR_DECL_in_variable450); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_variable452);
			type5=type();
			state._fsp--;

			pushFollow(FOLLOW_variableDeclarator_in_variable454);
			variableDeclarator(type5);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:121:50: ( variableDeclarator[$type.text] )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==IDENT||LA17_0==50) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:121:51: variableDeclarator[$type.text]
					{
					pushFollow(FOLLOW_variableDeclarator_in_variable458);
					variableDeclarator(type5);
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			match(input, Token.UP, null); 

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:124:1: variableDeclarator[int type] : ( ^( '=' IDENT expression ) | IDENT );
	public final void variableDeclarator(int type) throws RecognitionException {
		CommonTree IDENT6=null;
		CommonTree IDENT8=null;
		PrimObject expression7 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:125:5: ( ^( '=' IDENT expression ) | IDENT )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==50) ) {
				alt18=1;
			}
			else if ( (LA18_0==IDENT) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:125:8: ^( '=' IDENT expression )
					{
					match(input,50,FOLLOW_50_in_variableDeclarator481); 
					match(input, Token.DOWN, null); 
					IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator483); 
					pushFollow(FOLLOW_expression_in_variableDeclarator485);
					expression7=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 SemanticManager.declarePrimVar(type,(IDENT6!=null?IDENT6.getText():null),expression7); 
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:126:7: IDENT
					{
					IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator496); 
					SemanticManager.declarePrimVar(type,(IDENT8!=null?IDENT8.getText():null),null);
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
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "typeDecl"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:130:1: typeDecl : array ';' ;
	public final void typeDecl() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:131:3: ( array ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:131:5: array ';'
			{
			pushFollow(FOLLOW_array_in_typeDecl518);
			array();
			state._fsp--;

			match(input,47,FOLLOW_47_in_typeDecl523); 
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
	// $ANTLR end "typeDecl"



	// $ANTLR start "array"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:135:2: array : arrayType type arrayDeclarator ( ',' arrayDeclarator )* ;
	public final void array() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:136:3: ( arrayType type arrayDeclarator ( ',' arrayDeclarator )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:136:4: arrayType type arrayDeclarator ( ',' arrayDeclarator )*
			{
			pushFollow(FOLLOW_arrayType_in_array538);
			arrayType();
			state._fsp--;

			pushFollow(FOLLOW_type_in_array543);
			type();
			state._fsp--;

			pushFollow(FOLLOW_arrayDeclarator_in_array548);
			arrayDeclarator();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:139:4: ( ',' arrayDeclarator )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==43) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:139:5: ',' arrayDeclarator
					{
					match(input,43,FOLLOW_43_in_array554); 
					pushFollow(FOLLOW_arrayDeclarator_in_array556);
					arrayDeclarator();
					state._fsp--;

					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "array"



	// $ANTLR start "arrayDeclarator"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:143:2: arrayDeclarator : IDENT ( '=' arrayInitializer )? ;
	public final void arrayDeclarator() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:144:3: ( IDENT ( '=' arrayInitializer )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:144:6: IDENT ( '=' arrayInitializer )?
			{
			match(input,IDENT,FOLLOW_IDENT_in_arrayDeclarator578); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:145:4: ( '=' arrayInitializer )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==50) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:145:5: '=' arrayInitializer
					{
					match(input,50,FOLLOW_50_in_arrayDeclarator584); 
					pushFollow(FOLLOW_arrayInitializer_in_arrayDeclarator586);
					arrayInitializer();
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
	// $ANTLR end "arrayDeclarator"



	// $ANTLR start "arrayInitializer"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:149:2: arrayInitializer : '[' ( expression ) ( ',' ( expression ) )* ']' ;
	public final void arrayInitializer() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:150:3: ( '[' ( expression ) ( ',' ( expression ) )* ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:150:4: '[' ( expression ) ( ',' ( expression ) )* ']'
			{
			match(input,54,FOLLOW_54_in_arrayInitializer613); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:150:7: ( expression )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:150:8: expression
			{
			pushFollow(FOLLOW_expression_in_arrayInitializer615);
			expression();
			state._fsp--;

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:151:9: ( ',' ( expression ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==43) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:151:10: ',' ( expression )
					{
					match(input,43,FOLLOW_43_in_arrayInitializer627); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:151:14: ( expression )
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:151:15: expression
					{
					pushFollow(FOLLOW_expression_in_arrayInitializer630);
					expression();
					state._fsp--;

					}

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,55,FOLLOW_55_in_arrayInitializer638); 
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
	// $ANTLR end "arrayInitializer"



	// $ANTLR start "arrayCallStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:155:2: arrayCallStatement : IDENT '[' expression ']' ;
	public final void arrayCallStatement() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:156:3: ( IDENT '[' expression ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:156:5: IDENT '[' expression ']'
			{
			match(input,IDENT,FOLLOW_IDENT_in_arrayCallStatement654); 
			match(input,54,FOLLOW_54_in_arrayCallStatement656); 
			pushFollow(FOLLOW_expression_in_arrayCallStatement658);
			expression();
			state._fsp--;

			match(input,55,FOLLOW_55_in_arrayCallStatement660); 
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
	// $ANTLR end "arrayCallStatement"



	// $ANTLR start "term"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:160:2: term returns [PrimObject result] : ( IDENT | INTLITERAL | FLOATLITERAL | STRINGLITERAL | BOOLEAN | functionCallStatement | arrayCallStatement );
	public final PrimObject term() throws RecognitionException {
		PrimObject result = null;


		CommonTree IDENT9=null;
		CommonTree INTLITERAL10=null;
		CommonTree FLOATLITERAL11=null;
		CommonTree STRINGLITERAL12=null;
		CommonTree BOOLEAN13=null;


			
			
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:165:2: ( IDENT | INTLITERAL | FLOATLITERAL | STRINGLITERAL | BOOLEAN | functionCallStatement | arrayCallStatement )
			int alt22=7;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA22_1 = input.LA(2);
				if ( (LA22_1==54) ) {
					alt22=7;
				}
				else if ( ((LA22_1 >= UP && LA22_1 <= BOOLEAN)||(LA22_1 >= ELSEIF_STATEMENT && LA22_1 <= ELSE_STATEMENT)||(LA22_1 >= FLOATLITERAL && LA22_1 <= FUNC_CALL)||(LA22_1 >= IDENT && LA22_1 <= INTLITERAL)||LA22_1==NEGATION||(LA22_1 >= POSTDECREMENT && LA22_1 <= POSTINCREMENT)||LA22_1==STRINGLITERAL||(LA22_1 >= 36 && LA22_1 <= 37)||(LA22_1 >= 40 && LA22_1 <= 41)||(LA22_1 >= 43 && LA22_1 <= 44)||(LA22_1 >= 46 && LA22_1 <= 53)||(LA22_1 >= 55 && LA22_1 <= 56)||(LA22_1 >= 71 && LA22_1 <= 72)||LA22_1==79) ) {
					alt22=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTLITERAL:
				{
				alt22=2;
				}
				break;
			case FLOATLITERAL:
				{
				alt22=3;
				}
				break;
			case STRINGLITERAL:
				{
				alt22=4;
				}
				break;
			case BOOLEAN:
				{
				alt22=5;
				}
				break;
			case FUNC_CALL:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:165:4: IDENT
					{
					IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_term686); 
					result = SemanticManager.getPrimVar((IDENT9!=null?IDENT9.getText():null));
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:166:4: INTLITERAL
					{
					INTLITERAL10=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_term693); 
					result = SemanticManager.parseInt((INTLITERAL10!=null?INTLITERAL10.getText():null));
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:167:4: FLOATLITERAL
					{
					FLOATLITERAL11=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_term700); 
					result = SemanticManager.parseFloat((FLOATLITERAL11!=null?FLOATLITERAL11.getText():null));
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:168:4: STRINGLITERAL
					{
					STRINGLITERAL12=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_term706); 
					result = SemanticManager.parseString((STRINGLITERAL12!=null?STRINGLITERAL12.getText():null));
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:169:4: BOOLEAN
					{
					BOOLEAN13=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term712); 
					result = SemanticManager.parseBool((BOOLEAN13!=null?BOOLEAN13.getText():null));
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:170:4: functionCallStatement
					{
					pushFollow(FOLLOW_functionCallStatement_in_term719);
					functionCallStatement();
					state._fsp--;

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:171:4: arrayCallStatement
					{
					pushFollow(FOLLOW_arrayCallStatement_in_term724);
					arrayCallStatement();
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

					System.out.println("term result = "+result.getResult() +", "+ result.getType());
				
				
		}
		return result;
	}
	// $ANTLR end "term"



	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:181:1: expression returns [PrimObject result] : ( ^( NEGATION op1= expression ) | ^( POSTINCREMENT op1= expression ) | ^( POSTDECREMENT op1= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( 'and' op1= expression op2= expression ) | ^( 'or' op1= expression op2= expression ) |op1= term );
	public final PrimObject expression() throws RecognitionException {
		PrimObject result = null;


		PrimObject op1 =null;
		PrimObject op2 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:183:2: ( ^( NEGATION op1= expression ) | ^( POSTINCREMENT op1= expression ) | ^( POSTDECREMENT op1= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( 'and' op1= expression op2= expression ) | ^( 'or' op1= expression op2= expression ) |op1= term )
			int alt23=17;
			switch ( input.LA(1) ) {
			case NEGATION:
				{
				alt23=1;
				}
				break;
			case POSTINCREMENT:
				{
				alt23=2;
				}
				break;
			case POSTDECREMENT:
				{
				alt23=3;
				}
				break;
			case 40:
				{
				alt23=4;
				}
				break;
			case 46:
				{
				alt23=5;
				}
				break;
			case 37:
				{
				alt23=6;
				}
				break;
			case 41:
				{
				alt23=7;
				}
				break;
			case 44:
				{
				alt23=8;
				}
				break;
			case 51:
				{
				alt23=9;
				}
				break;
			case 36:
				{
				alt23=10;
				}
				break;
			case 48:
				{
				alt23=11;
				}
				break;
			case 49:
				{
				alt23=12;
				}
				break;
			case 52:
				{
				alt23=13;
				}
				break;
			case 53:
				{
				alt23=14;
				}
				break;
			case 56:
				{
				alt23=15;
				}
				break;
			case 72:
				{
				alt23=16;
				}
				break;
			case BOOLEAN:
			case FLOATLITERAL:
			case FUNC_CALL:
			case IDENT:
			case INTLITERAL:
			case STRINGLITERAL:
				{
				alt23=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:183:3: ^( NEGATION op1= expression )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expression752); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression756);
					op1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = SemanticManager.negation(op1);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:184:3: ^( POSTINCREMENT op1= expression )
					{
					match(input,POSTINCREMENT,FOLLOW_POSTINCREMENT_in_expression764); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression768);
					op1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = SemanticManager.postIncrement(op1);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:185:6: ^( POSTDECREMENT op1= expression )
					{
					match(input,POSTDECREMENT,FOLLOW_POSTDECREMENT_in_expression779); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression783);
					op1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = SemanticManager.postDecrement(op1);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:186:6: ^( '*' op1= expression op2= expression )
					{
					match(input,40,FOLLOW_40_in_expression794); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression798);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression802);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.multiplication(op1,op2); 
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:187:3: ^( '/' op1= expression op2= expression )
					{
					match(input,46,FOLLOW_46_in_expression810); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression814);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression818);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.division(op1,op2); 
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:188:3: ^( '%' op1= expression op2= expression )
					{
					match(input,37,FOLLOW_37_in_expression826); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression830);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression834);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.modulo(op1,op2); 
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:189:3: ^( '+' op1= expression op2= expression )
					{
					match(input,41,FOLLOW_41_in_expression842); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression846);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression850);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.addition(op1,op2); 
					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:190:3: ^( '-' op1= expression op2= expression )
					{
					match(input,44,FOLLOW_44_in_expression858); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression862);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression866);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.subtraction(op1,op2);
					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:191:3: ^( '==' op1= expression op2= expression )
					{
					match(input,51,FOLLOW_51_in_expression875); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression879);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression883);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.equality(op1,op2); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:192:3: ^( '!=' op1= expression op2= expression )
					{
					match(input,36,FOLLOW_36_in_expression891); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression895);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression899);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.nonEquality(op1,op2); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:193:3: ^( '<' op1= expression op2= expression )
					{
					match(input,48,FOLLOW_48_in_expression907); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression911);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression915);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.lessThan(op1,op2); 
					}
					break;
				case 12 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:194:3: ^( '<=' op1= expression op2= expression )
					{
					match(input,49,FOLLOW_49_in_expression923); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression927);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression931);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.lessThanEqual(op1,op2); 
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:195:3: ^( '>' op1= expression op2= expression )
					{
					match(input,52,FOLLOW_52_in_expression939); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression943);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression947);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.greaterThan(op1,op2); 
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:196:3: ^( '>=' op1= expression op2= expression )
					{
					match(input,53,FOLLOW_53_in_expression955); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression959);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression963);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.greaterThanEqual(op1,op2); 
					}
					break;
				case 15 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:197:3: ^( 'and' op1= expression op2= expression )
					{
					match(input,56,FOLLOW_56_in_expression971); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression975);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression979);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.andCheck(op1,op2); 
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:198:3: ^( 'or' op1= expression op2= expression )
					{
					match(input,72,FOLLOW_72_in_expression987); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression991);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression995);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = SemanticManager.orCheck(op1,op2); 
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:199:4: op1= term
					{
					pushFollow(FOLLOW_term_in_expression1007);
					op1=term();
					state._fsp--;

					result = op1;
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

					System.out.println("expression result = "+result.getResult() +", "+ result.getType());
				
				
		}
		return result;
	}
	// $ANTLR end "expression"



	// $ANTLR start "typeSpec"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:206:1: typeSpec : arrayType ;
	public final void typeSpec() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:207:2: ( arrayType )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:207:4: arrayType
			{
			pushFollow(FOLLOW_arrayType_in_typeSpec1025);
			arrayType();
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
	// $ANTLR end "typeSpec"



	// $ANTLR start "arrayType"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:210:1: arrayType : 'list' ;
	public final void arrayType() throws RecognitionException {
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:211:2: ( 'list' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:211:4: 'list'
			{
			match(input,69,FOLLOW_69_in_arrayType1037); 
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
	// $ANTLR end "arrayType"



	// $ANTLR start "type"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:214:1: type returns [int text] : ( 'int' | 'float' | 'boolean' | 'string' | typeSpec | IDENT );
	public final int type() throws RecognitionException {
		int text = 0;


		CommonTree IDENT14=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:215:2: ( 'int' | 'float' | 'boolean' | 'string' | typeSpec | IDENT )
			int alt24=6;
			switch ( input.LA(1) ) {
			case 68:
				{
				alt24=1;
				}
				break;
			case 65:
				{
				alt24=2;
				}
				break;
			case 57:
				{
				alt24=3;
				}
				break;
			case 75:
				{
				alt24=4;
				}
				break;
			case 69:
				{
				alt24=5;
				}
				break;
			case IDENT:
				{
				alt24=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:215:6: 'int'
					{
					match(input,68,FOLLOW_68_in_type1058); 
					text = SemanticManager.INTNUM;
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:216:9: 'float'
					{
					match(input,65,FOLLOW_65_in_type1070); 
					text = SemanticManager.FLOATNUM;
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:217:8: 'boolean'
					{
					match(input,57,FOLLOW_57_in_type1080); 
					text = SemanticManager.BOOLNUM;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:218:7: 'string'
					{
					match(input,75,FOLLOW_75_in_type1089); 
					text = SemanticManager.STRINGNUM;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:219:7: typeSpec
					{
					pushFollow(FOLLOW_typeSpec_in_type1098);
					typeSpec();
					state._fsp--;

					text = SemanticManager.ARRAYNUM;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/JogoTree.g:220:7: IDENT
					{
					IDENT14=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type1108); 
					text = Integer.valueOf((IDENT14!=null?IDENT14.getText():null));
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
		return text;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program63 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_program65 = new BitSet(new long[]{0x000400040010C008L,0x00000000000080A0L});
	public static final BitSet FOLLOW_function_in_program68 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_variable_in_atom84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_atom90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDecl_in_atom96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_DECL_in_function111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_function113 = new BitSet(new long[]{0x0204000400184008L,0x0000000000008CB2L});
	public static final BitSet FOLLOW_atom_in_function116 = new BitSet(new long[]{0x0204000400184008L,0x0000000000008CB2L});
	public static final BitSet FOLLOW_parameters_in_function120 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_returnStatement_in_function125 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_parameter_in_parameters144 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_parameters148 = new BitSet(new long[]{0x0200000000080000L,0x0000000000000832L});
	public static final BitSet FOLLOW_parameter_in_parameters150 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_type_in_parameter167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_parameter169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallStatement_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCallStatement226 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_functionCallStatement228 = new BitSet(new long[]{0x013B533164286018L,0x0000000000000100L});
	public static final BitSet FOLLOW_actualParameters_in_functionCallStatement230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_actualParameter_in_actualParameters253 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_actualParameters256 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_actualParameter_in_actualParameters258 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_expression_in_actualParameter273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_returnStatement285 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_returnStatement287 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_returnStatement289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_STATEMENT_in_ifStatement310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement314 = new BitSet(new long[]{0x0004000000104608L,0x0000000000008080L});
	public static final BitSet FOLLOW_statement_in_ifStatement321 = new BitSet(new long[]{0x0004000000104608L,0x0000000000008080L});
	public static final BitSet FOLLOW_ELSEIF_STATEMENT_in_ifStatement325 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_ifStatement329 = new BitSet(new long[]{0x0004000000104608L,0x0000000000008080L});
	public static final BitSet FOLLOW_statement_in_ifStatement333 = new BitSet(new long[]{0x0004000000104608L,0x0000000000008080L});
	public static final BitSet FOLLOW_ELSE_STATEMENT_in_ifStatement339 = new BitSet(new long[]{0x0004000000104008L,0x0000000000008080L});
	public static final BitSet FOLLOW_statement_in_ifStatement343 = new BitSet(new long[]{0x0004000000104008L,0x0000000000008080L});
	public static final BitSet FOLLOW_79_in_whileStatement363 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_whileStatement365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_loopStatement_in_whileStatement367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_loopStatement379 = new BitSet(new long[]{0x8004000000104000L,0x0000000000008081L});
	public static final BitSet FOLLOW_statement_in_loopStatement382 = new BitSet(new long[]{0x8004000000104000L,0x0000000000008081L});
	public static final BitSet FOLLOW_exitStatement_in_loopStatement384 = new BitSet(new long[]{0x8004000000104000L,0x0000000000008081L});
	public static final BitSet FOLLOW_63_in_loopStatement388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_loopStatement390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_exitStatement402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_exitStatement404 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_exitStatement406 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exitStatement408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_assignmentStatement425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStatement427 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECL_in_variable450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_variable452 = new BitSet(new long[]{0x0004000000080000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable454 = new BitSet(new long[]{0x0004000000080008L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable458 = new BitSet(new long[]{0x0004000000080008L});
	public static final BitSet FOLLOW_50_in_variableDeclarator481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclarator483 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_variableDeclarator485 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclarator496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_typeDecl518 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_typeDecl523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_array538 = new BitSet(new long[]{0x0200000000080000L,0x0000000000000832L});
	public static final BitSet FOLLOW_type_in_array543 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_array548 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_array554 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_array556 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_IDENT_in_arrayDeclarator578 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_arrayDeclarator584 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayDeclarator586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_arrayInitializer613 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_arrayInitializer615 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_arrayInitializer627 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_arrayInitializer630 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_arrayInitializer638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_arrayCallStatement654 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_arrayCallStatement656 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_arrayCallStatement658 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_arrayCallStatement660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_term693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_term700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_term706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_term712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallStatement_in_term719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCallStatement_in_term724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATION_in_expression752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POSTINCREMENT_in_expression764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression768 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POSTDECREMENT_in_expression779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_40_in_expression794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression798 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression802 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_46_in_expression810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression814 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_expression826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression830 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression834 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_41_in_expression842 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression846 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression850 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_44_in_expression858 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression862 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_51_in_expression875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression879 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression883 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expression891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression895 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression899 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_expression907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression911 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_49_in_expression923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression927 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression931 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_52_in_expression939 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression943 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression947 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_53_in_expression955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression959 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression963 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_56_in_expression971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression975 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_expression987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression991 = new BitSet(new long[]{0x013B533164286010L,0x0000000000000100L});
	public static final BitSet FOLLOW_expression_in_expression995 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_term_in_expression1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_typeSpec1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_arrayType1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_type1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_type1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_type1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_type1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeSpec_in_type1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_type1108 = new BitSet(new long[]{0x0000000000000002L});
}
