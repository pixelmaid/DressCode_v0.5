// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g 2013-02-08 14:19:32

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JogoParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:32:1: program : 'program' IDENT ( script )* 'end' IDENT -> ^( PROGRAM ( script )* ) ;
	public final JogoParser.program_return program() throws RecognitionException {
		JogoParser.program_return retval = new JogoParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token string_literal4=null;
		Token IDENT5=null;
		ParserRuleReturnScope script3 =null;

		Object string_literal1_tree=null;
		Object IDENT2_tree=null;
		Object string_literal4_tree=null;
		Object IDENT5_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_script=new RewriteRuleSubtreeStream(adaptor,"rule script");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:33:2: ( 'program' IDENT ( script )* 'end' IDENT -> ^( PROGRAM ( script )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:33:3: 'program' IDENT ( script )* 'end' IDENT
			{
			string_literal1=(Token)match(input,73,FOLLOW_73_in_program101);  
			stream_73.add(string_literal1);

			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program103);  
			stream_IDENT.add(IDENT2);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:34:4: ( script )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENT||LA1_0==59||(LA1_0 >= 66 && LA1_0 <= 67)||LA1_0==69||LA1_0==71||LA1_0==77||LA1_0==79) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:34:5: script
					{
					pushFollow(FOLLOW_script_in_program109);
					script3=script();
					state._fsp--;

					stream_script.add(script3.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			string_literal4=(Token)match(input,63,FOLLOW_63_in_program115);  
			stream_63.add(string_literal4);

			IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_program117);  
			stream_IDENT.add(IDENT5);

			// AST REWRITE
			// elements: script
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 35:15: -> ^( PROGRAM ( script )* )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:35:18: ^( PROGRAM ( script )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:35:28: ( script )*
				while ( stream_script.hasNext() ) {
					adaptor.addChild(root_1, stream_script.nextTree());
				}
				stream_script.reset();

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
	// $ANTLR end "program"


	public static class script_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "script"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:38:1: script : ( atom | function );
	public final JogoParser.script_return script() throws RecognitionException {
		JogoParser.script_return retval = new JogoParser.script_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom6 =null;
		ParserRuleReturnScope function7 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:39:2: ( atom | function )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IDENT||LA2_0==59||LA2_0==67||LA2_0==69||LA2_0==71||LA2_0==77||LA2_0==79) ) {
				alt2=1;
			}
			else if ( (LA2_0==66) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:39:3: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_script136);
					atom6=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom6.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:40:3: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_script140);
					function7=function();
					state._fsp--;

					adaptor.addChild(root_0, function7.getTree());

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
	// $ANTLR end "script"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:43:1: atom : ( variable | statement | typeDecl );
	public final JogoParser.atom_return atom() throws RecognitionException {
		JogoParser.atom_return retval = new JogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope variable8 =null;
		ParserRuleReturnScope statement9 =null;
		ParserRuleReturnScope typeDecl10 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:44:2: ( variable | statement | typeDecl )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 59:
			case 77:
				{
				alt3=1;
				}
				break;
			case IDENT:
			case 67:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:44:3: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_atom151);
					variable8=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable8.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:45:4: statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statement_in_atom157);
					statement9=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement9.getTree());

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:46:4: typeDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_typeDecl_in_atom163);
					typeDecl10=typeDecl();
					state._fsp--;

					adaptor.addChild(root_0, typeDecl10.getTree());

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


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:49:1: function : 'function' IDENT '(' ( parameters )? ')' ( atom )* ( returnStatement )* 'end' IDENT -> ^( FUNC_DECL IDENT ( parameters )? ( atom )* ( returnStatement )* ) ;
	public final JogoParser.function_return function() throws RecognitionException {
		JogoParser.function_return retval = new JogoParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal11=null;
		Token IDENT12=null;
		Token char_literal13=null;
		Token char_literal15=null;
		Token string_literal18=null;
		Token IDENT19=null;
		ParserRuleReturnScope parameters14 =null;
		ParserRuleReturnScope atom16 =null;
		ParserRuleReturnScope returnStatement17 =null;

		Object string_literal11_tree=null;
		Object IDENT12_tree=null;
		Object char_literal13_tree=null;
		Object char_literal15_tree=null;
		Object string_literal18_tree=null;
		Object IDENT19_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_returnStatement=new RewriteRuleSubtreeStream(adaptor,"rule returnStatement");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:2: ( 'function' IDENT '(' ( parameters )? ')' ( atom )* ( returnStatement )* 'end' IDENT -> ^( FUNC_DECL IDENT ( parameters )? ( atom )* ( returnStatement )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:4: 'function' IDENT '(' ( parameters )? ')' ( atom )* ( returnStatement )* 'end' IDENT
			{
			string_literal11=(Token)match(input,66,FOLLOW_66_in_function175);  
			stream_66.add(string_literal11);

			IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_function177);  
			stream_IDENT.add(IDENT12);

			char_literal13=(Token)match(input,38,FOLLOW_38_in_function179);  
			stream_38.add(char_literal13);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:25: ( parameters )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IDENT||(LA4_0 >= 57 && LA4_0 <= 58)||LA4_0==60||LA4_0==65||(LA4_0 >= 68 && LA4_0 <= 70)||LA4_0==75) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:50:25: parameters
					{
					pushFollow(FOLLOW_parameters_in_function181);
					parameters14=parameters();
					state._fsp--;

					stream_parameters.add(parameters14.getTree());
					}
					break;

			}

			char_literal15=(Token)match(input,39,FOLLOW_39_in_function184);  
			stream_39.add(char_literal15);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:51:3: ( atom )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==IDENT||LA5_0==59||LA5_0==67||LA5_0==69||LA5_0==71||LA5_0==77||LA5_0==79) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:51:4: atom
					{
					pushFollow(FOLLOW_atom_in_function189);
					atom16=atom();
					state._fsp--;

					stream_atom.add(atom16.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:52:3: ( returnStatement )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==74) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:52:4: returnStatement
					{
					pushFollow(FOLLOW_returnStatement_in_function196);
					returnStatement17=returnStatement();
					state._fsp--;

					stream_returnStatement.add(returnStatement17.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			string_literal18=(Token)match(input,63,FOLLOW_63_in_function202);  
			stream_63.add(string_literal18);

			IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_function204);  
			stream_IDENT.add(IDENT19);

			// AST REWRITE
			// elements: atom, IDENT, returnStatement, parameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:15: -> ^( FUNC_DECL IDENT ( parameters )? ( atom )* ( returnStatement )* )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:18: ^( FUNC_DECL IDENT ( parameters )? ( atom )* ( returnStatement )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:36: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:48: ( atom )*
				while ( stream_atom.hasNext() ) {
					adaptor.addChild(root_1, stream_atom.nextTree());
				}
				stream_atom.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:53:56: ( returnStatement )*
				while ( stream_returnStatement.hasNext() ) {
					adaptor.addChild(root_1, stream_returnStatement.nextTree());
				}
				stream_returnStatement.reset();

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
	// $ANTLR end "function"


	public static class parameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:56:1: parameters : parameter ( ',' parameter )* ;
	public final JogoParser.parameters_return parameters() throws RecognitionException {
		JogoParser.parameters_return retval = new JogoParser.parameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope parameter20 =null;
		ParserRuleReturnScope parameter22 =null;

		Object char_literal21_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:57:2: ( parameter ( ',' parameter )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:57:4: parameter ( ',' parameter )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_parameter_in_parameters237);
			parameter20=parameter();
			state._fsp--;

			adaptor.addChild(root_0, parameter20.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:57:14: ( ',' parameter )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==43) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:57:15: ',' parameter
					{
					char_literal21=(Token)match(input,43,FOLLOW_43_in_parameters240); 
					char_literal21_tree = (Object)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);

					pushFollow(FOLLOW_parameter_in_parameters242);
					parameter22=parameter();
					state._fsp--;

					adaptor.addChild(root_0, parameter22.getTree());

					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "parameters"


	public static class parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameter"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:60:1: parameter : ^( type IDENT ) ;
	public final JogoParser.parameter_return parameter() throws RecognitionException {
		JogoParser.parameter_return retval = new JogoParser.parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT24=null;
		ParserRuleReturnScope type23 =null;

		Object IDENT24_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:61:2: ( ^( type IDENT ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:61:4: ^( type IDENT )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_parameter257);
			type23=type();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(type23.getTree(), root_0);
			match(input, Token.DOWN, null); 
			IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter259); 
			IDENT24_tree = (Object)adaptor.create(IDENT24);
			adaptor.addChild(root_0, IDENT24_tree);

			match(input, Token.UP, null); 

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
	// $ANTLR end "parameter"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:64:1: statement : ( assignmentStatement | ifStatement | loopStatement | whileStatement | functionCallStatement );
	public final JogoParser.statement_return statement() throws RecognitionException {
		JogoParser.statement_return retval = new JogoParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignmentStatement25 =null;
		ParserRuleReturnScope ifStatement26 =null;
		ParserRuleReturnScope loopStatement27 =null;
		ParserRuleReturnScope whileStatement28 =null;
		ParserRuleReturnScope functionCallStatement29 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:65:2: ( assignmentStatement | ifStatement | loopStatement | whileStatement | functionCallStatement )
			int alt8=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==50) ) {
					alt8=1;
				}
				else if ( (LA8_1==38) ) {
					alt8=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 67:
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:65:4: assignmentStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignmentStatement_in_statement272);
					assignmentStatement25=assignmentStatement();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStatement25.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:66:4: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement277);
					ifStatement26=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement26.getTree());

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:67:4: loopStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_loopStatement_in_statement282);
					loopStatement27=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement27.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:68:4: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement287);
					whileStatement28=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement28.getTree());

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:69:4: functionCallStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallStatement_in_statement292);
					functionCallStatement29=functionCallStatement();
					state._fsp--;

					adaptor.addChild(root_0, functionCallStatement29.getTree());

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


	public static class functionCallStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:73:1: functionCallStatement : IDENT '(' ( actualParameters )? ')' ';' -> ^( FUNC_CALL IDENT ( actualParameters )? ) ;
	public final JogoParser.functionCallStatement_return functionCallStatement() throws RecognitionException {
		JogoParser.functionCallStatement_return retval = new JogoParser.functionCallStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		Token char_literal34=null;
		ParserRuleReturnScope actualParameters32 =null;

		Object IDENT30_tree=null;
		Object char_literal31_tree=null;
		Object char_literal33_tree=null;
		Object char_literal34_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:2: ( IDENT '(' ( actualParameters )? ')' ';' -> ^( FUNC_CALL IDENT ( actualParameters )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:4: IDENT '(' ( actualParameters )? ')' ';'
			{
			IDENT30=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionCallStatement305);  
			stream_IDENT.add(IDENT30);

			char_literal31=(Token)match(input,38,FOLLOW_38_in_functionCallStatement307);  
			stream_38.add(char_literal31);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:14: ( actualParameters )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= BOOLEAN && LA9_0 <= CHARLITERAL)||LA9_0==FLOATLITERAL||LA9_0==IDENT||LA9_0==INTLITERAL||LA9_0==STRINGLITERAL||LA9_0==38||(LA9_0 >= 41 && LA9_0 <= 42)||(LA9_0 >= 44 && LA9_0 <= 45)) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:14: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_functionCallStatement309);
					actualParameters32=actualParameters();
					state._fsp--;

					stream_actualParameters.add(actualParameters32.getTree());
					}
					break;

			}

			char_literal33=(Token)match(input,39,FOLLOW_39_in_functionCallStatement312);  
			stream_39.add(char_literal33);

			char_literal34=(Token)match(input,47,FOLLOW_47_in_functionCallStatement314);  
			stream_47.add(char_literal34);

			// AST REWRITE
			// elements: actualParameters, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:40: -> ^( FUNC_CALL IDENT ( actualParameters )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:43: ^( FUNC_CALL IDENT ( actualParameters )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:74:61: ( actualParameters )?
				if ( stream_actualParameters.hasNext() ) {
					adaptor.addChild(root_1, stream_actualParameters.nextTree());
				}
				stream_actualParameters.reset();

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
	// $ANTLR end "functionCallStatement"


	public static class actualParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:77:1: actualParameters : expression ( ',' expression )* ;
	public final JogoParser.actualParameters_return actualParameters() throws RecognitionException {
		JogoParser.actualParameters_return retval = new JogoParser.actualParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope expression37 =null;

		Object char_literal36_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:78:2: ( expression ( ',' expression )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:78:5: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_actualParameters338);
			expression35=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression35.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:78:16: ( ',' expression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==43) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:78:17: ',' expression
					{
					char_literal36=(Token)match(input,43,FOLLOW_43_in_actualParameters341); 
					char_literal36_tree = (Object)adaptor.create(char_literal36);
					adaptor.addChild(root_0, char_literal36_tree);

					pushFollow(FOLLOW_expression_in_actualParameters343);
					expression37=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression37.getTree());

					}
					break;

				default :
					break loop10;
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
	// $ANTLR end "actualParameters"


	public static class returnStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:82:1: returnStatement : 'return' expression ';' ;
	public final JogoParser.returnStatement_return returnStatement() throws RecognitionException {
		JogoParser.returnStatement_return retval = new JogoParser.returnStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal38=null;
		Token char_literal40=null;
		ParserRuleReturnScope expression39 =null;

		Object string_literal38_tree=null;
		Object char_literal40_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:83:2: ( 'return' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:83:3: 'return' expression ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal38=(Token)match(input,74,FOLLOW_74_in_returnStatement358); 
			string_literal38_tree = (Object)adaptor.create(string_literal38);
			adaptor.addChild(root_0, string_literal38_tree);

			pushFollow(FOLLOW_expression_in_returnStatement360);
			expression39=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression39.getTree());

			char_literal40=(Token)match(input,47,FOLLOW_47_in_returnStatement362); 
			char_literal40_tree = (Object)adaptor.create(char_literal40);
			adaptor.addChild(root_0, char_literal40_tree);

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
	// $ANTLR end "returnStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:86:1: ifStatement : 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' -> ^( IF_STATEMENT expression ( statement )* ( ELSEIF_STATEMENT expression ( statement )* )* ( ELSE_STATEMENT ( statement )* )? ) ;
	public final JogoParser.ifStatement_return ifStatement() throws RecognitionException {
		JogoParser.ifStatement_return retval = new JogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		Token string_literal43=null;
		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal52=null;
		ParserRuleReturnScope expression42 =null;
		ParserRuleReturnScope statement44 =null;
		ParserRuleReturnScope expression46 =null;
		ParserRuleReturnScope statement48 =null;
		ParserRuleReturnScope statement50 =null;

		Object string_literal41_tree=null;
		Object string_literal43_tree=null;
		Object string_literal45_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal52_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:87:2: ( 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' -> ^( IF_STATEMENT expression ( statement )* ( ELSEIF_STATEMENT expression ( statement )* )* ( ELSE_STATEMENT ( statement )* )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:87:4: 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if'
			{
			string_literal41=(Token)match(input,67,FOLLOW_67_in_ifStatement374);  
			stream_67.add(string_literal41);

			pushFollow(FOLLOW_expression_in_ifStatement376);
			expression42=expression();
			state._fsp--;

			stream_expression.add(expression42.getTree());
			string_literal43=(Token)match(input,76,FOLLOW_76_in_ifStatement378);  
			stream_76.add(string_literal43);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:87:27: ( statement )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENT||LA11_0==67||LA11_0==71||LA11_0==79) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:87:27: statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement380);
					statement44=statement();
					state._fsp--;

					stream_statement.add(statement44.getTree());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:88:3: ( 'elseif' expression 'then' ( statement )+ )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==62) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:88:4: 'elseif' expression 'then' ( statement )+
					{
					string_literal45=(Token)match(input,62,FOLLOW_62_in_ifStatement386);  
					stream_62.add(string_literal45);

					pushFollow(FOLLOW_expression_in_ifStatement388);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());
					string_literal47=(Token)match(input,76,FOLLOW_76_in_ifStatement390);  
					stream_76.add(string_literal47);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:88:31: ( statement )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==IDENT||LA12_0==67||LA12_0==71||LA12_0==79) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:88:31: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement392);
							statement48=statement();
							state._fsp--;

							stream_statement.add(statement48.getTree());
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					}
					break;

				default :
					break loop13;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:89:3: ( 'else' ( statement )+ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==61) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:89:4: 'else' ( statement )+
					{
					string_literal49=(Token)match(input,61,FOLLOW_61_in_ifStatement400);  
					stream_61.add(string_literal49);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:89:11: ( statement )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==IDENT||LA14_0==67||LA14_0==71||LA14_0==79) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:89:11: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement402);
							statement50=statement();
							state._fsp--;

							stream_statement.add(statement50.getTree());
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

			}

			string_literal51=(Token)match(input,63,FOLLOW_63_in_ifStatement409);  
			stream_63.add(string_literal51);

			string_literal52=(Token)match(input,67,FOLLOW_67_in_ifStatement411);  
			stream_67.add(string_literal52);

			// AST REWRITE
			// elements: statement, statement, expression, expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:13: -> ^( IF_STATEMENT expression ( statement )* ( ELSEIF_STATEMENT expression ( statement )* )* ( ELSE_STATEMENT ( statement )* )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:15: ^( IF_STATEMENT expression ( statement )* ( ELSEIF_STATEMENT expression ( statement )* )* ( ELSE_STATEMENT ( statement )* )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:41: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:52: ( ELSEIF_STATEMENT expression ( statement )* )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, (Object)adaptor.create(ELSEIF_STATEMENT, "ELSEIF_STATEMENT"));
					adaptor.addChild(root_1, stream_expression.nextTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:81: ( statement )*
					while ( stream_statement.hasNext() ) {
						adaptor.addChild(root_1, stream_statement.nextTree());
					}
					stream_statement.reset();

				}
				stream_expression.reset();

				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:94: ( ELSE_STATEMENT ( statement )* )?
				if ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, (Object)adaptor.create(ELSE_STATEMENT, "ELSE_STATEMENT"));
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:90:110: ( statement )*
					while ( stream_statement.hasNext() ) {
						adaptor.addChild(root_1, stream_statement.nextTree());
					}
					stream_statement.reset();

				}
				stream_statement.reset();

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


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:93:1: whileStatement : 'while' expression loopStatement ;
	public final JogoParser.whileStatement_return whileStatement() throws RecognitionException {
		JogoParser.whileStatement_return retval = new JogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal53=null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope loopStatement55 =null;

		Object string_literal53_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:94:2: ( 'while' expression loopStatement )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:94:3: 'while' expression loopStatement
			{
			root_0 = (Object)adaptor.nil();


			string_literal53=(Token)match(input,79,FOLLOW_79_in_whileStatement449); 
			string_literal53_tree = (Object)adaptor.create(string_literal53);
			adaptor.addChild(root_0, string_literal53_tree);

			pushFollow(FOLLOW_expression_in_whileStatement451);
			expression54=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression54.getTree());

			pushFollow(FOLLOW_loopStatement_in_whileStatement453);
			loopStatement55=loopStatement();
			state._fsp--;

			adaptor.addChild(root_0, loopStatement55.getTree());

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


	public static class loopStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loopStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:97:1: loopStatement : 'loop' ( statement | exitStatement )* 'end' 'loop' ;
	public final JogoParser.loopStatement_return loopStatement() throws RecognitionException {
		JogoParser.loopStatement_return retval = new JogoParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;
		Token string_literal59=null;
		Token string_literal60=null;
		ParserRuleReturnScope statement57 =null;
		ParserRuleReturnScope exitStatement58 =null;

		Object string_literal56_tree=null;
		Object string_literal59_tree=null;
		Object string_literal60_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:98:2: ( 'loop' ( statement | exitStatement )* 'end' 'loop' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:98:4: 'loop' ( statement | exitStatement )* 'end' 'loop'
			{
			root_0 = (Object)adaptor.nil();


			string_literal56=(Token)match(input,71,FOLLOW_71_in_loopStatement465); 
			string_literal56_tree = (Object)adaptor.create(string_literal56);
			adaptor.addChild(root_0, string_literal56_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:98:11: ( statement | exitStatement )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==IDENT||LA16_0==67||LA16_0==71||LA16_0==79) ) {
					alt16=1;
				}
				else if ( (LA16_0==64) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:98:12: statement
					{
					pushFollow(FOLLOW_statement_in_loopStatement468);
					statement57=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement57.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:98:22: exitStatement
					{
					pushFollow(FOLLOW_exitStatement_in_loopStatement470);
					exitStatement58=exitStatement();
					state._fsp--;

					adaptor.addChild(root_0, exitStatement58.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			string_literal59=(Token)match(input,63,FOLLOW_63_in_loopStatement474); 
			string_literal59_tree = (Object)adaptor.create(string_literal59);
			adaptor.addChild(root_0, string_literal59_tree);

			string_literal60=(Token)match(input,71,FOLLOW_71_in_loopStatement476); 
			string_literal60_tree = (Object)adaptor.create(string_literal60);
			adaptor.addChild(root_0, string_literal60_tree);

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
	// $ANTLR end "loopStatement"


	public static class exitStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exitStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:101:1: exitStatement : 'exit' 'when' expression ';' ;
	public final JogoParser.exitStatement_return exitStatement() throws RecognitionException {
		JogoParser.exitStatement_return retval = new JogoParser.exitStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;
		Token string_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope expression63 =null;

		Object string_literal61_tree=null;
		Object string_literal62_tree=null;
		Object char_literal64_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:102:2: ( 'exit' 'when' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:102:4: 'exit' 'when' expression ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal61=(Token)match(input,64,FOLLOW_64_in_exitStatement488); 
			string_literal61_tree = (Object)adaptor.create(string_literal61);
			adaptor.addChild(root_0, string_literal61_tree);

			string_literal62=(Token)match(input,78,FOLLOW_78_in_exitStatement490); 
			string_literal62_tree = (Object)adaptor.create(string_literal62);
			adaptor.addChild(root_0, string_literal62_tree);

			pushFollow(FOLLOW_expression_in_exitStatement492);
			expression63=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression63.getTree());

			char_literal64=(Token)match(input,47,FOLLOW_47_in_exitStatement494); 
			char_literal64_tree = (Object)adaptor.create(char_literal64);
			adaptor.addChild(root_0, char_literal64_tree);

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
	// $ANTLR end "exitStatement"


	public static class assignmentStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:105:1: assignmentStatement : IDENT '=' ^ expression ';' !;
	public final JogoParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
		JogoParser.assignmentStatement_return retval = new JogoParser.assignmentStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT65=null;
		Token char_literal66=null;
		Token char_literal68=null;
		ParserRuleReturnScope expression67 =null;

		Object IDENT65_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:106:2: ( IDENT '=' ^ expression ';' !)
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:106:4: IDENT '=' ^ expression ';' !
			{
			root_0 = (Object)adaptor.nil();


			IDENT65=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement506); 
			IDENT65_tree = (Object)adaptor.create(IDENT65);
			adaptor.addChild(root_0, IDENT65_tree);

			char_literal66=(Token)match(input,50,FOLLOW_50_in_assignmentStatement508); 
			char_literal66_tree = (Object)adaptor.create(char_literal66);
			root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);

			pushFollow(FOLLOW_expression_in_assignmentStatement511);
			expression67=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression67.getTree());

			char_literal68=(Token)match(input,47,FOLLOW_47_in_assignmentStatement513); 
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
	// $ANTLR end "assignmentStatement"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:110:1: variable : ( 'var' | 'constant' ) type variableDeclarator ( ',' variableDeclarator )* ';' -> ^( VAR_DECL type variableDeclarator ( variableDeclarator )* ) ;
	public final JogoParser.variable_return variable() throws RecognitionException {
		JogoParser.variable_return retval = new JogoParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;
		Token string_literal70=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope type71 =null;
		ParserRuleReturnScope variableDeclarator72 =null;
		ParserRuleReturnScope variableDeclarator74 =null;

		Object string_literal69_tree=null;
		Object string_literal70_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:111:2: ( ( 'var' | 'constant' ) type variableDeclarator ( ',' variableDeclarator )* ';' -> ^( VAR_DECL type variableDeclarator ( variableDeclarator )* ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:111:3: ( 'var' | 'constant' ) type variableDeclarator ( ',' variableDeclarator )* ';'
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:111:3: ( 'var' | 'constant' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==77) ) {
				alt17=1;
			}
			else if ( (LA17_0==59) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:111:4: 'var'
					{
					string_literal69=(Token)match(input,77,FOLLOW_77_in_variable528);  
					stream_77.add(string_literal69);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:111:10: 'constant'
					{
					string_literal70=(Token)match(input,59,FOLLOW_59_in_variable530);  
					stream_59.add(string_literal70);

					}
					break;

			}

			pushFollow(FOLLOW_type_in_variable535);
			type71=type();
			state._fsp--;

			stream_type.add(type71.getTree());
			pushFollow(FOLLOW_variableDeclarator_in_variable545);
			variableDeclarator72=variableDeclarator();
			state._fsp--;

			stream_variableDeclarator.add(variableDeclarator72.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:114:9: ( ',' variableDeclarator )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==43) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:114:10: ',' variableDeclarator
					{
					char_literal73=(Token)match(input,43,FOLLOW_43_in_variable556);  
					stream_43.add(char_literal73);

					pushFollow(FOLLOW_variableDeclarator_in_variable558);
					variableDeclarator74=variableDeclarator();
					state._fsp--;

					stream_variableDeclarator.add(variableDeclarator74.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			char_literal75=(Token)match(input,47,FOLLOW_47_in_variable570);  
			stream_47.add(char_literal75);

			// AST REWRITE
			// elements: variableDeclarator, variableDeclarator, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:12: -> ^( VAR_DECL type variableDeclarator ( variableDeclarator )* )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:115:15: ^( VAR_DECL type variableDeclarator ( variableDeclarator )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_variableDeclarator.nextTree());
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:115:50: ( variableDeclarator )*
				while ( stream_variableDeclarator.hasNext() ) {
					adaptor.addChild(root_1, stream_variableDeclarator.nextTree());
				}
				stream_variableDeclarator.reset();

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
	// $ANTLR end "variable"


	public static class variableDeclarator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarator"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:118:1: variableDeclarator : ( IDENT ( '=' expression ) -> ^( '=' IDENT expression ) | IDENT -> IDENT );
	public final JogoParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
		JogoParser.variableDeclarator_return retval = new JogoParser.variableDeclarator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT76=null;
		Token char_literal77=null;
		Token IDENT79=null;
		ParserRuleReturnScope expression78 =null;

		Object IDENT76_tree=null;
		Object char_literal77_tree=null;
		Object IDENT79_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:119:5: ( IDENT ( '=' expression ) -> ^( '=' IDENT expression ) | IDENT -> IDENT )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENT) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==50) ) {
					alt19=1;
				}
				else if ( (LA19_1==43||LA19_1==47) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:119:9: IDENT ( '=' expression )
					{
					IDENT76=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator602);  
					stream_IDENT.add(IDENT76);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:119:15: ( '=' expression )
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:119:16: '=' expression
					{
					char_literal77=(Token)match(input,50,FOLLOW_50_in_variableDeclarator605);  
					stream_50.add(char_literal77);

					pushFollow(FOLLOW_expression_in_variableDeclarator607);
					expression78=expression();
					state._fsp--;

					stream_expression.add(expression78.getTree());
					}

					// AST REWRITE
					// elements: expression, IDENT, 50
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:31: -> ^( '=' IDENT expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:119:33: ^( '=' IDENT expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENT.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:120:7: IDENT
					{
					IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator624);  
					stream_IDENT.add(IDENT79);

					// AST REWRITE
					// elements: IDENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:13: -> IDENT
					{
						adaptor.addChild(root_0, stream_IDENT.nextNode());
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
	// $ANTLR end "variableDeclarator"


	public static class typeDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeDecl"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:123:2: typeDecl : array ';' ;
	public final JogoParser.typeDecl_return typeDecl() throws RecognitionException {
		JogoParser.typeDecl_return retval = new JogoParser.typeDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal81=null;
		ParserRuleReturnScope array80 =null;

		Object char_literal81_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:124:3: ( array ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:124:5: array ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_in_typeDecl645);
			array80=array();
			state._fsp--;

			adaptor.addChild(root_0, array80.getTree());

			char_literal81=(Token)match(input,47,FOLLOW_47_in_typeDecl650); 
			char_literal81_tree = (Object)adaptor.create(char_literal81);
			adaptor.addChild(root_0, char_literal81_tree);

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
	// $ANTLR end "typeDecl"


	public static class array_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:128:2: array : arrayType type arrayDeclarator ( ',' arrayDeclarator )* ;
	public final JogoParser.array_return array() throws RecognitionException {
		JogoParser.array_return retval = new JogoParser.array_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal85=null;
		ParserRuleReturnScope arrayType82 =null;
		ParserRuleReturnScope type83 =null;
		ParserRuleReturnScope arrayDeclarator84 =null;
		ParserRuleReturnScope arrayDeclarator86 =null;

		Object char_literal85_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:129:3: ( arrayType type arrayDeclarator ( ',' arrayDeclarator )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:129:4: arrayType type arrayDeclarator ( ',' arrayDeclarator )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arrayType_in_array665);
			arrayType82=arrayType();
			state._fsp--;

			adaptor.addChild(root_0, arrayType82.getTree());

			pushFollow(FOLLOW_type_in_array670);
			type83=type();
			state._fsp--;

			adaptor.addChild(root_0, type83.getTree());

			pushFollow(FOLLOW_arrayDeclarator_in_array675);
			arrayDeclarator84=arrayDeclarator();
			state._fsp--;

			adaptor.addChild(root_0, arrayDeclarator84.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:132:4: ( ',' arrayDeclarator )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==43) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:132:5: ',' arrayDeclarator
					{
					char_literal85=(Token)match(input,43,FOLLOW_43_in_array681); 
					char_literal85_tree = (Object)adaptor.create(char_literal85);
					adaptor.addChild(root_0, char_literal85_tree);

					pushFollow(FOLLOW_arrayDeclarator_in_array683);
					arrayDeclarator86=arrayDeclarator();
					state._fsp--;

					adaptor.addChild(root_0, arrayDeclarator86.getTree());

					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "array"


	public static class arrayDeclarator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayDeclarator"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:136:2: arrayDeclarator : IDENT ( '=' arrayInitializer )? ;
	public final JogoParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
		JogoParser.arrayDeclarator_return retval = new JogoParser.arrayDeclarator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT87=null;
		Token char_literal88=null;
		ParserRuleReturnScope arrayInitializer89 =null;

		Object IDENT87_tree=null;
		Object char_literal88_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:137:3: ( IDENT ( '=' arrayInitializer )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:137:6: IDENT ( '=' arrayInitializer )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_arrayDeclarator705); 
			IDENT87_tree = (Object)adaptor.create(IDENT87);
			adaptor.addChild(root_0, IDENT87_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:138:4: ( '=' arrayInitializer )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==50) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:138:5: '=' arrayInitializer
					{
					char_literal88=(Token)match(input,50,FOLLOW_50_in_arrayDeclarator711); 
					char_literal88_tree = (Object)adaptor.create(char_literal88);
					adaptor.addChild(root_0, char_literal88_tree);

					pushFollow(FOLLOW_arrayInitializer_in_arrayDeclarator713);
					arrayInitializer89=arrayInitializer();
					state._fsp--;

					adaptor.addChild(root_0, arrayInitializer89.getTree());

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
	// $ANTLR end "arrayDeclarator"


	public static class arrayInitializer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayInitializer"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:142:2: arrayInitializer : '[' ( expression ) ( ',' ( expression ) )* ']' ;
	public final JogoParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
		JogoParser.arrayInitializer_return retval = new JogoParser.arrayInitializer_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal90=null;
		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope expression91 =null;
		ParserRuleReturnScope expression93 =null;

		Object char_literal90_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:143:3: ( '[' ( expression ) ( ',' ( expression ) )* ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:143:4: '[' ( expression ) ( ',' ( expression ) )* ']'
			{
			root_0 = (Object)adaptor.nil();


			char_literal90=(Token)match(input,54,FOLLOW_54_in_arrayInitializer740); 
			char_literal90_tree = (Object)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:143:7: ( expression )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:143:8: expression
			{
			pushFollow(FOLLOW_expression_in_arrayInitializer742);
			expression91=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression91.getTree());

			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:144:9: ( ',' ( expression ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==43) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:144:10: ',' ( expression )
					{
					char_literal92=(Token)match(input,43,FOLLOW_43_in_arrayInitializer754); 
					char_literal92_tree = (Object)adaptor.create(char_literal92);
					adaptor.addChild(root_0, char_literal92_tree);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:144:14: ( expression )
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:144:15: expression
					{
					pushFollow(FOLLOW_expression_in_arrayInitializer757);
					expression93=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression93.getTree());

					}

					}
					break;

				default :
					break loop22;
				}
			}

			char_literal94=(Token)match(input,55,FOLLOW_55_in_arrayInitializer765); 
			char_literal94_tree = (Object)adaptor.create(char_literal94);
			adaptor.addChild(root_0, char_literal94_tree);

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
	// $ANTLR end "arrayInitializer"


	public static class arrayCallStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayCallStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:148:2: arrayCallStatement : IDENT '[' expression ']' ;
	public final JogoParser.arrayCallStatement_return arrayCallStatement() throws RecognitionException {
		JogoParser.arrayCallStatement_return retval = new JogoParser.arrayCallStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope expression97 =null;

		Object IDENT95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:149:3: ( IDENT '[' expression ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:149:5: IDENT '[' expression ']'
			{
			root_0 = (Object)adaptor.nil();


			IDENT95=(Token)match(input,IDENT,FOLLOW_IDENT_in_arrayCallStatement781); 
			IDENT95_tree = (Object)adaptor.create(IDENT95);
			adaptor.addChild(root_0, IDENT95_tree);

			char_literal96=(Token)match(input,54,FOLLOW_54_in_arrayCallStatement783); 
			char_literal96_tree = (Object)adaptor.create(char_literal96);
			adaptor.addChild(root_0, char_literal96_tree);

			pushFollow(FOLLOW_expression_in_arrayCallStatement785);
			expression97=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression97.getTree());

			char_literal98=(Token)match(input,55,FOLLOW_55_in_arrayCallStatement787); 
			char_literal98_tree = (Object)adaptor.create(char_literal98);
			adaptor.addChild(root_0, char_literal98_tree);

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
	// $ANTLR end "arrayCallStatement"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:153:2: term : ( IDENT | '(' ! expression ')' !| INTLITERAL | FLOATLITERAL | STRINGLITERAL | CHARLITERAL | BOOLEAN | functionCallStatement | arrayCallStatement );
	public final JogoParser.term_return term() throws RecognitionException {
		JogoParser.term_return retval = new JogoParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token INTLITERAL103=null;
		Token FLOATLITERAL104=null;
		Token STRINGLITERAL105=null;
		Token CHARLITERAL106=null;
		Token BOOLEAN107=null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope functionCallStatement108 =null;
		ParserRuleReturnScope arrayCallStatement109 =null;

		Object IDENT99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object INTLITERAL103_tree=null;
		Object FLOATLITERAL104_tree=null;
		Object STRINGLITERAL105_tree=null;
		Object CHARLITERAL106_tree=null;
		Object BOOLEAN107_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:154:2: ( IDENT | '(' ! expression ')' !| INTLITERAL | FLOATLITERAL | STRINGLITERAL | CHARLITERAL | BOOLEAN | functionCallStatement | arrayCallStatement )
			int alt23=9;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 38:
					{
					alt23=8;
					}
					break;
				case 54:
					{
					alt23=9;
					}
					break;
				case 36:
				case 37:
				case 39:
				case 40:
				case 41:
				case 43:
				case 44:
				case 46:
				case 47:
				case 48:
				case 49:
				case 51:
				case 52:
				case 53:
				case 55:
				case 56:
				case 71:
				case 72:
				case 76:
					{
					alt23=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 38:
				{
				alt23=2;
				}
				break;
			case INTLITERAL:
				{
				alt23=3;
				}
				break;
			case FLOATLITERAL:
				{
				alt23=4;
				}
				break;
			case STRINGLITERAL:
				{
				alt23=5;
				}
				break;
			case CHARLITERAL:
				{
				alt23=6;
				}
				break;
			case BOOLEAN:
				{
				alt23=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:154:4: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_term802); 
					IDENT99_tree = (Object)adaptor.create(IDENT99);
					adaptor.addChild(root_0, IDENT99_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:155:4: '(' ! expression ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal100=(Token)match(input,38,FOLLOW_38_in_term807); 
					pushFollow(FOLLOW_expression_in_term810);
					expression101=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression101.getTree());

					char_literal102=(Token)match(input,39,FOLLOW_39_in_term812); 
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:156:4: INTLITERAL
					{
					root_0 = (Object)adaptor.nil();


					INTLITERAL103=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_term818); 
					INTLITERAL103_tree = (Object)adaptor.create(INTLITERAL103);
					adaptor.addChild(root_0, INTLITERAL103_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:157:4: FLOATLITERAL
					{
					root_0 = (Object)adaptor.nil();


					FLOATLITERAL104=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_term823); 
					FLOATLITERAL104_tree = (Object)adaptor.create(FLOATLITERAL104);
					adaptor.addChild(root_0, FLOATLITERAL104_tree);

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:158:4: STRINGLITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRINGLITERAL105=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_term828); 
					STRINGLITERAL105_tree = (Object)adaptor.create(STRINGLITERAL105);
					adaptor.addChild(root_0, STRINGLITERAL105_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:159:4: CHARLITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHARLITERAL106=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_term833); 
					CHARLITERAL106_tree = (Object)adaptor.create(CHARLITERAL106);
					adaptor.addChild(root_0, CHARLITERAL106_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:160:4: BOOLEAN
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN107=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term838); 
					BOOLEAN107_tree = (Object)adaptor.create(BOOLEAN107);
					adaptor.addChild(root_0, BOOLEAN107_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:161:4: functionCallStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallStatement_in_term843);
					functionCallStatement108=functionCallStatement();
					state._fsp--;

					adaptor.addChild(root_0, functionCallStatement108.getTree());

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:162:4: arrayCallStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayCallStatement_in_term848);
					arrayCallStatement109=arrayCallStatement();
					state._fsp--;

					adaptor.addChild(root_0, arrayCallStatement109.getTree());

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
	// $ANTLR end "term"


	public static class unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:166:1: unary : ( '+' unary -> unary | '-' unary -> ^( NEGATION unary ) | '++' unary -> ^( POSTINCREMENT unary ) | '--' unary -> ^( POSTDECREMENT unary ) | term -> term );
	public final JogoParser.unary_return unary() throws RecognitionException {
		JogoParser.unary_return retval = new JogoParser.unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal110=null;
		Token char_literal112=null;
		Token string_literal114=null;
		Token string_literal116=null;
		ParserRuleReturnScope unary111 =null;
		ParserRuleReturnScope unary113 =null;
		ParserRuleReturnScope unary115 =null;
		ParserRuleReturnScope unary117 =null;
		ParserRuleReturnScope term118 =null;

		Object char_literal110_tree=null;
		Object char_literal112_tree=null;
		Object string_literal114_tree=null;
		Object string_literal116_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_unary=new RewriteRuleSubtreeStream(adaptor,"rule unary");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:167:2: ( '+' unary -> unary | '-' unary -> ^( NEGATION unary ) | '++' unary -> ^( POSTINCREMENT unary ) | '--' unary -> ^( POSTDECREMENT unary ) | term -> term )
			int alt24=5;
			switch ( input.LA(1) ) {
			case 41:
				{
				alt24=1;
				}
				break;
			case 44:
				{
				alt24=2;
				}
				break;
			case 42:
				{
				alt24=3;
				}
				break;
			case 45:
				{
				alt24=4;
				}
				break;
			case BOOLEAN:
			case CHARLITERAL:
			case FLOATLITERAL:
			case IDENT:
			case INTLITERAL:
			case STRINGLITERAL:
			case 38:
				{
				alt24=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:167:6: '+' unary
					{
					char_literal110=(Token)match(input,41,FOLLOW_41_in_unary866);  
					stream_41.add(char_literal110);

					pushFollow(FOLLOW_unary_in_unary868);
					unary111=unary();
					state._fsp--;

					stream_unary.add(unary111.getTree());
					// AST REWRITE
					// elements: unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 167:15: -> unary
					{
						adaptor.addChild(root_0, stream_unary.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:168:9: '-' unary
					{
					char_literal112=(Token)match(input,44,FOLLOW_44_in_unary881);  
					stream_44.add(char_literal112);

					pushFollow(FOLLOW_unary_in_unary883);
					unary113=unary();
					state._fsp--;

					stream_unary.add(unary113.getTree());
					// AST REWRITE
					// elements: unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 168:19: -> ^( NEGATION unary )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:168:22: ^( NEGATION unary )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATION, "NEGATION"), root_1);
						adaptor.addChild(root_1, stream_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:169:9: '++' unary
					{
					string_literal114=(Token)match(input,42,FOLLOW_42_in_unary901);  
					stream_42.add(string_literal114);

					pushFollow(FOLLOW_unary_in_unary903);
					unary115=unary();
					state._fsp--;

					stream_unary.add(unary115.getTree());
					// AST REWRITE
					// elements: unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 169:20: -> ^( POSTINCREMENT unary )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:169:23: ^( POSTINCREMENT unary )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTINCREMENT, "POSTINCREMENT"), root_1);
						adaptor.addChild(root_1, stream_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:170:9: '--' unary
					{
					string_literal116=(Token)match(input,45,FOLLOW_45_in_unary921);  
					stream_45.add(string_literal116);

					pushFollow(FOLLOW_unary_in_unary923);
					unary117=unary();
					state._fsp--;

					stream_unary.add(unary117.getTree());
					// AST REWRITE
					// elements: unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:20: -> ^( POSTDECREMENT unary )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:170:23: ^( POSTDECREMENT unary )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTDECREMENT, "POSTDECREMENT"), root_1);
						adaptor.addChild(root_1, stream_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:171:7: term
					{
					pushFollow(FOLLOW_term_in_unary939);
					term118=term();
					state._fsp--;

					stream_term.add(term118.getTree());
					// AST REWRITE
					// elements: term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 171:11: -> term
					{
						adaptor.addChild(root_0, stream_term.nextTree());
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
	// $ANTLR end "unary"


	public static class mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:176:1: mult : unary ( ( '*' ^| '/' ^| '%' ^) unary )* ;
	public final JogoParser.mult_return mult() throws RecognitionException {
		JogoParser.mult_return retval = new JogoParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token char_literal121=null;
		Token char_literal122=null;
		ParserRuleReturnScope unary119 =null;
		ParserRuleReturnScope unary123 =null;

		Object char_literal120_tree=null;
		Object char_literal121_tree=null;
		Object char_literal122_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:2: ( unary ( ( '*' ^| '/' ^| '%' ^) unary )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:4: unary ( ( '*' ^| '/' ^| '%' ^) unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult958);
			unary119=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary119.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:9: ( ( '*' ^| '/' ^| '%' ^) unary )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==37||LA26_0==40||LA26_0==46) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:10: ( '*' ^| '/' ^| '%' ^) unary
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:10: ( '*' ^| '/' ^| '%' ^)
					int alt25=3;
					switch ( input.LA(1) ) {
					case 40:
						{
						alt25=1;
						}
						break;
					case 46:
						{
						alt25=2;
						}
						break;
					case 37:
						{
						alt25=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}
					switch (alt25) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:11: '*' ^
							{
							char_literal120=(Token)match(input,40,FOLLOW_40_in_mult961); 
							char_literal120_tree = (Object)adaptor.create(char_literal120);
							root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:18: '/' ^
							{
							char_literal121=(Token)match(input,46,FOLLOW_46_in_mult966); 
							char_literal121_tree = (Object)adaptor.create(char_literal121);
							root_0 = (Object)adaptor.becomeRoot(char_literal121_tree, root_0);

							}
							break;
						case 3 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:177:25: '%' ^
							{
							char_literal122=(Token)match(input,37,FOLLOW_37_in_mult971); 
							char_literal122_tree = (Object)adaptor.create(char_literal122);
							root_0 = (Object)adaptor.becomeRoot(char_literal122_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult975);
					unary123=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary123.getTree());

					}
					break;

				default :
					break loop26;
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
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:180:1: add : mult ( ( '+' ^| '-' ^) mult )* ;
	public final JogoParser.add_return add() throws RecognitionException {
		JogoParser.add_return retval = new JogoParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal125=null;
		Token char_literal126=null;
		ParserRuleReturnScope mult124 =null;
		ParserRuleReturnScope mult127 =null;

		Object char_literal125_tree=null;
		Object char_literal126_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:2: ( mult ( ( '+' ^| '-' ^) mult )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:4: mult ( ( '+' ^| '-' ^) mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add989);
			mult124=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult124.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:9: ( ( '+' ^| '-' ^) mult )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==41||LA28_0==44) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:10: ( '+' ^| '-' ^) mult
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:10: ( '+' ^| '-' ^)
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==41) ) {
						alt27=1;
					}
					else if ( (LA27_0==44) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:11: '+' ^
							{
							char_literal125=(Token)match(input,41,FOLLOW_41_in_add993); 
							char_literal125_tree = (Object)adaptor.create(char_literal125);
							root_0 = (Object)adaptor.becomeRoot(char_literal125_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:181:18: '-' ^
							{
							char_literal126=(Token)match(input,44,FOLLOW_44_in_add998); 
							char_literal126_tree = (Object)adaptor.create(char_literal126);
							root_0 = (Object)adaptor.becomeRoot(char_literal126_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_add1003);
					mult127=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult127.getTree());

					}
					break;

				default :
					break loop28;
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
	// $ANTLR end "add"


	public static class relation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:184:1: relation : add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )* ;
	public final JogoParser.relation_return relation() throws RecognitionException {
		JogoParser.relation_return retval = new JogoParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal129=null;
		Token string_literal130=null;
		Token char_literal131=null;
		Token string_literal132=null;
		Token string_literal133=null;
		Token char_literal134=null;
		ParserRuleReturnScope add128 =null;
		ParserRuleReturnScope add135 =null;

		Object string_literal129_tree=null;
		Object string_literal130_tree=null;
		Object char_literal131_tree=null;
		Object string_literal132_tree=null;
		Object string_literal133_tree=null;
		Object char_literal134_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:2: ( add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:4: add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_relation1017);
			add128=add();
			state._fsp--;

			adaptor.addChild(root_0, add128.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:8: ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==36||(LA30_0 >= 48 && LA30_0 <= 49)||(LA30_0 >= 51 && LA30_0 <= 53)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:9: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:9: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^)
					int alt29=6;
					switch ( input.LA(1) ) {
					case 51:
						{
						alt29=1;
						}
						break;
					case 36:
						{
						alt29=2;
						}
						break;
					case 48:
						{
						alt29=3;
						}
						break;
					case 49:
						{
						alt29=4;
						}
						break;
					case 53:
						{
						alt29=5;
						}
						break;
					case 52:
						{
						alt29=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:10: '==' ^
							{
							string_literal129=(Token)match(input,51,FOLLOW_51_in_relation1021); 
							string_literal129_tree = (Object)adaptor.create(string_literal129);
							root_0 = (Object)adaptor.becomeRoot(string_literal129_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:18: '!=' ^
							{
							string_literal130=(Token)match(input,36,FOLLOW_36_in_relation1026); 
							string_literal130_tree = (Object)adaptor.create(string_literal130);
							root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);

							}
							break;
						case 3 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:26: '<' ^
							{
							char_literal131=(Token)match(input,48,FOLLOW_48_in_relation1031); 
							char_literal131_tree = (Object)adaptor.create(char_literal131);
							root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);

							}
							break;
						case 4 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:33: '<=' ^
							{
							string_literal132=(Token)match(input,49,FOLLOW_49_in_relation1036); 
							string_literal132_tree = (Object)adaptor.create(string_literal132);
							root_0 = (Object)adaptor.becomeRoot(string_literal132_tree, root_0);

							}
							break;
						case 5 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:41: '>=' ^
							{
							string_literal133=(Token)match(input,53,FOLLOW_53_in_relation1041); 
							string_literal133_tree = (Object)adaptor.create(string_literal133);
							root_0 = (Object)adaptor.becomeRoot(string_literal133_tree, root_0);

							}
							break;
						case 6 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:185:49: '>' ^
							{
							char_literal134=(Token)match(input,52,FOLLOW_52_in_relation1046); 
							char_literal134_tree = (Object)adaptor.create(char_literal134);
							root_0 = (Object)adaptor.becomeRoot(char_literal134_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_add_in_relation1050);
					add135=add();
					state._fsp--;

					adaptor.addChild(root_0, add135.getTree());

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
	// $ANTLR end "relation"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:188:1: expression : relation ( ( 'and' ^| 'or' ^) relation )* ;
	public final JogoParser.expression_return expression() throws RecognitionException {
		JogoParser.expression_return retval = new JogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal137=null;
		Token string_literal138=null;
		ParserRuleReturnScope relation136 =null;
		ParserRuleReturnScope relation139 =null;

		Object string_literal137_tree=null;
		Object string_literal138_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:2: ( relation ( ( 'and' ^| 'or' ^) relation )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:3: relation ( ( 'and' ^| 'or' ^) relation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relation_in_expression1063);
			relation136=relation();
			state._fsp--;

			adaptor.addChild(root_0, relation136.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:12: ( ( 'and' ^| 'or' ^) relation )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==56||LA32_0==72) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:13: ( 'and' ^| 'or' ^) relation
					{
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:13: ( 'and' ^| 'or' ^)
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==56) ) {
						alt31=1;
					}
					else if ( (LA31_0==72) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:14: 'and' ^
							{
							string_literal137=(Token)match(input,56,FOLLOW_56_in_expression1067); 
							string_literal137_tree = (Object)adaptor.create(string_literal137);
							root_0 = (Object)adaptor.becomeRoot(string_literal137_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:189:23: 'or' ^
							{
							string_literal138=(Token)match(input,72,FOLLOW_72_in_expression1072); 
							string_literal138_tree = (Object)adaptor.create(string_literal138);
							root_0 = (Object)adaptor.becomeRoot(string_literal138_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_relation_in_expression1076);
					relation139=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation139.getTree());

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
	// $ANTLR end "expression"


	public static class typeSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeSpec"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:192:1: typeSpec : arrayType ;
	public final JogoParser.typeSpec_return typeSpec() throws RecognitionException {
		JogoParser.typeSpec_return retval = new JogoParser.typeSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arrayType140 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:193:2: ( arrayType )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:193:4: arrayType
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arrayType_in_typeSpec1089);
			arrayType140=arrayType();
			state._fsp--;

			adaptor.addChild(root_0, arrayType140.getTree());

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
	// $ANTLR end "typeSpec"


	public static class arrayType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayType"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:196:1: arrayType : 'list' ;
	public final JogoParser.arrayType_return arrayType() throws RecognitionException {
		JogoParser.arrayType_return retval = new JogoParser.arrayType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal141=null;

		Object string_literal141_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:197:2: ( 'list' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:197:4: 'list'
			{
			root_0 = (Object)adaptor.nil();


			string_literal141=(Token)match(input,69,FOLLOW_69_in_arrayType1101); 
			string_literal141_tree = (Object)adaptor.create(string_literal141);
			adaptor.addChild(root_0, string_literal141_tree);

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
	// $ANTLR end "arrayType"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:200:1: type : ( 'int' | 'long' | 'float' | 'double' | 'boolean' | 'string' | 'char' | typeSpec | IDENT );
	public final JogoParser.type_return type() throws RecognitionException {
		JogoParser.type_return retval = new JogoParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal142=null;
		Token string_literal143=null;
		Token string_literal144=null;
		Token string_literal145=null;
		Token string_literal146=null;
		Token string_literal147=null;
		Token string_literal148=null;
		Token IDENT150=null;
		ParserRuleReturnScope typeSpec149 =null;

		Object string_literal142_tree=null;
		Object string_literal143_tree=null;
		Object string_literal144_tree=null;
		Object string_literal145_tree=null;
		Object string_literal146_tree=null;
		Object string_literal147_tree=null;
		Object string_literal148_tree=null;
		Object IDENT150_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:201:5: ( 'int' | 'long' | 'float' | 'double' | 'boolean' | 'string' | 'char' | typeSpec | IDENT )
			int alt33=9;
			switch ( input.LA(1) ) {
			case 68:
				{
				alt33=1;
				}
				break;
			case 70:
				{
				alt33=2;
				}
				break;
			case 65:
				{
				alt33=3;
				}
				break;
			case 60:
				{
				alt33=4;
				}
				break;
			case 57:
				{
				alt33=5;
				}
				break;
			case 75:
				{
				alt33=6;
				}
				break;
			case 58:
				{
				alt33=7;
				}
				break;
			case 69:
				{
				alt33=8;
				}
				break;
			case IDENT:
				{
				alt33=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:201:9: 'int'
					{
					root_0 = (Object)adaptor.nil();


					string_literal142=(Token)match(input,68,FOLLOW_68_in_type1123); 
					string_literal142_tree = (Object)adaptor.create(string_literal142);
					adaptor.addChild(root_0, string_literal142_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:202:9: 'long'
					{
					root_0 = (Object)adaptor.nil();


					string_literal143=(Token)match(input,70,FOLLOW_70_in_type1133); 
					string_literal143_tree = (Object)adaptor.create(string_literal143);
					adaptor.addChild(root_0, string_literal143_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:203:9: 'float'
					{
					root_0 = (Object)adaptor.nil();


					string_literal144=(Token)match(input,65,FOLLOW_65_in_type1143); 
					string_literal144_tree = (Object)adaptor.create(string_literal144);
					adaptor.addChild(root_0, string_literal144_tree);

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:204:9: 'double'
					{
					root_0 = (Object)adaptor.nil();


					string_literal145=(Token)match(input,60,FOLLOW_60_in_type1153); 
					string_literal145_tree = (Object)adaptor.create(string_literal145);
					adaptor.addChild(root_0, string_literal145_tree);

					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:205:8: 'boolean'
					{
					root_0 = (Object)adaptor.nil();


					string_literal146=(Token)match(input,57,FOLLOW_57_in_type1162); 
					string_literal146_tree = (Object)adaptor.create(string_literal146);
					adaptor.addChild(root_0, string_literal146_tree);

					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:206:7: 'string'
					{
					root_0 = (Object)adaptor.nil();


					string_literal147=(Token)match(input,75,FOLLOW_75_in_type1170); 
					string_literal147_tree = (Object)adaptor.create(string_literal147);
					adaptor.addChild(root_0, string_literal147_tree);

					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:207:7: 'char'
					{
					root_0 = (Object)adaptor.nil();


					string_literal148=(Token)match(input,58,FOLLOW_58_in_type1178); 
					string_literal148_tree = (Object)adaptor.create(string_literal148);
					adaptor.addChild(root_0, string_literal148_tree);

					}
					break;
				case 8 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:208:7: typeSpec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_typeSpec_in_type1186);
					typeSpec149=typeSpec();
					state._fsp--;

					adaptor.addChild(root_0, typeSpec149.getTree());

					}
					break;
				case 9 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Jogo.g:209:7: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT150=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1194); 
					IDENT150_tree = (Object)adaptor.create(IDENT150);
					adaptor.addChild(root_0, IDENT150_tree);

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
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_73_in_program101 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_program103 = new BitSet(new long[]{0x8800000000080000L,0x000000000000A0ACL});
	public static final BitSet FOLLOW_script_in_program109 = new BitSet(new long[]{0x8800000000080000L,0x000000000000A0ACL});
	public static final BitSet FOLLOW_63_in_program115 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_program117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_script136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_script140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_atom151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_atom157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDecl_in_atom163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_function175 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_function177 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_function179 = new BitSet(new long[]{0x1600008000080000L,0x0000000000000872L});
	public static final BitSet FOLLOW_parameters_in_function181 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_function184 = new BitSet(new long[]{0x8800000000080000L,0x000000000000A4A8L});
	public static final BitSet FOLLOW_atom_in_function189 = new BitSet(new long[]{0x8800000000080000L,0x000000000000A4A8L});
	public static final BitSet FOLLOW_returnStatement_in_function196 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_63_in_function202 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_function204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameters237 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_parameters240 = new BitSet(new long[]{0x1600000000080000L,0x0000000000000872L});
	public static final BitSet FOLLOW_parameter_in_parameters242 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_type_in_parameter257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_parameter259 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallStatement_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_functionCallStatement305 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_functionCallStatement307 = new BitSet(new long[]{0x000036C100282030L});
	public static final BitSet FOLLOW_actualParameters_in_functionCallStatement309 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_functionCallStatement312 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_functionCallStatement314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actualParameters338 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_actualParameters341 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_actualParameters343 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_74_in_returnStatement358 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_returnStatement360 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_returnStatement362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ifStatement374 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_ifStatement376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_ifStatement378 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_statement_in_ifStatement380 = new BitSet(new long[]{0xE000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_62_in_ifStatement386 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_ifStatement388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_ifStatement390 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_statement_in_ifStatement392 = new BitSet(new long[]{0xE000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_61_in_ifStatement400 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_statement_in_ifStatement402 = new BitSet(new long[]{0x8000000000080000L,0x0000000000008088L});
	public static final BitSet FOLLOW_63_in_ifStatement409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_ifStatement411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_whileStatement449 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_whileStatement451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_loopStatement_in_whileStatement453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_loopStatement465 = new BitSet(new long[]{0x8000000000080000L,0x0000000000008089L});
	public static final BitSet FOLLOW_statement_in_loopStatement468 = new BitSet(new long[]{0x8000000000080000L,0x0000000000008089L});
	public static final BitSet FOLLOW_exitStatement_in_loopStatement470 = new BitSet(new long[]{0x8000000000080000L,0x0000000000008089L});
	public static final BitSet FOLLOW_63_in_loopStatement474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_loopStatement476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_exitStatement488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_exitStatement490 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_exitStatement492 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exitStatement494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStatement506 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentStatement508 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement511 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_assignmentStatement513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_variable528 = new BitSet(new long[]{0x1600000000080000L,0x0000000000000872L});
	public static final BitSet FOLLOW_59_in_variable530 = new BitSet(new long[]{0x1600000000080000L,0x0000000000000872L});
	public static final BitSet FOLLOW_type_in_variable535 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable545 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_variable556 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variable558 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_47_in_variable570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclarator602 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_variableDeclarator605 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_variableDeclarator607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclarator624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_typeDecl645 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_typeDecl650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_array665 = new BitSet(new long[]{0x1600000000080000L,0x0000000000000872L});
	public static final BitSet FOLLOW_type_in_array670 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_array675 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_array681 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_array683 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_IDENT_in_arrayDeclarator705 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_arrayDeclarator711 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayDeclarator713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_arrayInitializer740 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_arrayInitializer742 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_arrayInitializer754 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_arrayInitializer757 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_arrayInitializer765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_arrayCallStatement781 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_arrayCallStatement783 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_arrayCallStatement785 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_arrayCallStatement787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_term807 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_expression_in_term810 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_term812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_term818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_term823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_term828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARLITERAL_in_term833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_term838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallStatement_in_term843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCallStatement_in_term848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unary866 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_unary_in_unary868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_unary881 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_unary_in_unary883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_unary901 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_unary_in_unary903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unary921 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_unary_in_unary923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_unary939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult958 = new BitSet(new long[]{0x0000412000000002L});
	public static final BitSet FOLLOW_40_in_mult961 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_46_in_mult966 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_37_in_mult971 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_unary_in_mult975 = new BitSet(new long[]{0x0000412000000002L});
	public static final BitSet FOLLOW_mult_in_add989 = new BitSet(new long[]{0x0000120000000002L});
	public static final BitSet FOLLOW_41_in_add993 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_44_in_add998 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_mult_in_add1003 = new BitSet(new long[]{0x0000120000000002L});
	public static final BitSet FOLLOW_add_in_relation1017 = new BitSet(new long[]{0x003B001000000002L});
	public static final BitSet FOLLOW_51_in_relation1021 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_36_in_relation1026 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_48_in_relation1031 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_49_in_relation1036 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_53_in_relation1041 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_52_in_relation1046 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_add_in_relation1050 = new BitSet(new long[]{0x003B001000000002L});
	public static final BitSet FOLLOW_relation_in_expression1063 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_56_in_expression1067 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_72_in_expression1072 = new BitSet(new long[]{0x0000364100282030L});
	public static final BitSet FOLLOW_relation_in_expression1076 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_arrayType_in_typeSpec1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_arrayType1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_type1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_type1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_type1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_type1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_type1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_type1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_type1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeSpec_in_type1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_type1194 = new BitSet(new long[]{0x0000000000000002L});
}
