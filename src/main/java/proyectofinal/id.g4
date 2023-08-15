grammar id;

@header {
  package proyectofinal;
}

fragment LETRA:[A-Za-z];
fragment DIGITO: [0-9];
WS: [ \t\r\n]+ -> skip;
LLAVEA: '{';
LLAVEC: '}';
PUNTOCOMA: ';';
COMA: ',';
INT: 'int';
FLOAT: 'float';
CHAR: 'char';
SUMA: '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION: '/';
EQ: '=';
types: INT | FLOAT | CHAR;
PALABRA: (LETRA | DIGITO)*;

//ID: (LETRA | '_') (LETRA | DIGITO | '_')*; OTRO: .;

//s:
// ID { System.out.println("ID -> " + $ID.getText()); } s | OTRO { System.out.println("Otro -> " +
// $OTRO.getText()); } s |;

s: instrucciones;

instrucciones: instruccion instrucciones |;

instruccion: bloque | declaracion | asignacion;

bloque: LLAVEA instrucciones LLAVEC;

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

