// Generated from Test.g4 by ANTLR 4.2.2

package com.ppahare.antlrv4.decoder;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TWODIGIT=1, PRE=2, SUFF=3, DIGIT=4, HEX=5, ALPHA=6, NEWLINE=7, UNDERSCORE=8, 
		HYPHEN=9;
	public static final String[] tokenNames = {
		"<INVALID>", "TWODIGIT", "'-26-23'", "'-3b'", "DIGIT", "HEX", "ALPHA", 
		"'\n'", "'_'", "'-'"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_unicode = 2, RULE_nondigit = 3, RULE_letter = 4, 
		RULE_digit = 5;
	public static final String[] ruleNames = {
		"prog", "expr", "unicode", "nondigit", "letter", "digit"
	};

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public String value = "";
		public ExprContext n;
		public List<TerminalNode> NEWLINE() { return getTokens(TestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TestParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRE) | (1L << DIGIT) | (1L << ALPHA) | (1L << UNDERSCORE) | (1L << HYPHEN))) != 0)) {
				{
				{
				setState(12); ((ProgContext)_localctx).n = expr();
				_localctx.value += (((ProgContext)_localctx).n.value);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(20); match(NEWLINE);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String value;
		public Token n0;
		public UnicodeContext n1;
		public NondigitContext n2;
		public LetterContext n3;
		public DigitContext n4;
		public UnicodeContext unicode() {
			return getRuleContext(UnicodeContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(TestParser.UNDERSCORE, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public NondigitContext nondigit() {
			return getRuleContext(NondigitContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); ((ExprContext)_localctx).n0 = match(UNDERSCORE);
				((ExprContext)_localctx).value =  " ";
				}
				break;
			case PRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); ((ExprContext)_localctx).n1 = unicode();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).n1.value;
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(31); ((ExprContext)_localctx).n2 = nondigit();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).n2.value;
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); ((ExprContext)_localctx).n3 = letter();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).n3.value;
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(37); ((ExprContext)_localctx).n4 = digit();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).n4.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnicodeContext extends ParserRuleContext {
		public String value;
		public Token DIGIT;
		public TerminalNode PRE() { return getToken(TestParser.PRE, 0); }
		public TerminalNode DIGIT() { return getToken(TestParser.DIGIT, 0); }
		public TerminalNode SUFF() { return getToken(TestParser.SUFF, 0); }
		public UnicodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterUnicode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitUnicode(this);
		}
	}

	public final UnicodeContext unicode() throws RecognitionException {
		UnicodeContext _localctx = new UnicodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unicode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(PRE);
			{
			setState(43); ((UnicodeContext)_localctx).DIGIT = match(DIGIT);
			((UnicodeContext)_localctx).value =  Character.toString((char)Integer.parseInt((((UnicodeContext)_localctx).DIGIT!=null?((UnicodeContext)_localctx).DIGIT.getText():null)));
			}
			setState(46); match(SUFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NondigitContext extends ParserRuleContext {
		public String value;
		public Token TWODIGIT;
		public TerminalNode HYPHEN() { return getToken(TestParser.HYPHEN, 0); }
		public TerminalNode TWODIGIT() { return getToken(TestParser.TWODIGIT, 0); }
		public NondigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterNondigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitNondigit(this);
		}
	}

	public final NondigitContext nondigit() throws RecognitionException {
		NondigitContext _localctx = new NondigitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nondigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(HYPHEN);
			{
			setState(49); ((NondigitContext)_localctx).TWODIGIT = match(TWODIGIT);
			((NondigitContext)_localctx).value =  ""+ (char)Integer.parseInt((((NondigitContext)_localctx).TWODIGIT!=null?((NondigitContext)_localctx).TWODIGIT.getText():null),16);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterContext extends ParserRuleContext {
		public String value;
		public Token ALPHA;
		public TerminalNode ALPHA() { return getToken(TestParser.ALPHA, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((LetterContext)_localctx).ALPHA = match(ALPHA);
			((LetterContext)_localctx).value =  (((LetterContext)_localctx).ALPHA!=null?((LetterContext)_localctx).ALPHA.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public String value;
		public Token DIGIT;
		public TerminalNode DIGIT() { return getToken(TestParser.DIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ((DigitContext)_localctx).DIGIT = match(DIGIT);
			((DigitContext)_localctx).value =  (((DigitContext)_localctx).DIGIT!=null?((DigitContext)_localctx).DIGIT.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2<\2\23\3\2\2\2\4"+
		"*\3\2\2\2\6,\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16\17\5\4\3"+
		"\2\17\20\b\2\1\2\20\22\3\2\2\2\21\16\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2"+
		"\2\23\24\3\2\2\2\24\31\3\2\2\2\25\23\3\2\2\2\26\30\7\t\2\2\27\26\3\2\2"+
		"\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2"+
		"\2\34\35\7\n\2\2\35+\b\3\1\2\36\37\5\6\4\2\37 \b\3\1\2 +\3\2\2\2!\"\5"+
		"\b\5\2\"#\b\3\1\2#+\3\2\2\2$%\5\n\6\2%&\b\3\1\2&+\3\2\2\2\'(\5\f\7\2("+
		")\b\3\1\2)+\3\2\2\2*\34\3\2\2\2*\36\3\2\2\2*!\3\2\2\2*$\3\2\2\2*\'\3\2"+
		"\2\2+\5\3\2\2\2,-\7\4\2\2-.\7\6\2\2./\b\4\1\2/\60\3\2\2\2\60\61\7\5\2"+
		"\2\61\7\3\2\2\2\62\63\7\13\2\2\63\64\7\3\2\2\64\65\b\5\1\2\65\t\3\2\2"+
		"\2\66\67\7\b\2\2\678\b\6\1\28\13\3\2\2\29:\7\6\2\2:;\b\7\1\2;\r\3\2\2"+
		"\2\5\23\31*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}