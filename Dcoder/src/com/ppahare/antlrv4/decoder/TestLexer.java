// Generated from Test.g4 by ANTLR 4.2.2

package com.ppahare.antlrv4.decoder;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TWODIGIT=1, PRE=2, SUFF=3, DIGIT=4, HEX=5, ALPHA=6, NEWLINE=7, UNDERSCORE=8, 
		HYPHEN=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TWODIGIT", "'-26-23'", "'-3b'", "DIGIT", "HEX", "ALPHA", "'\n'", "'_'", 
		"'-'"
	};
	public static final String[] ruleNames = {
		"TWODIGIT", "PRE", "SUFF", "DIGIT", "HEX", "ALPHA", "NEWLINE", "UNDERSCORE", 
		"HYPHEN"
	};


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5%\n\5\r\5\16"+
		"\5&\3\6\3\6\3\7\6\7,\n\7\r\7\16\7-\3\b\3\b\3\t\3\t\3\n\3\n\2\2\13\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\3\4\2\62;c|\66\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\30\3\2\2\2\7\37\3\2\2\2\t"+
		"$\3\2\2\2\13(\3\2\2\2\r+\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2"+
		"\2\25\26\5\13\6\2\26\27\5\13\6\2\27\4\3\2\2\2\30\31\7/\2\2\31\32\7\64"+
		"\2\2\32\33\78\2\2\33\34\7/\2\2\34\35\7\64\2\2\35\36\7\65\2\2\36\6\3\2"+
		"\2\2\37 \7/\2\2 !\7\65\2\2!\"\7d\2\2\"\b\3\2\2\2#%\4\62;\2$#\3\2\2\2%"+
		"&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\n\3\2\2\2()\t\2\2\2)\f\3\2\2\2*,\4c|"+
		"\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\16\3\2\2\2/\60\7\f\2\2\60"+
		"\20\3\2\2\2\61\62\7a\2\2\62\22\3\2\2\2\63\64\7/\2\2\64\24\3\2\2\2\5\2"+
		"&-\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}