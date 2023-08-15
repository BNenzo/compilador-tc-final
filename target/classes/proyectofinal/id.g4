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

ASIGNACION: '=';
types: INT | FLOAT | CHAR;
PALABRA: (LETRA | DIGITO)*;

//ID: (LETRA | '_') (LETRA | DIGITO | '_')*; OTRO: .;

//s:
// ID { System.out.println("ID -> " + $ID.getText()); } s | OTRO { System.out.println("Otro -> " +
// $OTRO.getText()); } s |;

s: instrucciones;

instrucciones: instruccion instrucciones |;

instruccion: bloque | declaracion;

bloque: LLAVEA instrucciones LLAVEC;

// DECLARACION 
declaracion: types declarar;

declarar: declararAsignacion | declararSinAsignacion;

declararAsignacion:
	PALABRA ASIGNACION PALABRA COMA declarar
	| PALABRA ASIGNACION PALABRA PUNTOCOMA;

declararSinAsignacion:
	PALABRA COMA declarar
	| PALABRA PUNTOCOMA;
