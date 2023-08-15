// Generated from c:\Users\Usuario\Desktop\FACULTAD\Finales\TC\proyectofinal\src\main\java\proyectofinal\id.g4 by ANTLR 4.9.2

  package proyectofinal;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link idParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface idVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link idParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(idParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(idParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(idParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(idParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declararAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararAsignacion(idParser.DeclararAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declararSinAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararSinAsignacion(idParser.DeclararSinAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(idParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operadoresNumericos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoresNumericos(idParser.OperadoresNumericosContext ctx);
}