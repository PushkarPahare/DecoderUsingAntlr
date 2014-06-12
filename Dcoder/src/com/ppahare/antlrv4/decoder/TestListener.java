// Generated from Test.g4 by ANTLR 4.2.2

package com.ppahare.antlrv4.decoder;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull TestParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull TestParser.DigitContext ctx);

	/**
	 * Enter a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull TestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull TestParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link TestParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(@NotNull TestParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(@NotNull TestParser.LetterContext ctx);

	/**
	 * Enter a parse tree produced by {@link TestParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(@NotNull TestParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(@NotNull TestParser.UnicodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TestParser#nondigit}.
	 * @param ctx the parse tree
	 */
	void enterNondigit(@NotNull TestParser.NondigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#nondigit}.
	 * @param ctx the parse tree
	 */
	void exitNondigit(@NotNull TestParser.NondigitContext ctx);

	/**
	 * Enter a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull TestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull TestParser.ExprContext ctx);
}