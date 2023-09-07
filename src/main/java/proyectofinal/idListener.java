// Generated from c:\Users\Usuario\Desktop\FACULTAD\Finales\TC\proyectofinal\src\main\java\proyectofinal\id.g4 by ANTLR 4.9.2

  package proyectofinal;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idParser}.
 */
public interface idListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(idParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(idParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(idParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(idParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(idParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(idParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#typesFunciones}.
	 * @param ctx the parse tree
	 */
	void enterTypesFunciones(idParser.TypesFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#typesFunciones}.
	 * @param ctx the parse tree
	 */
	void exitTypesFunciones(idParser.TypesFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(idParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(idParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operacionesaritlogicas}.
	 * @param ctx the parse tree
	 */
	void enterOperacionesaritlogicas(idParser.OperacionesaritlogicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operacionesaritlogicas}.
	 * @param ctx the parse tree
	 */
	void exitOperacionesaritlogicas(idParser.OperacionesaritlogicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(idParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(idParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(idParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(idParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(idParser.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(idParser.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(idParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(idParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declararAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclararAsignacion(idParser.DeclararAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declararAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclararAsignacion(idParser.DeclararAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declararSinAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclararSinAsignacion(idParser.DeclararSinAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declararSinAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclararSinAsignacion(idParser.DeclararSinAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(idParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(idParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operadoresNumericos}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresNumericos(idParser.OperadoresNumericosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operadoresNumericos}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresNumericos(idParser.OperadoresNumericosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracionFuncion_Nombre}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion_Nombre(idParser.DeclaracionFuncion_NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracionFuncion_Nombre}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion_Nombre(idParser.DeclaracionFuncion_NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(idParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(idParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#parametrosDeclaracionConcatenados}.
	 * @param ctx the parse tree
	 */
	void enterParametrosDeclaracionConcatenados(idParser.ParametrosDeclaracionConcatenadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametrosDeclaracionConcatenados}.
	 * @param ctx the parse tree
	 */
	void exitParametrosDeclaracionConcatenados(idParser.ParametrosDeclaracionConcatenadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracionFuncion_parametros}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion_parametros(idParser.DeclaracionFuncion_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracionFuncion_parametros}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion_parametros(idParser.DeclaracionFuncion_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(idParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(idParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#parametrosLlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterParametrosLlamadaFuncion(idParser.ParametrosLlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametrosLlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitParametrosLlamadaFuncion(idParser.ParametrosLlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#parametrosConcatenados}.
	 * @param ctx the parse tree
	 */
	void enterParametrosConcatenados(idParser.ParametrosConcatenadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametrosConcatenados}.
	 * @param ctx the parse tree
	 */
	void exitParametrosConcatenados(idParser.ParametrosConcatenadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicionFuncion_parametro_nombre}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion_parametro_nombre(idParser.DefinicionFuncion_parametro_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicionFuncion_parametro_nombre}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion_parametro_nombre(idParser.DefinicionFuncion_parametro_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicionFuncion_Nombre}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion_Nombre(idParser.DefinicionFuncion_NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicionFuncion_Nombre}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion_Nombre(idParser.DefinicionFuncion_NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#defincionFuncion_parametros_global_rule}.
	 * @param ctx the parse tree
	 */
	void enterDefincionFuncion_parametros_global_rule(idParser.DefincionFuncion_parametros_global_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#defincionFuncion_parametros_global_rule}.
	 * @param ctx the parse tree
	 */
	void exitDefincionFuncion_parametros_global_rule(idParser.DefincionFuncion_parametros_global_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicionFuncion_parametros_internal_rule}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion_parametros_internal_rule(idParser.DefinicionFuncion_parametros_internal_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicionFuncion_parametros_internal_rule}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion_parametros_internal_rule(idParser.DefinicionFuncion_parametros_internal_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#defincionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefincionFuncion(idParser.DefincionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#defincionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefincionFuncion(idParser.DefincionFuncionContext ctx);
}