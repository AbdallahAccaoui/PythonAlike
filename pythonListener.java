// Generated from python.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(pythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(pythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comprehension}.
	 * @param ctx the parse tree
	 */
	void enterComprehension(pythonParser.ComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comprehension}.
	 * @param ctx the parse tree
	 */
	void exitComprehension(pythonParser.ComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#slicing}.
	 * @param ctx the parse tree
	 */
	void enterSlicing(pythonParser.SlicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#slicing}.
	 * @param ctx the parse tree
	 */
	void exitSlicing(pythonParser.SlicingContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(pythonParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(pythonParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#appendInsertRemove}.
	 * @param ctx the parse tree
	 */
	void enterAppendInsertRemove(pythonParser.AppendInsertRemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#appendInsertRemove}.
	 * @param ctx the parse tree
	 */
	void exitAppendInsertRemove(pythonParser.AppendInsertRemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(pythonParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(pythonParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(pythonParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(pythonParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(pythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(pythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(pythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(pythonParser.ValueContext ctx);
}