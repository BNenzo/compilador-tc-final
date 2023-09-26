grammar id;

@header {
  package proyectofinal;
}

fragment LETRA:[A-Za-z];
fragment DIGITO: [0-9];
WS: [ \t\r\n]+ -> skip;
LLAVEA: '{';
LLAVEC: '}';
PARENTESISA: '(';
PARENTESISC: ')';
PUNTOCOMA: ';';
COMA: ',';
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';
SUMA: '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION: '/';
EQ: '=';
IFF: 'if';
IWHILE: 'while';
IFOR: 'for';
PALABRA: (LETRA | DIGITO)*;
FLOAT_VARIABLE: PALABRA '.' PALABRA;
COMP: ('<' | '<=' | '==' | '>' | '>=' | '!=');
OPERADORLOGICO: '&&' | '||';
ITERACIONSUMA: '++';
ITERACIONRESTA: '--';
COMILLA: '"';
PUNTO: '.';
OTRO: . -> skip;
//NOMBREVARIABLE: .* [a-zA-Z].*; ID: (LETRA | '_') (LETRA | DIGITO | '_')*; OTRO: .;

//s:
// NOMBREVARIABLE { System.out.println("NOMBREVARIABLE -> " + $NOMBREVARIABLE.getText()); } s |;

s: instrucciones;

instrucciones: instruccion instrucciones |;

instruccion:
	bloque
	| iif
	| operacionesaritlogicas
	| declaracion
	| asignacion
	| declaracionFuncion
	| llamadaFuncion
	| defincionFuncion
	| iwhile
	| ifor;

bloque: LLAVEA instrucciones LLAVEC;

types: INT | FLOAT | CHAR | DOUBLE;
typesFunciones: INT | FLOAT | CHAR | DOUBLE | VOID;
//variable_estricta: PALABRA; variable_de_uso: primitiva_char | primitiva_float | variable_programa;
// variable_programa: PALABRA; primitiva_char: COMILLA PALABRA COMILLA; primitiva_float: PALABRA
// PUNTO PALABRA;

permutacion_variables:
	PALABRA
	| COMILLA PALABRA COMILLA
	| FLOAT_VARIABLE;
permutacion_variable_validar_tipo: permutacion_variables;

iif: IFF PARENTESISA operacionesaritlogicas PARENTESISC bloque;

// OPERACIONES ARIT LOGICAS

operacionaritlogicas_variable:
	PALABRA
	| COMILLA PALABRA COMILLA
	| FLOAT_VARIABLE;

operacionaritlogicas_comparacion:
	operacionaritlogicas_variable COMP operacionaritlogicas_variable;

operacionesaritlogicas:
	operacionaritlogicas_comparacion OPERADORLOGICO operacionesaritlogicas
	| operacionaritlogicas_comparacion;

// WHILE

iwhile:
	IWHILE PARENTESISA operacionesaritlogicas PARENTESISC bloque;

// FOR
ifor:
	IFOR PARENTESISA declaracion operacionesaritlogicas PUNTOCOMA ifor_iteracion PARENTESISC bloque;

ifor_iteracion:
	PALABRA (ITERACIONRESTA | ITERACIONSUMA) COMA ifor_iteracion
	| PALABRA (ITERACIONRESTA | ITERACIONSUMA);

// DECLARACION 
declaracion: types declarar;

declarar: declararAsignacion | declararSinAsignacion;

declararAsignacion:
	PALABRA EQ permutacion_variable_validar_tipo COMA declarar
	| PALABRA EQ permutacion_variable_validar_tipo PUNTOCOMA;

declararSinAsignacion:
	PALABRA COMA declarar
	| PALABRA PUNTOCOMA;

//ASIGNACION

asignacion:
	PALABRA EQ permutacion_variable_validar_tipo operaciones PUNTOCOMA;

operaciones:
	operadoresNumericos permutacion_variable_validar_tipo operaciones
	|;

operadoresNumericos: SUMA | RESTA | MULTIPLICACION | DIVISION;

// DECLARACION DE FUNCIONES

declaracionFuncion_Nombre: PALABRA;

declaracionFuncion:
	typesFunciones declaracionFuncion_Nombre PARENTESISA parametrosDeclaracionConcatenados
		PARENTESISC PUNTOCOMA;

parametrosDeclaracionConcatenados:
	declaracionFuncion_parametros
	|;

declaracionFuncion_parametros:
	types PALABRA COMA declaracionFuncion_parametros
	| types COMA declaracionFuncion_parametros
	| types PALABRA
	| types;

// LLAMADA DE FUNCIONES
llamadaFuncion:
	PALABRA PARENTESISA parametrosLlamadaFuncion PARENTESISC PUNTOCOMA;

parametrosLlamadaFuncion: parametrosConcatenados |;

parametrosConcatenados:
	PALABRA COMA parametrosConcatenados
	| PALABRA;

// DEFINICION DE FUNCION
definicionFuncion_parametro_nombre: PALABRA;

definicionFuncion_Nombre: PALABRA;

defincionFuncion_parametros_global_rule:
	PARENTESISA definicionFuncion_parametros_internal_rule PARENTESISC;

definicionFuncion_parametros_internal_rule:
	types definicionFuncion_parametro_nombre COMA definicionFuncion_parametros_internal_rule
	| types definicionFuncion_parametro_nombre
	|;

defincionFuncion:
	typesFunciones definicionFuncion_Nombre defincionFuncion_parametros_global_rule bloque;

