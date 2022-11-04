grammar Coral;

inicio  : function | sentencias;
function:'Function' ID OPENING_PAR parametros_definicion CLOSING_PAR 'returns' tipo_retorno at mas_funciones;
sentencias: id_asg |
    seedrn |
    salida |
    variable_declaration|
    for|
    while |
    if;
// Reglas para sentencias
id_asg: ID asignacion continua_programa;
variable_declaration: tipo_dato es_arreglo ID continua_programa;
if: 'if' cond_bool_if cuerpo_control elseif continua_programa;
while: 'while' cond_bool_while sentencias continua_programa;
for: 'for' ID complemento_asignacion ASSIGN expresion_aritmetica_for SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica_for sentencias continua_programa;
salida: 'Put' complemento_salida continua_programa;
seedrn: 'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR continua_programa;

// Ajustes y alias para el for
expresion_aritmetica_for: expresion_aritmetica;
// Asignaciones
asignacion: complemento_asignacion ASSIGN entrada # asgEntrada|
            OPENING_PAR params_function_call CLOSING_PAR # asgParentesis;
complemento_asignacion: OPENING_BRA expresion_aritmetica CLOSING_BRA # array_access|
                        PERIOD 'size' # array_size|
                        /* epsilon */ # std_variable;


// Expresiones matematicas
expresion_aritmetica: signo expresion_aritmetica3 expresion_aritmetica2;
expresion_aritmetica2: operadores_mat1 expresion_aritmetica3 expresion_aritmetica2 | /*epsilon*/ ;
expresion_aritmetica3: expresion_aritmetica5 expresion_aritmetica4;
expresion_aritmetica4: operadores_mat2 expresion_aritmetica5 expresion_aritmetica4 | /* epsilon */;
expresion_aritmetica5: numero | OPENING_PAR expresion_aritmetica CLOSING_PAR;
// Operadores para las expresiones matematicas
signo: MINUS | PLUS | /* epsilon */;
operadores_mat1: PLUS | MINUS;
operadores_mat2: TIMES | DIV | MOD;
numero: INTEGER # integer|
    FLOAT  # float|
    ID complemento_id # id_number|
    'SquareRoot' OPENING_PAR expresion_aritmetica CLOSING_PAR # sqRoot|
    'AbsoluteValue' OPENING_PAR expresion_aritmetica CLOSING_PAR # absValue|
    'RaiseToPower' OPENING_PAR expresion_aritmetica COMMA expresion_aritmetica CLOSING_PAR # rtp|
    'RandomNumber' OPENING_PAR expresion_aritmetica COMMA expresion_aritmetica CLOSING_PAR # ranum;
// Parametros para llamar una funcion
params_function_call: expresion_aritmetica mas_params | /* epsilon */;
mas_params: COMMA expresion_aritmetica5 mas_params | /* epsilon */;
// Entrada de datos
entrada: expresion_aritmetica # exp_arit|
        'Get ' 'next ' 'input' # data_capture;

// Continuacion de instrucciones
continua_programa: id_asg |
                       seedrn |
                       salida |
                       variable_declaration|
                       for|
                       while |
                       if|
                       /* epsilon */;

/*
ID asignacion continua_programa|
    'SeedRandomRumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR continua_programa |
    'Put' complemento_salida |
    tipo_dato es_arreglo ID continua_programa|
    'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica sentencias continua_programa |
    'while' cond_bool sentencias continua_programa |
    'if' cond_bool cuerpo_control elseif continua_programa |*/
    /* epsilon */
// Continuacion de programa


complemento_id: complemento_asignacion |
                OPENING_PAR params_function_call CLOSING_PAR;
// Salida de datos
complemento_salida: STRING 'to' 'output' # stringOutput|
                    expresion_aritmetica 'to' 'output' precision_salida # numberOutput;

precision_salida: 'with' expresion_aritmetica_precision 'decimal' 'places' # precisionOutput
                    | /* epsilon */ # epsilonSalida;

expresion_aritmetica_precision: expresion_aritmetica;
// Declaracion tipo de dato
tipo_dato: 'float' | 'integer';

es_arreglo: 'array' OPENING_PAR tamano_arreglo CLOSING_PAR| /* epsilon */;
tamano_arreglo: QUESTION_MARK | INTEGER;

cuerpo_control: id_asg cond_bool6 |
    seedrn cond_bool6 |
    salida cond_bool6 |
    variable_declaration cond_bool6 |
    for cond_bool6 |
    while cond_bool6 |
    nested_if cond_bool6 |;

nested_if : 'if' cond_bool_if av ax;
cond_bool_if: cond_bool;
cond_bool_while: cond_bool;
cond_bool_for: cond_bool;

cond_bool: cond_bool3 cond_bool2;
cond_bool2: 'or' cond_bool3 cond_bool2 | /* epsilon */;
cond_bool3: cond_bool5 cond_bool4;
cond_bool4: 'and' cond_bool5 cond_bool2 | /* epsilon */;
cond_bool5: cond_bool8 cond_bool7;
cond_bool6: ID asignacion cond_bool6 |
    'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR cond_bool6 |
    'Put' complemento_salida cond_bool6 |
    tipo_dato es_arreglo ID cond_bool6 |
    'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica at cond_bool6 |
    'while' cond_bool_while at cond_bool6 |
    'if' cond_bool_if av ax cond_bool6 |;

cond_bool7: equal_operator cond_bool8 cond_bool7 | /* epsilon */;
cond_bool8: cond_bool10 cond_bool9;
cond_bool9: compare_operator cond_bool10 cond_bool9 | /* epsilon */;
cond_bool10: 'not' OPENING_PAR cond_bool CLOSING_PAR | cond_bool11;
cond_bool11: signo cond_bool13 cond_bool12;
cond_bool12: operadores_mat1 cond_bool13 cond_bool12 | /* epsilon */;
cond_bool13: cond_bool15 cond_bool14;
cond_bool14: operadores_mat2 cond_bool15 cond_bool14 | /* epsilon */;
cond_bool15: numero | OPENING_PAR cond_bool CLOSING_PAR;
equal_operator: EQUAL | NEQ;
compare_operator: GEQ | LEQ | LESS | GREATER;
elseif: 'elseif' cond_bool_if cuerpo_control elseif # if_elseif|
        else # if_else;
else: 'else' cuerpo_control # fill_else |
        /* epsilon */ # empty_else;
parametros_definicion: tipo_dato ID mas_parametros_definicion| /* epsilon */;
mas_parametros_definicion: COMMA tipo_dato ID mas_parametros_definicion| /* epsilon */;
tipo_retorno: tipo_dato es_arreglo ID | 'nothing';
/*
at: ID asignacion au |
    'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR au |
    'Put' complemento_salida au |
    tipo_dato es_arreglo ID au |
    'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica at au |
    'while' cond_bool_while at au|
    'if' cond_bool_if av ax au|;
*/
at: id_asg au |
    seedrn au |
    salida au |
    variable_declaration au |
    for au |
    while au |
    if au |;

au: ID asignacion au |
    'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR au |
    'Put' complemento_salida au |
     tipo_dato es_arreglo ID au |
     'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica at au |
     'while' cond_bool_while at au|
     'if' cond_bool_if av ax au|;

av: ID asignacion aw |
     'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR aw |
     'Put' complemento_salida aw |
     tipo_dato es_arreglo ID aw |
     'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica at aw |
     'while' cond_bool at aw|
     'if' cond_bool av ax aw|;

aw: ID asignacion aw |
     'SeedRandomNumbers' OPENING_PAR expresion_aritmetica CLOSING_PAR aw |
     'Put' complemento_salida aw |
     tipo_dato es_arreglo ID aw |
     'for' ID complemento_asignacion ASSIGN expresion_aritmetica SEMICOLON cond_bool SEMICOLON ID complemento_asignacion ASSIGN expresion_aritmetica at aw |
     'while' cond_bool_while at aw|
     'if' cond_bool_if av ax aw|
    /* epsilon */;

ax: 'elseif' cond_bool av ax | ay;
ay: 'else' av | /* epsilon */;

mas_funciones: 'Function' mas_funciones_tipo;
mas_funciones_tipo: ID OPENING_PAR parametros_definicion CLOSING_PAR 'returns' tipo_retorno at mas_funciones | 'Main' OPENING_PAR CLOSING_PAR 'returns' 'nothing' sentencias;

ESP : [ \t\r\n]+ -> skip ;

// TOKENS FOR THE LEXICAL ANALYZER
FLOAT: [0-9]+ '.' [0-9]+;
INTEGER : [0-9]+;
// MATH AND LOGICAL OPERATORS
ASSIGN : '=';
PERIOD: '.';
COMMA: ',';
SEMICOLON: ';';
CLOSING_BRA: ']';
OPENING_BRA: '[';
CLOSING_PAR: ')';
OPENING_PAR: '(';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
MOD: '%';
EQUAL: '==';
NEQ: '!=';
LESS: '<';
LEQ : '<=';
GREATER: '>';
GEQ: '>=';
QUESTION_MARK: '?';
COMMENT: '// ' ([a-zA-Z]+|[0-9]+)*;
ID: [a-zA-Z]+([a-zA-Z]+|[0-9]+)*;
STRING: '"' ([a-zA-Z]+|[0-9]+)*( ~["\n\r] | '\\"')* '"';