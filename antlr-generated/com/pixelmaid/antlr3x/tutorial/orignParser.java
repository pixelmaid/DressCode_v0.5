// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g 2013-01-31 17:29:48

  package com.pixelmaid.antlr3x.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class orignParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", 
		"MULTILINE_COMMENT", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", "'<='", "'='", "'>'", 
		"'>='", "'Integer'", "'and'", "'begin'", "'constant'", "'else'", "'elseif'", 
		"'end'", "'exit'", "'function'", "'if'", "'loop'", "'mod'", "'not'", "'or'", 
		"'program'", "'then'", "'var'", "'when'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int COMMENT=4;
	public static final int IDENT=5;
	public static final int INTEGER=6;
	public static final int MULTILINE_COMMENT=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public orignParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public orignParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return orignParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:15:1: program : 'program' IDENT '=' ( constant | variable )* 'begin' ( statement )* 'end' IDENT '.' ;
	public final orignParser.program_return program() throws RecognitionException {
		orignParser.program_return retval = new orignParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token char_literal3=null;
		Token string_literal6=null;
		Token string_literal8=null;
		Token IDENT9=null;
		Token char_literal10=null;
		ParserRuleReturnScope constant4 =null;
		ParserRuleReturnScope variable5 =null;
		ParserRuleReturnScope statement7 =null;

		Object string_literal1_tree=null;
		Object IDENT2_tree=null;
		Object char_literal3_tree=null;
		Object string_literal6_tree=null;
		Object string_literal8_tree=null;
		Object IDENT9_tree=null;
		Object char_literal10_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:16:2: ( 'program' IDENT '=' ( constant | variable )* 'begin' ( statement )* 'end' IDENT '.' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:16:3: 'program' IDENT '=' ( constant | variable )* 'begin' ( statement )* 'end' IDENT '.'
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,40,FOLLOW_40_in_program46); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program48); 
			IDENT2_tree = (Object)adaptor.create(IDENT2);
			adaptor.addChild(root_0, IDENT2_tree);

			char_literal3=(Token)match(input,23,FOLLOW_23_in_program50); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:17:2: ( constant | variable )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==29) ) {
					alt1=1;
				}
				else if ( (LA1_0==42) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:17:3: constant
					{
					pushFollow(FOLLOW_constant_in_program54);
					constant4=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant4.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:17:14: variable
					{
					pushFollow(FOLLOW_variable_in_program58);
					variable5=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable5.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			string_literal6=(Token)match(input,28,FOLLOW_28_in_program65); 
			string_literal6_tree = (Object)adaptor.create(string_literal6);
			adaptor.addChild(root_0, string_literal6_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:20:2: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT||(LA2_0 >= 35 && LA2_0 <= 36)||LA2_0==44) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:20:2: statement
					{
					pushFollow(FOLLOW_statement_in_program68);
					statement7=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement7.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			string_literal8=(Token)match(input,32,FOLLOW_32_in_program72); 
			string_literal8_tree = (Object)adaptor.create(string_literal8);
			adaptor.addChild(root_0, string_literal8_tree);

			IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_program74); 
			IDENT9_tree = (Object)adaptor.create(IDENT9);
			adaptor.addChild(root_0, IDENT9_tree);

			char_literal10=(Token)match(input,16,FOLLOW_16_in_program76); 
			char_literal10_tree = (Object)adaptor.create(char_literal10);
			adaptor.addChild(root_0, char_literal10_tree);

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


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:24:1: constant : 'constant' IDENT ':' type ':=' expression ';' ;
	public final orignParser.constant_return constant() throws RecognitionException {
		orignParser.constant_return retval = new orignParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal11=null;
		Token IDENT12=null;
		Token char_literal13=null;
		Token string_literal15=null;
		Token char_literal17=null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope expression16 =null;

		Object string_literal11_tree=null;
		Object IDENT12_tree=null;
		Object char_literal13_tree=null;
		Object string_literal15_tree=null;
		Object char_literal17_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:25:2: ( 'constant' IDENT ':' type ':=' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:25:3: 'constant' IDENT ':' type ':=' expression ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal11=(Token)match(input,29,FOLLOW_29_in_constant86); 
			string_literal11_tree = (Object)adaptor.create(string_literal11);
			adaptor.addChild(root_0, string_literal11_tree);

			IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_constant88); 
			IDENT12_tree = (Object)adaptor.create(IDENT12);
			adaptor.addChild(root_0, IDENT12_tree);

			char_literal13=(Token)match(input,18,FOLLOW_18_in_constant90); 
			char_literal13_tree = (Object)adaptor.create(char_literal13);
			adaptor.addChild(root_0, char_literal13_tree);

			pushFollow(FOLLOW_type_in_constant92);
			type14=type();
			state._fsp--;

			adaptor.addChild(root_0, type14.getTree());

			string_literal15=(Token)match(input,19,FOLLOW_19_in_constant94); 
			string_literal15_tree = (Object)adaptor.create(string_literal15);
			adaptor.addChild(root_0, string_literal15_tree);

			pushFollow(FOLLOW_expression_in_constant96);
			expression16=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression16.getTree());

			char_literal17=(Token)match(input,20,FOLLOW_20_in_constant98); 
			char_literal17_tree = (Object)adaptor.create(char_literal17);
			adaptor.addChild(root_0, char_literal17_tree);

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
	// $ANTLR end "constant"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:28:1: variable : 'var' IDENT ( ',' IDENT )* ':' type ( ':=' expression )* ';' ;
	public final orignParser.variable_return variable() throws RecognitionException {
		orignParser.variable_return retval = new orignParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token IDENT19=null;
		Token char_literal20=null;
		Token IDENT21=null;
		Token char_literal22=null;
		Token string_literal24=null;
		Token char_literal26=null;
		ParserRuleReturnScope type23 =null;
		ParserRuleReturnScope expression25 =null;

		Object string_literal18_tree=null;
		Object IDENT19_tree=null;
		Object char_literal20_tree=null;
		Object IDENT21_tree=null;
		Object char_literal22_tree=null;
		Object string_literal24_tree=null;
		Object char_literal26_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:2: ( 'var' IDENT ( ',' IDENT )* ':' type ( ':=' expression )* ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:3: 'var' IDENT ( ',' IDENT )* ':' type ( ':=' expression )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal18=(Token)match(input,42,FOLLOW_42_in_variable109); 
			string_literal18_tree = (Object)adaptor.create(string_literal18);
			adaptor.addChild(root_0, string_literal18_tree);

			IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable111); 
			IDENT19_tree = (Object)adaptor.create(IDENT19);
			adaptor.addChild(root_0, IDENT19_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:15: ( ',' IDENT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==14) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:16: ',' IDENT
					{
					char_literal20=(Token)match(input,14,FOLLOW_14_in_variable114); 
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);

					IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable116); 
					IDENT21_tree = (Object)adaptor.create(IDENT21);
					adaptor.addChild(root_0, IDENT21_tree);

					}
					break;

				default :
					break loop3;
				}
			}

			char_literal22=(Token)match(input,18,FOLLOW_18_in_variable120); 
			char_literal22_tree = (Object)adaptor.create(char_literal22);
			adaptor.addChild(root_0, char_literal22_tree);

			pushFollow(FOLLOW_type_in_variable122);
			type23=type();
			state._fsp--;

			adaptor.addChild(root_0, type23.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:37: ( ':=' expression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==19) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:29:38: ':=' expression
					{
					string_literal24=(Token)match(input,19,FOLLOW_19_in_variable125); 
					string_literal24_tree = (Object)adaptor.create(string_literal24);
					adaptor.addChild(root_0, string_literal24_tree);

					pushFollow(FOLLOW_expression_in_variable127);
					expression25=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression25.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal26=(Token)match(input,20,FOLLOW_20_in_variable131); 
			char_literal26_tree = (Object)adaptor.create(char_literal26);
			adaptor.addChild(root_0, char_literal26_tree);

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


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:32:1: function : 'function' IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* 'end' IDENT ;
	public final orignParser.function_return function() throws RecognitionException {
		orignParser.function_return retval = new orignParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token IDENT28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token char_literal32=null;
		Token string_literal35=null;
		Token IDENT36=null;
		ParserRuleReturnScope parameters30 =null;
		ParserRuleReturnScope variable33 =null;
		ParserRuleReturnScope statement34 =null;

		Object string_literal27_tree=null;
		Object IDENT28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object char_literal32_tree=null;
		Object string_literal35_tree=null;
		Object IDENT36_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:33:2: ( 'function' IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* 'end' IDENT )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:33:4: 'function' IDENT '(' ( parameters )? ')' '=' ( variable )* ( statement )* 'end' IDENT
			{
			root_0 = (Object)adaptor.nil();


			string_literal27=(Token)match(input,34,FOLLOW_34_in_function143); 
			string_literal27_tree = (Object)adaptor.create(string_literal27);
			adaptor.addChild(root_0, string_literal27_tree);

			IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_function145); 
			IDENT28_tree = (Object)adaptor.create(IDENT28);
			adaptor.addChild(root_0, IDENT28_tree);

			char_literal29=(Token)match(input,10,FOLLOW_10_in_function147); 
			char_literal29_tree = (Object)adaptor.create(char_literal29);
			adaptor.addChild(root_0, char_literal29_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:33:24: ( parameters )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:33:24: parameters
					{
					pushFollow(FOLLOW_parameters_in_function148);
					parameters30=parameters();
					state._fsp--;

					adaptor.addChild(root_0, parameters30.getTree());

					}
					break;

			}

			char_literal31=(Token)match(input,11,FOLLOW_11_in_function151); 
			char_literal31_tree = (Object)adaptor.create(char_literal31);
			adaptor.addChild(root_0, char_literal31_tree);

			char_literal32=(Token)match(input,23,FOLLOW_23_in_function153); 
			char_literal32_tree = (Object)adaptor.create(char_literal32);
			adaptor.addChild(root_0, char_literal32_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:34:3: ( variable )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==42) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:34:4: variable
					{
					pushFollow(FOLLOW_variable_in_function158);
					variable33=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable33.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:35:3: ( statement )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENT||(LA7_0 >= 35 && LA7_0 <= 36)||LA7_0==44) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:35:3: statement
					{
					pushFollow(FOLLOW_statement_in_function165);
					statement34=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement34.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			string_literal35=(Token)match(input,32,FOLLOW_32_in_function170); 
			string_literal35_tree = (Object)adaptor.create(string_literal35);
			adaptor.addChild(root_0, string_literal35_tree);

			IDENT36=(Token)match(input,IDENT,FOLLOW_IDENT_in_function172); 
			IDENT36_tree = (Object)adaptor.create(IDENT36);
			adaptor.addChild(root_0, IDENT36_tree);

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


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:39:1: type : 'Integer' ;
	public final orignParser.type_return type() throws RecognitionException {
		orignParser.type_return retval = new orignParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal37=null;

		Object string_literal37_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:40:2: ( 'Integer' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:40:4: 'Integer'
			{
			root_0 = (Object)adaptor.nil();


			string_literal37=(Token)match(input,26,FOLLOW_26_in_type185); 
			string_literal37_tree = (Object)adaptor.create(string_literal37);
			adaptor.addChild(root_0, string_literal37_tree);

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


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:44:1: statement : ( assignmentStatement | ifStatement | loopStatement | whileStatement );
	public final orignParser.statement_return statement() throws RecognitionException {
		orignParser.statement_return retval = new orignParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignmentStatement38 =null;
		ParserRuleReturnScope ifStatement39 =null;
		ParserRuleReturnScope loopStatement40 =null;
		ParserRuleReturnScope whileStatement41 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:45:2: ( assignmentStatement | ifStatement | loopStatement | whileStatement )
			int alt8=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt8=1;
				}
				break;
			case 35:
				{
				alt8=2;
				}
				break;
			case 36:
				{
				alt8=3;
				}
				break;
			case 44:
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
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:45:4: assignmentStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignmentStatement_in_statement197);
					assignmentStatement38=assignmentStatement();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStatement38.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:46:4: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement202);
					ifStatement39=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement39.getTree());

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:47:4: loopStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_loopStatement_in_statement207);
					loopStatement40=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement40.getTree());

					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:48:4: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement212);
					whileStatement41=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement41.getTree());

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


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:52:1: ifStatement : 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' ;
	public final orignParser.ifStatement_return ifStatement() throws RecognitionException {
		orignParser.ifStatement_return retval = new orignParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal42=null;
		Token string_literal44=null;
		Token string_literal46=null;
		Token string_literal48=null;
		Token string_literal50=null;
		Token string_literal52=null;
		Token string_literal53=null;
		Token char_literal54=null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope statement45 =null;
		ParserRuleReturnScope expression47 =null;
		ParserRuleReturnScope statement49 =null;
		ParserRuleReturnScope statement51 =null;

		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		Object string_literal46_tree=null;
		Object string_literal48_tree=null;
		Object string_literal50_tree=null;
		Object string_literal52_tree=null;
		Object string_literal53_tree=null;
		Object char_literal54_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:53:2: ( 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:53:4: 'if' expression 'then' ( statement )+ ( 'elseif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal42=(Token)match(input,35,FOLLOW_35_in_ifStatement226); 
			string_literal42_tree = (Object)adaptor.create(string_literal42);
			adaptor.addChild(root_0, string_literal42_tree);

			pushFollow(FOLLOW_expression_in_ifStatement228);
			expression43=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression43.getTree());

			string_literal44=(Token)match(input,41,FOLLOW_41_in_ifStatement230); 
			string_literal44_tree = (Object)adaptor.create(string_literal44);
			adaptor.addChild(root_0, string_literal44_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:53:27: ( statement )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==IDENT||(LA9_0 >= 35 && LA9_0 <= 36)||LA9_0==44) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:53:27: statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement232);
					statement45=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement45.getTree());

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:54:3: ( 'elseif' expression 'then' ( statement )+ )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==31) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:54:4: 'elseif' expression 'then' ( statement )+
					{
					string_literal46=(Token)match(input,31,FOLLOW_31_in_ifStatement238); 
					string_literal46_tree = (Object)adaptor.create(string_literal46);
					adaptor.addChild(root_0, string_literal46_tree);

					pushFollow(FOLLOW_expression_in_ifStatement240);
					expression47=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression47.getTree());

					string_literal48=(Token)match(input,41,FOLLOW_41_in_ifStatement242); 
					string_literal48_tree = (Object)adaptor.create(string_literal48);
					adaptor.addChild(root_0, string_literal48_tree);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:54:31: ( statement )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==IDENT||(LA10_0 >= 35 && LA10_0 <= 36)||LA10_0==44) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:54:31: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement244);
							statement49=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement49.getTree());

							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					}
					break;

				default :
					break loop11;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:55:3: ( 'else' ( statement )+ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==30) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:55:4: 'else' ( statement )+
					{
					string_literal50=(Token)match(input,30,FOLLOW_30_in_ifStatement252); 
					string_literal50_tree = (Object)adaptor.create(string_literal50);
					adaptor.addChild(root_0, string_literal50_tree);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:55:11: ( statement )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==IDENT||(LA12_0 >= 35 && LA12_0 <= 36)||LA12_0==44) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:55:11: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement254);
							statement51=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement51.getTree());

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

			}

			string_literal52=(Token)match(input,32,FOLLOW_32_in_ifStatement261); 
			string_literal52_tree = (Object)adaptor.create(string_literal52);
			adaptor.addChild(root_0, string_literal52_tree);

			string_literal53=(Token)match(input,35,FOLLOW_35_in_ifStatement263); 
			string_literal53_tree = (Object)adaptor.create(string_literal53);
			adaptor.addChild(root_0, string_literal53_tree);

			char_literal54=(Token)match(input,20,FOLLOW_20_in_ifStatement265); 
			char_literal54_tree = (Object)adaptor.create(char_literal54);
			adaptor.addChild(root_0, char_literal54_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:59:1: whileStatement : 'while' expression loopStatement ;
	public final orignParser.whileStatement_return whileStatement() throws RecognitionException {
		orignParser.whileStatement_return retval = new orignParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		ParserRuleReturnScope expression56 =null;
		ParserRuleReturnScope loopStatement57 =null;

		Object string_literal55_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:60:2: ( 'while' expression loopStatement )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:60:3: 'while' expression loopStatement
			{
			root_0 = (Object)adaptor.nil();


			string_literal55=(Token)match(input,44,FOLLOW_44_in_whileStatement276); 
			string_literal55_tree = (Object)adaptor.create(string_literal55);
			adaptor.addChild(root_0, string_literal55_tree);

			pushFollow(FOLLOW_expression_in_whileStatement278);
			expression56=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression56.getTree());

			pushFollow(FOLLOW_loopStatement_in_whileStatement280);
			loopStatement57=loopStatement();
			state._fsp--;

			adaptor.addChild(root_0, loopStatement57.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:63:1: loopStatement : 'loop' ( statement | exitStatement )* 'end' 'loop' ';' ;
	public final orignParser.loopStatement_return loopStatement() throws RecognitionException {
		orignParser.loopStatement_return retval = new orignParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;
		Token string_literal61=null;
		Token string_literal62=null;
		Token char_literal63=null;
		ParserRuleReturnScope statement59 =null;
		ParserRuleReturnScope exitStatement60 =null;

		Object string_literal58_tree=null;
		Object string_literal61_tree=null;
		Object string_literal62_tree=null;
		Object char_literal63_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:64:2: ( 'loop' ( statement | exitStatement )* 'end' 'loop' ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:64:4: 'loop' ( statement | exitStatement )* 'end' 'loop' ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal58=(Token)match(input,36,FOLLOW_36_in_loopStatement292); 
			string_literal58_tree = (Object)adaptor.create(string_literal58);
			adaptor.addChild(root_0, string_literal58_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:64:11: ( statement | exitStatement )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==IDENT||(LA14_0 >= 35 && LA14_0 <= 36)||LA14_0==44) ) {
					alt14=1;
				}
				else if ( (LA14_0==33) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:64:12: statement
					{
					pushFollow(FOLLOW_statement_in_loopStatement295);
					statement59=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement59.getTree());

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:64:22: exitStatement
					{
					pushFollow(FOLLOW_exitStatement_in_loopStatement297);
					exitStatement60=exitStatement();
					state._fsp--;

					adaptor.addChild(root_0, exitStatement60.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			string_literal61=(Token)match(input,32,FOLLOW_32_in_loopStatement301); 
			string_literal61_tree = (Object)adaptor.create(string_literal61);
			adaptor.addChild(root_0, string_literal61_tree);

			string_literal62=(Token)match(input,36,FOLLOW_36_in_loopStatement303); 
			string_literal62_tree = (Object)adaptor.create(string_literal62);
			adaptor.addChild(root_0, string_literal62_tree);

			char_literal63=(Token)match(input,20,FOLLOW_20_in_loopStatement305); 
			char_literal63_tree = (Object)adaptor.create(char_literal63);
			adaptor.addChild(root_0, char_literal63_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:67:1: exitStatement : 'exit' 'when' expression ';' ;
	public final orignParser.exitStatement_return exitStatement() throws RecognitionException {
		orignParser.exitStatement_return retval = new orignParser.exitStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal64=null;
		Token string_literal65=null;
		Token char_literal67=null;
		ParserRuleReturnScope expression66 =null;

		Object string_literal64_tree=null;
		Object string_literal65_tree=null;
		Object char_literal67_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:68:2: ( 'exit' 'when' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:68:4: 'exit' 'when' expression ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal64=(Token)match(input,33,FOLLOW_33_in_exitStatement317); 
			string_literal64_tree = (Object)adaptor.create(string_literal64);
			adaptor.addChild(root_0, string_literal64_tree);

			string_literal65=(Token)match(input,43,FOLLOW_43_in_exitStatement319); 
			string_literal65_tree = (Object)adaptor.create(string_literal65);
			adaptor.addChild(root_0, string_literal65_tree);

			pushFollow(FOLLOW_expression_in_exitStatement321);
			expression66=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression66.getTree());

			char_literal67=(Token)match(input,20,FOLLOW_20_in_exitStatement323); 
			char_literal67_tree = (Object)adaptor.create(char_literal67);
			adaptor.addChild(root_0, char_literal67_tree);

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:71:1: assignmentStatement : IDENT ':=' expression ';' ;
	public final orignParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
		orignParser.assignmentStatement_return retval = new orignParser.assignmentStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT68=null;
		Token string_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope expression70 =null;

		Object IDENT68_tree=null;
		Object string_literal69_tree=null;
		Object char_literal71_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:72:2: ( IDENT ':=' expression ';' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:72:4: IDENT ':=' expression ';'
			{
			root_0 = (Object)adaptor.nil();


			IDENT68=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement335); 
			IDENT68_tree = (Object)adaptor.create(IDENT68);
			adaptor.addChild(root_0, IDENT68_tree);

			string_literal69=(Token)match(input,19,FOLLOW_19_in_assignmentStatement337); 
			string_literal69_tree = (Object)adaptor.create(string_literal69);
			adaptor.addChild(root_0, string_literal69_tree);

			pushFollow(FOLLOW_expression_in_assignmentStatement339);
			expression70=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression70.getTree());

			char_literal71=(Token)match(input,20,FOLLOW_20_in_assignmentStatement341); 
			char_literal71_tree = (Object)adaptor.create(char_literal71);
			adaptor.addChild(root_0, char_literal71_tree);

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


	public static class parameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:78:1: parameters : parameter ( ',' parameter )* ;
	public final orignParser.parameters_return parameters() throws RecognitionException {
		orignParser.parameters_return retval = new orignParser.parameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal73=null;
		ParserRuleReturnScope parameter72 =null;
		ParserRuleReturnScope parameter74 =null;

		Object char_literal73_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:79:2: ( parameter ( ',' parameter )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:79:4: parameter ( ',' parameter )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_parameter_in_parameters359);
			parameter72=parameter();
			state._fsp--;

			adaptor.addChild(root_0, parameter72.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:79:14: ( ',' parameter )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==14) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:79:15: ',' parameter
					{
					char_literal73=(Token)match(input,14,FOLLOW_14_in_parameters362); 
					char_literal73_tree = (Object)adaptor.create(char_literal73);
					adaptor.addChild(root_0, char_literal73_tree);

					pushFollow(FOLLOW_parameter_in_parameters364);
					parameter74=parameter();
					state._fsp--;

					adaptor.addChild(root_0, parameter74.getTree());

					}
					break;

				default :
					break loop15;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:82:1: parameter : IDENT ':' type ( ':=' expression )? ;
	public final orignParser.parameter_return parameter() throws RecognitionException {
		orignParser.parameter_return retval = new orignParser.parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT75=null;
		Token char_literal76=null;
		Token string_literal78=null;
		ParserRuleReturnScope type77 =null;
		ParserRuleReturnScope expression79 =null;

		Object IDENT75_tree=null;
		Object char_literal76_tree=null;
		Object string_literal78_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:83:2: ( IDENT ':' type ( ':=' expression )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:83:4: IDENT ':' type ( ':=' expression )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter378); 
			IDENT75_tree = (Object)adaptor.create(IDENT75);
			adaptor.addChild(root_0, IDENT75_tree);

			char_literal76=(Token)match(input,18,FOLLOW_18_in_parameter380); 
			char_literal76_tree = (Object)adaptor.create(char_literal76);
			adaptor.addChild(root_0, char_literal76_tree);

			pushFollow(FOLLOW_type_in_parameter382);
			type77=type();
			state._fsp--;

			adaptor.addChild(root_0, type77.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:83:19: ( ':=' expression )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==19) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:83:20: ':=' expression
					{
					string_literal78=(Token)match(input,19,FOLLOW_19_in_parameter385); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					pushFollow(FOLLOW_expression_in_parameter387);
					expression79=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression79.getTree());

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
	// $ANTLR end "parameter"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:88:1: term : ( IDENT | '(' expression ')' | INTEGER );
	public final orignParser.term_return term() throws RecognitionException {
		orignParser.term_return retval = new orignParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token INTEGER84=null;
		ParserRuleReturnScope expression82 =null;

		Object IDENT80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object INTEGER84_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:89:2: ( IDENT | '(' expression ')' | INTEGER )
			int alt17=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt17=1;
				}
				break;
			case 10:
				{
				alt17=2;
				}
				break;
			case INTEGER:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:89:4: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT80=(Token)match(input,IDENT,FOLLOW_IDENT_in_term404); 
					IDENT80_tree = (Object)adaptor.create(IDENT80);
					adaptor.addChild(root_0, IDENT80_tree);

					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:90:4: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal81=(Token)match(input,10,FOLLOW_10_in_term409); 
					char_literal81_tree = (Object)adaptor.create(char_literal81);
					adaptor.addChild(root_0, char_literal81_tree);

					pushFollow(FOLLOW_expression_in_term411);
					expression82=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression82.getTree());

					char_literal83=(Token)match(input,11,FOLLOW_11_in_term413); 
					char_literal83_tree = (Object)adaptor.create(char_literal83);
					adaptor.addChild(root_0, char_literal83_tree);

					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:91:4: INTEGER
					{
					root_0 = (Object)adaptor.nil();


					INTEGER84=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term418); 
					INTEGER84_tree = (Object)adaptor.create(INTEGER84);
					adaptor.addChild(root_0, INTEGER84_tree);

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


	public static class negation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:94:1: negation : ( 'not' )* term ;
	public final orignParser.negation_return negation() throws RecognitionException {
		orignParser.negation_return retval = new orignParser.negation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal85=null;
		ParserRuleReturnScope term86 =null;

		Object string_literal85_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:95:2: ( ( 'not' )* term )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:95:4: ( 'not' )* term
			{
			root_0 = (Object)adaptor.nil();


			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:95:4: ( 'not' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==38) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:95:4: 'not'
					{
					string_literal85=(Token)match(input,38,FOLLOW_38_in_negation430); 
					string_literal85_tree = (Object)adaptor.create(string_literal85);
					adaptor.addChild(root_0, string_literal85_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			pushFollow(FOLLOW_term_in_negation433);
			term86=term();
			state._fsp--;

			adaptor.addChild(root_0, term86.getTree());

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
	// $ANTLR end "negation"


	public static class unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:98:1: unary : ( '+' | '-' )* negation ;
	public final orignParser.unary_return unary() throws RecognitionException {
		orignParser.unary_return retval = new orignParser.unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set87=null;
		ParserRuleReturnScope negation88 =null;

		Object set87_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:99:2: ( ( '+' | '-' )* negation )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:99:4: ( '+' | '-' )* negation
			{
			root_0 = (Object)adaptor.nil();


			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:99:4: ( '+' | '-' )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==13||LA19_0==15) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:
					{
					set87=input.LT(1);
					if ( input.LA(1)==13||input.LA(1)==15 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set87));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop19;
				}
			}

			pushFollow(FOLLOW_negation_in_unary453);
			negation88=negation();
			state._fsp--;

			adaptor.addChild(root_0, negation88.getTree());

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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:102:1: mult : unary ( ( '*' | '/' | 'mod' ) unary )* ;
	public final orignParser.mult_return mult() throws RecognitionException {
		orignParser.mult_return retval = new orignParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set90=null;
		ParserRuleReturnScope unary89 =null;
		ParserRuleReturnScope unary91 =null;

		Object set90_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:103:2: ( unary ( ( '*' | '/' | 'mod' ) unary )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:103:4: unary ( ( '*' | '/' | 'mod' ) unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult464);
			unary89=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary89.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:103:9: ( ( '*' | '/' | 'mod' ) unary )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==12||LA20_0==17||LA20_0==37) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:103:10: ( '*' | '/' | 'mod' ) unary
					{
					set90=input.LT(1);
					if ( input.LA(1)==12||input.LA(1)==17||input.LA(1)==37 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set90));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unary_in_mult478);
					unary91=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary91.getTree());

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
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add"
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:106:1: add : mult ( ( '+' | '-' ) mult )* ;
	public final orignParser.add_return add() throws RecognitionException {
		orignParser.add_return retval = new orignParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set93=null;
		ParserRuleReturnScope mult92 =null;
		ParserRuleReturnScope mult94 =null;

		Object set93_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:107:2: ( mult ( ( '+' | '-' ) mult )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:107:4: mult ( ( '+' | '-' ) mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add492);
			mult92=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult92.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:107:9: ( ( '+' | '-' ) mult )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==13||LA21_0==15) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:107:10: ( '+' | '-' ) mult
					{
					set93=input.LT(1);
					if ( input.LA(1)==13||input.LA(1)==15 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set93));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add504);
					mult94=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult94.getTree());

					}
					break;

				default :
					break loop21;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:110:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
	public final orignParser.relation_return relation() throws RecognitionException {
		orignParser.relation_return retval = new orignParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set96=null;
		ParserRuleReturnScope add95 =null;
		ParserRuleReturnScope add97 =null;

		Object set96_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:111:2: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:111:4: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_relation518);
			add95=add();
			state._fsp--;

			adaptor.addChild(root_0, add95.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:111:8: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==9||(LA22_0 >= 21 && LA22_0 <= 25)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:111:9: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
					{
					set96=input.LT(1);
					if ( input.LA(1)==9||(input.LA(1) >= 21 && input.LA(1) <= 25) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set96));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_relation545);
					add97=add();
					state._fsp--;

					adaptor.addChild(root_0, add97.getTree());

					}
					break;

				default :
					break loop22;
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
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:114:1: expression : relation ( ( 'and' | 'or' ) relation )* ;
	public final orignParser.expression_return expression() throws RecognitionException {
		orignParser.expression_return retval = new orignParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set99=null;
		ParserRuleReturnScope relation98 =null;
		ParserRuleReturnScope relation100 =null;

		Object set99_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:115:2: ( relation ( ( 'and' | 'or' ) relation )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:115:3: relation ( ( 'and' | 'or' ) relation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relation_in_expression558);
			relation98=relation();
			state._fsp--;

			adaptor.addChild(root_0, relation98.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:115:12: ( ( 'and' | 'or' ) relation )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==27||LA23_0==39) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/orign.g:115:13: ( 'and' | 'or' ) relation
					{
					set99=input.LT(1);
					if ( input.LA(1)==27||input.LA(1)==39 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set99));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relation_in_expression569);
					relation100=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation100.getTree());

					}
					break;

				default :
					break loop23;
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

	// Delegated rules



	public static final BitSet FOLLOW_40_in_program46 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_program48 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program50 = new BitSet(new long[]{0x0000040030000000L});
	public static final BitSet FOLLOW_constant_in_program54 = new BitSet(new long[]{0x0000040030000000L});
	public static final BitSet FOLLOW_variable_in_program58 = new BitSet(new long[]{0x0000040030000000L});
	public static final BitSet FOLLOW_28_in_program65 = new BitSet(new long[]{0x0000101900000020L});
	public static final BitSet FOLLOW_statement_in_program68 = new BitSet(new long[]{0x0000101900000020L});
	public static final BitSet FOLLOW_32_in_program72 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_program74 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_program76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_constant86 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_constant88 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_constant90 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_constant92 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_constant94 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_constant96 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_constant98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_variable109 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_variable111 = new BitSet(new long[]{0x0000000000044000L});
	public static final BitSet FOLLOW_14_in_variable114 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_variable116 = new BitSet(new long[]{0x0000000000044000L});
	public static final BitSet FOLLOW_18_in_variable120 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_variable122 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_19_in_variable125 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_variable127 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_20_in_variable131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_function143 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_function145 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_function147 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_parameters_in_function148 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_function151 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_function153 = new BitSet(new long[]{0x0000141900000020L});
	public static final BitSet FOLLOW_variable_in_function158 = new BitSet(new long[]{0x0000141900000020L});
	public static final BitSet FOLLOW_statement_in_function165 = new BitSet(new long[]{0x0000101900000020L});
	public static final BitSet FOLLOW_32_in_function170 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_function172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_type185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_ifStatement226 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_ifStatement228 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ifStatement230 = new BitSet(new long[]{0x0000101800000020L});
	public static final BitSet FOLLOW_statement_in_ifStatement232 = new BitSet(new long[]{0x00001019C0000020L});
	public static final BitSet FOLLOW_31_in_ifStatement238 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_ifStatement240 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ifStatement242 = new BitSet(new long[]{0x0000101800000020L});
	public static final BitSet FOLLOW_statement_in_ifStatement244 = new BitSet(new long[]{0x00001019C0000020L});
	public static final BitSet FOLLOW_30_in_ifStatement252 = new BitSet(new long[]{0x0000101800000020L});
	public static final BitSet FOLLOW_statement_in_ifStatement254 = new BitSet(new long[]{0x0000101900000020L});
	public static final BitSet FOLLOW_32_in_ifStatement261 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ifStatement263 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifStatement265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_whileStatement276 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_whileStatement278 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_loopStatement_in_whileStatement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_loopStatement292 = new BitSet(new long[]{0x0000101B00000020L});
	public static final BitSet FOLLOW_statement_in_loopStatement295 = new BitSet(new long[]{0x0000101B00000020L});
	public static final BitSet FOLLOW_exitStatement_in_loopStatement297 = new BitSet(new long[]{0x0000101B00000020L});
	public static final BitSet FOLLOW_32_in_loopStatement301 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_loopStatement303 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_loopStatement305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exitStatement317 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exitStatement319 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_exitStatement321 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_exitStatement323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStatement335 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_assignmentStatement337 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement339 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignmentStatement341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameters359 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_parameters362 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_in_parameters364 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_IDENT_in_parameter378 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parameter380 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_parameter382 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_parameter385 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_parameter387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_term409 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_expression_in_term411 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_term413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_negation430 = new BitSet(new long[]{0x0000004000000460L});
	public static final BitSet FOLLOW_term_in_negation433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_in_unary453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult464 = new BitSet(new long[]{0x0000002000021002L});
	public static final BitSet FOLLOW_set_in_mult466 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_unary_in_mult478 = new BitSet(new long[]{0x0000002000021002L});
	public static final BitSet FOLLOW_mult_in_add492 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_set_in_add495 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_mult_in_add504 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_add_in_relation518 = new BitSet(new long[]{0x0000000003E00202L});
	public static final BitSet FOLLOW_set_in_relation521 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_add_in_relation545 = new BitSet(new long[]{0x0000000003E00202L});
	public static final BitSet FOLLOW_relation_in_expression558 = new BitSet(new long[]{0x0000008008000002L});
	public static final BitSet FOLLOW_set_in_expression561 = new BitSet(new long[]{0x000000400000A460L});
	public static final BitSet FOLLOW_relation_in_expression569 = new BitSet(new long[]{0x0000008008000002L});
}
