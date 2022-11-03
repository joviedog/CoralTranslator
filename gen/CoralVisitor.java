// Generated from C:/Users/Juan/Documents/TraductorCoral/grammar\Coral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoralParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoralVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoralParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(CoralParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CoralParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(CoralParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#id_asg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_asg(CoralParser.Id_asgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(CoralParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CoralParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CoralParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CoralParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalida(CoralParser.SalidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#seedrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeedrn(CoralParser.SeedrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica_for(CoralParser.Expresion_aritmetica_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asgEntrada}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgEntrada(CoralParser.AsgEntradaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asgParentesis}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgParentesis(CoralParser.AsgParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(CoralParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_size}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_size(CoralParser.Array_sizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code std_variable}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStd_variable(CoralParser.Std_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica(CoralParser.Expresion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica2(CoralParser.Expresion_aritmetica2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica3(CoralParser.Expresion_aritmetica3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica4(CoralParser.Expresion_aritmetica4Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica5(CoralParser.Expresion_aritmetica5Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno(CoralParser.SignoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#operadores_mat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores_mat1(CoralParser.Operadores_mat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#operadores_mat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores_mat2(CoralParser.Operadores_mat2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(CoralParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(CoralParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_number}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_number(CoralParser.Id_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqRoot}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqRoot(CoralParser.SqRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absValue}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsValue(CoralParser.AbsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rtp}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtp(CoralParser.RtpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ranum}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanum(CoralParser.RanumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#params_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_function_call(CoralParser.Params_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#mas_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMas_params(CoralParser.Mas_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_arit}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_arit(CoralParser.Exp_aritContext ctx);
	/**
	 * Visit a parse tree produced by the {@code data_capture}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_capture(CoralParser.Data_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#continua_programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinua_programa(CoralParser.Continua_programaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#complemento_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplemento_id(CoralParser.Complemento_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOutput(CoralParser.StringOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOutput(CoralParser.NumberOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code precisionOutput}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecisionOutput(CoralParser.PrecisionOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilonSalida}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilonSalida(CoralParser.EpsilonSalidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#expresion_aritmetica_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica_precision(CoralParser.Expresion_aritmetica_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(CoralParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#es_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEs_arreglo(CoralParser.Es_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#tamano_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamano_arreglo(CoralParser.Tamano_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cuerpo_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_control(CoralParser.Cuerpo_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#nested_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_if(CoralParser.Nested_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool_if(CoralParser.Cond_bool_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool_while(CoralParser.Cond_bool_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool_for(CoralParser.Cond_bool_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool(CoralParser.Cond_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool2(CoralParser.Cond_bool2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool3(CoralParser.Cond_bool3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool4(CoralParser.Cond_bool4Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool5(CoralParser.Cond_bool5Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool6(CoralParser.Cond_bool6Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool7(CoralParser.Cond_bool7Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool8(CoralParser.Cond_bool8Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool9(CoralParser.Cond_bool9Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool10(CoralParser.Cond_bool10Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool11(CoralParser.Cond_bool11Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool12}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool12(CoralParser.Cond_bool12Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool13}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool13(CoralParser.Cond_bool13Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool14(CoralParser.Cond_bool14Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#cond_bool15}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bool15(CoralParser.Cond_bool15Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#equal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_operator(CoralParser.Equal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#compare_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_operator(CoralParser.Compare_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_elseif}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elseif(CoralParser.If_elseifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(CoralParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fill_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill_else(CoralParser.Fill_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_else(CoralParser.Empty_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#parametros_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_definicion(CoralParser.Parametros_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#mas_parametros_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMas_parametros_definicion(CoralParser.Mas_parametros_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#tipo_retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_retorno(CoralParser.Tipo_retornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#at}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt(CoralParser.AtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#au}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAu(CoralParser.AuContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#av}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(CoralParser.AvContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#aw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAw(CoralParser.AwContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#ax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAx(CoralParser.AxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#ay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAy(CoralParser.AyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#mas_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMas_funciones(CoralParser.Mas_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralParser#mas_funciones_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMas_funciones_tipo(CoralParser.Mas_funciones_tipoContext ctx);
}