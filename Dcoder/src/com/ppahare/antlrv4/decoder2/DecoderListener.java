// Generated from Decoder.g4 by ANTLR 4.2.2

package com.ppahare.antlrv4.decoder2;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecoderParser}.
 */
public interface DecoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecoderParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull DecoderParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecoderParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull DecoderParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DecoderParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DecoderParser.ExprContext ctx);
}