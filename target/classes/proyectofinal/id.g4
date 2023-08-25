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
types: INT | FLOAT | CHAR | DOUBLE;
typesFunciones: types | VOID;
IFF: 'if';
IWHILE: 'while';
IFOR: 'for';
PALABRA: (LETRA | DIGITO)*;
COMP: ('<' | '<=' | '==' | '>' | '>=' | '!=');
OPERADORLOGICO: '&&' | '||';
ITERACIONSUMA: '++';
ITERACIONRESTA: '--';

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

// IF
iif: IFF PARENTESISA operacionesaritlogicas PARENTESISC bloque;
operacionesaritlogicas:
	PALABRA COMP PALABRA OPERADORLOGICO operacionesaritlogicas
	| PALABRA COMP PALABRA;

// WHILE

iwhile:
	IWHILE PARENTESISA operacionesaritlogicas PARENTESISC bloque;

// FOR
ifor:
	IFOR PARENTESISA declaracion operacionesaritlogicas PUNTOCOMA iteracion PARENTESISC bloque;

iteracion:
	PALABRA (ITERACIONRESTA | ITERACIONSUMA) COMA iteracion
	| PALABRA (ITERACIONRESTA | ITERACIONSUMA);

// DECLARACION 
declaracion: types declarar;

declarar: declararAsignacion | declararSinAsignacion;

declararAsignacion:
	PALABRA EQ PALABRA COMA declarar
	| PALABRA EQ PALABRA PUNTOCOMA;

declararSinAsignacion:
	PALABRA COMA declarar
	| PALABRA PUNTOCOMA;

//ASIGNACION

asignacion: PALABRA EQ PALABRA operaciones PUNTOCOMA;

operaciones: operadoresNumericos PALABRA operaciones |;

operadoresNumericos: SUMA | RESTA | MULTIPLICACION | DIVISION;

// DECLARACION DE FUNCIONES

declaracionFuncion_Nombre: PALABRA;

declaracionFuncion:
	typesFunciones declaracionFuncion_Nombre PARENTESISA parametrosDeclaracionConcatenados
		PARENTESISC PUNTOCOMA;

parametrosDeclaracionConcatenados: parametrosFuncion |;

parametrosFuncion:
	types PALABRA COMA parametrosFuncion
	| types COMA parametrosFuncion
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
nombreParametroFuncion: PALABRA;

parametrosDefinicionFuncion:
	types nombreParametroFuncion COMA parametrosDefinicionFuncion
	| types nombreParametroFuncion
	|;

defincionFuncion:
	typesFunciones PALABRA PARENTESISA parametrosDefinicionFuncion PARENTESISC LLAVEA instrucciones
		LLAVEC;

