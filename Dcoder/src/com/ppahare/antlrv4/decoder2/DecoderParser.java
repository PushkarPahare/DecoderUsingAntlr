// Generated from Decoder.g4 by ANTLR 4.2.2

package com.ppahare.antlrv4.decoder2;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecoderParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNICODE=1, NONDIGIT=2, LETTER=3, UNDERSCORE=4, PRE=5, SUFF=6, NEWLINE=7;
	public static final String[] tokenNames = {
		"<INVALID>", "UNICODE", "NONDIGIT", "LETTER", "'_'", "'-26-23'", "'-3b'", 
		"'\n'"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"prog", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Decoder.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public String value = "";
		public ExprContext n;
		public List<TerminalNode> NEWLINE() { return getTokens(DecoderParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DecoderParser.NEWLINE, i);
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
			if ( listener instanceof DecoderListener ) ((DecoderListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecoderListener ) ((DecoderListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNICODE) | (1L << NONDIGIT) | (1L << LETTER) | (1L << UNDERSCORE))) != 0)) {
				{
				{
				setState(4); ((ProgContext)_localctx).n = expr();
				_localctx.value += (((ProgContext)_localctx).n.value);
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(12); match(NEWLINE);
				}
				}
				setState(17);
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
		public Token n1;
		public Token n2;
		public Token n3;
		public TerminalNode UNDERSCORE() { return getToken(DecoderParser.UNDERSCORE, 0); }
		public TerminalNode LETTER() { return getToken(DecoderParser.LETTER, 0); }
		public TerminalNode UNICODE() { return getToken(DecoderParser.UNICODE, 0); }
		public TerminalNode NONDIGIT() { return getToken(DecoderParser.NONDIGIT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecoderListener ) ((DecoderListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecoderListener ) ((DecoderListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); ((ExprContext)_localctx).n0 = match(UNDERSCORE);
				((ExprContext)_localctx).value =  " ";
				}
				break;
			case UNICODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); ((ExprContext)_localctx).n1 = match(UNICODE);
				String x = ((((ExprContext)_localctx).n1!=null?((ExprContext)_localctx).n1.getText():null));
				x = x.replace("-26-23","").replace("-3b","");
				((ExprContext)_localctx).value =   Character.toString((char)Integer.parseInt(x));
				}
				break;
			case NONDIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(22); ((ExprContext)_localctx).n2 = match(NONDIGIT);
				String x = (((ExprContext)_localctx).n2!=null?((ExprContext)_localctx).n2.getText():null);
				x = x.replace("-","");
				((ExprContext)_localctx).value = "" +  (char)Integer.parseInt(x,16);
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(24); ((ExprContext)_localctx).n3 = match(LETTER);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).n3!=null?((ExprContext)_localctx).n3.getText():null);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\37\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\7\2\20\n\2\f\2\16\2\23"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\2\2\4\2\4\2\2!\2"+
		"\13\3\2\2\2\4\34\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\n\3\2\2\2\t\6\3\2\2"+
		"\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\21\3\2\2\2\r\13\3\2\2\2\16"+
		"\20\7\t\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\3\3\2\2\2\23\21\3\2\2\2\24\25\7\6\2\2\25\35\b\3\1\2\26\27\7\3\2\2\27"+
		"\35\b\3\1\2\30\31\7\4\2\2\31\35\b\3\1\2\32\33\7\5\2\2\33\35\b\3\1\2\34"+
		"\24\3\2\2\2\34\26\3\2\2\2\34\30\3\2\2\2\34\32\3\2\2\2\35\5\3\2\2\2\5\13"+
		"\21\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}