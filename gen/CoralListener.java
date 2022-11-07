// Generated from C:/Users/Juan/Documents/TraductorCoral/grammar\Coral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoralParser}.
 */
public interface CoralListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoralParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(CoralParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(CoralParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CoralParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CoralParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(CoralParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(CoralParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#id_asg}.
	 * @param ctx the parse tree
	 */
	void enterId_asg(CoralParser.Id_asgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#id_asg}.
	 * @param ctx the parse tree
	 */
	void exitId_asg(CoralParser.Id_asgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(CoralParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(CoralParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoralParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoralParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoralParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoralParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(CoralParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(CoralParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(CoralParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(CoralParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#seedrn}.
	 * @param ctx the parse tree
	 */
	void enterSeedrn(CoralParser.SeedrnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#seedrn}.
	 * @param ctx the parse tree
	 */
	void exitSeedrn(CoralParser.SeedrnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica_for}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica_for(CoralParser.Expresion_aritmetica_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica_for}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica_for(CoralParser.Expresion_aritmetica_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asgEntrada}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsgEntrada(CoralParser.AsgEntradaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asgEntrada}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsgEntrada(CoralParser.AsgEntradaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asgParentesis}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsgParentesis(CoralParser.AsgParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asgParentesis}
	 * labeled alternative in {@link CoralParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsgParentesis(CoralParser.AsgParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(CoralParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(CoralParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_size}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(CoralParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_size}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(CoralParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code std_variable}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterStd_variable(CoralParser.Std_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code std_variable}
	 * labeled alternative in {@link CoralParser#complemento_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitStd_variable(CoralParser.Std_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica(CoralParser.Expresion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica(CoralParser.Expresion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica2}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica2(CoralParser.Expresion_aritmetica2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica2}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica2(CoralParser.Expresion_aritmetica2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica3}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica3(CoralParser.Expresion_aritmetica3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica3}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica3(CoralParser.Expresion_aritmetica3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica4}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica4(CoralParser.Expresion_aritmetica4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica4}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica4(CoralParser.Expresion_aritmetica4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica5}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica5(CoralParser.Expresion_aritmetica5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica5}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica5(CoralParser.Expresion_aritmetica5Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(CoralParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(CoralParser.SignoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#operadores_mat1}.
	 * @param ctx the parse tree
	 */
	void enterOperadores_mat1(CoralParser.Operadores_mat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#operadores_mat1}.
	 * @param ctx the parse tree
	 */
	void exitOperadores_mat1(CoralParser.Operadores_mat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#operadores_mat2}.
	 * @param ctx the parse tree
	 */
	void enterOperadores_mat2(CoralParser.Operadores_mat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#operadores_mat2}.
	 * @param ctx the parse tree
	 */
	void exitOperadores_mat2(CoralParser.Operadores_mat2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterInteger(CoralParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitInteger(CoralParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterFloat(CoralParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitFloat(CoralParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_number}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterId_number(CoralParser.Id_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_number}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitId_number(CoralParser.Id_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqRoot}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterSqRoot(CoralParser.SqRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqRoot}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitSqRoot(CoralParser.SqRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absValue}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterAbsValue(CoralParser.AbsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absValue}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitAbsValue(CoralParser.AbsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rtp}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterRtp(CoralParser.RtpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rtp}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitRtp(CoralParser.RtpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ranum}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterRanum(CoralParser.RanumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ranum}
	 * labeled alternative in {@link CoralParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitRanum(CoralParser.RanumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica_param}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica_param(CoralParser.Expresion_aritmetica_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica_param}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica_param(CoralParser.Expresion_aritmetica_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#params_function_call}.
	 * @param ctx the parse tree
	 */
	void enterParams_function_call(CoralParser.Params_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#params_function_call}.
	 * @param ctx the parse tree
	 */
	void exitParams_function_call(CoralParser.Params_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#mas_params}.
	 * @param ctx the parse tree
	 */
	void enterMas_params(CoralParser.Mas_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#mas_params}.
	 * @param ctx the parse tree
	 */
	void exitMas_params(CoralParser.Mas_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_arit}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterExp_arit(CoralParser.Exp_aritContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_arit}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitExp_arit(CoralParser.Exp_aritContext ctx);
	/**
	 * Enter a parse tree produced by the {@code data_capture}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterData_capture(CoralParser.Data_captureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code data_capture}
	 * labeled alternative in {@link CoralParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitData_capture(CoralParser.Data_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#continua_programa}.
	 * @param ctx the parse tree
	 */
	void enterContinua_programa(CoralParser.Continua_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#continua_programa}.
	 * @param ctx the parse tree
	 */
	void exitContinua_programa(CoralParser.Continua_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#complemento_id}.
	 * @param ctx the parse tree
	 */
	void enterComplemento_id(CoralParser.Complemento_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#complemento_id}.
	 * @param ctx the parse tree
	 */
	void exitComplemento_id(CoralParser.Complemento_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 */
	void enterStringOutput(CoralParser.StringOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 */
	void exitStringOutput(CoralParser.StringOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 */
	void enterNumberOutput(CoralParser.NumberOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberOutput}
	 * labeled alternative in {@link CoralParser#complemento_salida}.
	 * @param ctx the parse tree
	 */
	void exitNumberOutput(CoralParser.NumberOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code precisionOutput}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 */
	void enterPrecisionOutput(CoralParser.PrecisionOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code precisionOutput}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 */
	void exitPrecisionOutput(CoralParser.PrecisionOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilonSalida}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 */
	void enterEpsilonSalida(CoralParser.EpsilonSalidaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilonSalida}
	 * labeled alternative in {@link CoralParser#precision_salida}.
	 * @param ctx the parse tree
	 */
	void exitEpsilonSalida(CoralParser.EpsilonSalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#expresion_aritmetica_precision}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica_precision(CoralParser.Expresion_aritmetica_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#expresion_aritmetica_precision}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica_precision(CoralParser.Expresion_aritmetica_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(CoralParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(CoralParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#es_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterEs_arreglo(CoralParser.Es_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#es_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitEs_arreglo(CoralParser.Es_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterTamano_arreglo(CoralParser.Tamano_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitTamano_arreglo(CoralParser.Tamano_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cuerpo_control}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_control(CoralParser.Cuerpo_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cuerpo_control}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_control(CoralParser.Cuerpo_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#nested_if}.
	 * @param ctx the parse tree
	 */
	void enterNested_if(CoralParser.Nested_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#nested_if}.
	 * @param ctx the parse tree
	 */
	void exitNested_if(CoralParser.Nested_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool_if}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool_if(CoralParser.Cond_bool_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool_if}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool_if(CoralParser.Cond_bool_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool_while}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool_while(CoralParser.Cond_bool_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool_while}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool_while(CoralParser.Cond_bool_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool_for}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool_for(CoralParser.Cond_bool_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool_for}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool_for(CoralParser.Cond_bool_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool(CoralParser.Cond_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool(CoralParser.Cond_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool2}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool2(CoralParser.Cond_bool2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool2}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool2(CoralParser.Cond_bool2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool3}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool3(CoralParser.Cond_bool3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool3}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool3(CoralParser.Cond_bool3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool4}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool4(CoralParser.Cond_bool4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool4}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool4(CoralParser.Cond_bool4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool5}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool5(CoralParser.Cond_bool5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool5}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool5(CoralParser.Cond_bool5Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool6}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool6(CoralParser.Cond_bool6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool6}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool6(CoralParser.Cond_bool6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool7}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool7(CoralParser.Cond_bool7Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool7}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool7(CoralParser.Cond_bool7Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool8}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool8(CoralParser.Cond_bool8Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool8}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool8(CoralParser.Cond_bool8Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool9}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool9(CoralParser.Cond_bool9Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool9}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool9(CoralParser.Cond_bool9Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool10}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool10(CoralParser.Cond_bool10Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool10}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool10(CoralParser.Cond_bool10Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool11}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool11(CoralParser.Cond_bool11Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool11}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool11(CoralParser.Cond_bool11Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool12}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool12(CoralParser.Cond_bool12Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool12}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool12(CoralParser.Cond_bool12Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool13}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool13(CoralParser.Cond_bool13Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool13}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool13(CoralParser.Cond_bool13Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool14}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool14(CoralParser.Cond_bool14Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool14}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool14(CoralParser.Cond_bool14Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#cond_bool15}.
	 * @param ctx the parse tree
	 */
	void enterCond_bool15(CoralParser.Cond_bool15Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#cond_bool15}.
	 * @param ctx the parse tree
	 */
	void exitCond_bool15(CoralParser.Cond_bool15Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#equal_operator}.
	 * @param ctx the parse tree
	 */
	void enterEqual_operator(CoralParser.Equal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#equal_operator}.
	 * @param ctx the parse tree
	 */
	void exitEqual_operator(CoralParser.Equal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompare_operator(CoralParser.Compare_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompare_operator(CoralParser.Compare_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_elseif}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterIf_elseif(CoralParser.If_elseifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_elseif}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitIf_elseif(CoralParser.If_elseifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(CoralParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link CoralParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(CoralParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fill_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 */
	void enterFill_else(CoralParser.Fill_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fill_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 */
	void exitFill_else(CoralParser.Fill_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_else(CoralParser.Empty_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_else}
	 * labeled alternative in {@link CoralParser#else}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_else(CoralParser.Empty_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsDef}
	 * labeled alternative in {@link CoralParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void enterParamsDef(CoralParser.ParamsDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsDef}
	 * labeled alternative in {@link CoralParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void exitParamsDef(CoralParser.ParamsDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noParams}
	 * labeled alternative in {@link CoralParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void enterNoParams(CoralParser.NoParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noParams}
	 * labeled alternative in {@link CoralParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void exitNoParams(CoralParser.NoParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreParametersDef}
	 * labeled alternative in {@link CoralParser#mas_parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void enterMoreParametersDef(CoralParser.MoreParametersDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreParametersDef}
	 * labeled alternative in {@link CoralParser#mas_parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void exitMoreParametersDef(CoralParser.MoreParametersDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noMoreParametersDef}
	 * labeled alternative in {@link CoralParser#mas_parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void enterNoMoreParametersDef(CoralParser.NoMoreParametersDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noMoreParametersDef}
	 * labeled alternative in {@link CoralParser#mas_parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void exitNoMoreParametersDef(CoralParser.NoMoreParametersDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#tipo_retorno}.
	 * @param ctx the parse tree
	 */
	void enterTipo_retorno(CoralParser.Tipo_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#tipo_retorno}.
	 * @param ctx the parse tree
	 */
	void exitTipo_retorno(CoralParser.Tipo_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(CoralParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(CoralParser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#au}.
	 * @param ctx the parse tree
	 */
	void enterAu(CoralParser.AuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#au}.
	 * @param ctx the parse tree
	 */
	void exitAu(CoralParser.AuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#av}.
	 * @param ctx the parse tree
	 */
	void enterAv(CoralParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#av}.
	 * @param ctx the parse tree
	 */
	void exitAv(CoralParser.AvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#aw}.
	 * @param ctx the parse tree
	 */
	void enterAw(CoralParser.AwContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#aw}.
	 * @param ctx the parse tree
	 */
	void exitAw(CoralParser.AwContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#ax}.
	 * @param ctx the parse tree
	 */
	void enterAx(CoralParser.AxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#ax}.
	 * @param ctx the parse tree
	 */
	void exitAx(CoralParser.AxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#ay}.
	 * @param ctx the parse tree
	 */
	void enterAy(CoralParser.AyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#ay}.
	 * @param ctx the parse tree
	 */
	void exitAy(CoralParser.AyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralParser#mas_funciones}.
	 * @param ctx the parse tree
	 */
	void enterMas_funciones(CoralParser.Mas_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralParser#mas_funciones}.
	 * @param ctx the parse tree
	 */
	void exitMas_funciones(CoralParser.Mas_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otraFuncion}
	 * labeled alternative in {@link CoralParser#mas_funciones_tipo}.
	 * @param ctx the parse tree
	 */
	void enterOtraFuncion(CoralParser.OtraFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otraFuncion}
	 * labeled alternative in {@link CoralParser#mas_funciones_tipo}.
	 * @param ctx the parse tree
	 */
	void exitOtraFuncion(CoralParser.OtraFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcionMain}
	 * labeled alternative in {@link CoralParser#mas_funciones_tipo}.
	 * @param ctx the parse tree
	 */
	void enterFuncionMain(CoralParser.FuncionMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcionMain}
	 * labeled alternative in {@link CoralParser#mas_funciones_tipo}.
	 * @param ctx the parse tree
	 */
	void exitFuncionMain(CoralParser.FuncionMainContext ctx);
}